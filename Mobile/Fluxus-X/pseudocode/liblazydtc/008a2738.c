/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a2738
 */

long FUN_008a2738(long *param_1,ulong *param_2)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  
  lVar3 = 0;
  if (param_1[5] != 0) {
    uVar2 = *param_2;
    uVar4 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
    uVar4 = (uVar2 >> 0x20 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
    uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*param_1 + uVar4 * 0x10) == uVar2) {
          lVar3 = *param_1 + uVar4 * 0x10;
          goto LAB_008a27e8;
        }
        uVar4 = uVar4 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0);
    }
    lVar3 = 0;
  }
LAB_008a27e8:
  lVar1 = 0;
  if (lVar3 != 0) {
    lVar1 = lVar3 + 8;
  }
  return lVar1;
}

