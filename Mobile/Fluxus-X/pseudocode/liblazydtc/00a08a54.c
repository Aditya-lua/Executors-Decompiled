/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a08a54
 */

int BN_usub(BIGNUM *r,BIGNUM *a,BIGNUM *b)

{
  int iVar1;
  int num;
  long lVar2;
  ulong uVar3;
  ulong *puVar4;
  int iVar5;
  ulong uVar6;
  ulong *rp;
  long lVar7;
  ulong *puVar8;
  
  iVar1 = a->top;
  num = b->top;
  lVar7 = (long)num;
  if (iVar1 - num < 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_add.c",0x8b,"BN_usub");
    ERR_set_error(3,100,0);
    iVar5 = 0;
  }
  else {
    lVar2 = bn_wexpand(r,iVar1);
    iVar5 = 0;
    if (lVar2 != 0) {
      puVar8 = a->d;
      rp = r->d;
      uVar3 = bn_sub_words(rp,puVar8,b->d,num);
      puVar4 = rp + lVar7;
      if (iVar1 != num) {
        iVar5 = num - iVar1;
        puVar8 = puVar8 + lVar7;
        do {
          uVar6 = *puVar8;
          *puVar4 = uVar6 - uVar3;
          iVar5 = iVar5 + 1;
          uVar3 = uVar3 & uVar6 == 0;
          puVar4 = puVar4 + 1;
          puVar8 = puVar8 + 1;
        } while (iVar5 != 0);
        puVar4 = rp + lVar7 + (ulong)(uint)((iVar1 + -1) - num) + 1;
      }
      while ((iVar1 != 0 && (puVar4 = puVar4 + -1, *puVar4 == 0))) {
        iVar1 = iVar1 + -1;
      }
      iVar5 = 1;
      r->top = iVar1;
      r->neg = 0;
    }
  }
  return iVar5;
}

