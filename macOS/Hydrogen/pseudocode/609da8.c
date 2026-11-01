
long FUN_00609da8(ulong param_1,long param_2)

{
  long lVar1;
  undefined1 in_CY;
  long lVar2;
  uint in_w8;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  while( true ) {
    if ((bool)in_CY) {
      param_2 = param_2 + 1;
    }
    if (in_w8 == 0) break;
    uVar3 = *(ulong *)(unaff_x21 + (ulong)(in_w8 - 1) * 8);
    in_CY = CARRY8(param_1,uVar3);
    param_1 = param_1 + uVar3;
    in_w8 = in_w8 - 1;
  }
  lVar2 = func_0x00479af8(param_1,param_2);
  lVar1 = unaff_x19 - lVar2;
  if (lVar2 == 0 || *(int *)(unaff_x20 + 0x28) != 1) {
    lVar1 = lVar2;
  }
  return lVar1;
}

