
undefined8 FUN_002de27c(int param_1)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  int unaff_w27;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  ulong in_stack_00000000;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  int in_stack_00000020;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000070;
  
  while (param_1 != 0) {
    iVar2 = (**(code **)(unaff_x25 + 0x20))(&uStack0000000000000030);
    uVar4 = unaff_x22[0x14];
    uVar5 = unaff_x22[0x17];
    uVar3 = unaff_x22[0x16];
    unaff_x24[0x15] = unaff_x22[0x15];
    unaff_x24[0x14] = uVar4;
    unaff_x24[0x17] = uVar5;
    unaff_x24[0x16] = uVar3;
    uVar4 = unaff_x22[0x18];
    unaff_x24[0x19] = unaff_x22[0x19];
    unaff_x24[0x18] = uVar4;
    unaff_x24[0x1a] = unaff_x22[0x1a];
    uVar4 = unaff_x22[0xc];
    uVar5 = unaff_x22[0xf];
    uVar3 = unaff_x22[0xe];
    unaff_x24[0xd] = unaff_x22[0xd];
    unaff_x24[0xc] = uVar4;
    unaff_x24[0xf] = uVar5;
    unaff_x24[0xe] = uVar3;
    uVar4 = unaff_x22[0x10];
    uVar5 = unaff_x22[0x13];
    uVar3 = unaff_x22[0x12];
    unaff_x24[0x11] = unaff_x22[0x11];
    unaff_x24[0x10] = uVar4;
    unaff_x24[0x13] = uVar5;
    unaff_x24[0x12] = uVar3;
    uVar4 = unaff_x22[4];
    uVar5 = unaff_x22[7];
    uVar3 = unaff_x22[6];
    unaff_x24[5] = unaff_x22[5];
    unaff_x24[4] = uVar4;
    unaff_x24[7] = uVar5;
    unaff_x24[6] = uVar3;
    uVar4 = unaff_x22[8];
    uVar5 = unaff_x22[0xb];
    uVar3 = unaff_x22[10];
    unaff_x24[9] = unaff_x22[9];
    unaff_x24[8] = uVar4;
    unaff_x24[0xb] = uVar5;
    unaff_x24[10] = uVar3;
    uVar4 = *unaff_x22;
    uVar5 = unaff_x22[3];
    uVar3 = unaff_x22[2];
    unaff_x24[1] = unaff_x22[1];
    *unaff_x24 = uVar4;
    unaff_x24[3] = uVar5;
    unaff_x24[2] = uVar3;
    *(undefined1 *)(unaff_x19 + 0x53) = 3;
    if ((iVar2 == 0) || ((int)unaff_x26 != in_stack_00000020)) break;
    uVar1 = unaff_x20 - in_stack_00000018;
    if (unaff_x26 <= (ulong)(unaff_x20 - in_stack_00000018)) {
      uVar1 = unaff_x26;
    }
    if (uVar1 != 0) {
      _memcpy(unaff_x21 + in_stack_00000018,&uStack0000000000000030,uVar1);
    }
    in_stack_00000018 = uVar1 + in_stack_00000018;
    if (in_stack_00000018 == unaff_x20) {
      func_0x0036e464(&uStack0000000000000030,0x40);
    }
    uVar1 = (ulong)in_stack_00000010._4_4_;
    in_stack_00000010._4_4_ = in_stack_00000010._4_4_ + 1;
    uVar4 = 1;
    if (in_stack_00000000 <= uVar1) goto code_r0x002de358;
    iVar2 = func_0x002c18e4();
    if ((iVar2 == 0) || (1 < *(byte *)(unaff_x19 + 0x53) - 1)) break;
    *(undefined1 *)(unaff_x19 + 0x53) = 2;
    iVar2 = (**(code **)(unaff_x19[1] + 0x18))();
    if ((iVar2 == 0) || (1 < *(byte *)(unaff_x19 + 0x53) - 1)) break;
    *(undefined1 *)(unaff_x19 + 0x53) = 2;
    iVar2 = (**(code **)(unaff_x19[1] + 0x18))();
    if ((iVar2 == 0) || (1 < *(byte *)(unaff_x19 + 0x53) - 1)) break;
    unaff_x25 = unaff_x19[1];
    in_stack_00000020 = *(int *)(*unaff_x19 + 4);
    iVar2 = (**(code **)(unaff_x25 + 0x20))(&uStack0000000000000070);
    if (iVar2 == 0) break;
    uVar5 = unaff_x28[8];
    uVar3 = unaff_x28[0xb];
    uVar4 = unaff_x28[10];
    unaff_x24[9] = unaff_x28[9];
    unaff_x24[8] = uVar5;
    unaff_x24[0xb] = uVar3;
    unaff_x24[10] = uVar4;
    uVar5 = unaff_x28[4];
    uVar3 = unaff_x28[7];
    uVar4 = unaff_x28[6];
    unaff_x24[5] = unaff_x28[5];
    unaff_x24[4] = uVar5;
    unaff_x24[7] = uVar3;
    unaff_x24[6] = uVar4;
    uVar5 = unaff_x28[0x10];
    uVar3 = unaff_x28[0x13];
    uVar4 = unaff_x28[0x12];
    unaff_x24[0x11] = unaff_x28[0x11];
    unaff_x24[0x10] = uVar5;
    unaff_x24[0x13] = uVar3;
    unaff_x24[0x12] = uVar4;
    uVar5 = unaff_x28[0xc];
    uVar3 = unaff_x28[0xf];
    uVar4 = unaff_x28[0xe];
    unaff_x24[0xd] = unaff_x28[0xd];
    unaff_x24[0xc] = uVar5;
    unaff_x24[0xf] = uVar3;
    unaff_x24[0xe] = uVar4;
    unaff_x24[0x1a] = unaff_x28[0x1a];
    uVar7 = unaff_x28[0x19];
    uVar6 = unaff_x28[0x18];
    uVar5 = unaff_x28[0x15];
    uVar3 = unaff_x28[0x14];
    uVar4 = unaff_x28[0x16];
    unaff_x24[0x17] = unaff_x28[0x17];
    unaff_x24[0x16] = uVar4;
    unaff_x24[0x19] = uVar7;
    unaff_x24[0x18] = uVar6;
    unaff_x24[0x15] = uVar5;
    unaff_x24[0x14] = uVar3;
    uVar4 = *unaff_x28;
    uVar5 = unaff_x28[3];
    uVar3 = unaff_x28[2];
    unaff_x24[1] = unaff_x28[1];
    *unaff_x24 = uVar4;
    unaff_x24[3] = uVar5;
    unaff_x24[2] = uVar3;
    param_1 = (**(code **)(unaff_x19[1] + 0x18))();
  }
  func_0x0036e464(&uStack0000000000000030,0x40);
  if (unaff_w27 != 0) {
    func_0x0036e464();
  }
  uVar3 = 0;
  uVar4 = 0;
  if (unaff_x19 != (long *)0x0) {
code_r0x002de358:
    uVar3 = uVar4;
    func_0x0036e464();
    func_0x0036e3d8();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar3;
  }
  ___stack_chk_fail(uVar3);
  func_0x00373e9c(0xa295f8,&DAT_002de3d8);
  return 0xa3a540;
}

