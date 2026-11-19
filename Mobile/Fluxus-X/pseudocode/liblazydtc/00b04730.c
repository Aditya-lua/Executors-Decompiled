/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04730
 */

undefined8 FUN_00b04730(byte *param_1,undefined8 param_2,int param_3)

{
  int lastpos;
  int iVar1;
  X509_NAME *name;
  X509_NAME_ENTRY *ne;
  ASN1_STRING *pAVar2;
  GENERAL_NAME *a;
  
  if (param_1 == (byte *)0x0) {
LAB_00b04838:
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x1b1,"copy_email");
    ERR_set_error(0x22,0x7d,0);
  }
  else {
    if ((*param_1 & 1) != 0) {
      return 1;
    }
    if (*(X509 **)(param_1 + 0x10) == (X509 *)0x0) {
      if (*(long *)(param_1 + 0x18) == 0) goto LAB_00b04838;
      name = (X509_NAME *)X509_REQ_get_subject_name();
    }
    else {
      name = X509_get_subject_name(*(X509 **)(param_1 + 0x10));
    }
    lastpos = -1;
    do {
      lastpos = X509_NAME_get_index_by_NID(name,0x30,lastpos);
      if (lastpos < 0) {
        return 1;
      }
      ne = X509_NAME_get_entry(name,lastpos);
      pAVar2 = X509_NAME_ENTRY_get_data(ne);
      pAVar2 = ASN1_STRING_dup(pAVar2);
      if (param_3 != 0) {
        X509_NAME_delete_entry(name,lastpos);
        X509_NAME_ENTRY_free(ne);
        lastpos = lastpos + -1;
      }
      if ((pAVar2 == (ASN1_STRING *)0x0) || (a = GENERAL_NAME_new(), a == (GENERAL_NAME *)0x0)) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_san.c",0x1c4,"copy_email");
        ERR_set_error(0x22,0xc0100,0);
        a = (GENERAL_NAME *)0x0;
        goto LAB_00b048a4;
      }
      (a->d).otherName = (OTHERNAME *)pAVar2;
      a->type = 1;
      iVar1 = OPENSSL_sk_push(param_2,a);
    } while (iVar1 != 0);
    ERR_new();
    ERR_set_debug("crypto/x509/v3_san.c",0x1cb,"copy_email");
    ERR_set_error(0x22,0xc0100,0);
    pAVar2 = (ASN1_STRING *)0x0;
LAB_00b048a4:
    GENERAL_NAME_free(a);
    ASN1_IA5STRING_free(pAVar2);
  }
  return 0;
}

