
undefined8 FUN_006db5e0(void)

{
  long *plVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  
  if ((unaff_x21 == 0 || *(int *)(unaff_x21 + 8) != unaff_w22) || (*(long *)(unaff_x21 + 0x28) != 0)
     ) {
    return 1;
  }
  plVar1 = (long *)func_0x006db828(unaff_x20 + 0x10,*(undefined8 *)(unaff_x19 + 0x20));
  *plVar1 = unaff_x21;
  return 1;
}

