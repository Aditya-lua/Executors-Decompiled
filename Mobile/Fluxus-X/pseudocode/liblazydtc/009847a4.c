/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009847a4
 */

/* ix::Socket::readSelectInterruptRequest(std::__ndk1::unique_ptr<ix::SelectInterrupt,
   std::__ndk1::default_delete<ix::SelectInterrupt> > const&, ix::PollResultType*) */

undefined8 ix::Socket::readSelectInterruptRequest(unique_ptr *param_1,PollResultType *param_2)

{
  long lVar1;
  undefined4 uVar2;
  
  lVar1 = (**(code **)(**(long **)param_1 + 0x28))();
  if (lVar1 == 1) {
    uVar2 = 4;
  }
  else {
    if (lVar1 != 2) {
      return 0;
    }
    uVar2 = 5;
  }
  *(undefined4 *)param_2 = uVar2;
  return 1;
}

