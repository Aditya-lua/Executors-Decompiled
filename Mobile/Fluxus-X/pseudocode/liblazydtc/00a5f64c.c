/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f64c
 */

char * EVP_MD_get0_name(int *param_1)

{
  char *pcVar1;
  
  if (param_1 == (int *)0x0) {
    return (char *)0x0;
  }
  if (*(char **)(param_1 + 0x18) == (char *)0x0) {
    pcVar1 = OBJ_nid2sn(*param_1);
    return pcVar1;
  }
  return *(char **)(param_1 + 0x18);
}

