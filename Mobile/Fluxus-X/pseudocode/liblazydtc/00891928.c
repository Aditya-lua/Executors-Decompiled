/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891928
 */

long FUN_00891928(long *param_1,ulong *param_2)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  
  FUN_00891efc();
  uVar2 = *param_2;
  uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
  uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
  lVar5 = param_1[3];
  uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar6 = uVar3 >> 6;
  uVar8 = 1L << (uVar3 & 0x3f);
  lVar4 = *param_1;
  uVar7 = *(ulong *)(lVar5 + uVar6 * 8);
  if ((uVar8 & uVar7) != 0) {
    do {
      if (*(ulong *)(lVar4 + uVar3 * 0x10) == uVar2) goto LAB_00891a10;
      uVar3 = uVar3 + 1 & param_1[4] - 1U;
      uVar6 = uVar3 >> 6;
      uVar8 = 1L << (uVar3 & 0x3f);
      uVar7 = *(ulong *)(lVar5 + uVar6 * 8);
    } while ((uVar7 & uVar8) != 0);
  }
  puVar1 = (ulong *)(lVar4 + uVar3 * 0x10);
  *(ulong *)(lVar5 + uVar6 * 8) = uVar7 | uVar8;
  puVar1[1] = 0;
  lVar5 = param_1[5];
  *puVar1 = uVar2;
  lVar4 = *param_1;
  param_1[5] = lVar5 + 1;
LAB_00891a10:
  return lVar4 + uVar3 * 0x10 + 8;
}

