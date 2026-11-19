/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0ab88
 */

int BN_rshift1(BIGNUM *r,BIGNUM *a)

{
  long lVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  
  iVar3 = BN_is_zero(a);
  if (iVar3 == 0) {
    iVar3 = a->top;
    puVar8 = a->d;
    if (a != r) {
      lVar4 = bn_wexpand(r,iVar3);
      if (lVar4 == 0) {
        return 0;
      }
      r->neg = a->neg;
    }
    uVar7 = -(ulong)(iVar3 - 1U >> 0x1f) & 0xfffffff800000000 | (ulong)(iVar3 - 1U) << 3;
    uVar6 = *(ulong *)((long)puVar8 + uVar7);
    puVar5 = r->d;
    *(ulong *)((long)puVar5 + uVar7) = uVar6 >> 1;
    iVar2 = iVar3 - (uint)(uVar6 == 1);
    r->top = iVar2;
    if (1 < iVar3) {
      lVar4 = (long)iVar3 + -2;
      do {
        uVar7 = puVar8[lVar4];
        lVar1 = lVar4 + 1;
        puVar5[lVar4] = uVar7 >> 1 | uVar6 << 0x3f;
        uVar6 = uVar7;
        lVar4 = lVar4 + -1;
      } while (1 < lVar1);
    }
    if (iVar2 == 0) {
      r->neg = 0;
    }
  }
  else {
    BN_zero_ex(r);
  }
  return 1;
}

