/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b1bc
 */

void bn_sqr_normal(ulong *param_1,ulong *param_2,int param_3,ulong *param_4)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  int num;
  ulong *rp;
  ulong *ap;
  ulong *puVar4;
  
  param_1[(long)param_3 * 2 + -1] = 0;
  *param_1 = 0;
  if (1 < param_3) {
    uVar3 = bn_mul_words(param_1 + 1,param_2 + 1,(int)((long)param_3 + -1),*param_2);
    (param_1 + 1)[(long)param_3 + -1] = uVar3;
    if (param_3 + -2 != 0) {
      puVar4 = param_1 + param_3;
      rp = param_1 + 3;
      ap = param_2 + 2;
      num = param_3 + -2;
      do {
        puVar4 = puVar4 + 1;
        uVar3 = bn_mul_add_words(rp,ap,num,ap[-1]);
        *puVar4 = uVar3;
        rp = rp + 2;
        iVar2 = num + -1;
        ap = ap + 1;
        bVar1 = 0 < num;
        num = iVar2;
      } while (iVar2 != 0 && bVar1);
    }
  }
  bn_add_words(param_1,param_1,param_1,param_3 << 1);
  bn_sqr_words(param_4,param_2,param_3);
  bn_add_words(param_1,param_1,param_4,param_3 << 1);
  return;
}

