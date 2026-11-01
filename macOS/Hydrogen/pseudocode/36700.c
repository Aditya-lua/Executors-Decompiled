
void FUN_00036700(long param_1,undefined8 *param_2)

{
  bool in_ZR;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 uVar1;
  
  if (!in_ZR) {
    do {
      uVar1 = *unaff_x21;
      param_2[1] = unaff_x21[1];
      *param_2 = uVar1;
      *(undefined1 *)(param_2 + 2) = *(undefined1 *)(unaff_x21 + 2);
      param_1 = param_1 + 0x18;
      unaff_x21 = unaff_x21 + 3;
      param_2 = param_2 + 3;
    } while (unaff_x21 != unaff_x20);
  }
  *unaff_x19 = param_1;
  return;
}

