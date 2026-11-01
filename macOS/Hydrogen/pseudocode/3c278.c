
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0003c278(ulong param_1)

{
  int *piVar1;
  ulong uVar2;
  char cVar3;
  bool bVar4;
  bool bVar5;
  code *pcVar6;
  undefined1 uVar7;
  int iVar8;
  long *plVar9;
  long *plVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong in_x9;
  ulong in_x10;
  undefined1 *in_x11;
  undefined1 *in_x12;
  undefined1 *in_x13;
  undefined1 *in_x14;
  undefined1 *puVar14;
  long unaff_x21;
  undefined8 uVar15;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined8 unaff_x28;
  ulong uVar16;
  long unaff_x29;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 *in_stack_00000058;
  int iStack0000000000000060;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 uStack0000000000000098;
  ulong in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 in_stack_000000d8;
  
  if (-1 < (int)in_x10) {
    in_x11 = in_x13;
    in_x12 = in_x14;
  }
  if (in_x11 != in_x12) {
    do {
      uVar7 = ___tolower(*in_x11);
      puVar14 = in_x11 + 1;
      *in_x11 = uVar7;
      in_x11 = puVar14;
    } while (puVar14 != in_x12);
    param_1 = (ulong)in_stack_00000070._7_1_;
    in_x9 = in_stack_00000068;
    in_x10 = param_1;
  }
  cVar3 = (char)in_x10;
  if (-1 < cVar3) {
    in_x9 = param_1;
  }
  if (in_x9 == 7) {
    piVar1 = _iStack0000000000000060;
    if (-1 < cVar3) {
      piVar1 = &iStack0000000000000060;
    }
    iVar8 = _memcmp(piVar1,"aes-ecb");
    if ((iVar8 != 0) && (*piVar1 != 0x5f736561 || *(int *)((long)piVar1 + 3) != 0x6263655f))
    goto LAB_0003c340;
LAB_0003c358:
    if (unaff_x21 != 0) {
      uVar16 = 0;
      bVar4 = false;
      bVar5 = true;
      goto LAB_0003c36c;
    }
    if ((char)in_stack_000000a8._7_1_ < '\0') {
      *(undefined1 *)CONCAT71(uStack0000000000000098._1_7_,(undefined1)uStack0000000000000098) = 0;
      in_stack_000000a0 = 0;
      if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003c600;
code_r0x0003c478:
      in_stack_00000090._7_1_ = 0;
      puVar12 = &uStack0000000000000080;
    }
    else {
      uStack0000000000000098._0_1_ = 0;
      in_stack_000000a8._7_1_ = 0;
      if (-1 < (char)in_stack_00000090._7_1_) goto code_r0x0003c478;
code_r0x0003c600:
      in_stack_00000088 = 0;
      puVar12 = uStack0000000000000080;
    }
    *(undefined1 *)puVar12 = 0;
  }
  else {
    if (in_x9 == 3) {
      piVar1 = _iStack0000000000000060;
      if (-1 < cVar3) {
        piVar1 = &iStack0000000000000060;
      }
      if ((short)*piVar1 == 0x6365 && *(char *)((long)piVar1 + 2) == 'b') goto LAB_0003c358;
    }
LAB_0003c340:
    if (unaff_x21 == 0) {
      in_stack_00000050 = _UNK_007fc188;
      in_stack_00000048 = _UNK_007fc180;
      puVar12 = (undefined8 *)func_0x006115d0(0x10);
      in_stack_00000058 = puVar12;
      func_0x006954a8(1,puVar12,0x10);
      if ((char)in_stack_000000a8._7_1_ < '\0') {
        in_stack_000000a0 = 0x10;
        puVar13 = (undefined8 *)
                  CONCAT71(uStack0000000000000098._1_7_,(undefined1)uStack0000000000000098);
      }
      else {
        in_stack_000000a8._7_1_ = 0x10;
        puVar13 = &uStack0000000000000098;
      }
      uVar11 = *puVar12;
      puVar13[1] = puVar12[1];
      *puVar13 = uVar11;
      *(undefined1 *)(puVar13 + 2) = 0;
      uVar11 = __Znwm(0x98);
      plVar9 = (long *)__Znwm(0x20);
      func_0x005edf2c(plVar9,0);
      *plVar9 = unaff_x26 + 0x10;
      plVar9[1] = unaff_x26 + 0x1a0;
      plVar9[3] = (long)&uStack0000000000000080;
      func_0x0004004c(uVar11,plVar9,0,0x48);
      func_0x00040ad8(unaff_x29 + -200,&uStack0000000000000098,1,uVar11);
      *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
      *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
      if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
        (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
      }
      *(undefined1 *)((long)puVar12 + 0xf) = 0;
      *(undefined1 *)((long)puVar12 + 0xe) = 0;
      *(undefined1 *)((long)puVar12 + 0xd) = 0;
      *(undefined1 *)((long)puVar12 + 0xc) = 0;
      *(undefined1 *)((long)puVar12 + 0xb) = 0;
      *(undefined1 *)((long)puVar12 + 10) = 0;
      *(undefined1 *)((long)puVar12 + 9) = 0;
      *(undefined1 *)(puVar12 + 1) = 0;
      *(undefined1 *)((long)puVar12 + 7) = 0;
      *(undefined1 *)((long)puVar12 + 6) = 0;
      *(undefined1 *)((long)puVar12 + 5) = 0;
      *(undefined1 *)((long)puVar12 + 4) = 0;
      *(undefined1 *)((long)puVar12 + 3) = 0;
      *(undefined1 *)((long)puVar12 + 2) = 0;
      *(undefined1 *)((long)puVar12 + 1) = 0;
      *(undefined1 *)puVar12 = 0;
      func_0x00611644(puVar12);
    }
    else {
      bVar5 = false;
      bVar4 = true;
      uVar16 = 0x10;
LAB_0003c36c:
      func_0x0002a730(&uStack0000000000000080);
      _strlen();
      plVar9 = (long *)__Znwm(0x68);
      plVar10 = (long *)__Znwm(0x20);
      func_0x005edf2c(plVar10,0);
      *plVar10 = unaff_x26 + 0x10;
      plVar10[1] = unaff_x26 + 0x1a0;
      plVar10[3] = (long)&uStack0000000000000098;
      uVar11 = func_0x006169b8();
      func_0x0003e7a4(plVar9,uVar11,6,plVar10);
      *plVar9 = unaff_x27 + 0x10;
      plVar9[1] = unaff_x27 + 0x1c0;
      func_0x0003f450(unaff_x29 + -200);
      if (bVar4) {
        if ((char)in_stack_000000a8._7_1_ < '\0') {
          if (in_stack_000000a0 < uVar16) goto LAB_0003c8d0;
          if (uVar16 < in_stack_000000a0) {
            puVar12 = (undefined8 *)
                      CONCAT71(uStack0000000000000098._1_7_,(undefined1)uStack0000000000000098);
            in_stack_000000a0 = uVar16;
            goto LAB_0003c49c;
          }
        }
        else {
          if (in_stack_000000a8._7_1_ < uVar16) {
LAB_0003c8d0:
            func_0x006e644c(unaff_x28,
                            "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                           );
            goto code_r0x0003cd88;
          }
          if (uVar16 < in_stack_000000a8._7_1_) {
            in_stack_000000a8._7_1_ = (byte)uVar16;
            puVar12 = &uStack0000000000000098;
LAB_0003c49c:
            *(undefined1 *)((long)puVar12 + uVar16) = 0;
          }
        }
      }
      if (bVar5) {
        if (-1 < (char)in_stack_000000a8._7_1_) {
          if (in_stack_000000a8._7_1_ != 0) goto code_r0x0003c900;
          uStack0000000000000098._0_1_ = 0;
          in_stack_000000a8._7_1_ = 0;
          goto code_r0x0003c4bc;
        }
        if (in_stack_000000a0 != 0) {
code_r0x0003c900:
          func_0x006e644c(unaff_x28,
                          "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value."
                         );
          goto code_r0x0003cd88;
        }
        *(undefined1 *)CONCAT71(uStack0000000000000098._1_7_,(undefined1)uStack0000000000000098) = 0
        ;
        in_stack_000000a0 = 0;
        *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
        *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
        plVar9 = *(long **)(unaff_x29 + -0xb0);
      }
      else {
code_r0x0003c4bc:
        *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
        *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
        plVar9 = *(long **)(unaff_x29 + -0xb0);
      }
      if (plVar9 != (long *)0x0) {
        (**(code **)(*plVar9 + 8))();
      }
    }
  }
  func_0x0004052c(unaff_x29 + -200,&uStack00000000000000c8,1);
  plVar9 = *(long **)(unaff_x29 + -200);
  uStack0000000000000040 = 0;
  in_stack_00000048 = 0;
  in_stack_00000050 = 0;
  uVar16 = in_stack_000000b8;
  puVar12 = uStack00000000000000b0;
  if (-1 < (char)in_stack_000000c0._7_1_) {
    uVar16 = (ulong)in_stack_000000c0._7_1_;
    puVar12 = &uStack00000000000000b0;
  }
  uVar2 = in_stack_000000a0;
  puVar13 = (undefined8 *)CONCAT71(uStack0000000000000098._1_7_,(undefined1)uStack0000000000000098);
  if (-1 < (char)in_stack_000000a8._7_1_) {
    uVar2 = (ulong)in_stack_000000a8._7_1_;
    puVar13 = &uStack0000000000000098;
  }
  func_0x005ee410(plVar9,puVar12,uVar16,puVar13,uVar2);
  uVar15 = *(undefined8 *)(unaff_x29 + -0xd0);
  uVar11 = __Znwm(0xd8);
  plVar10 = (long *)__Znwm(0x20);
  func_0x005edf2c(plVar10,0);
  *plVar10 = unaff_x26 + 0x10;
  plVar10[1] = unaff_x26 + 0x1a0;
  plVar10[3] = (long)&uStack0000000000000040;
  func_0x0066cd14(uVar11,plVar9 + 1,plVar10,2);
  func_0x0003f450(unaff_x29 + -200,in_stack_00000020,uVar15,1,uVar11);
  *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
  *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
  if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
  }
  uStack0000000000000028 = (undefined8 *)0x0;
  in_stack_00000030 = 0;
  in_stack_00000038 = 0;
  uVar11 = __Znwm(0x98);
  plVar10 = (long *)__Znwm(0x20);
  func_0x005edf2c(plVar10,0);
  *plVar10 = unaff_x26 + 0x10;
  plVar10[1] = unaff_x26 + 0x1a0;
  plVar10[3] = (long)&uStack0000000000000028;
  func_0x0004004c(uVar11,plVar10,0,0x48);
  func_0x00040ad8(unaff_x29 + -200,&uStack0000000000000040,1,uVar11);
  *(long *)(unaff_x29 + -200) = unaff_x25 + 0x10;
  *(long *)(unaff_x29 + -0xc0) = unaff_x25 + 0x1b8;
  if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
  }
  uVar16 = in_stack_00000030;
  puVar12 = uStack0000000000000028;
  if (-1 < (long)in_stack_00000038) {
    uVar16 = in_stack_00000038 >> 0x38;
    puVar12 = &uStack0000000000000028;
  }
  func_0x006e38d8(unaff_x28,puVar12,uVar16);
  uVar16 = in_stack_00000088;
  puVar12 = uStack0000000000000080;
  if (-1 < (char)in_stack_00000090._7_1_) {
    uVar16 = (ulong)in_stack_00000090._7_1_;
    puVar12 = &uStack0000000000000080;
  }
  func_0x006e38d8(unaff_x28,puVar12,uVar16);
  if ((long)in_stack_00000038 < 0) {
    __ZdlPv(uStack0000000000000028);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  if (plVar9 != (long *)0x0) {
    (**(code **)(*plVar9 + 8))(plVar9);
  }
  if ((char)in_stack_00000070._7_1_ < '\0') {
    __ZdlPv(_iStack0000000000000060);
    if ((char)in_stack_00000090._7_1_ < '\0') goto code_r0x0003c870;
code_r0x0003c7ec:
    if (-1 < (char)in_stack_000000a8._7_1_) goto code_r0x0003c7f4;
code_r0x0003c880:
    __ZdlPv(CONCAT71(uStack0000000000000098._1_7_,(undefined1)uStack0000000000000098));
    if ((char)in_stack_000000c0._7_1_ < '\0') goto code_r0x0003c890;
code_r0x0003c7fc:
    if (-1 < in_stack_000000d8._7_1_) goto code_r0x0003c804;
code_r0x0003c8a0:
    __ZdlPv(uStack00000000000000c8);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return 2;
    }
  }
  else {
    if (-1 < (char)in_stack_00000090._7_1_) goto code_r0x0003c7ec;
code_r0x0003c870:
    __ZdlPv(uStack0000000000000080);
    if ((char)in_stack_000000a8._7_1_ < '\0') goto code_r0x0003c880;
code_r0x0003c7f4:
    if (-1 < (char)in_stack_000000c0._7_1_) goto code_r0x0003c7fc;
code_r0x0003c890:
    __ZdlPv(uStack00000000000000b0);
    if (in_stack_000000d8._7_1_ < '\0') goto code_r0x0003c8a0;
code_r0x0003c804:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return 2;
    }
  }
  ___stack_chk_fail();
  func_0x0001748c(&uStack00000000000000c8);
code_r0x0003cd88:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x3cd8c);
  (*pcVar6)();
}

