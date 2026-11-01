
/* WARNING: Possible PIC construction at 0x001f7a9c: Changing call to branch */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001fafb0(void)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  code *pcVar10;
  long lVar11;
  long lVar12;
  long *plVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  long lVar17;
  undefined8 *puVar18;
  long *plVar19;
  long *unaff_x19;
  undefined8 uVar20;
  undefined8 *unaff_x20;
  ulong uVar21;
  undefined *puVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  undefined7 uStack0000000000000000;
  undefined1 uStack0000000000000007;
  undefined7 uStack0000000000000008;
  undefined1 uStack000000000000000f;
  undefined1 uStack0000000000000010;
  long lStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 *in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  long *in_stack_000000b8;
  undefined8 uStack00000000000000c0;
  undefined *in_stack_000000c8;
  undefined1 uStack00000000000000d0;
  uint7 uStack_48;
  undefined6 uStack_37;
  undefined1 uStack_31;
  
  uVar20 = in_stack_00000068;
  lVar11 = in_stack_00000060;
  uVar21 = in_stack_00000058;
  puVar14 = in_stack_00000040;
  uStack0000000000000008 = SUB87(in_stack_00000050,0);
  uStack000000000000000f = (undefined1)((ulong)in_stack_00000050 >> 0x38);
  uStack0000000000000000 = (undefined7)in_stack_00000048;
  uStack0000000000000007 = (undefined1)((ulong)in_stack_00000048 >> 0x38);
  lStack0000000000000018 = in_stack_00000060;
  _uStack0000000000000010 = in_stack_00000058;
  uStack0000000000000028 = in_stack_00000070;
  uStack0000000000000020 = in_stack_00000068;
  uStack0000000000000030 = in_stack_00000078;
  if (in_stack_00000040 != (undefined8 *)0x8000000000000000) {
    in_stack_00000060 = (long)in_stack_00000050;
    in_stack_00000058 = in_stack_00000048;
    in_stack_00000068 = uVar21;
    in_stack_00000048 = 1;
    in_stack_00000040 = (undefined8 *)0x1;
    in_stack_00000050 = puVar14;
    puVar14 = (undefined8 *)func_0x00187bd0(0x50,8);
    if (puVar14 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x50);
    }
    else {
      puVar14[5] = in_stack_00000068;
      puVar14[4] = in_stack_00000060;
      puVar14[7] = uVar20;
      puVar14[6] = lVar11;
      puVar14[9] = in_stack_00000078;
      puVar14[8] = in_stack_00000070;
      puVar14[1] = in_stack_00000048;
      *puVar14 = in_stack_00000040;
      puVar14[3] = in_stack_00000058;
      puVar14[2] = in_stack_00000050;
      in_stack_00000048 = 1;
      in_stack_00000040 = (undefined8 *)0x1;
      in_stack_00000050 = puVar14;
      puVar14 = (undefined8 *)func_0x00187bd0(0x18,8);
      if (puVar14 != (undefined8 *)0x0) {
        puVar14[1] = in_stack_00000048;
        *puVar14 = in_stack_00000040;
        puVar14[2] = in_stack_00000050;
        lVar12 = unaff_x19[0x14];
        func_0x00244d50(&uStack0000000000000010,0x20);
        uVar9 = in_stack_00000058;
        puVar16 = in_stack_00000050;
        uVar8 = in_stack_00000048;
        uVar7 = in_stack_00000040;
        uVar6 = in_stack_00000038;
        uVar5 = uStack0000000000000030;
        uVar4 = uStack0000000000000028;
        uVar20 = uStack0000000000000020;
        lVar11 = lStack0000000000000018;
        uVar21 = _uStack0000000000000010;
        uStack0000000000000007 = (undefined1)in_stack_00000058;
        uStack0000000000000008 = (undefined7)(in_stack_00000058 >> 8);
        uStack0000000000000000 = (undefined7)((ulong)in_stack_00000050 >> 8);
        uStack_31 = (undefined1)uStack0000000000000020;
        uStack_37 = (undefined6)((ulong)lStack0000000000000018 >> 0x10);
        puVar15 = (undefined8 *)func_0x00187bd0(0x70,8);
        if (puVar15 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x70);
        }
        else {
          puVar15[9] = uVar6;
          puVar15[8] = uVar5;
          puVar15[0xb] = uVar8;
          puVar15[10] = uVar7;
          puVar15[0xd] = uVar9;
          puVar15[0xc] = puVar16;
          puVar15[1] = 1;
          *puVar15 = 1;
          puVar15[3] = (ulong)uStack_48 << 8;
          puVar15[2] = 0;
          puVar15[5] = lVar11;
          puVar15[4] = uVar21;
          puVar15[7] = uVar4;
          puVar15[6] = uVar20;
          lVar24 = unaff_x19[0x13];
          lVar23 = unaff_x19[0x12];
          lVar11 = unaff_x19[0x10];
          lVar2 = unaff_x19[0x11];
          puVar16 = (undefined8 *)func_0x00187bd0(0x10,8);
          if (puVar16 == (undefined8 *)0x0) {
            func_0x007a1f18(8,0x10);
          }
          else {
            puVar16[1] = 1;
            *puVar16 = 1;
            uVar1 = unaff_x19[0x15];
            lVar3 = unaff_x19[0x16];
            _uStack0000000000000010 = uVar1;
            lStack0000000000000018 = lVar3;
            lVar17 = func_0x00187bd0(0x20,8);
            uVar4 = _UNK_007fc128;
            uVar20 = _UNK_007fc120;
            if (lVar17 == 0) {
              func_0x007a1f00(8,0x20,&UNK_009c61e8);
            }
            else {
              puVar18 = (undefined8 *)func_0x00187bd0(0x50,8);
              if (puVar18 != (undefined8 *)0x0) {
                puVar18[5] = 4;
                puVar18[4] = uVar21 & 0xffffffffffffff00;
                puVar18[7] = 0;
                puVar18[6] = lVar17;
                puVar18[9] = 4;
                puVar18[8] = 0;
                puVar18[1] = 1;
                *puVar18 = 1;
                puVar18[3] = uVar4;
                puVar18[2] = uVar20;
                lVar17 = unaff_x19[8];
                lVar26 = unaff_x19[0xb];
                lVar25 = unaff_x19[10];
                unaff_x20[0x14] = unaff_x19[9];
                unaff_x20[0x13] = lVar17;
                unaff_x20[0x16] = lVar26;
                unaff_x20[0x15] = lVar25;
                lVar17 = unaff_x19[0xc];
                lVar26 = unaff_x19[0xf];
                lVar25 = unaff_x19[0xe];
                unaff_x20[0x18] = unaff_x19[0xd];
                unaff_x20[0x17] = lVar17;
                unaff_x20[0x1a] = lVar26;
                unaff_x20[0x19] = lVar25;
                lVar17 = *unaff_x19;
                lVar26 = unaff_x19[3];
                lVar25 = unaff_x19[2];
                unaff_x20[0xc] = unaff_x19[1];
                unaff_x20[0xb] = lVar17;
                unaff_x20[0xe] = lVar26;
                unaff_x20[0xd] = lVar25;
                lVar17 = unaff_x19[4];
                lVar26 = unaff_x19[7];
                lVar25 = unaff_x19[6];
                unaff_x20[0x10] = unaff_x19[5];
                unaff_x20[0xf] = lVar17;
                unaff_x20[0x12] = lVar26;
                unaff_x20[0x11] = lVar25;
                unaff_x20[3] = 8;
                unaff_x20[2] = 0;
                unaff_x20[0x1c] = &UNK_009c5ad0;
                unaff_x20[0x1b] = puVar15;
                *unaff_x20 = 0;
                unaff_x20[0x1d] = CONCAT17(uStack_31,CONCAT61(uStack_37,2));
                unaff_x20[0x1e] = puVar14;
                unaff_x20[0x1f] = &UNK_009c59f0;
                unaff_x20[0x20] = puVar16;
                *(undefined4 *)(unaff_x20 + 0x2a) = 1;
                unaff_x20[0x21] = &UNK_009c5a60;
                unaff_x20[0x22] = uVar1;
                unaff_x20[0x23] = lVar3;
                unaff_x20[0x24] = lVar12;
                unaff_x20[0x29] = lVar24;
                unaff_x20[0x28] = lVar23;
                unaff_x20[0x25] = lVar11;
                unaff_x20[0x26] = lVar2;
                unaff_x20[4] = 0;
                unaff_x20[5] = 0;
                unaff_x20[6] = 8;
                unaff_x20[7] = 0;
                unaff_x20[8] = 0;
                unaff_x20[9] = 8;
                unaff_x20[10] = 0;
                unaff_x20[0x27] = puVar18;
                return;
              }
              func_0x007a1f18(8,0x50);
            }
          }
        }
                    /* WARNING: Does not return */
        pcVar10 = (code *)SoftwareBreakpoint(1,0x1fb4b4);
        (*pcVar10)();
      }
      func_0x007a1f18(8,0x18);
    }
                    /* WARNING: Does not return */
    pcVar10 = (code *)SoftwareBreakpoint(1,0x1fb104);
    (*pcVar10)();
  }
  unaff_x20[2] = in_stack_00000050;
  unaff_x20[1] = in_stack_00000048;
  unaff_x20[4] = in_stack_00000060;
  unaff_x20[3] = in_stack_00000058;
  unaff_x20[6] = in_stack_00000070;
  unaff_x20[5] = in_stack_00000068;
  unaff_x20[7] = in_stack_00000078;
  *unaff_x20 = 2;
  puVar16 = (undefined8 *)&uStack00000000000000d0;
  puVar14 = &uStack00000000000000c0;
  uVar20 = 0x8000000000000002;
  plVar13 = unaff_x19 + 0x10;
  lVar11 = *(long *)*plVar13;
  *(long *)*plVar13 = lVar11 + -1;
  LORelease();
  if (lVar11 == 1) {
    DataMemoryBarrier(2,1);
    puVar22 = &UNK_001f7aa0;
    puVar16 = &uStack00000000000000a0;
    plVar19 = unaff_x19;
    goto code_r0x001f9964;
  }
  if (*unaff_x19 == -0x7ffffffffffffffe) {
    lVar11 = *(long *)unaff_x19[0x14];
    *(long *)unaff_x19[0x14] = lVar11 + -1;
    LORelease();
    if (lVar11 == 1) goto code_r0x001f7b0c;
code_r0x001f7ac4:
    lVar11 = *(long *)unaff_x19[0x15];
    *(long *)unaff_x19[0x15] = lVar11 + -1;
    LORelease();
    uVar20 = in_stack_000000b0;
    plVar19 = in_stack_000000b8;
    puVar14 = uStack00000000000000c0;
    puVar22 = in_stack_000000c8;
  }
  else {
    func_0x0016d960();
    lVar11 = *(long *)unaff_x19[0x14];
    *(long *)unaff_x19[0x14] = lVar11 + -1;
    LORelease();
    if (lVar11 != 1) goto code_r0x001f7ac4;
code_r0x001f7b0c:
    DataMemoryBarrier(2,1);
    func_0x001f9f08();
    lVar11 = *(long *)unaff_x19[0x15];
    *(long *)unaff_x19[0x15] = lVar11 + -1;
    LORelease();
    uVar20 = in_stack_000000b0;
    plVar19 = in_stack_000000b8;
    puVar14 = uStack00000000000000c0;
    puVar22 = in_stack_000000c8;
  }
  if (lVar11 != 1) {
    return;
  }
  plVar13 = unaff_x19 + 0x15;
  DataMemoryBarrier(2,1);
  in_stack_000000b0 = uVar20;
  in_stack_000000b8 = plVar19;
  uStack00000000000000c0 = puVar14;
  in_stack_000000c8 = puVar22;
