/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcca24
 */

/* std::__ndk1::promise<void>::set_value_at_thread_exit() */

void __thiscall std::__ndk1::promise<void>::set_value_at_thread_exit(promise<void> *this)

{
  if (*(__assoc_sub_state **)this == (__assoc_sub_state *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_00bcc1b4(3);
  }
  __assoc_sub_state::set_value_at_thread_exit(*(__assoc_sub_state **)this);
  return;
}

