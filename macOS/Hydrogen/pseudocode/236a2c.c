
void FUN_00236a2c(undefined8 *param_1,undefined8 param_2,undefined8 param_3,code *param_4,
                 undefined8 param_5)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  code *pcVar4;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  undefined4 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined1 uStack0000000000000064;
  undefined1 uStack0000000000000066;
  undefined1 uStack0000000000000067;
  undefined8 uStack0000000000000068;
  undefined8 in_stack_00000070;
  undefined1 *in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined *in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined *in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined1 *in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined1 uStack00000000000000cf;
  
  auVar5 = (*param_4)(param_3);
  puVar3 = auVar5._8_8_;
  uVar2 = auVar5._0_8_;
  _uStack0000000000000064 =
       (ushort)((ulong)param_5 >> 8) & 0xff | (ushort)(((uint)param_5 & 0xff00ff) << 8);
  uStack0000000000000066 = 9;
  uStack0000000000000067 = 0;
  uStack0000000000000068 = &uStack0000000000000064;
  in_stack_00000070 = 2;
  in_stack_00000078 = &uStack0000000000000066;
  in_stack_00000080 = 1;
  in_stack_00000088 = &UNK_008294b3;
  in_stack_00000090 = 6;
  in_stack_00000098 = &UNK_00829376;
  in_stack_000000a0 = 3;
  in_stack_000000a8 = &uStack0000000000000067;
  in_stack_000000b0 = 1;
  in_stack_000000b8 = 1;
  in_stack_000000c0 = 0;
  pcVar4 = (code *)puVar3[3];
  iVar1 = (*pcVar4)(uVar2,&uStack0000000000000068,6);
  if (iVar1 == 0) {
    _uStack0000000000000038 = 0;
    uStack0000000000000030 = 0;
    in_stack_00000048 = 0;
    in_stack_00000040 = 0;
    in_stack_00000050 = 0x20;
    func_0x00226d44(&uStack0000000000000030,param_5);
    _uStack0000000000000064 = 0xc00;
    uStack0000000000000066 = 8;
    uStack0000000000000067 = 0;
    uStack0000000000000068 = &uStack0000000000000064;
    in_stack_00000070 = 2;
    in_stack_00000078 = &uStack0000000000000066;
    in_stack_00000080 = 1;
    in_stack_00000088 = &UNK_008294b3;
    in_stack_00000090 = 6;
    in_stack_00000098 = &UNK_00829379;
    in_stack_000000a0 = 2;
    in_stack_000000a8 = &uStack0000000000000067;
    in_stack_000000b0 = 1;
    in_stack_000000b8 = 1;
    in_stack_000000c0 = 0;
    _uStack0000000000000038 = _uStack0000000000000038 & 0xffffffff00000000;
    uStack0000000000000030 = 0;
    iVar1 = (*pcVar4)(uVar2,&uStack0000000000000068,6,&uStack0000000000000030,0xc);
    if (iVar1 == 0) {
      *(undefined4 *)(param_1 + 6) = uStack0000000000000038;
      param_1[1] = 0;
      *param_1 = 0;
      param_1[3] = 0;
      param_1[2] = 0;
      param_1[4] = in_stack_00000020;
      param_1[5] = uStack0000000000000030;
      if ((code *)*puVar3 != (code *)0x0) {
        (*(code *)*puVar3)(uVar2);
      }
      if (puVar3[1] != 0) {
        func_0x00187bd4(uVar2,puVar3[1],puVar3[2]);
      }
      return;
    }
    func_0x007a2810(&UNK_0082a1b2,0x24,&uStack00000000000000cf,&UNK_009c9de8,&UNK_009ca5c0);
  }
  else {
    func_0x007a2810(&UNK_0082a1b2,0x24,&uStack00000000000000cf,&UNK_009c9de8,&UNK_009ca5c0);
  }
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x236c08);
  (*pcVar4)();
}

