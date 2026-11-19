/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4630
 */

undefined8 ossl_provider_default_props_update(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  int iVar5;
  
  lVar2 = ossl_lib_ctx_get_data(param_1,1,&DAT_00c6d4c8);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
    uVar3 = 0;
  }
  else {
    uVar3 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar2 + 0x20));
    if ((int)uVar3 != 0) {
      iVar1 = OPENSSL_sk_num(*(undefined8 *)(lVar2 + 0x10));
      if (0 < iVar1) {
        iVar5 = 0;
        do {
          lVar4 = OPENSSL_sk_value(*(undefined8 *)(lVar2 + 0x10),iVar5);
          (**(code **)(lVar4 + 0x18))(param_2,*(undefined8 *)(lVar4 + 0x20));
          iVar5 = iVar5 + 1;
        } while (iVar1 != iVar5);
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar2 + 0x20));
      uVar3 = 1;
    }
  }
  return uVar3;
}

