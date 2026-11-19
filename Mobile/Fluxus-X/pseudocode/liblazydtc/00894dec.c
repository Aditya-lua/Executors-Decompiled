/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00894dec
 */

long FUN_00894dec(long *param_1,ulong *param_2)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  
  FUN_008951fc();
  uVar1 = *param_2;
  uVar2 = ((ulong)(uint)((int)uVar1 << 3) + 8 ^ uVar1 >> 0x20) * -0x622015f714c7d297;
  uVar2 = (uVar1 >> 0x20 ^ uVar2 >> 0x2f ^ uVar2) * -0x622015f714c7d297;
  lVar4 = param_1[3];
  uVar2 = (uVar2 ^ uVar2 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar5 = uVar2 >> 6;
  uVar7 = 1L << (uVar2 & 0x3f);
  lVar3 = *param_1;
  uVar6 = *(ulong *)(lVar4 + uVar5 * 8);
  if ((uVar7 & uVar6) != 0) {
    do {
      if (*(ulong *)(lVar3 + uVar2 * 8) == uVar1) goto LAB_00894ec4;
      uVar2 = uVar2 + 1 & param_1[4] - 1U;
      uVar5 = uVar2 >> 6;
      uVar7 = 1L << (uVar2 & 0x3f);
      uVar6 = *(ulong *)(lVar4 + uVar5 * 8);
    } while ((uVar6 & uVar7) != 0);
  }
  *(ulong *)(lVar4 + uVar5 * 8) = uVar6 | uVar7;
  lVar4 = param_1[5];
  *(ulong *)(lVar3 + uVar2 * 8) = uVar1;
  param_1[5] = lVar4 + 1;
LAB_00894ec4:
  return lVar3 + uVar2 * 8;
}

