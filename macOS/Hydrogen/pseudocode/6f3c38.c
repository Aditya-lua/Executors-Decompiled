
void FUN_006f3c38(long param_1,long param_2)

{
  int iVar1;
  long *in_x4;
  long *plVar2;
  ulong in_x9;
  long lVar3;
  long *plVar4;
  long lVar5;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  
  iVar1 = *(int *)((long)in_x4 + 0x34) + -1;
  *(int *)((long)in_x4 + 0x34) = iVar1;
  if (iVar1 != 0) goto LAB_006f3ce8;
  plVar4 = (long *)in_x4[1];
  if (plVar4 != (long *)0x0) {
    *plVar4 = *in_x4;
  }
  if (*in_x4 == 0) {
    plVar2 = (long *)(param_1 + 0x1a0 + (in_x9 & 0xffffffff) * 8);
    if ((long *)*plVar2 == in_x4) goto code_r0x006f3bdc;
  }
  else {
    plVar2 = (long *)(*in_x4 + 8);
code_r0x006f3bdc:
    *plVar2 = (long)plVar4;
  }
  lVar3 = *(long *)(param_2 + 0x18);
  lVar5 = in_x4[3];
  if (lVar5 != 0) {
    *(long *)(lVar5 + 0x10) = in_x4[2];
  }
  if (in_x4[2] == 0) {
    plVar4 = (long *)(param_1 + 0x2e8);
    if ((long *)*plVar4 == in_x4) goto code_r0x006f3c80;
  }
  else {
    plVar4 = (long *)(in_x4[2] + 0x18);
code_r0x006f3c80:
    *plVar4 = lVar5;
  }
  (**(code **)(lVar3 + 0x10))(*(undefined8 *)(lVar3 + 0x18),in_x4,(long)(int)in_x4[4],0);
LAB_006f3ce8:
  *(long *)(unaff_x21 + 0x48) = *(long *)(unaff_x21 + 0x48) - unaff_x19;
  lVar3 = unaff_x21 + (unaff_x20 & 0xffffffff) * 8;
  *(long *)(lVar3 + 0x560) = *(long *)(lVar3 + 0x560) - unaff_x19;
  return;
}

