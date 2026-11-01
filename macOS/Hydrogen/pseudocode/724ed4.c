
/* WARNING: Removing unreachable block (ram,0x00725068) */

undefined8 * FUN_00724ed4(ulong param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long in_x9;
  ulong uVar5;
  ulong in_x10;
  long in_x11;
  ulong uVar6;
  long in_x13;
  long *unaff_x19;
  undefined8 *unaff_x21;
  long lVar7;
  undefined8 *puVar8;
  long unaff_x25;
  undefined8 uVar9;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  undefined8 *in_stack_00000018;
  long in_stack_00000020;
  
  uVar5 = (in_x13 - in_x9 >> 3) * in_x11;
  uVar6 = uVar5 * 2;
  if (uVar6 <= in_x10) {
    uVar6 = in_x10;
  }
  if (0x333333333333332 < uVar5) {
    uVar6 = param_1;
  }
  if (uVar6 == 0) {
    lVar2 = 0;
  }
  else {
    if (param_1 < uVar6) {
      uVar3 = func_0x00017514();
      func_0x00724e14(&uStack0000000000000008);
      puVar4 = (undefined8 *)__Unwind_Resume(uVar3);
      return puVar4;
    }
    lVar2 = __Znwm(uVar6 * 0x28);
  }
  puVar8 = (undefined8 *)(lVar2 + unaff_x25 * 0x28);
  in_stack_00000020 = lVar2 + uVar6 * 0x28;
  uVar3 = *unaff_x21;
  puVar8[1] = unaff_x21[1];
  *puVar8 = uVar3;
  puVar4 = puVar8 + 2;
  uStack0000000000000008 = lVar2;
  in_stack_00000010 = puVar8;
  in_stack_00000018 = puVar8;
  uVar6 = _strlen();
  if (0x7ffffffffffffff7 < uVar6) {
    func_0x0001748c(puVar4);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x7250b8);
    (*pcVar1)();
  }
  if (uVar6 < 0x17) {
    *(char *)((long)puVar8 + 0x27) = (char)uVar6;
    puVar8 = puVar4;
    if (uVar6 != 0) goto LAB_00724fc0;
    *(undefined1 *)puVar4 = 0;
    puVar4 = in_stack_00000018 + 5;
    lVar2 = *unaff_x19;
    lVar7 = unaff_x19[1];
    puVar8 = in_stack_00000010;
    if (lVar7 != lVar2) goto LAB_00724fe8;
  }
  else {
    uVar5 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar5 = uVar6 | 7;
    }
    puVar8 = (undefined8 *)__Znwm(uVar5 + 1);
    *puVar4 = puVar8;
    lVar2 = lVar2 + unaff_x25 * 0x28;
    *(ulong *)(lVar2 + 0x18) = uVar6;
    *(ulong *)(lVar2 + 0x20) = uVar5 + 1 | 0x8000000000000000;
LAB_00724fc0:
    _memmove(puVar8);
    *(undefined1 *)((long)puVar8 + uVar6) = 0;
    puVar4 = in_stack_00000018 + 5;
    lVar2 = *unaff_x19;
    lVar7 = unaff_x19[1];
    puVar8 = in_stack_00000010;
    if (lVar7 != lVar2) {
LAB_00724fe8:
      do {
        uVar3 = *(undefined8 *)(lVar7 + -0x28);
        puVar8[-4] = *(undefined8 *)(lVar7 + -0x20);
        puVar8[-5] = uVar3;
        uVar9 = *(undefined8 *)(lVar7 + -0x10);
        uVar3 = *(undefined8 *)(lVar7 + -0x18);
        puVar8[-1] = *(undefined8 *)(lVar7 + -8);
        puVar8[-2] = uVar9;
        puVar8[-3] = uVar3;
        puVar8 = puVar8 + -5;
        *(undefined8 *)(lVar7 + -0x10) = 0;
        *(undefined8 *)(lVar7 + -8) = 0;
        *(undefined8 *)(lVar7 + -0x18) = 0;
        lVar7 = lVar7 + -0x28;
      } while (lVar7 != lVar2);
      lVar2 = *unaff_x19;
      lVar7 = unaff_x19[1];
      *unaff_x19 = (long)puVar8;
      unaff_x19[1] = (long)puVar4;
      unaff_x19[2] = in_stack_00000020;
      if (lVar7 != lVar2) {
        do {
          lVar7 = lVar7 + -0x28;
        } while (lVar7 != lVar2);
        lVar7 = lVar2;
      }
      goto LAB_00725078;
    }
  }
  *unaff_x19 = (long)in_stack_00000010;
  unaff_x19[1] = (long)puVar4;
  unaff_x19[2] = in_stack_00000020;
LAB_00725078:
  if (lVar7 != 0) {
    __ZdlPv(lVar7);
  }
  return puVar4;
}

