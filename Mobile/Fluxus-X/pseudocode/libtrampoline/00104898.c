/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: libtrampoline.so; entry: 00104898
 */

undefined8 FUN_00104898(int param_1,undefined8 *param_2)

{
  long lVar1;
  code *UNRECOVERED_JUMPTABLE;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  
  lVar4 = tpidr_el0;
  lVar3 = *(long *)(lVar4 + 0x28);
  if (param_1 + -1 == 0 || param_1 < 1) {
    __android_log_print(7,"crashpad_trampoline","usage: %s <path>",*param_2);
    lVar4 = *(long *)(lVar4 + 0x28);
  }
  else {
    lVar1 = dlopen(param_2[1],0x101);
    if (lVar1 == 0) {
      uVar2 = dlerror();
      __android_log_print(7,"crashpad_trampoline","dlopen: %s",uVar2);
      lVar4 = *(long *)(lVar4 + 0x28);
    }
    else {
      UNRECOVERED_JUMPTABLE = (code *)dlsym(lVar1,"CrashpadHandlerMain");
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
        if (*(long *)(lVar4 + 0x28) == lVar3) {
                    /* WARNING: Could not recover jumptable at 0x00104940. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar2 = (*UNRECOVERED_JUMPTABLE)(param_1 + -1,param_2 + 1);
          return uVar2;
        }
        goto LAB_001049bc;
      }
      uVar2 = dlerror();
      __android_log_print(7,"crashpad_trampoline","dlsym: %s",uVar2);
      lVar4 = *(long *)(lVar4 + 0x28);
    }
  }
  if (lVar4 == lVar3) {
    return 1;
  }
LAB_001049bc:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

