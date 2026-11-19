/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc5cc
 */

undefined8 *
PKCS8_set0_pbe_ex(undefined8 param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6)

{
  undefined8 uVar1;
  ASN1_STRING *a;
  undefined8 *puVar2;
  
  uVar1 = PKCS8_PRIV_KEY_INFO_it();
  a = (ASN1_STRING *)
      PKCS12_item_i2d_encrypt_ex(param_4,uVar1,param_1,param_2,param_3,1,param_5,param_6);
  if (a == (ASN1_STRING *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_p8e.c",0x50,"PKCS8_set0_pbe_ex");
    ERR_set_error(0x23,0x67,0);
  }
  else {
    puVar2 = (undefined8 *)CRYPTO_zalloc(0x10,"crypto/pkcs12/p12_p8e.c",0x54);
    if (puVar2 != (undefined8 *)0x0) {
      *puVar2 = param_4;
      puVar2[1] = a;
      return puVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_p8e.c",0x57,"PKCS8_set0_pbe_ex");
    ERR_set_error(0x23,0xc0100,0);
    ASN1_OCTET_STRING_free(a);
  }
  return (undefined8 *)0x0;
}

