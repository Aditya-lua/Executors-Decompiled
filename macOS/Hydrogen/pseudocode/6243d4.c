
long FUN_006243d4(long *param_1)

{
  int iVar1;
  long *plVar2;
  long unaff_x19;
  
  plVar2 = (long *)(**(code **)(*param_1 + 0xc0))();
  iVar1 = (**(code **)(*plVar2 + 0x10))();
  if (iVar1 == 0) {
    return *(long *)(unaff_x19 + 200);
  }
  return unaff_x19 + 0x60;
}

