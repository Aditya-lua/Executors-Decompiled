
ulong FUN_006ed664(long param_1,long param_2)

{
  uint uVar1;
  long in_x9;
  uint in_w10;
  long in_x11;
  long in_x12;
  ulong in_x13;
  ulong unaff_x19;
  uint uVar2;
  uint uVar3;
  ulong unaff_x20;
  ulong uVar4;
  undefined8 *puVar5;
  
  for (; uVar2 = (uint)unaff_x19, in_x9 != in_x11; in_x11 = in_x11 + 1) {
    if (*(char *)(in_x12 + in_x11 * 4) != 'A') {
      uVar1 = *(int *)((*(ulong *)(param_2 + 0x40) ^ in_x13) +
                      (ulong)((uint)in_x11 >> (ulong)(*(uint *)(param_2 + 0xa0) & 0x1f)) * 4) +
              (uint)*(byte *)(param_1 + in_x11);
      if (uVar1 == uVar2) {
        return unaff_x19;
      }
      if ((int)uVar2 < (int)uVar1) {
        uVar2 = (uint)unaff_x20;
        if ((int)uVar2 <= (int)uVar1 && uVar2 != in_w10) {
          uVar1 = uVar2;
        }
        unaff_x20 = (ulong)uVar1;
      }
    }
  }
  uVar4 = (ulong)*(uint *)(param_2 + 0x8c);
  if (0 < (int)*(uint *)(param_2 + 0x8c)) {
    puVar5 = *(undefined8 **)(param_2 + 0x18);
    do {
      uVar1 = func_0x006ed614(*puVar5);
      if (uVar1 == uVar2) {
        return unaff_x19;
      }
      uVar3 = (uint)unaff_x20;
      if ((int)uVar3 <= (int)uVar1 && uVar3 != 0xffffffff || (int)uVar1 <= (int)uVar2) {
        uVar1 = uVar3;
      }
      unaff_x20 = (ulong)uVar1;
      puVar5 = puVar5 + 1;
      uVar4 = uVar4 - 1;
    } while (uVar4 != 0);
  }
  return unaff_x20;
}

