
long * FUN_006f3e54(long *param_1,long param_2)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  long *plVar5;
  long *plVar6;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long *plVar7;
  undefined8 *unaff_x24;
  long unaff_x25;
  uint unaff_w26;
  
  *(long *)(param_2 + 0x28) = *param_1;
  *(int *)(param_2 + 0x34) = *(int *)(param_2 + 0x34) + 1;
  *param_1 = param_2;
  if (*(long *)(param_2 + 0x28) == 0) {
    *unaff_x24 = *(undefined8 *)(param_2 + 8);
    if (*(undefined8 **)(param_2 + 8) != (undefined8 *)0x0) {
      **(undefined8 **)(param_2 + 8) = 0;
    }
    *(undefined8 *)(param_2 + 8) = 0;
  }
  if ((unaff_x21 != 0) && (unaff_x20 != 0)) {
    _memcpy(param_1 + 1);
  }
  if ((int)unaff_w26 < 0) {
    (**(code **)(unaff_x25 + 0x10))(*(undefined8 *)(unaff_x25 + 0x18));
    goto LAB_006f3f94;
  }
  lVar3 = *(long *)(unaff_x19 + 0x18);
  plVar7 = (long *)(unaff_x23 + -8);
  plVar2 = (long *)*plVar7;
  lVar4 = plVar2[5];
  if (lVar4 == 0) {
    if (-1 < (int)plVar2[6]) {
      lVar4 = 0;
      goto LAB_006f3ee0;
    }
    plVar5 = (long *)(lVar3 + (ulong)unaff_w26 * 8 + 0x60);
    plVar6 = (long *)*plVar5;
    plVar2[1] = (long)plVar6;
    if (plVar6 != (long *)0x0) {
      *plVar6 = (long)plVar2;
    }
    *plVar5 = (long)plVar2;
    *plVar7 = plVar2[5];
    plVar2[5] = (long)plVar7;
    iVar1 = *(int *)((long)plVar2 + 0x34) + -1;
    *(int *)((long)plVar2 + 0x34) = iVar1;
  }
  else {
LAB_006f3ee0:
    *plVar7 = lVar4;
    plVar2[5] = (long)plVar7;
    iVar1 = *(int *)((long)plVar2 + 0x34) + -1;
    *(int *)((long)plVar2 + 0x34) = iVar1;
  }
  if (iVar1 != 0) goto LAB_006f3f94;
  plVar7 = (long *)plVar2[1];
  if (plVar7 != (long *)0x0) {
    *plVar7 = *plVar2;
  }
  if (*plVar2 == 0) {
    plVar5 = (long *)(lVar3 + 0x60 + (ulong)unaff_w26 * 8);
    if ((long *)*plVar5 == plVar2) goto code_r0x006f3f14;
  }
  else {
    plVar5 = (long *)(*plVar2 + 8);
code_r0x006f3f14:
    *plVar5 = (long)plVar7;
  }
  (**(code **)(*(long *)(unaff_x19 + 0x18) + 0x10))
            (*(undefined8 *)(*(long *)(unaff_x19 + 0x18) + 0x18),plVar2,(long)(int)plVar2[4],0);
LAB_006f3f94:
  *(long *)(unaff_x25 + 0x48) = (unaff_x20 - unaff_x21) + *(long *)(unaff_x25 + 0x48);
  lVar3 = unaff_x25 + (unaff_x22 & 0xffffffff) * 8;
  *(long *)(lVar3 + 0x560) = (unaff_x20 - unaff_x21) + *(long *)(lVar3 + 0x560);
  if (*(code **)(unaff_x25 + 0x520) != (code *)0x0) {
    (**(code **)(unaff_x25 + 0x520))();
  }
  return param_1 + 1;
}

