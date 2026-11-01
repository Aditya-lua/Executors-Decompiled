
/* WARNING: Possible PIC construction at 0x0061a2f8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0061a2fc) */
/* WARNING: Removing unreachable block (ram,0x0061a304) */
/* WARNING: Removing unreachable block (ram,0x0061a388) */
/* WARNING: Removing unreachable block (ram,0x0061a308) */
/* WARNING: Removing unreachable block (ram,0x0061a30c) */

long FUN_0061a2b0(undefined8 param_1,long param_2,long param_3,long param_4,int param_5)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  long unaff_x29;
  undefined8 unaff_x30;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined1 uStack0000000000000030;
  
  if (param_3 == param_4) {
    return param_2;
  }
  if (param_5 == 0) {
    if (param_2 != 0) {
      if (param_3 != 0) {
        do {
          *(undefined8 *)(param_2 + -8 + param_3 * 8) = 0;
          param_3 = param_3 + -1;
        } while (param_3 != 0);
      }
      func_0x00611644(param_2);
    }
    func_0x006108a0(param_4);
    if (param_4 == 0) {
      return 0;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
    param_2 = in_stack_00000018;
    param_3 = in_stack_00000010;
  }
  else {
    func_0x006108a0(param_4);
    if (param_4 == 0) {
      if (param_2 == 0) {
        return 0;
      }
      if (param_3 != 0) {
        do {
          *(undefined8 *)(param_2 + -8 + param_3 * 8) = 0;
          param_3 = param_3 + -1;
        } while (param_3 != 0);
      }
      func_0x00611644(param_2);
      return 0;
    }
    unaff_x30 = 0x61a2fc;
    unaff_x29 = (long)register0x00000008 + 0x20;
  }
  *(long *)((long)register0x00000008 + -0x20) = param_3;
  *(long *)((long)register0x00000008 + -0x18) = param_2;
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = unaff_x30;
  lVar1 = _malloc(param_4 << 3);
  while( true ) {
    if (lVar1 != 0) {
      return lVar1;
    }
    pcVar2 = (code *)__ZSt15set_new_handlerPFvvE(0);
    if (pcVar2 == (code *)0x0) break;
    __ZSt15set_new_handlerPFvvE();
    (*pcVar2)();
    lVar1 = _malloc(param_4 << 3);
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

