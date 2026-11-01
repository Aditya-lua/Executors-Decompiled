
void FUN_0055cd78(undefined8 param_1,undefined8 param_2)

{
  ushort uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long *plVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  ulong unaff_x22;
  undefined8 uVar9;
  long lVar10;
  ulong uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined1 auVar14 [16];
  
  func_0x00187bd4(param_1,param_2,8);
  auVar14 = __Unwind_Resume();
  plVar5 = auVar14._8_8_;
  puVar3 = auVar14._0_8_;
  puVar4 = (undefined8 *)func_0x00187bd0(0x170,8);
  if (puVar4 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x170);
  }
  else {
    *puVar4 = 0;
    lVar10 = *plVar5;
    uVar11 = plVar5[2];
    uVar1 = *(ushort *)(lVar10 + 0x16a);
    unaff_x22 = (ulong)uVar1 + ~uVar11;
    *(short *)((long)puVar4 + 0x16a) = (short)unaff_x22;
    puVar7 = (undefined8 *)(lVar10 + 8 + uVar11 * 0x18);
    uVar13 = puVar7[1];
    uVar12 = *puVar7;
    uVar8 = puVar7[2];
    uVar9 = *(undefined8 *)(lVar10 + 0x110 + uVar11 * 8);
    if (unaff_x22 < 0xc) {
      lVar6 = uVar11 + 1;
      if ((ulong)uVar1 - lVar6 == unaff_x22) {
        _memcpy(puVar4 + 1,lVar10 + 8 + lVar6 * 0x18,unaff_x22 * 0x18);
        _memcpy(puVar4 + 0x22,lVar10 + 0x110 + lVar6 * 8,unaff_x22 * 8);
        *(short *)(lVar10 + 0x16a) = (short)uVar11;
        puVar3[1] = uVar13;
        *puVar3 = uVar12;
        lVar6 = plVar5[1];
        puVar3[4] = lVar10;
        puVar3[5] = lVar6;
        puVar3[2] = uVar8;
        puVar3[3] = uVar9;
        puVar3[6] = puVar4;
        puVar3[7] = 0;
        return;
      }
      func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
      goto LAB_0055cecc;
    }
  }
  func_0x007a28b0(unaff_x22,0xb,&UNK_009ee0d8);
LAB_0055cecc:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x55ced0);
  (*pcVar2)();
}

