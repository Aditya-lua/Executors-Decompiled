
void FUN_0066ad24(long param_1)

{
  undefined4 uVar1;
  long *plVar2;
  long lVar3;
  undefined4 unaff_w23;
  long unaff_x24;
  
  plVar2 = (long *)(**(code **)(param_1 + 0x160))();
  lVar3 = (**(code **)(*plVar2 + 0x138))();
  uVar1 = 0;
  if (lVar3 != 0) {
    uVar1 = unaff_w23;
  }
  *(undefined4 *)(unaff_x24 + 0x28) = uVar1;
  return;
}

