/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a244ec
 */

ASN1_VALUE * EC_GROUP_get_ecparameters(EC_GROUP *param_1,ASN1_VALUE *param_2)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  point_conversion_form_t pVar4;
  ASN1_VALUE *val;
  ASN1_OBJECT *pAVar5;
  BIGNUM *pBVar6;
  ASN1_INTEGER *pAVar7;
  BIGNUM *a;
  void *ptr;
  void *data;
  ASN1_STRING *pAVar8;
  ASN1_VALUE *pAVar9;
  ASN1_VALUE *pAVar10;
  ASN1_NULL *pAVar11;
  EC_POINT *pEVar12;
  long lVar13;
  void *data_00;
  undefined8 uVar14;
  ASN1_INTEGER *pAVar15;
  undefined8 *puVar16;
  ulong uVar17;
  long *plVar18;
  void *local_78;
  undefined4 local_6c;
  undefined4 local_68;
  uint local_64;
  
  local_78 = (void *)0x0;
  val = param_2;
  if ((param_2 == (ASN1_VALUE *)0x0) &&
     (val = ASN1_item_new((ASN1_ITEM *)&DAT_00c5acc0), val == (ASN1_VALUE *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x18c,"EC_GROUP_get_ecparameters");
    ERR_set_error(0x10,0xc0100,0);
    goto LAB_00a24908;
  }
  *(undefined4 *)val = 1;
  if ((param_1 == (EC_GROUP *)0x0) ||
     (puVar16 = *(undefined8 **)(val + 8), puVar16 == (undefined8 *)0x0)) {
LAB_00a248d0:
    ERR_new();
    uVar14 = 0x197;
LAB_00a248e8:
    ERR_set_debug("crypto/ec/ec_asn1.c",uVar14,"EC_GROUP_get_ecparameters");
    uVar14 = 0x80010;
  }
  else {
    ASN1_OBJECT_free((ASN1_OBJECT *)*puVar16);
    ASN1_TYPE_free((ASN1_TYPE *)puVar16[1]);
    iVar2 = EC_GROUP_get_field_type(param_1);
    pAVar5 = OBJ_nid2obj(iVar2);
    *puVar16 = pAVar5;
    if (pAVar5 == (ASN1_OBJECT *)0x0) {
      ERR_new();
      uVar14 = 0xca;
LAB_00a24724:
      ERR_set_debug("crypto/ec/ec_asn1.c",uVar14,"ec_asn1_group2fieldid");
      uVar14 = 0x80008;
LAB_00a248bc:
      ERR_set_error(0x10,uVar14,0);
LAB_00a248c4:
      pBVar6 = (BIGNUM *)0x0;
LAB_00a248c8:
      BN_free(pBVar6);
      goto LAB_00a248d0;
    }
    if (iVar2 != 0x197) {
      if (iVar2 != 0x196) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0x12a,"ec_asn1_group2fieldid");
        uVar14 = 0x83;
        goto LAB_00a248bc;
      }
      pBVar6 = BN_new();
      if (pBVar6 == (BIGNUM *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0xd0,"ec_asn1_group2fieldid");
        uVar14 = 0xc0100;
      }
      else {
        iVar2 = EC_GROUP_get_curve(param_1,pBVar6,0,0,0);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ec_asn1.c",0xd5,"ec_asn1_group2fieldid");
          uVar14 = 0x80010;
        }
        else {
          pAVar7 = BN_to_ASN1_INTEGER(pBVar6,(ASN1_INTEGER *)0x0);
          puVar16[1] = pAVar7;
          if (pAVar7 != (ASN1_INTEGER *)0x0) goto LAB_00a245c4;
          ERR_new();
          ERR_set_debug("crypto/ec/ec_asn1.c",0xdb,"ec_asn1_group2fieldid");
          uVar14 = 0x8000d;
        }
      }
      ERR_set_error(0x10,uVar14,0);
      goto LAB_00a248c8;
    }
    pAVar9 = ASN1_item_new((ASN1_ITEM *)&DAT_00c5af48);
    puVar16[1] = pAVar9;
    if (pAVar9 == (ASN1_VALUE *)0x0) {
      ERR_new();
      uVar14 = 0xed;
      goto LAB_00a24854;
    }
    iVar2 = EC_GROUP_get_degree(param_1);
    *(int *)pAVar9 = iVar2;
    iVar2 = EC_GROUP_get_basis_type(param_1);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0xf6,"ec_asn1_group2fieldid");
      uVar14 = 0x80010;
      goto LAB_00a248bc;
    }
    pAVar5 = OBJ_nid2obj(iVar2);
    *(ASN1_OBJECT **)(pAVar9 + 8) = pAVar5;
    if (pAVar5 == (ASN1_OBJECT *)0x0) {
      ERR_new();
      uVar14 = 0xfb;
      goto LAB_00a24724;
    }
    if (iVar2 == 0x2ab) {
      iVar2 = EC_GROUP_get_pentanomial_basis(param_1,&local_64,&local_68,&local_6c);
      if (iVar2 == 0) goto LAB_00a248c4;
      pAVar10 = ASN1_item_new((ASN1_ITEM *)&DAT_00c5ae98);
      *(ASN1_VALUE **)(pAVar9 + 0x10) = pAVar10;
      if (pAVar10 == (ASN1_VALUE *)0x0) {
        ERR_new();
        uVar14 = 0x116;
        goto LAB_00a24854;
      }
      pBVar6 = (BIGNUM *)0x0;
      *(uint *)pAVar10 = local_64;
      *(undefined4 *)(*(long *)(pAVar9 + 0x10) + 4) = local_68;
      *(undefined4 *)(*(long *)(pAVar9 + 0x10) + 8) = local_6c;
    }
    else if (iVar2 == 0x2aa) {
      iVar2 = EC_GROUP_get_trinomial_basis(param_1,&local_64);
      if (iVar2 == 0) goto LAB_00a248c4;
      pAVar7 = ASN1_INTEGER_new();
      *(ASN1_INTEGER **)(pAVar9 + 0x10) = pAVar7;
      if (pAVar7 == (ASN1_INTEGER *)0x0) {
        ERR_new();
        uVar14 = 0x107;
        goto LAB_00a24854;
      }
      iVar2 = ASN1_INTEGER_set(pAVar7,(ulong)local_64);
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0x10b,"ec_asn1_group2fieldid");
        uVar14 = 0x8000d;
        goto LAB_00a248bc;
      }
      pBVar6 = (BIGNUM *)0x0;
    }
    else {
      pAVar11 = ASN1_NULL_new();
      pBVar6 = (BIGNUM *)0x0;
      *(ASN1_NULL **)(pAVar9 + 0x10) = pAVar11;
      if (pAVar11 == (ASN1_NULL *)0x0) {
        ERR_new();
        uVar14 = 0x123;
LAB_00a24854:
        ERR_set_debug("crypto/ec/ec_asn1.c",uVar14,"ec_asn1_group2fieldid");
        uVar14 = 0xc0100;
        goto LAB_00a248bc;
      }
    }
