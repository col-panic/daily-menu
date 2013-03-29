package at.medevit.menus.parts;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import at.medevit.menus.MenusPackage.Literals;
import at.medevit.menus.Person;

public class PersonDetailPart {
	private DataBindingContext m_bindingContext;

	protected IObservableValue element = new WritableValue(null, Person.class);
	private Text textFirstname;
	private Text textLastname;
	private DateTime dateTime;

	/**
	 * @wbp.parser.entryPoint
	 */
	@Inject
	public PersonDetailPart(Composite parent) {
		Composite ret = new Composite(parent, SWT.None);
		ret.setLayout(new GridLayout(2, false));

		textFirstname = new Text(ret, SWT.BORDER);
		textFirstname.setMessage("firstname");
		textFirstname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		textLastname = new Text(ret, SWT.BORDER);
		textLastname.setMessage("lastname");
		textLastname.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				1, 1));

		dateTime = new DateTime(ret, SWT.BORDER | SWT.DROP_DOWN | SWT.LONG);
		new Label(ret, SWT.NONE);
		m_bindingContext = initDataBindings();
	}

	@Focus
	public void onFocus() {
		textFirstname.setFocus();	
	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Person person) {
		element.setValue(person);
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextFirstnameObserveWidget = WidgetProperties
				.text(SWT.Modify).observe(textFirstname);
		IObservableValue elementAtmedevitmenusMenusPackageLiteralsPERSON__FIRSTNAMEObserveDetailValue = EMFObservables
				.observeDetailValue(Realm.getDefault(), element,
						Literals.PERSON__FIRSTNAME);
		bindingContext
				.bindValue(
						observeTextTextFirstnameObserveWidget,
						elementAtmedevitmenusMenusPackageLiteralsPERSON__FIRSTNAMEObserveDetailValue,
						null, null);
		//
		IObservableValue observeTextTextLastnameObserveWidget = WidgetProperties
				.text(SWT.Modify).observe(textLastname);
		IObservableValue elementAtmedevitmenusMenusPackageLiteralsPERSON__LASTNAMEObserveDetailValue = EMFObservables
				.observeDetailValue(Realm.getDefault(), element,
						Literals.PERSON__LASTNAME);
		bindingContext
				.bindValue(
						observeTextTextLastnameObserveWidget,
						elementAtmedevitmenusMenusPackageLiteralsPERSON__LASTNAMEObserveDetailValue,
						null, null);
		//
		IObservableValue observeSelectionDateTimeObserveWidget = WidgetProperties
				.selection().observe(dateTime);
		IObservableValue elementAtmedevitmenusMenusPackageLiteralsPERSON__DATE_OF_BIRTHObserveDetailValue = EMFObservables
				.observeDetailValue(Realm.getDefault(), element,
						Literals.PERSON__DATE_OF_BIRTH);
		bindingContext
				.bindValue(
						observeSelectionDateTimeObserveWidget,
						elementAtmedevitmenusMenusPackageLiteralsPERSON__DATE_OF_BIRTHObserveDetailValue,
						null, null);
		//
		return bindingContext;
	}
}