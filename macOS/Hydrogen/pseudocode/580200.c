
ulong * FUN_00580200(void)

{
  ulong *puVar1;
  code *pcVar2;
  undefined8 uVar3;
  ulong *puVar4;
  ulong uVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong *puVar8;
  ulong uVar9;
  undefined8 *unaff_x21;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  unaff_x21[1] = in_stack_00000020;
  *unaff_x21 = in_stack_00000018;
  unaff_x21[3] = in_stack_00000030;
  unaff_x21[2] = in_stack_00000028;
  unaff_x21[5] = in_stack_00000040;
  unaff_x21[4] = in_stack_00000038;
  unaff_x21[6] = in_stack_00000048;
  uVar3 = __Unwind_Resume();
  func_0x0057c5c4(&uStack0000000000000050);
  __Unwind_Resume(uVar3);
  puVar4 = (ulong *)func_0x007a2668();
  if (puVar4[8] == 0) {
    return (ulong *)0x0;
  }
  puVar4[8] = puVar4[8] - 1;
  if (((int)*puVar4 == 1) && (puVar4[1] == 0)) {
    uVar5 = puVar4[2];
    for (uVar7 = puVar4[3]; uVar7 != 0; uVar7 = uVar7 - 1) {
      uVar5 = *(ulong *)(uVar5 + 0x170);
    }
    *puVar4 = 1;
    puVar4[1] = uVar5;
    puVar4[2] = 0;
    puVar4[3] = 0;
    puVar8 = (ulong *)puVar4[1];
    uVar5 = puVar4[2];
    uVar7 = puVar4[3];
    puVar6 = puVar8;
    if (uVar7 < *(ushort *)((long)puVar8 + 0x16a)) goto LAB_0058032c;
  }
  else {
    if ((*puVar4 & 1) == 0) {
      func_0x007a23bc(&UNK_009f0660);
code_r0x00580394:
      func_0x007a23bc(&UNK_009f0810);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5803a4);
      (*pcVar2)();
    }
    puVar8 = (ulong *)puVar4[1];
    uVar5 = puVar4[2];
    uVar7 = puVar4[3];
    puVar6 = puVar8;
    if (uVar7 < *(ushort *)((long)puVar8 + 0x16a)) goto LAB_0058032c;
  }
  do {
    puVar6 = (ulong *)*puVar8;
    if (puVar6 == (ulong *)0x0) goto code_r0x00580394;
    uVar5 = uVar5 + 1;
    puVar1 = puVar8 + 0x2d;
    uVar7 = (ulong)(ushort)*puVar1;
    puVar8 = puVar6;
  } while (*(ushort *)((long)puVar6 + 0x16a) <= (ushort)*puVar1);
LAB_0058032c:
  uVar9 = uVar7 + 1;
  if (uVar5 == 0) {
    puVar8 = puVar6;
  }
  else {
    puVar8 = puVar6 + uVar9;
    do {
      puVar8 = (ulong *)puVar8[0x2e];
      uVar5 = uVar5 - 1;
    } while (uVar5 != 0);
    uVar9 = 0;
  }
  puVar4[1] = (ulong)puVar8;
  puVar4[2] = 0;
  puVar4[3] = uVar9;
  return puVar6 + uVar7 * 3 + 1;
}

