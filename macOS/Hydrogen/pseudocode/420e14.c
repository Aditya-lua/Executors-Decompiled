
void FUN_00420e14(void)

{
  uint uVar1;
  code *pcVar2;
  uint in_w8;
  int in_w9;
  undefined4 in_w12;
  undefined8 in_x13;
  undefined4 in_w14;
  undefined4 uVar3;
  undefined4 *unaff_x19;
  undefined4 unaff_w20;
  undefined8 in_stack_00000008;
  
  if (in_w9 == 2) {
    if (in_w8 < 0x10) {
      func_0x007a247c(&UNK_008874bb,0x34,&UNK_009dbbe8);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x420f08);
      (*pcVar2)();
    }
    uVar1 = (uint)(in_stack_00000008._2_2_ >> 8) | (in_stack_00000008._2_2_ & 0xff00ff) << 8;
    uVar3 = 0;
    unaff_x19[1] = unaff_w20;
    *(long *)(unaff_x19 + 2) = CONCAT44(uVar1,in_stack_00000008._4_4_) << 0x10;
    *(undefined8 *)(unaff_x19 + 4) = in_x13;
    unaff_x19[6] = in_w14;
    unaff_x19[7] = in_stack_00000008._4_4_;
    unaff_x19[8] = in_w12;
    *(short *)(unaff_x19 + 9) = (short)uVar1;
  }
  else {
    _close();
    *(undefined **)(unaff_x19 + 2) = &UNK_009dbc18;
    uVar3 = 1;
  }
  *unaff_x19 = uVar3;
  return;
}

