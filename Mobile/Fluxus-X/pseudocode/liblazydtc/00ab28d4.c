/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab28d4
 */

int OCSP_basic_verify(OCSP_BASICRESP *bs,stack_st_X509 *certs,X509_STORE *st,ulong flags)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  X509 *x;
  long lVar8;
  uint uVar9;
  OCSP_RESPDATA *pOVar10;
  OCSP_CERTID *a;
  int iVar11;
  OCSP_CERTID *b;
  undefined8 local_58;
  
  local_58 = 0;
  lVar4 = FUN_00ab30c0(certs,&bs->signatureAlgorithm);
  if (lVar4 == 0) {
    if ((((uint)flags >> 1 & 1) == 0) &&
       (lVar4 = FUN_00ab30c0(bs[2].signatureAlgorithm,&bs->signatureAlgorithm), lVar4 != 0))
    goto LAB_00ab2928;
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x6b,"OCSP_basic_verify");
    ERR_set_error(0x27,0x76,0);
    lVar8 = 0;
LAB_00ab2a64:
    iVar1 = 0;
    goto LAB_00ab2bcc;
  }
  flags = flags >> 5 & 0x10 | flags;
LAB_00ab2928:
  iVar1 = FUN_00ab2c40(0,bs,lVar4,flags);
  if (iVar1 < 1) {
    lVar8 = 0;
    goto LAB_00ab2bcc;
  }
  lVar8 = 0;
  uVar9 = (uint)flags;
  if ((uVar9 >> 4 & 1) != 0) goto LAB_00ab2bcc;
  lVar8 = 0;
  if (((uVar9 >> 3 & 1) != 0) ||
     ((lVar8 = OPENSSL_sk_dup(bs[2].signatureAlgorithm), lVar8 != 0 &&
      (iVar1 = X509_add_certs(lVar8,certs,0), iVar1 != 0)))) {
    iVar1 = FUN_00ab2d34(lVar4,1,st,flags,lVar8,&local_58);
    uVar7 = local_58;
    if (iVar1 < 1) goto LAB_00ab2bcc;
    if ((uVar9 >> 8 & 1) != 0) {
LAB_00ab2bc8:
      iVar1 = 1;
      goto LAB_00ab2bcc;
    }
    pOVar10 = bs[1].tbsResponseData;
    iVar1 = OPENSSL_sk_num(local_58);
    if (iVar1 < 1) {
      ERR_new();
      ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0xe6,"ocsp_check_issuer");
      uVar7 = 0x69;
    }
    else {
      iVar1 = OPENSSL_sk_num(pOVar10);
      if (0 < iVar1) {
        puVar5 = (undefined8 *)OPENSSL_sk_value(pOVar10,0);
        a = (OCSP_CERTID *)*puVar5;
        if (iVar1 != 1) {
          iVar11 = 1;
          do {
            puVar5 = (undefined8 *)OPENSSL_sk_value(pOVar10,iVar11);
            b = (OCSP_CERTID *)*puVar5;
            iVar2 = OCSP_id_issuer_cmp(a,b);
            if (iVar2 != 0) {
              iVar1 = OBJ_cmp((ASN1_OBJECT *)b->hashAlgorithm,(ASN1_OBJECT *)a->hashAlgorithm);
              a = (OCSP_CERTID *)0x0;
              if (iVar1 == 0) {
                iVar1 = 0;
                iVar11 = 0;
                if ((uVar9 >> 5 & 1) != 0) goto LAB_00ab2bcc;
                goto LAB_00ab2b98;
              }
              break;
            }
            iVar11 = iVar11 + 1;
          } while (iVar11 < iVar1);
        }
        uVar6 = OPENSSL_sk_value(uVar7,0);
        iVar1 = OPENSSL_sk_num(uVar7);
        if (iVar1 < 2) {
LAB_00ab2b80:
          iVar1 = FUN_00ab31cc(uVar6,a,pOVar10);
        }
        else {
          uVar7 = OPENSSL_sk_value(uVar7,1);
          iVar1 = FUN_00ab31cc(uVar7,a,pOVar10);
          if (iVar1 < 0) goto LAB_00ab2bcc;
          if (iVar1 == 0) goto LAB_00ab2b80;
          uVar3 = X509_get_extension_flags(uVar6);
          if (((uVar3 >> 2 & 1) != 0) &&
             (uVar3 = X509_get_extended_key_usage(uVar6), (uVar3 >> 5 & 1) != 0)) goto LAB_00ab2bc8;
          ERR_new();
          ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x178,"ocsp_check_delegated");
          ERR_set_error(0x27,0x67,0);
          iVar1 = 0;
        }
        iVar11 = iVar1;
        if ((uVar9 >> 5 & 1) != 0) goto LAB_00ab2bcc;
LAB_00ab2b98:
        iVar1 = iVar11;
        uVar7 = local_58;
        if (iVar1 != 0) goto LAB_00ab2bcc;
        iVar1 = OPENSSL_sk_num(local_58);
        x = (X509 *)OPENSSL_sk_value(uVar7,iVar1 + -1);
        iVar1 = X509_check_trust(x,0xb4,0);
        if (iVar1 != 1) {
          ERR_new();
          ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x95,"OCSP_basic_verify");
          ERR_set_error(0x27,0x70,0);
          goto LAB_00ab2a64;
        }
        goto LAB_00ab2bc8;
      }
      ERR_new();
      ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x112,"ocsp_check_ids");
      uVar7 = 0x6f;
    }
    ERR_set_error(0x27,uVar7,0);
  }
  iVar1 = -1;
LAB_00ab2bcc:
  OPENSSL_sk_pop_free(local_58,X509_free);
  OPENSSL_sk_free(lVar8);
  return iVar1;
}

