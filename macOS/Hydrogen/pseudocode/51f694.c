
void FUN_0051f694(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  code *pcVar6;
  bool in_ZR;
  int iVar7;
  long *plVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined8 unaff_x19;
  undefined8 unaff_x21;
  long lVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  undefined1 auVar16 [16];
  undefined8 *in_stack_00000000;
  undefined8 in_stack_00000028;
  
  if (!in_ZR) {
    func_0x00187bd4(in_stack_00000028,param_2,1);
    *in_stack_00000000 = unaff_x21;
    unaff_x19 = __Unwind_Resume();
  }
  *in_stack_00000000 = unaff_x21;
  auVar16 = __Unwind_Resume(unaff_x19);
  puVar9 = auVar16._8_8_;
  plVar8 = auVar16._0_8_;
  lVar1 = *plVar8;
  lVar4 = plVar8[1];
  plVar2 = (long *)*puVar9;
  lVar12 = puVar9[1];
  if (lVar1 != lVar4) {
    uVar13 = 0;
    lVar14 = puVar9[2];
    lVar15 = plVar8[2];
    do {
      lVar10 = *(long *)(lVar15 + 0x90);
      if (lVar10 == 0) {
LAB_0051f798:
        func_0x007a23d8(&UNK_008a75ee,99,&UNK_009ea3d0);
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x51f7b4);
        (*pcVar6)();
      }
      lVar11 = *(long *)(lVar15 + 0x88);
      puVar9 = (undefined8 *)(lVar1 + uVar13 * 0x10);
      uVar3 = *puVar9;
      lVar5 = puVar9[1];
      lVar10 = lVar10 * 600;
      while ((*(long *)(lVar11 + 0x220) != lVar5 ||
             (iVar7 = _memcmp(*(undefined8 *)(lVar11 + 0x218),uVar3,lVar5), iVar7 != 0))) {
        lVar11 = lVar11 + 600;
        lVar10 = lVar10 + -600;
        if (lVar10 == 0) goto LAB_0051f798;
      }
      *(long *)(lVar14 + lVar12 * 8) = lVar11;
      lVar12 = lVar12 + 1;
      uVar13 = uVar13 + 1;
    } while (uVar13 != (ulong)(lVar4 - lVar1) >> 4);
  }
  *plVar2 = lVar12;
  return;
}

