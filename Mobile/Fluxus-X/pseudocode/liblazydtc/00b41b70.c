/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b41b70
 */

bool FUN_00b41b70(BIO *param_1,EC_KEY *param_2,uint param_3)

{
  point_conversion_form_t pVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  EC_GROUP *group;
  EC_POINT *pEVar5;
  long lVar6;
  undefined8 uVar7;
  BN_CTX *ctx;
  uchar *puVar8;
  size_t sVar9;
  long lVar10;
  char *pcVar11;
  BIGNUM *pBVar12;
  BIGNUM *pBVar13;
  BIGNUM *pBVar14;
  long lVar15;
  long lVar16;
  bool bVar17;
  void *local_78;
  long local_70;
  undefined8 local_68;
  
  local_78 = (void *)0x0;
  local_70 = 0;
  if ((param_1 == (BIO *)0x0) || (param_2 == (EC_KEY *)0x0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x1f5,"ec_to_text");
    uVar7 = 0xc0102;
LAB_00b41c60:
    ERR_set_error(0x39,uVar7,0);
    return false;
  }
  group = EC_KEY_get0_group(param_2);
  if (group == (EC_GROUP *)0x0) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x1fa,"ec_to_text");
    uVar7 = 0x9e;
    goto LAB_00b41c60;
  }
  if ((param_3 & 1) == 0) {
    if ((param_3 >> 1 & 1) == 0) {
      lVar16 = 0;
      pcVar11 = (char *)0x0;
      if ((param_3 & 4) != 0) {
        pcVar11 = "EC-Parameters";
      }
      if ((param_3 & 3) == 0) goto LAB_00b41cb8;
LAB_00b41bdc:
      pEVar5 = EC_KEY_get0_public_key(param_2);
      if (pEVar5 == (EC_POINT *)0x0) {
        ERR_new();
        ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x214,"ec_to_text"
                     );
        ERR_set_error(0x39,0xdc,0);
        bVar17 = false;
        goto LAB_00b41e74;
      }
      pVar1 = EC_KEY_get_conv_form(param_2);
      lVar6 = EC_KEY_key2buf(param_2,pVar1,&local_78,0);
      if (lVar6 == 0) goto LAB_00b41e70;
    }
    else {
      lVar16 = 0;
      pcVar11 = "Public-Key";
joined_r0x00b41c9c:
      if ((param_3 & 3) != 0) goto LAB_00b41bdc;
LAB_00b41cb8:
      lVar6 = 0;
    }
    iVar2 = EC_GROUP_order_bits(group);
    iVar2 = BIO_printf(param_1,"%s: (%d bit)\n",pcVar11,iVar2);
    if ((0 < iVar2) &&
       ((local_70 == 0 || (iVar2 = FUN_00b41a48(param_1,"priv:",local_70,lVar16), iVar2 != 0)))) {
      if (local_78 == (void *)0x0) {
        uVar3 = param_3 >> 2 & 1;
      }
      else {
        uVar3 = FUN_00b41a48(param_1,&DAT_002aaf31,local_78,lVar6);
        if ((param_3 >> 2 & 1) == 0) goto LAB_00b41e70;
      }
      if (uVar3 != 0) {
        uVar7 = ossl_ec_key_get_libctx(param_2);
        uVar3 = EC_GROUP_get_asn1_flag(group);
        if ((uVar3 & 1) == 0) {
          ctx = (BN_CTX *)BN_CTX_new_ex(uVar7);
          if (ctx != (BN_CTX *)0x0) {
            BN_CTX_start(ctx);
            iVar2 = EC_GROUP_get_field_type(group);
            lVar6 = EC_GROUP_get0_order(group);
            if (lVar6 == 0) {
LAB_00b420e0:
              bVar17 = false;
            }
            else {
              puVar8 = EC_GROUP_get0_seed(group);
              if (puVar8 == (uchar *)0x0) {
                sVar9 = 0;
              }
              else {
                sVar9 = EC_GROUP_get_seed_len(group);
              }
              lVar10 = EC_GROUP_get0_cofactor(group);
              pcVar11 = OBJ_nid2sn(iVar2);
              iVar2 = BIO_printf(param_1,"Field Type: %s\n",pcVar11);
              if (iVar2 < 1) goto LAB_00b420e0;
              pBVar12 = BN_CTX_get(ctx);
              pBVar13 = BN_CTX_get(ctx);
              pBVar14 = BN_CTX_get(ctx);
              if ((pBVar14 == (BIGNUM *)0x0) ||
                 (iVar2 = EC_GROUP_get_curve(group,pBVar12,pBVar13,pBVar14,ctx), iVar2 == 0))
              goto LAB_00b420e0;
              iVar2 = EC_GROUP_get_field_type(group);
              if (iVar2 == 0x197) {
                iVar2 = EC_GROUP_get_basis_type(group);
                if (iVar2 != 0) {
                  pcVar11 = OBJ_nid2sn(iVar2);
                  iVar2 = BIO_printf(param_1,"Basis Type: %s\n",pcVar11);
                  if (0 < iVar2) {
                    pcVar11 = "Polynomial:";
                    goto LAB_00b41f98;
                  }
                }
                goto LAB_00b420e0;
              }
              pcVar11 = "Prime:";
LAB_00b41f98:
              iVar2 = FUN_00b41650(param_1,pcVar11,pBVar12);
              if (((iVar2 == 0) || (iVar2 = FUN_00b41650(param_1,"A:   ",pBVar13), iVar2 == 0)) ||
                 (iVar2 = FUN_00b41650(param_1,"B:   ",pBVar14), iVar2 == 0)) goto LAB_00b420e0;
              local_68 = 0;
              pVar1 = EC_GROUP_get_point_conversion_form(group);
              pEVar5 = EC_GROUP_get0_generator(group);
              if (pEVar5 == (EC_POINT *)0x0) goto LAB_00b420e0;
              if (pVar1 == POINT_CONVERSION_COMPRESSED) {
                pcVar11 = "Generator (compressed):";
              }
              else if (pVar1 == POINT_CONVERSION_HYBRID) {
                pcVar11 = "Generator (hybrid):";
              }
              else {
                if (pVar1 != POINT_CONVERSION_UNCOMPRESSED) goto LAB_00b420e0;
                pcVar11 = "Generator (uncompressed):";
              }
              lVar15 = EC_POINT_point2buf(group,pEVar5,pVar1,&local_68,ctx);
              if (lVar15 == 0) goto LAB_00b420e0;
              iVar2 = FUN_00b41a48(param_1,pcVar11,local_68,lVar15);
              CRYPTO_clear_free(local_68,lVar15,
                                "providers/implementations/encode_decode/encode_key2text.c",0x1a7);
              if ((((iVar2 == 0) || (iVar2 = FUN_00b41650(param_1,"Order: ",lVar6), iVar2 == 0)) ||
                  ((lVar10 != 0 && (iVar2 = FUN_00b41650(param_1,"Cofactor: ",lVar10), iVar2 == 0)))
                  ) || ((puVar8 != (uchar *)0x0 &&
                        (iVar2 = FUN_00b41a48(param_1,"Seed:",puVar8,sVar9), iVar2 == 0))))
              goto LAB_00b420e0;
              bVar17 = true;
            }
            BN_CTX_end(ctx);
            BN_CTX_free(ctx);
            goto LAB_00b41e74;
          }
        }
        else {
          iVar2 = EC_GROUP_get_curve_name(group);
          if (iVar2 != 0) {
            pcVar11 = OBJ_nid2sn(iVar2);
            iVar4 = BIO_printf(param_1,"%s: %s\n","ASN1 OID",pcVar11);
            if (0 < iVar4) {
              pcVar11 = (char *)EC_curve_nid2nist(iVar2);
              if (pcVar11 == (char *)0x0) {
                bVar17 = true;
              }
              else {
                iVar2 = BIO_printf(param_1,"%s: %s\n","NIST CURVE",pcVar11);
                bVar17 = 0 < iVar2;
              }
              goto LAB_00b41e74;
            }
          }
        }
      }
    }
  }
  else {
    pBVar12 = EC_KEY_get0_private_key(param_2);
    if (pBVar12 == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x209,"ec_to_text");
      ERR_set_error(0x39,0xdd,0);
      lVar16 = 0;
      bVar17 = false;
      goto LAB_00b41e74;
    }
    lVar16 = EC_KEY_priv2buf(param_2,&local_70);
    if (lVar16 != 0) {
      pcVar11 = "Private-Key";
      goto joined_r0x00b41c9c;
    }
  }
LAB_00b41e70:
  bVar17 = false;
LAB_00b41e74:
  CRYPTO_clear_free(local_70,lVar16,"providers/implementations/encode_decode/encode_key2text.c",
                    0x229);
  CRYPTO_free(local_78);
  return bVar17;
}

