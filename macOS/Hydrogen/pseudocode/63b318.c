
/* WARNING: Type propagation algorithm not settling */

void FUN_0063b318(undefined8 param_1)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 *puVar2;
  undefined8 *unaff_x23;
  long unaff_x29;
  undefined8 uStack0000000000000190;
  long in_stack_00000198;
  
  uStack0000000000000190 = param_1;
  if (in_stack_00000198 == 0) {
    *(undefined **)(unaff_x29 + -0xf0) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0xe8);
  }
  else {
    __ZdlPv();
    *(undefined **)(unaff_x29 + -0xf0) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0xe8);
  }
  if (lVar1 == 0) {
    *(undefined **)(unaff_x29 + -0xd0) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -200);
  }
  else {
    *(long *)(unaff_x29 + -0xe0) = lVar1;
    __ZdlPv();
    *(undefined **)(unaff_x29 + -0xd0) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -200);
  }
  if (lVar1 == 0) {
    *(undefined **)(unaff_x29 + -0xb0) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0xa8);
  }
  else {
    *(long *)(unaff_x29 + -0xc0) = lVar1;
    __ZdlPv();
    *(undefined **)(unaff_x29 + -0xb0) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0xa8);
  }
  if (lVar1 == 0) {
    *(undefined **)(unaff_x29 + -0x90) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0x88);
  }
  else {
    *(long *)(unaff_x29 + -0xa0) = lVar1;
    __ZdlPv();
    *(undefined **)(unaff_x29 + -0x90) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0x88);
  }
  if (lVar1 == 0) {
    *(undefined **)(unaff_x29 + -0x70) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0x68);
  }
  else {
    *(long *)(unaff_x29 + -0x80) = lVar1;
    __ZdlPv();
    *(undefined **)(unaff_x29 + -0x70) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0x68);
  }
  if (lVar1 == 0) {
    *(undefined **)(unaff_x29 + -0x50) = &UNK_009f6678;
    lVar1 = *(long *)(unaff_x29 + -0x48);
  }
  else {
    *(long *)(unaff_x29 + -0x60) = lVar1;
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

