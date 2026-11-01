
void FUN_00233908(undefined8 *param_1,long param_2,long *param_3)

{
  long lVar1;
  byte bVar2;
  ulong uVar3;
  uint uVar4;
  undefined1 uVar5;
  long unaff_x22;
  ulong unaff_x23;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined4 uStack0000000000000024;
  uint in_stack_00000028;
  uint uStack000000000000002c;
  undefined4 uStack0000000000000030;
  undefined1 uStack0000000000000034;
  undefined8 uStack0000000000000038;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000041;
  undefined1 uStack0000000000000042;
  undefined1 uStack0000000000000043;
  undefined1 uStack0000000000000044;
  undefined1 uStack0000000000000045;
  undefined1 uStack0000000000000046;
  undefined1 uStack0000000000000047;
  undefined1 uStack0000000000000048;
  undefined8 uStack0000000000000049;
  uint uStack0000000000000051;
  
  lVar1 = param_3[2];
  if (*param_3 != 0) {
    lVar1 = param_3[3] - param_3[2];
  }
  lVar1 = lVar1 + 0x11;
  func_0x00256a48(&uStack0000000000000008,lVar1);
  uVar3 = (unaff_x23 & 0xff00ff00ff00ff00) >> 8 | (unaff_x23 & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  uVar4 = (uint)(uVar3 >> 0x20);
  in_stack_00000028 =
       (*(byte *)(param_2 + 0x24) ^ uVar4) & 0xff |
       (((uint)*(byte *)(param_2 + 0x25) ^ uVar4 >> 8) & 0xff) << 8 |
       (((uint)*(byte *)(param_2 + 0x26) ^ uVar4 >> 0x10) & 0xff) << 0x10 |
       ((uint)*(byte *)(param_2 + 0x27) ^ uVar4 >> 0x18) << 0x18;
  uStack000000000000002c =
       (uint)(((ulong)((uint)*(byte *)(param_2 + 0x29) ^ (uint)(uVar3 >> 8) & 0xff) << 0x28) >> 0x20
             ) | (uint)*(byte *)(param_2 + 0x28) ^ (uint)uVar3 & 0xff |
       (uint)(((ulong)((uint)*(byte *)(param_2 + 0x2a) ^ (uint)(uVar3 >> 0x10) & 0xff) << 0x30) >>
             0x20) |
       (uint)(((ulong)((uint)*(byte *)(param_2 + 0x2b) ^ (uint)(uVar3 >> 0x18) & 0xff) << 0x38) >>
             0x20);
  uStack0000000000000024 = *(undefined4 *)(param_2 + 0x20);
  func_0x00256b38(&uStack0000000000000008);
  bVar2 = *(byte *)(unaff_x22 + 0x20);
  if (bVar2 < 3) {
    if (bVar2 == 0) {
      uVar5 = 0x14;
    }
    else if (bVar2 == 1) {
      uVar5 = 0x15;
    }
    else {
      uVar5 = 0x16;
    }
  }
  else if (bVar2 == 3) {
    uVar5 = 0x17;
  }
  else if (bVar2 == 4) {
    uVar5 = 0x18;
  }
  else {
    uVar5 = *(undefined1 *)(unaff_x22 + 0x21);
  }
  if (uStack0000000000000008 == in_stack_00000018) {
    func_0x0079b61c(&uStack0000000000000008,in_stack_00000018,1,1,1);
  }
  *(undefined1 *)(in_stack_00000010 + in_stack_00000018) = uVar5;
  in_stack_00000018 = in_stack_00000018 + 1;
  uStack0000000000000049 = CONCAT44(in_stack_00000028,uStack0000000000000024);
  uStack0000000000000051 = uStack000000000000002c;
  uStack0000000000000030 = (int)((ulong)lVar1 >> 8) << 0x18 | 0x30317;
  uStack0000000000000034 = (undefined1)lVar1;
  uStack0000000000000048 = 1;
  func_0x002320ac((long)&uStack0000000000000038 + 3,*(undefined8 *)(param_2 + 8),
                  *(undefined8 *)(param_2 + 0x10),&uStack0000000000000048,&uStack0000000000000030,
                  &uStack0000000000000008);
  if (uStack0000000000000038._3_1_ == '\x01') {
    *param_1 = 0x8000000000000018;
    if (uStack0000000000000008 != 0) {
      func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
    }
  }
  else {
    *(undefined1 *)(unaff_x29 + -0x31) = uStack0000000000000038._5_1_;
    *(undefined1 *)(unaff_x29 + -0x32) = uStack0000000000000038._6_1_;
    *(undefined1 *)(unaff_x29 + -0x33) = uStack0000000000000038._7_1_;
    *(undefined1 *)(unaff_x29 + -0x34) = uStack0000000000000040;
    *(undefined1 *)(unaff_x29 + -0x35) = uStack0000000000000041;
    *(undefined1 *)(unaff_x29 + -0x36) = uStack0000000000000042;
    *(undefined1 *)(unaff_x29 + -0x37) = uStack0000000000000043;
    *(undefined1 *)(unaff_x29 + -0x38) = uStack0000000000000044;
    *(undefined1 *)(unaff_x29 + -0x39) = uStack0000000000000045;
    *(undefined1 *)(unaff_x29 + -0x3a) = uStack0000000000000046;
    *(undefined1 *)(unaff_x29 + -0x3b) = uStack0000000000000047;
    *(undefined1 *)(unaff_x29 + -0x31) = 0;
    *(undefined1 *)(unaff_x29 + -0x32) = 0;
    *(undefined1 *)(unaff_x29 + -0x33) = 0;
    *(undefined1 *)(unaff_x29 + -0x34) = 0;
    *(undefined1 *)(unaff_x29 + -0x35) = 0;
    *(undefined1 *)(unaff_x29 + -0x36) = 0;
    *(undefined1 *)(unaff_x29 + -0x37) = 0;
    *(undefined1 *)(unaff_x29 + -0x38) = 0;
    *(undefined1 *)(unaff_x29 + -0x39) = 0;
    *(undefined1 *)(unaff_x29 + -0x3a) = 0;
    *(undefined1 *)(unaff_x29 + -0x3b) = 0;
    param_1[2] = in_stack_00000010;
    param_1[1] = uStack0000000000000008;
    param_1[3] = in_stack_00000018;
    *(undefined2 *)(param_1 + 4) = 4;
    *(undefined1 *)((long)param_1 + 0x24) = 3;
    *param_1 = 0x8000000000000027;
  }
  return;
}

