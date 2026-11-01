
/* WARNING: Possible PIC construction at 0x0055d978: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055d9ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055d9c8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0055d9b0) */
/* WARNING: Removing unreachable block (ram,0x0055d97c) */
/* WARNING: Removing unreachable block (ram,0x0055d9cc) */
/* WARNING: Removing unreachable block (ram,0x0055dbc4) */
/* WARNING: Removing unreachable block (ram,0x0055d9e0) */
/* WARNING: Removing unreachable block (ram,0x0055dbfc) */
/* WARNING: Removing unreachable block (ram,0x0055dc08) */
/* WARNING: Removing unreachable block (ram,0x0055dc28) */
/* WARNING: Removing unreachable block (ram,0x0055dc58) */

void FUN_0055d738(long param_1,long param_2,undefined8 param_3,undefined4 param_4,undefined8 param_5
                 ,undefined8 *param_6)

{
  undefined4 uVar1;
  ushort uVar2;
  ushort uVar3;
  char cVar4;
  undefined4 uVar5;
  code *pcVar6;
  undefined4 *puVar7;
  undefined8 uVar8;
  long *plVar9;
  long lVar10;
  long lVar11;
  undefined8 *puVar12;
  ulong uVar13;
  ulong uVar14;
  long *plVar15;
  long lVar16;
  long lVar17;
  undefined8 unaff_x22;
  ulong uVar18;
  undefined8 *unaff_x23;
  undefined8 uVar19;
  undefined8 *puVar20;
  ulong uVar21;
  long lVar22;
  ulong uVar23;
  long *unaff_x28;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  undefined8 *puStack0000000000000008;
  long *plStack0000000000000018;
  int iStack0000000000000028;
  undefined4 uStack000000000000002c;
  undefined1 uStack000000000000004b;
  undefined3 uStack000000000000004c;
  long lStack0000000000000090;
  ulong uStack0000000000000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  char cStack00000000000000b0;
  undefined4 uStack00000000000000b1;
  undefined3 uStack00000000000000b5;
  undefined4 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  long in_stack_000000c8;
  ulong in_stack_000000d0;
  long in_stack_000000d8;
  ulong in_stack_000000e0;
  
  _iStack0000000000000028 = (long *)(param_1 + 0x28);
  plStack0000000000000018 = (long *)(param_1 + 0x38);
  lStack0000000000000090 = *(long *)(param_2 + 8);
  uVar23 = *(ulong *)(param_2 + 0x10);
  puStack0000000000000008 = param_6;
  if (uVar23 < 5) {
    uStack0000000000000098 = 4;
LAB_0055d7f8:
    plVar15 = (long *)(param_1 + 0x30);
    func_0x0055cc18(&uStack00000000000000a0,(long)register0x00000008 + 0x88);
    plVar9 = _iStack0000000000000028;
  }
  else {
    uStack0000000000000098 = uVar23;
    if (uVar23 == 5) goto LAB_0055d7f8;
    plVar15 = (long *)(param_1 + 0x40);
    if (uVar23 == 6) {
      uStack0000000000000098 = 5;
      func_0x0055cc18(&uStack00000000000000a0,(long)register0x00000008 + 0x88);
      uVar23 = 0;
    }
    else {
      uStack0000000000000098 = 6;
      func_0x0055cc18(&uStack00000000000000a0,(long)register0x00000008 + 0x88);
      uVar23 = uVar23 - 7;
    }
    plVar9 = plStack0000000000000018;
  }
  lVar10 = *plVar15;
  lVar22 = *plVar9;
  uVar2 = *(ushort *)(lVar22 + 0x1c2);
  puVar20 = (undefined8 *)(lVar22 + 0xb8 + uVar23 * 0x18);
  puVar7 = (undefined4 *)(lVar22 + uVar23 * 0x10);
  lVar17 = uVar2 - uVar23;
  if (uVar2 < uVar23 || lVar17 == 0) {
    uVar8 = *unaff_x23;
    puVar20[1] = unaff_x23[1];
    *puVar20 = uVar8;
    puVar20[2] = unaff_x23[2];
  }
  else {
    _memmove(lVar22 + 0xb8 + (uVar23 + 1) * 0x18,puVar20,lVar17 * 0x18);
    uVar8 = *unaff_x23;
    puVar20[1] = unaff_x23[1];
    *puVar20 = uVar8;
    puVar20[2] = unaff_x23[2];
    _memmove(lVar22 + (uVar23 + 1) * 0x10,puVar7,lVar17 * 0x10);
  }
  *puVar7 = param_4;
  *(undefined8 *)(puVar7 + 2) = unaff_x22;
  *(ushort *)(lVar22 + 0x1c2) = uVar2 + 1;
  if (cStack00000000000000b0 == '\x02') {
    *unaff_x28 = lVar22;
    unaff_x28[1] = lVar10;
    unaff_x28[2] = uVar23;
    return;
  }
  lVar17 = *(long *)(in_stack_000000c8 + 0xb0);
  plVar15 = _iStack0000000000000028;
  uVar1 = uStack00000000000000b1;
  uStack000000000000004c = uStack00000000000000b5;
  uVar8 = uStack00000000000000a0;
  uVar24 = in_stack_000000a8;
  cVar4 = cStack00000000000000b0;
  uVar5 = in_stack_000000b8;
  uVar25 = in_stack_000000c0;
  lVar11 = in_stack_000000d8;
  uVar18 = in_stack_000000e0;
  while (uStack000000000000004b = (undefined1)((uint)uVar1 >> 0x18),
        _iStack0000000000000028 = plVar15, uStack00000000000000a0 = uVar8,
        in_stack_000000a8 = uVar24, cStack00000000000000b0 = cVar4, in_stack_000000b8 = uVar5,
        in_stack_000000c0 = uVar25, in_stack_000000d8 = lVar11, in_stack_000000e0 = uVar18,
        lVar17 != 0) {
    if (uVar18 != in_stack_000000d0) {
      func_0x007a247c(&UNK_008ab94a,0x35,&UNK_009ee108);
      goto LAB_0055de44;
    }
    uVar2 = *(ushort *)(in_stack_000000c8 + 0x1c0);
    uVar13 = (ulong)uVar2;
    uVar3 = *(ushort *)(lVar17 + 0x1c2);
    uVar18 = (ulong)uVar3;
    if (uVar3 < 0xb) {
      iStack0000000000000028 = uVar3 + 1;
      uVar14 = uVar13 + 1;
      puVar20 = (undefined8 *)(lVar17 + 0xb8 + uVar13 * 0x18);
      if (uVar2 < uVar3) {
        lVar16 = uVar18 - uVar13;
        uStack000000000000002c = (undefined4)((ulong)plVar15 >> 0x20);
        _memmove(lVar17 + 0xb8 + uVar14 * 0x18,puVar20,lVar16 * 0x18);
        puVar20[1] = uVar24;
        *puVar20 = uVar8;
        *(char *)(puVar20 + 2) = cVar4;
        *(undefined4 *)((long)puVar20 + 0x11) = uVar1;
        *(uint *)((long)puVar20 + 0x14) = CONCAT31(uStack000000000000004c,uStack000000000000004b);
        puVar7 = (undefined4 *)(lVar17 + uVar13 * 0x10);
        _memmove(lVar17 + uVar14 * 0x10,puVar7,lVar16 * 0x10);
        *puVar7 = uVar5;
        *(undefined8 *)(puVar7 + 2) = uVar25;
        _memmove(lVar17 + 0x1c8 + uVar13 * 8 + 0x10,lVar17 + 0x1c8 + uVar14 * 8,lVar16 * 8);
      }
      else {
        puVar20[1] = uVar24;
        *puVar20 = uVar8;
        *(char *)(puVar20 + 2) = cVar4;
        *(undefined4 *)((long)puVar20 + 0x11) = uVar1;
        *(uint *)((long)puVar20 + 0x14) = CONCAT31(uStack000000000000004c,uStack000000000000004b);
        puVar7 = (undefined4 *)(lVar17 + uVar13 * 0x10);
        *puVar7 = uVar5;
        *(undefined8 *)(puVar7 + 2) = uVar25;
      }
      *(long *)(lVar17 + uVar14 * 8 + 0x1c8) = lVar11;
      *(short *)(lVar17 + 0x1c2) = (short)iStack0000000000000028;
      if (uVar14 < uVar18 + 2) {
        lVar11 = uVar13 + 0x3a;
        do {
          lVar16 = *(long *)(lVar17 + lVar11 * 8);
          *(long *)(lVar16 + 0xb0) = lVar17;
          *(short *)(lVar16 + 0x1c0) = (short)lVar11 + -0x39;
          lVar11 = lVar11 + 1;
        } while (lVar11 - uVar18 != 0x3b);
      }
      goto LAB_0055ddfc;
    }
    lStack0000000000000090 = in_stack_000000d0 + 1;
    if (uVar2 < 5) {
      uStack0000000000000098 = 4;
      auVar26._8_8_ = (long)register0x00000008 + 0x88;
      auVar26._0_8_ = &uStack00000000000000a0;
      goto code_r0x0055de90;
    }
    if (uVar2 == 5) {
      uStack0000000000000098 = 5;
      auVar26._8_8_ = (long)register0x00000008 + 0x88;
      auVar26._0_8_ = &uStack00000000000000a0;
      goto code_r0x0055de90;
    }
    if (uVar2 == 6) {
      uStack0000000000000098 = 5;
      auVar26._8_8_ = (long)register0x00000008 + 0x88;
      auVar26._0_8_ = &uStack00000000000000a0;
      goto code_r0x0055de90;
    }
    uStack0000000000000098 = 6;
    uStack00000000000000b1 = uVar1;
    uStack00000000000000b5 = uStack000000000000004c;
    func_0x0055de90(&uStack00000000000000a0,(long)register0x00000008 + 0x88);
    uVar14 = uVar13 - 7;
    lVar16 = *plStack0000000000000018;
    uVar2 = *(ushort *)(lVar16 + 0x1c2);
    uVar21 = (ulong)uVar2;
    uVar18 = uVar13 - 6;
    puVar20 = (undefined8 *)(lVar16 + 0xb8 + (long)(int)uVar14 * 0x18);
    puVar7 = (undefined4 *)(lVar16 + uVar14 * 0x10);
    lVar17 = uVar21 - uVar14;
    if (uVar21 < uVar14 || lVar17 == 0) {
      puVar20[1] = uVar24;
      *puVar20 = uVar8;
      *(char *)(puVar20 + 2) = cVar4;
      *(undefined4 *)((long)puVar20 + 0x11) = uVar1;
      *(uint *)((long)puVar20 + 0x14) = CONCAT31(uStack000000000000004c,uStack000000000000004b);
      *puVar7 = uVar5;
      *(undefined8 *)(puVar7 + 2) = uVar25;
    }
    else {
      _memmove(lVar16 + 0xb8 + (long)(int)uVar18 * 0x18,puVar20,lVar17 * 0x18);
      puVar20[1] = uVar24;
      *puVar20 = uVar8;
      *(char *)(puVar20 + 2) = cVar4;
      *(undefined4 *)((long)puVar20 + 0x11) = uVar1;
      *(uint *)((long)puVar20 + 0x14) = CONCAT31(uStack000000000000004c,uStack000000000000004b);
      _memmove(lVar16 + uVar18 * 0x10,puVar7,lVar17 * 0x10);
      *puVar7 = uVar5;
      *(undefined8 *)(puVar7 + 2) = uVar25;
      _memmove(lVar16 + 0x1c8 + uVar14 * 8 + 0x10,lVar16 + 0x1c8 + uVar18 * 8,lVar17 * 8);
    }
    *(long *)(lVar16 + uVar18 * 8 + 0x1c8) = lVar11;
    *(ushort *)(lVar16 + 0x1c2) = uVar2 + 1;
    if (uVar18 < uVar21 + 2) {
      lVar17 = uVar13 + 0x33;
      do {
        lVar11 = *(long *)(lVar16 + lVar17 * 8);
        *(long *)(lVar11 + 0xb0) = lVar16;
        *(short *)(lVar11 + 0x1c0) = (short)lVar17 + -0x39;
        lVar17 = lVar17 + 1;
      } while (lVar17 - uVar21 != 0x3b);
    }
    if (cStack00000000000000b0 == '\x02') goto LAB_0055ddfc;
    plVar15 = _iStack0000000000000028;
    uVar1 = uStack00000000000000b1;
    uStack000000000000004c = uStack00000000000000b5;
    uVar8 = uStack00000000000000a0;
    uVar24 = in_stack_000000a8;
    cVar4 = cStack00000000000000b0;
    uVar5 = in_stack_000000b8;
    uVar25 = in_stack_000000c0;
    lVar11 = in_stack_000000d8;
    uVar18 = in_stack_000000e0;
    lVar17 = *(long *)(in_stack_000000c8 + 0xb0);
  }
  plVar15 = (long *)*puStack0000000000000008;
  lVar17 = *plVar15;
  if (lVar17 == 0) {
LAB_0055de44:
    func_0x007a23bc(&UNK_009ee038);
LAB_0055de50:
    func_0x007a1f18(8,0x228);
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x55de60);
    (*pcVar6)();
  }
  uVar13 = plVar15[1];
  puVar7 = (undefined4 *)func_0x00187bd0(0x228,8);
  if (puVar7 == (undefined4 *)0x0) goto LAB_0055de50;
  *(undefined8 *)(puVar7 + 0x2c) = 0;
  *(undefined2 *)((long)puVar7 + 0x1c2) = 0;
  *(long *)(puVar7 + 0x72) = lVar17;
  *(undefined4 **)(lVar17 + 0xb0) = puVar7;
  *(undefined2 *)(lVar17 + 0x1c0) = 0;
  *plVar15 = (long)puVar7;
  plVar15[1] = uVar13 + 1;
  if (uVar18 == uVar13) {
    *(undefined2 *)((long)puVar7 + 0x1c2) = 1;
    *(undefined8 *)(puVar7 + 0x30) = uVar24;
    *(undefined8 *)(puVar7 + 0x2e) = uVar8;
    *(char *)(puVar7 + 0x32) = cVar4;
    *(undefined4 *)((long)puVar7 + 0xc9) = uVar1;
    puVar7[0x33] = CONCAT31(uStack000000000000004c,uStack000000000000004b);
    *puVar7 = uVar5;
    *(undefined8 *)(puVar7 + 2) = uVar25;
    *(long *)(puVar7 + 0x74) = lVar11;
    *(undefined4 **)(lVar11 + 0xb0) = puVar7;
    *(undefined2 *)(lVar11 + 0x1c0) = 1;
LAB_0055ddfc:
    *unaff_x28 = lVar22;
    unaff_x28[1] = lVar10;
    unaff_x28[2] = uVar23;
    return;
  }
  uVar8 = func_0x007a247c(&UNK_008ab894,0x30,&UNK_009ee068);
  func_0x007a200c(&uStack00000000000000a0);
  __Unwind_Resume(uVar8);
  auVar26 = func_0x007a2668();
