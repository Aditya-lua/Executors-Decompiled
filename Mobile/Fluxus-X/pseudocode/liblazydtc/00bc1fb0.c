/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc1fb0
 */

undefined8 ZSTD_XXH64_update(long *param_1,long *param_2,size_t param_3)

{
  long *plVar1;
  long *plVar2;
  uint uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  long lVar11;
  
  if (param_2 != (long *)0x0) {
    uVar3 = *(uint *)(param_1 + 9);
    uVar4 = (ulong)uVar3;
    *param_1 = *param_1 + param_3;
    if (param_3 + uVar4 < 0x20) {
      memcpy((void *)((long)param_1 + uVar4 + 0x28),param_2,param_3);
      *(int *)(param_1 + 9) = (int)param_1[9] + (int)param_3;
    }
    else {
      plVar2 = (long *)((long)param_2 + param_3);
      if (uVar3 != 0) {
        memcpy((void *)((long)param_1 + uVar4 + 0x28),param_2,(ulong)(0x20 - uVar3));
        uVar4 = param_1[1] + param_1[5] * -0x3d4d51c2d82b14b1;
        uVar8 = param_1[2] + param_1[6] * -0x3d4d51c2d82b14b1;
        uVar6 = param_1[3] + param_1[7] * -0x3d4d51c2d82b14b1;
        uVar10 = param_1[4] + param_1[8] * -0x3d4d51c2d82b14b1;
        param_1[1] = (uVar4 >> 0x21 | uVar4 * 0x80000000) * -0x61c8864e7a143579;
        param_1[2] = (uVar8 >> 0x21 | uVar8 * 0x80000000) * -0x61c8864e7a143579;
        lVar5 = param_1[9];
        *(undefined4 *)(param_1 + 9) = 0;
        param_2 = (long *)((long)param_2 + (ulong)(0x20 - (int)lVar5));
        param_1[3] = (uVar6 >> 0x21 | uVar6 * 0x80000000) * -0x61c8864e7a143579;
        param_1[4] = (uVar10 >> 0x21 | uVar10 * 0x80000000) * -0x61c8864e7a143579;
      }
      if (param_2 + 4 <= plVar2) {
        lVar5 = param_1[1];
        lVar7 = param_1[2];
        lVar9 = param_1[3];
        lVar11 = param_1[4];
        do {
          uVar4 = lVar5 + *param_2 * -0x3d4d51c2d82b14b1;
          lVar5 = (uVar4 >> 0x21 | uVar4 * 0x80000000) * -0x61c8864e7a143579;
          param_1[1] = lVar5;
          uVar4 = lVar7 + param_2[1] * -0x3d4d51c2d82b14b1;
          lVar7 = (uVar4 >> 0x21 | uVar4 * 0x80000000) * -0x61c8864e7a143579;
          param_1[2] = lVar7;
          uVar4 = lVar9 + param_2[2] * -0x3d4d51c2d82b14b1;
          lVar9 = (uVar4 >> 0x21 | uVar4 * 0x80000000) * -0x61c8864e7a143579;
          param_1[3] = lVar9;
          plVar1 = param_2 + 3;
          param_2 = param_2 + 4;
          uVar4 = lVar11 + *plVar1 * -0x3d4d51c2d82b14b1;
          lVar11 = (uVar4 >> 0x21 | uVar4 * 0x80000000) * -0x61c8864e7a143579;
          param_1[4] = lVar11;
        } while (param_2 <= plVar2 + -4);
      }
      if (param_2 < plVar2) {
        memcpy(param_1 + 5,param_2,(long)plVar2 - (long)param_2);
        *(int *)(param_1 + 9) = (int)((long)plVar2 - (long)param_2);
      }
    }
  }
  return 0;
}

