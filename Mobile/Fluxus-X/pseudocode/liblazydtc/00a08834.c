/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a08834
 */

int BN_add(BIGNUM *r,BIGNUM *a,BIGNUM *b)

{
  BIGNUM *pBVar1;
  int iVar2;
  int num;
  int iVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong *rp;
  long lVar9;
  ulong *puVar10;
  
  iVar3 = a->neg;
  if (iVar3 == b->neg) {
    pBVar1 = b;
    if (b->top <= a->top) {
      pBVar1 = a;
      a = b;
    }
    iVar2 = pBVar1->top;
    num = a->top;
    lVar9 = (long)num;
    lVar5 = bn_wexpand(r,iVar2 + 1);
    iVar4 = 0;
    if (lVar5 == 0) goto LAB_00a08950;
    r->top = iVar2;
    puVar10 = pBVar1->d;
    rp = r->d;
    uVar6 = bn_add_words(rp,puVar10,a->d,num);
    puVar7 = rp + lVar9;
    if (iVar2 != num) {
      iVar4 = num - iVar2;
      puVar10 = puVar10 + lVar9;
      do {
        uVar8 = *puVar10;
        *puVar7 = uVar8 + uVar6;
        iVar4 = iVar4 + 1;
        uVar6 = uVar6 & uVar8 + uVar6 == 0;
        puVar7 = puVar7 + 1;
        puVar10 = puVar10 + 1;
      } while (iVar4 != 0);
      puVar7 = rp + lVar9 + 1 + (ulong)(uint)((iVar2 + -1) - num);
    }
    *puVar7 = uVar6;
    r->neg = 0;
    r->top = r->top + (int)uVar6;
  }
  else {
    iVar3 = BN_ucmp(a,b);
    if (0 < iVar3) {
      iVar3 = a->neg;
      iVar4 = BN_usub(r,a,b);
      goto LAB_00a08950;
    }
    if (iVar3 < 0) {
      iVar3 = b->neg;
      iVar4 = BN_usub(r,b,a);
      goto LAB_00a08950;
    }
    BN_zero_ex(r);
    iVar3 = 0;
  }
  iVar4 = 1;
LAB_00a08950:
  r->neg = iVar3;
  return iVar4;
}

