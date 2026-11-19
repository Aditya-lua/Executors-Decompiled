/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00899e00
 */

undefined8 FUN_00899e00(long param_1,ulong param_2)

{
  ulong *puVar1;
  ulong uVar2;
  ulong *puVar3;
  ulong uVar4;
  ulong *puVar5;
  
  if (*(long *)(param_1 + 0x90) == 0) {
    return 0;
  }
  uVar2 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
  uVar2 = (param_2 >> 0x20 ^ uVar2 >> 0x2f ^ uVar2) * -0x622015f714c7d297;
  uVar2 = (uVar2 ^ uVar2 >> 0x2f) * -0x6b622cb0470b6a63;
  uVar4 = uVar2 >> ((ulong)*(byte *)(param_1 + 0x98) & 0x3f);
  if ((*(ulong *)(*(long *)(param_1 + 0x80) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) == 0) {
    return 0;
  }
  while (puVar3 = (ulong *)(*(long *)(param_1 + 0x68) + uVar4 * 0x50), *puVar3 != param_2) {
    uVar4 = uVar4 + 1 & *(long *)(param_1 + 0x88) - 1U;
    if ((*(ulong *)(*(long *)(param_1 + 0x80) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) == 0) {
      return 0;
    }
  }
  if ((DAT_00d1ec80 == '\x01') && (*(long *)(param_1 + 0xd28) != 0)) {
    uVar2 = uVar2 >> ((ulong)*(byte *)(param_1 + 0xd30) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0xd18) + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*(long *)(param_1 + 0xd00) + uVar2 * 0x20) == param_2) {
          return 0;
        }
        uVar2 = uVar2 + 1 & *(long *)(param_1 + 0xd20) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0xd18) + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) !=
               0);
    }
  }
  puVar1 = (ulong *)puVar3[2];
  puVar3 = (ulong *)puVar3[3];
  while( true ) {
    if (puVar1 == puVar3) {
      return 1;
    }
    if (*(long *)(param_1 + 0x138) == 0) {
      return 0;
    }
    uVar2 = *puVar1;
    uVar4 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
    uVar4 = (uVar2 >> 0x20 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
    uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x140) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) == 0) {
      return 0;
    }
    while (puVar5 = (ulong *)(*(long *)(param_1 + 0x110) + uVar4 * 0x28), *puVar5 != uVar2) {
      uVar4 = uVar4 + 1 & *(long *)(param_1 + 0x130) - 1U;
      if ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) == 0) {
        return 0;
      }
    }
    if ((puVar5[4] & 1) != 0) break;
    if ((*(long *)(uVar2 + 0x20) != 0) || (*(long *)(uVar2 + 0x28) != 0)) {
      uVar2 = puVar5[1];
      if (uVar2 == 0) {
        return 0;
      }
      if (*(int *)(uVar2 + 8) != DAT_00d1b070) {
        return 0;
      }
      if ((uVar2 != param_2) && (uVar2 = FUN_00899e00(param_1,uVar2), (uVar2 & 1) == 0)) {
        return 0;
      }
    }
    puVar1 = puVar1 + 1;
  }
  return 0;
}