LAB_00a245c4:
    BN_free(pBVar6);
    plVar18 = *(long **)(val + 0x10);
    if (((plVar18 == (long *)0x0) || (*plVar18 == 0)) || (plVar18[1] == 0)) {
LAB_00a24be4:
      ERR_new();
      uVar14 = 0x19d;
      goto LAB_00a248e8;
    }
    pBVar6 = BN_new();
    if ((pBVar6 == (BIGNUM *)0x0) || (a = BN_new(), a == (BIGNUM *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x140,"ec_asn1_group2curve");
      ERR_set_error(0x10,0xc0100,0);
      CRYPTO_free((void *)0x0);
      CRYPTO_free((void *)0x0);
      BN_free(pBVar6);
      a = (BIGNUM *)0x0;
LAB_00a24be0:
      BN_free(a);
      goto LAB_00a24be4;
    }
    iVar2 = EC_GROUP_get_curve(param_1,0,pBVar6,a,0);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x146,"ec_asn1_group2curve");
      ERR_set_error(0x10,0x80010,0);
      ptr = (void *)0x0;
LAB_00a24b20:
      CRYPTO_free(ptr);
      data = (void *)0x0;
LAB_00a24bcc:
      CRYPTO_free(data);
      BN_free(pBVar6);
      goto LAB_00a24be0;
    }
    iVar2 = EC_GROUP_get_degree(param_1);
    uVar17 = (long)iVar2 + 7U >> 3;
    iVar2 = (int)uVar17;
    ptr = CRYPTO_malloc(iVar2,"crypto/ec/ec_asn1.c",0x150);
    if ((ptr == (void *)0x0) ||
       (data = CRYPTO_malloc(iVar2,"crypto/ec/ec_asn1.c",0x151), data == (void *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x152,"ec_asn1_group2curve");
      ERR_set_error(0x10,0xc0100,0);
      goto LAB_00a24b20;
    }
    iVar3 = BN_bn2binpad(pBVar6,ptr,uVar17 & 0xffffffff);
    if ((iVar3 < 0) || (iVar3 = BN_bn2binpad(a,data,uVar17 & 0xffffffff), iVar3 < 0)) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x157,"ec_asn1_group2curve");
      uVar1 = 0x80003;
