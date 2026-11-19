/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f5984
 */

/* std::__ndk1::__assoc_state<cpr::Response>::__on_zero_shared() */

void __thiscall
std::__ndk1::__assoc_state<cpr::Response>::__on_zero_shared(__assoc_state<cpr::Response> *this)

{
  if (((byte)this[0x70] & 1) != 0) {
    FUN_008247c0(this + 0x78);
  }
                    /* WARNING: Could not recover jumptable at 0x008f59b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)this + 8))(this);
  return;
}

