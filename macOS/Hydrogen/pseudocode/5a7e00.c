
void FUN_005a7e00(void)

{
  ushort uVar1;
  ulong uVar2;
  char cVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *extraout_x8;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  ulong uVar9;
  long lVar10;
  undefined1 auVar11 [16];
  undefined1 uStack0000000000000060;
  
  func_0x005a6800(&uStack0000000000000060);
  uVar5 = 8;
  func_0x00187bd4();
  __Unwind_Resume();
  auVar11 = func_0x007a2668();
  uVar8 = 1;
  while( true ) {
    lVar6 = auVar11._8_8_;
    lVar7 = auVar11._0_8_;
    uVar1 = *(ushort *)(lVar7 + 0x21a);
    lVar10 = (ulong)uVar1 * 0x30;
    uVar9 = 0xffffffffffffffff;
    lVar4 = lVar7;
    do {
      uVar2 = (ulong)uVar1;
      if (lVar10 == 0) goto joined_r0x005a7ea0;
      cVar3 = func_0x005a86f4(uVar5,lVar4);
      lVar10 = lVar10 + -0x30;
      uVar9 = uVar9 + 1;
      lVar4 = lVar4 + 0x30;
    } while (cVar3 == '\x01');
    uVar2 = uVar9;
    if (cVar3 == '\0') break;
joined_r0x005a7ea0:
    uVar9 = uVar2;
    if (lVar6 == 0) goto code_r0x005a7eb8;
    auVar11._8_8_ = lVar6 + -1;
    auVar11._0_8_ = *(undefined8 *)(lVar7 + uVar9 * 8 + 0x220);
  }
  uVar8 = 0;
code_r0x005a7eb8:
  extraout_x8[2] = lVar6;
  extraout_x8[3] = uVar9;
  *extraout_x8 = uVar8;
  extraout_x8[1] = lVar7;
  return;
}

