
void FUN_006ef9c0(long *param_1,undefined8 param_2,long param_3)

{
  ulong unaff_x19;
  long unaff_x20;
  long lVar1;
  
  while( true ) {
    lVar1 = **(long **)(param_3 + 8);
    param_1[1] = (*(long **)(param_3 + 8))[1];
    *param_1 = lVar1;
    *(long **)(param_3 + 8) = param_1;
    func_0x006f0ef4();
    param_3 = *(long *)(unaff_x20 + 0x60);
    if ((param_3 == 0) || (*(ulong *)(param_3 + 8) < unaff_x19)) break;
    *(undefined8 *)(unaff_x20 + 0x60) = *(undefined8 *)(param_3 + 0x20);
    param_1 = (long *)(param_3 + 0x10);
    *(long *)(*(long *)(param_3 + 0x18) + 0x10) = *param_1;
    *(undefined8 *)(*param_1 + 0x18) = *(undefined8 *)(param_3 + 0x18);
  }
  return;
}

