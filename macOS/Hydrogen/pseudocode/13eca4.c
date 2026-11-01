
void FUN_0013eca4(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  int aiStack_50 [2];
  undefined8 uStack_48;
  
  lVar8 = __Unwind_Resume();
  uStack_48 = 0;
  aiStack_50[0] = (int)((ulong)(*(long *)(lVar8 + 0x10) - *(long *)(lVar8 + 8)) >> 3) * -0x55555555;
  aiStack_50[1] = 0;
  iVar1 = *(int *)(lVar8 + 0x20);
  iVar3 = *(int *)(lVar8 + 0x24);
  iVar2 = *(int *)(lVar8 + 0x28);
  iVar4 = *(int *)(lVar8 + 0x2c);
  uVar9 = func_0x00137dcc(lVar8,&uStack_48);
  *(undefined8 *)(lVar8 + 0x20) = uVar9;
  uVar10 = func_0x00137dcc(lVar8,aiStack_50);
  *(undefined8 *)(lVar8 + 0x28) = uVar10;
  iVar12 = (int)((ulong)uVar9 >> 0x20);
  iVar11 = (int)((ulong)uVar10 >> 0x20);
  iVar7 = (int)uVar10;
  iVar13 = (int)uVar9;
  iVar6 = iVar12;
  if (iVar13 == iVar7) {
    uVar5 = uVar9;
    if (iVar12 <= iVar11) goto joined_r0x0013ed64;
  }
  else {
    uVar5 = uVar10;
    if (iVar13 <= iVar7) goto joined_r0x0013ed64;
  }
  *(undefined8 *)(lVar8 + 0x20) = uVar10;
  *(undefined8 *)(lVar8 + 0x28) = uVar9;
  uVar5 = uVar9;
  iVar6 = iVar11;
  iVar11 = iVar12;
  iVar13 = iVar7;
joined_r0x0013ed64:
  if ((((iVar13 == iVar1) && (iVar6 == iVar3)) && ((int)uVar5 == iVar2)) && (iVar11 == iVar4)) {
    return;
  }
  *(undefined1 *)(lVar8 + 0x68) = 1;
  return;
}

