
undefined1 * FUN_00757d1c(void)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined1 *puVar6;
  ulong in_x3;
  ulong uVar7;
  ulong uVar8;
  int *piVar9;
  int iVar10;
  undefined1 *puVar11;
  undefined1 *puVar12;
  ulong uVar13;
  ulong uVar14;
  undefined1 *puVar15;
  undefined1 *unaff_x23;
  undefined8 unaff_x24;
  long *plVar16;
  undefined8 unaff_x25;
  undefined1 *unaff_x26;
  undefined1 *unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar17 [16];
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined1 *in_stack_00000028;
  undefined8 in_stack_00000030;
  ulong in_stack_00000038;
  int *in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000050;
  
  auVar17._8_8_ = unaff_x24;
  auVar17._0_8_ = unaff_x25;
code_r0x00757d1c:
  piVar1 = (int *)0x0;
  uVar7 = in_x3;
  lVar5 = uStack0000000000000048;
joined_r0x00757d28:
  piVar9 = piVar1;
  uStack0000000000000048 = lVar5;
  if (uVar7 == 0) {
    uVar8 = 0;
  }
  else {
    uVar8 = _strlen(uVar7);
    uVar7 = in_stack_00000038;
  }
  iVar2 = func_0x00756954(auVar17._0_8_,unaff_x28);
  uVar13 = 0;
code_r0x00757d90:
  func_0x00789278(uVar13);
  *in_stack_00000040 = iVar2;
  uVar14 = (ulong)in_stack_00000030._4_4_;
  puVar6 = unaff_x27;
  puVar15 = unaff_x27;
  if (iVar2 == 0) goto LAB_00757a90;
LAB_00757ef8:
  puVar6 = puVar15;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return (undefined1 *)0xffffffffffffffff;
  }
code_r0x00757a40:
  do {
    auVar17 = ___stack_chk_fail();
    in_stack_00000028 = (undefined1 *)0x0;
    lVar5 = auVar17._0_8_ + 8;
    in_stack_00000018._4_4_ = 0x81a;
    if ((uVar8 & 1) != 0) {
      in_stack_00000018._4_4_ = 0x1a;
    }
    in_stack_00000020 = (long)&uStack0000000000000048 + 7;
    in_stack_00000040 = piVar9;
    uVar14 = uVar8;
    unaff_x23 = puVar6;
    in_stack_00000038 = uVar7;
    uStack0000000000000048 = lVar5;
    do {
      lVar4 = auVar17._8_8_;
      plVar16 = auVar17._0_8_;
      if (plVar16[6] != 0) {
        plVar16[6] = 0;
        plVar16[8] = 0;
        func_0x007406b0(lVar5);
      }
      puVar6 = unaff_x23;
      lVar3 = _memchr(lVar4,10);
      in_stack_00000030._4_4_ = (uint)uVar14;
      if (lVar3 == 0) {
        *in_stack_00000040 = 0x51;
        puVar6 = unaff_x23;
        iVar2 = func_0x0074075c(lVar5,lVar4);
        *in_stack_00000040 = iVar2;
        if ((iVar2 != 0) || ((long)unaff_x23 < 0)) {
code_r0x00757ee8:
          iVar10 = 0;
          if (iVar2 != 0x51) {
            in_stack_00000028 = (undefined1 *)0xffffffffffffffff;
          }
          goto code_r0x00757e7c;
        }
        in_stack_00000028 = unaff_x23 + (long)in_stack_00000028;
        unaff_x26 = (undefined1 *)0x0;
        unaff_x28 = plVar16[6];
        if (unaff_x28 != 0) goto code_r0x00757bd8;
code_r0x00757a8c:
        if (unaff_x26 == (undefined1 *)0x0) break;
      }
      else {
        plVar16[6] = lVar4;
        plVar16[8] = (lVar3 - lVar4) + 1;
        *in_stack_00000040 = 0;
        puVar15 = (undefined1 *)plVar16[8];
        if ((long)puVar15 < 0) {
code_r0x00757e9c:
          in_stack_00000028 = (undefined1 *)0xffffffffffffffff;
          *in_stack_00000040 = 0;
          break;
        }
        lVar4 = func_0x00156654(lVar5);
        puVar6 = (undefined1 *)plVar16[8];
        if (lVar4 != 0) {
          iVar2 = func_0x0074075c(lVar5,plVar16[6]);
          *in_stack_00000040 = iVar2;
          if (iVar2 != 0) goto code_r0x00757ee8;
          lVar4 = func_0x00740a58(lVar5);
          plVar16[6] = lVar4;
          puVar6 = (undefined1 *)func_0x00156654(lVar5);
          plVar16[8] = (long)puVar6;
        }
        if (puVar6 == (undefined1 *)0x0) {
code_r0x00757b98:
          if ((uVar14 & 1) != 0) goto code_r0x00757e9c;
        }
        else {
          puVar11 = puVar6 + -1;
          if (puVar11[plVar16[6]] == '\n') {
            plVar16[8] = (long)puVar11;
            if (puVar11 == (undefined1 *)0x0) goto code_r0x00757b98;
            puVar12 = puVar11;
            puVar11 = puVar6 + -2;
            if ((puVar6 + -2)[plVar16[6]] != '\r') goto code_r0x00757b54;
code_r0x00757bb0:
            puVar12 = puVar11;
            plVar16[8] = (long)puVar12;
          }
          else {
            puVar12 = puVar6;
            if (puVar11[plVar16[6]] == '\r') goto code_r0x00757bb0;
code_r0x00757b54:
            if ((uVar14 & 1) != 0) goto code_r0x00757e9c;
          }
          if ((undefined1 *)plVar16[7] < puVar12) goto code_r0x00757e9c;
        }
        *in_stack_00000040 = 0;
        in_stack_00000028 = puVar15 + (long)in_stack_00000028;
        unaff_x26 = unaff_x23 + -(long)puVar15;
        unaff_x28 = plVar16[6];
        unaff_x23 = puVar15;
        if (unaff_x28 == 0) goto code_r0x00757a8c;
code_r0x00757bd8:
        lVar5 = uStack0000000000000048;
        puVar15 = (undefined1 *)plVar16[8];
        if (*plVar16 == 0) {
          puVar6 = puVar15;
          lVar4 = _memchr(unaff_x28,0x20);
          uVar13 = 0;
          iVar10 = 3;
          if ((lVar4 == 0) ||
             (unaff_x27 = (undefined1 *)(lVar4 - unaff_x28), unaff_x27 == (undefined1 *)0x0))
          goto code_r0x00757e64;
          if (puVar15 <= unaff_x27) goto code_r0x00757f24;
          lVar3 = 0;
          piVar1 = (int *)(lVar4 + 1);
          goto code_r0x00757c50;
        }
        if (puVar15 == (undefined1 *)0x0) {
          *(undefined1 *)(plVar16 + 9) = 1;
          func_0x007406b0(uStack0000000000000048);
        }
        else {
          iVar2 = func_0x00740ed8(*plVar16 + 0x30,unaff_x28);
          *in_stack_00000040 = iVar2;
          puVar6 = puVar15;
          lVar5 = uStack0000000000000048;
          if (iVar2 != 0) goto LAB_00757ef8;
        }
      }
LAB_00757a90:
      lVar4 = auVar17._0_8_;
      auVar17._8_8_ = unaff_x23 + auVar17._8_8_;
      auVar17._0_8_ = lVar4;
      unaff_x23 = unaff_x26;
    } while (*(char *)(lVar4 + 0x48) == '\0');
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return in_stack_00000028;
    }
  } while( true );
