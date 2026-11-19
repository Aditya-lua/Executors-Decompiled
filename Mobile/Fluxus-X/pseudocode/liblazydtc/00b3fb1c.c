/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3fb1c
 */

X509_PUBKEY * FUN_00b3fb1c(undefined8 param_1,int param_2,void *param_3,int param_4,code *param_5)

{
  int iVar1;
  X509_PUBKEY *pub;
  ASN1_OBJECT *aobj;
  uchar *local_48;
  
  local_48 = (uchar *)0x0;
  pub = X509_PUBKEY_new();
  if ((pub != (X509_PUBKEY *)0x0) && (iVar1 = (*param_5)(param_1,&local_48), 0 < iVar1)) {
    aobj = OBJ_nid2obj(param_2);
    iVar1 = X509_PUBKEY_set0_param(pub,aobj,param_4,param_3,local_48,iVar1);
    if (iVar1 != 0) {
      return pub;
    }
  }
  ERR_new();
  ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",0x9d,"key_to_pubkey");
  ERR_set_error(0x39,0xc0100,0);
  X509_PUBKEY_free(pub);
  CRYPTO_free(local_48);
  return (X509_PUBKEY *)0x0;
}

