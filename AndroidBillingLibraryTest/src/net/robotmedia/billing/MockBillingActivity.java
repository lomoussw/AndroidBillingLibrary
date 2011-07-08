/*   Copyright 2011 Robot Media SL (http://www.robotmedia.net)
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package net.robotmedia.billing;

public class MockBillingActivity extends AbstractBillingActivity {

	@Override
	public void onBillingChecked(boolean supported) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPurchaseCancelled(String itemId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPurchaseExecuted(String itemId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPurchaseRefunded(String itemId) {
		// TODO Auto-generated method stub

	}

	@Override
	public byte[] getObfuscationSalt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPublicKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
