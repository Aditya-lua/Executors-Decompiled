/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3f5b8
 */

PKCS8_PRIV_KEY_INFO *
FUN_00b3f5b8(undefined8 param_1,int param_2,void *param_3,int param_4,code *param_5)

{
  int iVar1;
  PKCS8_PRIV_KEY_INFO *priv;
  ASN1_OBJECT *aobj;
  uchar *local_48;
  
  local_48 = (uchar *)0x0;
  priv = PKCS8_PRIV_KEY_INFO_new();
  if ((priv != (PKCS8_PRIV_KEY_INFO *)0x0) && (iVar1 = (*param_5)(param_1,&local_48), 0 < iVar1)) {
    aobj = OBJ_nid2obj(param_2);
    iVar1 = PKCS8_pkey_set0(priv,aobj,0,param_4,param_3,local_48,iVar1);
    if (iVar1 != 0) {
      return priv;
    }
  }
  ERR_new();
  ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",0x5e,"key_to_p8info");
  ERR_set_error(0x39,0xc0100,0);
  PKCS8_PRIV_KEY_INFO_free(priv);
  CRYPTO_free(local_48);
  return (PKCS8_PRIV_KEY_INFO *)0x0;
}

