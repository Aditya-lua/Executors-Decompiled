/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26a90
 */

undefined8
ossl_ec_group_todata
          (EC_GROUP *param_1,long param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5,
          BN_CTX *param_6,undefined8 *param_7)

{
  point_conversion_form_t pVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  uchar *puVar8;
  size_t sVar9;
  BIGNUM *pBVar10;
  BIGNUM *pBVar11;
  BIGNUM *pBVar12;
  EC_POINT *pEVar13;
  char *pcVar14;
  long lVar15;
  
  if (param_1 == (EC_GROUP *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_backend.c",0x12a,"ossl_ec_group_todata");
    uVar5 = 0x86;
    goto LAB_00a27054;
  }
  pVar1 = EC_GROUP_get_point_conversion_form(param_1);
  if (pVar1 == POINT_CONVERSION_HYBRID) {
    lVar15 = 2;
LAB_00a26b1c:
    iVar2 = ossl_param_build_set_utf8_string
                      (param_2,param_3,"point-format",(&PTR_s_uncompressed_00c5b410)[lVar15 * 2]);
    if (iVar2 != 0) {
      uVar3 = EC_GROUP_get_asn1_flag(param_1);
      iVar2 = ossl_param_build_set_utf8_string
                        (param_2,param_3,"encoding",
                         (&PTR_s_explicit_00c5b3c0)[(ulong)(uVar3 & 1) * 2]);
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_backend.c",0x13d,"ossl_ec_group_todata");
        uVar5 = 0x66;
        goto LAB_00a27054;
      }
      uVar5 = ossl_param_build_set_int
                        (param_2,param_3,"decoded-from-explicit",*(undefined4 *)(param_1 + 0x28));
      if ((int)uVar5 == 0) {
        return uVar5;
      }
      iVar2 = EC_GROUP_get_curve_name(param_1);
      if ((param_2 != 0) && (iVar2 != 0)) goto LAB_00a26ba8;
      iVar4 = EC_GROUP_get_field_type(param_1);
      if (iVar4 == 0x196) {
        pcVar14 = "prime-field";
      }
      else {
        if (iVar4 != 0x197) {
          ERR_new();
          ERR_set_debug("crypto/ec/ec_backend.c",0xb3,"ec_group_explicit_todata");
          uVar5 = 0x67;
          goto LAB_00a27054;
        }
        pcVar14 = "characteristic-two-field";
      }
      lVar15 = OSSL_PARAM_locate_const(param_3,&DAT_002a38e7);
      lVar6 = OSSL_PARAM_locate_const(param_3,&DAT_002a374f);
      lVar7 = OSSL_PARAM_locate_const(param_3,&DAT_002adabd);
      if ((((param_2 == 0) && (lVar15 == 0)) && (lVar6 == 0)) && (lVar7 == 0)) {
LAB_00a26cc8:
        lVar15 = OSSL_PARAM_locate_const(param_3,"order");
        if ((param_2 != 0) || (lVar15 != 0)) {
          lVar15 = EC_GROUP_get0_order(param_1);
          if (lVar15 == 0) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_backend.c",0xd6,"ec_group_explicit_todata");
            uVar5 = 0x7a;
            goto LAB_00a27054;
          }
          iVar4 = ossl_param_build_set_bn(param_2,param_3,"order",lVar15);
          if (iVar4 == 0) {
            ERR_new();
            uVar5 = 0xdb;
            goto LAB_00a27044;
          }
        }
        lVar15 = OSSL_PARAM_locate_const(param_3,"field-type");
        if (((param_2 == 0) && (lVar15 == 0)) ||
           (iVar4 = ossl_param_build_set_utf8_string(param_2,param_3,"field-type",pcVar14),
           iVar4 != 0)) {
          lVar15 = OSSL_PARAM_locate_const(param_3,"generator");
          if ((param_2 != 0) || (lVar15 != 0)) {
            pEVar13 = EC_GROUP_get0_generator(param_1);
            pVar1 = EC_GROUP_get_point_conversion_form(param_1);
            if (pEVar13 == (EC_POINT *)0x0) {
              ERR_new(pVar1);
              uVar5 = 0xf1;
            }
            else {
              lVar15 = EC_POINT_point2buf(param_1,pEVar13,pVar1,param_7,param_6);
              if (lVar15 != 0) {
                iVar4 = ossl_param_build_set_octet_string
                                  (param_2,param_3,"generator",*param_7,lVar15);
                if (iVar4 == 0) {
                  ERR_new();
                  uVar5 = 0xfc;
                  goto LAB_00a27044;
                }
                goto LAB_00a26d54;
              }
              ERR_new();
              uVar5 = 0xf6;
            }
            ERR_set_debug("crypto/ec/ec_backend.c",uVar5,"ec_group_explicit_todata");
            uVar5 = 0xad;
            goto LAB_00a27054;
          }
LAB_00a26d54:
          lVar15 = OSSL_PARAM_locate_const(param_3,"cofactor");
          if (((param_2 == 0) && (lVar15 == 0)) ||
             ((lVar15 = EC_GROUP_get0_cofactor(param_1), lVar15 == 0 ||
              (iVar4 = ossl_param_build_set_bn(param_2,param_3,"cofactor",lVar15), iVar4 != 0)))) {
            lVar15 = OSSL_PARAM_locate_const(param_3,&DAT_002bb864);
            if ((param_2 != 0) || (lVar15 != 0)) {
              puVar8 = EC_GROUP_get0_seed(param_1);
              sVar9 = EC_GROUP_get_seed_len(param_1);
              if ((puVar8 != (uchar *)0x0) &&
                 ((sVar9 != 0 &&
                  (iVar4 = ossl_param_build_set_octet_string
                                     (param_2,param_3,&DAT_002bb864,puVar8,sVar9), iVar4 == 0)))) {
                ERR_new();
                uVar5 = 0x117;
                goto LAB_00a27044;
              }
            }
LAB_00a26ba8:
            if ((iVar2 == 0) ||
               ((lVar15 = OSSL_EC_curve_nid2name(iVar2), lVar15 != 0 &&
                (iVar2 = ossl_param_build_set_utf8_string(param_2,param_3,"group",lVar15),
                iVar2 != 0)))) {
              return 1;
            }
            ERR_new();
            pcVar14 = "ossl_ec_group_todata";
            uVar5 = 0x159;
            goto LAB_00a26c68;
          }
          ERR_new();
          uVar5 = 0x108;
        }
        else {
          ERR_new();
          uVar5 = 0xe5;
        }
      }
      else {
        pBVar10 = BN_CTX_get(param_6);
        pBVar11 = BN_CTX_get(param_6);
        pBVar12 = BN_CTX_get(param_6);
        if (pBVar12 == (BIGNUM *)0x0) {
          ERR_new();
          uVar5 = 0xc1;
        }
        else {
          iVar4 = EC_GROUP_get_curve(param_1,pBVar10,pBVar11,pBVar12,param_6);
          if (iVar4 == 0) {
            ERR_new();
            pcVar14 = "ec_group_explicit_todata";
            uVar5 = 0xc6;
LAB_00a26c68:
            ERR_set_debug("crypto/ec/ec_backend.c",uVar5,pcVar14);
            uVar5 = 0x8d;
            goto LAB_00a27054;
          }
          iVar4 = ossl_param_build_set_bn(param_2,param_3,&DAT_002a38e7,pBVar10);
          if (((iVar4 != 0) &&
              (iVar4 = ossl_param_build_set_bn(param_2,param_3,&DAT_002a374f,pBVar11), iVar4 != 0))
             && (iVar4 = ossl_param_build_set_bn(param_2,param_3,&DAT_002adabd,pBVar12), iVar4 != 0)
             ) goto LAB_00a26cc8;
          ERR_new();
          uVar5 = 0xcc;
        }
      }
LAB_00a27044:
      ERR_set_debug("crypto/ec/ec_backend.c",uVar5,"ec_group_explicit_todata");
      uVar5 = 0xc0100;
      goto LAB_00a27054;
    }
  }
  else {
    if (pVar1 == POINT_CONVERSION_UNCOMPRESSED) {
      lVar15 = 0;
      goto LAB_00a26b1c;
    }
    if (pVar1 == POINT_CONVERSION_COMPRESSED) {
      lVar15 = 1;
      goto LAB_00a26b1c;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/ec/ec_backend.c",0x134,"ossl_ec_group_todata");
  uVar5 = 0x68;
LAB_00a27054:
  ERR_set_error(0x10,uVar5,0);
  return 0;
}

