/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc9a0
 */

/* std::__ndk1::promise<void>::set_value() */

void __thiscall std::__ndk1::promise<void>::set_value(promise<void> *this)

{
  if (*(__assoc_sub_state **)this == (__assoc_sub_state *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_00bcc1b4(3);
  }
  __assoc_sub_state::set_value(*(__assoc_sub_state **)this);
  return;
}

