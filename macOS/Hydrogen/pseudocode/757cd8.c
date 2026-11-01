
undefined1 * FUN_00757cd8(void)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined1 *puVar5;
  ulong in_x3;
  ulong uVar6;
  int *in_x5;
  int iVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined1 *unaff_x20;
  ulong uVar10;
  ulong uVar11;
  long unaff_x22;
  undefined1 *puVar12;
  undefined1 *unaff_x23;
  undefined8 unaff_x24;
  long *plVar13;
  undefined8 unaff_x25;
  undefined1 *unaff_x26;
  undefined1 *unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar14 [16];
  undefined1 *puStack0000000000000000;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined1 *in_stack_00000028;
  undefined8 in_stack_00000030;
  ulong in_stack_00000038;
  int *in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined1 uStack0000000000000050;
  
  auVar14._8_8_ = unaff_x24;
  auVar14._0_8_ = unaff_x25;
LAB_00757d2c:
  uVar6 = 0;
LAB_00757d70:
  puStack0000000000000000 = unaff_x20;
  iVar2 = func_0x00756954(auVar14._0_8_,unaff_x28);
  uVar10 = 0;
code_r0x00757d90:
  func_0x00789278(uVar10);
  *in_stack_00000040 = iVar2;
  uVar11 = (ulong)in_stack_00000030._4_4_;
  puVar5 = unaff_x27;
  puVar12 = unaff_x27;
  if (iVar2 == 0) goto LAB_00757a90;
LAB_00757ef8:
  puVar5 = puVar12;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return (undefined1 *)0xffffffffffffffff;
  }
code_r0x00757a40:
  do {
    auVar14 = ___stack_chk_fail();
    in_stack_00000028 = (undefined1 *)0x0;
    unaff_x22 = auVar14._0_8_ + 8;
    in_stack_00000018._4_4_ = 0x81a;
    if ((uVar6 & 1) != 0) {
      in_stack_00000018._4_4_ = 0x1a;
    }
    in_stack_00000020 = (long)&uStack0000000000000048 + 7;
    in_stack_00000040 = in_x5;
    uVar11 = uVar6;
    unaff_x23 = puVar5;
    in_stack_00000038 = in_x3;
    uStack0000000000000048 = unaff_x22;
    do {
      lVar4 = auVar14._8_8_;
      plVar13 = auVar14._0_8_;
      if (plVar13[6] != 0) {
        plVar13[6] = 0;
        plVar13[8] = 0;
        func_0x007406b0(unaff_x22);
      }
      puVar5 = unaff_x23;
      lVar3 = _memchr(lVar4,10);
      in_stack_00000030._4_4_ = (uint)uVar11;
      if (lVar3 == 0) {
        *in_stack_00000040 = 0x51;
        puVar5 = unaff_x23;
        iVar2 = func_0x0074075c(unaff_x22,lVar4);
        *in_stack_00000040 = iVar2;
        if ((iVar2 != 0) || ((long)unaff_x23 < 0)) {
code_r0x00757ee8:
          iVar7 = 0;
          if (iVar2 != 0x51) {
            in_stack_00000028 = (undefined1 *)0xffffffffffffffff;
          }
          goto code_r0x00757e7c;
        }
        in_stack_00000028 = unaff_x23 + (long)in_stack_00000028;
        unaff_x26 = (undefined1 *)0x0;
        unaff_x28 = plVar13[6];
        if (unaff_x28 != 0) goto code_r0x00757bd8;
code_r0x00757a8c:
        if (unaff_x26 == (undefined1 *)0x0) break;
      }
      else {
        plVar13[6] = lVar4;
        plVar13[8] = (lVar3 - lVar4) + 1;
        *in_stack_00000040 = 0;
        puVar12 = (undefined1 *)plVar13[8];
        if ((long)puVar12 < 0) {
code_r0x00757e9c:
          in_stack_00000028 = (undefined1 *)0xffffffffffffffff;
          *in_stack_00000040 = 0;
          break;
        }
        lVar4 = func_0x00156654(unaff_x22);
        puVar5 = (undefined1 *)plVar13[8];
        if (lVar4 != 0) {
          iVar2 = func_0x0074075c(unaff_x22,plVar13[6]);
          *in_stack_00000040 = iVar2;
          if (iVar2 != 0) goto code_r0x00757ee8;
          lVar4 = func_0x00740a58(unaff_x22);
          plVar13[6] = lVar4;
          puVar5 = (undefined1 *)func_0x00156654(unaff_x22);
          plVar13[8] = (long)puVar5;
        }
        if (puVar5 == (undefined1 *)0x0) {
code_r0x00757b98:
          if ((uVar11 & 1) != 0) goto code_r0x00757e9c;
        }
        else {
          puVar8 = puVar5 + -1;
          if (puVar8[plVar13[6]] == '\n') {
            plVar13[8] = (long)puVar8;
            if (puVar8 == (undefined1 *)0x0) goto code_r0x00757b98;
            puVar9 = puVar8;
            puVar8 = puVar5 + -2;
            if ((puVar5 + -2)[plVar13[6]] != '\r') goto code_r0x00757b54;
code_r0x00757bb0:
            puVar9 = puVar8;
            plVar13[8] = (long)puVar9;
          }
          else {
            puVar9 = puVar5;
            if (puVar8[plVar13[6]] == '\r') goto code_r0x00757bb0;
code_r0x00757b54:
            if ((uVar11 & 1) != 0) goto code_r0x00757e9c;
          }
          if ((undefined1 *)plVar13[7] < puVar9) goto code_r0x00757e9c;
        }
        *in_stack_00000040 = 0;
        in_stack_00000028 = puVar12 + (long)in_stack_00000028;
        unaff_x26 = unaff_x23 + -(long)puVar12;
        unaff_x28 = plVar13[6];
        unaff_x23 = puVar12;
        if (unaff_x28 == 0) goto code_r0x00757a8c;
code_r0x00757bd8:
        unaff_x22 = uStack0000000000000048;
        puVar12 = (undefined1 *)plVar13[8];
        if (*plVar13 == 0) {
          puVar5 = puVar12;
          lVar4 = _memchr(unaff_x28,0x20);
          uVar10 = 0;
          iVar7 = 3;
          if ((lVar4 == 0) ||
             (unaff_x27 = (undefined1 *)(lVar4 - unaff_x28), unaff_x27 == (undefined1 *)0x0))
          goto code_r0x00757e64;
          if (puVar12 <= unaff_x27) goto code_r0x00757f24;
          lVar3 = 0;
          piVar1 = (int *)(lVar4 + 1);
          goto code_r0x00757c50;
        }
        if (puVar12 == (undefined1 *)0x0) {
          *(undefined1 *)(plVar13 + 9) = 1;
          func_0x007406b0(uStack0000000000000048);
        }
        else {
          iVar2 = func_0x00740ed8(*plVar13 + 0x30,unaff_x28);
          *in_stack_00000040 = iVar2;
          puVar5 = puVar12;
          unaff_x22 = uStack0000000000000048;
          if (iVar2 != 0) goto LAB_00757ef8;
        }
      }
LAB_00757a90:
      lVar4 = auVar14._0_8_;
      auVar14._8_8_ = unaff_x23 + auVar14._8_8_;
      auVar14._0_8_ = lVar4;
      unaff_x23 = unaff_x26;
    } while (*(char *)(lVar4 + 0x48) == '\0');
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return in_stack_00000028;
    }
  } while( true );
