/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900534
 */

/* cpr::util::readUserFunction(char*, unsigned long, unsigned long, cpr::ReadCallback const*) */

void cpr::util::readUserFunction(char *param_1,ulong param_2,ulong param_3,ReadCallback *param_4)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long local_40;
  undefined8 uStack_38;
  char *local_30;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  local_40 = param_3 * param_2;
  uStack_38 = *(undefined8 *)param_4;
  plVar3 = *(long **)(param_4 + 0x30);
  local_30 = param_1;
  if (plVar3 == (long *)0x0) {
    puVar5 = (undefined8 *)__cxa_allocate_exception(8);
    *puVar5 = &PTR__bad_function_call_00cac7b8;
                    /* WARNING: Subroutine does not return */
    __cxa_throw(puVar5,&std::__ndk1::bad_function_call::typeinfo,std::bad_exception::~bad_exception)
    ;
  }
  uVar4 = (**(code **)(*plVar3 + 0x30))(plVar3,&local_30,&local_40,&uStack_38);
  lVar1 = local_40;
  if ((uVar4 & 1) == 0) {
    lVar1 = 0x10000000;
  }
  if (*(long *)(lVar2 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar1);
  }
  return;
}

