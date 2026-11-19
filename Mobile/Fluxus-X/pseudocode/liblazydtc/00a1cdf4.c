/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1cdf4
 */

int BN_mod_exp_simple(BIGNUM *r,BIGNUM *a,BIGNUM *p,BIGNUM *m,BN_CTX *ctx)

{
  long lVar1;
  undefined4 uVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  BIGNUM *pBVar7;
  BIGNUM *pBVar8;
  uint uVar9;
  long lVar10;
  uint uVar11;
  uint uVar12;
  uint local_16c;
  BIGNUM *local_168 [33];
  
  iVar4 = BN_get_flags(p,4);
  if (((iVar4 != 0) || (iVar4 = BN_get_flags(a,4), iVar4 != 0)) ||
     (iVar4 = BN_get_flags(m,4), iVar4 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp.c",0x52c,"BN_mod_exp_simple");
    uVar2 = 0xc0101;
LAB_00a1ce80:
    ERR_set_error(3,uVar2,0);
    return 0;
  }
  if (r == m) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp.c",0x531,"BN_mod_exp_simple");
    uVar2 = 0x80106;
    goto LAB_00a1ce80;
  }
  iVar4 = BN_num_bits(p);
  if (iVar4 == 0) {
    iVar4 = BN_abs_is_word(m,1);
    if (iVar4 == 0) {
      iVar4 = BN_set_word(r,1);
      return iVar4;
    }
    BN_zero_ex(r);
    return 1;
  }
  BN_CTX_start(ctx);
  pBVar7 = BN_CTX_get(ctx);
  pBVar8 = BN_CTX_get(ctx);
  local_168[0] = pBVar8;
  if ((pBVar8 != (BIGNUM *)0x0) && (iVar5 = BN_nnmod(pBVar8,a,m,ctx), iVar5 != 0)) {
    iVar5 = BN_is_zero(pBVar8);
    if (iVar5 != 0) {
      BN_zero_ex(r);
      iVar5 = 1;
      goto LAB_00a1d198;
    }
    if (iVar4 < 0x2a0) {
      if (0xef < iVar4) {
        local_16c = 5;
        goto LAB_00a1cfbc;
      }
      if (0x4f < iVar4) {
        local_16c = 4;
        goto LAB_00a1cfbc;
      }
      if (0x17 < iVar4) {
        local_16c = 3;
        goto LAB_00a1cfbc;
      }
      local_16c = 1;
    }
    else {
      local_16c = 6;
LAB_00a1cfbc:
      iVar5 = BN_mod_mul(pBVar7,pBVar8,pBVar8,m,ctx);
      if (iVar5 == 0) goto LAB_00a1d194;
      iVar5 = 1 << (ulong)(local_16c - 1 & 0x1f);
      if (1 < iVar5) {
        lVar10 = 0;
        do {
          pBVar8 = BN_CTX_get(ctx);
          local_168[lVar10 + 1] = pBVar8;
          if ((pBVar8 == (BIGNUM *)0x0) ||
             (iVar6 = BN_mod_mul(pBVar8,local_168[lVar10],pBVar7,m,ctx), iVar6 == 0))
          goto LAB_00a1d194;
          lVar1 = lVar10 + 2;
          lVar10 = lVar10 + 1;
        } while (lVar1 < iVar5);
      }
    }
    if (((r != p) ||
        ((p = BN_CTX_get(ctx), p != (BIGNUM *)0x0 &&
         (pBVar7 = BN_copy(p,r), pBVar7 != (BIGNUM *)0x0)))) &&
       (iVar5 = BN_set_word(r,1), iVar5 != 0)) {
      iVar4 = iVar4 + -1;
      bVar3 = true;
      do {
        while (iVar5 = BN_is_bit_set(p,iVar4), iVar5 == 0) {
          if ((!bVar3) && (iVar5 = BN_mod_mul(r,r,r,m,ctx), iVar5 == 0)) goto LAB_00a1d194;
          if (iVar4 == 0) {
            iVar5 = 1;
            goto LAB_00a1d198;
          }
          iVar4 = iVar4 + -1;
        }
        if (local_16c < 2) {
          uVar9 = 0;
          uVar11 = 1;
        }
        else {
          uVar9 = 0;
          uVar11 = 1;
          uVar12 = 1;
          iVar5 = iVar4;
          do {
            iVar5 = iVar5 + -1;
            if (iVar5 < 0) break;
            iVar6 = BN_is_bit_set(p,iVar5);
            if (iVar6 != 0) {
              uVar11 = uVar11 << (ulong)(uVar12 - uVar9 & 0x1f) | 1;
              uVar9 = uVar12;
            }
            uVar12 = uVar12 + 1;
          } while (uVar12 < local_16c);
        }
        if ((!bVar3) && (-1 < (int)uVar9)) {
          iVar5 = -1;
          do {
            iVar6 = BN_mod_mul(r,r,r,m,ctx);
            if (iVar6 == 0) goto LAB_00a1d194;
            iVar5 = iVar5 + 1;
          } while (iVar5 < (int)uVar9);
        }
        iVar5 = BN_mod_mul(r,r,local_168[(int)uVar11 >> 1],m,ctx);
        if (iVar5 == 0) goto LAB_00a1d194;
        bVar3 = false;
        iVar4 = (iVar4 + -1) - uVar9;
        iVar5 = 1;
      } while (-1 < iVar4);
      goto LAB_00a1d198;
    }
  }
LAB_00a1d194:
  iVar5 = 0;
LAB_00a1d198:
  BN_CTX_end(ctx);
  return iVar5;
}

