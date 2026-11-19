/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa429c
 */

byte OSSL_PROVIDER_available(undefined8 param_1,undefined8 param_2)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  byte *pbVar4;
  
  lVar3 = ossl_lib_ctx_get_data(param_1,1,&DAT_00c6d4c8);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
  }
  else {
    iVar2 = FUN_00aa4178();
    if (((iVar2 != 0) &&
        (pbVar4 = (byte *)ossl_provider_find(param_1,param_2,0), pbVar4 != (byte *)0x0)) &&
       (iVar2 = CRYPTO_THREAD_read_lock(*(undefined8 *)(pbVar4 + 8)), iVar2 != 0)) {
      bVar1 = *pbVar4;
      CRYPTO_THREAD_unlock(*(undefined8 *)(pbVar4 + 8));
      ossl_provider_free(pbVar4);
      return bVar1 >> 1 & 1;
    }
  }
  return 0;
}

