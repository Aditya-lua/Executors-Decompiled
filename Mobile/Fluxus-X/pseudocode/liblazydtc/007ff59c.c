/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff59c
 */

void FUN_007ff59c(undefined8 *param_1)

{
  __thread_struct *this;
  
  this = (__thread_struct *)*param_1;
  *param_1 = 0;
  if (this == (__thread_struct *)0x0) {
    return;
  }
  std::__ndk1::__thread_struct::~__thread_struct(this);
  operator_delete(this,8);
  return;
}

