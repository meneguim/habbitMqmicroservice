package com.br.ms.communication.buytrip.gateway.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraChaveJson {

    private String chave;
    private CompraJson compraJson;

    public void setChave(String chave) {
        this.chave = chave;
    }

    public void setCompraJson(CompraJson compraJson) {
        this.compraJson = compraJson;
    }

}
