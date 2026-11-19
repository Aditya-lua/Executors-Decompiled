/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af33e4
 */

undefined8 X509_aux_print(BIO *param_1,X509 *param_2,int param_3)

{
  char *param2;
  int iVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  ASN1_OBJECT *pAVar5;
  uchar *puVar6;
  char acStack_a0 [80];
  int local_48;
  int local_44;
  
  iVar1 = X509_trusted(param_2);
  if (iVar1 == 0) {
    return 1;
  }
  lVar3 = X509_get0_trust_objects(param_2);
  lVar4 = X509_get0_reject_objects(param_2);
  if (lVar3 == 0) {
    BIO_printf(param_1,"%*sNo Trusted Uses.\n",param_3,"");
  }
  else {
    BIO_printf(param_1,"%*sTrusted Uses:\n%*s",param_3,"",param_3 + 2,"");
    local_48 = 0;
    iVar1 = OPENSSL_sk_num(lVar3);
    if (0 < iVar1) {
      pAVar5 = (ASN1_OBJECT *)OPENSSL_sk_value(lVar3,local_48);
      OBJ_obj2txt(acStack_a0,0x50,pAVar5,0);
      BIO_puts(param_1,acStack_a0);
      iVar1 = local_48 + 1;
      local_48 = iVar1;
      iVar2 = OPENSSL_sk_num(lVar3);
      if (iVar1 < iVar2) {
        do {
          BIO_puts(param_1,", ");
          pAVar5 = (ASN1_OBJECT *)OPENSSL_sk_value(lVar3,local_48);
          OBJ_obj2txt(acStack_a0,0x50,pAVar5,0);
          BIO_puts(param_1,acStack_a0);
          iVar1 = local_48 + 1;
          local_48 = iVar1;
          iVar2 = OPENSSL_sk_num(lVar3);
        } while (iVar1 < iVar2);
      }
    }
    BIO_puts(param_1,"\n");
  }
  if (lVar4 == 0) {
    BIO_printf(param_1,"%*sNo Rejected Uses.\n",param_3,"");
  }
  else {
    BIO_printf(param_1,"%*sRejected Uses:\n%*s",param_3,"",param_3 + 2,"");
    local_48 = 0;
    iVar1 = OPENSSL_sk_num(lVar4);
    if (0 < iVar1) {
      pAVar5 = (ASN1_OBJECT *)OPENSSL_sk_value(lVar4,local_48);
      OBJ_obj2txt(acStack_a0,0x50,pAVar5,0);
      BIO_puts(param_1,acStack_a0);
      iVar1 = local_48 + 1;
      local_48 = iVar1;
      iVar2 = OPENSSL_sk_num(lVar4);
      if (iVar1 < iVar2) {
        do {
          BIO_puts(param_1,", ");
          pAVar5 = (ASN1_OBJECT *)OPENSSL_sk_value(lVar4,local_48);
          OBJ_obj2txt(acStack_a0,0x50,pAVar5,0);
          BIO_puts(param_1,acStack_a0);
          iVar1 = local_48 + 1;
          local_48 = iVar1;
          iVar2 = OPENSSL_sk_num(lVar4);
        } while (iVar1 < iVar2);
      }
    }
    BIO_puts(param_1,"\n");
  }
  puVar6 = X509_alias_get0(param_2,&local_48);
  if (puVar6 != (uchar *)0x0) {
    BIO_printf(param_1,"%*sAlias: %.*s\n",param_3,"",local_48,(char *)puVar6);
  }
  puVar6 = X509_keyid_get0(param_2,&local_44);
  if (puVar6 != (uchar *)0x0) {
    BIO_printf(param_1,"%*sKey Id: ",param_3,"");
    local_48 = 0;
    if (0 < local_44) {
      do {
        param2 = "";
        if (local_48 != 0) {
          param2 = ":";
        }
        BIO_printf(param_1,"%s%02X",param2,(uint)puVar6[local_48]);
        local_48 = local_48 + 1;
      } while (local_48 < local_44);
    }
    BIO_write(param_1,&DAT_002c4dae,1);
  }
  return 1;
}

