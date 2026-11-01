
void FUN_00730bd4(void)

{
  long *plVar1;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long *unaff_x22;
  
  while ((*(code *)*unaff_x21)(unaff_x20), unaff_x22 != (long *)0x0) {
    plVar1 = (long *)unaff_x22[1];
    unaff_x22[1] = 0;
    (**(code **)(*unaff_x22 + 0x10))(unaff_x22);
    unaff_x20 = unaff_x22;
    unaff_x22 = plVar1;
  }
  return;
}

