
long FUN_006f9f58(void)

{
  long lVar1;
  int *unaff_x19;
  long unaff_x25;
  
  do {
    lVar1 = func_0x006f9748();
    unaff_x25 = unaff_x25 + -1;
    if (lVar1 != 0) goto LAB_006f9fb4;
  } while (-1 < unaff_x25);
  lVar1 = 0;
LAB_006f9fb4:
  *unaff_x19 = *unaff_x19 + 1;
  return lVar1;
}