code_r0x001f9964:
  *(undefined8 *)((long)puVar16 + -0x30) = uStack00000000000000a0;
  *(undefined8 *)((long)puVar16 + -0x28) = in_stack_000000a8;
  *(undefined8 *)((long)puVar16 + -0x20) = uVar20;
  *(long **)((long)puVar16 + -0x18) = plVar19;
  *(undefined8 **)((long)puVar16 + -0x10) = puVar14;
  *(undefined **)((long)puVar16 + -8) = puVar22;
  lVar11 = *plVar13;
  puVar14 = (undefined8 *)plVar13[1];
  uVar21 = puVar14[2];
  if ((code *)*puVar14 != (code *)0x0) {
    (*(code *)*puVar14)(lVar11 + (uVar21 - 1 & 0xfffffffffffffff0) + 0x10);
  }
  if (lVar11 != -1) {
    lVar12 = *(long *)(lVar11 + 8);
    *(long *)(lVar11 + 8) = lVar12 + -1;
    LORelease();
    if (lVar12 == 1) {
      DataMemoryBarrier(2,1);
      if (uVar21 < 9) {
        uVar21 = 8;
      }
      uVar21 = uVar21 + puVar14[1] + 0xf & -uVar21;
      if (uVar21 != 0) {
        *(undefined8 *)((long)puVar16 + -0x10) = *(undefined8 *)((long)puVar16 + -0x10);
        *(undefined8 *)((long)puVar16 + -8) = *(undefined8 *)((long)puVar16 + -8);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(lVar11,uVar21);
        return;
      }
    }
  }
  return;
}

