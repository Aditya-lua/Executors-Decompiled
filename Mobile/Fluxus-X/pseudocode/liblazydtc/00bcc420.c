/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc420
 */

/* std::__ndk1::__assoc_sub_state::__make_ready() */

void __thiscall std::__ndk1::__assoc_sub_state::__make_ready(__assoc_sub_state *this)

{
  mutex::lock((mutex *)(this + 0x18));
  *(uint *)(this + 0x70) = *(uint *)(this + 0x70) | 4;
  condition_variable::notify_all((condition_variable *)(this + 0x40));
  mutex::unlock((mutex *)(this + 0x18));
  return;
}

