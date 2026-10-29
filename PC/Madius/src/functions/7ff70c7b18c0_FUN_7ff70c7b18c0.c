/* 7ff70c7b18c0 FUN_7ff70c7b18c0 */

/* WARNING: Instruction at (ram,0x7ff70c7b1920) overlaps instruction at (ram,0x7ff70c7b191c)
    */

bool FUN_7ff70c7b18c0(undefined8 param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined1 uVar1;
  int iVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined1 *puVar5;
  uint unaff_EDI;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  code *unaff_R14;
  undefined8 *puVar9;
  bool bVar10;
  undefined8 auStack_78 [2];
  undefined1 auStack_68 [24];
  longlong alStack_50 [2];
  
  puVar9 = param_3;
  if (0xf < (ulonglong)param_3[3]) {
    puVar9 = (undefined8 *)*param_3;
  }
  lVar8 = param_3[2];
  lVar7 = param_2[2];
  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  bVar10 = lVar8 != 0;
  puVar4 = param_2;
  puVar5 = auStack_68;
  if (lVar7 == 0 || !bVar10) {
LAB_7ff70c7b1956:
    bVar10 = (bool)(puVar4 == (undefined8 *)((longlong)param_2 + lVar7) & bVar10);
  }
  else {
    while( true ) {
      lVar8 = lVar8 + -1;
      *(longlong *)(puVar5 + 0x20) = lVar7;
      *(undefined8 **)(puVar5 + -8) = param_2;
      *(undefined8 *)(puVar5 + -0x10) = 0x7ff70c7b191c;
      lVar6 = lVar7;
      func_0x7ff70cc56700();
      uVar1 = *(undefined1 *)param_2;
      *(undefined8 *)(puVar5 + -0x10) = 0x7ff70c7b192c;
      iVar2 = (*unaff_R14)(uVar1);
      *(undefined8 *)(puVar5 + -0x10) = 0x7ff70c7b1933;
      iVar3 = (*unaff_R14)(unaff_EDI);
      if (iVar3 != iVar2) break;
      bVar10 = lVar8 != 0;
      if ((lVar7 == 1) || (lVar8 == 0)) {
        puVar4 = (undefined8 *)((longlong)param_2 + 1);
        lVar7 = *(longlong *)(puVar5 + 0x18);
        goto LAB_7ff70c7b1956;
      }
      unaff_EDI = (uint)*(byte *)((longlong)puVar9 + 1);
      puVar5 = puVar5 + -8;
      lVar7 = lVar6;
    }
    bVar10 = iVar2 < iVar3;
  }
  return bVar10;
}


