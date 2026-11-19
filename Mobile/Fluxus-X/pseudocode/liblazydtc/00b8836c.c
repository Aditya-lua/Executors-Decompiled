/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8836c
 */

int psa_hash_clone(int *param_1,int *param_2)

{
  int iVar1;
  
  if (*param_1 == 0) {
    iVar1 = -0x89;
  }
  else {
    iVar1 = -0x89;
    if ((*param_1 == 1) && (*param_2 == 0)) {
      *param_2 = 1;
      iVar1 = mbedtls_psa_hash_clone(param_1 + 2,param_2 + 2);
      if (iVar1 != 0) {
        if (*param_2 != 0) {
          if (*param_2 == 1) {
            mbedtls_psa_hash_abort(param_2 + 2);
          }
          *param_2 = 0;
        }
      }
    }
  }
  return iVar1;
}

