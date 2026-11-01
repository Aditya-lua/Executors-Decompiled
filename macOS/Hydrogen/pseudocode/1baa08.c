
void FUN_001baa08(undefined1 param_1 [16],undefined1 param_2 [16],ulong param_3,long *param_4)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  ulong in_x11;
  undefined4 in_w12;
  undefined8 in_x14;
  ulong in_x17;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x29;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  *(undefined4 *)((long)unaff_x21 + 0x6c) = in_w12;
  unaff_x21[0xe] = in_x14;
  unaff_x21[0x12] = param_2._8_8_;
  unaff_x21[0x11] = param_2._0_8_;
  unaff_x21[0x10] = in_stack_00000028;
  unaff_x21[0xf] = in_stack_00000020;
  if (param_3 <= in_x17) {
    uVar1 = unaff_x21[0xc];
    uVar5 = unaff_x21[0xf];
    uVar4 = unaff_x21[0xe];
    unaff_x19[0xd] = unaff_x21[0xd];
    unaff_x19[0xc] = uVar1;
    unaff_x19[0xf] = uVar5;
    unaff_x19[0xe] = uVar4;
    uVar1 = unaff_x21[0x10];
    unaff_x19[0x11] = unaff_x21[0x11];
    unaff_x19[0x10] = uVar1;
    unaff_x19[0x12] = unaff_x21[0x12];
    uVar1 = unaff_x21[4];
    uVar5 = unaff_x21[7];
    uVar4 = unaff_x21[6];
    unaff_x19[5] = unaff_x21[5];
    unaff_x19[4] = uVar1;
    unaff_x19[7] = uVar5;
    unaff_x19[6] = uVar4;
    uVar1 = unaff_x21[8];
    uVar5 = unaff_x21[0xb];
    uVar4 = unaff_x21[10];
    unaff_x19[9] = unaff_x21[9];
    unaff_x19[8] = uVar1;
    unaff_x19[0xb] = uVar5;
    unaff_x19[10] = uVar4;
    uVar1 = *unaff_x21;
    uVar5 = unaff_x21[3];
    uVar4 = unaff_x21[2];
    unaff_x19[1] = unaff_x21[1];
    *unaff_x19 = uVar1;
    unaff_x19[3] = uVar5;
    unaff_x19[2] = uVar4;
    *(undefined2 *)(unaff_x19 + 0x13) = in_stack_00000000._6_2_;
    return;
  }
  *(undefined1 *)(unaff_x19 + 1) = 0xf;
  unaff_x19[2] = &UNK_0081df60;
  unaff_x19[3] = 0x17;
  *unaff_x19 = unaff_x22;
  uVar3 = in_x11 ^ 0x8000000000000000;
  if (0x15 < uVar3) {
    uVar3 = 1;
  }
  switch(uVar3) {
  case 0:
  case 0xb:
  case 0xc:
  case 0x11:
    break;
  case 1:
    func_0x001ad1a4(unaff_x29 + -0xf0);
    break;
  case 2:
    func_0x0016c2b4(unaff_x23 + 8);
    goto code_r0x001babf4;
  case 3:
    func_0x0016c6d8(unaff_x23 + 8);
    lVar2 = unaff_x21[1];
    if (lVar2 == 0) {
      return;
    }
    uVar1 = unaff_x21[2];
    goto code_r0x001bac20;
  case 4:
    func_0x0016c324(unaff_x23 + 8);
    lVar2 = unaff_x21[1];
    if (lVar2 == 0) {
      return;
    }
    uVar1 = unaff_x21[2];
    goto code_r0x001babd4;
  case 5:
    if (param_4 != (long *)0x0) {
      func_0x00187bd4(unaff_x21[2],param_4,1);
    }
    func_0x0016c428(unaff_x29 + -0xd0);
    if (unaff_x21[4] == 0) {
      return;
    }
    uVar1 = unaff_x21[5];
    lVar2 = unaff_x21[4] * 0x30;
    goto code_r0x001bac74;
  default:
    if (param_4 == (long *)0x8000000000000000) {
      return;
    }
  case 10:
    if (param_4 != (long *)0x0) {
      uVar1 = unaff_x21[2];
code_r0x001baa84:
      func_0x00187bd4(uVar1,param_4,1);
    }
    break;
  case 7:
    if (param_4 == (long *)0x8000000000000000) {
      param_4 = (long *)unaff_x21[2];
      if (param_4 == (long *)0x8000000000000000) {
        return;
      }
      lVar2 = 0x10;
    }
    else {
      func_0x001ad290(unaff_x29 + -200);
      lVar2 = 8;
      param_4 = (long *)unaff_x21[1];
    }
    if (param_4 == (long *)0x0) {
      return;
    }
    uVar1 = *(undefined8 *)(unaff_x29 + lVar2 + -0xe8);
    goto code_r0x001baa84;
  case 8:
    if (param_4 != (long *)0x0) {
      func_0x00187bd4(unaff_x21[2],(long)param_4 << 1,1);
      unaff_x20 = unaff_x21[4];
    }
    if (unaff_x20 != 0) {
      func_0x00187bd4(unaff_x21[5],unaff_x20 << 2,2);
    }
    func_0x0016c818(unaff_x29 + -0xb8);
    lVar2 = unaff_x21[7];
    if (lVar2 == 0) {
      return;
    }
    uVar1 = unaff_x21[8];
code_r0x001babd4:
    lVar2 = lVar2 * 0x18;
    goto code_r0x001bac74;
  case 9:
    if (param_4 != (long *)0x0) {
      func_0x00187bd4(unaff_x21[2],param_4,1);
    }
    func_0x0016c2ec(unaff_x29 + -0xd0);
    goto code_r0x001bab90;
  case 0xe:
    lVar2 = *param_4;
    *param_4 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa0f4(unaff_x23 + 8);
    }
    break;
  case 0xf:
    if (param_4 != (long *)0x0) {
      func_0x00187bd4(unaff_x21[2],param_4,1);
    }
    lVar2 = *(long *)unaff_x21[7];
    *(long *)unaff_x21[7] = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa0f4(unaff_x29 + -0xb8);
    }
    func_0x0016c3c0(unaff_x29 + -0xd0);
code_r0x001bab90:
    lVar2 = unaff_x21[4];
    if (lVar2 == 0) {
      return;
    }
    uVar1 = unaff_x21[5];
code_r0x001bac20:
    lVar2 = lVar2 << 5;
    goto code_r0x001bac74;
  case 0x10:
    func_0x0016c2b4(unaff_x23 + 8);
code_r0x001babf4:
    if (unaff_x21[1] != 0) {
      uVar1 = unaff_x21[2];
      lVar2 = unaff_x21[1] * 0x28;
code_r0x001bac74:
      func_0x00187bd4(uVar1,lVar2,8);
    }
  }
  return;
}

