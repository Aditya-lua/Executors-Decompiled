/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a08544
 */

int BN_gcd(BIGNUM *r,BIGNUM *a,BIGNUM *b,BN_CTX *ctx)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  BIGNUM *pBVar7;
  BIGNUM *r_00;
  long lVar8;
  ulong uVar9;
  uint uVar10;
  
  iVar2 = BN_is_zero(b);
  if (iVar2 != 0) {
LAB_00a085a0:
    pBVar7 = BN_copy(r,a);
    r->neg = 0;
    return (uint)(pBVar7 != (BIGNUM *)0x0);
  }
  iVar2 = BN_is_zero(a);
  if (iVar2 != 0) {
    a = b;
    goto LAB_00a085a0;
  }
  BN_CTX_start(ctx);
  pBVar7 = BN_CTX_get(ctx);
  r_00 = BN_CTX_get(ctx);
  if (((r_00 != (BIGNUM *)0x0) && (iVar2 = BN_lshift1(r_00,b), iVar2 != 0)) &&
     (iVar2 = BN_lshift1(r,a), iVar2 != 0)) {
    if (r->dmax < 1) {
      iVar2 = 0;
    }
    else {
      lVar8 = 0;
      iVar2 = 0;
      uVar10 = 1;
      do {
        if (r_00->dmax <= lVar8) break;
        uVar9 = ~(r_00->d[lVar8] | r->d[lVar8]);
        iVar3 = 0x40;
        do {
          uVar10 = uVar10 & (uint)uVar9;
          iVar3 = iVar3 + -1;
          iVar2 = iVar2 + uVar10;
          uVar9 = uVar9 >> 1;
        } while (iVar3 != 0);
        lVar8 = lVar8 + 1;
      } while (lVar8 < r->dmax);
    }
    iVar3 = BN_rshift(r,r,iVar2);
    if ((iVar3 != 0) && (iVar3 = BN_rshift(r_00,r_00,iVar2), iVar3 != 0)) {
      iVar3 = r_00->top;
      if (r_00->top <= r->top) {
        iVar3 = r->top;
      }
      iVar3 = iVar3 + 1;
      lVar8 = bn_wexpand(r,iVar3);
      if (((lVar8 != 0) && (lVar8 = bn_wexpand(r_00,iVar3), lVar8 != 0)) &&
         (lVar8 = bn_wexpand(pBVar7,iVar3), lVar8 != 0)) {
        BN_consttime_swap(~(uint)*r->d & 1,r,r_00,iVar3);
        iVar4 = BN_num_bits(r);
        iVar5 = BN_num_bits(r_00);
        if (iVar5 <= iVar4) {
          iVar5 = iVar4;
        }
        if (-4 < iVar5 * 3) {
          uVar10 = 1;
          iVar4 = -1;
          do {
            uVar1 = (uint)*r_00->d & -uVar10 >> 0x1f & (r_00->top - 1U >> 0x1f ^ 0xffffffff);
            r->neg = uVar1 ^ r->neg;
            BN_consttime_swap(uVar1,r,r_00,iVar3);
            iVar6 = BN_add(pBVar7,r_00,r);
            if (iVar6 == 0) goto LAB_00a08824;
            BN_consttime_swap((uint)*r_00->d & (r_00->top - 1U >> 0x1f ^ 0xffffffff) & 1,r_00,pBVar7
                              ,iVar3);
            iVar6 = BN_rshift1(r_00,r_00);
            if (iVar6 == 0) goto LAB_00a08824;
            iVar4 = iVar4 + 1;
            uVar10 = (uVar1 - 1 & uVar10 | -uVar1 & -uVar10) + 1;
          } while (iVar4 < iVar5 * 3 + 3);
        }
        r->neg = 0;
        iVar2 = BN_lshift(r,r,iVar2);
        if (iVar2 != 0) {
          iVar2 = BN_rshift1(r,r);
          uVar10 = (uint)(iVar2 != 0);
          goto LAB_00a08828;
        }
      }
    }
  }
LAB_00a08824:
  uVar10 = 0;
LAB_00a08828:
  BN_CTX_end(ctx);
  return uVar10;
}

