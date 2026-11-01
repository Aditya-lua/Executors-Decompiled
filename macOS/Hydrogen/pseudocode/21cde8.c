
void FUN_0021cde8(void)

{
  long *plVar1;
  long lVar2;
  code *pcVar3;
  long lVar4;
  long lVar5;
  undefined8 *unaff_x19;
  long unaff_x20;
  long lVar6;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar7;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar8;
  undefined8 uVar9;
  long lVar10;
  long lVar11;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  ulong in_stack_000000a8;
  
  _memcpy();
  if (unaff_x26 < 0) {
    uVar7 = 0;
  }
  else {
    uVar7 = 1;
    lVar4 = func_0x00187bdc();
    if (lVar4 != 0) {
      uVar7 = *(undefined8 *)(unaff_x23 + 0x68);
      in_stack_000000a8 = in_stack_000000a8 & 0xffffffffffffff00;
      lVar6 = unaff_x19[8];
      uStack0000000000000070 = unaff_x20;
      in_stack_00000078 = unaff_x25;
      in_stack_00000080 = unaff_x20;
      in_stack_00000088 = unaff_x26;
      if (lVar6 == unaff_x19[6]) {
        func_0x001d89b8(unaff_x19 + 6,&UNK_009c6ca8);
      }
      plVar1 = (long *)(unaff_x19[7] + lVar6 * 0x40);
      lVar11 = *(long *)(unaff_x28 + 0x38);
      lVar10 = *(long *)(unaff_x28 + 0x30);
      plVar1[5] = unaff_x26;
      plVar1[4] = lVar4;
      plVar1[7] = lVar11;
      plVar1[6] = lVar10;
      plVar1[1] = in_stack_00000078;
      *plVar1 = uStack0000000000000070;
      plVar1[3] = in_stack_00000088;
      plVar1[2] = in_stack_00000080;
      unaff_x19[8] = lVar6 + 1;
      uVar8 = *(undefined8 *)(unaff_x23 + 0xa0);
      lVar10 = *(long *)(unaff_x23 + 0xa8);
      *(undefined8 *)(unaff_x29 + -0x80) = 0;
      *(undefined8 *)(unaff_x29 + -0x78) = 1;
      *(undefined8 *)(unaff_x29 + -0x70) = 0;
      *(undefined8 *)(unaff_x29 + -0xa0) = 0x8000000000000000;
      func_0x001b1824();
      lVar6 = *(long *)(unaff_x29 + -0x80);
      uVar9 = *(undefined8 *)(unaff_x29 + -0x78);
      (**(code **)(lVar10 + 0x20))
                (&uStack0000000000000070,uVar8,uVar9,*(undefined8 *)(unaff_x29 + -0x70),
                 in_stack_00000020);
      lVar2 = in_stack_00000088;
      lVar11 = in_stack_00000080;
      lVar10 = in_stack_00000078;
      if (uStack0000000000000070 == -0x7fffffffffffffd9) {
        if (lVar6 != 0) {
          func_0x00187bd4(uVar9,lVar6,1);
        }
        lVar4 = unaff_x19[6];
        if (unaff_x19[8] == 0) {
          lVar6 = 0;
        }
        else {
          lVar6 = unaff_x19[8] + -1;
          unaff_x19[8] = lVar6;
          plVar1 = (long *)(unaff_x19[7] + lVar6 * 0x40);
          in_stack_000000a8 = plVar1[7];
          in_stack_00000078 = plVar1[1];
          uStack0000000000000070 = *plVar1;
          in_stack_00000088 = plVar1[3];
          in_stack_00000080 = plVar1[2];
          if (uStack0000000000000070 != -0x7fffffffffffffe8) {
            func_0x00217a14(&uStack0000000000000070);
            lVar6 = unaff_x19[8];
            lVar4 = unaff_x19[6];
          }
        }
        lVar5 = *(long *)(unaff_x23 + 0x68);
        in_stack_00000078 = in_stack_00000010;
        in_stack_00000088 = lVar10;
        in_stack_000000a8 = CONCAT71(in_stack_000000a8._1_7_,*(undefined1 *)(unaff_x23 + 0xe9));
        uStack0000000000000070 = unaff_x20;
        in_stack_00000080 = unaff_x20;
        if (lVar6 == lVar4) {
          func_0x001d89b8(unaff_x19 + 6,&UNK_009c6cc0);
        }
        plVar1 = (long *)(unaff_x19[7] + lVar6 * 0x40);
        plVar1[5] = lVar2;
        plVar1[4] = lVar11;
        plVar1[7] = in_stack_000000a8;
        plVar1[6] = lVar5;
        plVar1[1] = in_stack_00000078;
        *plVar1 = uStack0000000000000070;
        plVar1[3] = in_stack_00000088;
        plVar1[2] = in_stack_00000080;
        unaff_x19[8] = lVar6 + 1;
        uVar7 = unaff_x19[0xc];
        uVar9 = unaff_x19[0xf];
        uVar8 = unaff_x19[0xe];
        unaff_x22[0xd] = unaff_x19[0xd];
        unaff_x22[0xc] = uVar7;
        unaff_x22[0xf] = uVar9;
        unaff_x22[0xe] = uVar8;
        uVar7 = unaff_x19[0x10];
        unaff_x22[0x11] = unaff_x19[0x11];
        unaff_x22[0x10] = uVar7;
        unaff_x22[0x12] = unaff_x19[0x12];
        uVar7 = unaff_x19[4];
        uVar9 = unaff_x19[7];
        uVar8 = unaff_x19[6];
        unaff_x22[5] = unaff_x19[5];
        unaff_x22[4] = uVar7;
        unaff_x22[7] = uVar9;
        unaff_x22[6] = uVar8;
        uVar7 = unaff_x19[8];
        uVar9 = unaff_x19[0xb];
        uVar8 = unaff_x19[10];
        unaff_x22[9] = unaff_x19[9];
        unaff_x22[8] = uVar7;
        unaff_x22[0xb] = uVar9;
        unaff_x22[10] = uVar8;
        uVar7 = *unaff_x19;
        uVar9 = unaff_x19[3];
        uVar8 = unaff_x19[2];
        unaff_x22[1] = unaff_x19[1];
        *unaff_x22 = uVar7;
        unaff_x22[3] = uVar9;
        unaff_x22[2] = uVar8;
        if (in_stack_00000018 != 0) {
          func_0x00187bd4(in_stack_00000020,in_stack_00000018,1);
        }
      }
      else {
        unaff_x22[6] = unaff_x26;
        unaff_x22[5] = lVar4;
        unaff_x22[7] = uVar7;
        unaff_x22[2] = in_stack_00000078;
        unaff_x22[3] = in_stack_00000080;
        unaff_x22[4] = in_stack_00000088;
        *unaff_x22 = 0x8000000000000000;
        unaff_x22[1] = uStack0000000000000070;
        if (lVar6 != 0) {
          func_0x00187bd4(uVar9,lVar6,1);
        }
        if (unaff_x20 != 0) {
          func_0x00187bd4(in_stack_00000010);
        }
        if (in_stack_00000018 != 0) {
          func_0x00187bd4(in_stack_00000020,in_stack_00000018,1);
        }
        func_0x002184c8();
      }
      return;
    }
  }
  func_0x007a1f00(uVar7);
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x21cf1c);
  (*pcVar3)();
}

