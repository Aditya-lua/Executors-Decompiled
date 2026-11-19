/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc1aa0
 */

undefined8 ZSTD_XXH32_update(uint *param_1,int *param_2,size_t param_3)

{
  int *piVar1;
  int *piVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  ulong uVar6;
  uint uVar7;
  
  if (param_2 != (int *)0x0) {
    uVar7 = *param_1 + (int)param_3;
    uVar3 = param_1[10];
    uVar6 = (ulong)uVar3;
    *param_1 = uVar7;
    param_1[1] = param_1[1] | (uint)(0xf < param_3 || 0xf < uVar7);
    if (param_3 + uVar6 < 0x10) {
      memcpy((void *)((long)param_1 + uVar6 + 0x18),param_2,param_3);
      param_1[10] = param_1[10] + (int)param_3;
    }
    else {
      piVar2 = (int *)((long)param_2 + param_3);
      if (uVar3 != 0) {
        memcpy((void *)((long)param_1 + uVar6 + 0x18),param_2,(ulong)(0x10 - uVar3));
        uVar7 = param_1[2] + param_1[6] * -0x7a143589;
        uVar3 = param_1[3] + param_1[7] * -0x7a143589;
        uVar4 = param_1[4] + param_1[8] * -0x7a143589;
        uVar5 = param_1[5] + param_1[9] * -0x7a143589;
        param_1[2] = (uVar7 >> 0x13 | uVar7 * 0x2000) * -0x61c8864f;
        param_1[3] = (uVar3 >> 0x13 | uVar3 * 0x2000) * -0x61c8864f;
        uVar7 = param_1[10];
        param_1[10] = 0;
        param_2 = (int *)((long)param_2 + (ulong)(0x10 - uVar7));
        param_1[4] = (uVar4 >> 0x13 | uVar4 * 0x2000) * -0x61c8864f;
        param_1[5] = (uVar5 >> 0x13 | uVar5 * 0x2000) * -0x61c8864f;
      }
      if (param_2 <= piVar2 + -4) {
        uVar7 = param_1[2];
        do {
          uVar7 = uVar7 + *param_2 * -0x7a143589;
          uVar7 = (uVar7 >> 0x13 | uVar7 * 0x2000) * -0x61c8864f;
          param_1[2] = uVar7;
          uVar3 = param_1[3] + param_2[1] * -0x7a143589;
          param_1[3] = (uVar3 >> 0x13 | uVar3 * 0x2000) * -0x61c8864f;
          uVar3 = param_1[4] + param_2[2] * -0x7a143589;
          param_1[4] = (uVar3 >> 0x13 | uVar3 * 0x2000) * -0x61c8864f;
          piVar1 = param_2 + 3;
          param_2 = param_2 + 4;
          uVar3 = param_1[5] + *piVar1 * -0x7a143589;
          param_1[5] = (uVar3 >> 0x13 | uVar3 * 0x2000) * -0x61c8864f;
        } while (param_2 <= piVar2 + -4);
      }
      if (param_2 < piVar2) {
        memcpy(param_1 + 6,param_2,(long)piVar2 - (long)param_2);
        param_1[10] = (uint)((long)piVar2 - (long)param_2);
      }
    }
  }
  return 0;
}

