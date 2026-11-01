
void FUN_004140e0(undefined8 param_1,long param_2,long param_3)

{
  ulong uVar1;
  bool bVar2;
  ulong uVar3;
  long lVar4;
  code *pcVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  long *unaff_x19;
  ulong *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x25;
  ulong uVar9;
  long unaff_x27;
  undefined1 auVar10 [16];
  undefined8 in_stack_00000008;
  long *in_stack_00000010;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  
code_r0x004140e0:
  if (param_3 != unaff_x27) goto LAB_004140d0;
LAB_004140a0:
  do {
    lVar4 = uStack0000000000000028;
    unaff_x19 = unaff_x19 + 1;
    unaff_x23 = *unaff_x19;
    if (unaff_x23 == 0) {
      uVar7 = *unaff_x20;
      goto code_r0x00414214;
    }
    unaff_x25 = _strlen(unaff_x23);
  } while (unaff_x25 == 0);
  param_3 = unaff_x25 - 1;
  param_2 = unaff_x23 + 1;
  if (unaff_x25 < 0x11) {
    if (param_3 == 0) goto LAB_004140a0;
    unaff_x27 = 0;
LAB_004140d0:
    if (*(char *)(param_2 + unaff_x27) != '=') goto code_r0x004140dc;
  }
  else {
    auVar10 = func_0x0046b0fc(0x3d);
    unaff_x27 = auVar10._8_8_;
    if ((auVar10._0_8_ & 1) == 0) goto LAB_004140a0;
  }
  uVar7 = unaff_x27 + 1;
  if (unaff_x25 < uVar7) {
    func_0x007a28b0(uVar7,unaff_x25,&UNK_009db708);
    goto code_r0x004142d4;
  }
  if ((long)uVar7 < 0) {
    in_stack_00000008 = 0;
code_r0x004142a4:
    func_0x007a1f00(in_stack_00000008,uVar7,&UNK_009d9be8);
    goto code_r0x004142d4;
  }
  if (uVar7 == 0) {
    uVar6 = 1;
  }
  else {
    uVar6 = func_0x00187bd0(uVar7,1);
    if (uVar6 == 0) goto code_r0x004142a4;
  }
  _memcpy(uVar6,unaff_x23,uVar7);
  uVar1 = unaff_x27 + 2;
  if (unaff_x25 <= uVar7) {
    func_0x007a28a4(uVar1,unaff_x25,&UNK_009db720);
    goto code_r0x004142d4;
  }
  uVar3 = unaff_x25 - uVar1;
  if ((long)uVar3 < 0) {
    in_stack_00000008 = 0;
code_r0x004142c0:
    func_0x007a1f00(in_stack_00000008,uVar3,&UNK_009d9be8);
code_r0x004142d4:
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x4142d8);
    (*pcVar5)();
  }
  if (unaff_x25 == uVar1) {
    uVar9 = 1;
  }
  else {
    uVar9 = func_0x00187bd0(uVar3,1);
    if (uVar9 == 0) goto code_r0x004142c0;
  }
  _memcpy(uVar9,unaff_x23 + uVar1,uVar3);
  in_stack_00000040 = uVar7;
  in_stack_00000048 = uVar6;
  in_stack_00000050 = uVar7;
  in_stack_00000058 = uVar3;
  in_stack_00000060 = uVar9;
  in_stack_00000068 = uVar3;
  if (unaff_x21 == uStack0000000000000028) {
    func_0x00404378(&uStack0000000000000028,&UNK_009db6f0);
    unaff_x22 = in_stack_00000030;
  }
  puVar8 = (ulong *)(unaff_x22 + unaff_x21 * 0x30);
  puVar8[3] = in_stack_00000058;
  puVar8[2] = in_stack_00000050;
  puVar8[5] = in_stack_00000068;
  puVar8[4] = in_stack_00000060;
  puVar8[1] = in_stack_00000048;
  *puVar8 = in_stack_00000040;
  unaff_x21 = unaff_x21 + 1;
  in_stack_00000038 = unaff_x21;
  goto LAB_004140a0;
code_r0x00414214:
  if (((uint)uVar7 >> 1 & 1) == 0) {
    uVar6 = 0;
    if (uVar7 - 0x11 != 0) {
      uVar6 = uVar7 - 0x11 | 1;
    }
    bVar2 = *unaff_x20 == uVar7;
    uVar7 = *unaff_x20;
    if (bVar2) {
      *unaff_x20 = uVar6;
      goto code_r0x00414234;
    }
    goto code_r0x00414214;
  }
  if (((uint)uVar7 >> 3 & 1) == 0) {
    func_0x007a1a98();
    goto code_r0x00414234;
  }
  uVar6 = uVar7 & 0xfffffffffffffff6;
  bVar2 = *unaff_x20 == uVar7;
  uVar7 = *unaff_x20;
  if (bVar2) {
    *unaff_x20 = uVar6;
code_r0x00414234:
    *in_stack_00000010 = unaff_x22;
    in_stack_00000010[1] = unaff_x22;
    in_stack_00000010[2] = lVar4;
    in_stack_00000010[3] = unaff_x22 + unaff_x21 * 0x30;
    return;
  }
  goto code_r0x00414214;
code_r0x004140dc:
  unaff_x27 = unaff_x27 + 1;
  goto code_r0x004140e0;
}

