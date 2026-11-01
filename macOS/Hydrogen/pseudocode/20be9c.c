
void FUN_0020be9c(long param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  ulong uVar3;
  long unaff_x21;
  undefined8 uVar4;
  long unaff_x29;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined1 uStack0000000000000050;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined1 uStack_38;
  undefined7 uStack_37;
  
  uStack0000000000000028 = in_stack_00000078;
  uStack0000000000000020 = in_stack_00000070;
  uStack0000000000000038 = in_stack_00000088;
  uStack0000000000000030 = in_stack_00000080;
  uVar3 = *(ulong *)(param_1 + 8);
  uStack0000000000000000 = param_2;
  uStack0000000000000010 = param_3;
  func_0x00276f14(unaff_x21 + 8);
  if (uVar3 < 0x41) {
    *(undefined8 *)(unaff_x29 + -0x58) = 0;
    *(undefined8 *)(unaff_x29 + -0x60) = 0;
    *(undefined8 *)(unaff_x29 + -0x48) = 0;
    *(undefined8 *)(unaff_x29 + -0x50) = 0;
    *(undefined8 *)(unaff_x29 + -0x78) = 0;
    *(undefined8 *)(unaff_x29 + -0x80) = 0;
    *(undefined8 *)(unaff_x29 + -0x68) = 0;
    *(undefined8 *)(unaff_x29 + -0x70) = 0;
    *(ulong *)(unaff_x29 + -0x40) = uVar3;
    _memcpy(unaff_x29 + -0x80);
    uVar4 = *(undefined8 *)(unaff_x29 + -0x60);
    uVar6 = *(undefined8 *)(unaff_x29 + -0x48);
    uVar5 = *(undefined8 *)(unaff_x29 + -0x50);
    unaff_x19[5] = *(undefined8 *)(unaff_x29 + -0x58);
    unaff_x19[4] = uVar4;
    unaff_x19[7] = uVar6;
    unaff_x19[6] = uVar5;
    unaff_x19[8] = *(undefined8 *)(unaff_x29 + -0x40);
    uVar6 = *(undefined8 *)(unaff_x29 + -0x80);
    uVar5 = *(undefined8 *)(unaff_x29 + -0x68);
    uVar4 = *(undefined8 *)(unaff_x29 + -0x70);
    unaff_x19[1] = *(undefined8 *)(unaff_x29 + -0x78);
    *unaff_x19 = uVar6;
    unaff_x19[3] = uVar5;
    unaff_x19[2] = uVar4;
    return;
  }
  func_0x007a28b0(uVar3,0x40,&UNK_009c6570);
  func_0x00276f14(unaff_x21 + 8);
  puVar2 = (undefined8 *)
           func_0x007a2810(&UNK_008277af,0x16,&uStack0000000000000050,&UNK_009c6488,&UNK_009c6558);
  uVar4 = *puVar2;
  func_0x00276e98(&uStack_70,puVar2 + 1);
  uStack_40 = puVar2[7];
  uStack_38 = *(undefined1 *)(puVar2 + 8);
  puVar2 = (undefined8 *)func_0x00187bd0(0x48,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x48);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x20bff4);
    (*pcVar1)();
  }
  puVar2[5] = uStack_50;
  puVar2[4] = uStack_58;
  puVar2[7] = uStack_40;
  puVar2[6] = uStack_48;
  puVar2[8] = CONCAT71(uStack_37,uStack_38);
  puVar2[1] = uStack_70;
  *puVar2 = uVar4;
  puVar2[3] = uStack_60;
  puVar2[2] = uStack_68;
  return;
}

