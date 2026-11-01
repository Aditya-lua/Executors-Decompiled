
/* WARNING: Possible PIC construction at 0x0061a008: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0061a00c) */
/* WARNING: Removing unreachable block (ram,0x0061a014) */
/* WARNING: Removing unreachable block (ram,0x0061a098) */
/* WARNING: Removing unreachable block (ram,0x0061a018) */
/* WARNING: Removing unreachable block (ram,0x0061a01c) */

long FUN_00619ff4(void)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  int in_w4;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x29;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  if (in_w4 == 0) {
    if (unaff_x19 != 0) {
      if (unaff_x20 != 0) {
        do {
          *(undefined2 *)(unaff_x19 + -2 + unaff_x20 * 2) = 0;
          unaff_x20 = unaff_x20 + -1;
        } while (unaff_x20 != 0);
      }
      func_0x00611644();
    }
    func_0x00619ee0();
    if (unaff_x21 == 0) {
      return 0;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
    unaff_x19 = in_stack_00000018;
    unaff_x20 = in_stack_00000010;
    unaff_x29 = in_stack_00000020;
    uVar3 = in_stack_00000028;
  }
  else {
    func_0x00619ee0();
    if (unaff_x21 == 0) {
      if (unaff_x19 == 0) {
        return 0;
      }
      if (unaff_x20 != 0) {
        do {
          *(undefined2 *)(unaff_x19 + -2 + unaff_x20 * 2) = 0;
          unaff_x20 = unaff_x20 + -1;
        } while (unaff_x20 != 0);
      }
      func_0x00611644();
      return 0;
    }
    uVar3 = 0x61a00c;
  }
  *(long *)((long)register0x00000008 + -0x20) = unaff_x20;
  *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar3;
  lVar1 = _malloc(unaff_x21 << 1);
  while( true ) {
    if (lVar1 != 0) {
      return lVar1;
    }
    pcVar2 = (code *)__ZSt15set_new_handlerPFvvE(0);
    if (pcVar2 == (code *)0x0) break;
    __ZSt15set_new_handlerPFvvE();
    (*pcVar2)();
    lVar1 = _malloc(unaff_x21 << 1);
  }
  ___cxa_allocate_exception(8);
  uVar3 = __ZNSt9bad_allocC1Ev();
  lVar1 = ___cxa_throw(uVar3,PTR___ZTISt9bad_alloc_009b0150,PTR___ZNSt9bad_allocD1Ev_009b00b0);
  if (lVar1 == 0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  lVar1 = (*(code *)PTR__free_00a24e58)();
  return lVar1;
}

