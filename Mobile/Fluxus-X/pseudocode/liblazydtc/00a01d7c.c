/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01d7c
 */

void BN_swap(BIGNUM *a,BIGNUM *b)

{
  int iVar1;
  uint uVar2;
  ulong *puVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  
  uVar4 = b->flags;
  puVar3 = a->d;
  iVar6 = a->top;
  iVar7 = a->dmax;
  iVar1 = a->neg;
  uVar2 = a->flags;
  a->d = b->d;
  iVar5 = b->dmax;
  a->top = b->top;
  a->dmax = iVar5;
  a->neg = b->neg;
  b->d = puVar3;
  b->top = iVar6;
  b->dmax = iVar7;
  b->neg = iVar1;
  a->flags = uVar4 & 0xe | uVar2 & 1;
  b->flags = uVar2 & 0xe | uVar4 & 1;
  return;
}

