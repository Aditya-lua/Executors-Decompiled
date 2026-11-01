
void FUN_005a3390(void)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  undefined8 *unaff_x19;
  ulong *unaff_x20;
  ulong uVar4;
  undefined8 unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  ulong uStack0000000000000010;
  undefined8 uStack0000000000000018;
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
  
  uVar4 = unaff_x24 * 8;
  if ((unaff_x24 >> 0x3d != 0) || (0x7ffffffffffffff8 < uVar4)) {
LAB_005a35d8:
    func_0x007a1f00(unaff_x23,uVar4);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5a35ec);
    (*pcVar1)();
  }
  if (uVar4 == 0) {
    uStack0000000000000008 = 0;
    uStack0000000000000010 = 8;
    if ((unaff_x26 & 1) != 0) goto LAB_005a347c;
LAB_005a34c8:
    if (unaff_x25 == 0) goto LAB_005a3550;
    lVar2 = unaff_x19[10];
    lVar3 = unaff_x19[0xc];
LAB_005a34d4:
    uVar4 = (ulong)(lVar3 - lVar2) >> 3;
LAB_005a3548:
    uStack0000000000000018 = 0;
    if (uStack0000000000000008 < uVar4) {
      func_0x007af5a0(&uStack0000000000000008,0,uVar4,8,8);
      goto LAB_005a3554;
    }
  }
  else {
    unaff_x23 = 8;
    uStack0000000000000010 = func_0x00187bd0(uVar4,8);
    if (uStack0000000000000010 == 0) goto LAB_005a35d8;
    uStack0000000000000008 = unaff_x24;
    if ((unaff_x26 & 1) == 0) goto LAB_005a34c8;
LAB_005a347c:
    lVar2 = unaff_x19[5];
    if (unaff_x25 != 0) {
      if (unaff_x19[1] == 0) {
        if (lVar2 == 0) {
          uVar4 = 0;
        }
        else {
          uVar4 = (ulong)(unaff_x19[8] - unaff_x19[6]) >> 3;
        }
      }
      else {
        uVar4 = (ulong)(unaff_x19[4] - unaff_x19[2]) >> 3;
        if (lVar2 != 0) {
          uVar4 = uVar4 + ((ulong)(unaff_x19[8] - unaff_x19[6]) >> 3);
        }
      }
      uVar4 = uVar4 + ((ulong)(unaff_x19[0xc] - unaff_x19[10]) >> 3);
      goto LAB_005a3548;
    }
    if (unaff_x19[1] != 0) {
      uVar4 = (ulong)(unaff_x19[4] - unaff_x19[2]) >> 3;
      if (lVar2 != 0) {
        uVar4 = uVar4 + ((ulong)(unaff_x19[8] - unaff_x19[6]) >> 3);
      }
      goto LAB_005a3548;
    }
    if (lVar2 != 0) {
      lVar2 = unaff_x19[6];
      lVar3 = unaff_x19[8];
      goto LAB_005a34d4;
    }
  }
LAB_005a3550:
  uStack0000000000000018 = 0;
LAB_005a3554:
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
  *(undefined8 **)(unaff_x29 + -0x58) = &uStack0000000000000018;
  *(ulong *)(unaff_x29 + -0x50) = uStack0000000000000018;
  *(ulong *)(unaff_x29 + -0x48) = uStack0000000000000010;
  func_0x005bbe90(&uStack0000000000000020,unaff_x29 + -0x58);
  unaff_x20[1] = uStack0000000000000010;
  *unaff_x20 = uStack0000000000000008;
  unaff_x20[2] = uStack0000000000000018;
  return;
}

