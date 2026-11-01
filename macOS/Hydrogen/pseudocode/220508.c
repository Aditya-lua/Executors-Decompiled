
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00220508(long param_1,undefined8 param_2,char param_3)

{
  uint *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  code *pcVar6;
  undefined8 *puVar7;
  undefined1 uVar8;
  long lVar9;
  undefined8 *in_x9;
  long *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  undefined8 uVar10;
  long unaff_x23;
  long unaff_x29;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_000000a0;
  undefined1 uStack00000000000000a8;
  undefined8 in_stack_00000314;
  undefined8 in_stack_0000031c;
  undefined8 in_stack_00000324;
  undefined8 in_stack_0000032c;
  undefined8 in_stack_00000334;
  undefined8 in_stack_0000033c;
  undefined8 in_stack_00000344;
  undefined8 in_stack_0000034c;
  undefined8 in_stack_00000354;
  undefined8 in_stack_0000035c;
  undefined8 in_stack_00000364;
  undefined8 in_stack_0000036c;
  undefined8 in_stack_00000374;
  undefined8 in_stack_0000037c;
  undefined8 in_stack_00000384;
  undefined5 in_stack_0000038c;
  undefined3 in_stack_00000391;
  undefined5 in_stack_00000394;
  undefined8 in_stack_00000399;
  undefined8 in_stack_000003a2;
  undefined8 in_stack_000003aa;
  undefined8 in_stack_000003b2;
  undefined8 in_stack_000003ba;
  undefined8 in_stack_000003c2;
  undefined8 in_stack_000003ca;
  undefined8 in_stack_000003d2;
  undefined8 in_stack_000003da;
  undefined8 in_stack_000003e2;
  undefined8 in_stack_000003ea;
  undefined8 in_stack_000003f2;
  undefined8 in_stack_000003fa;
  undefined8 in_stack_00000402;
  undefined8 in_stack_0000040a;
  undefined8 in_stack_00000412;
  undefined8 in_stack_0000041a;
  undefined8 in_stack_00000422;
  undefined8 in_stack_0000042a;
  undefined8 in_stack_00000432;
  undefined8 in_stack_0000043a;
  undefined8 in_stack_00000442;
  undefined8 in_stack_0000044a;
  undefined8 in_stack_00000452;
  undefined8 in_stack_0000045a;
  undefined8 in_stack_00000462;
  undefined8 in_stack_0000046a;
  undefined8 in_stack_00000472;
  undefined6 in_stack_0000047a;
  undefined2 in_stack_00000480;
  undefined6 in_stack_00000482;
  long in_stack_00000488;
  
  while (puVar7 = in_x9, *(long *)*in_x9 == 0) {
    do {
      in_x9 = puVar7 + 2;
      param_1 = param_1 + -0x10;
      if (param_1 == 0) {
        uVar10 = 0x2a;
        puVar7 = (undefined8 *)func_0x00187bd0(0x2a,1);
        uVar3 = _UNK_0082807c;
        uVar2 = _UNK_0082806c;
        if (puVar7 == (undefined8 *)0x0) goto LAB_00220764;
        uVar10 = CONCAT62(_UNK_00828086,_UNK_00828084);
        puVar7[1] = _UNK_00828074;
        *puVar7 = uVar2;
        puVar7[3] = uVar10;
        puVar7[2] = uVar3;
        uVar2 = CONCAT26(_UNK_0082808c,_UNK_00828086);
        *(undefined8 *)((long)puVar7 + 0x22) = _UNK_0082808e;
        *(undefined8 *)((long)puVar7 + 0x1a) = uVar2;
        lVar9 = 0x2a;
        goto LAB_0022048c;
      }
      puVar1 = (uint *)(puVar7 + 1);
      puVar7 = in_x9;
    } while ((*puVar1 & 1) == 0);
  }
  if ((int)unaff_x20[0x1e] + 1U < 2) {
    lVar13 = unaff_x21[1];
    lVar11 = *unaff_x21;
    lVar9 = unaff_x21[2];
    uVar8 = 0xc;
    if (param_3 == '\0') {
      uVar8 = 0xd;
    }
    *(long **)(unaff_x29 + -0x60) = unaff_x20;
    puVar7 = (undefined8 *)func_0x00187bd0(0x28,8);
    if (puVar7 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x28);
code_r0x00220778:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x22077c);
      (*pcVar6)();
    }
    puVar7[1] = lVar11;
    *puVar7 = CONCAT71(in_stack_00000008._1_7_,uVar8);
    puVar7[3] = lVar9;
    puVar7[2] = lVar13;
    puVar7[4] = in_stack_00000028;
    *(undefined8 *)(unaff_x29 + -0x58) = 1;
    *(undefined8 **)(unaff_x29 + -0x50) = puVar7;
    *(undefined8 *)(unaff_x29 + -0x48) = 1;
    func_0x00253784(&uStack0000000000000068);
    lVar5 = in_stack_000000a0;
    lVar13 = in_stack_00000078;
    lVar11 = in_stack_00000070;
    lVar9 = uStack0000000000000068;
    lVar16 = *(long *)(unaff_x23 + 0x20);
    lVar15 = *(long *)(unaff_x23 + 0x18);
    lVar14 = *(long *)(unaff_x23 + 0x30);
    lVar12 = *(long *)(unaff_x23 + 0x28);
    if (uStack0000000000000068 == 2) {
      unaff_x19[2] = in_stack_00000078;
      unaff_x19[1] = in_stack_00000070;
      unaff_x19[4] = lVar16;
      unaff_x19[3] = lVar15;
      unaff_x19[6] = lVar14;
      unaff_x19[5] = lVar12;
      unaff_x19[7] = in_stack_000000a0;
      *unaff_x19 = 2;
    }
    else {
      _memcpy(unaff_x19 + 8,&uStack00000000000000a8,0x26b);
      *(undefined8 *)((long)unaff_x19 + 0x314) = in_stack_0000037c;
      *(undefined8 *)((long)unaff_x19 + 0x30c) = in_stack_00000374;
      *(ulong *)((long)unaff_x19 + 0x324) = CONCAT35(in_stack_00000391,in_stack_0000038c);
      *(undefined8 *)((long)unaff_x19 + 0x31c) = in_stack_00000384;
      *(undefined8 *)((long)unaff_x19 + 0x331) = in_stack_00000399;
      *(ulong *)((long)unaff_x19 + 0x329) = CONCAT53(in_stack_00000394,in_stack_00000391);
      *(undefined8 *)((long)unaff_x19 + 0x2d4) = in_stack_0000033c;
      *(undefined8 *)((long)unaff_x19 + 0x2cc) = in_stack_00000334;
      *(undefined8 *)((long)unaff_x19 + 0x2e4) = in_stack_0000034c;
      *(undefined8 *)((long)unaff_x19 + 0x2dc) = in_stack_00000344;
      *(undefined8 *)((long)unaff_x19 + 0x2f4) = in_stack_0000035c;
      *(undefined8 *)((long)unaff_x19 + 0x2ec) = in_stack_00000354;
      *(undefined8 *)((long)unaff_x19 + 0x304) = in_stack_0000036c;
      *(undefined8 *)((long)unaff_x19 + 0x2fc) = in_stack_00000364;
      *(undefined8 *)((long)unaff_x19 + 0x2b4) = in_stack_0000031c;
      *(undefined8 *)((long)unaff_x19 + 0x2ac) = in_stack_00000314;
      *(undefined8 *)((long)unaff_x19 + 0x2c4) = in_stack_0000032c;
      *(undefined8 *)((long)unaff_x19 + 700) = in_stack_00000324;
      *(undefined8 *)((long)unaff_x19 + 0x402) = in_stack_0000046a;
      *(undefined8 *)((long)unaff_x19 + 0x3fa) = in_stack_00000462;
      *(ulong *)((long)unaff_x19 + 0x412) = CONCAT26(in_stack_00000480,in_stack_0000047a);
      *(undefined8 *)((long)unaff_x19 + 0x40a) = in_stack_00000472;
      unaff_x19[0x84] = in_stack_00000488;
      unaff_x19[0x83] = CONCAT62(in_stack_00000482,in_stack_00000480);
      *(undefined8 *)((long)unaff_x19 + 0x3c2) = in_stack_0000042a;
      *(undefined8 *)((long)unaff_x19 + 0x3ba) = in_stack_00000422;
      *(undefined8 *)((long)unaff_x19 + 0x3d2) = in_stack_0000043a;
      *(undefined8 *)((long)unaff_x19 + 0x3ca) = in_stack_00000432;
      *(undefined8 *)((long)unaff_x19 + 0x3e2) = in_stack_0000044a;
      *(undefined8 *)((long)unaff_x19 + 0x3da) = in_stack_00000442;
      *(undefined8 *)((long)unaff_x19 + 0x3f2) = in_stack_0000045a;
      *(undefined8 *)((long)unaff_x19 + 0x3ea) = in_stack_00000452;
      *(undefined8 *)((long)unaff_x19 + 0x382) = in_stack_000003ea;
      *(undefined8 *)((long)unaff_x19 + 0x37a) = in_stack_000003e2;
      *(undefined8 *)((long)unaff_x19 + 0x392) = in_stack_000003fa;
      *(undefined8 *)((long)unaff_x19 + 0x38a) = in_stack_000003f2;
      *(undefined8 *)((long)unaff_x19 + 0x3a2) = in_stack_0000040a;
      *(undefined8 *)((long)unaff_x19 + 0x39a) = in_stack_00000402;
      *(undefined8 *)((long)unaff_x19 + 0x3b2) = in_stack_0000041a;
      *(undefined8 *)((long)unaff_x19 + 0x3aa) = in_stack_00000412;
      *(undefined8 *)((long)unaff_x19 + 0x342) = in_stack_000003aa;
      *(undefined8 *)((long)unaff_x19 + 0x33a) = in_stack_000003a2;
      *(undefined8 *)((long)unaff_x19 + 0x352) = in_stack_000003ba;
      *(undefined8 *)((long)unaff_x19 + 0x34a) = in_stack_000003b2;
      *(undefined8 *)((long)unaff_x19 + 0x362) = in_stack_000003ca;
      *(undefined8 *)((long)unaff_x19 + 0x35a) = in_stack_000003c2;
      *(undefined8 *)((long)unaff_x19 + 0x372) = in_stack_000003da;
      *(undefined8 *)((long)unaff_x19 + 0x36a) = in_stack_000003d2;
      unaff_x19[2] = lVar13;
      unaff_x19[1] = lVar11;
      unaff_x19[4] = lVar16;
      unaff_x19[3] = lVar15;
      unaff_x19[6] = lVar14;
      unaff_x19[5] = lVar12;
      unaff_x19[7] = lVar5;
      *unaff_x19 = lVar9;
      *(char *)((long)unaff_x19 + 0x2ab) = param_3;
      *(undefined1 *)((long)unaff_x19 + 0x339) = 1;
      unaff_x19[0x85] = 1;
      lVar9 = _UNK_00828190;
      unaff_x19[0x87] = _UNK_00828198;
      unaff_x19[0x86] = lVar9;
      unaff_x19[0x88] = 8;
      unaff_x19[0x8a] = 0;
      unaff_x19[0x89] = 0;
      unaff_x19[0x8c] = 0;
      unaff_x19[0x8b] = 0;
      unaff_x19[0x8d] = 1;
      unaff_x19[0x8f] = 0;
      unaff_x19[0x8e] = 0;
    }
  }
  else {
    uVar10 = 0x36;
    puVar7 = (undefined8 *)func_0x00187bd0(0x36,1);
    uVar4 = _UNK_008280c4;
    uVar3 = _UNK_008280bc;
    uVar2 = _UNK_008280ac;
    if (puVar7 == (undefined8 *)0x0) {
LAB_00220764:
      func_0x007a1f00(1,uVar10,&UNK_009c6a18);
      goto code_r0x00220778;
    }
    puVar7[1] = _UNK_008280b4;
    *puVar7 = uVar2;
    puVar7[3] = uVar4;
    puVar7[2] = uVar3;
    uVar2 = _UNK_008280cc;
    puVar7[5] = CONCAT26(_UNK_008280da,_UNK_008280d4);
    puVar7[4] = uVar2;
    *(ulong *)((long)puVar7 + 0x2e) = CONCAT62(_UNK_008280dc,_UNK_008280da);
    lVar9 = 0x36;
LAB_0022048c:
    unaff_x19[2] = lVar9;
    unaff_x19[3] = (long)puVar7;
    unaff_x19[4] = lVar9;
    lVar9 = _UNK_008281d0;
    unaff_x19[1] = _UNK_008281d8;
    *unaff_x19 = lVar9;
    if (*unaff_x21 != 0) {
      func_0x00187bd4(unaff_x21[1],*unaff_x21,1);
    }
    lVar9 = *unaff_x20;
    *unaff_x20 = lVar9 + -1;
    LORelease();
    if (lVar9 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa1d4();
    }
  }
  return;
}

