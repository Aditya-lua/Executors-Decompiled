
long FUN_006fbf74(undefined8 param_1,long param_2,long param_3)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x21;
  uint unaff_w23;
  ulong uVar4;
  undefined4 uStack000000000000000c;
  
  uVar4 = (ulong)(unaff_w23 & 0xffff | 0x4e80000);
  lVar2 = *(long *)(param_2 + 0x20) +
          (ulong)(*(int *)(param_3 + 0x10) + (int)(int *)(param_3 + 0x10) &
                 (-1 << (ulong)(*(byte *)(param_2 + 6) & 0x1f) ^ 0xffffffffU)) * 0x20;
  uVar1 = *(uint *)(lVar2 + 0x1c);
  while( true ) {
    if (((uVar1 & 0xf) == 5) && (*(long *)(lVar2 + 0x10) == unaff_x21)) goto LAB_006fbfe8;
    if (uVar1 < 0x10) break;
    lVar2 = lVar2 + ((long)((ulong)uVar1 << 0x20) >> 0x24) * 0x20;
    uVar1 = *(uint *)(lVar2 + 0x1c);
  }
  lVar2 = __dyld_get_image_header(0);
  lVar2 = lVar2 + uVar4;
LAB_006fbfe8:
  *(undefined1 *)(unaff_x19 + 3) = 0;
  lVar3 = __dyld_get_image_header(0);
  if (lVar2 == lVar3 + uVar4) {
    uStack000000000000000c = 5;
    lVar2 = func_0x006fbc58();
  }
  return lVar2;
}

