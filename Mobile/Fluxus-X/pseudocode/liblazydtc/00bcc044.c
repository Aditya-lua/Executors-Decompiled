/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc044
 */

/* std::__ndk1::future_error::future_error(std::__ndk1::error_code) */

void __thiscall
std::__ndk1::future_error::future_error(future_error *this,undefined8 param_2,undefined8 param_3)

{
  basic_string_conflict local_48;
  undefined7 uStack_47;
  void *local_38;
  undefined8 local_30;
  undefined8 uStack_28;
  
  local_30 = param_2;
  uStack_28 = param_3;
  error_code::message((error_code *)&local_30);
                    /* try { // try from 00bcc06c to 00bcc077 has its CatchHandler @ 00bcc0bc */
  logic_error::logic_error((logic_error *)this,&local_48);
  if (((byte)local_48 & 1) != 0) {
    operator_delete(local_38,CONCAT71(uStack_47,local_48) & 0xfffffffffffffffe);
  }
  *(undefined ***)this = &PTR__future_error_00cacb08;
  *(undefined8 *)(this + 0x18) = uStack_28;
  *(undefined8 *)(this + 0x10) = local_30;
  return;
}

