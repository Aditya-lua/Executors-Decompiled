/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0aac0
 */

int BN_lshift1(BIGNUM *r,BIGNUM *a)

{
  int iVar1;
  long lVar2;
  ulong *puVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong uVar7;
  
  if (r == a) {
    lVar2 = bn_wexpand(r,r->top + 1);
    if (lVar2 == 0) {
      return 0;
    }
  }
  else {
    r->neg = a->neg;
    lVar2 = bn_wexpand(r,a->top + 1);
    if (lVar2 == 0) {
      return 0;
    }
    r->top = a->top;
  }
  iVar1 = a->top;
  puVar3 = r->d;
  if (iVar1 < 1) {
    uVar6 = 0;
  }
  else {
    puVar5 = a->d;
    lVar2 = 0;
    uVar6 = 0;
    puVar4 = puVar3;
    do {
      uVar7 = puVar5[lVar2];
      lVar2 = lVar2 + 1;
      puVar3 = puVar4 + 1;
      *puVar4 = uVar6 | uVar7 << 1;
      uVar6 = uVar7 >> 0x3f;
      puVar4 = puVar3;
    } while ((int)lVar2 < iVar1);
  }
  *puVar3 = uVar6;
  r->top = r->top + (int)uVar6;
  return 1;
}

