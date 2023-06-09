package br.com.fernandes.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.fernandes.models.dto.TarefaDTO;

@Component
public class TarefaDTOValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return TarefaDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "titulo", "field.required", "O campo 'titulo' é obrigatório");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descricao", "field.required", "O campo 'descricao' é obrigatório");
	}

}