
undefined8 FUN_0041d690(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  
  uVar2 = func_0x0041db88();
  iVar1 = *(int *)(unaff_x19 + 2);
  *(int *)(unaff_x19 + 2) = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    unaff_x19[1] = 0;
    _pthread_mutex_unlock(*unaff_x19);
  }
  return uVar2;
}

