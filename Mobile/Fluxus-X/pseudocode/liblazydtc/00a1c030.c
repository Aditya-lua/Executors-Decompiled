/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1c030
 */

int BN_mod_exp_recp(BIGNUM *r,BIGNUM *a,BIGNUM *p,BIGNUM *m,BN_CTX *ctx)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  BIGNUM *pBVar8;
  uint uVar9;
  uint uVar10;
  long lVar11;
  uint uVar12;
  uint uVar13;
  BN_RECP_CTX BStack_1a8;
  BIGNUM *local_168 [33];
  
  iVar3 = BN_get_flags(p,4);
  if (((iVar3 != 0) || (iVar3 = BN_get_flags(a,4), iVar3 != 0)) ||
     (iVar3 = BN_get_flags(m,4), iVar3 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp.c",0xb7,"BN_mod_exp_recp");
    ERR_set_error(3,0xc0101,0);
    return 0;
  }
  iVar3 = BN_num_bits(p);
  if (iVar3 == 0) {
    iVar3 = BN_abs_is_word(m,1);
    if (iVar3 == 0) {
      iVar3 = BN_set_word(r,1);
      return iVar3;
    }
    BN_zero_ex(r);
    return 1;
  }
  BN_RECP_CTX_init(&BStack_1a8);
  BN_CTX_start(ctx);
  pBVar6 = BN_CTX_get(ctx);
  pBVar7 = BN_CTX_get(ctx);
  local_168[0] = pBVar7;
  if (pBVar7 != (BIGNUM *)0x0) {
    if (m->neg == 0) {
      pBVar8 = m;
    }
    else {
      pBVar8 = BN_copy(pBVar6,m);
      if (pBVar8 == (BIGNUM *)0x0) goto LAB_00a1c3d8;
      pBVar6->neg = 0;
      pBVar8 = pBVar6;
    }
    iVar4 = BN_RECP_CTX_set(&BStack_1a8,pBVar8,ctx);
    if ((0 < iVar4) && (iVar4 = BN_nnmod(pBVar7,a,m,ctx), iVar4 != 0)) {
      iVar4 = BN_is_zero(pBVar7);
      if (iVar4 != 0) {
        BN_zero_ex(r);
        iVar4 = 1;
        goto LAB_00a1c3dc;
      }
      if (iVar3 < 0x2a0) {
        if (0xef < iVar3) {
          uVar9 = 5;
          goto LAB_00a1c214;
        }
        if (0x4f < iVar3) {
          uVar9 = 4;
          goto LAB_00a1c214;
        }
        if (0x17 < iVar3) {
          uVar9 = 3;
          goto LAB_00a1c214;
        }
        uVar9 = 1;
      }
      else {
        uVar9 = 6;
LAB_00a1c214:
        iVar4 = BN_mod_mul_reciprocal(pBVar6,pBVar7,pBVar7,&BStack_1a8,ctx);
        if (iVar4 == 0) goto LAB_00a1c3d8;
        iVar4 = 1 << (ulong)(uVar9 - 1 & 0x1f);
        if (1 < iVar4) {
          lVar11 = 0;
          do {
            pBVar7 = BN_CTX_get(ctx);
            local_168[lVar11 + 1] = pBVar7;
            if ((pBVar7 == (BIGNUM *)0x0) ||
               (iVar5 = BN_mod_mul_reciprocal(pBVar7,local_168[lVar11],pBVar6,&BStack_1a8,ctx),
               iVar5 == 0)) goto LAB_00a1c3d8;
            lVar1 = lVar11 + 2;
            lVar11 = lVar11 + 1;
          } while (lVar1 < iVar4);
        }
      }
      if (((r != p) ||
          ((p = BN_CTX_get(ctx), p != (BIGNUM *)0x0 &&
           (pBVar6 = BN_copy(p,r), pBVar6 != (BIGNUM *)0x0)))) &&
         (iVar4 = BN_set_word(r,1), iVar4 != 0)) {
        iVar3 = iVar3 + -1;
        bVar2 = true;
        do {
          while (iVar4 = BN_is_bit_set(p,iVar3), iVar4 == 0) {
            if ((!bVar2) && (iVar4 = BN_mod_mul_reciprocal(r,r,r,&BStack_1a8,ctx), iVar4 == 0))
            goto LAB_00a1c3d8;
            if (iVar3 == 0) {
              iVar4 = 1;
              goto LAB_00a1c3dc;
            }
            iVar3 = iVar3 + -1;
          }
          if (uVar9 < 2) {
            uVar10 = 0;
            uVar13 = 1;
          }
          else {
            uVar10 = 0;
            uVar13 = 1;
            uVar12 = 1;
            iVar4 = iVar3;
            do {
              iVar4 = iVar4 + -1;
              if (iVar4 < 0) break;
              iVar5 = BN_is_bit_set(p,iVar4);
              if (iVar5 != 0) {
                uVar13 = uVar13 << (ulong)(uVar12 - uVar10 & 0x1f) | 1;
                uVar10 = uVar12;
              }
              uVar12 = uVar12 + 1;
            } while (uVar12 < uVar9);
          }
          if ((!bVar2) && (-1 < (int)uVar10)) {
            iVar4 = -1;
            do {
              iVar5 = BN_mod_mul_reciprocal(r,r,r,&BStack_1a8,ctx);
              if (iVar5 == 0) goto LAB_00a1c3d8;
              iVar4 = iVar4 + 1;
            } while (iVar4 < (int)uVar10);
          }
          iVar4 = BN_mod_mul_reciprocal(r,r,local_168[(int)uVar13 >> 1],&BStack_1a8,ctx);
          if (iVar4 == 0) goto LAB_00a1c3d8;
          bVar2 = false;
          iVar3 = (iVar3 + -1) - uVar10;
          iVar4 = 1;
        } while (-1 < iVar3);
        goto LAB_00a1c3dc;
      }
    }
  }
LAB_00a1c3d8:
  iVar4 = 0;
LAB_00a1c3dc:
  BN_CTX_end(ctx);
  BN_RECP_CTX_free(&BStack_1a8);
  return iVar4;
}

