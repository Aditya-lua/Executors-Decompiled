
ulong * thunk_FUN_00580268(void)

{
  ulong *puVar1;
  code *pcVar2;
  ulong *puVar3;
  ulong uVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  undefined1 uStack0000000000000050;
  
  func_0x0057c5c4(&uStack0000000000000050);
  __Unwind_Resume();
  puVar3 = (ulong *)func_0x007a2668();
  if (puVar3[8] == 0) {
    return (ulong *)0x0;
  }
  puVar3[8] = puVar3[8] - 1;
  if (((int)*puVar3 == 1) && (puVar3[1] == 0)) {
    uVar4 = puVar3[2];
    for (uVar6 = puVar3[3]; uVar6 != 0; uVar6 = uVar6 - 1) {
      uVar4 = *(ulong *)(uVar4 + 0x170);
    }
    *puVar3 = 1;
    puVar3[1] = uVar4;
    puVar3[2] = 0;
    puVar3[3] = 0;
    puVar7 = (ulong *)puVar3[1];
    uVar4 = puVar3[2];
    uVar6 = puVar3[3];
    puVar5 = puVar7;
    if (uVar6 < *(ushort *)((long)puVar7 + 0x16a)) goto LAB_0058032c;
  }
  else {
    if ((*puVar3 & 1) == 0) {
      func_0x007a23bc(&UNK_009f0660);
code_r0x00580394:
      func_0x007a23bc(&UNK_009f0810);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5803a4);
      (*pcVar2)();
    }
    puVar7 = (ulong *)puVar3[1];
    uVar4 = puVar3[2];
    uVar6 = puVar3[3];
    puVar5 = puVar7;
    if (uVar6 < *(ushort *)((long)puVar7 + 0x16a)) goto LAB_0058032c;
  }
  do {
    puVar5 = (ulong *)*puVar7;
    if (puVar5 == (ulong *)0x0) goto code_r0x00580394;
    uVar4 = uVar4 + 1;
    puVar1 = puVar7 + 0x2d;
    uVar6 = (ulong)(ushort)*puVar1;
    puVar7 = puVar5;
  } while (*(ushort *)((long)puVar5 + 0x16a) <= (ushort)*puVar1);
LAB_0058032c:
  uVar8 = uVar6 + 1;
  if (uVar4 == 0) {
    puVar7 = puVar5;
  }
  else {
    puVar7 = puVar5 + uVar8;
    do {
      puVar7 = (ulong *)puVar7[0x2e];
      uVar4 = uVar4 - 1;
    } while (uVar4 != 0);
    uVar8 = 0;
  }
  puVar3[1] = (ulong)puVar7;
  puVar3[2] = 0;
  puVar3[3] = uVar8;
  return puVar5 + uVar6 * 3 + 1;
}

