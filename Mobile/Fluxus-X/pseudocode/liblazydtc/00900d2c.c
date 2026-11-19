/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900d2c
 */

/* cpr::util::urlEncode(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void cpr::util::urlEncode(basic_string_conflict *param_1)

{
  long lVar1;
  CurlHolder aCStack_158 [288];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  CurlHolder::CurlHolder(aCStack_158);
                    /* try { // try from 00900d5c to 00900d6b has its CatchHandler @ 00900d9c */
  CurlHolder::urlEncode((basic_string_conflict *)aCStack_158);
  CurlHolder::~CurlHolder(aCStack_158);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

