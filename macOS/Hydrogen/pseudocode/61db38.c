
void FUN_0061db38(code *param_1)

{
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long lVar1;
  long unaff_x22;
  long unaff_x23;
  
  (*param_1)();
  lVar1 = unaff_x21 - unaff_x22 * unaff_x23;
  if (lVar1 == 0) {
    *(undefined8 *)(unaff_x19 + 0x80) = 0;
    return;
  }
  (**(code **)(*unaff_x20 + 0x30))();
  *(ulong *)(unaff_x19 + 0x80) = (ulong)(uint)((int)unaff_x23 - (int)lVar1);
  return;
}

