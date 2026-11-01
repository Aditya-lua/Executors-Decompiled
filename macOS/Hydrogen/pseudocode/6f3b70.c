
void FUN_006f3b70(long param_1,undefined1 *param_2,long param_3,undefined8 param_4,long *param_5)

{
  char cVar1;
  int iVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  long lVar7;
  ulong unaff_x20;
  long lVar8;
  
  lVar8 = *(long *)(param_1 + 0x18);
  if (param_3 - 1U < 0x400) {
    cVar1 = *(char *)(param_3 + 0xa40300);
    if (cVar1 < 0) goto LAB_006f3be4;
    *param_2 = 0;
    lVar3 = *(long *)(param_1 + 0x18);
    if (param_5[5] == 0) {
      if ((int)param_5[6] < 0) {
        lVar5 = lVar3 + (ulong)(uint)(int)cVar1 * 8;
        plVar6 = *(long **)(lVar5 + 0x1a0);
        param_5[1] = (long)plVar6;
        if (plVar6 != (long *)0x0) {
          *plVar6 = (long)param_5;
        }
        *(long **)(lVar5 + 0x1a0) = param_5;
        *(long *)(param_2 + 8) = param_5[5];
        param_5[5] = (long)param_2;
        iVar2 = *(int *)((long)param_5 + 0x34) + -1;
        *(int *)((long)param_5 + 0x34) = iVar2;
      }
      else {
        *(undefined8 *)(param_2 + 8) = 0;
        param_5[5] = (long)param_2;
        iVar2 = *(int *)((long)param_5 + 0x34) + -1;
        *(int *)((long)param_5 + 0x34) = iVar2;
      }
    }
    else {
      *(long *)(param_2 + 8) = param_5[5];
      param_5[5] = (long)param_2;
      iVar2 = *(int *)((long)param_5 + 0x34) + -1;
      *(int *)((long)param_5 + 0x34) = iVar2;
    }
    if (iVar2 != 0) goto LAB_006f3ce8;
    plVar6 = (long *)param_5[1];
    if (plVar6 != (long *)0x0) {
      *plVar6 = *param_5;
    }
    if (*param_5 == 0) {
      plVar4 = (long *)(lVar3 + 0x1a0 + ((long)cVar1 & 0xffffffffU) * 8);
      if ((long *)*plVar4 == param_5) goto code_r0x006f3bdc;
    }
    else {
      plVar4 = (long *)(*param_5 + 8);
code_r0x006f3bdc:
      *plVar4 = (long)plVar6;
    }
    lVar5 = *(long *)(param_1 + 0x18);
    lVar7 = param_5[3];
    if (lVar7 != 0) {
      *(long *)(lVar7 + 0x10) = param_5[2];
    }
    if (param_5[2] == 0) {
      plVar6 = (long *)(lVar3 + 0x2e8);
      if ((long *)*plVar6 == param_5) goto code_r0x006f3c80;
    }
    else {
      plVar6 = (long *)(param_5[2] + 0x18);
code_r0x006f3c80:
      *plVar6 = lVar7;
    }
  }
  else {
LAB_006f3be4:
    lVar3 = param_5[3];
    if (lVar3 != 0) {
      *(long *)(lVar3 + 0x10) = param_5[2];
    }
    lVar5 = lVar8;
    if (param_5[2] == 0) {
      plVar6 = (long *)(lVar8 + 0x2e8);
      if ((long *)*plVar6 != param_5) goto LAB_006f3cd4;
    }
    else {
      plVar6 = (long *)(param_5[2] + 0x18);
    }
    *plVar6 = lVar3;
  }
LAB_006f3cd4:
  (**(code **)(lVar5 + 0x10))(*(undefined8 *)(lVar5 + 0x18),param_5,(long)(int)param_5[4],0);
LAB_006f3ce8:
  *(long *)(lVar8 + 0x48) = *(long *)(lVar8 + 0x48) - param_3;
  lVar8 = lVar8 + (unaff_x20 & 0xffffffff) * 8;
  *(long *)(lVar8 + 0x560) = *(long *)(lVar8 + 0x560) - param_3;
  return;
}

