
void FUN_0053776c(long param_1)

{
  long lVar1;
  undefined1 auVar2 [16];
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  code *pcVar6;
  dword *pdVar7;
  ulong *unaff_x19;
  undefined8 *unaff_x20;
  ulong uVar8;
  undefined8 unaff_x21;
  undefined8 *puVar9;
  undefined8 unaff_x22;
  long lVar10;
  undefined8 unaff_x25;
  ulong uVar11;
  undefined8 unaff_x27;
  undefined8 uStack0000000000000008;
  dword *in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  
  uVar8 = param_1 + 1;
  if (param_1 == -1) {
    uVar8 = 0xffffffffffffffff;
  }
  if (uVar8 < 5) {
    uVar8 = 4;
  }
  uVar11 = uVar8 * 0x18;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = uVar8;
  if ((SUB168(auVar2 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar11)) {
LAB_0053793c:
    func_0x007a1f00(unaff_x25,uVar11);
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x537950);
    (*pcVar6)();
  }
  if (uVar11 == 0) {
    uVar8 = 0;
    pdVar7 = &MACH_HEADER.cpusubtype;
  }
  else {
    unaff_x25 = 8;
    pdVar7 = (dword *)func_0x00187bd0(uVar11,8);
    if (pdVar7 == (dword *)0x0) goto LAB_0053793c;
  }
  lVar10 = 0;
  *(undefined8 *)pdVar7 = unaff_x21;
  *(undefined8 *)(pdVar7 + 2) = unaff_x22;
  *(undefined8 *)(pdVar7 + 4) = unaff_x27;
  in_stack_00000018 = 1;
  in_stack_00000028 = unaff_x20[1];
  uStack0000000000000020 = *unaff_x20;
  in_stack_00000038 = unaff_x20[3];
  in_stack_00000030 = unaff_x20[2];
  uStack0000000000000008 = uVar8;
  in_stack_00000010 = pdVar7;
  while( true ) {
    uVar8 = in_stack_00000018;
    func_0x00415368(&uStack0000000000000048,&uStack0000000000000020);
    uVar5 = in_stack_00000058;
    uVar4 = in_stack_00000050;
    lVar3 = uStack0000000000000048;
    if (uStack0000000000000048 == -0x8000000000000000) break;
    if (uVar8 == uStack0000000000000008) {
      func_0x004153b0(&uStack0000000000000048,&uStack0000000000000020);
      lVar1 = uStack0000000000000048 + 1;
      if (uStack0000000000000048 == -1) {
        lVar1 = -1;
      }
      func_0x007a5e98(&uStack0000000000000008,uVar8,lVar1);
      pdVar7 = in_stack_00000010;
    }
    *(long *)((long)pdVar7 + lVar10 + 0x18) = lVar3;
    *(undefined8 *)((long)pdVar7 + lVar10 + 0x20) = uVar4;
    *(undefined8 *)((long)pdVar7 + lVar10 + 0x28) = uVar5;
    in_stack_00000018 = uVar8 + 1;
    lVar10 = lVar10 + 0x18;
  }
  if (in_stack_00000038 - in_stack_00000028 != 0) {
    uVar8 = (ulong)(in_stack_00000038 - in_stack_00000028) / 0x18;
    puVar9 = (undefined8 *)(in_stack_00000028 + 8);
    do {
      if (puVar9[-1] != 0) {
        func_0x00187bd4(*puVar9,puVar9[-1],1);
      }
      puVar9 = puVar9 + 3;
      uVar8 = uVar8 - 1;
    } while (uVar8 != 0);
  }
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(uStack0000000000000020,in_stack_00000030 * 0x18,8);
  }
  unaff_x19[1] = (ulong)in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

