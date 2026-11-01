
/* WARNING: Type propagation algorithm not settling */

void FUN_00635f44(void)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 *unaff_x23;
  undefined8 *puVar2;
  long unaff_x29;
  long in_stack_000001d8;
  long in_stack_000001f8;
  long in_stack_00000218;
  long in_stack_00000238;
  
  __ZdlPv();
  if (in_stack_000001d8 != 0) {
    __ZdlPv();
  }
  if (in_stack_000001f8 != 0) {
    __ZdlPv();
  }
  if (in_stack_00000218 != 0) {
    __ZdlPv();
  }
  if (in_stack_00000238 == 0) {
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
    unaff_x23 = unaff_x21 + -10;
    *unaff_x23 = &UNK_009f6678;
    if (unaff_x21[-9] != 0) {
      unaff_x21[-8] = unaff_x21[-9];
      __ZdlPv();
    }
    if (unaff_x23 != unaff_x19) goto code_r0x0063609c;
  }
  do {
    ___cxa_guard_abort(0xa3c1f8);
    __Unwind_Resume();
code_r0x0063609c:
    puVar2 = unaff_x23;
    do {
      unaff_x23 = puVar2 + -10;
      *unaff_x23 = &UNK_009f6678;
      if (puVar2[-9] != 0) {
        puVar2[-8] = puVar2[-9];
        __ZdlPv();
      }
      puVar2 = unaff_x23;
    } while (unaff_x23 != unaff_x19);
  } while( true );
}

