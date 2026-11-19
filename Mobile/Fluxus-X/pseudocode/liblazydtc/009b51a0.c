/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b51a0
 */

undefined8 SSL_key_update(long param_1,uint param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
    if (param_2 < 2) {
      iVar1 = SSL_is_init_finished();
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0x8f9,"SSL_key_update");
        uVar2 = 0x79;
      }
      else {
        iVar1 = RECORD_LAYER_write_pending(param_1 + 0xc58);
        if (iVar1 == 0) {
          ossl_statem_set_in_init(param_1,1);
          *(uint *)(param_1 + 0xba4) = param_2;
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0x8fe,"SSL_key_update");
        uVar2 = 0x7f;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x8f4,"SSL_key_update");
      uVar2 = 0x78;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x8ee,"SSL_key_update");
    uVar2 = 0x10a;
  }
  ERR_set_error(0x14,uVar2,0);
  return 0;
}

