/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abac38
 */

undefined8 FUN_00abac38(undefined8 param_1,char *param_2,long *param_3,long param_4)

{
  int iVar1;
  undefined4 uVar2;
  int iVar3;
  PKCS12_SAFEBAG *bag;
  long lVar4;
  PKCS8_PRIV_KEY_INFO *pPVar5;
  EVP_PKEY *pEVar6;
  X509 *x;
  undefined8 uVar7;
  ASN1_STRING *in;
  int *piVar8;
  uchar *local_68;
  
  iVar1 = OPENSSL_sk_num();
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      bag = (PKCS12_SAFEBAG *)OPENSSL_sk_value(param_1,iVar1);
      lVar4 = PKCS12_SAFEBAG_get0_attr(bag,0x9c);
      if (lVar4 == 0) {
        in = (ASN1_STRING *)0x0;
      }
      else {
        in = *(ASN1_STRING **)(lVar4 + 8);
      }
      lVar4 = PKCS12_SAFEBAG_get0_attr(bag,0x9d);
      if (lVar4 == 0) {
        piVar8 = (int *)0x0;
      }
      else {
        piVar8 = *(int **)(lVar4 + 8);
      }
      uVar2 = PKCS12_SAFEBAG_get_nid(bag);
      switch(uVar2) {
      case 0x96:
        if ((param_3 != (long *)0x0) && (*param_3 == 0)) {
          pPVar5 = (PKCS8_PRIV_KEY_INFO *)PKCS12_SAFEBAG_get0_p8inf(bag);
          pEVar6 = EVP_PKCS82PKEY(pPVar5);
          *param_3 = (long)pEVar6;
          if (pEVar6 == (EVP_PKEY *)0x0) {
            return 0;
          }
        }
        break;
      case 0x97:
        if ((param_3 != (long *)0x0) && (*param_3 == 0)) {
          pPVar5 = PKCS12_decrypt_skey(bag,param_2,-1);
          if (pPVar5 == (PKCS8_PRIV_KEY_INFO *)0x0) {
            return 0;
          }
          pEVar6 = EVP_PKCS82PKEY(pPVar5);
          *param_3 = (long)pEVar6;
          PKCS8_PRIV_KEY_INFO_free(pPVar5);
          if (*param_3 == 0) {
            return 0;
          }
        }
        break;
      case 0x98:
        if ((param_4 != 0) && (iVar3 = PKCS12_SAFEBAG_get_bag_nid(bag), iVar3 == 0x9e)) {
          x = (X509 *)PKCS12_SAFEBAG_get1_cert(bag);
          if (x == (X509 *)0x0) {
            return 0;
          }
          if ((piVar8 != (int *)0x0) &&
             (iVar3 = X509_keyid_set1(x,*(uchar **)(piVar8 + 2),*piVar8), iVar3 == 0)) {
LAB_00abae34:
            X509_free(x);
            return 0;
          }
          if ((in != (ASN1_STRING *)0x0) && (iVar3 = ASN1_STRING_to_UTF8(&local_68,in), -1 < iVar3))
          {
            iVar3 = X509_alias_set1(x,local_68,iVar3);
            CRYPTO_free(local_68);
            if (iVar3 == 0) goto LAB_00abae34;
          }
          iVar3 = OPENSSL_sk_push(param_4,x);
          if (iVar3 == 0) goto LAB_00abae34;
        }
        break;
      case 0x9b:
        uVar7 = PKCS12_SAFEBAG_get0_safes(bag);
        uVar7 = FUN_00abac38(uVar7,param_2,param_3,param_4);
        if ((int)uVar7 == 0) {
          return uVar7;
        }
      }
      iVar1 = iVar1 + 1;
      iVar3 = OPENSSL_sk_num(param_1);
    } while (iVar1 < iVar3);
  }
  return 1;
}

