/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096b528
 */

void FUN_0096b528(long param_1,SSL *param_2)

{
  long lVar1;
  BIGNUM *pBVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  stack_st_X509 *psVar7;
  undefined8 uVar8;
  BIO_METHOD *pBVar9;
  BIO *out;
  X509 *a;
  X509_NAME *pXVar10;
  long lVar11;
  ASN1_INTEGER *pAVar12;
  X509_PUBKEY *pub;
  X509_EXTENSION *ex;
  BIO *out_00;
  ASN1_OBJECT *pAVar13;
  ASN1_OCTET_STRING *v;
  ASN1_TIME *pAVar14;
  EVP_PKEY *pkey;
  ulong uVar15;
  undefined *puVar16;
  int iVar17;
  ASN1_OBJECT *local_128;
  BIGNUM *local_120;
  ASN1_OBJECT *local_118;
  BIGNUM *local_110;
  int *local_108;
  undefined8 local_100;
  undefined8 *local_f8;
  ASN1_OBJECT *local_f0 [16];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  psVar7 = SSL_get_peer_cert_chain(param_2);
  if (psVar7 != (stack_st_X509 *)0x0) {
    iVar3 = OPENSSL_sk_num(psVar7);
    uVar8 = FUN_00968f18(param_1,iVar3);
    if ((int)uVar8 != 0) goto LAB_0096c180;
    pBVar9 = BIO_s_mem();
    out = BIO_new(pBVar9);
    if (out != (BIO *)0x0) {
      if (0 < iVar3) {
        iVar17 = 0;
        do {
          a = (X509 *)OPENSSL_sk_value(psVar7,iVar17);
          local_108 = (int *)0x0;
          pXVar10 = X509_get_subject_name(a);
          X509_NAME_print_ex(out,pXVar10,0,0x82031f);
          lVar11 = BIO_ctrl(out,3,0,&local_100);
          FUN_00968fcc(param_1,iVar17,"Subject",local_100,lVar11);
          BIO_ctrl(out,1,0,(void *)0x0);
          pXVar10 = X509_get_issuer_name(a);
          X509_NAME_print_ex(out,pXVar10,0,0x82031f);
          lVar11 = BIO_ctrl(out,3,0,&local_100);
          FUN_00968fcc(param_1,iVar17,"Issuer",local_100,lVar11);
          BIO_ctrl(out,1,0,(void *)0x0);
          uVar8 = X509_get_version(a);
          BIO_printf(out,"%lx",uVar8);
          lVar11 = BIO_ctrl(out,3,0,&local_100);
          FUN_00968fcc(param_1,iVar17,"Version",local_100,lVar11);
          BIO_ctrl(out,1,0,(void *)0x0);
          pAVar12 = X509_get_serialNumber(a);
          if (pAVar12->type == 0x102) {
            BIO_puts(out,"-");
          }
          if (0 < pAVar12->length) {
            lVar11 = 0;
            do {
              BIO_printf(out,"%02x",(ulong)pAVar12->data[lVar11]);
              lVar11 = lVar11 + 1;
            } while (lVar11 < pAVar12->length);
          }
          lVar11 = BIO_ctrl(out,3,0,&local_100);
          FUN_00968fcc(param_1,iVar17,"Serial Number",local_100,lVar11);
          BIO_ctrl(out,1,0,(void *)0x0);
          local_118 = (ASN1_OBJECT *)0x0;
          local_110 = (BIGNUM *)0x0;
          X509_get0_signature(&local_108,&local_110,a);
          if (local_110 != (BIGNUM *)0x0) {
            local_f0[0] = (ASN1_OBJECT *)0x0;
            X509_ALGOR_get0(local_f0,(int *)0x0,(void **)0x0,(X509_ALGOR *)local_110);
            i2a_ASN1_OBJECT(out,local_f0[0]);
            lVar11 = BIO_ctrl(out,3,0,&local_100);
            FUN_00968fcc(param_1,iVar17,"Signature Algorithm",local_100,lVar11);
            BIO_ctrl(out,1,0,(void *)0x0);
          }
          pub = (X509_PUBKEY *)X509_get_X509_PUBKEY(a);
          if ((pub != (X509_PUBKEY *)0x0) &&
             (X509_PUBKEY_get0_param(&local_118,(uchar **)0x0,(int *)0x0,(X509_ALGOR **)0x0,pub),
             local_118 != (ASN1_OBJECT *)0x0)) {
            i2a_ASN1_OBJECT(out,local_118);
            lVar11 = BIO_ctrl(out,3,0,&local_100);
            FUN_00968fcc(param_1,iVar17,"Public Key Algorithm",local_100,lVar11);
            BIO_ctrl(out,1,0,(void *)0x0);
          }
          uVar8 = X509_get0_extensions(a);
          iVar4 = OPENSSL_sk_num();
          if ((0 < iVar4) && (iVar4 = OPENSSL_sk_num(uVar8), 0 < iVar4)) {
            iVar4 = 0;
            do {
              ex = (X509_EXTENSION *)OPENSSL_sk_value(uVar8,iVar4);
              pBVar9 = BIO_s_mem();
              out_00 = BIO_new(pBVar9);
              if (out_00 == (BIO *)0x0) break;
              pAVar13 = X509_EXTENSION_get_object(ex);
              i2t_ASN1_OBJECT((char *)local_f0,0x80,pAVar13);
              iVar5 = X509V3_EXT_print(out_00,ex,0,0);
              if (iVar5 == 0) {
                v = X509_EXTENSION_get_data(ex);
                ASN1_STRING_print(out_00,v);
              }
              BIO_ctrl(out_00,0x73,0,&local_f8);
              FUN_00968fcc(param_1,iVar17,local_f0,local_f8[1],*local_f8);
              BIO_free(out_00);
              iVar4 = iVar4 + 1;
              iVar5 = OPENSSL_sk_num(uVar8);
            } while (iVar4 < iVar5);
          }
          pAVar14 = (ASN1_TIME *)X509_get0_notBefore(a);
          ASN1_TIME_print(out,pAVar14);
          lVar11 = BIO_ctrl(out,3,0,&local_100);
          FUN_00968fcc(param_1,iVar17,"Start date",local_100,lVar11);
          BIO_ctrl(out,1,0,(void *)0x0);
          pAVar14 = (ASN1_TIME *)X509_get0_notAfter(a);
          ASN1_TIME_print(out,pAVar14);
          lVar11 = BIO_ctrl(out,3,0,&local_100);
          FUN_00968fcc(param_1,iVar17,"Expire date",local_100,lVar11);
          BIO_ctrl(out,1,0,(void *)0x0);
          pkey = X509_get_pubkey(a);
          if (pkey == (EVP_PKEY *)0x0) {
            if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
               ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_1,"   Unable to load public key");
            }
          }
          else {
            iVar4 = EVP_PKEY_get_id(pkey);
            if (iVar4 == 0x74) {
              local_118 = (ASN1_OBJECT *)0x0;
              local_110 = (BIGNUM *)0x0;
              local_128 = (ASN1_OBJECT *)0x0;
              local_120 = (BIGNUM *)0x0;
              EVP_PKEY_get_bn_param(pkey,&DAT_002a38e7,&local_110);
              EVP_PKEY_get_bn_param(pkey,&DAT_002cf3b1,&local_118);
              EVP_PKEY_get_bn_param(pkey,&DAT_002d92e5,&local_120);
              EVP_PKEY_get_bn_param(pkey,&DAT_002ad463,&local_128);
              pBVar2 = local_110;
              curl_msnprintf(local_f0,0x20,"%s(%s)",&DAT_002c916f,&DAT_002a38e7);
              if (pBVar2 != (BIGNUM *)0x0) {
                BN_print(out,pBVar2);
              }
              lVar11 = BIO_ctrl(out,3,0,&local_f8);
              FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
              BIO_ctrl(out,1,0,(void *)0x0);
              pAVar13 = local_118;
              curl_msnprintf(local_f0,0x20,"%s(%s)",&DAT_002c916f,&DAT_002cf3b1);
              if (pAVar13 != (ASN1_OBJECT *)0x0) {
                BN_print(out,(BIGNUM *)pAVar13);
              }
              lVar11 = BIO_ctrl(out,3,0,&local_f8);
              FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
              BIO_ctrl(out,1,0,(void *)0x0);
              pBVar2 = local_120;
              curl_msnprintf(local_f0,0x20,"%s(%s)",&DAT_002c916f,&DAT_002d92e5);
              if (pBVar2 != (BIGNUM *)0x0) {
                BN_print(out,pBVar2);
              }
              lVar11 = BIO_ctrl(out,3,0,&local_f8);
              FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
              BIO_ctrl(out,1,0,(void *)0x0);
              puVar16 = &DAT_002c916f;
LAB_0096beac:
              pAVar13 = local_128;
              curl_msnprintf(local_f0,0x20,"%s(%s)",puVar16,"pub_key");
              if (pAVar13 != (ASN1_OBJECT *)0x0) {
                BN_print(out,(BIGNUM *)pAVar13);
              }
              lVar11 = BIO_ctrl(out,3,0,&local_f8);
              FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
              BIO_ctrl(out,1,0,(void *)0x0);
              BN_clear_free(local_110);
              BN_clear_free((BIGNUM *)local_118);
              BN_clear_free(local_120);
              pAVar13 = local_128;
LAB_0096c07c:
              BN_clear_free((BIGNUM *)pAVar13);
            }
            else {
              if (iVar4 == 0x1c) {
                local_118 = (ASN1_OBJECT *)0x0;
                local_110 = (BIGNUM *)0x0;
                local_128 = (ASN1_OBJECT *)0x0;
                local_120 = (BIGNUM *)0x0;
                EVP_PKEY_get_bn_param(pkey,&DAT_002a38e7,&local_110);
                EVP_PKEY_get_bn_param(pkey,&DAT_002cf3b1,&local_118);
                EVP_PKEY_get_bn_param(pkey,&DAT_002d92e5,&local_120);
                EVP_PKEY_get_bn_param(pkey,&DAT_002ad463,&local_128);
                pBVar2 = local_110;
                curl_msnprintf(local_f0,0x20,"%s(%s)",&DAT_002b398c,&DAT_002a38e7);
                if (pBVar2 != (BIGNUM *)0x0) {
                  BN_print(out,pBVar2);
                }
                lVar11 = BIO_ctrl(out,3,0,&local_f8);
                FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
                BIO_ctrl(out,1,0,(void *)0x0);
                pAVar13 = local_118;
                curl_msnprintf(local_f0,0x20,"%s(%s)",&DAT_002b398c,&DAT_002cf3b1);
                if (pAVar13 != (ASN1_OBJECT *)0x0) {
                  BN_print(out,(BIGNUM *)pAVar13);
                }
                lVar11 = BIO_ctrl(out,3,0,&local_f8);
                FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
                BIO_ctrl(out,1,0,(void *)0x0);
                pBVar2 = local_120;
                curl_msnprintf(local_f0,0x20,"%s(%s)",&DAT_002b398c,&DAT_002d92e5);
                if (pBVar2 != (BIGNUM *)0x0) {
                  BN_print(out,pBVar2);
                }
                lVar11 = BIO_ctrl(out,3,0,&local_f8);
                FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
                BIO_ctrl(out,1,0,(void *)0x0);
                puVar16 = &DAT_002b398c;
                goto LAB_0096beac;
              }
              if (iVar4 == 6) {
                local_118 = (ASN1_OBJECT *)0x0;
                local_110 = (BIGNUM *)0x0;
                EVP_PKEY_get_bn_param(pkey,&DAT_002a5623,&local_110);
                EVP_PKEY_get_bn_param(pkey,&DAT_002ab8a5,&local_118);
                if (local_110 == (BIGNUM *)0x0) {
                  uVar15 = 0;
                }
                else {
                  uVar6 = BN_num_bits(local_110);
                  uVar15 = (ulong)uVar6;
                }
                BIO_printf(out,"%d",uVar15);
                lVar11 = BIO_ctrl(out,3,0,&local_100);
                FUN_00968fcc(param_1,iVar17,"RSA Public Key",local_100,lVar11);
                BIO_ctrl(out,1,0,(void *)0x0);
                pBVar2 = local_110;
                curl_msnprintf(local_f0,0x20,"%s(%s)",&DAT_002af5e5,&DAT_002a5623);
                if (pBVar2 != (BIGNUM *)0x0) {
                  BN_print(out,pBVar2);
                }
                lVar11 = BIO_ctrl(out,3,0,&local_f8);
                FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
                BIO_ctrl(out,1,0,(void *)0x0);
                pAVar13 = local_118;
                curl_msnprintf(local_f0,0x20,"%s(%s)",&DAT_002af5e5,&DAT_002ab8a5);
                if (pAVar13 != (ASN1_OBJECT *)0x0) {
                  BN_print(out,(BIGNUM *)pAVar13);
                }
                lVar11 = BIO_ctrl(out,3,0,&local_f8);
                FUN_00968fcc(param_1,iVar17,local_f0,local_f8,lVar11);
                BIO_ctrl(out,1,0,(void *)0x0);
                BN_clear_free(local_110);
                pAVar13 = local_118;
                goto LAB_0096c07c;
              }
            }
            EVP_PKEY_free(pkey);
          }
          if (local_108 != (int *)0x0) {
            if (0 < *local_108) {
              lVar11 = 0;
              do {
                BIO_printf(out,"%02x:",(uint)*(byte *)(*(long *)(local_108 + 2) + lVar11));
                lVar11 = lVar11 + 1;
              } while (lVar11 < *local_108);
            }
            lVar11 = BIO_ctrl(out,3,0,&local_100);
            FUN_00968fcc(param_1,iVar17,"Signature",local_100,lVar11);
            BIO_ctrl(out,1,0,(void *)0x0);
          }
          PEM_write_bio_X509(out,a);
          lVar11 = BIO_ctrl(out,3,0,&local_100);
          FUN_00968fcc(param_1,iVar17,&DAT_002a9951,local_100,lVar11);
          BIO_ctrl(out,1,0,(void *)0x0);
          iVar17 = iVar17 + 1;
        } while (iVar17 != iVar3);
      }
      BIO_free(out);
      uVar8 = 0;
      goto LAB_0096c180;
    }
  }
  uVar8 = 0x1b;
LAB_0096c180:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar8);
  }
  return;
}

