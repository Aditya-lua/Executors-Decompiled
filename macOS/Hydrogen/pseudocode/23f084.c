
void FUN_0023f084(void)

{
  ushort uVar1;
  ushort uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined *puVar5;
  undefined8 *puVar6;
  long *plVar7;
  undefined8 *unaff_x19;
  long *unaff_x20;
  ushort unaff_w21;
  long *plVar8;
  long lVar9;
  undefined1 unaff_w22;
  long lVar10;
  long unaff_x23;
  ulong uVar11;
  ulong uVar12;
  long unaff_x24;
  ulong uVar13;
  ulong uVar14;
  long *unaff_x27;
  undefined1 unaff_w28;
  undefined8 *in_stack_00000008;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long *in_stack_00000048;
  long in_stack_00000050;
  undefined1 in_stack_00000058;
  
  _memcpy();
  *(undefined2 *)((long)unaff_x27 + 10) = 6;
  uVar11 = unaff_x23 - 7;
  lVar10 = unaff_w21 - uVar11;
  if (uVar11 <= unaff_w21 && lVar10 != 0) {
    lVar9 = (long)unaff_x20 + unaff_x23 + 5;
    _memmove(lVar9 + 1,lVar9,lVar10);
  }
  *(undefined1 *)((long)unaff_x20 + unaff_x23 + 5) = unaff_w22;
  *(ushort *)((long)unaff_x20 + 10) = unaff_w21 + 1;
  lVar10 = *unaff_x27;
  if (lVar10 == 0) {
    lVar9 = 0;
    plVar7 = unaff_x20;
  }
  else {
    plVar7 = unaff_x20;
    lVar9 = 0;
    do {
      if (lVar9 != unaff_x24) {
        func_0x007a247c(&UNK_00829837,0x35,&UNK_009c9a48);
        func_0x007a1f18(8,0x18);
        goto code_r0x0023f0d4;
      }
      uVar1 = *(ushort *)(unaff_x27 + 1);
      uVar14 = (ulong)uVar1;
      uVar2 = *(ushort *)(lVar10 + 10);
      uVar13 = (ulong)uVar2;
      if (uVar2 < 0xb) {
        lVar9 = lVar10 + 0xc;
        uVar12 = uVar14 + 1;
        if (uVar1 < uVar2) {
          _memmove(lVar9 + uVar12,lVar9 + uVar14,uVar13 - uVar14);
          _memmove(lVar10 + 0x18 + uVar14 * 8 + 0x10,lVar10 + 0x18 + uVar12 * 8,
                   (uVar13 - uVar14) * 8);
        }
        *(undefined1 *)(lVar9 + uVar14) = unaff_w28;
        *(long **)(lVar10 + uVar12 * 8 + 0x18) = plVar7;
        *(ushort *)(lVar10 + 10) = uVar2 + 1;
        if (uVar12 < uVar13 + 2) {
          lVar9 = uVar14 + 4;
          do {
            plVar7 = *(long **)(lVar10 + lVar9 * 8);
            *plVar7 = lVar10;
            *(short *)(plVar7 + 1) = (short)lVar9 + -3;
            lVar9 = lVar9 + 1;
          } while (~uVar13 + lVar9 != 4);
        }
        goto code_r0x0023f034;
      }
      in_stack_00000028 = unaff_x24 + 1;
      uStack0000000000000020 = lVar10;
      if (uVar1 < 5) {
        in_stack_00000030 = 4;
        func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
        uVar12 = (ulong)*(ushort *)((long)uStack0000000000000038 + 10);
        lVar10 = (long)uStack0000000000000038 + 0xc;
        uVar13 = uVar14 + 1;
        lVar9 = uVar12 - uVar14;
        plVar8 = uStack0000000000000038;
        if (uVar12 < uVar14 || lVar9 == 0) {
code_r0x0023ee90:
          *(undefined1 *)(lVar10 + uVar14) = unaff_w28;
        }
        else {
code_r0x0023edac:
          _memmove(lVar10 + uVar13,lVar10 + uVar14,lVar9);
          *(undefined1 *)(lVar10 + uVar14) = unaff_w28;
          _memmove(plVar8 + uVar14 + 5,plVar8 + uVar13 + 3,lVar9 << 3);
        }
        plVar8[uVar13 + 3] = (long)plVar7;
        *(short *)((long)plVar8 + 10) = (short)uVar12 + 1;
        if (uVar13 < uVar12 + 2) {
          lVar10 = uVar14 + 4;
          do {
            puVar6 = (undefined8 *)plVar8[lVar10];
            *puVar6 = plVar8;
            *(short *)(puVar6 + 1) = (short)lVar10 + -3;
            lVar10 = lVar10 + 1;
          } while (~uVar12 + lVar10 != 4);
        }
        unaff_x27 = uStack0000000000000038;
        if (uStack0000000000000038 == (long *)0x0) goto code_r0x0023f034;
      }
      else {
        if (uVar1 != 5) {
          if (uVar1 == 6) {
            in_stack_00000030 = 5;
            func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
            uVar14 = 0;
          }
          else {
            in_stack_00000030 = 6;
            func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
            uVar14 = uVar14 - 7;
          }
          uVar12 = (ulong)*(ushort *)((long)in_stack_00000048 + 10);
          lVar10 = (long)in_stack_00000048 + 0xc;
          uVar13 = uVar14 + 1;
          lVar9 = uVar12 - uVar14;
          plVar8 = in_stack_00000048;
          if (uVar12 < uVar14 || lVar9 == 0) goto code_r0x0023ee90;
          goto code_r0x0023edac;
        }
        in_stack_00000030 = 5;
        func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
        unaff_x27 = uStack0000000000000038;
        uVar1 = *(ushort *)((long)uStack0000000000000038 + 10);
        uVar13 = (ulong)uVar1;
        if (uVar13 < 6) {
          *(undefined1 *)((long)uStack0000000000000038 + 0x11) = unaff_w28;
          uStack0000000000000038[9] = (long)plVar7;
          *(ushort *)((long)uStack0000000000000038 + 10) = uVar1 + 1;
          if (uVar1 != 5) goto code_r0x0023ed44;
        }
        else {
          _memmove((long)uStack0000000000000038 + 0x12,(long)uStack0000000000000038 + 0x11,
                   uVar13 - 5);
          *(undefined1 *)((long)unaff_x27 + 0x11) = unaff_w28;
          _memmove(unaff_x27 + 10,unaff_x27 + 9,uVar13 * 8 + -0x28);
          unaff_x27[9] = (long)plVar7;
          *(ushort *)((long)unaff_x27 + 10) = uVar1 + 1;
        }
        lVar10 = 9;
        do {
          puVar6 = (undefined8 *)unaff_x27[lVar10];
          *puVar6 = unaff_x27;
          *(short *)(puVar6 + 1) = (short)lVar10 + -3;
          lVar10 = lVar10 + 1;
        } while ((4 - uVar13) + lVar10 != 9);
      }
code_r0x0023ed44:
      lVar10 = *unaff_x27;
      plVar7 = in_stack_00000048;
      lVar9 = in_stack_00000050;
      unaff_x24 = in_stack_00000040;
      unaff_w28 = in_stack_00000058;
    } while (lVar10 != 0);
  }
  in_stack_00000008 = (undefined8 *)*in_stack_00000008;
  puVar6 = (undefined8 *)*in_stack_00000008;
  if (puVar6 == (undefined8 *)0x0) {
code_r0x0023f0d4:
    func_0x007a23bc(&UNK_009c99b8);
  }
  else {
    lVar10 = in_stack_00000008[1];
    puVar4 = (undefined8 *)func_0x00187bd0(0x78,8);
    if (puVar4 != (undefined8 *)0x0) {
      *puVar4 = 0;
      *(undefined2 *)((long)puVar4 + 10) = 0;
      puVar4[3] = puVar6;
      *puVar6 = puVar4;
      *(undefined2 *)(puVar6 + 1) = 0;
      *in_stack_00000008 = puVar4;
      in_stack_00000008[1] = lVar10 + 1;
      if (lVar9 == lVar10) {
        *(undefined2 *)((long)puVar4 + 10) = 1;
        *(undefined1 *)((long)puVar4 + 0xc) = unaff_w28;
        puVar4[4] = plVar7;
        *plVar7 = (long)puVar4;
        *(undefined2 *)(plVar7 + 1) = 1;
code_r0x0023f034:
        *unaff_x19 = unaff_x20;
        unaff_x19[1] = 0;
        unaff_x19[2] = uVar11;
        return;
      }
      puVar5 = &UNK_009c99e8;
      func_0x007a247c(&UNK_008297df,0x30,&UNK_009c99e8);
      func_0x007a28b0(puVar5,0xb,&UNK_009c9a18);
      goto code_r0x0023f174;
    }
  }
  func_0x007a1f18(8,0x78);
code_r0x0023f174:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x23f178);
  (*pcVar3)();
}

