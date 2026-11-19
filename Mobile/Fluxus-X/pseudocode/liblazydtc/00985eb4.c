/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00985eb4
 */

/* ix::SelectInterruptPipe::read() */

undefined8 __thiscall ix::SelectInterruptPipe::read(SelectInterruptPipe *this)

{
  int __fd;
  long lVar1;
  undefined8 uVar2;
  ssize_t sVar3;
  int *piVar4;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  std::__ndk1::mutex::lock((mutex *)(this + 0x10));
  __fd = *(int *)(this + 8);
  local_40 = 0;
  do {
                    /* try { // try from 00985eec to 00985efb has its CatchHandler @ 00985f4c */
    sVar3 = ::read(__fd,&local_40,8);
    if (sVar3 != -1) break;
    piVar4 = (int *)__errno();
  } while (*piVar4 == 4);
  uVar2 = local_40;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x10));
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar2;
}

