/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084125c
 */

void FUN_0084125c(long param_1)

{
  long lVar1;
  __shared_weak_count *this;
  
  this = *(__shared_weak_count **)(param_1 + 0x10);
  if ((this == (__shared_weak_count *)0x0) ||
     (lVar1 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar1 != 0)) {
    return;
  }
  (**(code **)(*(long *)this + 0x10))(this);
  std::__ndk1::__shared_weak_count::__release_weak(this);
  return;
}

