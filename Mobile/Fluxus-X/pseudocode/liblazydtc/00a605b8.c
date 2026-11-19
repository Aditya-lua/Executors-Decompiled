/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a605b8
 */

undefined8 EVP_PKCS82PKEY_ex(PKCS8_PRIV_KEY_INFO *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  long local_58;
  uchar *local_50;
  uchar *local_48;
  undefined8 local_38;
  
  local_38 = 0;
  local_50 = (uchar *)0x0;
  local_48 = (uchar *)0x0;
  iVar1 = i2d_PKCS8_PRIV_KEY_INFO(param_1,&local_50);
  uVar4 = 0;
  if ((0 < iVar1) && (local_50 != (uchar *)0x0)) {
    local_48 = local_50;
    local_58 = (long)iVar1;
    lVar3 = OSSL_DECODER_CTX_new_for_pkey
                      (&local_38,&DAT_002b7291,"PrivateKeyInfo",0,0x87,param_2,param_3);
    if ((lVar3 == 0) || (iVar2 = OSSL_DECODER_from_data(lVar3,&local_48,&local_58), iVar2 == 0)) {
      local_38 = evp_pkcs82pkey_legacy(param_1,param_2,param_3);
    }
    CRYPTO_clear_free(local_50,(long)iVar1,"crypto/evp/evp_pkey.c",0x5b);
    OSSL_DECODER_CTX_free(lVar3);
    uVar4 = local_38;
  }
  return uVar4;
}

