
undefined8 * FUN_0006ac04(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 uVar5;
  byte bVar6;
  byte bVar7;
  undefined1 *puVar8;
  code *pcVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  long *plVar12;
  undefined8 uVar13;
  long lVar14;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x24;
  undefined1 auVar15 [16];
  undefined1 auVar16 [12];
  undefined1 *in_stack_00000000;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined7 in_stack_00000018;
  undefined1 uStack000000000000001f;
  undefined7 in_stack_00000020;
  long in_stack_00000028;
  long alStack_68 [3];
  long *plStack_50;
  long alStack_48 [3];
  long *plStack_30;
  long lStack_28;
  undefined8 uStack_20;
  undefined8 uStack_18;
  
  _memmove();
  *(undefined1 *)(unaff_x22 + unaff_x21) = 0;
  puVar10 = (undefined8 *)
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  uVar13 = *puVar10;
  in_stack_00000018 = (undefined7)puVar10[1];
  uStack000000000000001f = (undefined1)*(undefined8 *)((long)puVar10 + 0xf);
  in_stack_00000020 = (undefined7)((ulong)*(undefined8 *)((long)puVar10 + 0xf) >> 8);
  uVar5 = *(undefined1 *)((long)puVar10 + 0x17);
  puVar10[1] = 0;
  puVar10[2] = 0;
  *puVar10 = 0;
  if (*(char *)((long)unaff_x19 + 0x5f) < '\0') {
    __ZdlPv(unaff_x19[9]);
  }
  unaff_x19[9] = uVar13;
  unaff_x19[10] = CONCAT17(uStack000000000000001f,in_stack_00000018);
  *(ulong *)((long)unaff_x19 + 0x57) = CONCAT71(in_stack_00000020,uStack000000000000001f);
  *(undefined1 *)((long)unaff_x19 + 0x5f) = uVar5;
  if ((long)in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  bVar6 = *(byte *)((long)unaff_x19 + 0x2f);
  uVar2 = unaff_x19[4];
  if (-1 < (char)bVar6) {
    uVar2 = (ulong)bVar6;
  }
  bVar7 = *(byte *)((long)unaff_x19 + 0x17);
  uVar3 = unaff_x19[1];
  if (-1 < (char)bVar7) {
    uVar3 = (ulong)bVar7;
  }
  uVar1 = uVar3 + uVar2;
  if (unaff_x24 < uVar1) {
    func_0x0001748c();
                    /* WARNING: Does not return */
    pcVar9 = (code *)SoftwareBreakpoint(1,0x6ae14);
    (*pcVar9)();
  }
  if (uVar1 < 0x17) {
    in_stack_00000008 = 0;
    in_stack_00000000 = (undefined1 *)0x0;
    in_stack_00000010 = uVar1 << 0x38;
    puVar8 = (undefined1 *)register0x00000008;
  }
  else {
    uVar4 = (uVar1 & 0xfffffffffffffff8) + 8;
    if ((uVar1 | 7) != 0x17) {
      uVar4 = uVar1 | 7;
    }
    in_stack_00000000 = (undefined1 *)__Znwm(uVar4 + 1);
    in_stack_00000010 = uVar4 + 1 | 0x8000000000000000;
    in_stack_00000008 = uVar1;
    puVar8 = in_stack_00000000;
  }
  if (uVar2 != 0) {
    puVar10 = (undefined8 *)unaff_x19[3];
    if (-1 < (char)bVar6) {
      puVar10 = unaff_x19 + 3;
    }
    _memmove(puVar8,puVar10,uVar2);
  }
  if (uVar3 != 0) {
    puVar10 = (undefined8 *)*unaff_x19;
    if (-1 < (char)bVar7) {
      puVar10 = unaff_x19;
    }
    _memmove(puVar8 + uVar2,puVar10,uVar3);
  }
  (puVar8 + uVar2)[uVar3] = 0;
  puVar10 = (undefined8 *)
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  uVar13 = *puVar10;
  in_stack_00000018 = (undefined7)puVar10[1];
  uStack000000000000001f = (undefined1)*(undefined8 *)((long)puVar10 + 0xf);
  in_stack_00000020 = (undefined7)((ulong)*(undefined8 *)((long)puVar10 + 0xf) >> 8);
  uVar5 = *(undefined1 *)((long)puVar10 + 0x17);
  puVar10[1] = 0;
  puVar10[2] = 0;
  *puVar10 = 0;
  if (*(char *)((long)unaff_x19 + 0x77) < '\0') {
    puVar10 = (undefined8 *)__ZdlPv(unaff_x19[0xc]);
  }
  unaff_x19[0xc] = uVar13;
  unaff_x19[0xd] = CONCAT17(uStack000000000000001f,in_stack_00000018);
  *(ulong *)((long)unaff_x19 + 0x6f) = CONCAT71(in_stack_00000020,uStack000000000000001f);
  *(undefined1 *)((long)unaff_x19 + 0x77) = uVar5;
  if ((long)in_stack_00000010 < 0) {
    puVar10 = (undefined8 *)__ZdlPv(in_stack_00000000);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000028) {
    return puVar10;
  }
  uVar11 = ___stack_chk_fail();
  if ((long)in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    uVar11 = __Unwind_Resume(uVar11);
  }
  auVar15 = __Unwind_Resume(uVar11);
  plVar12 = auVar15._8_8_;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  plStack_50 = (long *)plVar12[3];
  uStack_20 = uVar13;
  uStack_18 = uVar11;
  if (plStack_50 == (long *)0x0) {
    plStack_50 = (long *)0x0;
  }
  else if (plStack_50 == plVar12) {
    plStack_50 = alStack_68;
    (**(code **)(*plVar12 + 0x18))(plVar12,alStack_68);
  }
  else {
    plVar12[3] = 0;
  }
  plStack_30 = (long *)0x0;
  plVar12 = (long *)__Znwm(0x28);
  *plVar12 = (long)&UNK_009b8df8;
  if (plStack_50 == (long *)0x0) {
    plVar12[4] = 0;
  }
  else if (plStack_50 == alStack_68) {
    plVar12[4] = (long)(plVar12 + 1);
    (**(code **)(alStack_68[0] + 0x18))(alStack_68);
  }
  else {
    plVar12[4] = (long)plStack_50;
    plStack_50 = (long *)0x0;
  }
  plStack_30 = plVar12;
  func_0x0006dd48(alStack_48,auVar15._0_8_);
  if (plStack_30 == alStack_48) {
    lVar14 = 4;
    plVar12 = alStack_48;
code_r0x0006af4c:
    (**(code **)(*plVar12 + lVar14 * 8))();
  }
  else if (plStack_30 != (long *)0x0) {
    lVar14 = 5;
    plVar12 = plStack_30;
    goto code_r0x0006af4c;
  }
  if (plStack_50 == alStack_68) {
    lVar14 = 4;
    plVar12 = alStack_68;
code_r0x0006af7c:
    (**(code **)(*plVar12 + lVar14 * 8))();
  }
  else if (plStack_50 != (long *)0x0) {
    lVar14 = 5;
    plVar12 = plStack_50;
    goto code_r0x0006af7c;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return auVar15._0_8_;
  }
  auVar16 = ___stack_chk_fail();
  uVar13 = auVar16._0_8_;
  if (auVar16._8_4_ != 0) {
    uVar13 = func_0x0001753c(uVar13);
    if (plStack_50 == alStack_68) {
      lVar14 = 4;
      plVar12 = alStack_68;
    }
    else {
      if (plStack_50 == (long *)0x0) goto code_r0x0006b000;
      lVar14 = 5;
      plVar12 = plStack_50;
    }
    (**(code **)(*plVar12 + lVar14 * 8))();
  }
code_r0x0006b000:
  puVar10 = (undefined8 *)__Unwind_Resume(uVar13);
  return puVar10;
}

