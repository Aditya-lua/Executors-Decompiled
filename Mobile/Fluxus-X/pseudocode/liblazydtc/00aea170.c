/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea170
 */

undefined4 OSSL_STORE_close(long *param_1)

{
  undefined4 uVar1;
  
  if (param_1 == (long *)0x0) {
    uVar1 = 1;
    goto LAB_00aea1f4;
  }
  if (param_1[1] == 0) {
LAB_00aea1a4:
    uVar1 = (**(code **)(*param_1 + 0x50))(param_1[2]);
  }
  else {
    uVar1 = (**(code **)(*param_1 + 0xc0))(param_1[2]);
    if (param_1[1] == 0) goto LAB_00aea1a4;
  }
  OPENSSL_sk_pop_free(param_1[8],OSSL_STORE_INFO_free);
  OSSL_STORE_LOADER_free(param_1[1]);
  CRYPTO_free((void *)param_1[6]);
  ossl_pw_clear_passphrase_data(param_1 + 9);
LAB_00aea1f4:
  CRYPTO_free(param_1);
  return uVar1;
}

