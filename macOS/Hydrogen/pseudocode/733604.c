
ulong FUN_00733604(undefined8 param_1)

{
  int iVar1;
  code *unaff_x19;
  long unaff_x21;
  code *unaff_x22;
  ulong uVar2;
  long unaff_x24;
  
  while (iVar1 = (*unaff_x22)(param_1), iVar1 == 0) {
    uVar2 = (ulong)(unaff_x24 != 0);
    if (unaff_x24 == 0) goto code_r0x00733614;
    param_1 = func_0x00156654(unaff_x24);
    unaff_x24 = func_0x006f4058(unaff_x24);
  }
  uVar2 = 1;
code_r0x00733614:
  if (unaff_x19 != (code *)0x0) {
    uVar2 = (*unaff_x19)(uVar2);
  }
  *(byte *)(unaff_x21 + 0x98) = *(byte *)(unaff_x21 + 0x98) & 0xfe;
  if ((*(long *)(unaff_x21 + 0x88) == 0) ||
     ((*(byte *)(*(long *)(unaff_x21 + 0x88) + 4) >> 5 & 1) == 0)) {
    return uVar2;
  }
  func_0x00779d40(*(undefined8 *)(unaff_x21 + 0x78),5);
  return uVar2;
}

