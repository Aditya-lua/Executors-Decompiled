/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088dca8
 */

ulong FUN_0088dca8(long param_1,ulong param_2)

{
  ulong uVar1;
  ulong *puVar2;
  
  if (*(long *)(param_1 + 200) != 0) {
    uVar1 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar1 = (param_2 >> 0x20 ^ uVar1 >> 0x2f ^ uVar1) * -0x622015f714c7d297;
    uVar1 = (uVar1 ^ uVar1 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0xd0) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0xb8) + (uVar1 >> 6) * 8) >> (uVar1 & 0x3f) & 1) != 0) {
      do {
        puVar2 = (ulong *)(*(long *)(param_1 + 0xa0) + uVar1 * 0x18);
        if (*puVar2 == param_2) {
          if (*(char *)((long)puVar2 + 9) == '\x01') {
            return (ulong)(byte)puVar2[1];
          }
          return 0xffffffff;
        }
        uVar1 = uVar1 + 1 & *(long *)(param_1 + 0xc0) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0xb8) + (uVar1 >> 6) * 8) >> (uVar1 & 0x3f) & 1) != 0
              );
    }
  }
  return 0xffffffff;
}

