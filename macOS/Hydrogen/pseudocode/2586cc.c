
void FUN_002586cc(void)

{
  ushort uVar1;
  undefined1 uVar2;
  uint uVar3;
  long unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  
  func_0x00469240(&uStack0000000000000008);
  uVar1 = *(ushort *)(unaff_x19 + 8);
  uVar3 = (uint)uVar1;
  if (uVar1 < 7) {
    if (uVar1 < 3) {
      if ((uVar1 != 0) && (uVar3 == 1)) goto LAB_00258728;
    }
    else if (uVar1 < 5) {
      if (uVar3 == 3) {
LAB_00258728:
        uVar2 = 3;
        goto LAB_00258754;
      }
    }
    else if (uVar1 == 5) goto LAB_00258728;
LAB_00258750:
    uVar2 = 1;
  }
  else {
    if (uVar1 < 0xb) {
      if (2 < uVar3 - 8) goto LAB_00258728;
      goto LAB_00258750;
    }
    if (uVar1 == 0xb) {
      uVar2 = 4;
    }
    else {
      if (uVar1 != 0xc) {
        *(undefined2 *)(unaff_x29 + -0x12) = 6;
        goto LAB_00258758;
      }
      uVar2 = 5;
    }
  }
LAB_00258754:
  *(undefined1 *)(unaff_x29 + -0x12) = uVar2;
LAB_00258758:
  func_0x004653b0(&uStack0000000000000008,&UNK_0082a9a4,9,unaff_x29 + -0x12,&UNK_009cab58);
  func_0x00465628();
  return;
}

