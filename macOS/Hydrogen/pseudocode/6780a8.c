
void FUN_006780a8(long param_1)

{
  long lVar1;
  int iVar2;
  ulong in_x9;
  uint in_w10;
  long in_x11;
  ulong *in_x12;
  ulong in_x13;
  ulong uVar3;
  long in_x14;
  long unaff_x19;
  long unaff_x20;
  
  while( true ) {
    uVar3 = in_x13 | *(long *)(in_x11 + (*in_x12 >> 0x24 & 0xf) * 8) << 8;
    *(ulong *)(unaff_x20 + in_x14) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0x28 & 0xf) * 8) << 0x10;
    *(ulong *)(unaff_x20 + in_x14) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0x2c & 0xf) * 8) << 0x18;
    *(ulong *)(unaff_x20 + in_x14) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + ((ulong)*(ushort *)((long)in_x12 + 6) & 0xf) * 8) << 0x20;
    *(ulong *)(unaff_x20 + in_x14) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0x34 & 0xf) * 8) << 0x28;
    *(ulong *)(unaff_x20 + in_x14) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + ((ulong)*(byte *)((long)in_x12 + 7) & 0xf) * 8) << 0x30;
    *(ulong *)(unaff_x20 + in_x14) = uVar3;
    *(ulong *)(unaff_x20 + in_x14) = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0x39 & 0x78)) << 0x38;
    uVar3 = (ulong)in_w10;
    in_w10 = in_w10 + 1;
    iVar2 = (int)in_x9;
    in_x9 = (ulong)(iVar2 + 2);
    if (*(ulong *)(unaff_x19 + 0x10) <= uVar3) break;
    in_x12 = (ulong *)(param_1 + uVar3 * 8);
    lVar1 = (ulong)(iVar2 + 1) * 8;
    uVar3 = *(ulong *)(unaff_x20 + lVar1) | *(ulong *)(in_x11 + (*in_x12 & 0xf) * 8);
    *(ulong *)(unaff_x20 + lVar1) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 4 & 0xf) * 8) << 8;
    *(ulong *)(unaff_x20 + lVar1) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 8 & 0xf) * 8) << 0x10;
    *(ulong *)(unaff_x20 + lVar1) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0xc & 0xf) * 8) << 0x18;
    *(ulong *)(unaff_x20 + lVar1) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0x10 & 0xf) * 8) << 0x20;
    *(ulong *)(unaff_x20 + lVar1) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0x14 & 0xf) * 8) << 0x28;
    *(ulong *)(unaff_x20 + lVar1) = uVar3;
    uVar3 = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0x18 & 0xf) * 8) << 0x30;
    *(ulong *)(unaff_x20 + lVar1) = uVar3;
    *(ulong *)(unaff_x20 + lVar1) = uVar3 | *(long *)(in_x11 + (*in_x12 >> 0x1c & 0xf) * 8) << 0x38;
    in_x14 = in_x9 * 8;
    in_x13 = *(ulong *)(unaff_x20 + in_x14) |
             *(ulong *)(in_x11 + ((ulong)*(uint *)((long)in_x12 + 4) & 0xf) * 8);
    *(ulong *)(unaff_x20 + in_x14) = in_x13;
  }
  return;
}

