
undefined1  [16] FUN_0041c81c(void)

{
  long lVar1;
  code *pcVar2;
  ulong uVar3;
  uint *puVar4;
  undefined8 uVar5;
  ulong unaff_x19;
  ulong uVar6;
  ulong uVar7;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  undefined1 auVar8 [16];
  
  uVar3 = _write();
  if (uVar3 == 0xffffffffffffffff) {
    puVar4 = (uint *)___error();
    uVar7 = (ulong)*puVar4 << 0x20 | 2;
    uVar3 = unaff_x21;
    if (uVar7 != 0x900000002) {
      uVar5 = 1;
      goto LAB_0041c918;
    }
  }
  uVar7 = uVar3;
  if (uVar7 == 0) {
    uVar7 = 0;
    uVar5 = 0;
  }
  else {
    uVar3 = unaff_x21 - uVar7;
    if (unaff_x21 < uVar7 || uVar3 == 0) {
      uVar3 = unaff_x19 - uVar7;
      if (unaff_x19 < uVar7) {
        func_0x007a28a4(uVar7);
code_r0x0041c9f0:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x41c9f4);
        (*pcVar2)();
      }
      if (*(ulong *)(unaff_x23 + 0x20) <= uVar3) {
        uVar5 = 0;
        goto LAB_0041c918;
      }
    }
    else {
      uVar6 = *(ulong *)(unaff_x23 + 0x20);
      if (uVar6 < uVar3) {
        auVar8 = func_0x0046b1e4(10,unaff_x20 + uVar7,uVar6);
        if ((auVar8._0_8_ & 1) == 0) {
          uVar3 = uVar6;
        }
        else {
          uVar3 = auVar8._8_8_ + 1;
          if (uVar6 < uVar3) {
            func_0x007a28b0(uVar3,uVar6,&UNK_009da410);
            goto code_r0x0041c9f0;
          }
        }
      }
    }
    lVar1 = *(long *)(unaff_x23 + 0x30);
    uVar6 = *(long *)(unaff_x23 + 0x20) - lVar1;
    if (uVar6 <= uVar3) {
      uVar3 = uVar6;
    }
    _memcpy(*(long *)(unaff_x23 + 0x28) + lVar1,unaff_x20 + uVar7,uVar3);
    uVar5 = 0;
    *(ulong *)(unaff_x23 + 0x30) = uVar3 + lVar1;
    uVar7 = uVar3 + uVar7;
  }
LAB_0041c918:
  *(long *)(unaff_x23 + 0x18) = *(long *)(unaff_x23 + 0x18) + 1;
  auVar8._8_8_ = uVar7;
  auVar8._0_8_ = uVar5;
  return auVar8;
}

