/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeef00
 */

char * UI_get0_test_string(UI_STRING *uis)

{
  char *pcVar1;
  
  pcVar1 = (char *)0x0;
  if (*(int *)uis == 2) {
    pcVar1 = *(char **)(uis + 0x30);
  }
  return pcVar1;
}

