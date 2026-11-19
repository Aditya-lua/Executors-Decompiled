/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb2f0
 */

/* std::__ndk1::error_code::message() const */

void __thiscall std::__ndk1::error_code::message(error_code *this)

{
                    /* WARNING: Could not recover jumptable at 0x00bcb308. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(this + 8) + 0x30))(*(long **)(this + 8),*(undefined4 *)this);
  return;
}

