
void FUN_0007d180(undefined8 *param_1)

{
  undefined4 uVar1;
  int iVar2;
  long unaff_x19;
  undefined1 unaff_w20;
  
  if ((char *)*param_1 == (char *)0x0) {
    iVar2 = 0x2e;
  }
  else {
    iVar2 = (int)*(char *)*param_1;
  }
  *(int *)(unaff_x19 + 0xb0) = iVar2;
  *(undefined8 *)(unaff_x19 + 0xb8) = 0xffffffffffffffff;
  *(undefined1 *)(unaff_x19 + 0xc0) = unaff_w20;
  uVar1 = func_0x0007d25c();
  *(undefined4 *)(unaff_x19 + 0x20) = uVar1;
  return;
}

