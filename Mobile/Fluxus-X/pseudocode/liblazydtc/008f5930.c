/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f5930
 */

/* std::__ndk1::__assoc_state<cpr::Response>::~__assoc_state() */

void __thiscall
std::__ndk1::__assoc_state<cpr::Response>::~__assoc_state(__assoc_state<cpr::Response> *this)

{
  *(undefined ***)this = &PTR_LAB_00cacb48;
  condition_variable::~condition_variable((condition_variable *)(this + 0x40));
  mutex::~mutex((mutex *)(this + 0x18));
  exception_ptr::~exception_ptr((exception_ptr *)(this + 0x10));
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}

