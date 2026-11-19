/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a08984
 */

int BN_uadd(BIGNUM *r,BIGNUM *a,BIGNUM *b)

{
  BIGNUM *pBVar1;
  int iVar2;
  int num;
  long lVar3;
  ulong uVar4;
  ulong *puVar5;
  int iVar6;
  ulong uVar7;
  ulong *rp;
  long lVar8;
  ulong *puVar9;
  
  pBVar1 = b;
  if (b->top <= a->top) {
    pBVar1 = a;
  }
  iVar2 = pBVar1->top;
  if (b->top <= a->top) {
    a = b;
  }
  num = a->top;
  lVar8 = (long)num;
  lVar3 = bn_wexpand(r,iVar2 + 1);
  iVar6 = 0;
  if (lVar3 != 0) {
    r->top = iVar2;
    puVar9 = pBVar1->d;
    rp = r->d;
    uVar4 = bn_add_words(rp,puVar9,a->d,num);
    puVar5 = rp + lVar8;
    if (iVar2 != num) {
      iVar6 = num - iVar2;
      puVar9 = puVar9 + lVar8;
      do {
        uVar7 = *puVar9;
        *puVar5 = uVar7 + uVar4;
        iVar6 = iVar6 + 1;
        uVar4 = uVar4 & uVar7 + uVar4 == 0;
        puVar5 = puVar5 + 1;
        puVar9 = puVar9 + 1;
      } while (iVar6 != 0);
      puVar5 = rp + lVar8 + (ulong)(uint)((iVar2 + -1) - num) + 1;
    }
    *puVar5 = uVar4;
    r->neg = 0;
    iVar6 = 1;
    r->top = r->top + (int)uVar4;
  }
  return iVar6;
}

