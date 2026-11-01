
void FUN_00066980(void)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  code *pcVar4;
  long lVar5;
  undefined8 *puVar6;
  long *plVar7;
  undefined8 uVar8;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 *unaff_x19;
  long unaff_x20;
  long *plVar9;
  ulong uVar10;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  
  if (in_stack_00000088 < 0) {
    if (in_stack_00000080 != 0) goto LAB_0006699c;
  }
  else if (in_stack_00000088._7_1_ != 0) {
LAB_0006699c:
    func_0x00066498(&uStack0000000000000008);
    plVar9 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                               (&uStack0000000000000008,"\r\n",2);
    in_stack_00000028 = plVar9[1];
    uStack0000000000000020 = (undefined8 *)*plVar9;
    in_stack_00000030 = plVar9[2];
    plVar9[1] = 0;
    plVar9[2] = 0;
    *plVar9 = 0;
    uVar10 = in_stack_00000080;
    puVar6 = uStack0000000000000078;
    if (-1 < (char)in_stack_00000088._7_1_) {
      uVar10 = (ulong)in_stack_00000088._7_1_;
      puVar6 = &uStack0000000000000078;
    }
    puVar6 = (undefined8 *)
             __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                       (&uStack0000000000000020,puVar6,uVar10);
    in_stack_00000048 = puVar6[1];
    uStack0000000000000040 = *puVar6;
    in_stack_00000050 = puVar6[2];
    puVar6[1] = 0;
    puVar6[2] = 0;
    *puVar6 = 0;
    auVar11 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                        (&uStack0000000000000040,"\r\n",2);
    uVar8 = auVar11._8_8_;
    plVar9 = auVar11._0_8_;
    in_stack_00000068 = plVar9[1];
    uStack0000000000000060 = (undefined8 *)*plVar9;
    in_stack_00000070 = plVar9[2];
    plVar9[1] = 0;
    plVar9[2] = 0;
    *plVar9 = 0;
    if (in_stack_00000050 < 0) {
      __ZdlPv(uStack0000000000000040);
      uVar8 = extraout_x1;
    }
    if ((long)in_stack_00000030 < 0) {
      __ZdlPv(uStack0000000000000020);
      uVar8 = extraout_x1_00;
    }
    if (in_stack_00000018._7_1_ < '\0') {
      __ZdlPv(CONCAT44(uStack0000000000000008._4_4_,(undefined4)uStack0000000000000008));
      uVar8 = extraout_x1_01;
    }
    uVar10 = 0;
    plVar9 = (long *)unaff_x19[3];
    puVar6 = uStack0000000000000060;
    uVar1 = in_stack_00000068;
    if (-1 < (long)in_stack_00000070) {
      puVar6 = &uStack0000000000000060;
      uVar1 = in_stack_00000070 >> 0x38;
    }
    do {
      if (uVar1 < uVar10 || uVar1 - uVar10 == 0) {
        if ((long)in_stack_00000070 < 0) {
          __ZdlPv(uStack0000000000000060,uVar8,uVar1 - uVar10);
        }
        goto LAB_00066ac4;
      }
      auVar11 = (**(code **)(*plVar9 + 0x30))(plVar9,(long)puVar6 + uVar10);
      uVar8 = auVar11._8_8_;
      uVar10 = auVar11._0_8_ + uVar10;
    } while (-1 < auVar11._0_8_);
    *(undefined1 *)*unaff_x19 = 0;
    if ((long)in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    goto LAB_00066d14;
  }
LAB_00066ac4:
  uVar10 = 0;
  uStack0000000000000008._0_4_ = 0xa0d30;
  plVar9 = (long *)unaff_x19[3];
  do {
    if (2 < uVar10) goto LAB_00066b10;
    lVar5 = (**(code **)(*plVar9 + 0x30))(plVar9,(long)&uStack0000000000000008 + uVar10,3 - uVar10);
    uVar10 = lVar5 + uVar10;
  } while (-1 < lVar5);
  *(undefined1 *)*unaff_x19 = 0;
LAB_00066b10:
  if ((unaff_x20 != 0) && (plVar9 = *(long **)(unaff_x20 + 0x10), plVar9 != (long *)0x0)) {
    do {
      bVar3 = *(byte *)((long)plVar9 + 0x27);
      uVar10 = plVar9[3];
      if (-1 < (char)bVar3) {
        uVar10 = (ulong)bVar3;
      }
      uVar1 = uVar10 + 2;
      if (0x7ffffffffffffff7 < uVar1) {
        func_0x0001748c(&uStack0000000000000020);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x66d94);
        (*pcVar4)();
      }
      if (uVar1 < 0x17) {
        in_stack_00000028 = 0;
        uStack0000000000000020 = (undefined8 *)0x0;
        puVar6 = &uStack0000000000000020;
        in_stack_00000030 = uVar1 << 0x38;
        if (uVar10 != 0) goto code_r0x00066bac;
      }
      else {
        uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
        if ((uVar1 | 7) != 0x17) {
          uVar2 = uVar1 | 7;
        }
        puVar6 = (undefined8 *)__Znwm(uVar2 + 1);
        in_stack_00000030 = uVar2 + 1 | 0x8000000000000000;
        uStack0000000000000020 = puVar6;
        in_stack_00000028 = uVar1;
code_r0x00066bac:
        plVar7 = (long *)plVar9[2];
        if (-1 < (char)bVar3) {
          plVar7 = plVar9 + 2;
        }
        _memmove(puVar6,plVar7,uVar10);
      }
      *(undefined2 *)((long)puVar6 + uVar10) = 0x203a;
      *(undefined1 *)((undefined2 *)((long)puVar6 + uVar10) + 1) = 0;
      uVar10 = plVar9[6];
      plVar7 = (long *)plVar9[5];
      if (-1 < (char)*(byte *)((long)plVar9 + 0x3f)) {
        uVar10 = (ulong)*(byte *)((long)plVar9 + 0x3f);
        plVar7 = plVar9 + 5;
      }
      puVar6 = (undefined8 *)
               __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                         (&uStack0000000000000020,plVar7,uVar10);
      in_stack_00000048 = puVar6[1];
      uStack0000000000000040 = *puVar6;
      in_stack_00000050 = puVar6[2];
      puVar6[1] = 0;
      puVar6[2] = 0;
      *puVar6 = 0;
      plVar7 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                                 (&uStack0000000000000040,"\r\n",2);
      in_stack_00000068 = plVar7[1];
      uStack0000000000000060 = (undefined8 *)*plVar7;
      in_stack_00000070 = plVar7[2];
      plVar7[1] = 0;
      plVar7[2] = 0;
      *plVar7 = 0;
      if (in_stack_00000050 < 0) {
        __ZdlPv(uStack0000000000000040);
      }
      if ((long)in_stack_00000030 < 0) {
        __ZdlPv(uStack0000000000000020);
      }
      uVar10 = 0;
      plVar7 = (long *)unaff_x19[3];
      puVar6 = uStack0000000000000060;
      uVar1 = in_stack_00000068;
      if (-1 < (long)in_stack_00000070) {
        puVar6 = &uStack0000000000000060;
        uVar1 = in_stack_00000070 >> 0x38;
      }
      do {
        if (uVar1 < uVar10 || uVar1 - uVar10 == 0) goto code_r0x00066c98;
        lVar5 = (**(code **)(*plVar7 + 0x30))(plVar7,(long)puVar6 + uVar10,uVar1 - uVar10);
        uVar10 = lVar5 + uVar10;
      } while (-1 < lVar5);
      *(undefined1 *)*unaff_x19 = 0;
code_r0x00066c98:
      if ((long)in_stack_00000070 < 0) {
        __ZdlPv(uStack0000000000000060);
      }
      plVar9 = (long *)*plVar9;
    } while (plVar9 != (long *)0x0);
  }
  uVar10 = 0;
  uVar1 = (ulong)uStack0000000000000060 >> 0x10;
  uStack0000000000000060 = (undefined8 *)CONCAT62((uint6)uVar1 & 0xffffffffff00,0xa0d);
  plVar9 = (long *)unaff_x19[3];
  do {
    if (1 < uVar10) goto LAB_00066d14;
    lVar5 = (**(code **)(*plVar9 + 0x30))(plVar9,(long)&uStack0000000000000060 + uVar10,2 - uVar10);
    uVar10 = lVar5 + uVar10;
  } while (-1 < lVar5);
  *(undefined1 *)*unaff_x19 = 0;
LAB_00066d14:
  if ((char)in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000078);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  uVar8 = ___stack_chk_fail();
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  if ((long)in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(CONCAT44(uStack0000000000000008._4_4_,(undefined4)uStack0000000000000008));
  }
  if ((char)in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000078);
  }
  __Unwind_Resume(uVar8);
  return;
}

