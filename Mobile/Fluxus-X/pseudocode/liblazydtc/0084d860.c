/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084d860
 */

void FUN_0084d860(long param_1)

{
  if (*(__shared_weak_count **)(param_1 + 0x10) == (__shared_weak_count *)0x0) {
    return;
  }
  std::__ndk1::__shared_weak_count::__release_weak(*(__shared_weak_count **)(param_1 + 0x10));
  return;
}

