
void FUN_00066b54(ulong param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 *unaff_x19;
  ulong unaff_x21;
  ulong uVar8;
  long *unaff_x24;
  ulong unaff_x25;
  undefined2 unaff_w26;
  long unaff_x27;
  int unaff_w28;
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
    if (param_1 <= unaff_x25) {
      func_0x0001748c(&uStack0000000000000020);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x66d94);
      (*pcVar2)();
    }
    if (unaff_x25 < 0x17) {
      in_stack_00000028 = 0;
      uStack0000000000000020 = (undefined8 *)0x0;
      puVar3 = &uStack0000000000000020;
      in_stack_00000030 = unaff_x25 << 0x38;
      if (unaff_x21 != 0) goto LAB_00066bac;
    }
    else {
      uVar8 = (unaff_x25 & 0xfffffffffffffff8) + 8;
      if ((unaff_x25 | 7) != 0x17) {
        uVar8 = unaff_x25 | 7;
      }
      puVar3 = (undefined8 *)__Znwm(uVar8 + 1);
      in_stack_00000030 = uVar8 + 1 | 0x8000000000000000;
      uStack0000000000000020 = puVar3;
      in_stack_00000028 = unaff_x25;
LAB_00066bac:
      plVar4 = (long *)unaff_x24[2];
      if (-1 < unaff_w28) {
        plVar4 = unaff_x24 + 2;
      }
      _memmove(puVar3,plVar4,unaff_x21);
    }
    *(undefined2 *)((long)puVar3 + unaff_x21) = unaff_w26;
    *(undefined1 *)((undefined2 *)((long)puVar3 + unaff_x21) + 1) = 0;
    uVar8 = unaff_x24[6];
    plVar4 = (long *)unaff_x24[5];
    if (-1 < (char)*(byte *)((long)unaff_x24 + 0x3f)) {
      uVar8 = (ulong)*(byte *)((long)unaff_x24 + 0x3f);
      plVar4 = unaff_x24 + 5;
    }
    puVar3 = (undefined8 *)
             __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                       (&uStack0000000000000020,plVar4,uVar8);
    in_stack_00000048 = puVar3[1];
    uStack0000000000000040 = *puVar3;
    in_stack_00000050 = puVar3[2];
    puVar3[1] = 0;
    puVar3[2] = 0;
    *puVar3 = 0;
    plVar4 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                               (&uStack0000000000000040);
    in_stack_00000068 = plVar4[1];
    uStack0000000000000060 = *plVar4;
    in_stack_00000070 = plVar4[2];
    plVar4[1] = 0;
    plVar4[2] = 0;
    *plVar4 = 0;
    if (in_stack_00000050 < 0) {
      __ZdlPv(uStack0000000000000040);
    }
    if ((long)in_stack_00000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
    uVar8 = 0;
    plVar4 = (long *)unaff_x19[3];
    lVar6 = uStack0000000000000060;
    uVar1 = in_stack_00000068;
    if (-1 < (long)in_stack_00000070) {
      lVar6 = unaff_x27;
      uVar1 = in_stack_00000070 >> 0x38;
    }
    do {
      if (uVar1 < uVar8 || uVar1 - uVar8 == 0) goto LAB_00066c98;
      lVar5 = (**(code **)(*plVar4 + 0x30))(plVar4,lVar6 + uVar8,uVar1 - uVar8);
      uVar8 = lVar5 + uVar8;
    } while (-1 < lVar5);
    *(undefined1 *)*unaff_x19 = 0;
LAB_00066c98:
    if ((long)in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    unaff_x24 = (long *)*unaff_x24;
    if (unaff_x24 == (long *)0x0) {
      uVar8 = 0;
      uVar1 = (ulong)uStack0000000000000060 >> 0x10;
      uStack0000000000000060 = CONCAT62((uint6)uVar1 & 0xffffffffff00,0xa0d);
      plVar4 = (long *)unaff_x19[3];
      break;
    }
    unaff_w28 = (int)(char)*(byte *)((long)unaff_x24 + 0x27);
    unaff_x21 = unaff_x24[3];
    if (-1 < unaff_w28) {
      unaff_x21 = (ulong)*(byte *)((long)unaff_x24 + 0x27);
    }
    unaff_x25 = unaff_x21 + 2;
    param_1 = 0x7ffffffffffffff8;
  } while( true );
  while( true ) {
    lVar6 = (**(code **)(*plVar4 + 0x30))(plVar4,(long)&uStack0000000000000060 + uVar8,2 - uVar8);
    uVar8 = lVar6 + uVar8;
    if (lVar6 < 0) break;
    if (1 < uVar8) goto code_r0x00066d14;
  }
  *(undefined1 *)*unaff_x19 = 0;
code_r0x00066d14:
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(in_stack_00000078);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  uVar7 = ___stack_chk_fail();
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
  __Unwind_Resume(uVar7);
  return;
}

