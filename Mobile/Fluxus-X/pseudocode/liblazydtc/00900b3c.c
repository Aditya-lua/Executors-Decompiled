/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900b3c
 */

/* cpr::util::debugUserFunction(void*, curl_infotype, char*, unsigned long, cpr::DebugCallback
   const*) */

undefined8
cpr::util::debugUserFunction
          (undefined8 param_1,undefined4 param_2,void *param_3,ulong param_4,DebugCallback *param_5)

{
  long lVar1;
  void *__dest;
  ulong uVar2;
  ulong local_70;
  ulong local_68;
  void *local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_68 = 0;
  local_60 = (void *)0x0;
  local_70 = 0;
  if (0xffffffffffffffef < param_4) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (param_4 < 0x17) {
    __dest = (void *)((ulong)&local_70 | 1);
    local_70 = (ulong)(byte)((int)param_4 << 1);
    if (param_4 == 0) goto LAB_00900bd4;
  }
  else {
    uVar2 = param_4 + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar2);
    local_70 = uVar2 | 1;
    local_68 = param_4;
    local_60 = __dest;
  }
  memcpy(__dest,param_3,param_4);
LAB_00900bd4:
  *(undefined1 *)((long)__dest + param_4) = 0;
                    /* try { // try from 00900bd8 to 00900be7 has its CatchHandler @ 00900c34 */
  DebugCallback::operator()(param_5,param_2,&local_70);
  if ((local_70 & 1) != 0) {
    operator_delete(local_60);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

