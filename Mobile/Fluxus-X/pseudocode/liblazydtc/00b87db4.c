/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87db4
 */

int psa_hash_update(int *param_1,void *param_2,size_t param_3)

{
  int iVar1;
  int iVar2;
  void *__dest;
  
  iVar1 = *param_1;
  if (iVar1 == 0) {
    __dest = (void *)0x0;
    iVar2 = -0x89;
  }
  else {
    if (param_3 == 0) {
      return 0;
    }
    __dest = calloc(param_3,1);
    if (__dest == (void *)0x0) {
      iVar2 = -0x8d;
    }
    else {
      memcpy(__dest,param_2,param_3);
      if (iVar1 == 1) {
        iVar2 = mbedtls_psa_hash_update(param_1 + 2,__dest,param_3);
        if (iVar2 == 0) goto LAB_00b87e58;
        iVar1 = *param_1;
      }
      else {
        iVar2 = -0x89;
      }
    }
    if (iVar1 != 0) {
      if (iVar1 == 1) {
        mbedtls_psa_hash_abort(param_1 + 2);
      }
      *param_1 = 0;
    }
  }
LAB_00b87e58:
  free(__dest);
  return iVar2;
}

