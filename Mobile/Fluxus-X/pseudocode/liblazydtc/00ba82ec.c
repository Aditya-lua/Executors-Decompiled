/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba82ec
 */

int mbedtls_rsa_rsassa_pkcs1_v15_sign
              (long param_1,undefined8 param_2,undefined8 param_3,int param_4,int param_5,
              long param_6,void *param_7)

{
  int iVar1;
  void *__ptr;
  void *pvVar2;
  size_t __size;
  
  if (((param_5 == 0 && param_4 == 0) || (param_6 != 0)) && (*(int *)(param_1 + 0xe0) == 0)) {
    iVar1 = FUN_00ba8448(param_4,param_5,param_6,*(undefined8 *)(param_1 + 8),param_7);
    if (iVar1 == 0) {
      __size = *(size_t *)(param_1 + 8);
      __ptr = calloc(1,__size);
      if (__ptr == (void *)0x0) {
        iVar1 = -0x10;
      }
      else {
        pvVar2 = calloc(1,__size);
        if (pvVar2 == (void *)0x0) {
          free(__ptr);
          iVar1 = -0x10;
        }
        else {
          iVar1 = mbedtls_rsa_private(param_1,param_2,param_3,param_7,__ptr);
          if (iVar1 == 0) {
            iVar1 = mbedtls_rsa_public(param_1,__ptr,pvVar2);
            if (iVar1 == 0) {
              iVar1 = mbedtls_ct_memcmp(pvVar2,param_7,*(undefined8 *)(param_1 + 8));
              if (iVar1 == 0) {
                memcpy(param_7,__ptr,*(size_t *)(param_1 + 8));
                iVar1 = 0;
              }
              else {
                iVar1 = -0x4300;
              }
            }
          }
          mbedtls_zeroize_and_free(__ptr,*(undefined8 *)(param_1 + 8));
          mbedtls_zeroize_and_free(pvVar2,*(undefined8 *)(param_1 + 8));
          if (iVar1 != 0) {
            memset(param_7,0x21,*(size_t *)(param_1 + 8));
          }
        }
      }
    }
  }
  else {
    iVar1 = -0x4080;
  }
  return iVar1;
}

