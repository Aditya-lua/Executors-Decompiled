/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098af10
 */

void FUN_0098af10(long param_1)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 8);
  std::__ndk1::mutex::lock((mutex *)(lVar1 + 0x210));
  *(undefined1 *)(lVar1 + 0x238) = 1;
  std::__ndk1::mutex::unlock((mutex *)(lVar1 + 0x210));
  std::__ndk1::condition_variable::notify_one((condition_variable *)(lVar1 + 0x1e0));
  return;
}

