
void FUN_006365dc(void)

{
  undefined8 *unaff_x19;
  undefined8 *puVar1;
  undefined8 *unaff_x23;
  long unaff_x29;
  
  *(undefined **)(unaff_x29 + -0x50) = &UNK_009f6678;
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    *(long *)(unaff_x29 + -0x40) = *(long *)(unaff_x29 + -0x48);
    __ZdlPv();
  }
  if (unaff_x19 != (undefined8 *)0xa3c888) {
    unaff_x23 = (undefined8 *)0xa3c838;
    puRam0000000000a3c838 = &UNK_009f6678;
    if (lRam0000000000a3c840 != 0) {
      lRam0000000000a3c848 = lRam0000000000a3c840;
      __ZdlPv();
    }
    if (unaff_x19 != (undefined8 *)0xa3c838) goto code_r0x0063609c;
  }
  do {
    ___cxa_guard_abort(0xa3c1f8);
    __Unwind_Resume();
code_r0x0063609c:
    puVar1 = unaff_x23;
    do {
      unaff_x23 = puVar1 + -10;
      *unaff_x23 = &UNK_009f6678;
      if (puVar1[-9] != 0) {
        puVar1[-8] = puVar1[-9];
        __ZdlPv();
      }
      puVar1 = unaff_x23;
    } while (unaff_x23 != unaff_x19);
  } while( true );
}

