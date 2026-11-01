
void FUN_005a7cd0(undefined1 param_1 [16],undefined1 param_2 [16])

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  ulong uVar4;
  long *plVar5;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  ulong uVar6;
  long unaff_x24;
  long unaff_x26;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  
  uStack0000000000000020 = param_2._8_8_;
  uStack0000000000000018 = param_2._0_8_;
  uVar6 = (ulong)*(ushort *)(unaff_x19 + 0x37a);
  lVar1 = uVar6 + 1;
  if (uVar6 < 0xc) {
    if (in_stack_00000008 - unaff_x26 == lVar1) {
      _memcpy(unaff_x19 + 0x380,unaff_x24 + unaff_x26 * 8 + 0x388,lVar1 * 8);
      uVar4 = 0;
      uVar3 = *(undefined8 *)(unaff_x21 + 8);
      do {
        plVar5 = *(long **)(unaff_x19 + 0x380 + uVar4 * 8);
        *plVar5 = unaff_x19;
        *(short *)(plVar5 + 0x6f) = (short)uVar4;
        if (uVar6 <= uVar4) break;
        uVar4 = uVar4 + 1;
      } while (uVar4 <= uVar6);
      unaff_x20[5] = in_stack_00000038;
      unaff_x20[4] = in_stack_00000030;
      unaff_x20[7] = in_stack_00000048;
      unaff_x20[6] = in_stack_00000040;
      unaff_x20[9] = in_stack_00000058;
      unaff_x20[8] = in_stack_00000050;
      unaff_x20[1] = uStack0000000000000018;
      *unaff_x20 = in_stack_00000010;
      unaff_x20[3] = in_stack_00000028;
      unaff_x20[2] = uStack0000000000000020;
      unaff_x20[10] = unaff_x24;
      unaff_x20[0xb] = uVar3;
      unaff_x20[0xc] = unaff_x19;
      unaff_x20[0xd] = uVar3;
      return;
    }
    func_0x007a247c(&UNK_008ae978,0x28,&UNK_009f1bf8);
  }
  else {
    func_0x007a28b0(lVar1,0xc,&UNK_009f1c28);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5a7de8);
  (*pcVar2)();
}

