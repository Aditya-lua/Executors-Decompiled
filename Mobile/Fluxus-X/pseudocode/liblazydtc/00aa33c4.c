/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa33c4
 */

undefined8 FUN_00aa33c4(long *param_1,char *param_2,char *param_3)

{
  int iVar1;
  undefined8 *ptr;
  long lVar2;
  char *pcVar3;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x10,"crypto/provider_core.c",0x2fc);
  if (ptr == (undefined8 *)0x0) goto LAB_00aa349c;
  if (*param_1 == 0) {
    lVar2 = OPENSSL_sk_new_null();
    *param_1 = lVar2;
    if (lVar2 != 0) goto LAB_00aa3410;
  }
  else {
LAB_00aa3410:
    pcVar3 = CRYPTO_strdup(param_2,"crypto/provider_core.c",0x2ff);
    *ptr = pcVar3;
    if (pcVar3 != (char *)0x0) {
      pcVar3 = CRYPTO_strdup(param_3,"crypto/provider_core.c",0x300);
      ptr[1] = pcVar3;
      if ((pcVar3 != (char *)0x0) && (iVar1 = OPENSSL_sk_push(*param_1,ptr), 0 < iVar1)) {
        return 1;
      }
    }
  }
  CRYPTO_free((void *)*ptr);
  CRYPTO_free((void *)ptr[1]);
  CRYPTO_free(ptr);
LAB_00aa349c:
  ERR_new();
  ERR_set_debug("crypto/provider_core.c",0x309,"infopair_add");
  ERR_set_error(0xf,0xc0100,0);
  return 0;
}

