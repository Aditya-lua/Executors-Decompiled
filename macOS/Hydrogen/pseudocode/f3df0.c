
void FUN_000f3df0(long param_1)

{
  long lVar1;
  undefined4 in_w10;
  undefined4 unaff_w19;
  long unaff_x20;
  undefined8 unaff_x26;
  
  *(long *)(unaff_x20 + 0x48) = param_1;
  *(int *)(unaff_x20 + 0x34) = *(int *)(unaff_x20 + 0x34) + 1;
  *(undefined4 *)(param_1 + 4) = in_w10;
  *(undefined8 *)(param_1 + 8) = unaff_x26;
  lVar1 = *(long *)(unaff_x20 + 0x48);
  *(undefined4 *)(lVar1 + 0x10) = unaff_w19;
  *(long *)(unaff_x20 + 0x48) = lVar1 + 0x14;
  *(int *)(unaff_x20 + 0x34) = *(int *)(unaff_x20 + 0x34) + 1;
  return;
}

