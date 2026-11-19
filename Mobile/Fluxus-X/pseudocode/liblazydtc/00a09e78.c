/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a09e78
 */

void bn_mul_normal(ulong *param_1,ulong *param_2,int param_3,ulong *param_4,int param_5)

{
  bool bVar1;
  ulong *puVar2;
  ulong *ap;
  int num;
  ulong uVar3;
  long lVar4;
  
  ap = param_4;
  num = param_5;
  if (param_5 <= param_3) {
    ap = param_2;
    param_2 = param_4;
    num = param_3;
    param_3 = param_5;
  }
  if (param_3 < 1) {
    bn_mul_words(param_1,ap,num,0);
    return;
  }
  puVar2 = param_1 + num;
  uVar3 = bn_mul_words(param_1,ap,num,*param_2);
  *puVar2 = uVar3;
  if (param_3 != 1) {
    lVar4 = 0;
    do {
      uVar3 = bn_mul_add_words((ulong *)((long)param_1 + lVar4 + 8),ap,num,
                               *(ulong *)((long)param_2 + lVar4 + 8));
      *(ulong *)((long)puVar2 + lVar4 + 8) = uVar3;
      if (param_3 == 2) {
        return;
      }
      uVar3 = bn_mul_add_words((ulong *)((long)param_1 + lVar4 + 0x10),ap,num,
                               *(ulong *)((long)param_2 + lVar4 + 0x10));
      *(ulong *)((long)puVar2 + lVar4 + 0x10) = uVar3;
      if (param_3 < 4) {
        return;
      }
      uVar3 = bn_mul_add_words((ulong *)((long)param_1 + lVar4 + 0x18),ap,num,
                               *(ulong *)((long)param_2 + lVar4 + 0x18));
      *(ulong *)((long)puVar2 + lVar4 + 0x18) = uVar3;
      if (param_3 + -4 == 0) {
        return;
      }
      uVar3 = bn_mul_add_words((ulong *)((long)param_1 + lVar4 + 0x20),ap,num,
                               *(ulong *)((long)param_2 + lVar4 + 0x20));
      *(ulong *)((long)puVar2 + lVar4 + 0x20) = uVar3;
      bVar1 = 5 < param_3;
      lVar4 = lVar4 + 0x20;
      param_3 = param_3 + -4;
    } while (bVar1);
  }
  return;
}

