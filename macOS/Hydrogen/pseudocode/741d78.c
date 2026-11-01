
undefined8 FUN_00741d78(void)

{
  int iVar1;
  undefined8 uVar2;
  uint in_w8;
  undefined4 in_w9;
  uint in_w10;
  long unaff_x19;
  int unaff_w20;
  uint unaff_w21;
  uint unaff_w22;
  int unaff_w25;
  
  *(undefined4 *)(unaff_x19 + 0x134) = in_w9;
  if (unaff_w22 != 0x30) {
    func_0x00768170();
    *(undefined8 *)(unaff_x19 + 0xbf0) = 0;
    if (unaff_w25 == 0) {
      (&UNK_00001343)[unaff_x19] = (&UNK_00001343)[unaff_x19] | 2;
    }
    if ((unaff_w21 & 1) == 0) {
      (&UNK_00001343)[unaff_x19] = (&UNK_00001343)[unaff_x19] | 1;
    }
    if (((unaff_w22 != (in_w8 & 0x30)) && (*(long *)(unaff_x19 + 0xd0) != 0)) &&
       (iVar1 = func_0x007681c0(), iVar1 != 0)) {
      uVar2 = 0x2a;
      goto LAB_00741e9c;
    }
  }
  if ((1 < in_w10) || (uVar2 = func_0x00774ca4(), (int)uVar2 == 0)) {
    if (((*(byte *)(unaff_x19 + 0x134) >> 4 & 1) == 0) && (iVar1 = func_0x00774194(), iVar1 != 0)) {
      func_0x00731f7c();
      uVar2 = func_0x00774198();
      if ((int)uVar2 != 0) goto LAB_00741e9c;
    }
    uVar2 = 0;
    if ((unaff_w22 != (in_w8 & 0x30)) && ((*(uint *)(&UNK_00001344 + unaff_x19) >> 0xc & 1) == 0)) {
      uVar2 = func_0x0076afc4();
    }
  }
LAB_00741e9c:
  if (unaff_w20 != 0) {
    func_0x0076bad4();
  }
  return uVar2;
}

