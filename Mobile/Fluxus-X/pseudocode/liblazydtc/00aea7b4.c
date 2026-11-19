/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea7b4
 */

undefined8 OSSL_STORE_INFO_get1_PUBKEY(int *param_1)

{
  undefined8 uVar1;
  
  if (*param_1 == 3) {
    EVP_PKEY_up_ref(*(undefined8 *)(param_1 + 2));
    uVar1 = *(undefined8 *)(param_1 + 2);
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x2c7,"OSSL_STORE_INFO_get1_PUBKEY");
    ERR_set_error(0x2c,0x7a,0);
    uVar1 = 0;
  }
  return uVar1;
}

