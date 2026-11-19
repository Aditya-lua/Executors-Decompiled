/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a24f44
 */

EC_GROUP * EC_GROUP_new_from_ecparameters(long param_1)

{
  int iVar1;
  int iVar2;
  BIGNUM *a;
  BIGNUM *b;
  ASN1_INTEGER *ai;
  long lVar3;
  void *__dest;
  BIGNUM *pBVar4;
  EC_GROUP *group;
  size_t sVar5;
  EC_GROUP *group_00;
  undefined4 uVar6;
  undefined8 uVar7;
  long *plVar8;
  int *piVar9;
  undefined8 *puVar10;
  BIGNUM *a_00;
  EC_GROUP *group_01;
  int *piVar11;
  EC_POINT *p;
  BN_CTX *c;
  
  plVar8 = *(long **)(param_1 + 8);
  if (((plVar8 == (long *)0x0) || (*plVar8 == 0)) || (plVar8[1] == 0)) {
    ERR_new();
    uVar7 = 0x217;
LAB_00a25064:
    ERR_set_debug("crypto/ec/ec_asn1.c",uVar7,"EC_GROUP_new_from_ecparameters");
    ERR_set_error(0x10,0x73,0);
    a = (BIGNUM *)0x0;
LAB_00a25088:
    group_01 = (EC_GROUP *)0x0;
    a_00 = (BIGNUM *)0x0;
    b = (BIGNUM *)0x0;
LAB_00a2508c:
    p = (EC_POINT *)0x0;
LAB_00a25090:
    group = (EC_GROUP *)0x0;
    c = (BN_CTX *)0x0;
  }
  else {
    puVar10 = *(undefined8 **)(param_1 + 0x10);
    if (((puVar10 == (undefined8 *)0x0) || (piVar9 = (int *)*puVar10, piVar9 == (int *)0x0)) ||
       ((*(uchar **)(piVar9 + 2) == (uchar *)0x0 ||
        ((puVar10[1] == 0 || (*(long *)(puVar10[1] + 8) == 0)))))) {
      ERR_new();
      uVar7 = 0x224;
      goto LAB_00a25064;
    }
    a = BN_bin2bn(*(uchar **)(piVar9 + 2),*piVar9,(BIGNUM *)0x0);
    if (a == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x229,"EC_GROUP_new_from_ecparameters");
      ERR_set_error(0x10,0x80003,0);
      goto LAB_00a25088;
    }
    piVar9 = *(int **)(*(long *)(param_1 + 0x10) + 8);
    b = BN_bin2bn(*(uchar **)(piVar9 + 2),*piVar9,(BIGNUM *)0x0);
    if (b == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x22e,"EC_GROUP_new_from_ecparameters");
      uVar7 = 0x80003;
      goto LAB_00a252d0;
    }
    iVar1 = OBJ_obj2nid((ASN1_OBJECT *)**(undefined8 **)(param_1 + 8));
    if (iVar1 != 0x196) {
      if (iVar1 == 0x197) {
        piVar9 = *(int **)(*(long *)(param_1 + 8) + 8);
        iVar1 = *piVar9;
        if (iVar1 < 0x296) {
          a_00 = BN_new();
          if (a_00 == (BIGNUM *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_asn1.c",0x247,"EC_GROUP_new_from_ecparameters");
            uVar7 = 0xc0100;
            goto LAB_00a254bc;
          }
          iVar2 = OBJ_obj2nid(*(ASN1_OBJECT **)(piVar9 + 2));
          if (iVar2 != 0x2ab) {
            if (iVar2 == 0x2aa) {
              if (*(ASN1_INTEGER **)(piVar9 + 4) == (ASN1_INTEGER *)0x0) {
                ERR_new();
                uVar7 = 0x252;
                goto LAB_00a2546c;
              }
              lVar3 = ASN1_INTEGER_get(*(ASN1_INTEGER **)(piVar9 + 4));
              if ((0 < lVar3) && (lVar3 < *piVar9)) {
                iVar2 = BN_set_bit(a_00,*piVar9);
                if (iVar2 != 0) {
                  iVar2 = BN_set_bit(a_00,(int)lVar3);
                  goto joined_r0x00a25250;
                }
                goto LAB_00a254c4;
              }
              ERR_new();
              ERR_set_debug("crypto/ec/ec_asn1.c",0x259,"EC_GROUP_new_from_ecparameters");
              uVar7 = 0x89;
            }
            else {
              ERR_new();
              if (iVar2 == 0x2a9) {
                ERR_set_debug("crypto/ec/ec_asn1.c",0x280,"EC_GROUP_new_from_ecparameters");
                uVar7 = 0x7e;
              }
              else {
                uVar7 = 0x284;
LAB_00a2546c:
                ERR_set_debug("crypto/ec/ec_asn1.c",uVar7,"EC_GROUP_new_from_ecparameters");
                uVar7 = 0x73;
              }
            }
            goto LAB_00a254bc;
          }
          piVar11 = *(int **)(piVar9 + 4);
          if (piVar11 == (int *)0x0) {
            ERR_new();
            uVar7 = 0x269;
            group_01 = (EC_GROUP *)0x0;
LAB_00a2564c:
            ERR_set_debug("crypto/ec/ec_asn1.c",uVar7,"EC_GROUP_new_from_ecparameters");
            uVar7 = 0x73;
            goto LAB_00a25658;
          }
          if ((((*piVar9 <= piVar11[2]) || (piVar11[2] <= piVar11[1])) || (piVar11[1] <= *piVar11))
             || (*piVar11 < 1)) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_asn1.c",0x270,"EC_GROUP_new_from_ecparameters");
            uVar7 = 0x84;
            goto LAB_00a254bc;
          }
          iVar2 = BN_set_bit(a_00,*piVar9);
          if (((iVar2 != 0) && (iVar2 = BN_set_bit(a_00,*piVar11), iVar2 != 0)) &&
             (iVar2 = BN_set_bit(a_00,piVar11[1]), iVar2 != 0)) {
            iVar2 = BN_set_bit(a_00,piVar11[2]);
joined_r0x00a25250:
            if ((iVar2 != 0) && (iVar2 = BN_set_bit(a_00,0), iVar2 != 0)) {
              group_01 = (EC_GROUP *)EC_GROUP_new_curve_GF2m(a_00,a,b,0);
              goto joined_r0x00a2527c;
            }
          }
          goto LAB_00a254c4;
        }
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0x242,"EC_GROUP_new_from_ecparameters");
        uVar7 = 0x8f;
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0x2a7,"EC_GROUP_new_from_ecparameters");
        uVar7 = 0x67;
      }
