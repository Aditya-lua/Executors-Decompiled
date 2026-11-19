/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844fa0
 */

void FUN_00844fa0(void)

{
  regex_error *prVar1;
  
  prVar1 = (regex_error *)__cxa_allocate_exception(0x18);
                    /* try { // try from 00844fb8 to 00844fbf has its CatchHandler @ 00844fd8 */
  std::__ndk1::regex_error::regex_error(prVar1,0xb);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(prVar1,&std::__ndk1::regex_error::typeinfo,std::__ndk1::regex_error::~regex_error);
}

