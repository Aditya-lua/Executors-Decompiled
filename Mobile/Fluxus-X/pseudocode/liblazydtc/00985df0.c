/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00985df0
 */

/* ix::SelectInterruptPipe::notify(unsigned long) */

bool __thiscall ix::SelectInterruptPipe::notify(SelectInterruptPipe *this,ulong param_1)

{
  int __fd;
  long lVar1;
  bool bVar2;
  long lVar3;
  int *piVar4;
  ulong local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_40 = param_1;
  std::__ndk1::mutex::lock((mutex *)(this + 0x10));
  __fd = *(int *)(this + 0xc);
  if (__fd == -1) {
    bVar2 = false;
  }
  else {
    do {
                    /* try { // try from 00985e30 to 00985e3f has its CatchHandler @ 00985ea0 */
      lVar3 = write(__fd,&local_40,8);
      if (lVar3 != -1) goto LAB_00985e5c;
      piVar4 = (int *)__errno();
    } while (*piVar4 == 4);
    lVar3 = -1;
LAB_00985e5c:
    bVar2 = lVar3 == 8;
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0x10));
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return bVar2;
}

