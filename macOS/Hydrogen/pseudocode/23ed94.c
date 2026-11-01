
void FUN_0023ed94(void)

{
  ushort uVar1;
  ushort uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined *puVar5;
  long lVar6;
  undefined8 *puVar7;
  long *plVar8;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long lVar9;
  undefined8 unaff_x23;
  ulong uVar10;
  ulong uVar11;
  ulong unaff_x27;
  undefined1 unaff_w28;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long *in_stack_00000048;
  long in_stack_00000050;
  undefined1 in_stack_00000058;
  
code_r0x0023ed94:
  uVar10 = (ulong)*(ushort *)((long)uStack0000000000000038 + 10);
  lVar6 = (long)uStack0000000000000038 + 0xc;
  uVar11 = unaff_x27 + 1;
  lVar9 = uVar10 - unaff_x27;
  plVar8 = uStack0000000000000038;
  if (uVar10 < unaff_x27 || lVar9 == 0) goto LAB_0023ee90;
code_r0x0023edac:
  _memmove(lVar6 + uVar11,lVar6 + unaff_x27,lVar9);
  *(undefined1 *)(lVar6 + unaff_x27) = unaff_w28;
  _memmove(plVar8 + unaff_x27 + 5,plVar8 + uVar11 + 3,lVar9 << 3);
  do {
    plVar8[uVar11 + 3] = (long)unaff_x20;
    *(short *)((long)plVar8 + 10) = (short)uVar10 + 1;
    if (uVar11 < uVar10 + 2) {
      lVar6 = unaff_x27 + 4;
      do {
        puVar7 = (undefined8 *)plVar8[lVar6];
        *puVar7 = plVar8;
        *(short *)(puVar7 + 1) = (short)lVar6 + -3;
        lVar6 = lVar6 + 1;
      } while (~uVar10 + lVar6 != 4);
    }
    plVar8 = uStack0000000000000038;
    if (uStack0000000000000038 == (long *)0x0) {
code_r0x0023f034:
      *unaff_x19 = in_stack_00000018;
      unaff_x19[1] = in_stack_00000010;
      unaff_x19[2] = unaff_x23;
      return;
    }
code_r0x0023ed44:
    unaff_w28 = in_stack_00000058;
    lVar6 = in_stack_00000050;
    unaff_x20 = in_stack_00000048;
    lVar9 = *plVar8;
    if (lVar9 == 0) {
      in_stack_00000008 = (undefined8 *)*in_stack_00000008;
      puVar7 = (undefined8 *)*in_stack_00000008;
      if (puVar7 == (undefined8 *)0x0) goto code_r0x0023f0d4;
      lVar9 = in_stack_00000008[1];
      puVar4 = (undefined8 *)func_0x00187bd0(0x78,8);
      if (puVar4 == (undefined8 *)0x0) {
code_r0x0023f0e0:
        func_0x007a1f18(8,0x78);
code_r0x0023f174:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x23f178);
        (*pcVar3)();
      }
      *puVar4 = 0;
      *(undefined2 *)((long)puVar4 + 10) = 0;
      puVar4[3] = puVar7;
      *puVar7 = puVar4;
      *(undefined2 *)(puVar7 + 1) = 0;
      *in_stack_00000008 = puVar4;
      in_stack_00000008[1] = lVar9 + 1;
      if (lVar6 != lVar9) {
        puVar5 = &UNK_009c99e8;
        func_0x007a247c(&UNK_008297df,0x30,&UNK_009c99e8);
        func_0x007a28b0(puVar5,0xb,&UNK_009c9a18);
        goto code_r0x0023f174;
      }
      *(undefined2 *)((long)puVar4 + 10) = 1;
      *(undefined1 *)((long)puVar4 + 0xc) = unaff_w28;
      puVar4[4] = unaff_x20;
      *unaff_x20 = (long)puVar4;
      *(undefined2 *)(unaff_x20 + 1) = 1;
      goto code_r0x0023f034;
    }
    if (in_stack_00000050 != in_stack_00000040) {
      func_0x007a247c(&UNK_00829837,0x35,&UNK_009c9a48);
      func_0x007a1f18(8,0x18);
code_r0x0023f0d4:
      func_0x007a23bc(&UNK_009c99b8);
      goto code_r0x0023f0e0;
    }
    uVar1 = *(ushort *)(plVar8 + 1);
    unaff_x27 = (ulong)uVar1;
    uVar2 = *(ushort *)(lVar9 + 10);
    uVar11 = (ulong)uVar2;
    if (uVar2 < 0xb) {
      lVar6 = lVar9 + 0xc;
      uVar10 = unaff_x27 + 1;
      if (uVar1 < uVar2) {
        _memmove(lVar6 + uVar10,lVar6 + unaff_x27,uVar11 - unaff_x27);
        _memmove(lVar9 + 0x18 + unaff_x27 * 8 + 0x10,lVar9 + 0x18 + uVar10 * 8,
                 (uVar11 - unaff_x27) * 8);
      }
      *(undefined1 *)(lVar6 + unaff_x27) = unaff_w28;
      *(long **)(lVar9 + uVar10 * 8 + 0x18) = unaff_x20;
      *(ushort *)(lVar9 + 10) = uVar2 + 1;
      if (uVar10 < uVar11 + 2) {
        lVar6 = unaff_x27 + 4;
        do {
          plVar8 = *(long **)(lVar9 + lVar6 * 8);
          *plVar8 = lVar9;
          *(short *)(plVar8 + 1) = (short)lVar6 + -3;
          lVar6 = lVar6 + 1;
        } while (~uVar11 + lVar6 != 4);
      }
      goto code_r0x0023f034;
    }
    in_stack_00000028 = in_stack_00000040 + 1;
    uStack0000000000000020 = lVar9;
    if (uVar1 < 5) {
      in_stack_00000030 = 4;
      func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
      goto code_r0x0023ed94;
    }
    if (uVar1 == 5) {
      in_stack_00000030 = 5;
      func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
      plVar8 = uStack0000000000000038;
      uVar1 = *(ushort *)((long)uStack0000000000000038 + 10);
      uVar11 = (ulong)uVar1;
      if (uVar11 < 6) break;
      _memmove((long)uStack0000000000000038 + 0x12,(long)uStack0000000000000038 + 0x11,uVar11 - 5);
      *(undefined1 *)((long)plVar8 + 0x11) = unaff_w28;
      _memmove(plVar8 + 10,plVar8 + 9,uVar11 * 8 + -0x28);
      plVar8[9] = (long)unaff_x20;
      *(ushort *)((long)plVar8 + 10) = uVar1 + 1;
      goto code_r0x0023eef0;
    }
    if (uVar1 == 6) {
      in_stack_00000030 = 5;
      func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
      unaff_x27 = 0;
    }
    else {
      in_stack_00000030 = 6;
      func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
      unaff_x27 = unaff_x27 - 7;
    }
    uVar10 = (ulong)*(ushort *)((long)in_stack_00000048 + 10);
    lVar6 = (long)in_stack_00000048 + 0xc;
    uVar11 = unaff_x27 + 1;
    lVar9 = uVar10 - unaff_x27;
    plVar8 = in_stack_00000048;
    if (unaff_x27 <= uVar10 && lVar9 != 0) goto code_r0x0023edac;
LAB_0023ee90:
    *(undefined1 *)(lVar6 + unaff_x27) = unaff_w28;
  } while( true );
  *(undefined1 *)((long)uStack0000000000000038 + 0x11) = unaff_w28;
  uStack0000000000000038[9] = (long)unaff_x20;
  *(ushort *)((long)uStack0000000000000038 + 10) = uVar1 + 1;
  if (uVar1 == 5) {
code_r0x0023eef0:
    lVar6 = 9;
    do {
      puVar7 = (undefined8 *)plVar8[lVar6];
      *puVar7 = plVar8;
      *(short *)(puVar7 + 1) = (short)lVar6 + -3;
      lVar6 = lVar6 + 1;
    } while ((4 - uVar11) + lVar6 != 9);
  }
  goto code_r0x0023ed44;
}

