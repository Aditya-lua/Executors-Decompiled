/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05ad0
 */

undefined8 x509v3_add_len_value_uchar(char *param_1,void *param_2,size_t param_3,long *param_4)

{
  int iVar1;
  char *ptr;
  void *pvVar2;
  long lVar3;
  undefined8 *ptr_00;
  long lVar4;
  
  lVar4 = *param_4;
  if (param_1 == (char *)0x0) {
    ptr = (char *)0x0;
    if (param_2 != (void *)0x0) goto LAB_00b05950;
LAB_00b05978:
    pvVar2 = (void *)0x0;
LAB_00b059a0:
    ptr_00 = CRYPTO_malloc(0x18,"crypto/x509/v3_utl.c",0x39);
    if (ptr_00 != (undefined8 *)0x0) {
      if (lVar4 == 0) {
        lVar3 = OPENSSL_sk_new_null();
        *param_4 = lVar3;
        if (lVar3 == 0) goto LAB_00b059f0;
      }
      *ptr_00 = 0;
      ptr_00[1] = ptr;
      ptr_00[2] = pvVar2;
      iVar1 = OPENSSL_sk_push(*param_4,ptr_00);
      if (iVar1 != 0) {
        return 1;
      }
    }
  }
  else {
    ptr = CRYPTO_strdup(param_1,"crypto/x509/v3_utl.c",0x2f);
    if (ptr != (char *)0x0) {
      if (param_2 == (void *)0x0) goto LAB_00b05978;
LAB_00b05950:
      pvVar2 = memchr(param_2,0,param_3);
      if (pvVar2 == (void *)0x0) {
        pvVar2 = (void *)CRYPTO_strndup(param_2,param_3,"crypto/x509/v3_utl.c",0x35);
        if (pvVar2 == (void *)0x0) {
          ptr_00 = (undefined8 *)0x0;
          goto LAB_00b059f0;
        }
        goto LAB_00b059a0;
      }
    }
    ptr_00 = (undefined8 *)0x0;
    pvVar2 = (void *)0x0;
  }
LAB_00b059f0:
  ERR_new();
  ERR_set_debug("crypto/x509/v3_utl.c",0x44,"x509v3_add_len_value");
  ERR_set_error(0x22,0xc0100,0);
  if (lVar4 == 0) {
    OPENSSL_sk_free(*param_4);
    *param_4 = 0;
  }
  CRYPTO_free(ptr_00);
  CRYPTO_free(ptr);
  CRYPTO_free(pvVar2);
  return 0;
}

