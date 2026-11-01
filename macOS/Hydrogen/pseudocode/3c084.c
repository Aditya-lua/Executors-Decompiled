
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0003c084(undefined8 param_1)

{
  char *pcVar1;
  ulong uVar2;
  bool bVar3;
  bool bVar4;
  int *piVar5;
  code *pcVar6;
  undefined1 uVar7;
  int iVar8;
  long lVar9;
  char *pcVar10;
  ulong uVar11;
  int *piVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  long *plVar17;
  byte bVar18;
  int *piVar19;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 *in_stack_00000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  undefined8 uStack0000000000000098;
  ulong in_stack_000000a0;
  undefined7 uStack00000000000000a8;
  char cStack00000000000000af;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000b8;
  ulong in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  ulong in_stack_000000d0;
  undefined7 uStack00000000000000d8;
  
  lVar9 = func_0x006e67c8(param_1,3,0);
  pcVar10 = (char *)func_0x006e671c();
  pcVar1 = "CBC";
  if (pcVar10 != (char *)0x0) {
    pcVar1 = pcVar10;
  }
  uVar11 = _strlen(pcVar1);
  if (uVar11 < 0x7ffffffffffffff8) {
    if (uVar11 < 0x17) {
      _uStack00000000000000d8 = CONCAT17((char)uVar11,uStack00000000000000d8);
      piVar12 = (int *)&uStack00000000000000c8;
      if (uVar11 != 0) goto LAB_0003c120;
    }
    else {
      uVar2 = (uVar11 & 0xfffffffffffffff8) + 8;
      if ((uVar11 | 7) != 0x17) {
        uVar2 = uVar11 | 7;
      }
      piVar12 = (int *)__Znwm(uVar2 + 1);
      _uStack00000000000000d8 = uVar2 + 1 | 0x8000000000000000;
      uStack00000000000000c8 = piVar12;
      in_stack_000000d0 = uVar11;
LAB_0003c120:
      _memmove(piVar12,pcVar1,uVar11);
    }
    *(undefined1 *)((long)piVar12 + uVar11) = 0;
    uStack00000000000000b0 = (undefined8 *)0x0;
    in_stack_000000b8 = 0;
    in_stack_000000c0 = 0;
    _strlen();
    puVar13 = (undefined8 *)__Znwm(0x68);
    puVar14 = (undefined8 *)__Znwm(0x20);
    func_0x005edf2c(puVar14,0);
    *puVar14 = &UNK_009f9e90;
    puVar14[1] = &UNK_009fa020;
    puVar14[3] = &uStack00000000000000b0;
    uVar15 = func_0x006169b8();
    func_0x0003e7a4(puVar13,uVar15,6,puVar14);
    *puVar13 = &UNK_009f7858;
    puVar13[1] = &UNK_009f7a08;
    func_0x0003f450(unaff_x29 + -200);
    if ((long)in_stack_000000c0 < 0) {
      if (in_stack_000000b8 != 0x20) goto LAB_0003c23c;
    }
    else if (in_stack_000000c0._7_1_ != ' ') {
LAB_0003c23c:
      func_0x006e644c();
      goto LAB_0003cd88;
    }
    *(undefined **)(unaff_x29 + -200) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0xc0) = &UNK_00a0c3e0;
    if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
    }
    uStack0000000000000098 = (undefined8 *)0x0;
    in_stack_000000a0 = 0;
    _uStack00000000000000a8 = 0;
    uStack0000000000000080 = (undefined8 *)0x0;
    in_stack_00000088 = 0;
    in_stack_00000090 = 0;
    if ((long)_uStack00000000000000d8 < 0) {
      func_0x00017634(&uStack0000000000000060,uStack00000000000000c8,in_stack_000000d0);
    }
    else {
      in_stack_00000068 = in_stack_000000d0;
      uStack0000000000000060 = uStack00000000000000c8;
      in_stack_00000070 = _uStack00000000000000d8;
    }
    uVar11 = (ulong)in_stack_00000070._7_1_;
    piVar12 = uStack0000000000000060;
    piVar5 = (int *)((long)uStack0000000000000060 + in_stack_00000068);
    if (-1 < (long)in_stack_00000070) {
      piVar12 = (int *)&uStack0000000000000060;
      piVar5 = (int *)((long)&uStack0000000000000060 + uVar11);
    }
    bVar18 = in_stack_00000070._7_1_;
    if (piVar12 != piVar5) {
      do {
        uVar7 = ___tolower((char)*piVar12);
        piVar19 = (int *)((long)piVar12 + 1);
        *(undefined1 *)piVar12 = uVar7;
        piVar12 = piVar19;
      } while (piVar19 != piVar5);
      uVar11 = in_stack_00000070 >> 0x38;
      bVar18 = (byte)(in_stack_00000070 >> 0x38);
    }
    uVar2 = in_stack_00000068;
    if (-1 < (char)bVar18) {
      uVar2 = uVar11;
    }
    if (uVar2 == 7) {
      piVar12 = uStack0000000000000060;
      if (-1 < (char)bVar18) {
        piVar12 = (int *)&uStack0000000000000060;
      }
      iVar8 = _memcmp(piVar12,"aes-ecb");
      if ((iVar8 != 0) && (*piVar12 != 0x5f736561 || *(int *)((long)piVar12 + 3) != 0x6263655f))
      goto LAB_0003c340;
LAB_0003c358:
      if (lVar9 != 0) {
        uVar11 = 0;
        bVar3 = false;
        bVar4 = true;
        goto LAB_0003c36c;
      }
      if ((long)_uStack00000000000000a8 < 0) {
        *(undefined1 *)uStack0000000000000098 = 0;
        in_stack_000000a0 = 0;
        if ((long)in_stack_00000090 < 0) goto code_r0x0003c600;
code_r0x0003c478:
        in_stack_00000090 = in_stack_00000090 & 0xffffffffffffff;
        puVar13 = &uStack0000000000000080;
      }
      else {
        uStack0000000000000098 = (undefined8 *)((ulong)uStack0000000000000098 & 0xffffffffffffff00);
        _uStack00000000000000a8 = _uStack00000000000000a8 & 0xffffffffffffff;
        if (-1 < (long)in_stack_00000090) goto code_r0x0003c478;
code_r0x0003c600:
        in_stack_00000088 = 0;
        puVar13 = uStack0000000000000080;
      }
      *(undefined1 *)puVar13 = 0;
    }
    else {
      if (uVar2 == 3) {
        piVar12 = uStack0000000000000060;
        if (-1 < (char)bVar18) {
          piVar12 = (int *)&uStack0000000000000060;
        }
        if ((short)*piVar12 == 0x6365 && *(char *)((long)piVar12 + 2) == 'b') goto LAB_0003c358;
      }
LAB_0003c340:
      if (lVar9 == 0) {
        in_stack_00000050 = _UNK_007fc188;
        in_stack_00000048 = _UNK_007fc180;
        puVar13 = (undefined8 *)func_0x006115d0(0x10);
        in_stack_00000058 = puVar13;
        func_0x006954a8(1,puVar13,0x10);
        if ((long)_uStack00000000000000a8 < 0) {
          in_stack_000000a0 = 0x10;
          puVar14 = uStack0000000000000098;
        }
        else {
          _uStack00000000000000a8 = CONCAT17(0x10,uStack00000000000000a8);
          puVar14 = &uStack0000000000000098;
        }
        uVar15 = *puVar13;
        puVar14[1] = puVar13[1];
        *puVar14 = uVar15;
        *(undefined1 *)(puVar14 + 2) = 0;
        uVar15 = __Znwm(0x98);
        puVar14 = (undefined8 *)__Znwm(0x20);
        func_0x005edf2c(puVar14,0);
        *puVar14 = &UNK_009f9e90;
        puVar14[1] = &UNK_009fa020;
        puVar14[3] = &uStack0000000000000080;
        func_0x0004004c(uVar15,puVar14,0,0x48);
        func_0x00040ad8(unaff_x29 + -200,&uStack0000000000000098,1,uVar15);
        *(undefined **)(unaff_x29 + -200) = &UNK_00a0c238;
        *(undefined **)(unaff_x29 + -0xc0) = &UNK_00a0c3e0;
        if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
          (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
        }
        *(undefined1 *)((long)puVar13 + 0xf) = 0;
        *(undefined1 *)((long)puVar13 + 0xe) = 0;
        *(undefined1 *)((long)puVar13 + 0xd) = 0;
        *(undefined1 *)((long)puVar13 + 0xc) = 0;
        *(undefined1 *)((long)puVar13 + 0xb) = 0;
        *(undefined1 *)((long)puVar13 + 10) = 0;
        *(undefined1 *)((long)puVar13 + 9) = 0;
        *(undefined1 *)(puVar13 + 1) = 0;
        *(undefined1 *)((long)puVar13 + 7) = 0;
        *(undefined1 *)((long)puVar13 + 6) = 0;
        *(undefined1 *)((long)puVar13 + 5) = 0;
        *(undefined1 *)((long)puVar13 + 4) = 0;
        *(undefined1 *)((long)puVar13 + 3) = 0;
        *(undefined1 *)((long)puVar13 + 2) = 0;
        *(undefined1 *)((long)puVar13 + 1) = 0;
        *(undefined1 *)puVar13 = 0;
        func_0x00611644(puVar13);
      }
      else {
        bVar4 = false;
        bVar3 = true;
        uVar11 = 0x10;
LAB_0003c36c:
        func_0x0002a730(&uStack0000000000000080,lVar9);
        uVar15 = _strlen(lVar9);
        puVar13 = (undefined8 *)__Znwm(0x68);
        puVar14 = (undefined8 *)__Znwm(0x20);
        func_0x005edf2c(puVar14,0);
        *puVar14 = &UNK_009f9e90;
        puVar14[1] = &UNK_009fa020;
        puVar14[3] = &uStack0000000000000098;
        uVar16 = func_0x006169b8();
        func_0x0003e7a4(puVar13,uVar16,6,puVar14);
        *puVar13 = &UNK_009f7858;
        puVar13[1] = &UNK_009f7a08;
        func_0x0003f450(unaff_x29 + -200,lVar9,uVar15,1,puVar13);
        if (bVar3) {
          if ((long)_uStack00000000000000a8 < 0) {
            if (in_stack_000000a0 < uVar11) goto LAB_0003c8d0;
            if (uVar11 < in_stack_000000a0) {
              puVar13 = uStack0000000000000098;
              in_stack_000000a0 = uVar11;
              goto LAB_0003c49c;
            }
          }
          else {
            if (_uStack00000000000000a8 >> 0x38 < uVar11) {
LAB_0003c8d0:
              func_0x006e644c(unaff_x28,
                              "Provided IV for mode \'%s\' must decode to at least %zu bytes, got %zu bytes"
                             );
              goto LAB_0003cd88;
            }
            if (uVar11 < _uStack00000000000000a8 >> 0x38) {
              _uStack00000000000000a8 = CONCAT17((char)uVar11,uStack00000000000000a8);
              puVar13 = &uStack0000000000000098;
LAB_0003c49c:
              *(undefined1 *)((long)puVar13 + uVar11) = 0;
            }
          }
        }
        if (bVar4) {
          if (-1 < (long)_uStack00000000000000a8) {
            if (cStack00000000000000af != '\0') goto code_r0x0003c900;
            uStack0000000000000098 =
                 (undefined8 *)((ulong)uStack0000000000000098 & 0xffffffffffffff00);
            _uStack00000000000000a8 = _uStack00000000000000a8 & 0xffffffffffffff;
            goto code_r0x0003c4bc;
          }
          if (in_stack_000000a0 != 0) {
code_r0x0003c900:
            func_0x006e644c(unaff_x28,
                            "Provided IV for mode \'%s\' must be empty, but got non-empty decoded value."
                           );
            goto LAB_0003cd88;
          }
          *(undefined1 *)uStack0000000000000098 = 0;
          in_stack_000000a0 = 0;
          *(undefined **)(unaff_x29 + -200) = &UNK_00a0c238;
          *(undefined **)(unaff_x29 + -0xc0) = &UNK_00a0c3e0;
          plVar17 = *(long **)(unaff_x29 + -0xb0);
        }
        else {
code_r0x0003c4bc:
          *(undefined **)(unaff_x29 + -200) = &UNK_00a0c238;
          *(undefined **)(unaff_x29 + -0xc0) = &UNK_00a0c3e0;
          plVar17 = *(long **)(unaff_x29 + -0xb0);
        }
        if (plVar17 != (long *)0x0) {
          (**(code **)(*plVar17 + 8))();
        }
      }
    }
    func_0x0004052c(unaff_x29 + -200,&uStack00000000000000c8,1);
    plVar17 = *(long **)(unaff_x29 + -200);
    uStack0000000000000040 = 0;
    in_stack_00000048 = 0;
    in_stack_00000050 = 0;
    uVar11 = in_stack_000000b8;
    puVar13 = uStack00000000000000b0;
    if (-1 < (long)in_stack_000000c0) {
      uVar11 = in_stack_000000c0 >> 0x38;
      puVar13 = &uStack00000000000000b0;
    }
    uVar2 = in_stack_000000a0;
    puVar14 = uStack0000000000000098;
    if (-1 < (long)_uStack00000000000000a8) {
      uVar2 = _uStack00000000000000a8 >> 0x38;
      puVar14 = &uStack0000000000000098;
    }
    func_0x005ee410(plVar17,puVar13,uVar11,puVar14,uVar2);
    uVar16 = *(undefined8 *)(unaff_x29 + -0xd0);
    uVar15 = __Znwm(0xd8);
    puVar13 = (undefined8 *)__Znwm(0x20);
    func_0x005edf2c(puVar13,0);
    *puVar13 = &UNK_009f9e90;
    puVar13[1] = &UNK_009fa020;
    puVar13[3] = &uStack0000000000000040;
    func_0x0066cd14(uVar15,plVar17 + 1,puVar13,2);
    func_0x0003f450(unaff_x29 + -200,in_stack_00000020,uVar16,1,uVar15);
    *(undefined **)(unaff_x29 + -200) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0xc0) = &UNK_00a0c3e0;
    if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
    }
    uStack0000000000000028 = (undefined8 *)0x0;
    in_stack_00000030 = 0;
    in_stack_00000038 = 0;
    uVar15 = __Znwm(0x98);
    puVar13 = (undefined8 *)__Znwm(0x20);
    func_0x005edf2c(puVar13,0);
    *puVar13 = &UNK_009f9e90;
    puVar13[1] = &UNK_009fa020;
    puVar13[3] = &uStack0000000000000028;
    func_0x0004004c(uVar15,puVar13,0,0x48);
    func_0x00040ad8(unaff_x29 + -200,&uStack0000000000000040,1,uVar15);
    *(undefined **)(unaff_x29 + -200) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0xc0) = &UNK_00a0c3e0;
    if (*(long **)(unaff_x29 + -0xb0) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0xb0) + 8))();
    }
    uVar11 = in_stack_00000030;
    puVar13 = uStack0000000000000028;
    if (-1 < (long)in_stack_00000038) {
      uVar11 = in_stack_00000038 >> 0x38;
      puVar13 = &uStack0000000000000028;
    }
    func_0x006e38d8(unaff_x28,puVar13,uVar11);
    uVar11 = in_stack_00000088;
    puVar13 = uStack0000000000000080;
    if (-1 < (long)in_stack_00000090) {
      uVar11 = in_stack_00000090 >> 0x38;
      puVar13 = &uStack0000000000000080;
    }
    func_0x006e38d8(unaff_x28,puVar13,uVar11);
    if ((long)in_stack_00000038 < 0) {
      __ZdlPv(uStack0000000000000028);
    }
    if (in_stack_00000050 < 0) {
      __ZdlPv(uStack0000000000000040);
    }
    if (plVar17 != (long *)0x0) {
      (**(code **)(*plVar17 + 8))(plVar17);
    }
    if ((long)in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
      if ((long)in_stack_00000090 < 0) goto code_r0x0003c870;
code_r0x0003c7ec:
      if (-1 < (long)_uStack00000000000000a8) goto code_r0x0003c7f4;
code_r0x0003c880:
      __ZdlPv(uStack0000000000000098);
      if ((long)in_stack_000000c0 < 0) goto code_r0x0003c890;
code_r0x0003c7fc:
      if (-1 < (long)_uStack00000000000000d8) goto code_r0x0003c804;
code_r0x0003c8a0:
      __ZdlPv(uStack00000000000000c8);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 2;
      }
    }
    else {
      if (-1 < (long)in_stack_00000090) goto code_r0x0003c7ec;
code_r0x0003c870:
      __ZdlPv(uStack0000000000000080);
      if ((long)_uStack00000000000000a8 < 0) goto code_r0x0003c880;
code_r0x0003c7f4:
      if (-1 < (long)in_stack_000000c0) goto code_r0x0003c7fc;
code_r0x0003c890:
      __ZdlPv(uStack00000000000000b0);
      if ((long)_uStack00000000000000d8 < 0) goto code_r0x0003c8a0;
code_r0x0003c804:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return 2;
      }
    }
    ___stack_chk_fail();
  }
  func_0x0001748c(&uStack00000000000000c8);
LAB_0003cd88:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x3cd8c);
  (*pcVar6)();
}

