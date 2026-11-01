
void FUN_0013b4e0(void)

{
  long *plVar1;
  long *unaff_x19;
  long *plVar2;
  long unaff_x20;
  long *unaff_x22;
  undefined8 in_stack_00000020;
  
  *(undefined8 *)(unaff_x20 + 0x10) = in_stack_00000020;
  plVar1 = unaff_x19;
  while (plVar2 = unaff_x19, unaff_x19 != unaff_x22) {
    while( true ) {
      unaff_x19 = plVar2 + -3;
      plVar1 = unaff_x22;
      if (*unaff_x19 != 0) break;
      plVar2 = unaff_x19;
      if (unaff_x19 == unaff_x22) goto joined_r0x0013b544;
    }
    plVar2[-2] = *unaff_x19;
    __ZdlPv();
  }
joined_r0x0013b544:
  if (plVar1 != (long *)0x0) {
    __ZdlPv(plVar1);
  }
  return;
}

