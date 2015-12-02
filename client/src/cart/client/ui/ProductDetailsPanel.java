package cart.client.ui;

import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import cart.client.control.ClientCtrl;

public class ProductDetailsPanel extends javax.swing.JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private javax.swing.JLabel productIDHeader;
	private javax.swing.JLabel productNameHeader;
	private javax.swing.JLabel priceHeader;
	private javax.swing.JLabel quantityHeader;
	private javax.swing.JPanel headerPanel;
	private javax.swing.JButton selectProduct;
	private javax.swing.JLabel productIdLabel;
	private javax.swing.JLabel productName;
	private javax.swing.JLabel price;
	private javax.swing.JPanel productDetailsPanel;
	private javax.swing.JSpinner quantity;
	ClientCtrl controlBoject;

	public ProductDetailsPanel(ClientCtrl controlBoject) {
		this.controlBoject = controlBoject;
		initHeaderPanel();

	}

	private void initHeaderPanel() {

		headerPanel = new javax.swing.JPanel();
		productIDHeader = new javax.swing.JLabel();
		productNameHeader = new javax.swing.JLabel();
		priceHeader = new javax.swing.JLabel();
		quantityHeader = new javax.swing.JLabel();

		productIDHeader.setText("ProductId");

		productNameHeader.setText("ProductName");

		priceHeader.setText("Price");

		quantityHeader.setText("Quantity");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(headerPanel);
		headerPanel.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addGap(15, 15, 15).addComponent(productIDHeader)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
						.addComponent(productNameHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(priceHeader)
						.addGap(73, 73, 73).addComponent(quantityHeader).addGap(0, 0, Short.MAX_VALUE)));
		jPanel4Layout
				.setVerticalGroup(
						jPanel4Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel4Layout.createSequentialGroup().addGap(5, 5, 5)
												.addGroup(
														jPanel4Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(productIDHeader)
																.addComponent(productNameHeader)
																.addComponent(priceHeader).addComponent(quantityHeader))
										.addGap(0, 5, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout.createSequentialGroup()
										.addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(0, 0, 0)
						.addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
	}

	/**
	 * Creates new form ProductDetailsPanel
	 */
	public ProductDetailsPanel(int productId, String productName, int price, int availableQuantity,
			ClientCtrl ctrlObject) {
		this.controlBoject = ctrlObject;
		initComponents();
		this.productIdLabel.setText(productId + "");
		this.productName.setText(productName);
		this.price.setText(price + "");
		SpinnerModel model = new SpinnerNumberModel(1, // initial value
				0, // min
				availableQuantity, // max
				1); // step
		quantity.setModel(model);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		selectProduct = new javax.swing.JButton();
		selectProduct.setText("Add");
		selectProduct.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addToCart(evt);
			}
		});
		productDetailsPanel = new javax.swing.JPanel();
		productIdLabel = new javax.swing.JLabel();
		productName = new javax.swing.JLabel();
		price = new javax.swing.JLabel();
		quantity = new javax.swing.JSpinner();

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(productDetailsPanel);
		productDetailsPanel.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addGap(15, 15, 15).addComponent(productIdLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
						.addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(price)
						.addGap(50, 50, 50)
						.addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(selectProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

						.addGap(0, 0, 0)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(0, 0, 0)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(productIdLabel).addComponent(productName).addComponent(price)))
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(0, 0, 0)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(selectProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(productDetailsPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(0, 0, 0)
						.addComponent(productDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
	}

	private void addToCart(java.awt.event.ActionEvent evt) {
		controlBoject.addToCart(Integer.valueOf(productIdLabel.getText()));
	}

}
