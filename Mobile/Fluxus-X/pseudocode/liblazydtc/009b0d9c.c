/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0d9c
 */

char * SSL_COMP_get_name(COMP_METHOD *comp)

{
  char *pcVar1;
  
  if (comp == (COMP_METHOD *)0x0) {
    return (char *)0x0;
  }
  pcVar1 = (char *)COMP_get_name();
  return pcVar1;
}