code_r0x00757c50:
  if (puVar15[lVar3 + unaff_x28] != ' ') {
    lVar3 = lVar3 + -1;
    if (puVar15 + lVar3 <= unaff_x27) goto code_r0x00757e5c;
    goto code_r0x00757c50;
  }
  uVar13 = 0;
  iVar10 = 3;
  if (lVar3 == 0) goto code_r0x00757e64;
  puVar11 = puVar15 + lVar3 + (unaff_x28 - lVar4) + -1;
  if (puVar11 == (undefined1 *)0x0) goto code_r0x00757e64;
  uVar7 = in_stack_00000038;
  if ((puVar15 + lVar3 + (unaff_x28 - lVar4) == (undefined1 *)0x2) && (*(char *)piVar1 == '*')) {
joined_r0x00757cd4:
    piVar1 = (int *)0x0;
    uVar7 = in_stack_00000038;
    lVar5 = uStack0000000000000048;
    goto joined_r0x00757d28;
  }
  iVar2 = _strncmp("CONNECT",unaff_x28,unaff_x27);
  lVar5 = uStack0000000000000048;
  if (iVar2 == 0) goto joined_r0x00757d28;
  in_x3 = in_stack_00000038;
  if (*(char *)piVar1 == '/') goto code_r0x00757d1c;
  puVar6 = puVar11;
  if ((ulong)puVar11 >> 0xd == 0) {
    ___memcpy_chk(&uStack0000000000000050,piVar1,puVar11,0x2000);
    puVar15[lVar3 + in_stack_00000020 + (unaff_x28 - lVar4)] = 0;
    puVar6 = (undefined1 *)0x0;
    uVar7 = 0;
    lVar5 = func_0x00788b7c(&uStack0000000000000050,0);
    if (lVar5 != 0) {
      uVar13 = func_0x00789260();
      lVar5 = uStack0000000000000048;
      if (uVar13 != 0) {
        puVar6 = &uStack0000000000000050;
        uVar7 = (ulong)in_stack_00000018._4_4_;
        iVar2 = func_0x0078a0e4(uVar13,0);
        if (iVar2 != 0) goto code_r0x00757e60;
        uVar7 = uVar13;
        uVar8 = in_stack_00000038;
        iVar2 = func_0x00756b1c(plVar16,unaff_x28);
        goto code_r0x00757d90;
      }
      iVar10 = 0x1b;
code_r0x00757f24:
      uVar13 = 0;
      goto code_r0x00757e64;
    }
    if ((uVar14 & 1) == 0) goto joined_r0x00757cd4;
  }
  iVar10 = 3;
  goto code_r0x00757f24;
code_r0x00757e5c:
  uVar13 = 0;
code_r0x00757e60:
  iVar10 = 3;
code_r0x00757e64:
  func_0x00789278(uVar13);
  in_stack_00000028 = (undefined1 *)0xffffffffffffffff;
code_r0x00757e7c:
  *in_stack_00000040 = iVar10;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return in_stack_00000028;
  }
  goto code_r0x00757a40;
}

