/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00985f68
 */

/* ix::SelectInterruptPipe::getFd() const */

undefined4 __thiscall ix::SelectInterruptPipe::getFd(SelectInterruptPipe *this)

{
  undefined4 uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x10));
  uVar1 = *(undefined4 *)(this + 8);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x10));
  return uVar1;
}

