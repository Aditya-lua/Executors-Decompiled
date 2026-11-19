/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff544
 */

void FUN_007ff544(undefined8 *param_1)

{
  undefined8 *puVar1;
  __thread_struct *this;
  
  puVar1 = (undefined8 *)*param_1;
  *param_1 = 0;
  if (puVar1 == (undefined8 *)0x0) {
    return;
  }
  this = (__thread_struct *)*puVar1;
  *puVar1 = 0;
  if (this != (__thread_struct *)0x0) {
    std::__ndk1::__thread_struct::~__thread_struct(this);
    operator_delete(this,8);
  }
  operator_delete(puVar1,0x10);
  return;
}

