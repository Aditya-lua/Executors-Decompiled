
void FUN_006fc4d0(long param_1)

{
  uint uVar1;
  long lVar2;
  long in_x9;
  undefined4 *puVar3;
  long in_x10;
  long unaff_x19;
  long lVar4;
  
  puVar3 = (undefined4 *)(in_x9 + 0x2c);
  lVar2 = in_x10;
  do {
    puVar3[-8] = 0;
    puVar3[-4] = 0;
    *puVar3 = 0;
    puVar3[4] = 0;
    puVar3 = puVar3 + 0x10;
    lVar2 = lVar2 + -4;
  } while (lVar2 != 0);
  if (in_x10 != param_1) {
    param_1 = param_1 - in_x10;
    puVar3 = (undefined4 *)(in_x9 + in_x10 * 0x10 + 0xc);
    do {
      *puVar3 = 0;
      param_1 = param_1 + -1;
      puVar3 = puVar3 + 4;
    } while (param_1 != 0);
  }
  if (*(int *)(unaff_x19 + 0xc) < 1) {
    *(undefined4 *)(unaff_x19 + 0xc) = 0;
  }
  lVar4 = *(long *)(unaff_x19 + 0x20);
  lVar2 = __dyld_get_image_header(0);
  if (lVar4 != lVar2 + 0x4e8dec0) {
    uVar1 = 1 << (ulong)(*(byte *)(unaff_x19 + 6) & 0x1f);
    *(uint *)(unaff_x19 + 0xc) = uVar1;
    if (*(byte *)(unaff_x19 + 6) != 0x1f) {
      lVar2 = 0;
      if ((int)uVar1 < 2) {
        uVar1 = 1;
      }
      do {
        lVar4 = *(long *)(unaff_x19 + 0x20) + lVar2;
        *(undefined4 *)(lVar4 + 0xc) = 0;
        *(undefined4 *)(lVar4 + 0x1c) = 0;
        lVar2 = lVar2 + 0x20;
      } while ((ulong)uVar1 * 0x20 != lVar2);
    }
  }
  *(undefined1 *)(unaff_x19 + 3) = 0xff;
  return;
}

