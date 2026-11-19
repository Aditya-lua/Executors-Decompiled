/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeee40
 */

int UI_method_set_prompt_constructor(UI_METHOD *method,prompt_constructor *prompt_constructor)

{
  if (method == (UI_METHOD *)0x0) {
    return -1;
  }
  *(prompt_constructor **)(method + 0x40) = prompt_constructor;
  return 0;
}

