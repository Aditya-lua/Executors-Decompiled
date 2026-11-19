/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87d0c
 */

int psa_hash_setup(int *param_1,uint param_2)

{
  int iVar1;
  int iVar2;
  
  iVar1 = *param_1;
  if (iVar1 == 0) {
    if ((param_2 & 0x7f000000) != 0x2000000) {
      return -0x87;
    }
    memset(param_1 + 2,0,0xe0);
    iVar2 = mbedtls_psa_hash_setup(param_1 + 2,param_2);
    if (iVar2 == 0) {
      *param_1 = 1;
      return 0;
    }
    iVar1 = *param_1;
  }
  else {
    iVar2 = -0x89;
  }
  if (iVar1 != 0) {
    if (iVar1 == 1) {
      mbedtls_psa_hash_abort(param_1 + 2);
    }
    *param_1 = 0;
  }
  return iVar2;
}

