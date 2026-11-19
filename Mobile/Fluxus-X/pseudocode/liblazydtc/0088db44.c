/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088db44
 */

bool FUN_0088db44(long *param_1,ulong *param_2)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  
  if (param_1[5] != 0) {
    uVar2 = *param_2;
    uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
    uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
    uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
      do {
        bVar1 = *(ulong *)(*param_1 + uVar3 * 0x10) == uVar2;
        if (bVar1) {
          return bVar1;
        }
        uVar3 = uVar3 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
      return bVar1;
    }
  }
  return false;
}

