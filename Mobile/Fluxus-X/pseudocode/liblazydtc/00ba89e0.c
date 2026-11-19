/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba89e0
 */

int mbedtls_rsa_rsassa_pkcs1_v15_verify
              (long param_1,int param_2,int param_3,long param_4,undefined8 param_5)

{
  int iVar1;
  int iVar2;
  void *pvVar3;
  void *pvVar4;
  size_t __size;
  
  if ((param_3 == 0 && param_2 == 0) || (param_4 != 0)) {
    __size = *(size_t *)(param_1 + 8);
    pvVar3 = calloc(1,__size);
    if (pvVar3 != (void *)0x0) {
      pvVar4 = calloc(1,__size);
      if (pvVar4 != (void *)0x0) {
        iVar1 = FUN_00ba8448(param_2,param_3,param_4,__size,pvVar4);
        if ((iVar1 == 0) && (iVar1 = mbedtls_rsa_public(param_1,param_5,pvVar3), iVar1 == 0)) {
          iVar2 = mbedtls_ct_memcmp(pvVar3,pvVar4,__size);
          iVar1 = 0;
          if (iVar2 != 0) {
            iVar1 = -0x4380;
          }
        }
        mbedtls_zeroize_and_free(pvVar3,__size);
        mbedtls_zeroize_and_free(pvVar4,__size);
        return iVar1;
      }
      mbedtls_zeroize_and_free(pvVar3,__size);
    }
    iVar1 = -0x10;
  }
  else {
    iVar1 = -0x4080;
  }
  return iVar1;
}

