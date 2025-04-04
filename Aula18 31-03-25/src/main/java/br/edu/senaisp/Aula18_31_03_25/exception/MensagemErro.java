package br.edu.senaisp.Aula18_31_03_25.exception;

import java.time.LocalDateTime;

public class MensagemErro {

	private LocalDateTime dtOcorrencia;
	private String mensagem;
	private String detalhes;

	public LocalDateTime getDtOcorrencia() {
		return dtOcorrencia;
	}

	public MensagemErro(LocalDateTime dtOcorrencia, String mensagem, String detalhes) {
		super();
		this.dtOcorrencia = dtOcorrencia;
		this.mensagem = mensagem;
		this.detalhes = detalhes;
	}

	public void setDtOcorrencia(LocalDateTime dtOcorrencia) {
		this.dtOcorrencia = dtOcorrencia;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

}
