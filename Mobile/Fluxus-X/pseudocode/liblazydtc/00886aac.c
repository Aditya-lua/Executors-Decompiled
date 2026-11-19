/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00886aac
 */

long FUN_00886aac(long *param_1,ulong *param_2)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ulong *puVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  
  FUN_00886bbc();
  uVar1 = *param_2;
  uVar2 = ((ulong)(uint)((int)uVar1 << 3) + 8 ^ uVar1 >> 0x20) * -0x622015f714c7d297;
  uVar2 = (uVar1 >> 0x20 ^ uVar2 >> 0x2f ^ uVar2) * -0x622015f714c7d297;
  lVar5 = param_1[3];
  uVar2 = (uVar2 ^ uVar2 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar6 = uVar2 >> 6;
  uVar8 = 1L << (uVar2 & 0x3f);
  lVar3 = *param_1;
  uVar7 = *(ulong *)(lVar5 + uVar6 * 8);
  if ((uVar8 & uVar7) != 0) {
    do {
      if (*(ulong *)(lVar3 + uVar2 * 0x18) == uVar1) goto LAB_00886ba4;
      uVar2 = uVar2 + 1 & param_1[4] - 1U;
      uVar6 = uVar2 >> 6;
      uVar8 = 1L << (uVar2 & 0x3f);
      uVar7 = *(ulong *)(lVar5 + uVar6 * 8);
    } while ((uVar7 & uVar8) != 0);
  }
  *(ulong *)(lVar5 + uVar6 * 8) = uVar7 | uVar8;
  puVar4 = (ulong *)(lVar3 + uVar2 * 0x18);
  puVar4[1] = 0;
  *(undefined4 *)(puVar4 + 2) = 0;
  lVar5 = param_1[5];
  *puVar4 = uVar1;
  lVar3 = *param_1;
  param_1[5] = lVar5 + 1;
LAB_00886ba4:
  return lVar3 + uVar2 * 0x18 + 8;
}

