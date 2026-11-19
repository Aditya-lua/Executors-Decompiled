/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00848a5c
 */

void FUN_00848a5c(void)

{
  regex_error *prVar1;
  
  prVar1 = (regex_error *)__cxa_allocate_exception(0x18);
                    /* try { // try from 00848a74 to 00848a7b has its CatchHandler @ 00848a94 */
  std::__ndk1::regex_error::regex_error(prVar1,1);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(prVar1,&std::__ndk1::regex_error::typeinfo,std::__ndk1::regex_error::~regex_error);
}

