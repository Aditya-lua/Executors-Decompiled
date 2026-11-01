
undefined8 * FUN_00725db4(ulong param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  long in_x9;
  ulong uVar9;
  ulong in_x10;
  long in_x11;
  ulong uVar10;
  long in_x13;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x26;
  undefined8 *puVar11;
  undefined8 uVar12;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  undefined7 uStack0000000000000038;
  
  uVar9 = (in_x13 - in_x9 >> 4) * in_x11;
  uVar10 = uVar9 * 2;
  if (uVar10 <= in_x10) {
    uVar10 = in_x10;
  }
  if (0x2aaaaaaaaaaaaa9 < uVar9) {
    uVar10 = param_1;
  }
  if (uVar10 == 0) {
    lVar3 = 0;
  }
  else {
    if (param_1 < uVar10) {
      uVar6 = func_0x00017514();
      func_0x0064b2f0();
      puVar11 = (undefined8 *)__Unwind_Resume(uVar6);
      return puVar11;
    }
    lVar3 = __Znwm(uVar10 * 0x30);
  }
  puVar11 = (undefined8 *)(lVar3 + unaff_x26 * 0x30);
  lVar7 = lVar3 + uVar10 * 0x30;
  uVar10 = _strlen();
  if (0x7ffffffffffffff7 < uVar10) {
    func_0x0001748c(&uStack0000000000000028);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x725f9c);
    (*pcVar2)();
  }
  if (uVar10 < 0x17) {
    _uStack0000000000000038 = CONCAT17((char)uVar10,uStack0000000000000038);
    puVar4 = &uStack0000000000000028;
    if (uVar10 == 0) goto LAB_00725e88;
  }
  else {
    uVar9 = (uVar10 & 0xfffffffffffffff8) + 8;
    if ((uVar10 | 7) != 0x17) {
      uVar9 = uVar10 | 7;
    }
    puVar4 = (undefined8 *)__Znwm(uVar9 + 1);
    _uStack0000000000000038 = uVar9 + 1 | 0x8000000000000000;
    uStack0000000000000028 = puVar4;
    in_stack_00000030 = uVar10;
  }
  _memcpy(puVar4);
LAB_00725e88:
  *(undefined1 *)((long)puVar4 + uVar10) = 0;
  *puVar11 = &UNK_00a1df28;
  lVar3 = lVar3 + unaff_x26 * 0x30;
  uVar6 = *unaff_x20;
  *(undefined8 *)(lVar3 + 0x10) = unaff_x20[1];
  *(undefined8 *)(lVar3 + 8) = uVar6;
  *(ulong *)(lVar3 + 0x20) = in_stack_00000030;
  *(undefined8 **)(lVar3 + 0x18) = uStack0000000000000028;
  *(ulong *)(lVar3 + 0x28) = _uStack0000000000000038;
  puVar4 = puVar11 + 6;
  puVar1 = (undefined8 *)*unaff_x19;
  puVar5 = (undefined8 *)unaff_x19[1];
  if (puVar5 == puVar1) {
    *unaff_x19 = (long)puVar11;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = lVar7;
  }
  else {
    do {
      puVar8 = puVar11 + -6;
      *puVar8 = &UNK_00a1df28;
      uVar6 = puVar5[-5];
      puVar11[-4] = puVar5[-4];
      puVar11[-5] = uVar6;
      uVar12 = puVar5[-2];
      uVar6 = puVar5[-3];
      puVar11[-1] = puVar5[-1];
      puVar11[-2] = uVar12;
      puVar11[-3] = uVar6;
      puVar5[-2] = 0;
      puVar5[-1] = 0;
      puVar5[-3] = 0;
      puVar5 = puVar5 + -6;
      puVar11 = puVar8;
    } while (puVar5 != puVar1);
    puVar11 = (undefined8 *)*unaff_x19;
    puVar5 = (undefined8 *)unaff_x19[1];
    *unaff_x19 = (long)puVar8;
    unaff_x19[1] = (long)puVar4;
    unaff_x19[2] = lVar7;
    if (puVar5 != puVar11) {
      do {
        puVar5 = puVar5 + -6;
        (**(code **)*puVar5)(puVar5);
      } while (puVar5 != puVar11);
      puVar5 = puVar11;
    }
  }
  if (puVar5 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  return puVar4;
}

