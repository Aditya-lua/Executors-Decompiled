/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab7b28
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * EVP_get_pw_prompt(void)

{
  char *pcVar1;
  
  pcVar1 = (char *)0x0;
  if (DAT_00d221a0 != '\0') {
    pcVar1 = &DAT_00d221a0;
  }
  return pcVar1;
}