code_r0x00757c50:
  if (puVar12[lVar3 + unaff_x28] != ' ') {
    lVar3 = lVar3 + -1;
    if (puVar12 + lVar3 <= unaff_x27) goto code_r0x00757e5c;
    goto code_r0x00757c50;
  }
  uVar10 = 0;
  iVar7 = 3;
  if (lVar3 == 0) goto code_r0x00757e64;
  unaff_x20 = puVar12 + lVar3 + (unaff_x28 - lVar4) + -1;
  if (unaff_x20 == (undefined1 *)0x0) goto code_r0x00757e64;
  if ((puVar12 + lVar3 + (unaff_x28 - lVar4) == (undefined1 *)0x2) && (*(char *)piVar1 == '*')) {
    unaff_x20 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    in_x5 = (int *)0x0;
    unaff_x22 = uStack0000000000000048;
    goto joined_r0x00757cd4;
  }
  iVar2 = _strncmp("CONNECT",unaff_x28,unaff_x27);
  unaff_x22 = uStack0000000000000048;
  if (iVar2 == 0) {
    unaff_x20 = (undefined1 *)0x0;
    in_x5 = piVar1;
    goto joined_r0x00757cd4;
  }
  if (*(char *)piVar1 == '/') {
    in_x5 = (int *)0x0;
joined_r0x00757cd4:
    in_x3 = in_stack_00000038;
    uStack0000000000000048 = unaff_x22;
    if (in_stack_00000038 == 0) goto LAB_00757d2c;
    uVar6 = _strlen(in_stack_00000038);
    goto LAB_00757d70;
  }
  puVar5 = unaff_x20;
  in_x3 = in_stack_00000038;
  if ((ulong)unaff_x20 >> 0xd == 0) {
    ___memcpy_chk(&uStack0000000000000050,piVar1,unaff_x20,0x2000);
    puVar12[lVar3 + in_stack_00000020 + (unaff_x28 - lVar4)] = 0;
    puVar5 = (undefined1 *)0x0;
    in_x3 = 0;
    lVar4 = func_0x00788b7c(&uStack0000000000000050,0);
    if (lVar4 != 0) {
      uVar10 = func_0x00789260();
      unaff_x22 = uStack0000000000000048;
      if (uVar10 != 0) {
        puVar5 = &uStack0000000000000050;
        in_x3 = (ulong)in_stack_00000018._4_4_;
        iVar2 = func_0x0078a0e4(uVar10,0);
        if (iVar2 != 0) goto code_r0x00757e60;
        in_x3 = uVar10;
        uVar6 = in_stack_00000038;
        iVar2 = func_0x00756b1c(plVar13,unaff_x28);
        goto code_r0x00757d90;
      }
      iVar7 = 0x1b;
code_r0x00757f24:
      uVar10 = 0;
      goto code_r0x00757e64;
    }
    if ((uVar11 & 1) == 0) {
      in_x5 = (int *)0x0;
      unaff_x22 = uStack0000000000000048;
      goto joined_r0x00757cd4;
    }
  }
  iVar7 = 3;
  goto code_r0x00757f24;
code_r0x00757e5c:
  uVar10 = 0;
code_r0x00757e60:
  iVar7 = 3;
code_r0x00757e64:
  func_0x00789278(uVar10);
  in_stack_00000028 = (undefined1 *)0xffffffffffffffff;
code_r0x00757e7c:
  *in_stack_00000040 = iVar7;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return in_stack_00000028;
  }
  goto code_r0x00757a40;
}

