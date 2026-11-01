
void FUN_004f34f4(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  ushort uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  long *extraout_x8;
  ulong uVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined1 auVar11 [16];
  
  auVar11 = __Unwind_Resume();
  puVar4 = auVar11._8_8_;
  lVar6 = *auVar11._0_8_;
  uVar2 = *(ushort *)(lVar6 + 0x1c2);
  uVar5 = (ulong)uVar2;
  if (10 < uVar2) {
    func_0x007a247c(&UNK_008a3b7e,0x20,&UNK_009e8358);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x4f3568);
    (*pcVar3)();
  }
  *(ushort *)(lVar6 + 0x1c2) = uVar2 + 1;
  puVar1 = (undefined8 *)(lVar6 + uVar5 * 0x20);
  uVar8 = *puVar4;
  uVar10 = puVar4[3];
  uVar9 = puVar4[2];
  puVar1[1] = puVar4[1];
  *puVar1 = uVar8;
  puVar1[3] = uVar10;
  puVar1[2] = uVar9;
  *(undefined8 *)(lVar6 + uVar5 * 8 + 0x168) = param_3;
  lVar7 = auVar11._0_8_[1];
  *extraout_x8 = lVar6;
  extraout_x8[1] = lVar7;
  extraout_x8[2] = uVar5;
  return;
}

