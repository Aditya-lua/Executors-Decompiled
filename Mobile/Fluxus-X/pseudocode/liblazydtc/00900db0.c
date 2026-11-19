/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900db0
 */

/* cpr::util::urlDecode(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void cpr::util::urlDecode(basic_string_conflict *param_1)

{
  long lVar1;
  CurlHolder aCStack_158 [288];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  CurlHolder::CurlHolder(aCStack_158);
                    /* try { // try from 00900de0 to 00900def has its CatchHandler @ 00900e20 */
  CurlHolder::urlDecode((basic_string_conflict *)aCStack_158);
  CurlHolder::~CurlHolder(aCStack_158);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

