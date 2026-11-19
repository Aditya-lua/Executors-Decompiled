/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b25a1c
 */

undefined8 FUN_00b25a1c(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long local_30;
  undefined4 local_24;
  
  local_24 = 0;
  if (param_2 != 0) {
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002c5a75);
    if (lVar2 != 0) {
      if ((*(byte *)(param_1 + 4) & 1) != 0) {
        return 1;
      }
      if ((*(int *)(lVar2 + 8) != 5) ||
         (iVar1 = (**(code **)(*(long *)(param_1 + 0x68) + 0x18))
                            (param_1,*(undefined8 *)(lVar2 + 0x10),*(undefined8 *)(lVar2 + 0x18)),
         iVar1 == 0)) {
        ERR_new();
        uVar3 = 0xd8;
        goto LAB_00b25b3c;
      }
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"speed");
    if (lVar2 != 0) {
      iVar1 = OSSL_PARAM_get_uint(lVar2,&local_24);
      if (iVar1 == 0) {
        ERR_new();
        uVar3 = 0xdf;
        goto LAB_00b25b3c;
      }
      (**(code **)(*(long *)(param_1 + 0x68) + 0x10))(param_1,local_24);
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"keylen");
    if (lVar2 != 0) {
      iVar1 = OSSL_PARAM_get_size_t(lVar2,&local_30);
      if (iVar1 == 0) {
        ERR_new();
        uVar3 = 0xe9;
LAB_00b25b3c:
        ERR_set_debug("providers/implementations/ciphers/cipher_aes_siv.c",uVar3,
                      "aes_siv_set_ctx_params");
        ERR_set_error(0x39,0x67,0);
        return 0;
      }
      if (local_30 != *(long *)(param_1 + 8)) {
        return 0;
      }
    }
  }
  return 1;
}

