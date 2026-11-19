/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f5a4
 */

char * EVP_CIPHER_get0_description(int *param_1)

{
  char *pcVar1;
  
  if (*(char **)(param_1 + 0x1c) == (char *)0x0) {
    pcVar1 = OBJ_nid2ln(*param_1);
    return pcVar1;
  }
  return *(char **)(param_1 + 0x1c);
}

