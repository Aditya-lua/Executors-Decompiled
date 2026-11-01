
void FUN_0063adfc(undefined8 param_1)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 *unaff_x23;
  undefined8 *puVar2;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0x70) = param_1;
  if (*(long *)(unaff_x29 + -0x68) == 0) {
    *(undefined **)(unaff_x29 + -0x50) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0x48);
  }
  else {
    *(long *)(unaff_x29 + -0x60) = *(long *)(unaff_x29 + -0x68);
    __ZdlPv();
    *(undefined **)(unaff_x29 + -0x50) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0x48);
  }
  if (lVar1 != 0) {
    *(long *)(unaff_x29 + -0x40) = lVar1;
    __ZdlPv();
  }
  if (unaff_x21 != unaff_x19) {
    unaff_x23 = unaff_x21 + -0xb;
    *unaff_x23 = &UNK_009f6678;
    if (unaff_x21[-10] != 0) {
      unaff_x21[-9] = unaff_x21[-10];
      __ZdlPv();
    }
    if (unaff_x23 != unaff_x19) goto code_r0x0063b104;
  }
  do {
    ___cxa_guard_abort(0xa3c200);
    __Unwind_Resume();
code_r0x0063b104:
    puVar2 = unaff_x23;
    do {
      unaff_x23 = puVar2 + -0xb;
      *unaff_x23 = &UNK_009f6678;
      if (puVar2[-10] != 0) {
        puVar2[-9] = puVar2[-10];
        __ZdlPv();
      }
      puVar2 = unaff_x23;
    } while (unaff_x23 != unaff_x19);
  } while( true );
}

