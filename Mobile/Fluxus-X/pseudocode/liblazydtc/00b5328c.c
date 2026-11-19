/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5328c
 */

undefined8 FUN_00b5328c(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  size_t __n;
  long local_28;
  
  if (param_2 != 0) {
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002d7e7d);
    if (lVar2 != 0) {
      iVar1 = OSSL_PARAM_get_size_t(lVar2,&local_28);
      if ((iVar1 == 0) || (0x1f < local_28 - 1U)) {
        ERR_new();
        ERR_set_debug("providers/implementations/macs/blake2_mac_impl.c",0xcb,
                      "blake2_mac_set_ctx_params");
        uVar3 = 0x71;
        goto LAB_00b53428;
      }
      ossl_blake2s_param_set_digest_length(param_1 + 0x80);
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
    if (lVar2 != 0) {
      __n = *(size_t *)(lVar2 + 0x18);
      if (0x1f < __n - 1) {
        ERR_new();
        ERR_set_debug("providers/implementations/macs/blake2_mac_impl.c",0x5e,"blake2_setkey");
        uVar3 = 0x69;
        goto LAB_00b53428;
      }
      memcpy((void *)(param_1 + 0xa0),*(void **)(lVar2 + 0x10),__n);
      if (__n < 0x20) {
        memset((void *)(param_1 + __n + 0xa0),0,0x20 - __n);
      }
      ossl_blake2s_param_set_key_length(param_1 + 0x80,__n & 0xffffffff);
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"custom");
    if (lVar2 != 0) {
      if (8 < *(ulong *)(lVar2 + 0x18)) {
        ERR_new();
        ERR_set_debug("providers/implementations/macs/blake2_mac_impl.c",0xdc,
                      "blake2_mac_set_ctx_params");
        uVar3 = 0x6f;
        goto LAB_00b53428;
      }
      ossl_blake2s_param_set_personal(param_1 + 0x80,*(undefined8 *)(lVar2 + 0x10));
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002a7b6c);
    if (lVar2 != 0) {
      if (8 < *(ulong *)(lVar2 + 0x18)) {
        ERR_new();
        ERR_set_debug("providers/implementations/macs/blake2_mac_impl.c",0xe8,
                      "blake2_mac_set_ctx_params");
        uVar3 = 0x70;
LAB_00b53428:
        ERR_set_error(0x39,uVar3,0);
        return 0;
      }
      ossl_blake2s_param_set_salt(param_1 + 0x80,*(undefined8 *)(lVar2 + 0x10));
    }
  }
  return 1;
}

