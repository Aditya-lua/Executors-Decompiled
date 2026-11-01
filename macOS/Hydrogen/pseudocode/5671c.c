
long * FUN_0005671c(long *param_1)

{
  ulong uVar1;
  long *plVar2;
  int iVar3;
  long *plVar4;
  ulong unaff_x23;
  long *unaff_x27;
  undefined8 *in_stack_00000008;
  
  do {
    while( true ) {
      plVar4 = param_1;
      uVar1 = plVar4[5];
      plVar2 = (long *)plVar4[4];
      if (-1 < (char)*(byte *)((long)plVar4 + 0x37)) {
        uVar1 = (ulong)*(byte *)((long)plVar4 + 0x37);
        plVar2 = plVar4 + 4;
      }
      iVar3 = _memcmp();
      if (iVar3 == 0) break;
      if (-1 < iVar3) goto LAB_00056768;
LAB_00056710:
      param_1 = (long *)*plVar4;
      unaff_x27 = plVar4;
      if ((long *)*plVar4 == (long *)0x0) goto LAB_00056798;
    }
    if (unaff_x23 < uVar1) goto LAB_00056710;
LAB_00056768:
    iVar3 = _memcmp(plVar2);
    if (iVar3 == 0) {
      if (unaff_x23 <= uVar1) break;
    }
    else if (-1 < iVar3) break;
    unaff_x27 = plVar4 + 1;
    param_1 = (long *)*unaff_x27;
  } while ((long *)*unaff_x27 != (long *)0x0);
LAB_00056798:
  *in_stack_00000008 = plVar4;
  return unaff_x27;
}

