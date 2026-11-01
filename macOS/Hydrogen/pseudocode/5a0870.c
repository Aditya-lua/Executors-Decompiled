
void FUN_005a0870(undefined8 param_1)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  ulong unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  
  _uStack0000000000000018 = 0;
  if ((unaff_x26 & 1) == 0) {
    if (unaff_x25 == 0) goto LAB_005a0950;
    lVar2 = unaff_x19[10];
    lVar3 = unaff_x19[0xc];
LAB_005a08d0:
    uVar1 = (ulong)(lVar3 - lVar2) >> 3;
  }
  else {
    lVar2 = unaff_x19[5];
    if (unaff_x25 == 0) {
      if (unaff_x19[1] == 0) {
        if (lVar2 == 0) goto LAB_005a0950;
        lVar2 = unaff_x19[6];
        lVar3 = unaff_x19[8];
        goto LAB_005a08d0;
      }
      uVar1 = (ulong)(unaff_x19[4] - unaff_x19[2]) >> 3;
      if (lVar2 != 0) {
        uVar1 = uVar1 + ((ulong)(unaff_x19[8] - unaff_x19[6]) >> 3);
      }
    }
    else {
      if (unaff_x19[1] == 0) {
        if (lVar2 == 0) {
          uVar1 = 0;
        }
        else {
          uVar1 = (ulong)(unaff_x19[8] - unaff_x19[6]) >> 3;
        }
      }
      else {
        uVar1 = (ulong)(unaff_x19[4] - unaff_x19[2]) >> 3;
        if (lVar2 != 0) {
          uVar1 = uVar1 + ((ulong)(unaff_x19[8] - unaff_x19[6]) >> 3);
        }
      }
      uVar1 = uVar1 + ((ulong)(unaff_x19[0xc] - unaff_x19[10]) >> 3);
    }
  }
  if (unaff_x24 < uVar1) {
    func_0x007af5a0(&uStack0000000000000008,0,uVar1,8,8);
    param_1 = in_stack_00000010;
  }
LAB_005a0950:
  in_stack_00000068 = unaff_x19[9];
  in_stack_00000060 = unaff_x19[8];
  in_stack_00000078 = unaff_x19[0xb];
  in_stack_00000070 = unaff_x19[10];
  in_stack_00000080 = unaff_x19[0xc];
  in_stack_00000028 = unaff_x19[1];
  uStack0000000000000020 = *unaff_x19;
  in_stack_00000038 = unaff_x19[3];
  in_stack_00000030 = unaff_x19[2];
  in_stack_00000048 = unaff_x19[5];
  in_stack_00000040 = unaff_x19[4];
  in_stack_00000058 = unaff_x19[7];
  in_stack_00000050 = unaff_x19[6];
  *(undefined1 **)(unaff_x29 + -0x58) = &uStack0000000000000018;
  *(undefined8 *)(unaff_x29 + -0x50) = _uStack0000000000000018;
  *(undefined8 *)(unaff_x29 + -0x48) = param_1;
  func_0x005bbe90(&uStack0000000000000020,unaff_x29 + -0x58);
  unaff_x20[1] = in_stack_00000010;
  *unaff_x20 = uStack0000000000000008;
  unaff_x20[2] = _uStack0000000000000018;
  return;
}

