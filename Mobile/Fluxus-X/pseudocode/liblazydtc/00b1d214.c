/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1d214
 */

long FUN_00b1d214(long *param_1,undefined8 *param_2,long param_3,long param_4,char *param_5,
                 int param_6)

{
  int iVar1;
  ASN1_VALUE **val;
  ASN1_VALUE *pAVar2;
  char *pcVar3;
  long lVar4;
  uchar *local_58;
  ASN1_VALUE *local_48;
  
  local_48 = (ASN1_VALUE *)0x0;
  local_58 = (uchar *)*param_2;
  if (((param_4 == 0) && (param_5 == (char *)0x0)) && (val = (ASN1_VALUE **)0x0, param_6 == 0)) {
LAB_00b1d2d8:
    pAVar2 = ASN1_item_d2i(val,&local_58,param_3,(ASN1_ITEM *)&DAT_00c82640);
    if (pAVar2 != (ASN1_VALUE *)0x0) {
      lVar4 = X509_PUBKEY_get0();
      if (lVar4 != 0) {
        iVar1 = EVP_PKEY_up_ref();
        if (iVar1 != 0) {
          ASN1_item_free(pAVar2,(ASN1_ITEM *)&DAT_00c82640);
          local_48 = (ASN1_VALUE *)0x0;
          *param_2 = local_58;
          if (param_1 != (long *)0x0) {
            EVP_PKEY_free((EVP_PKEY *)*param_1);
            *param_1 = lVar4;
          }
          goto LAB_00b1d3c4;
        }
        ERR_new();
        ERR_set_debug("crypto/x509/x_pubkey.c",0x1d6,"X509_PUBKEY_get");
        ERR_set_error(0xb,0xc0103,0);
      }
      ASN1_item_free(pAVar2,(ASN1_ITEM *)&DAT_00c82640);
      lVar4 = 0;
      local_48 = (ASN1_VALUE *)0x0;
      goto LAB_00b1d3c4;
    }
  }
  else {
    pAVar2 = (ASN1_VALUE *)CRYPTO_zalloc(0x30,"crypto/x509/x_pubkey.c",0x1f5);
    local_48 = pAVar2;
    if (pAVar2 == (ASN1_VALUE *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x_pubkey.c",0x1f7,"d2i_PUBKEY_int");
      ERR_set_error(0xb,0xc0100,0);
      return 0;
    }
    *(long *)(pAVar2 + 0x18) = param_4;
    CRYPTO_free(*(void **)(pAVar2 + 0x20));
    *(undefined8 *)(pAVar2 + 0x20) = 0;
    if (param_5 == (char *)0x0) {
LAB_00b1d2bc:
      val = &local_48;
      pAVar2[0x28] = (ASN1_VALUE)((byte)pAVar2[0x28] & 0xfe | param_6 != 0);
      goto LAB_00b1d2d8;
    }
    pcVar3 = CRYPTO_strdup(param_5,"crypto/x509/x_pubkey.c",0x37);
    *(char **)(pAVar2 + 0x20) = pcVar3;
    if (pcVar3 != (char *)0x0) goto LAB_00b1d2bc;
  }
  lVar4 = 0;
LAB_00b1d3c4:
  ASN1_item_free(local_48,(ASN1_ITEM *)&DAT_00c82640);
  return lVar4;
}

