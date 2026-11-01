
void FUN_00740b5c(long param_1)

{
  ulong uVar1;
  long *unaff_x19;
  ulong unaff_x20;
  undefined8 *unaff_x21;
  
  while( true ) {
    (*(code *)*unaff_x21)(*(undefined8 *)(param_1 + unaff_x20 * 8));
    uVar1 = unaff_x19[1];
    *(undefined8 *)(*unaff_x19 + unaff_x20 * 8) = 0;
    unaff_x20 = unaff_x20 + 1;
    if (uVar1 <= unaff_x20) break;
    param_1 = *unaff_x19;
  }
  unaff_x19[4] = 0;
  unaff_x19[1] = 0;
  return;
}

