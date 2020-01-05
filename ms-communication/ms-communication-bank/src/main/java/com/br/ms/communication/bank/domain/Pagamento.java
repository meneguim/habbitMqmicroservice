package com.br.ms.communication.bank.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="pagamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Cartao cartao;

	private BigDecimal valorCompra;
}
