
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

void FUN_0055d868(long param_1)

{
  undefined4 uVar1;
  ushort uVar2;
  ushort uVar3;
  char cVar4;
  undefined4 uVar5;
  code *pcVar6;
  undefined4 *puVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  short unaff_w19;
  ulong uVar12;
  ulong uVar13;
  long *plVar14;
  long lVar15;
  undefined4 unaff_w21;
  long lVar16;
  undefined8 unaff_x22;
  ulong uVar17;
  undefined8 *puVar18;
  undefined8 *unaff_x23;
  undefined4 *unaff_x24;
  undefined8 uVar19;
  undefined8 *unaff_x25;
  long unaff_x26;
  ulong uVar20;
  long unaff_x27;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined1 auVar23 [16];
  undefined8 *in_stack_00000008;
  long *in_stack_00000010;
  long *in_stack_00000018;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined1 uStack000000000000004b;
  undefined3 uStack000000000000004c;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
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
  
  _memmove(param_1 + unaff_x26 * 0x18);
  uVar8 = *unaff_x23;
  unaff_x25[1] = unaff_x23[1];
  *unaff_x25 = uVar8;
  unaff_x25[2] = unaff_x23[2];
  _memmove(unaff_x27 + unaff_x26 * 0x10);
  *unaff_x24 = unaff_w21;
  *(undefined8 *)(unaff_x24 + 2) = unaff_x22;
  *(short *)(unaff_x27 + 0x1c2) = unaff_w19 + 1;
  if (cStack00000000000000b0 == '\x02') {
    *in_stack_00000010 = unaff_x27;
    in_stack_00000010[1] = in_stack_00000030;
    in_stack_00000010[2] = in_stack_00000038;
    return;
  }
  lVar16 = *(long *)(in_stack_000000c8 + 0xb0);
  uVar1 = uStack00000000000000b1;
  uStack000000000000004c = uStack00000000000000b5;
  uVar8 = uStack00000000000000a0;
  uVar21 = in_stack_000000a8;
  cVar4 = cStack00000000000000b0;
  uVar5 = in_stack_000000b8;
  uVar22 = in_stack_000000c0;
  lVar9 = in_stack_000000d8;
  uVar17 = in_stack_000000e0;
  while (uStack000000000000004b = (undefined1)((uint)uVar1 >> 0x18), uStack00000000000000a0 = uVar8,
        in_stack_000000a8 = uVar21, cStack00000000000000b0 = cVar4, in_stack_000000b8 = uVar5,
        in_stack_000000c0 = uVar22, in_stack_000000d8 = lVar9, in_stack_000000e0 = uVar17,
        lVar16 != 0) {
    if (uVar17 != in_stack_000000d0) {
      func_0x007a247c(&UNK_008ab94a,0x35,&UNK_009ee108);
      goto LAB_0055de44;
    }
    uVar2 = *(ushort *)(in_stack_000000c8 + 0x1c0);
    uVar12 = (ulong)uVar2;
    uVar3 = *(ushort *)(lVar16 + 0x1c2);
    uVar17 = (ulong)uVar3;
    if (uVar3 < 0xb) {
      uVar13 = uVar12 + 1;
      puVar18 = (undefined8 *)(lVar16 + 0xb8 + uVar12 * 0x18);
      if (uVar2 < uVar3) {
        lVar15 = uVar17 - uVar12;
        _memmove(lVar16 + 0xb8 + uVar13 * 0x18,puVar18,lVar15 * 0x18);
        puVar18[1] = uVar21;
        *puVar18 = uVar8;
        *(char *)(puVar18 + 2) = cVar4;
        *(undefined4 *)((long)puVar18 + 0x11) = uVar1;
        *(uint *)((long)puVar18 + 0x14) = CONCAT31(uStack000000000000004c,uStack000000000000004b);
        puVar7 = (undefined4 *)(lVar16 + uVar12 * 0x10);
        _memmove(lVar16 + uVar13 * 0x10,puVar7,lVar15 * 0x10);
        *puVar7 = uVar5;
        *(undefined8 *)(puVar7 + 2) = uVar22;
        _memmove(lVar16 + 0x1c8 + uVar12 * 8 + 0x10,lVar16 + 0x1c8 + uVar13 * 8,lVar15 * 8);
      }
      else {
        puVar18[1] = uVar21;
        *puVar18 = uVar8;
        *(char *)(puVar18 + 2) = cVar4;
        *(undefined4 *)((long)puVar18 + 0x11) = uVar1;
        *(uint *)((long)puVar18 + 0x14) = CONCAT31(uStack000000000000004c,uStack000000000000004b);
        puVar7 = (undefined4 *)(lVar16 + uVar12 * 0x10);
        *puVar7 = uVar5;
        *(undefined8 *)(puVar7 + 2) = uVar22;
      }
      *(long *)(lVar16 + uVar13 * 8 + 0x1c8) = lVar9;
      *(ushort *)(lVar16 + 0x1c2) = uVar3 + 1;
      if (uVar13 < uVar17 + 2) {
        lVar9 = uVar12 + 0x3a;
        do {
          lVar15 = *(long *)(lVar16 + lVar9 * 8);
          *(long *)(lVar15 + 0xb0) = lVar16;
          *(short *)(lVar15 + 0x1c0) = (short)lVar9 + -0x39;
          lVar9 = lVar9 + 1;
        } while (lVar9 - uVar17 != 0x3b);
      }
      goto LAB_0055ddfc;
    }
    uStack0000000000000088 = lVar16;
    in_stack_00000090 = in_stack_000000d0 + 1;
    if (uVar2 < 5) {
      in_stack_00000098 = 4;
      auVar23._8_8_ = &uStack0000000000000088;
      auVar23._0_8_ = &uStack00000000000000a0;
      goto code_r0x0055de90;
    }
    if (uVar2 == 5) {
      in_stack_00000098 = 5;
      auVar23._8_8_ = &uStack0000000000000088;
      auVar23._0_8_ = &uStack00000000000000a0;
      goto code_r0x0055de90;
    }
    if (uVar2 == 6) {
      in_stack_00000098 = 5;
      auVar23._8_8_ = &uStack0000000000000088;
      auVar23._0_8_ = &uStack00000000000000a0;
      goto code_r0x0055de90;
    }
    in_stack_00000098 = 6;
    uStack00000000000000b1 = uVar1;
    uStack00000000000000b5 = uStack000000000000004c;
    func_0x0055de90(&uStack00000000000000a0,&uStack0000000000000088);
    uVar13 = uVar12 - 7;
    lVar15 = *in_stack_00000018;
    uVar2 = *(ushort *)(lVar15 + 0x1c2);
    uVar20 = (ulong)uVar2;
    uVar17 = uVar12 - 6;
    puVar18 = (undefined8 *)(lVar15 + 0xb8 + (long)(int)uVar13 * 0x18);
    puVar7 = (undefined4 *)(lVar15 + uVar13 * 0x10);
    lVar16 = uVar20 - uVar13;
    if (uVar20 < uVar13 || lVar16 == 0) {
      puVar18[1] = uVar21;
      *puVar18 = uVar8;
      *(char *)(puVar18 + 2) = cVar4;
      *(undefined4 *)((long)puVar18 + 0x11) = uVar1;
      *(uint *)((long)puVar18 + 0x14) = CONCAT31(uStack000000000000004c,uStack000000000000004b);
      *puVar7 = uVar5;
      *(undefined8 *)(puVar7 + 2) = uVar22;
    }
    else {
      _memmove(lVar15 + 0xb8 + (long)(int)uVar17 * 0x18,puVar18,lVar16 * 0x18);
      puVar18[1] = uVar21;
      *puVar18 = uVar8;
      *(char *)(puVar18 + 2) = cVar4;
      *(undefined4 *)((long)puVar18 + 0x11) = uVar1;
      *(uint *)((long)puVar18 + 0x14) = CONCAT31(uStack000000000000004c,uStack000000000000004b);
      _memmove(lVar15 + uVar17 * 0x10,puVar7,lVar16 * 0x10);
      *puVar7 = uVar5;
      *(undefined8 *)(puVar7 + 2) = uVar22;
      _memmove(lVar15 + 0x1c8 + uVar13 * 8 + 0x10,lVar15 + 0x1c8 + uVar17 * 8,lVar16 * 8);
    }
    *(long *)(lVar15 + uVar17 * 8 + 0x1c8) = lVar9;
    *(ushort *)(lVar15 + 0x1c2) = uVar2 + 1;
    if (uVar17 < uVar20 + 2) {
      lVar16 = uVar12 + 0x33;
      do {
        lVar9 = *(long *)(lVar15 + lVar16 * 8);
        *(long *)(lVar9 + 0xb0) = lVar15;
        *(short *)(lVar9 + 0x1c0) = (short)lVar16 + -0x39;
        lVar16 = lVar16 + 1;
      } while (lVar16 - uVar20 != 0x3b);
    }
    if (cStack00000000000000b0 == '\x02') goto LAB_0055ddfc;
    uVar1 = uStack00000000000000b1;
    uStack000000000000004c = uStack00000000000000b5;
    uVar8 = uStack00000000000000a0;
    uVar21 = in_stack_000000a8;
    cVar4 = cStack00000000000000b0;
    uVar5 = in_stack_000000b8;
    uVar22 = in_stack_000000c0;
    lVar9 = in_stack_000000d8;
    uVar17 = in_stack_000000e0;
    lVar16 = *(long *)(in_stack_000000c8 + 0xb0);
  }
  plVar14 = (long *)*in_stack_00000008;
  lVar16 = *plVar14;
  if (lVar16 == 0) {
LAB_0055de44:
    func_0x007a23bc(&UNK_009ee038);
LAB_0055de50:
    func_0x007a1f18(8,0x228);
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x55de60);
    (*pcVar6)();
  }
  uVar12 = plVar14[1];
  puVar7 = (undefined4 *)func_0x00187bd0(0x228,8);
  if (puVar7 == (undefined4 *)0x0) goto LAB_0055de50;
  *(undefined8 *)(puVar7 + 0x2c) = 0;
  *(undefined2 *)((long)puVar7 + 0x1c2) = 0;
  *(long *)(puVar7 + 0x72) = lVar16;
  *(undefined4 **)(lVar16 + 0xb0) = puVar7;
  *(undefined2 *)(lVar16 + 0x1c0) = 0;
  *plVar14 = (long)puVar7;
  plVar14[1] = uVar12 + 1;
  if (uVar17 == uVar12) {
    *(undefined2 *)((long)puVar7 + 0x1c2) = 1;
    *(undefined8 *)(puVar7 + 0x30) = uVar21;
    *(undefined8 *)(puVar7 + 0x2e) = uVar8;
    *(char *)(puVar7 + 0x32) = cVar4;
    *(undefined4 *)((long)puVar7 + 0xc9) = uVar1;
    puVar7[0x33] = CONCAT31(uStack000000000000004c,uStack000000000000004b);
    *puVar7 = uVar5;
    *(undefined8 *)(puVar7 + 2) = uVar22;
    *(long *)(puVar7 + 0x74) = lVar9;
    *(undefined4 **)(lVar9 + 0xb0) = puVar7;
    *(undefined2 *)(lVar9 + 0x1c0) = 1;
LAB_0055ddfc:
    *in_stack_00000010 = unaff_x27;
    in_stack_00000010[1] = in_stack_00000030;
    in_stack_00000010[2] = in_stack_00000038;
    return;
  }
  uVar8 = func_0x007a247c(&UNK_008ab894,0x30,&UNK_009ee068);
  func_0x007a200c(&uStack00000000000000a0);
  __Unwind_Resume(uVar8);
  auVar23 = func_0x007a2668();
