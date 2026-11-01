
void FUN_0007177c(ulong param_1)

{
  byte bVar1;
  long lVar2;
  code *pcVar3;
  char in_NG;
  char in_OV;
  ushort *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  long *unaff_x20;
  long unaff_x21;
  ulong uVar10;
  long *unaff_x22;
  ulong uVar11;
  ulong unaff_x23;
  ulong uVar12;
  ulong uVar13;
  ulong unaff_x24;
  byte unaff_w25;
  uint unaff_w26;
  long *unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined1 uStack0000000000000060;
  undefined8 uStack0000000000000078;
  ulong in_stack_00000080;
  undefined7 uStack0000000000000088;
  
  do {
    uVar12 = unaff_x24;
    if (in_NG == in_OV) {
      uVar12 = unaff_x23;
    }
    if (uVar12 < param_1) {
code_r0x00071788:
      if (((uint)unaff_x23 >> 7 & 1) == 0) {
        if (unaff_x23 <= unaff_x28) goto LAB_00071874;
        uVar12 = unaff_x23 - unaff_x28;
      }
      else {
        if (unaff_x24 <= unaff_x28) goto LAB_00071874;
        uVar12 = unaff_x24 - unaff_x28;
        unaff_x20 = unaff_x22;
      }
      if (uVar12 < 0x7ffffffffffffff8) {
        if (uVar12 < 0x17) {
          _uStack0000000000000088 = CONCAT17((char)uVar12,uStack0000000000000088);
          puVar5 = &uStack0000000000000078;
        }
        else {
          uVar10 = (uVar12 & 0xfffffffffffffff8) + 8;
          if ((uVar12 | 7) != 0x17) {
            uVar10 = uVar12 | 7;
          }
          puVar5 = (undefined8 *)__Znwm(uVar10 + 1);
          _uStack0000000000000088 = uVar10 + 1 | 0x8000000000000000;
          uStack0000000000000078 = puVar5;
          in_stack_00000080 = uVar12;
        }
        _memmove(puVar5,(long)unaff_x20 + unaff_x28,uVar12);
        *(undefined1 *)((long)puVar5 + uVar12) = 0;
        plVar8 = *(long **)(unaff_x21 + 0x10);
        if (plVar8 < *(long **)(unaff_x21 + 0x18)) {
          plVar8[2] = _uStack0000000000000088;
          plVar8[1] = in_stack_00000080;
          *plVar8 = (long)uStack0000000000000078;
          *(long **)(unaff_x21 + 0x10) = plVar8 + 3;
        }
        else {
          uVar6 = func_0x000232b4(in_stack_00000008,&uStack0000000000000078);
          *(undefined8 *)(unaff_x21 + 0x10) = uVar6;
          if ((long)_uStack0000000000000088 < 0) {
            __ZdlPv(uStack0000000000000078);
          }
        }
LAB_00071874:
        plVar8 = (long *)*(long *)(unaff_x29 + -0x70);
        while (plVar8 != (long *)0x0) {
          lVar7 = *plVar8;
          if (*(char *)((long)plVar8 + 0x27) < '\0') {
            __ZdlPv(plVar8[2]);
          }
          __ZdlPv(plVar8);
          plVar8 = (long *)lVar7;
        }
        lVar7 = *(long *)(unaff_x29 + -0x80);
        *(undefined8 *)(unaff_x29 + -0x80) = 0;
        if (lVar7 != 0) {
          __ZdlPv();
        }
        return;
      }
      func_0x0001748c(&uStack0000000000000078);
      goto LAB_000719e0;
    }
    lVar7 = (long)unaff_x27 + param_1;
    while( true ) {
      lVar2 = (long)((long)unaff_x27 + uVar12) - lVar7;
      if ((lVar2 < 2) ||
         (puVar4 = (ushort *)_memchr(lVar7,0x2f,lVar2 + -1), puVar4 == (ushort *)0x0))
      goto code_r0x00071788;
      if (*puVar4 == unaff_w26) break;
      lVar7 = (long)puVar4 + 1;
    }
    if ((puVar4 == (ushort *)((long)unaff_x27 + uVar12)) ||
       (lVar7 = (long)puVar4 - (long)unaff_x27, lVar7 == -1)) goto code_r0x00071788;
    plVar8 = unaff_x20;
    if ((unaff_w25 & 1) != 0) {
      unaff_x23 = unaff_x24;
      plVar8 = unaff_x22;
    }
    if (unaff_x23 < unaff_x28) {
      func_0x00049dd0(&uStack0000000000000078);
      goto LAB_000719e0;
    }
    uVar12 = (lVar7 - unaff_x28) + 1;
    uVar10 = unaff_x23 - unaff_x28;
    if (uVar12 <= unaff_x23 - unaff_x28) {
      uVar10 = uVar12;
    }
    if (0x7ffffffffffffff7 < uVar10) {
      func_0x0001748c(&uStack0000000000000078);
      goto LAB_000719e0;
    }
    if (uVar10 < 0x17) {
      _uStack0000000000000088 = CONCAT17((char)uVar10,uStack0000000000000088);
      puVar5 = &uStack0000000000000078;
      if (uVar10 != 0) goto code_r0x000715c0;
      uStack0000000000000078 = (undefined8 *)((ulong)uStack0000000000000078 & 0xffffffffffffff00);
      plVar8 = *(long **)(unaff_x21 + 0x10);
      if (plVar8 < *(long **)(unaff_x21 + 0x18)) goto code_r0x00071578;
code_r0x000715e0:
      uVar6 = func_0x000232b4(in_stack_00000008,&uStack0000000000000078);
      *(undefined8 *)(unaff_x21 + 0x10) = uVar6;
      if ((long)_uStack0000000000000088 < 0) {
        __ZdlPv(uStack0000000000000078);
      }
    }
    else {
      uVar12 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar12 = uVar10 | 7;
      }
      puVar5 = (undefined8 *)__Znwm(uVar12 + 1);
      _uStack0000000000000088 = uVar12 + 1 | 0x8000000000000000;
      uStack0000000000000078 = puVar5;
      in_stack_00000080 = uVar10;
code_r0x000715c0:
      _memmove(puVar5,(long)plVar8 + unaff_x28,uVar10);
      *(undefined1 *)((long)puVar5 + uVar10) = 0;
      plVar8 = *(long **)(unaff_x21 + 0x10);
      if (*(long **)(unaff_x21 + 0x18) <= plVar8) goto code_r0x000715e0;
code_r0x00071578:
      plVar8[2] = _uStack0000000000000088;
      plVar8[1] = in_stack_00000080;
      *plVar8 = (long)uStack0000000000000078;
      *(long **)(unaff_x21 + 0x10) = plVar8 + 3;
    }
    uVar12 = lVar7 + 2;
    bVar1 = *(byte *)((long)unaff_x20 + 0x17);
    uVar11 = (ulong)bVar1;
    uVar13 = unaff_x20[1];
    uVar10 = uVar13;
    if (-1 < (char)bVar1) {
      uVar10 = uVar11;
    }
    if (uVar10 < uVar12 || uVar10 - uVar12 == 0) {
code_r0x00071658:
      if ((char)bVar1 < '\0') {
        uVar9 = uVar13 - uVar12;
        uVar10 = uVar13;
        goto code_r0x0007167c;
      }
      uVar9 = uVar11 - uVar12;
      uVar10 = uVar11;
code_r0x00071664:
      plVar8 = unaff_x20;
      if (uVar11 < uVar12) goto code_r0x000719c0;
    }
    else {
      plVar8 = (long *)*unaff_x20;
      if (-1 < (char)bVar1) {
        plVar8 = unaff_x20;
      }
      lVar7 = _memchr((long)plVar8 + uVar12,0x2f,uVar10 - uVar12);
      if ((lVar7 == 0) || (uVar10 = lVar7 - (long)plVar8, uVar10 == 0xffffffffffffffff))
      goto code_r0x00071658;
      uVar9 = uVar10 - uVar12;
      if (-1 < (char)bVar1) goto code_r0x00071664;
code_r0x0007167c:
      if (uVar13 < uVar12) {
code_r0x000719c0:
        func_0x00049dd0(&uStack0000000000000078);
        goto LAB_000719e0;
      }
      uVar11 = uVar13;
      plVar8 = (long *)*unaff_x20;
    }
    uVar13 = uVar11 - uVar12;
    if (uVar9 <= uVar11 - uVar12) {
      uVar13 = uVar9;
    }
    if (0x7ffffffffffffff7 < uVar13) {
      func_0x0001748c(&uStack0000000000000078);
      goto LAB_000719e0;
    }
    if (uVar13 < 0x17) {
      _uStack0000000000000088 = CONCAT17((char)uVar13,uStack0000000000000088);
      puVar5 = &uStack0000000000000078;
      if (uVar13 != 0) goto code_r0x000716f0;
    }
    else {
      uVar11 = (uVar13 & 0xfffffffffffffff8) + 8;
      if ((uVar13 | 7) != 0x17) {
        uVar11 = uVar13 | 7;
      }
      puVar5 = (undefined8 *)__Znwm(uVar11 + 1);
      _uStack0000000000000088 = uVar11 + 1 | 0x8000000000000000;
      uStack0000000000000078 = puVar5;
      in_stack_00000080 = uVar13;
code_r0x000716f0:
      _memmove(puVar5,(long)plVar8 + uVar12,uVar13);
    }
    *(undefined1 *)((long)puVar5 + uVar13) = 0;
    lVar7 = func_0x00072168(unaff_x29 + -0x80,&uStack0000000000000078);
    if (lVar7 != 0) {
      __ZNSt3__1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_
                (&uStack0000000000000010,"Encountered path parameter \'",&uStack0000000000000078);
      func_0x0003a638(&uStack0000000000000028,&uStack0000000000000010,
                      "\' multiple times in route pattern \'");
      uVar12 = unaff_x20[1];
      plVar8 = (long *)*unaff_x20;
      if (-1 < (char)*(byte *)((long)unaff_x20 + 0x17)) {
        uVar12 = (ulong)*(byte *)((long)unaff_x20 + 0x17);
        plVar8 = unaff_x20;
      }
      puVar5 = (undefined8 *)
               __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                         (&uStack0000000000000028,plVar8,uVar12);
      in_stack_00000048 = puVar5[1];
      uStack0000000000000040 = *puVar5;
      in_stack_00000050 = puVar5[2];
      puVar5[1] = 0;
      puVar5[2] = 0;
      *puVar5 = 0;
      func_0x0003a638(&uStack0000000000000060,&uStack0000000000000040,"\'.");
      if (in_stack_00000050 < 0) {
        __ZdlPv(uStack0000000000000040);
      }
      if (in_stack_00000038._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000028);
      }
      if (in_stack_00000020._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000010);
      }
      plVar8 = (long *)___cxa_allocate_exception(0x10);
      __ZNSt11logic_errorC2ERKNSt3__112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
                (plVar8,&uStack0000000000000060);
      *plVar8 = (long)(PTR___ZTVSt16invalid_argument_009b01a0 + 0x10);
      ___cxa_throw(plVar8,PTR___ZTISt16invalid_argument_009b0130,
                   PTR___ZNSt16invalid_argumentD1Ev_009b0058);
