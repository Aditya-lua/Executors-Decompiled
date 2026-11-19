/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3f48c
 */

undefined8
FUN_00b3f48c(undefined8 param_1,undefined8 param_2,ASN1_OBJECT *param_3,int param_4,
            undefined8 param_5,undefined8 *param_6)

{
  int iVar1;
  PKCS8_PRIV_KEY_INFO *a;
  undefined8 uVar2;
  undefined1 auStack_440 [1024];
  ulong local_38;
  
  a = (PKCS8_PRIV_KEY_INFO *)FUN_00b3f5b8();
  if (a == (PKCS8_PRIV_KEY_INFO *)0x0) {
    if (param_4 == 0x10) {
      ASN1_STRING_free((ASN1_STRING *)param_3);
      return 0;
    }
    if (param_4 == 6) {
      ASN1_OBJECT_free(param_3);
      return 0;
    }
    return 0;
  }
  local_38 = 0;
  uVar2 = ossl_prov_ctx_get0_libctx(*param_6);
  if (param_6[2] != 0) {
    iVar1 = ossl_pw_get_passphrase(auStack_440,0x400,&local_38,0,1,param_6 + 3);
    if (iVar1 != 0) {
      uVar2 = PKCS8_encrypt_ex(0xffffffff,param_6[2],auStack_440,local_38 & 0xffffffff,0,0,0,a,uVar2
                               ,0);
      OPENSSL_cleanse(auStack_440,local_38);
      goto LAB_00b3f584;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",0x74,"p8info_to_encp8")
    ;
    ERR_set_error(0x39,0x9f,0);
  }
  uVar2 = 0;
LAB_00b3f584:
  PKCS8_PRIV_KEY_INFO_free(a);
  return uVar2;
}