LAB_00a252d0:
      ERR_set_error(0x10,uVar7,0);
      group_01 = (EC_GROUP *)0x0;
      a_00 = (BIGNUM *)0x0;
      goto LAB_00a2508c;
    }
    ai = *(ASN1_INTEGER **)(*(long *)(param_1 + 8) + 8);
    if (ai == (ASN1_INTEGER *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x290,"EC_GROUP_new_from_ecparameters");
      uVar7 = 0x73;
      goto LAB_00a252d0;
    }
    a_00 = ASN1_INTEGER_to_BN(ai,(BIGNUM *)0x0);
    if (a_00 == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x295,"EC_GROUP_new_from_ecparameters");
      uVar7 = 0x8000d;
LAB_00a254bc:
      ERR_set_error(0x10,uVar7,0);
LAB_00a254c4:
      group_01 = (EC_GROUP *)0x0;
      goto LAB_00a2508c;
    }
    iVar1 = BN_is_negative(a_00);
    if ((iVar1 != 0) || (iVar1 = BN_is_zero(a_00), iVar1 != 0)) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x29a,"EC_GROUP_new_from_ecparameters");
      uVar7 = 0x67;
      goto LAB_00a254bc;
    }
    iVar1 = BN_num_bits(a_00);
    if (0x295 < iVar1) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x2a0,"EC_GROUP_new_from_ecparameters");
      uVar7 = 0x8f;
      goto LAB_00a254bc;
    }
    group_01 = EC_GROUP_new_curve_GFp(a_00,a,b,(BN_CTX *)0x0);
