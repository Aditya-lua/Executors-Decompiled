
void FUN_006febbc(long param_1,undefined1 *param_2,long *param_3)

{
  uint uVar1;
  uint uVar2;
  char cVar3;
  byte bVar4;
  int iVar5;
  long lVar6;
  code *pcVar7;
  long lVar8;
  long *plVar9;
  long lVar10;
  long *plVar11;
  long lVar12;
  long lVar13;
  
  bVar4 = param_2[3];
  if ((char)bVar4 < '\0') {
    if ((bVar4 == 0x80) && (*(code **)(param_2 + (long)*(int *)(param_2 + 4) + 8) != (code *)0x0)) {
      (**(code **)(param_2 + (long)*(int *)(param_2 + 4) + 8))();
    }
  }
  else {
    pcVar7 = *(code **)(*(long *)(param_1 + 0x18) + (ulong)bVar4 * 8 + 0xd60);
    if (pcVar7 != (code *)0x0) {
      (*pcVar7)(param_1,param_2 + 0x10);
    }
  }
  uVar2 = *(uint *)(param_2 + 4);
  uVar1 = uVar2 + 0xf & 0xfffffff0;
  if ((int)uVar2 < 0x11) {
    uVar1 = uVar2;
  }
  lVar8 = (long)(int)uVar1;
  bVar4 = param_2[2];
  lVar13 = *(long *)(param_1 + 0x18);
  if (lVar8 + 0xfU < 0x400) {
    cVar3 = *(char *)(lVar8 + 0xa40310);
    if (cVar3 < 0) goto code_r0x006f3be4;
    *param_2 = 0;
    lVar6 = *(long *)(param_1 + 0x18);
    if (param_3[5] == 0) {
      if ((int)param_3[6] < 0) {
        lVar10 = lVar6 + (ulong)(uint)(int)cVar3 * 8;
        plVar11 = *(long **)(lVar10 + 0x1a0);
        param_3[1] = (long)plVar11;
        if (plVar11 != (long *)0x0) {
          *plVar11 = (long)param_3;
        }
        *(long **)(lVar10 + 0x1a0) = param_3;
        *(long *)(param_2 + 8) = param_3[5];
        param_3[5] = (long)param_2;
        iVar5 = *(int *)((long)param_3 + 0x34) + -1;
        *(int *)((long)param_3 + 0x34) = iVar5;
      }
      else {
        *(undefined8 *)(param_2 + 8) = 0;
        param_3[5] = (long)param_2;
        iVar5 = *(int *)((long)param_3 + 0x34) + -1;
        *(int *)((long)param_3 + 0x34) = iVar5;
      }
    }
    else {
      *(long *)(param_2 + 8) = param_3[5];
      param_3[5] = (long)param_2;
      iVar5 = *(int *)((long)param_3 + 0x34) + -1;
      *(int *)((long)param_3 + 0x34) = iVar5;
    }
    if (iVar5 != 0) goto code_r0x006f3ce8;
    plVar11 = (long *)param_3[1];
    if (plVar11 != (long *)0x0) {
      *plVar11 = *param_3;
    }
    if (*param_3 == 0) {
      plVar9 = (long *)(lVar6 + 0x1a0 + ((long)cVar3 & 0xffffffffU) * 8);
      if ((long *)*plVar9 == param_3) goto code_r0x006f3bdc;
    }
    else {
      plVar9 = (long *)(*param_3 + 8);
code_r0x006f3bdc:
      *plVar9 = (long)plVar11;
    }
    lVar10 = *(long *)(param_1 + 0x18);
    lVar12 = param_3[3];
    if (lVar12 != 0) {
      *(long *)(lVar12 + 0x10) = param_3[2];
    }
    if (param_3[2] == 0) {
      plVar11 = (long *)(lVar6 + 0x2e8);
      if ((long *)*plVar11 == param_3) goto code_r0x006f3c80;
    }
    else {
      plVar11 = (long *)(param_3[2] + 0x18);
code_r0x006f3c80:
      *plVar11 = lVar12;
    }
  }
  else {
code_r0x006f3be4:
    lVar6 = param_3[3];
    if (lVar6 != 0) {
      *(long *)(lVar6 + 0x10) = param_3[2];
    }
    lVar10 = lVar13;
    if (param_3[2] == 0) {
      plVar11 = (long *)(lVar13 + 0x2e8);
      if ((long *)*plVar11 != param_3) goto code_r0x006f3cd4;
    }
    else {
      plVar11 = (long *)(param_3[2] + 0x18);
    }
    *plVar11 = lVar6;
  }
code_r0x006f3cd4:
  (**(code **)(lVar10 + 0x10))(*(undefined8 *)(lVar10 + 0x18),param_3,(long)(int)param_3[4],0);
code_r0x006f3ce8:
  *(long *)(lVar13 + 0x48) = *(long *)(lVar13 + 0x48) - (lVar8 + 0x10);
  lVar13 = lVar13 + (ulong)bVar4 * 8;
  *(long *)(lVar13 + 0x560) = *(long *)(lVar13 + 0x560) - (lVar8 + 0x10);
  return;
}

