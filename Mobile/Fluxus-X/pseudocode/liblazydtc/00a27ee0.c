/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a27ee0
 */

EC_GROUP * EC_GROUP_new_by_curve_name_ex(undefined8 param_1,undefined8 param_2,int param_3)

{
  uchar *s;
  int iVar1;
  int iVar2;
  int iVar3;
  BN_CTX *ctx;
  BIGNUM *p;
  BIGNUM *a;
  BIGNUM *b;
  EC_GROUP *group;
  char *pcVar4;
  size_t sVar5;
  ASN1_OBJECT *a_00;
  undefined8 uVar6;
  ulong uVar7;
  undefined **ppuVar8;
  int *piVar9;
  long lVar10;
  BIGNUM *a_01;
  EC_POINT *generator;
  BIGNUM *a_02;
  BIGNUM *order;
  
  if (0 < param_3) {
    uVar7 = 0;
    ppuVar8 = &PTR_DAT_00c5b440;
    do {
      if (*(int *)(ppuVar8 + -1) == param_3) {
        piVar9 = (int *)*ppuVar8;
        ctx = (BN_CTX *)BN_CTX_new_ex();
        if (ctx == (BN_CTX *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ec_curve.c",0xc52,"ec_group_new_from_data");
          ERR_set_error(0x10,0xc0100,0);
          a = (BIGNUM *)0x0;
          p = (BIGNUM *)0x0;
LAB_00a28084:
          order = (BIGNUM *)0x0;
          a_02 = (BIGNUM *)0x0;
          a_01 = (BIGNUM *)0x0;
          b = (BIGNUM *)0x0;
          generator = (EC_POINT *)0x0;
          group = (EC_GROUP *)0x0;
LAB_00a2808c:
          EC_GROUP_free(group);
          group = (EC_GROUP *)0x0;
        }
        else {
          iVar3 = piVar9[1];
          iVar2 = piVar9[2];
          s = (uchar *)((long)(piVar9 + 4) + (long)iVar3);
          p = BN_bin2bn(s,iVar2,(BIGNUM *)0x0);
          if (p == (BIGNUM *)0x0) {
LAB_00a27fec:
            a = (BIGNUM *)0x0;
LAB_00a27ff0:
            ERR_new();
            ERR_set_debug("crypto/ec/ec_curve.c",0xc5f,"ec_group_new_from_data");
            ERR_set_error(0x10,0x80003,0);
            goto LAB_00a28084;
          }
          lVar10 = (long)iVar2;
          a = BN_bin2bn(s + lVar10,iVar2,(BIGNUM *)0x0);
          if (a == (BIGNUM *)0x0) goto LAB_00a27fec;
          b = BN_bin2bn(s + lVar10 * 2,iVar2,(BIGNUM *)0x0);
          if (b == (BIGNUM *)0x0) goto LAB_00a27ff0;
          if (*piVar9 == 0x196) {
            group = EC_GROUP_new_curve_GFp(p,a,b,ctx);
            if (group != (EC_GROUP *)0x0) goto LAB_00a28160;
            ERR_new();
            uVar6 = 0xc6c;
LAB_00a28308:
            ERR_set_debug("crypto/ec/ec_curve.c",uVar6,"ec_group_new_from_data");
            ERR_set_error(0x10,0x80010,0);
            a_01 = (BIGNUM *)0x0;
            a_02 = (BIGNUM *)0x0;
            order = (BIGNUM *)0x0;
            generator = (EC_POINT *)0x0;
            goto LAB_00a2808c;
          }
          group = (EC_GROUP *)EC_GROUP_new_curve_GF2m(p,a,b,ctx);
          if (group == (EC_GROUP *)0x0) {
            ERR_new();
            uVar6 = 0xc75;
            goto LAB_00a28308;
          }
LAB_00a28160:
          EC_GROUP_set_curve_name(group,param_3);
          generator = EC_POINT_new(group);
          if (generator == (EC_POINT *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_curve.c",0xc7e,"ec_group_new_from_data");
            ERR_set_error(0x10,0x80010,0);
            a_01 = (BIGNUM *)0x0;
LAB_00a282e4:
            a_02 = (BIGNUM *)0x0;
LAB_00a282e8:
            order = (BIGNUM *)0x0;
            goto LAB_00a2808c;
          }
          a_01 = BN_bin2bn(s + lVar10 * 3,iVar2,(BIGNUM *)0x0);
          if ((a_01 == (BIGNUM *)0x0) ||
             (a_02 = BN_bin2bn(s + lVar10 * 4,iVar2,(BIGNUM *)0x0), a_02 == (BIGNUM *)0x0)) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_curve.c",0xc84,"ec_group_new_from_data");
            ERR_set_error(0x10,0x80003,0);
            goto LAB_00a282e4;
          }
          iVar1 = EC_POINT_set_affine_coordinates(group,generator,a_01,a_02,ctx);
          if (iVar1 == 0) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_curve.c",0xc88,"ec_group_new_from_data");
            ERR_set_error(0x10,0x80010,0);
            goto LAB_00a282e8;
          }
          order = BN_bin2bn(s + iVar2 * 5,iVar2,(BIGNUM *)0x0);
          if ((order == (BIGNUM *)0x0) ||
             (iVar2 = BN_set_word(a_01,(ulong)(uint)piVar9[3]), iVar2 == 0)) {
            ERR_new();
            ERR_set_debug("crypto/ec/ec_curve.c",0xc8d,"ec_group_new_from_data");
            ERR_set_error(0x10,0x80003,0);
            goto LAB_00a2808c;
          }
          iVar2 = EC_GROUP_set_generator(group,generator,order,a_01);
          if (iVar2 == 0) {
            ERR_new();
            uVar6 = 0xc91;
LAB_00a283ec:
            ERR_set_debug("crypto/ec/ec_curve.c",uVar6,"ec_group_new_from_data");
            ERR_set_error(0x10,0x80010,0);
            goto LAB_00a2808c;
          }
          if ((iVar3 != 0) &&
             (sVar5 = EC_GROUP_set_seed(group,(uchar *)(piVar9 + 4),(long)iVar3), sVar5 == 0)) {
            ERR_new();
            uVar6 = 0xc96;
            goto LAB_00a283ec;
          }
          iVar3 = EC_GROUP_get_asn1_flag(group);
          if (iVar3 == 1) {
            a_00 = OBJ_nid2obj(param_3);
            if (a_00 == (ASN1_OBJECT *)0x0) {
              ERR_new();
              ERR_set_debug("crypto/ec/ec_curve.c",0xcac,"ec_group_new_from_data");
              ERR_set_error(0x10,0x80008,0);
              goto LAB_00a2808c;
            }
            lVar10 = OBJ_length();
            if (lVar10 == 0) {
              EC_GROUP_set_asn1_flag(group,0);
            }
            ASN1_OBJECT_free(a_00);
          }
        }
        EC_POINT_free(generator);
        BN_CTX_free(ctx);
        BN_free(p);
        BN_free(a);
        BN_free(b);
        BN_free(order);
        BN_free(a_01);
        BN_free(a_02);
        if (group != (EC_GROUP *)0x0) {
          return group;
        }
        break;
      }
      uVar7 = uVar7 + 1;
      ppuVar8 = ppuVar8 + 4;
    } while (uVar7 < 0x52);
  }
  ERR_new();
  ERR_set_debug("crypto/ec/ec_curve.c",0xcd9,"EC_GROUP_new_by_curve_name_ex");
  pcVar4 = OBJ_nid2sn(param_3);
  ERR_set_error(0x10,0x81,"name=%s",pcVar4);
  return (EC_GROUP *)0x0;
}

