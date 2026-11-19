/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccb74
 */

void FUN_00bccb74(__shared_weak_count *param_1)

{
  *(undefined ***)param_1 = &PTR_LAB_00cacb48;
  std::__ndk1::condition_variable::~condition_variable((condition_variable *)(param_1 + 0x40));
  std::__ndk1::mutex::~mutex((mutex *)(param_1 + 0x18));
  std::exception_ptr::~exception_ptr((exception_ptr *)(param_1 + 0x10));
  std::__ndk1::__shared_weak_count::~__shared_weak_count(param_1);
  operator_delete(param_1,0x78);
  return;
}

