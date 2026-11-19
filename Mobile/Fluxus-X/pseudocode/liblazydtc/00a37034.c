/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37034
 */

int ECPKParameters_print(BIO *bp,EC_GROUP *x,int off)

{
  char *pcVar1;
  int iVar2;
  int iVar3;
  point_conversion_form_t pVar4;
  BN_CTX *c;
  char *pcVar5;
  EC_POINT *pEVar6;
  BIGNUM *num;
  BIGNUM *num_00;
  uchar *puVar7;
  undefined4 uVar8;
  BIGNUM *num_01;
  BIGNUM *num_02;
  BIGNUM *num_03;
  long lVar9;
  size_t local_90;
  undefined4 local_70;
  long local_68;
  
  uVar8 = 0xc0100;
  local_68 = 0;
  if (x == (EC_GROUP *)0x0) {
    num_01 = (BIGNUM *)0x0;
    num_03 = (BIGNUM *)0x0;
    num_02 = (BIGNUM *)0x0;
    lVar9 = 0;
    c = (BN_CTX *)0x0;
    uVar8 = 0xc0102;
    goto LAB_00a37254;
  }
  c = BN_CTX_new();
  if (c == (BN_CTX *)0x0) {
LAB_00a37140:
    num_01 = (BIGNUM *)0x0;
    num_03 = (BIGNUM *)0x0;
    num_02 = (BIGNUM *)0x0;
    lVar9 = 0;
  }
  else {
    iVar2 = EC_GROUP_get_asn1_flag(x);
    if (iVar2 != 0) {
      uVar8 = 0x80020;
      iVar2 = BIO_indent(bp,off,0x80);
      if ((iVar2 != 0) && (iVar2 = EC_GROUP_get_curve_name(x), iVar2 != 0)) {
        pcVar5 = OBJ_nid2sn(iVar2);
        iVar3 = BIO_printf(bp,"ASN1 OID: %s",pcVar5);
        if ((0 < iVar3) && (iVar3 = BIO_printf(bp,"\n"), 0 < iVar3)) {
          pcVar5 = (char *)EC_curve_nid2nist(iVar2);
          if (pcVar5 == (char *)0x0) {
            lVar9 = 0;
            num_02 = (BIGNUM *)0x0;
            num_03 = (BIGNUM *)0x0;
            num_01 = (BIGNUM *)0x0;
          }
          else {
            iVar2 = BIO_indent(bp,off,0x80);
            if ((iVar2 == 0) || (iVar2 = BIO_printf(bp,"NIST CURVE: %s\n",pcVar5), iVar2 < 1))
            goto LAB_00a37140;
            lVar9 = 0;
            num_02 = (BIGNUM *)0x0;
            num_03 = (BIGNUM *)0x0;
            num_01 = (BIGNUM *)0x0;
          }
LAB_00a372ec:
          iVar2 = 1;
          goto LAB_00a37284;
        }
      }
      goto LAB_00a37140;
    }
    iVar2 = EC_GROUP_get_field_type(x);
    num_02 = BN_new();
    if (num_02 == (BIGNUM *)0x0) {
      num_01 = (BIGNUM *)0x0;
LAB_00a3724c:
      num_03 = (BIGNUM *)0x0;
LAB_00a37250:
      lVar9 = 0;
    }
    else {
      num_01 = BN_new();
      if (num_01 == (BIGNUM *)0x0) goto LAB_00a3724c;
      num_03 = BN_new();
      if (num_03 == (BIGNUM *)0x0) goto LAB_00a37250;
      uVar8 = 0x80020;
      iVar3 = EC_GROUP_get_curve(x,num_02,num_01,num_03,c);
      if (iVar3 == 0) {
        lVar9 = 0;
        uVar8 = 0x80010;
      }
      else {
        pEVar6 = EC_GROUP_get0_generator(x);
        local_70 = 0x80010;
        if (pEVar6 == (EC_POINT *)0x0) {
          lVar9 = 0;
          uVar8 = local_70;
        }
        else {
          num = (BIGNUM *)EC_GROUP_get0_order(x);
          num_00 = (BIGNUM *)EC_GROUP_get0_cofactor(x);
          lVar9 = 0;
          if (num != (BIGNUM *)0x0) {
            pVar4 = EC_GROUP_get_point_conversion_form(x);
            lVar9 = EC_POINT_point2buf(x,pEVar6,pVar4,&local_68,c);
            if (lVar9 != 0) {
              puVar7 = EC_GROUP_get0_seed(x);
              if (puVar7 == (uchar *)0x0) {
                local_90 = 0;
              }
              else {
                local_90 = EC_GROUP_get_seed_len(x);
              }
              iVar3 = BIO_indent(bp,off,0x80);
              if (iVar3 != 0) {
                pcVar5 = OBJ_nid2sn(iVar2);
                iVar3 = BIO_printf(bp,"Field Type: %s\n",pcVar5);
                if (0 < iVar3) {
                  if (iVar2 == 0x197) {
                    iVar2 = EC_GROUP_get_basis_type(x);
                    if ((iVar2 != 0) && (iVar3 = BIO_indent(bp,off,0x80), iVar3 != 0)) {
                      pcVar5 = OBJ_nid2sn(iVar2);
                      iVar2 = BIO_printf(bp,"Basis Type: %s\n",pcVar5);
                      if (0 < iVar2) {
                        pcVar5 = "Polynomial:";
                        goto LAB_00a373b4;
                      }
                    }
                  }
                  else {
                    pcVar5 = "Prime:";
LAB_00a373b4:
                    iVar2 = ASN1_bn_print(bp,pcVar5,num_02,(uchar *)0x0,off);
                    if (((iVar2 != 0) &&
                        (iVar2 = ASN1_bn_print(bp,"A:   ",num_01,(uchar *)0x0,off), iVar2 != 0)) &&
                       (iVar2 = ASN1_bn_print(bp,"B:   ",num_03,(uchar *)0x0,off), iVar2 != 0)) {
                      if (local_68 != 0) {
                        pcVar5 = "Generator (uncompressed):";
                        if (pVar4 != POINT_CONVERSION_UNCOMPRESSED) {
                          pcVar5 = "Generator (hybrid):";
                        }
                        pcVar1 = "Generator (compressed):";
                        if (pVar4 != POINT_CONVERSION_COMPRESSED) {
                          pcVar1 = pcVar5;
                        }
                        iVar2 = FUN_00a37600(bp,pcVar1,local_68,lVar9,off);
                        if (iVar2 == 0) goto LAB_00a37254;
                      }
                      iVar2 = ASN1_bn_print(bp,"Order: ",num,(uchar *)0x0,off);
                      if (((iVar2 != 0) &&
                          ((num_00 == (BIGNUM *)0x0 ||
                           (iVar2 = ASN1_bn_print(bp,"Cofactor: ",num_00,(uchar *)0x0,off),
                           iVar2 != 0)))) &&
                         ((puVar7 == (uchar *)0x0 ||
                          (iVar2 = FUN_00a37600(bp,"Seed:",puVar7,local_90,off), iVar2 != 0))))
                      goto LAB_00a372ec;
                    }
                  }
                }
              }
              goto LAB_00a37254;
            }
          }
          uVar8 = local_70;
        }
      }
    }
  }
LAB_00a37254:
  ERR_new();
  ERR_set_debug("crypto/ec/eck_prn.c",0xd8,"ECPKParameters_print");
  ERR_set_error(0x10,uVar8,0);
  iVar2 = 0;
LAB_00a37284:
  BN_free(num_02);
  BN_free(num_01);
  BN_free(num_03);
  CRYPTO_clear_free(local_68,lVar9,"crypto/ec/eck_prn.c",0xdc);
  BN_CTX_free(c);
  return iVar2;
}

