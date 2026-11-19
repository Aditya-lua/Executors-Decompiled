/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a426c
 */

undefined8 FUN_008a426c(long param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  
  (**(code **)**(undefined8 **)(param_2 + 0x20))(*(undefined8 **)(param_2 + 0x20),param_1);
  if (*(long *)(param_1 + 0x108) != 0) {
    uVar1 = *(ulong *)(param_2 + 0x20);
    uVar2 = ((ulong)(uint)((int)uVar1 << 3) + 8 ^ uVar1 >> 0x20) * -0x622015f714c7d297;
    uVar2 = (uVar1 >> 0x20 ^ uVar2 >> 0x2f ^ uVar2) * -0x622015f714c7d297;
    uVar2 = (uVar2 ^ uVar2 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x110) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0xf8) + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*(long *)(param_1 + 0xe0) + uVar2 * 0x10) == uVar1) {
          FUN_008a63d0(param_1,param_2,*(undefined8 *)(*(long *)(param_1 + 0xe0) + uVar2 * 0x10 + 8)
                      );
          return 0;
        }
        uVar2 = uVar2 + 1 & *(long *)(param_1 + 0x100) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0xf8) + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0
              );
    }
  }
  return 0;
}

