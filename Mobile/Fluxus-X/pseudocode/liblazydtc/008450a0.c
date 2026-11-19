/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008450a0
 */

void FUN_008450a0(void)

{
  regex_error *prVar1;
  
  prVar1 = (regex_error *)__cxa_allocate_exception(0x18);
                    /* try { // try from 008450b8 to 008450bf has its CatchHandler @ 008450d8 */
  std::__ndk1::regex_error::regex_error(prVar1,3);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(prVar1,&std::__ndk1::regex_error::typeinfo,std::__ndk1::regex_error::~regex_error);
}

