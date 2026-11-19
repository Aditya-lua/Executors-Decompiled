/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b164dc
 */

ASN1_STRING * X509_digest_sig(long param_1,long *param_2,undefined4 *param_3)

{
  int iVar1;
  char *pcVar2;
  EVP_MD *pEVar3;
  RSA_PSS_PARAMS *a;
  ASN1_STRING *str;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 auStack_88 [4];
  undefined1 auStack_84 [4];
  long local_80;
  int local_78;
  int local_74;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined4 local_60;
  
  if (param_2 != (long *)0x0) {
    *param_2 = 0;
  }
  if (param_3 != (undefined4 *)0x0) {
    *param_3 = 0;
  }
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x1e7,"X509_digest_sig");
    uVar4 = 0xc0102;
    goto LAB_00b166a0;
  }
  iVar1 = X509_get_signature_nid(param_1);
  iVar1 = OBJ_find_sigid_algs(iVar1,&local_74,&local_78);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x1ec,"X509_digest_sig");
    uVar4 = 0x90;
    goto LAB_00b166a0;
  }
  if (local_74 == 0) {
    if (local_78 < 0x43f) {
      if (local_78 == 0) {
        ERR_new();
        uVar4 = 0x219;
        goto LAB_00b16694;
      }
      if (local_78 == 0x390) {
        a = (RSA_PSS_PARAMS *)ossl_rsa_pss_decode(param_1 + 0x88);
        local_80 = 0;
        if (((a == (RSA_PSS_PARAMS *)0x0) ||
            (iVar1 = ossl_rsa_pss_get_param_unverified(a,&local_80,&local_70,auStack_84,auStack_88),
            iVar1 == 0)) || (local_80 == 0)) {
          RSA_PSS_PARAMS_free(a);
          ERR_new();
          ERR_set_debug("crypto/x509/x_all.c",0x1fc,"X509_digest_sig");
          ERR_set_error(0xb,0x6f,0);
          return (ASN1_STRING *)0x0;
        }
        RSA_PSS_PARAMS_free(a);
        uVar5 = *(undefined8 *)(param_1 + 0x170);
        uVar4 = EVP_MD_get0_name(local_80);
        pEVar3 = (EVP_MD *)EVP_MD_fetch(uVar5,uVar4,*(undefined8 *)(param_1 + 0x178));
        if (pEVar3 == (EVP_MD *)0x0) {
          return (ASN1_STRING *)0x0;
        }
        goto LAB_00b16724;
      }
LAB_00b166b8:
      pcVar2 = "SHA256";
    }
    else if (local_78 == 0x43f) {
      pcVar2 = "SHA512";
    }
    else {
      if (local_78 != 0x440) goto LAB_00b166b8;
      pcVar2 = "SHAKE256";
    }
    pEVar3 = (EVP_MD *)
             EVP_MD_fetch(*(undefined8 *)(param_1 + 0x170),pcVar2,*(undefined8 *)(param_1 + 0x178));
    if (pEVar3 == (EVP_MD *)0x0) {
      return (ASN1_STRING *)0x0;
    }
    if (param_3 != (undefined4 *)0x0) {
      *param_3 = 1;
    }
  }
  else {
    uVar4 = *(undefined8 *)(param_1 + 0x170);
    pcVar2 = OBJ_nid2sn(local_74);
    pEVar3 = (EVP_MD *)EVP_MD_fetch(uVar4,pcVar2,*(undefined8 *)(param_1 + 0x178));
    if (pEVar3 == (EVP_MD *)0x0) {
      pcVar2 = OBJ_nid2sn(local_74);
      pEVar3 = EVP_get_digestbyname(pcVar2);
      if (pEVar3 == (EVP_MD *)0x0) {
        ERR_new();
        uVar4 = 0x21f;
LAB_00b16694:
        ERR_set_debug("crypto/x509/x_all.c",uVar4,"X509_digest_sig");
        uVar4 = 0x6f;
LAB_00b166a0:
        ERR_set_error(0xb,uVar4,0);
        return (ASN1_STRING *)0x0;
      }
    }
  }
LAB_00b16724:
  iVar1 = EVP_MD_is_a(pEVar3,&DAT_002d142e);
  if ((iVar1 == 0) || ((*(uint *)(param_1 + 0xe8) & 0x100100) != 0x100)) {
    uVar4 = X509_it();
    iVar1 = ossl_asn1_item_digest_ex
                      (uVar4,pEVar3,param_1,&local_70,&local_80,*(undefined8 *)(param_1 + 0x170),
                       *(undefined8 *)(param_1 + 0x178));
    if (iVar1 == 0) goto LAB_00b167c8;
    str = ASN1_OCTET_STRING_new();
  }
  else {
    local_80 = CONCAT44(local_80._4_4_,0x14);
    local_60 = *(undefined4 *)(param_1 + 0x148);
    uStack_68 = *(undefined8 *)(param_1 + 0x140);
    local_70 = *(undefined8 *)(param_1 + 0x138);
    str = ASN1_OCTET_STRING_new();
  }
  if (str != (ASN1_STRING *)0x0) {
    iVar1 = ASN1_OCTET_STRING_set(str,&local_70,(int)local_80);
    if (iVar1 != 0) {
      if (param_2 == (long *)0x0) {
        EVP_MD_free(pEVar3);
        return str;
      }
      *param_2 = (long)pEVar3;
      return str;
    }
    ASN1_OCTET_STRING_free(str);
  }
LAB_00b167c8:
  EVP_MD_free(pEVar3);
  return (ASN1_STRING *)0x0;
}

