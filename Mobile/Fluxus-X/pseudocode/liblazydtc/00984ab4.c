/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984ab4
 */

/* ix::Socket::init(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&) */

void ix::Socket::init(basic_string_conflict *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00984ac0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(param_1 + 0x38) + 0x10))();
  return;
}