LAB_000719e0:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x719e4);
      (*pcVar3)();
    }
    plVar8 = *(long **)(unaff_x21 + 0x28);
    if (plVar8 < *(long **)(unaff_x21 + 0x30)) {
      plVar8[2] = _uStack0000000000000088;
      plVar8[1] = in_stack_00000080;
      *plVar8 = (long)uStack0000000000000078;
      *(long **)(unaff_x21 + 0x28) = plVar8 + 3;
    }
    else {
      uVar6 = func_0x000232b4(in_stack_00000000,&uStack0000000000000078);
      *(undefined8 *)(unaff_x21 + 0x28) = uVar6;
      if ((long)_uStack0000000000000088 < 0) {
        __ZdlPv(uStack0000000000000078);
      }
    }
    unaff_x28 = uVar10 + 1;
    param_1 = 0;
    if (unaff_x28 != 0) {
      param_1 = uVar10;
    }
    unaff_x23 = (ulong)*(byte *)((long)unaff_x20 + 0x17);
    in_NG = (char)*(byte *)((long)unaff_x20 + 0x17) < '\0';
    in_OV = '\0';
    unaff_x22 = (long *)*unaff_x20;
    unaff_x24 = unaff_x20[1];
    unaff_x27 = unaff_x22;
    if (!(bool)in_NG) {
      unaff_x27 = unaff_x20;
    }
    unaff_w25 = in_NG;
  } while( true );
}

