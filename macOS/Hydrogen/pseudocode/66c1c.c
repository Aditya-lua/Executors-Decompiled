
void FUN_00066c1c(undefined8 *param_1)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  code *pcVar4;
  undefined8 *puVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  undefined8 uVar9;
  undefined8 *unaff_x19;
  ulong uVar10;
  long *unaff_x24;
  undefined2 unaff_w26;
  long unaff_x27;
  long unaff_x29;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000088;
  
  do {
    plVar6 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                               (param_1);
    in_stack_00000068 = plVar6[1];
    uStack0000000000000060 = *plVar6;
    in_stack_00000070 = plVar6[2];
    plVar6[1] = 0;
    plVar6[2] = 0;
    *plVar6 = 0;
    if (in_stack_00000050 < 0) {
      __ZdlPv(uStack0000000000000040);
    }
    if ((long)in_stack_00000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
    uVar10 = 0;
    plVar6 = (long *)unaff_x19[3];
    lVar8 = uStack0000000000000060;
    uVar1 = in_stack_00000068;
    if (-1 < (long)in_stack_00000070) {
      lVar8 = unaff_x27;
      uVar1 = in_stack_00000070 >> 0x38;
    }
    do {
      if (uVar1 < uVar10 || uVar1 - uVar10 == 0) goto LAB_00066c98;
      lVar7 = (**(code **)(*plVar6 + 0x30))(plVar6,lVar8 + uVar10,uVar1 - uVar10);
      uVar10 = lVar7 + uVar10;
    } while (-1 < lVar7);
    *(undefined1 *)*unaff_x19 = 0;
LAB_00066c98:
    if ((long)in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    unaff_x24 = (long *)*unaff_x24;
    if (unaff_x24 == (long *)0x0) {
      uVar10 = 0;
      uVar1 = (ulong)uStack0000000000000060 >> 0x10;
      uStack0000000000000060 = CONCAT62((uint6)uVar1 & 0xffffffffff00,0xa0d);
      plVar6 = (long *)unaff_x19[3];
      break;
    }
    bVar3 = *(byte *)((long)unaff_x24 + 0x27);
    uVar10 = unaff_x24[3];
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
      puVar5 = &uStack0000000000000020;
      in_stack_00000030 = uVar1 << 0x38;
      if (uVar10 != 0) goto code_r0x00066bac;
    }
    else {
      uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
      if ((uVar1 | 7) != 0x17) {
        uVar2 = uVar1 | 7;
      }
      puVar5 = (undefined8 *)__Znwm(uVar2 + 1);
      in_stack_00000030 = uVar2 + 1 | 0x8000000000000000;
      uStack0000000000000020 = puVar5;
      in_stack_00000028 = uVar1;
code_r0x00066bac:
      plVar6 = (long *)unaff_x24[2];
      if (-1 < (char)bVar3) {
        plVar6 = unaff_x24 + 2;
      }
      _memmove(puVar5,plVar6,uVar10);
    }
    *(undefined2 *)((long)puVar5 + uVar10) = unaff_w26;
    *(undefined1 *)((undefined2 *)((long)puVar5 + uVar10) + 1) = 0;
    uVar10 = unaff_x24[6];
    plVar6 = (long *)unaff_x24[5];
    if (-1 < (char)*(byte *)((long)unaff_x24 + 0x3f)) {
      uVar10 = (ulong)*(byte *)((long)unaff_x24 + 0x3f);
      plVar6 = unaff_x24 + 5;
    }
    puVar5 = (undefined8 *)
             __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                       (&uStack0000000000000020,plVar6,uVar10);
    in_stack_00000048 = puVar5[1];
    uStack0000000000000040 = *puVar5;
    in_stack_00000050 = puVar5[2];
    puVar5[1] = 0;
    puVar5[2] = 0;
    *puVar5 = 0;
    param_1 = &uStack0000000000000040;
  } while( true );
  while( true ) {
    lVar8 = (**(code **)(*plVar6 + 0x30))(plVar6,(long)&uStack0000000000000060 + uVar10,2 - uVar10);
    uVar10 = lVar8 + uVar10;
    if (lVar8 < 0) break;
    if (1 < uVar10) goto code_r0x00066d14;
  }
  *(undefined1 *)*unaff_x19 = 0;
code_r0x00066d14:
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(in_stack_00000078);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  uVar9 = ___stack_chk_fail();
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  if ((long)in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(in_stack_00000078);
  }
  __Unwind_Resume(uVar9);
  return;
}

