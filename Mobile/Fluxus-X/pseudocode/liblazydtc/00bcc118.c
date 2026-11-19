/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc118
 */

/* std::__ndk1::__assoc_sub_state::__on_zero_shared() */

void __thiscall std::__ndk1::__assoc_sub_state::__on_zero_shared(__assoc_sub_state *this)

{
                    /* WARNING: Could not recover jumptable at 0x00bcc124. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)this + 8))();
  return;
}

