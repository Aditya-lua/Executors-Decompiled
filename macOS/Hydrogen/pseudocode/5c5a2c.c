
long FUN_005c5a2c(undefined8 param_1)

{
  ushort *puVar1;
  code *pcVar2;
  ulong *puVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 uStack000000000000000f;
  
  func_0x007a200c(&uStack000000000000000f);
  __Unwind_Resume(param_1);
  puVar3 = (ulong *)func_0x007a2668();
  if (puVar3[8] == 0) {
    return 0;
  }
  puVar3[8] = puVar3[8] - 1;
  if (((int)*puVar3 == 1) && (puVar3[1] == 0)) {
    uVar4 = puVar3[2];
    for (uVar8 = puVar3[3]; uVar8 != 0; uVar8 = uVar8 - 1) {
      uVar4 = *(ulong *)(uVar4 + 0x220);
    }
    *puVar3 = 1;
    puVar3[1] = uVar4;
    puVar3[2] = 0;
    puVar3[3] = 0;
    uVar8 = puVar3[1];
    uVar4 = puVar3[2];
    uVar6 = puVar3[3];
    uVar5 = uVar8;
    if (uVar6 < *(ushort *)(uVar8 + 0x21a)) goto LAB_005c5af4;
  }
  else {
    if ((*puVar3 & 1) == 0) {
      func_0x007a23bc(&UNK_009f26e8);
LAB_005c5b54:
      func_0x007a23bc(&UNK_009f2798);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5c5b64);
      (*pcVar2)();
    }
    uVar8 = puVar3[1];
    uVar4 = puVar3[2];
    uVar6 = puVar3[3];
    uVar5 = uVar8;
    if (uVar6 < *(ushort *)(uVar8 + 0x21a)) goto LAB_005c5af4;
  }
  do {
    uVar5 = *(ulong *)(uVar8 + 0x210);
    if (uVar5 == 0) goto LAB_005c5b54;
    uVar4 = uVar4 + 1;
    puVar1 = (ushort *)(uVar8 + 0x218);
    uVar6 = (ulong)*puVar1;
    uVar8 = uVar5;
  } while (*(ushort *)(uVar5 + 0x21a) <= *puVar1);
LAB_005c5af4:
  uVar8 = uVar6 + 1;
  if (uVar4 == 0) {
    uVar7 = uVar5;
  }
  else {
    uVar7 = uVar5 + uVar8 * 8;
    do {
      uVar7 = *(ulong *)(uVar7 + 0x220);
      uVar4 = uVar4 - 1;
    } while (uVar4 != 0);
    uVar8 = 0;
  }
  puVar3[1] = uVar7;
  puVar3[2] = 0;
  puVar3[3] = uVar8;
  return uVar5 + uVar6 * 0x30;
}

