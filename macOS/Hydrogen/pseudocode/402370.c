
void FUN_00402370(void)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  ulong uVar4;
  long *plVar5;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  ulong uVar6;
  long unaff_x25;
  long unaff_x27;
  undefined8 unaff_x28;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  _memcpy();
  _memcpy(unaff_x19 + 0x110,unaff_x22 + unaff_x25);
  *(short *)(unaff_x27 + 0x21a) = (short)unaff_x23;
  uVar6 = (ulong)*(ushort *)(unaff_x19 + 0x21a);
  lVar1 = uVar6 + 1;
  if (uVar6 < 0xc) {
    if (in_stack_00000010 - unaff_x23 == lVar1) {
      _memcpy(unaff_x19 + 0x220,unaff_x27 + unaff_x23 * 8 + 0x228,lVar1 * 8);
      uVar4 = 0;
      uVar3 = *(undefined8 *)(in_stack_00000008 + 8);
      do {
        plVar5 = *(long **)(unaff_x19 + 0x220 + uVar4 * 8);
        *plVar5 = unaff_x19;
        *(short *)(plVar5 + 0x43) = (short)uVar4;
        if (uVar6 <= uVar4) break;
        uVar4 = uVar4 + 1;
      } while (uVar4 <= uVar6);
      unaff_x20[1] = unaff_x21;
      *unaff_x20 = unaff_x24;
      unaff_x20[3] = in_stack_00000018;
      unaff_x20[2] = unaff_x28;
      unaff_x20[5] = in_stack_00000020;
      unaff_x20[4] = in_stack_00000028;
      unaff_x20[6] = unaff_x27;
      unaff_x20[7] = uVar3;
      unaff_x20[8] = unaff_x19;
      unaff_x20[9] = uVar3;
      return;
    }
    func_0x007a247c(&UNK_00885332,0x28,&UNK_009d9548);
  }
  else {
    func_0x007a28b0(lVar1,0xc,&UNK_009d9578);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4024a8);
  (*pcVar2)();
}

