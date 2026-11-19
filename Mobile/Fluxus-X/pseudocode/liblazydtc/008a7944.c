/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a7944
 */

undefined8 FUN_008a7944(long param_1,ulong param_2)

{
  ulong uVar1;
  long lVar2;
  
  if (*(long *)(param_1 + 0x108) != 0) {
    uVar1 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar1 = (param_2 >> 0x20 ^ uVar1 >> 0x2f ^ uVar1) * -0x622015f714c7d297;
    uVar1 = (uVar1 ^ uVar1 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x110) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0xf8) + (uVar1 >> 6) * 8) >> (uVar1 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*(long *)(param_1 + 0xe0) + uVar1 * 0x10) == param_2) {
          lVar2 = *(long *)(*(long *)(param_1 + 0xe0) + uVar1 * 0x10 + 8);
          if (lVar2 == 0) {
            return 0;
          }
          if (*(int *)(lVar2 + 8) == DAT_00d1b250) {
            return *(undefined8 *)(lVar2 + 0x30);
          }
          return 0;
        }
        uVar1 = uVar1 + 1 & *(long *)(param_1 + 0x100) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0xf8) + (uVar1 >> 6) * 8) >> (uVar1 & 0x3f) & 1) != 0
              );
    }
  }
  return 0;
}

