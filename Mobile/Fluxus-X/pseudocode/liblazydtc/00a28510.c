/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a28510
 */

int ossl_ec_curve_nid_from_params(EC_GROUP *param_1,BN_CTX *param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  size_t __n;
  uchar *__s2;
  undefined8 uVar7;
  void *__s1;
  BIGNUM *pBVar8;
  BIGNUM *pBVar9;
  BIGNUM *pBVar10;
  BIGNUM *pBVar11;
  BIGNUM *pBVar12;
  BIGNUM *order;
  EC_POINT *pEVar13;
  int *piVar14;
  ulong uVar15;
  long lVar16;
  undefined **ppuVar17;
  
  iVar1 = EC_GROUP_get_curve_name(param_1);
  iVar2 = EC_GROUP_get_field_type(param_1);
  __n = EC_GROUP_get_seed_len(param_1);
  __s2 = EC_GROUP_get0_seed(param_1);
  uVar7 = EC_GROUP_get0_cofactor(param_1);
  BN_CTX_start(param_2);
  iVar3 = BN_num_bits(*(BIGNUM **)(param_1 + 0x10));
  iVar5 = iVar3 + 0xe;
  if (-1 < iVar3 + 7) {
    iVar5 = iVar3 + 7;
  }
  iVar4 = BN_num_bits(*(BIGNUM **)(param_1 + 0x40));
  iVar3 = iVar4 + 0xe;
  if (-1 < iVar4 + 7) {
    iVar3 = iVar4 + 7;
  }
  iVar4 = iVar3 >> 3;
  if (iVar3 >> 3 <= iVar5 >> 3) {
    iVar4 = iVar5 >> 3;
  }
  __s1 = CRYPTO_malloc(iVar4 * 6,"crypto/ec/ec_curve.c",0xd30);
  if (((((((__s1 != (void *)0x0) && (pBVar8 = BN_CTX_get(param_2), pBVar8 != (BIGNUM *)0x0)) &&
         (pBVar9 = BN_CTX_get(param_2), pBVar9 != (BIGNUM *)0x0)) &&
        ((pBVar10 = BN_CTX_get(param_2), pBVar10 != (BIGNUM *)0x0 &&
         (pBVar11 = BN_CTX_get(param_2), pBVar11 != (BIGNUM *)0x0)))) &&
       ((pBVar12 = BN_CTX_get(param_2), pBVar12 != (BIGNUM *)0x0 &&
        ((order = BN_CTX_get(param_2), order != (BIGNUM *)0x0 &&
         (iVar5 = EC_GROUP_get_curve(param_1,pBVar8,pBVar9,pBVar10,param_2), iVar5 != 0)))))) &&
      (pEVar13 = EC_GROUP_get0_generator(param_1), pEVar13 != (EC_POINT *)0x0)) &&
     (((iVar5 = EC_POINT_get_affine_coordinates(param_1,pEVar13,pBVar11,pBVar12,param_2), iVar5 != 0
       && (iVar5 = EC_GROUP_get_order(param_1,order,param_2), iVar5 != 0)) &&
      (iVar5 = BN_bn2binpad(pBVar8,__s1,iVar4), 0 < iVar5)))) {
    lVar16 = (long)iVar4;
    iVar5 = BN_bn2binpad(pBVar9,(long)__s1 + lVar16,iVar4);
    if (((0 < iVar5) &&
        (iVar5 = BN_bn2binpad(pBVar10,(void *)((long)__s1 + lVar16 * 2),iVar4), 0 < iVar5)) &&
       ((iVar5 = BN_bn2binpad(pBVar11,(void *)((long)__s1 + lVar16 * 3),iVar4), 0 < iVar5 &&
        ((iVar5 = BN_bn2binpad(pBVar12,(void *)((long)__s1 + lVar16 * 4),iVar4), 0 < iVar5 &&
         (iVar5 = BN_bn2binpad(order,(void *)((long)__s1 + lVar16 * 5),iVar4), 0 < iVar5)))))) {
      uVar15 = 0;
      ppuVar17 = &PTR_DAT_00c5b440;
      do {
        piVar14 = (int *)*ppuVar17;
        if (*piVar14 == iVar2) {
          iVar5 = *(int *)(ppuVar17 + -1);
          if ((iVar4 == piVar14[2]) && (iVar1 < 1 || iVar1 == iVar5)) {
            iVar3 = piVar14[1];
            iVar6 = BN_is_zero(uVar7);
            if ((((iVar6 != 0) || (iVar6 = BN_is_word(uVar7,piVar14[3]), iVar6 != 0)) &&
                (((__n == 0 || (piVar14[1] == 0)) ||
                 ((__n == (long)piVar14[1] && (iVar6 = memcmp(piVar14 + 4,__s2,__n), iVar6 == 0)))))
                ) && (iVar3 = memcmp(__s1,(void *)((long)(piVar14 + 4) + (long)iVar3),
                                     (long)(iVar4 * 6)), iVar3 == 0)) break;
          }
        }
        uVar15 = uVar15 + 1;
        iVar5 = 0;
        ppuVar17 = ppuVar17 + 4;
      } while (uVar15 < 0x52);
      goto LAB_00a28824;
    }
  }
  iVar5 = -1;
LAB_00a28824:
  CRYPTO_free(__s1);
  BN_CTX_end(param_2);
  return iVar5;
}

