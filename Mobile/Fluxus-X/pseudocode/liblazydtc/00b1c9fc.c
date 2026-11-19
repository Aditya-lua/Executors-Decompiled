/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1c9fc
 */

void ossl_d2i_X509_PUBKEY_INTERNAL(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long local_28;
  
  local_28 = CRYPTO_zalloc(0x30,"crypto/x509/x_pubkey.c",0x47);
  if (local_28 != 0) {
    ASN1_item_d2i_ex(&local_28,param_1,param_2,&DAT_00c826c0,param_3,0);
  }
  return;
}

