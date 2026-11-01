
void FUN_006365e0(void)

{
  undefined8 *unaff_x19;
  long unaff_x21;
  undefined8 *puVar1;
  undefined8 *unaff_x23;
  long unaff_x29;
  
  *(undefined **)(unaff_x29 + -0x50) = &UNK_009f6678;
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    *(long *)(unaff_x29 + -0x40) = *(long *)(unaff_x29 + -0x48);
    __ZdlPv();
  }
  if ((undefined8 *)(unaff_x21 + 0x888) != unaff_x19) {
    unaff_x23 = (undefined8 *)(unaff_x21 + 0x838);
    *unaff_x23 = &UNK_009f6678;
    if (*(long *)(unaff_x21 + 0x840) != 0) {
      *(long *)(unaff_x21 + 0x848) = *(long *)(unaff_x21 + 0x840);
      __ZdlPv();
    }
    if (unaff_x23 != unaff_x19) goto code_r0x0063609c;
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

