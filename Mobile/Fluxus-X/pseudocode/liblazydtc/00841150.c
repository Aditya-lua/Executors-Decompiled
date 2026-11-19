/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00841150
 */

void FUN_00841150(locale *param_1)

{
  long lVar1;
  __shared_weak_count *this;
  
  this = *(__shared_weak_count **)(param_1 + 0x30);
  if ((this != (__shared_weak_count *)0x0) &&
     (lVar1 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar1 == 0)) {
    (**(code **)(*(long *)this + 0x10))(this);
    std::__ndk1::__shared_weak_count::__release_weak(this);
  }
  std::__ndk1::locale::~locale(param_1);
  return;
}

