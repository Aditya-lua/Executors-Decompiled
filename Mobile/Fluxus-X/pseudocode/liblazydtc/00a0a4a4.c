/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0a4a4
 */

void bn_mul_low_recursive(long param_1,long param_2,long param_3,uint param_4,ulong *param_5)

{
  long lVar1;
  int num;
  uint uVar2;
  ulong uVar3;
  ulong *rp;
  ulong *bp;
  
  uVar2 = param_4;
  if ((int)param_4 < 0) {
    uVar2 = param_4 + 1;
  }
  num = (int)uVar2 >> 1;
  bn_mul_recursive();
  uVar3 = (long)((ulong)uVar2 << 0x20) >> 0x21;
  lVar1 = param_3 + (long)num * 8;
  if ((int)param_4 < 0x40) {
    bn_mul_low_normal(param_5,param_2,lVar1,uVar3 & 0xffffffff);
    bp = param_5 + uVar3;
    bn_mul_low_normal(bp,param_2 + uVar3 * 8,param_3,uVar3 & 0xffffffff);
    rp = (ulong *)(param_1 + uVar3 * 8);
    bn_add_words(rp,rp,param_5,num);
  }
  else {
    bn_mul_low_recursive(param_5,param_2,lVar1,uVar3 & 0xffffffff,param_5 + (int)param_4);
    rp = (ulong *)(param_1 + uVar3 * 8);
    bn_add_words(rp,rp,param_5,num);
    bn_mul_low_recursive
              (param_5,param_2 + uVar3 * 8,param_3,uVar3 & 0xffffffff,param_5 + (int)param_4);
    bp = param_5;
  }
  bn_add_words(rp,rp,bp,num);
  return;
}

