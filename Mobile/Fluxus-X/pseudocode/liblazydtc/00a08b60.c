/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a08b60
 */

int BN_sub(BIGNUM *r,BIGNUM *a,BIGNUM *b)

{
  BIGNUM *pBVar1;
  int num;
  int iVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong *rp;
  long lVar8;
  ulong *puVar9;
  uint uVar10;
  
  uVar10 = a->neg;
  if (uVar10 == b->neg) {
    iVar2 = BN_ucmp(a,b);
    if (0 < iVar2) {
      uVar10 = a->neg;
      iVar3 = BN_usub(r,a,b);
      goto LAB_00a08c7c;
    }
    if (iVar2 < 0) {
      uVar10 = (uint)(b->neg == 0);
      iVar3 = BN_usub(r,b,a);
      goto LAB_00a08c7c;
    }
    BN_zero_ex(r);
    uVar10 = 0;
  }
  else {
    pBVar1 = b;
    if (b->top <= a->top) {
      pBVar1 = a;
      a = b;
    }
    iVar2 = pBVar1->top;
    num = a->top;
    lVar8 = (long)num;
    lVar4 = bn_wexpand(r,iVar2 + 1);
    iVar3 = 0;
    if (lVar4 == 0) goto LAB_00a08c7c;
    r->top = iVar2;
    puVar9 = pBVar1->d;
    rp = r->d;
    uVar5 = bn_add_words(rp,puVar9,a->d,num);
    puVar6 = rp + lVar8;
    if (iVar2 != num) {
      iVar3 = num - iVar2;
      puVar9 = puVar9 + lVar8;
      do {
        uVar7 = *puVar9;
        *puVar6 = uVar7 + uVar5;
        iVar3 = iVar3 + 1;
        uVar5 = uVar5 & uVar7 + uVar5 == 0;
        puVar6 = puVar6 + 1;
        puVar9 = puVar9 + 1;
      } while (iVar3 != 0);
      puVar6 = rp + lVar8 + 1 + (ulong)(uint)((iVar2 + -1) - num);
    }
    *puVar6 = uVar5;
    r->neg = 0;
    r->top = r->top + (int)uVar5;
  }
  iVar3 = 1;
LAB_00a08c7c:
  r->neg = uVar10;
  return iVar3;
}

