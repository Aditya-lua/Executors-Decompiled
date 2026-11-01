
void FUN_002cbf5c(ulong param_1,undefined8 param_2,long param_3,undefined8 param_4,
                 undefined1 *param_5)

{
  long in_x9;
  long lVar1;
  undefined1 *puVar2;
  ulong *unaff_x19;
  ulong unaff_x20;
  
  puVar2 = (undefined1 *)(param_3 + unaff_x20);
  lVar1 = in_x9;
  do {
    puVar2 = puVar2 + -1;
    *puVar2 = *param_5;
    lVar1 = lVar1 + -1;
    param_5 = param_5 + 1;
  } while (lVar1 != 0);
  if (param_1 < unaff_x20) {
    _bzero(param_3,unaff_x20 - in_x9);
  }
  *unaff_x19 = unaff_x20;
  return;
}

