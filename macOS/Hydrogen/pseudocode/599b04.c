
void FUN_00599b04(void)

{
  byte *pbVar1;
  long lVar2;
  byte bVar3;
  uint uVar4;
  ulong uVar5;
  code *pcVar6;
  uint in_w8;
  long lVar7;
  uint uVar8;
  ulong uVar9;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong uVar10;
  ulong unaff_x24;
  long unaff_x25;
  ulong *unaff_x26;
  long unaff_x27;
  ulong uVar11;
  ulong unaff_x28;
  long in_stack_00000028;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  long in_stack_00000078;
  ulong uStack0000000000000080;
  undefined8 uStack0000000000000088;
  ulong in_stack_00000090;
  long in_stack_00000098;
  
  if (in_w8 < 0x800) {
    lVar7 = 2;
  }
  else {
    lVar7 = 3;
    if (0xffff < in_w8) {
      lVar7 = 4;
    }
  }
  uVar9 = lVar7 + unaff_x27;
  if (uVar9 != 0) {
    if (uVar9 < unaff_x22) {
      if (-0x41 < *(char *)(unaff_x25 + uVar9)) goto LAB_00599b54;
    }
    else if (uVar9 == unaff_x22) goto LAB_00599b54;
LAB_00599e04:
    func_0x007a297c();
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x599e54);
    (*pcVar6)();
  }
LAB_00599b54:
  uVar11 = unaff_x22;
  if (uVar9 != unaff_x22) {
    uVar11 = uVar9;
  }
  if (unaff_x23 < uVar11) {
    func_0x007acb90(&uStack0000000000000088,0,uVar11);
    lVar7 = in_stack_00000098;
    unaff_x23 = uStack0000000000000088;
    unaff_x28 = in_stack_00000090;
  }
  else {
    lVar7 = 0;
  }
  _memcpy(unaff_x28 + lVar7,in_stack_00000078,uVar11);
  in_stack_00000098 = lVar7 + uVar11;
  uStack0000000000000080 = unaff_x28;
  if (unaff_x23 - in_stack_00000098 < unaff_x24) {
    func_0x007acb90(&uStack0000000000000088,in_stack_00000098);
    uStack0000000000000080 = in_stack_00000090;
  }
  lVar7 = in_stack_00000098;
  _memcpy(uStack0000000000000080 + in_stack_00000098,in_stack_00000070);
  in_stack_00000098 = lVar7 + unaff_x24;
  do {
    if (uVar11 != 0) {
      if (uVar11 < unaff_x22) {
        if (*(char *)(unaff_x25 + uVar11) < -0x40) goto LAB_00599e04;
      }
      else if (uVar11 != unaff_x22) goto LAB_00599e04;
    }
    if (uVar11 == unaff_x22) {
      uVar9 = in_stack_00000028 - unaff_x22;
      if (uStack0000000000000088 - in_stack_00000098 < uVar9) {
        func_0x007acb90(&uStack0000000000000088,in_stack_00000098,uVar9);
        uStack0000000000000080 = in_stack_00000090;
      }
      lVar7 = in_stack_00000098;
      _memcpy(uStack0000000000000080 + in_stack_00000098,in_stack_00000078 + unaff_x22,uVar9);
      unaff_x26[2] = lVar7 + uVar9;
      unaff_x26[1] = in_stack_00000090;
      *unaff_x26 = uStack0000000000000088;
      return;
    }
    pbVar1 = (byte *)(unaff_x25 + uVar11);
    bVar3 = *pbVar1;
    if ((char)bVar3 < '\0') {
      if (bVar3 < 0xe0) {
        uVar4 = pbVar1[1] & 0x3f | (bVar3 & 0x1f) << 6;
      }
      else {
        uVar8 = (uint)bVar3;
        uVar4 = pbVar1[2] & 0x3f | (pbVar1[1] & 0x3f) << 6;
        if (uVar8 < 0xf0) {
          uVar4 = uVar4 | (uVar8 & 0x1f) << 0xc;
        }
        else {
          uVar4 = pbVar1[3] & 0x3f | uVar4 << 6 | (uVar8 & 7) << 0x12;
        }
      }
      if (uVar4 < 0x80) goto LAB_00599c00;
      lVar7 = 3;
      if (0xffff < uVar4) {
        lVar7 = 4;
      }
      lVar2 = 2;
      if (0x7ff < uVar4) {
        lVar2 = lVar7;
      }
      uVar9 = lVar2 + uVar11;
    }
    else {
LAB_00599c00:
      uVar9 = uVar11 + 1;
    }
    if (uVar9 != 0) {
      if (uVar9 < unaff_x22) {
        if (*(char *)(unaff_x25 + uVar9) < -0x40) goto LAB_00599e04;
      }
      else if (uVar9 != unaff_x22) goto LAB_00599e04;
    }
    uVar10 = unaff_x22;
    if (uVar9 != unaff_x22) {
      uVar10 = uVar9;
    }
    uVar9 = uVar10 - uVar11;
    if (uStack0000000000000088 - in_stack_00000098 < uVar9) {
      func_0x007acb90(&uStack0000000000000088,in_stack_00000098,uVar9);
      uStack0000000000000080 = in_stack_00000090;
    }
    lVar7 = in_stack_00000098;
    uVar5 = uStack0000000000000088;
    _memcpy(uStack0000000000000080 + in_stack_00000098,in_stack_00000078 + uVar11,uVar9);
    in_stack_00000098 = lVar7 + uVar9;
    if (uVar5 - in_stack_00000098 < in_stack_00000068) {
      func_0x007acb90(&uStack0000000000000088,in_stack_00000098,in_stack_00000068);
      uStack0000000000000080 = in_stack_00000090;
    }
    lVar7 = in_stack_00000098;
    _memcpy(uStack0000000000000080 + in_stack_00000098,in_stack_00000070,in_stack_00000068);
    in_stack_00000098 = lVar7 + in_stack_00000068;
    uVar11 = uVar10;
  } while( true );
}

