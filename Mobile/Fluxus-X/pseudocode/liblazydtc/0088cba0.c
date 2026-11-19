/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088cba0
 */

byte FUN_0088cba0(long param_1,ulong param_2)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  ulong uVar5;
  
  uVar5 = *(long *)(param_1 + 0x688) - *(long *)(param_1 + 0x680) >> 3;
  if (uVar5 <= param_2) {
    return 0;
  }
  do {
    if (*(long *)(param_1 + 200) != 0) {
      uVar2 = *(ulong *)(*(long *)(param_1 + 0x680) + param_2 * 8);
      uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
      uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
      for (uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >>
                   ((ulong)*(byte *)(param_1 + 0xd0) & 0x3f);
          (*(ulong *)(*(long *)(param_1 + 0xb8) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0;
          uVar3 = uVar3 + 1 & *(long *)(param_1 + 0xc0) - 1U) {
        puVar4 = (ulong *)(*(long *)(param_1 + 0xa0) + uVar3 * 0x18);
        if (*puVar4 == uVar2) goto LAB_0088cc54;
      }
    }
    puVar4 = (ulong *)0x0;
LAB_0088cc54:
    puVar1 = (ulong *)0x0;
    if (puVar4 != (ulong *)0x0) {
      puVar1 = puVar4 + 1;
    }
    if (((*(byte *)((long)puVar1 + 2) & 1) != 0) || (param_2 = param_2 + 1, param_2 == uVar5)) {
      return *(byte *)((long)puVar1 + 2);
    }
  } while( true );
}