joined_r0x00a2527c:
    if (group_01 == (EC_GROUP *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x2ac,"EC_GROUP_new_from_ecparameters");
      uVar7 = 0x80010;
LAB_00a25658:
      ERR_set_error(0x10,uVar7,0);
      goto LAB_00a2508c;
    }
    piVar9 = *(int **)(*(long *)(param_1 + 0x10) + 0x10);
    if (piVar9 != (int *)0x0) {
      if (*piVar9 == 0) {
        ERR_new();
        uVar7 = 0x2b9;
        goto LAB_00a2564c;
      }
      CRYPTO_free(*(void **)(group_01 + 0x30));
      __dest = CRYPTO_malloc(**(int **)(*(long *)(param_1 + 0x10) + 0x10),"crypto/ec/ec_asn1.c",
                             0x2bd);
      *(void **)(group_01 + 0x30) = __dest;
      if (__dest == (void *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_asn1.c",0x2be,"EC_GROUP_new_from_ecparameters");
        uVar7 = 0xc0100;
        goto LAB_00a25658;
      }
      piVar9 = *(int **)(*(long *)(param_1 + 0x10) + 0x10);
      memcpy(__dest,*(void **)(piVar9 + 2),(long)*piVar9);
      *(long *)(group_01 + 0x38) = (long)**(int **)(*(long *)(param_1 + 0x10) + 0x10);
    }
    if ((((*(long *)(param_1 + 0x20) == 0) ||
         (piVar9 = *(int **)(param_1 + 0x18), piVar9 == (int *)0x0)) || (*(long *)(piVar9 + 2) == 0)
        ) || (*piVar9 == 0)) {
      ERR_new();
      uVar7 = 0x2ca;
      goto LAB_00a2564c;
    }
    p = EC_POINT_new(group_01);
    if (p == (EC_POINT *)0x0) goto LAB_00a25090;
    EC_GROUP_set_point_conversion_form(group_01,**(byte **)(*(long *)(param_1 + 0x18) + 8) & 0xfe);
    iVar2 = EC_POINT_oct2point(group_01,p,*(uchar **)(*(int **)(param_1 + 0x18) + 2),
                               (long)**(int **)(param_1 + 0x18),(BN_CTX *)0x0);
    if (iVar2 == 0) {
      ERR_new();
      uVar7 = 0x2d8;
LAB_00a256ac:
      ERR_set_debug("crypto/ec/ec_asn1.c",uVar7,"EC_GROUP_new_from_ecparameters");
      uVar6 = 0x80010;
LAB_00a256ec:
      ERR_set_error(0x10,uVar6,0);
      goto LAB_00a25090;
    }
    pBVar4 = ASN1_INTEGER_to_BN(*(ASN1_INTEGER **)(param_1 + 0x20),a);
    if (pBVar4 == (BIGNUM *)0x0) {
      ERR_new();
      uVar7 = 0x2de;
LAB_00a256d8:
      ERR_set_debug("crypto/ec/ec_asn1.c",uVar7,"EC_GROUP_new_from_ecparameters");
      uVar6 = 0x8000d;
      goto LAB_00a256ec;
    }
    iVar2 = BN_is_negative(a);
    if ((iVar2 != 0) || (iVar2 = BN_is_zero(a), iVar2 != 0)) {
      ERR_new();
      uVar7 = 0x2e2;
LAB_00a25608:
      ERR_set_debug("crypto/ec/ec_asn1.c",uVar7,"EC_GROUP_new_from_ecparameters");
      uVar6 = 0x7a;
      goto LAB_00a256ec;
    }
    iVar2 = BN_num_bits(a);
    if (iVar1 + 1 < iVar2) {
      ERR_new();
      uVar7 = 0x2e6;
      goto LAB_00a25608;
    }
    if (*(ASN1_INTEGER **)(param_1 + 0x28) == (ASN1_INTEGER *)0x0) {
      BN_free(b);
      b = (BIGNUM *)0x0;
    }
    else {
      pBVar4 = ASN1_INTEGER_to_BN(*(ASN1_INTEGER **)(param_1 + 0x28),b);
      if (pBVar4 == (BIGNUM *)0x0) {
        ERR_new();
        uVar7 = 0x2ef;
        goto LAB_00a256d8;
      }
    }
    iVar1 = EC_GROUP_set_generator(group_01,p,a,b);
    if (iVar1 == 0) {
      ERR_new();
      uVar7 = 0x2f4;
      goto LAB_00a256ac;
    }
    c = BN_CTX_new();
    if (c == (BN_CTX *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x305,"EC_GROUP_new_from_ecparameters");
      uVar6 = 0x80003;
      goto LAB_00a256ec;
    }
    group = EC_GROUP_dup(group_01);
    if (((group == (EC_GROUP *)0x0) || (sVar5 = EC_GROUP_set_seed(group,(uchar *)0x0,0), sVar5 != 1)
        ) || (iVar1 = EC_GROUP_set_generator(group,p,a,(BIGNUM *)0x0), iVar1 == 0)) {
      ERR_new();
      uVar7 = 0x30b;
LAB_00a2585c:
      ERR_set_debug("crypto/ec/ec_asn1.c",uVar7,"EC_GROUP_new_from_ecparameters");
      ERR_set_error(0x10,0x80010,0);
    }
    else {
      iVar1 = ossl_ec_curve_nid_from_params(group,c);
      if (iVar1 == 0) {
LAB_00a258ac:
        group_00 = group_01;
        goto LAB_00a250a0;
      }
      group_00 = EC_GROUP_new_by_curve_name(iVar1);
      if (group_00 == (EC_GROUP *)0x0) {
        ERR_new();
        uVar7 = 0x324;
        goto LAB_00a2585c;
      }
      EC_GROUP_free(group_01);
      EC_GROUP_set_asn1_flag(group_00,0);
      group_01 = group_00;
      if (*(long *)(*(long *)(param_1 + 0x10) + 0x10) != 0) goto LAB_00a258ac;
      sVar5 = EC_GROUP_set_seed(group_00,(uchar *)0x0,0);
      if (sVar5 == 1) goto LAB_00a250a0;
    }
  }
  EC_GROUP_free(group_01);
  group_00 = (EC_GROUP *)0x0;
LAB_00a250a0:
  EC_GROUP_free(group);
  BN_free(a_00);
  BN_free(a);
  BN_free(b);
  EC_POINT_free(p);
  BN_CTX_free(c);
  return group_00;
}

