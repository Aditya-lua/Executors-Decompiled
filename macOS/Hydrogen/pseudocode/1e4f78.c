
void FUN_001e4f78(long param_1)

{
  long lVar1;
  long lVar2;
  code *pcVar3;
  long *plVar4;
  ulong in_x9;
  long lVar5;
  long lVar6;
  long *unaff_x21;
  long lVar7;
  long unaff_x25;
  long lVar8;
  long unaff_x26;
  long unaff_x27;
  long lVar9;
  long lVar10;
  long unaff_x29;
  uint uStack000000000000000c;
  uint uStack0000000000000014;
  uint uStack000000000000001c;
  long lStack0000000000000020;
  undefined1 uStack000000000000002e;
  undefined1 uStack000000000000002f;
  undefined1 uStack0000000000000041;
  undefined1 uStack0000000000000042;
  undefined1 uStack0000000000000043;
  undefined1 uStack0000000000000044;
  undefined1 uStack0000000000000045;
  undefined1 uStack0000000000000046;
  undefined1 uStack0000000000000047;
  undefined1 uStack0000000000000049;
  undefined1 uStack000000000000004a;
  undefined1 uStack000000000000004b;
  undefined1 uStack000000000000004c;
  undefined1 uStack000000000000004d;
  undefined1 uStack000000000000004e;
  undefined1 uStack000000000000004f;
  undefined4 uStack0000000000000058;
  long in_stack_00000060;
  undefined1 uStack0000000000000068;
  undefined1 uStack0000000000000069;
  undefined1 uStack000000000000006a;
  undefined1 uStack000000000000006b;
  undefined1 uStack000000000000006c;
  undefined1 uStack000000000000006d;
  undefined1 uStack000000000000006e;
  undefined1 uStack000000000000006f;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000071;
  undefined1 uStack0000000000000072;
  undefined1 uStack0000000000000073;
  undefined1 uStack0000000000000074;
  undefined1 uStack0000000000000075;
  undefined1 uStack0000000000000076;
  undefined1 uStack0000000000000077;
  long in_stack_00000078;
  undefined1 uStack0000000000000080;
  undefined1 uStack0000000000000081;
  undefined1 uStack0000000000000082;
  byte bStack0000000000000083;
  undefined1 uStack0000000000000084;
  byte bStack0000000000000085;
  undefined1 uStack0000000000000086;
  byte bStack0000000000000087;
  long in_stack_00000088;
  long in_stack_00000090;
  
  lVar9 = in_stack_00000090;
  lVar5 = in_stack_00000088;
  lStack0000000000000020 = _uStack0000000000000080;
  if ((in_x9 & 1) == 0) {
    *(long *)(unaff_x29 + -0x78) = unaff_x26;
    *(long *)(unaff_x29 + -0x70) = unaff_x27;
    *(long *)(unaff_x29 + -0x68) = unaff_x25;
    *(long *)(unaff_x29 + -0x60) = param_1;
    func_0x001e2b4c(&uStack0000000000000058);
    lVar6 = in_stack_00000090;
    lVar2 = in_stack_00000088;
    param_1 = in_stack_00000078;
    lVar1 = in_stack_00000060;
    lVar10 = CONCAT17(uStack000000000000006f,
                      CONCAT16(uStack000000000000006e,
                               CONCAT15(uStack000000000000006d,
                                        CONCAT14(uStack000000000000006c,
                                                 CONCAT13(uStack000000000000006b,
                                                          CONCAT12(uStack000000000000006a,
                                                                   CONCAT11(uStack0000000000000069,
                                                                            uStack0000000000000068))
                                                         )))));
    lVar8 = CONCAT17(uStack0000000000000077,
                     CONCAT16(uStack0000000000000076,
                              CONCAT15(uStack0000000000000075,
                                       CONCAT14(uStack0000000000000074,
                                                CONCAT13(uStack0000000000000073,
                                                         CONCAT12(uStack0000000000000072,
                                                                  CONCAT11(uStack0000000000000071,
                                                                           uStack0000000000000070)))
                                               ))));
    lVar7 = CONCAT17(bStack0000000000000087,
                     CONCAT16(uStack0000000000000086,
                              CONCAT15(bStack0000000000000085,
                                       CONCAT14(uStack0000000000000084,
                                                CONCAT13(bStack0000000000000083,
                                                         CONCAT12(uStack0000000000000082,
                                                                  CONCAT11(uStack0000000000000081,
                                                                           uStack0000000000000080)))
                                               ))));
    if (uStack0000000000000058 != 1) {
      if (lStack0000000000000020 != -0x8000000000000000) {
        uStack000000000000001c = (uint)bStack0000000000000083;
        uStack0000000000000014 = (uint)bStack0000000000000085;
        uStack000000000000000c = (uint)bStack0000000000000087;
        uStack000000000000004f = uStack0000000000000069;
        uStack000000000000004e = uStack000000000000006a;
        uStack000000000000004d = uStack000000000000006b;
        uStack000000000000004c = uStack000000000000006c;
        uStack000000000000004b = uStack000000000000006d;
        uStack000000000000004a = uStack000000000000006e;
        uStack0000000000000049 = uStack000000000000006f;
        uStack0000000000000047 = uStack0000000000000071;
        uStack0000000000000046 = uStack0000000000000072;
        uStack0000000000000045 = uStack0000000000000073;
        uStack0000000000000044 = uStack0000000000000074;
        uStack0000000000000043 = uStack0000000000000075;
        uStack0000000000000042 = uStack0000000000000076;
        uStack0000000000000041 = uStack0000000000000077;
        uStack000000000000002f = uStack0000000000000081;
        uStack000000000000002e = uStack0000000000000082;
        plVar4 = (long *)func_0x00187bd0(0x38,8);
        if (plVar4 == (long *)0x0) {
          func_0x007a1f18(8,0x38);
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x1e5190);
          (*pcVar3)();
        }
        *plVar4 = lVar1;
        plVar4[1] = lVar10;
        plVar4[2] = lVar8;
        plVar4[3] = param_1;
        plVar4[4] = lVar7;
        plVar4[5] = lVar2;
        plVar4[6] = lVar6;
        unaff_x21[2] = lVar5;
        unaff_x21[3] = lVar9;
        unaff_x21[4] = (long)plVar4;
        unaff_x21[5] = (long)&UNK_009c3fb8;
        *unaff_x21 = -0x7fffffffffffffd9;
        unaff_x21[1] = lStack0000000000000020;
        return;
      }
      goto LAB_001e5008;
    }
    if (lStack0000000000000020 != 0) {
      func_0x00187bd4(lVar5,lStack0000000000000020,1);
    }
    _uStack0000000000000080 = lVar7;
    in_stack_00000078 = lVar2;
    in_stack_00000060 = lVar8;
    lVar5 = lVar1;
    lVar9 = lVar10;
  }
  else {
    lVar6 = in_stack_00000090;
    in_stack_00000078 = in_stack_00000088;
    in_stack_00000060 = unaff_x25;
    lVar5 = unaff_x26;
    lVar9 = unaff_x27;
  }
  lVar7 = lVar6;
  lVar8 = _uStack0000000000000080;
  lVar10 = param_1;
LAB_001e5008:
  *unaff_x21 = lVar5;
  unaff_x21[1] = lVar9;
  unaff_x21[2] = in_stack_00000060;
  unaff_x21[3] = lVar10;
  unaff_x21[4] = lVar8;
  unaff_x21[5] = in_stack_00000078;
  unaff_x21[6] = lVar7;
  return;
}

