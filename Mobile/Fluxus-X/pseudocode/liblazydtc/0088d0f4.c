/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088d0f4
 */

bool FUN_0088d0f4(long *param_1,ulong param_2)

{
  ulong uVar1;
  ulong *puVar2;
  
  if (param_1[5] != 0) {
    uVar1 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar1 = (param_2 >> 0x20 ^ uVar1 >> 0x2f ^ uVar1) * -0x622015f714c7d297;
    uVar1 = (uVar1 ^ uVar1 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar1 >> 6) * 8) >> (uVar1 & 0x3f) & 1) != 0) {
      do {
        puVar2 = (ulong *)(*param_1 + uVar1 * 0x30);
        if (*puVar2 == param_2) {
          if ((int)puVar2[1] == 1) {
            return true;
          }
          if ((int)puVar2[1] == 2) {
            return (char)puVar2[2] == '\0';
          }
          return false;
        }
        uVar1 = uVar1 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar1 >> 6) * 8) >> (uVar1 & 0x3f) & 1) != 0);
    }
  }
  return false;
}

