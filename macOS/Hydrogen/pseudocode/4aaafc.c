
void FUN_004aaafc(undefined4 *param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  undefined4 *unaff_x21;
  ulong uVar2;
  
  if (unaff_x21 != param_1) {
    lVar1 = *(long *)(param_2 + 0x10);
    uVar2 = (ulong)((long)param_1 - (long)unaff_x21) >> 2;
    do {
      func_0x0049e6ac(param_3,*unaff_x21,lVar1);
      lVar1 = lVar1 + 1;
      uVar2 = uVar2 - 1;
      unaff_x21 = unaff_x21 + 1;
    } while (uVar2 != 0);
  }
  return;
}

