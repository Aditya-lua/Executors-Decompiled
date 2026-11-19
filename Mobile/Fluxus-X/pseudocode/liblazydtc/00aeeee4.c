/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeeee4
 */

char * UI_get0_action_string(UI_STRING *uis)

{
  char *pcVar1;
  
  pcVar1 = (char *)0x0;
  if (*(int *)uis == 3) {
    pcVar1 = *(char **)(uis + 0x28);
  }
  return pcVar1;
}