LAB_00a24bac:
      ERR_set_error(0x10,uVar1,0);
      CRYPTO_free(ptr);
      goto LAB_00a24bcc;
    }
    iVar3 = ASN1_OCTET_STRING_set((ASN1_STRING *)*plVar18,ptr,iVar2);
    if ((iVar3 == 0) ||
       (iVar2 = ASN1_OCTET_STRING_set((ASN1_STRING *)plVar18[1],data,iVar2), iVar2 == 0)) {
      ERR_new();
      uVar14 = 0x15e;
LAB_00a24b9c:
      ERR_set_debug("crypto/ec/ec_asn1.c",uVar14,"ec_asn1_group2curve");
      uVar1 = 0x8000d;
      goto LAB_00a24bac;
    }
    data_00 = *(void **)(param_1 + 0x30);
    pAVar8 = (ASN1_STRING *)plVar18[2];
    if (data_00 == (void *)0x0) {
      ASN1_BIT_STRING_free(pAVar8);
      plVar18[2] = 0;
    }
    else {
      if (pAVar8 == (ASN1_STRING *)0x0) {
        pAVar8 = ASN1_BIT_STRING_new();
        plVar18[2] = (long)pAVar8;
        if (pAVar8 == (ASN1_BIT_STRING *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ec_asn1.c",0x166,"ec_asn1_group2curve");
          uVar1 = 0xc0100;
          goto LAB_00a24bac;
        }
        data_00 = *(void **)(param_1 + 0x30);
      }
      pAVar8->flags = pAVar8->flags & 0xfffffffffffffff0U | 8;
      iVar2 = ASN1_BIT_STRING_set(pAVar8,data_00,*(int *)(param_1 + 0x38));
      if (iVar2 == 0) {
        ERR_new();
        uVar14 = 0x16d;
        goto LAB_00a24b9c;
      }
    }
    CRYPTO_free(ptr);
    CRYPTO_free(data);
    BN_free(pBVar6);
    BN_free(a);
    pEVar12 = EC_GROUP_get0_generator(param_1);
    if (pEVar12 != (EC_POINT *)0x0) {
      pVar4 = EC_GROUP_get_point_conversion_form(param_1);
      lVar13 = EC_POINT_point2buf(param_1,pEVar12,pVar4,&local_78,0);
      if (lVar13 == 0) {
        ERR_new();
        uVar14 = 0x1ab;
      }
      else {
        pAVar8 = *(ASN1_STRING **)(val + 0x18);
        if (pAVar8 == (ASN1_STRING *)0x0) {
          pAVar8 = ASN1_OCTET_STRING_new();
          *(ASN1_STRING **)(val + 0x18) = pAVar8;
          if (pAVar8 == (ASN1_OCTET_STRING *)0x0) {
            CRYPTO_free(local_78);
            ERR_new();
            ERR_set_debug("crypto/ec/ec_asn1.c",0x1b0,"EC_GROUP_get_ecparameters");
            uVar14 = 0xc0100;
            goto LAB_00a248f8;
          }
        }
        ASN1_STRING_set0(pAVar8,local_78,(int)lVar13);
        pBVar6 = (BIGNUM *)EC_GROUP_get0_order(param_1);
        if (pBVar6 != (BIGNUM *)0x0) {
          pAVar15 = *(ASN1_INTEGER **)(val + 0x20);
          pAVar7 = BN_to_ASN1_INTEGER(pBVar6,pAVar15);
          *(ASN1_INTEGER **)(val + 0x20) = pAVar7;
          if (pAVar7 == (ASN1_INTEGER *)0x0) {
            *(ASN1_INTEGER **)(val + 0x20) = pAVar15;
            ERR_new();
            uVar14 = 0x1be;
          }
          else {
            pBVar6 = (BIGNUM *)EC_GROUP_get0_cofactor(param_1);
            if (pBVar6 == (BIGNUM *)0x0) {
              return val;
            }
            pAVar15 = *(ASN1_INTEGER **)(val + 0x28);
            pAVar7 = BN_to_ASN1_INTEGER(pBVar6,pAVar15);
            *(ASN1_INTEGER **)(val + 0x28) = pAVar7;
            if (pAVar7 != (ASN1_INTEGER *)0x0) {
              return val;
            }
            *(ASN1_INTEGER **)(val + 0x28) = pAVar15;
            ERR_new();
            uVar14 = 0x1c8;
          }
          ERR_set_debug("crypto/ec/ec_asn1.c",uVar14,"EC_GROUP_get_ecparameters");
          uVar14 = 0x8000d;
          goto LAB_00a248f8;
        }
        ERR_new();
        uVar14 = 0x1b8;
      }
      goto LAB_00a248e8;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_asn1.c",0x1a3,"EC_GROUP_get_ecparameters");
    uVar14 = 0x71;
  }
LAB_00a248f8:
  ERR_set_error(0x10,uVar14,0);
  if (param_2 != (ASN1_VALUE *)0x0) {
    return (ASN1_VALUE *)0x0;
  }
LAB_00a24908:
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5acc0);
  return (ASN1_VALUE *)0x0;
}