code_r0x0055de90:
  plVar15 = auVar26._8_8_;
  puVar20 = auVar26._0_8_;
  lVar10 = *plVar15;
  uVar2 = *(ushort *)(lVar10 + 0x1c2);
  lVar17 = func_0x00187bd0(0x228,8);
  if (lVar17 == 0) {
    func_0x007a1f18(8,0x228);
  }
  else {
    *(undefined8 *)(lVar17 + 0xb0) = 0;
    uVar23 = plVar15[2];
    uVar3 = *(ushort *)(lVar10 + 0x1c2);
    uVar18 = (ulong)uVar3 + ~uVar23;
    *(short *)(lVar17 + 0x1c2) = (short)uVar18;
    puVar12 = (undefined8 *)(lVar10 + 0xb8 + uVar23 * 0x18);
    uVar25 = puVar12[1];
    uVar24 = *puVar12;
    uVar8 = puVar12[2];
    if (uVar18 < 0xc) {
      lVar22 = uVar23 + 1;
      if ((ulong)uVar3 - lVar22 == uVar18) {
        puVar7 = (undefined4 *)(lVar10 + uVar23 * 0x10);
        uVar1 = *puVar7;
        uVar19 = *(undefined8 *)(puVar7 + 2);
        _memcpy(lVar17 + 0xb8,lVar10 + 0xb8 + lVar22 * 0x18,uVar18 * 0x18);
        _memcpy(lVar17,lVar10 + lVar22 * 0x10,uVar18 * 0x10);
        *(short *)(lVar10 + 0x1c2) = (short)uVar23;
        uVar18 = (ulong)*(ushort *)(lVar17 + 0x1c2);
        lVar22 = uVar18 + 1;
        if (uVar18 < 0xc) {
          if (uVar2 - uVar23 == lVar22) {
            _memcpy(lVar17 + 0x1c8,lVar10 + uVar23 * 8 + 0x1d0,lVar22 * 8);
            uVar23 = 0;
            lVar22 = plVar15[1];
            do {
              lVar11 = *(long *)(lVar17 + 0x1c8 + uVar23 * 8);
              *(long *)(lVar11 + 0xb0) = lVar17;
              *(short *)(lVar11 + 0x1c0) = (short)uVar23;
              if (uVar18 <= uVar23) break;
              uVar23 = uVar23 + 1;
            } while (uVar23 <= uVar18);
            puVar20[1] = uVar25;
            *puVar20 = uVar24;
            puVar20[2] = uVar8;
            *(undefined4 *)(puVar20 + 3) = uVar1;
            puVar20[4] = uVar19;
            puVar20[5] = lVar10;
            puVar20[6] = lVar22;
            puVar20[7] = lVar17;
            puVar20[8] = lVar22;
            return;
          }
          func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
        }
        else {
          func_0x007a28b0(lVar22,0xc,&UNK_009ee0f0);
        }
      }
      else {
        func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
      }
      goto code_r0x0055e080;
    }
  }
  func_0x007a28b0(uVar18,0xb,&UNK_009ee0d8);
code_r0x0055e080:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x55e084);
  (*pcVar6)();
}