code_r0x0055de90:
  plVar14 = auVar23._8_8_;
  puVar18 = auVar23._0_8_;
  lVar9 = *plVar14;
  uVar2 = *(ushort *)(lVar9 + 0x1c2);
  lVar16 = func_0x00187bd0(0x228,8);
  if (lVar16 == 0) {
    func_0x007a1f18(8,0x228);
  }
  else {
    *(undefined8 *)(lVar16 + 0xb0) = 0;
    uVar12 = plVar14[2];
    uVar3 = *(ushort *)(lVar9 + 0x1c2);
    uVar17 = (ulong)uVar3 + ~uVar12;
    *(short *)(lVar16 + 0x1c2) = (short)uVar17;
    puVar10 = (undefined8 *)(lVar9 + 0xb8 + uVar12 * 0x18);
    uVar22 = puVar10[1];
    uVar21 = *puVar10;
    uVar8 = puVar10[2];
    if (uVar17 < 0xc) {
      lVar15 = uVar12 + 1;
      if ((ulong)uVar3 - lVar15 == uVar17) {
        puVar7 = (undefined4 *)(lVar9 + uVar12 * 0x10);
        uVar1 = *puVar7;
        uVar19 = *(undefined8 *)(puVar7 + 2);
        _memcpy(lVar16 + 0xb8,lVar9 + 0xb8 + lVar15 * 0x18,uVar17 * 0x18);
        _memcpy(lVar16,lVar9 + lVar15 * 0x10,uVar17 * 0x10);
        *(short *)(lVar9 + 0x1c2) = (short)uVar12;
        uVar17 = (ulong)*(ushort *)(lVar16 + 0x1c2);
        lVar15 = uVar17 + 1;
        if (uVar17 < 0xc) {
          if (uVar2 - uVar12 == lVar15) {
            _memcpy(lVar16 + 0x1c8,lVar9 + uVar12 * 8 + 0x1d0,lVar15 * 8);
            uVar12 = 0;
            lVar15 = plVar14[1];
            do {
              lVar11 = *(long *)(lVar16 + 0x1c8 + uVar12 * 8);
              *(long *)(lVar11 + 0xb0) = lVar16;
              *(short *)(lVar11 + 0x1c0) = (short)uVar12;
              if (uVar17 <= uVar12) break;
              uVar12 = uVar12 + 1;
            } while (uVar12 <= uVar17);
            puVar18[1] = uVar22;
            *puVar18 = uVar21;
            puVar18[2] = uVar8;
            *(undefined4 *)(puVar18 + 3) = uVar1;
            puVar18[4] = uVar19;
            puVar18[5] = lVar9;
            puVar18[6] = lVar15;
            puVar18[7] = lVar16;
            puVar18[8] = lVar15;
            return;
          }
          func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
        }
        else {
          func_0x007a28b0(lVar15,0xc,&UNK_009ee0f0);
        }
      }
      else {
        func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
      }
      goto code_r0x0055e080;
    }
  }
  func_0x007a28b0(uVar17,0xb,&UNK_009ee0d8);
code_r0x0055e080:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x55e084);
  (*pcVar6)();
}

