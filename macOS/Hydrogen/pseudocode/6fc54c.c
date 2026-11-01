
void FUN_006fc54c(long param_1)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  int in_w9;
  long unaff_x19;
  
  uVar2 = in_w9 << (ulong)((uint)param_1 & 0x1f);
  *(uint *)(unaff_x19 + 0xc) = uVar2;
  if (param_1 != 0x1f) {
    lVar3 = 0;
    if ((int)uVar2 < 2) {
      uVar2 = 1;
    }
    do {
      lVar1 = *(long *)(unaff_x19 + 0x20) + lVar3;
      *(undefined4 *)(lVar1 + 0xc) = 0;
      *(undefined4 *)(lVar1 + 0x1c) = 0;
      lVar3 = lVar3 + 0x20;
    } while ((ulong)uVar2 * 0x20 != lVar3);
  }
  *(undefined1 *)(unaff_x19 + 3) = 0xff;
  return;
}

