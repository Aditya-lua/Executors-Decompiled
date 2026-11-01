
void FUN_00599bbc(void)

{
  byte *pbVar1;
  long lVar2;
  long lVar3;
  byte bVar4;
  uint uVar5;
  code *pcVar6;
  uint uVar7;
  long unaff_x19;
  ulong uVar8;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong uVar9;
  long unaff_x24;
  long unaff_x25;
  long *unaff_x26;
  ulong unaff_x27;
  long in_stack_00000028;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  long in_stack_00000098;
  
  _memcpy();
  in_stack_00000098 = unaff_x19 + unaff_x24;
  do {
    if (unaff_x27 != 0) {
      if (unaff_x27 < unaff_x22) {
        if (*(char *)(unaff_x25 + unaff_x27) < -0x40) goto LAB_00599e04;
      }
      else if (unaff_x27 != unaff_x22) {
LAB_00599e04:
        func_0x007a297c();
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x599e54);
        (*pcVar6)();
      }
    }
    if (unaff_x27 == unaff_x22) {
      uVar8 = in_stack_00000028 - unaff_x22;
      if ((ulong)(uStack0000000000000088 - in_stack_00000098) < uVar8) {
        func_0x007acb90(&uStack0000000000000088,in_stack_00000098,uVar8);
        in_stack_00000080 = in_stack_00000090;
      }
      lVar2 = in_stack_00000098;
      _memcpy(in_stack_00000080 + in_stack_00000098,in_stack_00000078 + unaff_x22,uVar8);
      unaff_x26[2] = lVar2 + uVar8;
      unaff_x26[1] = in_stack_00000090;
      *unaff_x26 = uStack0000000000000088;
      return;
    }
    pbVar1 = (byte *)(unaff_x25 + unaff_x27);
    bVar4 = *pbVar1;
    if ((char)bVar4 < '\0') {
      if (bVar4 < 0xe0) {
        uVar5 = pbVar1[1] & 0x3f | (bVar4 & 0x1f) << 6;
      }
      else {
        uVar7 = (uint)bVar4;
        uVar5 = pbVar1[2] & 0x3f | (pbVar1[1] & 0x3f) << 6;
        if (uVar7 < 0xf0) {
          uVar5 = uVar5 | (uVar7 & 0x1f) << 0xc;
        }
        else {
          uVar5 = pbVar1[3] & 0x3f | uVar5 << 6 | (uVar7 & 7) << 0x12;
        }
      }
      if (uVar5 < 0x80) goto LAB_00599c00;
      lVar2 = unaff_x21;
      if (0xffff < uVar5) {
        lVar2 = unaff_x21 + 1;
      }
      lVar3 = unaff_x20;
      if (0x7ff < uVar5) {
        lVar3 = lVar2;
      }
      uVar8 = lVar3 + unaff_x27;
    }
    else {
LAB_00599c00:
      uVar8 = unaff_x27 + 1;
    }
    if (uVar8 != 0) {
      if (uVar8 < unaff_x22) {
        if (*(char *)(unaff_x25 + uVar8) < -0x40) goto LAB_00599e04;
      }
      else if (uVar8 != unaff_x22) goto LAB_00599e04;
    }
    uVar9 = unaff_x22;
    if (uVar8 != unaff_x22) {
      uVar9 = uVar8;
    }
    uVar8 = uVar9 - unaff_x27;
    if ((ulong)(uStack0000000000000088 - in_stack_00000098) < uVar8) {
      func_0x007acb90(&uStack0000000000000088,in_stack_00000098,uVar8);
      in_stack_00000080 = in_stack_00000090;
    }
    lVar3 = in_stack_00000098;
    lVar2 = uStack0000000000000088;
    _memcpy(in_stack_00000080 + in_stack_00000098,in_stack_00000078 + unaff_x27,uVar8);
    in_stack_00000098 = lVar3 + uVar8;
    if ((ulong)(lVar2 - in_stack_00000098) < in_stack_00000068) {
      func_0x007acb90(&uStack0000000000000088,in_stack_00000098,in_stack_00000068);
      in_stack_00000080 = in_stack_00000090;
    }
    lVar2 = in_stack_00000098;
    _memcpy(in_stack_00000080 + in_stack_00000098,in_stack_00000070,in_stack_00000068);
    in_stack_00000098 = lVar2 + in_stack_00000068;
    unaff_x27 = uVar9;
  } while( true );
}

