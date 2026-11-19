/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7f70
 */

undefined8 ossl_asn1_enc_save(long *param_1,void *param_2,int param_3,long param_4)

{
  undefined8 *puVar1;
  void *__dest;
  long lVar2;
  
  if ((((param_1 != (long *)0x0) && (*param_1 != 0)) &&
      (lVar2 = *(long *)(param_4 + 0x20), lVar2 != 0)) &&
     (((*(byte *)(lVar2 + 8) >> 1 & 1) != 0 &&
      (puVar1 = (undefined8 *)(*param_1 + (long)*(int *)(lVar2 + 0x20)), puVar1 != (undefined8 *)0x0
      )))) {
    CRYPTO_free((void *)*puVar1);
    if (param_3 < 1) {
      return 0;
    }
    __dest = CRYPTO_malloc(param_3,"crypto/asn1/tasn_utl.c",0xab);
    *puVar1 = __dest;
    if (__dest == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_utl.c",0xac,"ossl_asn1_enc_save");
      ERR_set_error(0xd,0xc0100,0);
      return 0;
    }
    memcpy(__dest,param_2,(long)param_3);
    puVar1[1] = (long)param_3;
    *(undefined4 *)(puVar1 + 2) = 0;
  }
  return 1;
}

