/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b29d70
 */

undefined8 FUN_00b29d70(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = OSSL_PARAM_locate_const(param_2,"cts_mode");
  if (lVar2 == 0) {
LAB_00b29db4:
    uVar3 = ossl_cipher_generic_set_ctx_params(param_1,param_2);
    return uVar3;
  }
  if (*(int *)(lVar2 + 8) == 4) {
    iVar1 = ossl_cipher_cbc_cts_mode_name2id(*(undefined8 *)(lVar2 + 0x10));
    if (-1 < iVar1) {
      *(int *)(param_1 + 0x68) = iVar1;
      goto LAB_00b29db4;
    }
  }
  ERR_new();
  ERR_set_debug("providers/implementations/ciphers/cipher_camellia_cts.inc",0x55,
                "camellia_cbc_cts_set_ctx_params");
  ERR_set_error(0x39,0x68,0);
  return 0;
}

