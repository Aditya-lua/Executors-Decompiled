
/* WARNING: Removing unreachable block (ram,0x00238ddc) */
/* WARNING: Removing unreachable block (ram,0x00238824) */
/* WARNING: Removing unreachable block (ram,0x00238e00) */
/* WARNING: Removing unreachable block (ram,0x00238830) */
/* WARNING: Removing unreachable block (ram,0x0023883c) */
/* WARNING: Removing unreachable block (ram,0x00238844) */
/* WARNING: Removing unreachable block (ram,0x00238854) */
/* WARNING: Removing unreachable block (ram,0x0023886c) */
/* WARNING: Removing unreachable block (ram,0x00238864) */
/* WARNING: Removing unreachable block (ram,0x00237f00) */
/* WARNING: Removing unreachable block (ram,0x00237f08) */
/* WARNING: Removing unreachable block (ram,0x00237f18) */
/* WARNING: Removing unreachable block (ram,0x00237f1c) */
/* WARNING: Removing unreachable block (ram,0x00237f34) */
/* WARNING: Removing unreachable block (ram,0x00237f3c) */
/* WARNING: Removing unreachable block (ram,0x00237f44) */
/* WARNING: Removing unreachable block (ram,0x00237f48) */
/* WARNING: Removing unreachable block (ram,0x00237f50) */
/* WARNING: Removing unreachable block (ram,0x00237f58) */
/* WARNING: Removing unreachable block (ram,0x00237f68) */
/* WARNING: Removing unreachable block (ram,0x00237f70) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00238a58(undefined1 param_1 [16],undefined1 param_2 [16])

{
  undefined8 uVar1;
  undefined2 uVar2;
  ulong uVar3;
  code *pcVar4;
  uint uVar5;
  long lVar6;
  long lVar7;
  undefined1 *puVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  undefined *puVar11;
  long in_x9;
  undefined8 uVar12;
  long unaff_x19;
  undefined8 uVar13;
  long lVar14;
  undefined8 *unaff_x22;
  ulong uVar15;
  long *plVar16;
  undefined8 *unaff_x25;
  long lVar17;
  uint uVar18;
  ulong uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined1 auVar38 [16];
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  undefined8 in_stack_00000048;
  long *in_stack_00000058;
  long *in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined8 *in_stack_00000078;
  undefined8 *in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 *in_stack_00000098;
  undefined8 uStack00000000000000a0;
  ulong in_stack_000001c0;
  long in_stack_000001c8;
  ulong in_stack_000001d0;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  undefined8 in_stack_000001f0;
  undefined8 in_stack_000001f8;
  long in_stack_00000300;
  undefined8 in_stack_00000308;
  long in_stack_000003e0;
  ulong in_stack_000003e8;
  undefined8 in_stack_00000460;
  undefined6 in_stack_0000047a;
  undefined1 auStack_7ffffffe [2147483646];
  
  *(long *)(in_x9 + 0x40) = param_1._8_8_;
  *(long *)(in_x9 + 0x38) = param_1._0_8_;
  *(undefined8 *)(in_x9 + 0x50) = in_stack_000001e8;
  *(undefined8 *)(in_x9 + 0x48) = in_stack_000001e0;
  *(undefined8 *)(in_x9 + 0x60) = in_stack_000001f8;
  *(undefined8 *)(in_x9 + 0x58) = in_stack_000001f0;
  *(long *)(in_x9 + 0x30) = param_2._8_8_;
  *(long *)(in_x9 + 0x28) = param_2._0_8_;
  func_0x0024a370(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x8000039e);
  if ((code *)*unaff_x25 != (code *)0x0) {
    (*(code *)*unaff_x25)();
  }
  if (unaff_x25[1] != 0) {
    func_0x00187bd4();
  }
  if (in_stack_00000300 != 0) {
    func_0x00187bd4(in_stack_00000308,in_stack_00000300,1);
  }
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(in_stack_00000048,in_stack_00000038 << 2,2);
  }
  lVar6 = *(long *)(*in_stack_00000060 + 0xa8);
  lVar17 = *(long *)(*in_stack_00000060 + 0xa0) +
           (*(long *)(lVar6 + 0x10) - 1U & 0xfffffffffffffff0);
  uVar5 = (**(code **)(lVar6 + 0x20))(lVar17 + 0x10);
  uVar18 = 0;
  if (uVar5 == 0) goto LAB_00238eac;
  (**(code **)(lVar6 + 0x50))(auStack_7ffffffe + 0x800002fe,lVar17 + 0x10);
  auVar38 = (**(code **)(lVar6 + 0x30))(lVar17 + 0x10);
  auVar38._8_8_ = auVar38._8_8_;
  lVar17 = auVar38._0_8_;
  uVar13 = 0;
  auVar38._8_8_ = 0;
  auVar38._0_8_ = auVar38._8_8_;
  uVar19 = auVar38._8_8_ * 0x18;
  if ((SUB168(auVar38 * ZEXT816(0x18),8) == 0) && (uVar19 < 0x7ffffffffffffff9)) {
    if (uVar19 == 0) {
      uVar3 = 0;
      lVar6 = 8;
    }
    else {
      uVar13 = 8;
      lVar6 = func_0x00187bd0(uVar19,8);
      if (lVar6 == 0) goto LAB_002396d4;
      uVar3 = auVar38._8_8_;
      if (auVar38._8_8_ != 0) {
        uVar15 = 0;
        uStack0000000000000068 = 1;
        plVar16 = (long *)(lVar6 + 0x10);
        do {
          if (uVar19 == 0) break;
          lVar14 = *(long *)(lVar17 + 0x10);
          if (lVar14 < 0) {
            uStack0000000000000068 = 0;
LAB_002396bc:
            func_0x007a1f00(uStack0000000000000068,lVar14,&UNK_009c24c0);
            goto code_r0x00239700;
          }
          uVar13 = *(undefined8 *)(lVar17 + 8);
          if (lVar14 == 0) {
            lVar7 = 1;
          }
          else {
            lVar7 = func_0x00187bd0(lVar14,1);
            if (lVar7 == 0) goto LAB_002396bc;
          }
          _memcpy(lVar7,uVar13,lVar14);
          uVar15 = uVar15 + 1;
          lVar17 = lVar17 + 0x18;
          plVar16[-2] = lVar14;
          plVar16[-1] = lVar7;
          *plVar16 = lVar14;
          uVar19 = uVar19 - 0x18;
          plVar16 = plVar16 + 3;
        } while (auVar38._8_8_ != uVar15);
      }
    }
    in_stack_000001c8 = lVar6;
    in_stack_000001c0 = uVar3;
    in_stack_000001d0 = auVar38._8_8_;
    puVar8 = (undefined1 *)func_0x00187bd0(4,1);
    in_stack_000003e8 = in_stack_000001d0;
    in_stack_000003e0 = in_stack_000001c8;
    if (puVar8 != (undefined1 *)0x0) {
      *puVar8 = 0;
      puVar8[2] = 7;
      func_0x0024a370(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x8000039e);
      uVar18 = uVar5;
LAB_00238eac:
      func_0x0024a370(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x8000039e);
      func_0x00248ae4(*in_stack_00000098,auStack_7ffffffe + 0x8000039e,0);
      if ((uVar18 & 1) == 0) {
        uVar25 = in_stack_00000080[1];
        uVar20 = *in_stack_00000080;
        uVar34 = in_stack_00000080[3];
        uVar30 = in_stack_00000080[2];
        uVar26 = in_stack_00000080[5];
        uVar21 = in_stack_00000080[4];
        uVar10 = in_stack_00000080[6];
        uVar27 = in_stack_00000078[1];
        uVar22 = *in_stack_00000078;
        uVar35 = in_stack_00000078[3];
        uVar31 = in_stack_00000078[2];
        uVar28 = in_stack_00000078[5];
        uVar23 = in_stack_00000078[4];
        uVar36 = in_stack_00000078[7];
        uVar32 = in_stack_00000078[6];
        uVar29 = *(undefined8 *)(unaff_x19 + 0x68);
        uVar24 = *(undefined8 *)(unaff_x19 + 0x60);
        uVar37 = *(undefined8 *)(unaff_x19 + 0x78);
        uVar33 = *(undefined8 *)(unaff_x19 + 0x70);
        uVar12 = *(undefined8 *)(unaff_x19 + 0x80);
        uVar13 = *(undefined8 *)(unaff_x19 + 0x50);
        uVar1 = *(undefined8 *)(unaff_x19 + 0x58);
        uVar2 = *(undefined2 *)(unaff_x19 + 200);
        puVar9 = (undefined8 *)func_0x0020a620(0xe0);
        puVar9[0x15] = uVar36;
        puVar9[0x14] = uVar32;
        puVar9[0x17] = uVar29;
        puVar9[0x16] = uVar24;
        puVar9[0x19] = uVar37;
        puVar9[0x18] = uVar33;
        puVar9[0x1b] = CONCAT62(in_stack_0000047a,uVar2);
        puVar9[0x1a] = uVar12;
        puVar9[0xd] = in_stack_00000090;
        puVar9[0xc] = in_stack_00000088;
        puVar9[0xf] = uVar27;
        puVar9[0xe] = uVar22;
        puVar9[0x11] = uVar35;
        puVar9[0x10] = uVar31;
        puVar9[0x13] = uVar28;
        puVar9[0x12] = uVar23;
        puVar9[5] = uVar26;
        puVar9[4] = uVar21;
        puVar9[7] = 0x8000000000000000;
        puVar9[6] = uVar10;
        puVar9[9] = in_stack_000003e8;
        puVar9[8] = in_stack_000003e0;
        puVar9[0xb] = uVar1;
        puVar9[10] = uVar13;
        puVar11 = &UNK_009c9398;
        puVar9[1] = uVar25;
        *puVar9 = uVar20;
        puVar9[3] = uVar34;
        puVar9[2] = uVar30;
      }
      else {
        uVar25 = in_stack_00000080[1];
        uVar20 = *in_stack_00000080;
        uVar34 = in_stack_00000080[3];
        uVar30 = in_stack_00000080[2];
        uVar26 = in_stack_00000080[5];
        uVar21 = in_stack_00000080[4];
        uVar10 = in_stack_00000080[6];
        uVar27 = in_stack_00000078[1];
        uVar22 = *in_stack_00000078;
        uVar35 = in_stack_00000078[3];
        uVar31 = in_stack_00000078[2];
        uVar28 = in_stack_00000078[5];
        uVar23 = in_stack_00000078[4];
        uVar36 = in_stack_00000078[7];
        uVar32 = in_stack_00000078[6];
        uVar29 = *(undefined8 *)(unaff_x19 + 0x68);
        uVar24 = *(undefined8 *)(unaff_x19 + 0x60);
        uVar37 = *(undefined8 *)(unaff_x19 + 0x78);
        uVar33 = *(undefined8 *)(unaff_x19 + 0x70);
        uVar12 = *(undefined8 *)(unaff_x19 + 0x80);
        uVar13 = *(undefined8 *)(unaff_x19 + 0x50);
        uVar1 = *(undefined8 *)(unaff_x19 + 0x58);
        uVar2 = *(undefined2 *)(unaff_x19 + 200);
        puVar9 = (undefined8 *)func_0x0020a620(200);
        puVar9[0x15] = uVar33;
        puVar9[0x14] = uVar29;
        puVar9[0x17] = uVar12;
        puVar9[0x16] = uVar37;
        puVar9[0x18] = CONCAT62((int6)((ulong)in_stack_00000460 >> 0x10),uVar2);
        puVar9[0xd] = uVar31;
        puVar9[0xc] = uVar27;
        puVar9[0xf] = uVar23;
        puVar9[0xe] = uVar35;
        puVar9[0x11] = uVar32;
        puVar9[0x10] = uVar28;
        puVar9[0x13] = uVar24;
        puVar9[0x12] = uVar36;
        puVar9[5] = uVar26;
        puVar9[4] = uVar21;
        puVar9[7] = uVar13;
        puVar9[6] = uVar10;
        puVar9[9] = in_stack_00000088;
        puVar9[8] = uVar1;
        puVar9[0xb] = uVar22;
        puVar9[10] = in_stack_00000090;
        puVar11 = &UNK_009c93e0;
        puVar9[1] = uVar25;
        *puVar9 = uVar20;
        puVar9[3] = uVar34;
        puVar9[2] = uVar30;
      }
      unaff_x22[1] = puVar9;
      unaff_x22[2] = puVar11;
      *unaff_x22 = 0x8000000000000027;
      if (uStack00000000000000a0 != -0x8000000000000000) {
        func_0x001bf1c4(&uStack00000000000000a0);
      }
      if (*in_stack_00000058 != 0) {
        func_0x00187bd4(in_stack_00000028,*in_stack_00000058 << 2,2);
      }
      return;
    }
    func_0x007a1f18(1,4);
  }
  else {
LAB_002396d4:
    func_0x007a1f00(uVar13,uVar19,&UNK_009c8ce8);
  }
code_r0x00239700:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x239704);
  (*pcVar4)();
}

