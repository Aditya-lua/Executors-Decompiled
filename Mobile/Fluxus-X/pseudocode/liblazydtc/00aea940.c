/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea940
 */

undefined8 OSSL_STORE_INFO_get1_CRL(int *param_1)

{
  undefined8 uVar1;
  
  if (*param_1 == 6) {
    X509_CRL_up_ref(*(undefined8 *)(param_1 + 2));
    uVar1 = *(undefined8 *)(param_1 + 2);
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x2fa,"OSSL_STORE_INFO_get1_CRL");
    ERR_set_error(0x2c,0x65,0);
    uVar1 = 0;
  }
  return uVar1;
}

