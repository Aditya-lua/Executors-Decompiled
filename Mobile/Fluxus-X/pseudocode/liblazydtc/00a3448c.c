/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3448c
 */

undefined8 ossl_ec_wNAF_precompute_mult(EC_GROUP *param_1,BN_CTX *param_2)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  undefined8 *puVar7;
  long lVar8;
  EC_POINT *pEVar9;
  BIGNUM *a;
  long *ptr;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  EC_POINT *r;
  EC_POINT *dst;
  undefined8 uVar13;
  BN_CTX *c;
  ulong uVar14;
  undefined8 *ptr_00;
  ulong uVar15;
  ulong uVar16;
  
  EC_pre_comp_free();
  if (param_1 == (EC_GROUP *)0x0) {
    return 0;
  }
  puVar7 = (undefined8 *)CRYPTO_zalloc(0x40,"crypto/ec/ec_mult.c",0x3a);
  if (puVar7 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_mult.c",0x3c,"ec_pre_comp_new");
    ERR_set_error(0x10,0xc0100,0);
    return 0;
  }
  *puVar7 = param_1;
  puVar7[1] = 8;
  puVar7[3] = 4;
  *(undefined4 *)(puVar7 + 6) = 1;
  lVar8 = CRYPTO_THREAD_lock_new();
  puVar7[7] = lVar8;
  if (lVar8 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_mult.c",0x47,"ec_pre_comp_new");
    ERR_set_error(0x10,0xc0100,0);
    CRYPTO_free(puVar7);
    return 0;
  }
  pEVar9 = EC_GROUP_get0_generator(param_1);
  if (pEVar9 == (EC_POINT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_mult.c",0x353,"ossl_ec_wNAF_precompute_mult");
    ERR_set_error(0x10,0x71,0);
LAB_00a34640:
    BN_CTX_free((BN_CTX *)0x0);
    dst = (EC_POINT *)0x0;
    r = (EC_POINT *)0x0;
    ptr_00 = (undefined8 *)0x0;
    uVar13 = 0;
  }
  else {
    c = (BN_CTX *)0x0;
    if (param_2 == (BN_CTX *)0x0) {
      param_2 = BN_CTX_new();
      c = param_2;
      if (param_2 == (BN_CTX *)0x0) goto LAB_00a34640;
    }
    BN_CTX_start(param_2);
    a = (BIGNUM *)EC_GROUP_get0_order(param_1);
    if (a == (BIGNUM *)0x0) {
LAB_00a34574:
      dst = (EC_POINT *)0x0;
      r = (EC_POINT *)0x0;
      ptr_00 = (undefined8 *)0x0;
      uVar13 = 0;
    }
    else {
      iVar5 = BN_is_zero();
      if (iVar5 != 0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_mult.c",0x365,"ossl_ec_wNAF_precompute_mult");
        ERR_set_error(0x10,0x72,0);
        goto LAB_00a34574;
      }
      uVar6 = BN_num_bits(a);
      lVar8 = 5;
      if (1999 < uVar6) {
        lVar8 = 6;
      }
      if (uVar6 < 800) {
        lVar8 = 4;
      }
      uVar10 = (long)(int)uVar6 + 7U >> 3;
      uVar16 = lVar8 - 1;
      uVar14 = uVar10 << (uVar16 & 0x3f);
      ptr_00 = CRYPTO_malloc((int)uVar14 * 8 + 8,"crypto/ec/ec_mult.c",0x37f);
      if (ptr_00 == (undefined8 *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ec_mult.c",0x381,"ossl_ec_wNAF_precompute_mult");
        ERR_set_error(0x10,0xc0100,0);
        dst = (EC_POINT *)0x0;
        r = (EC_POINT *)0x0;
LAB_00a34970:
        uVar13 = 0;
      }
      else {
        ptr_00[uVar14] = 0;
        r = EC_POINT_new(param_1);
        if (uVar14 != 0) {
          uVar11 = 0;
          do {
            ptr_00[uVar11] = r;
            if (r == (EC_POINT *)0x0) {
              ERR_new();
              uVar13 = 0x389;
              r = (EC_POINT *)0x0;
              goto LAB_00a3494c;
            }
            uVar11 = uVar11 + 1;
            r = EC_POINT_new(param_1);
          } while (uVar11 < uVar14);
        }
        if ((r == (EC_POINT *)0x0) || (dst = EC_POINT_new(param_1), dst == (EC_POINT *)0x0)) {
          ERR_new();
          uVar13 = 0x390;
LAB_00a3494c:
          ERR_set_debug("crypto/ec/ec_mult.c",uVar13,"ossl_ec_wNAF_precompute_mult");
          ERR_set_error(0x10,0xc0100,0);
          dst = (EC_POINT *)0x0;
          goto LAB_00a34970;
        }
        iVar5 = EC_POINT_copy(dst,pEVar9);
        if (iVar5 == 0) goto LAB_00a34970;
        if (uVar10 != 0) {
          uVar11 = 0;
          puVar12 = ptr_00;
          do {
            iVar5 = EC_POINT_dbl(param_1,r,dst,param_2);
            if ((iVar5 == 0) || (iVar5 = EC_POINT_copy((EC_POINT *)*puVar12,dst), iVar5 == 0))
            goto LAB_00a34970;
            puVar12 = puVar12 + 1;
            if (uVar16 != 0) {
              uVar15 = 1;
              do {
                iVar5 = EC_POINT_add(param_1,(EC_POINT *)*puVar12,r,(EC_POINT *)puVar12[-1],param_2)
                ;
                if (iVar5 == 0) goto LAB_00a34970;
                uVar15 = uVar15 + 1;
                puVar12 = puVar12 + 1;
              } while (uVar15 < (ulong)(1L << (uVar16 & 0x3f)));
            }
            if ((uVar11 < uVar10 - 1) &&
               (((((iVar5 = EC_POINT_dbl(param_1,dst,r,param_2), iVar5 == 0 ||
                   (iVar5 = EC_POINT_dbl(param_1,dst,dst,param_2), iVar5 == 0)) ||
                  (iVar5 = EC_POINT_dbl(param_1,dst,dst,param_2), iVar5 == 0)) ||
                 ((iVar5 = EC_POINT_dbl(param_1,dst,dst,param_2), iVar5 == 0 ||
                  (iVar5 = EC_POINT_dbl(param_1,dst,dst,param_2), iVar5 == 0)))) ||
                ((iVar5 = EC_POINT_dbl(param_1,dst,dst,param_2), iVar5 == 0 ||
                 (iVar5 = EC_POINT_dbl(param_1,dst,dst,param_2), iVar5 == 0)))))) goto LAB_00a34970;
            uVar11 = uVar11 + 1;
          } while (uVar11 < uVar10);
        }
        if ((*(code **)(*(long *)param_1 + 0xd8) == (code *)0x0) ||
           (iVar5 = (**(code **)(*(long *)param_1 + 0xd8))(param_1,uVar14,ptr_00,param_2),
           iVar5 == 0)) goto LAB_00a34970;
        puVar7[1] = 8;
        puVar7[2] = uVar10;
        puVar7[5] = uVar14;
        *puVar7 = param_1;
        puVar7[3] = lVar8;
        puVar7[4] = ptr_00;
        *(undefined4 *)(param_1 + 0x98) = 5;
        *(undefined8 **)(param_1 + 0xa0) = puVar7;
        uVar13 = 1;
        ptr_00 = (undefined8 *)0x0;
        puVar7 = (undefined8 *)0x0;
      }
    }
    BN_CTX_end(param_2);
    BN_CTX_free(c);
    if (puVar7 == (undefined8 *)0x0) goto LAB_00a34a10;
  }
  piVar1 = (int *)(puVar7 + 6);
  do {
    iVar5 = *piVar1;
    iVar4 = iVar5 + -1;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
    if (bVar3) {
      *piVar1 = iVar4;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if (iVar4 == 0) {
    DataMemoryBarrier(2,1);
    ptr = (long *)puVar7[4];
  }
  else {
    if (1 < iVar5) goto LAB_00a34a10;
    ptr = (long *)puVar7[4];
  }
  if (ptr != (long *)0x0) {
    pEVar9 = (EC_POINT *)*ptr;
    if (pEVar9 != (EC_POINT *)0x0) {
      do {
        ptr = ptr + 1;
        EC_POINT_free(pEVar9);
        pEVar9 = (EC_POINT *)*ptr;
      } while (pEVar9 != (EC_POINT *)0x0);
      ptr = (long *)puVar7[4];
    }
    CRYPTO_free(ptr);
  }
  CRYPTO_THREAD_lock_free(puVar7[7]);
  CRYPTO_free(puVar7);
LAB_00a34a10:
  if (ptr_00 != (undefined8 *)0x0) {
    pEVar9 = (EC_POINT *)*ptr_00;
    puVar7 = ptr_00;
    while (pEVar9 != (EC_POINT *)0x0) {
      puVar7 = puVar7 + 1;
      EC_POINT_free(pEVar9);
      pEVar9 = (EC_POINT *)*puVar7;
    }
    CRYPTO_free(ptr_00);
  }
  EC_POINT_free(r);
  EC_POINT_free(dst);
  return uVar13;
}

