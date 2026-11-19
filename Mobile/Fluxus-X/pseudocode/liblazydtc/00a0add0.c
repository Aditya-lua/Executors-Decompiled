/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0add0
 */

int BN_rshift(BIGNUM *r,BIGNUM *a,int n)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  ulong *puVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  ulong *puVar8;
  ulong uVar9;
  int iVar10;
  
  if (n < 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_shift.c",0x9b,"BN_rshift");
    ERR_set_error(3,0x77,0);
    return 0;
  }
  uVar2 = (uint)n >> 6;
  iVar10 = a->top - uVar2;
  if (iVar10 == 0 || a->top < (int)uVar2) {
    BN_zero_ex(r);
  }
  else {
    if ((r != a) && (lVar3 = bn_wexpand(r,iVar10), lVar3 == 0)) {
      iVar10 = 0;
      goto LAB_00a0aedc;
    }
    puVar8 = a->d;
    puVar4 = r->d;
    uVar5 = puVar8[uVar2];
    lVar3 = 0;
    if (iVar10 + -1 != 0 && 0 < iVar10) {
      uVar9 = -(ulong)(-n & 0x3f);
      uVar6 = uVar5;
      lVar7 = lVar3;
      do {
        uVar5 = puVar8[(ulong)uVar2 + lVar7 + 1];
        lVar3 = lVar7 + 1;
        puVar4[lVar7] = uVar5 << (ulong)(-n & 0x3f) & (uVar9 | uVar9 >> 8) | uVar6 >> (n & 0x3fU);
        uVar6 = uVar5;
        lVar7 = lVar3;
      } while (lVar3 < iVar10 + -1);
    }
    puVar4[lVar3] = uVar5 >> (n & 0x3fU);
    iVar1 = a->neg;
    r->top = iVar10;
    r->neg = iVar1;
  }
  iVar10 = 1;
LAB_00a0aedc:
  bn_correct_top(r);
  return iVar10;
}

