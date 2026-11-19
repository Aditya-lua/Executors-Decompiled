/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af2bb0
 */

int X509_print_ex(BIO *bp,X509 *x,ulong nmflag,ulong cflag)

{
  byte *pbVar1;
  ulong param3;
  char *pcVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  ASN1_INTEGER *a;
  X509_ALGOR *alg;
  X509_NAME *pXVar7;
  undefined8 uVar8;
  X509_PUBKEY *pub;
  EVP_PKEY *pkey;
  stack_st_X509_EXTENSION *exts;
  uchar param2;
  uchar param3_00;
  uint uVar9;
  int iVar10;
  ASN1_STRING *local_70;
  ASN1_OBJECT *local_68;
  
  bVar3 = (nmflag & 0xf0000) != 0x40000;
  param2 = '\n';
  if (bVar3) {
    param2 = ' ';
  }
  iVar5 = 0xc;
  if (bVar3) {
    iVar5 = 0;
  }
  uVar9 = (uint)cflag;
  if (((cflag & 1) != 0) ||
     ((iVar4 = BIO_write(bp,"Certificate:\n",0xd), 0 < iVar4 &&
      (iVar4 = BIO_write(bp,"    Data:\n",10), 0 < iVar4)))) {
    if ((uVar9 >> 1 & 1) == 0) {
      uVar6 = X509_get_version(x);
      if (uVar6 < 3) {
        iVar4 = BIO_printf(bp,"%8sVersion: %ld (0x%lx)\n","",uVar6 + 1,uVar6);
      }
      else {
        iVar4 = BIO_printf(bp,"%8sVersion: Unknown (%ld)\n","",uVar6);
      }
      if (iVar4 < 1) goto LAB_00af316c;
    }
    if ((uVar9 >> 2 & 1) == 0) {
      a = (ASN1_INTEGER *)X509_get0_serialNumber(x);
      iVar4 = BIO_write(bp,"        Serial Number:",0x16);
      if (0 < iVar4) {
        if (a->length < 9) {
          ERR_set_mark();
          uVar6 = ASN1_INTEGER_get(a);
          ERR_pop_to_mark();
          iVar4 = a->type;
          if (uVar6 != 0xffffffffffffffff) {
            pcVar2 = "-";
            if (iVar4 != 0x102) {
              pcVar2 = "";
            }
            param3 = -uVar6;
            if (iVar4 != 0x102) {
              param3 = uVar6;
            }
            iVar4 = BIO_printf(bp," %s%lu (%s0x%lx)\n",pcVar2,param3,pcVar2,param3);
            if (0 < iVar4) goto LAB_00af2ddc;
            goto LAB_00af316c;
          }
        }
        else {
          iVar4 = a->type;
        }
        pcVar2 = " (Negative)";
        if (iVar4 != 0x102) {
          pcVar2 = "";
        }
        iVar4 = BIO_printf(bp,"\n%12s%s","",pcVar2);
        if (0 < iVar4) {
          uVar6 = 0;
          do {
            if ((long)a->length <= (long)uVar6) goto LAB_00af2ddc;
            pbVar1 = a->data + uVar6;
            uVar6 = uVar6 + 1;
            param3_00 = '\n';
            if (uVar6 != (uint)a->length) {
              param3_00 = ':';
            }
            iVar4 = BIO_printf(bp,"%02x%c",(uint)*pbVar1,param3_00);
          } while (0 < iVar4);
        }
      }
    }
    else {
LAB_00af2ddc:
      if ((uVar9 >> 3 & 1) == 0) {
        alg = (X509_ALGOR *)X509_get0_tbs_sigalg(x);
        iVar4 = BIO_puts(bp,"    ");
        if ((iVar4 < 1) || (iVar4 = X509_signature_print(bp,alg,(ASN1_STRING *)0x0), iVar4 < 1))
        goto LAB_00af316c;
      }
      if ((uVar9 >> 4 & 1) == 0) {
        iVar4 = BIO_printf(bp,"        Issuer:%c",param2);
        if (0 < iVar4) {
          pXVar7 = X509_get_issuer_name(x);
          iVar4 = X509_NAME_print_ex(bp,pXVar7,iVar5,nmflag);
          iVar10 = 0;
          if (iVar4 < (int)(uint)(nmflag == 0)) goto LAB_00af3170;
          iVar4 = BIO_write(bp,&DAT_002c4dae,1);
          if (0 < iVar4) goto LAB_00af2e88;
        }
      }
      else {
LAB_00af2e88:
        if ((uVar9 >> 5 & 1) == 0) {
          iVar4 = BIO_write(bp,"        Validity\n",0x11);
          if ((0 < iVar4) && (iVar4 = BIO_write(bp,"            Not Before: ",0x18), 0 < iVar4)) {
            uVar8 = X509_get0_notBefore(x);
            iVar4 = ossl_asn1_time_print_ex(bp,uVar8,0);
            if ((iVar4 != 0) && (iVar4 = BIO_write(bp,"\n            Not After : ",0x19), 0 < iVar4)
               ) {
              uVar8 = X509_get0_notAfter(x);
              iVar4 = ossl_asn1_time_print_ex(bp,uVar8,0);
              if ((iVar4 != 0) && (iVar4 = BIO_write(bp,&DAT_002c4dae,1), 0 < iVar4))
              goto LAB_00af2f38;
            }
          }
        }
        else {
LAB_00af2f38:
          if ((uVar9 >> 6 & 1) == 0) {
            iVar4 = BIO_printf(bp,"        Subject:%c",param2);
            if (0 < iVar4) {
              pXVar7 = X509_get_subject_name(x);
              iVar5 = X509_NAME_print_ex(bp,pXVar7,iVar5,nmflag);
              iVar10 = 0;
              if (iVar5 < (int)(uint)(nmflag == 0)) goto LAB_00af3170;
              iVar5 = BIO_write(bp,&DAT_002c4dae,1);
              if (0 < iVar5) goto LAB_00af2f9c;
            }
          }
          else {
LAB_00af2f9c:
            if ((uVar9 >> 7 & 1) == 0) {
              pub = (X509_PUBKEY *)X509_get_X509_PUBKEY(x);
              X509_PUBKEY_get0_param(&local_68,(uchar **)0x0,(int *)0x0,(X509_ALGOR **)0x0,pub);
              iVar5 = BIO_write(bp,"        Subject Public Key Info:\n",0x21);
              if ((((iVar5 < 1) ||
                   (iVar5 = BIO_printf(bp,"%12sPublic Key Algorithm: ",""), iVar5 < 1)) ||
                  (iVar5 = i2a_ASN1_OBJECT(bp,local_68), iVar5 < 1)) ||
                 (iVar5 = BIO_puts(bp,"\n"), iVar5 < 1)) goto LAB_00af316c;
              pkey = (EVP_PKEY *)X509_get0_pubkey(x);
              if (pkey == (EVP_PKEY *)0x0) {
                BIO_printf(bp,"%12sUnable to load Public Key\n","");
                ERR_print_errors(bp);
              }
              else {
                EVP_PKEY_print_public(bp,pkey,0x10,(ASN1_PCTX *)0x0);
              }
            }
            if (((uVar9 >> 0xc & 1) != 0) ||
               (((X509_get0_uids(x,&local_68,&local_70), local_68 == (ASN1_OBJECT *)0x0 ||
                 ((iVar5 = BIO_printf(bp,"%8sIssuer Unique ID: ",""), 0 < iVar5 &&
                  (iVar5 = X509_signature_dump(bp,(ASN1_STRING *)local_68,0xc), iVar5 != 0)))) &&
                ((local_70 == (ASN1_STRING *)0x0 ||
                 ((iVar5 = BIO_printf(bp,"%8sSubject Unique ID: ",""), 0 < iVar5 &&
                  (iVar5 = X509_signature_dump(bp,local_70,0xc), iVar5 != 0)))))))) {
              if ((uVar9 >> 8 & 1) == 0) {
                exts = (stack_st_X509_EXTENSION *)X509_get0_extensions(x);
                iVar5 = X509V3_extensions_print(bp,"X509v3 extensions",exts,cflag,8);
                if (iVar5 == 0) goto LAB_00af316c;
              }
              if ((uVar9 >> 9 & 1) == 0) {
                X509_get0_signature(&local_70,&local_68,x);
                iVar5 = X509_signature_print(bp,(X509_ALGOR *)local_68,local_70);
                if (iVar5 < 1) goto LAB_00af316c;
              }
              if ((uVar9 >> 10 & 1) == 0) {
                X509_aux_print(bp,x,0);
              }
              iVar10 = 1;
              goto LAB_00af3170;
            }
          }
        }
      }
    }
  }
LAB_00af316c:
  iVar10 = 0;
LAB_00af3170:
  CRYPTO_free((void *)0x0);
  return iVar10;
}

