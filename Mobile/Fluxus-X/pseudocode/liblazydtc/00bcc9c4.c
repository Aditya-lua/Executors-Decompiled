/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc9c4
 */

/* std::__ndk1::promise<void>::set_exception(std::exception_ptr) */

void __thiscall
std::__ndk1::promise<void>::set_exception(promise<void> *this,exception_ptr *param_2)

{
  __assoc_sub_state *p_Var1;
  exception_ptr aeStack_8 [8];
  
  p_Var1 = *(__assoc_sub_state **)this;
  if (p_Var1 == (__assoc_sub_state *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_00bcc1b4(3);
  }
  exception_ptr::exception_ptr(aeStack_8,param_2);
                    /* try { // try from 00bcc9e4 to 00bcc9ef has its CatchHandler @ 00bcca10 */
  __assoc_sub_state::set_exception(p_Var1,aeStack_8);
  exception_ptr::~exception_ptr(aeStack_8);
  return;
}

