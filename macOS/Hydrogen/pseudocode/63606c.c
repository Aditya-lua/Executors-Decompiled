
void FUN_0063606c(void)

{
  undefined8 *unaff_x19;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  undefined8 *puVar1;
  undefined8 *puVar2;
  
  puVar1 = (undefined8 *)(unaff_x23 + -0x50);
  *puVar1 = unaff_x22;
  if (*(long *)(unaff_x23 + -0x48) != 0) {
    *(long *)(unaff_x21 + -0x40) = *(long *)(unaff_x23 + -0x48);
    __ZdlPv();
  }
  if (puVar1 != unaff_x19) goto LAB_0063609c;
  do {
    ___cxa_guard_abort(0xa3c1f8);
    __Unwind_Resume();
LAB_0063609c:
    puVar2 = puVar1;
    do {
      puVar1 = puVar2 + -10;
      *puVar1 = unaff_x22;
      if (puVar2[-9] != 0) {
        puVar2[-8] = puVar2[-9];
        __ZdlPv();
      }
      puVar2 = puVar1;
    } while (puVar1 != unaff_x19);
  } while( true );
}

