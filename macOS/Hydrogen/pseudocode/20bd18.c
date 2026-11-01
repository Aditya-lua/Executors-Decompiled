
ulong FUN_0020bd18(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *unaff_x19;
  ulong uVar3;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x29;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000050;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  ulong in_stack_00000090;
  undefined1 uStack00000000000000a0;
  
  uStack0000000000000078 = *(undefined8 *)(unaff_x21 + 0x28);
  uStack0000000000000070 = *(undefined8 *)(unaff_x21 + 0x20);
  uStack0000000000000088 = *(undefined8 *)(unaff_x21 + 0x38);
  uStack0000000000000080 = *(undefined8 *)(unaff_x21 + 0x30);
  uVar3 = *(ulong *)(param_1 + 8);
  _uStack0000000000000050 = param_2;
  uStack0000000000000060 = param_3;
  func_0x00276f14(unaff_x22 | 8);
  in_stack_00000090 = uVar3;
  if (uVar3 < 0x41) {
    *(undefined8 *)(unaff_x21 + 0x78) = 0;
    *(undefined8 *)(unaff_x21 + 0x70) = 0;
    *(undefined8 *)(unaff_x21 + 0x88) = 0;
    *(undefined8 *)(unaff_x21 + 0x80) = 0;
    *(undefined8 *)(unaff_x21 + 0x58) = 0;
    *(undefined8 *)(unaff_x21 + 0x50) = 0;
    *(undefined8 *)(unaff_x21 + 0x68) = 0;
    *(undefined8 *)(unaff_x21 + 0x60) = 0;
    *(ulong *)(unaff_x29 + -0x40) = uVar3;
    uVar3 = _memcpy(unaff_x29 + -0x80,&uStack0000000000000050,uVar3);
    uVar1 = *(undefined8 *)(unaff_x21 + 0x70);
    uVar5 = *(undefined8 *)(unaff_x21 + 0x88);
    uVar4 = *(undefined8 *)(unaff_x21 + 0x80);
    unaff_x19[5] = *(undefined8 *)(unaff_x21 + 0x78);
    unaff_x19[4] = uVar1;
    unaff_x19[7] = uVar5;
    unaff_x19[6] = uVar4;
    unaff_x19[8] = *(undefined8 *)(unaff_x29 + -0x40);
    uVar5 = *(undefined8 *)(unaff_x21 + 0x50);
    uVar4 = *(undefined8 *)(unaff_x21 + 0x68);
    uVar1 = *(undefined8 *)(unaff_x21 + 0x60);
    unaff_x19[1] = *(undefined8 *)(unaff_x21 + 0x58);
    *unaff_x19 = uVar5;
    unaff_x19[3] = uVar4;
    unaff_x19[2] = uVar1;
    return uVar3;
  }
  func_0x007a28b0(uVar3,0x40,&UNK_009c6570);
  func_0x00276f14(unaff_x22 | 8);
  uVar1 = func_0x007a2810(&UNK_008277af,0x16,&uStack00000000000000a0,&UNK_009c6488,&UNK_009c6558);
  func_0x00276f14(&uStack0000000000000010);
  __Unwind_Resume(uVar1);
  func_0x007a2668();
  lVar2 = func_0x0027c52c();
  return (ulong)(lVar2 == 0);
}

