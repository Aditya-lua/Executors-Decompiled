/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b2b4
 */

void bn_sqr_recursive(ulong *param_1,ulong *param_2,uint param_3,ulong *param_4)

{
  ulong *puVar1;
  long lVar2;
  int num;
  uint uVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  ulong *puVar9;
  
  uVar3 = param_3;
  if ((int)param_3 < 0) {
    uVar3 = param_3 + 1;
  }
  if (param_3 == 8) {
    bn_sqr_comba8(param_1,param_2);
    return;
  }
  if (param_3 == 4) {
    bn_sqr_comba4(param_1,param_2);
    return;
  }
  if ((int)param_3 < 0x10) {
    bn_sqr_normal(param_1,param_2,param_3,param_4);
    return;
  }
  num = (int)uVar3 >> 1;
  puVar1 = param_2 + num;
  iVar4 = bn_cmp_words(param_2,puVar1,num);
  if (iVar4 < 1) {
    if (-1 < iVar4) {
      uVar5 = -(ulong)(param_3 >> 0x1f) & 0xfffffff800000000 | (ulong)param_3 << 3;
      puVar9 = (ulong *)((long)param_4 + uVar5);
      puVar8 = param_4 + (long)(int)param_3 * 2;
      memset(puVar9,0,uVar5);
      goto LAB_00a0b3f0;
    }
    puVar8 = puVar1;
    puVar9 = param_2;
  }
  else {
    puVar8 = param_2;
    puVar9 = puVar1;
  }
  bn_sub_words(param_4,puVar8,puVar9,num);
  puVar8 = param_4 + (long)(int)param_3 * 2;
  puVar9 = param_4 + (int)param_3;
  bn_sqr_recursive(puVar9,param_4,num,puVar8);
LAB_00a0b3f0:
  bn_sqr_recursive(param_1,param_2,num,puVar8);
  bn_sqr_recursive(param_1 + (int)param_3,puVar1,num,puVar8);
  uVar5 = bn_add_words(param_4,param_1,param_1 + (int)param_3,param_3);
  uVar6 = bn_sub_words(puVar9,param_4,puVar9,param_3);
  uVar7 = bn_add_words(param_1 + num,param_1 + num,puVar9,param_3);
  iVar4 = ((int)uVar5 - (int)uVar6) + (int)uVar7;
  if (iVar4 != 0) {
    lVar2 = (long)num + (long)(int)param_3;
    uVar5 = param_1[lVar2];
    param_1[lVar2] = uVar5 + (long)iVar4;
    if (CARRY8(uVar5,(long)iVar4)) {
      param_1 = param_1 + lVar2;
      do {
        param_1 = param_1 + 1;
        uVar5 = *param_1;
        *param_1 = uVar5 + 1;
      } while (uVar5 + 1 == 0);
    }
  }
  return;
}

