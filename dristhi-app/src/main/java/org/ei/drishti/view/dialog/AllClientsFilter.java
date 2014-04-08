package org.ei.drishti.view.dialog;

import org.ei.drishti.Context;
import org.ei.drishti.R;
import org.ei.drishti.view.contract.SmartRegisterClients;

public class AllClientsFilter implements DialogOption {
    @Override
    public String name() {
        return Context.getInstance().getStringResource(R.string.filter_by_all_label);
    }

    @Override
    public SmartRegisterClients apply(SmartRegisterClients allClients) {
        return allClients;
    }
}