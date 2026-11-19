/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeeea0
 */

char * UI_method_get_prompt_constructor(UI *param_1,char *param_2,char *param_3)

{
  char *pcVar1;
  
  pcVar1 = (char *)0x0;
  if (param_1 != (UI *)0x0) {
    pcVar1 = *(char **)(param_1 + 0x40);
  }
  return pcVar1;
}

