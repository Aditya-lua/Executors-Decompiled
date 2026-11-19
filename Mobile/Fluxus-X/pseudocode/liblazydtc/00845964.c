/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00845964
 */

void FUN_00845964(void)

{
  regex_error *prVar1;
  
  prVar1 = (regex_error *)__cxa_allocate_exception(0x18);
                    /* try { // try from 0084597c to 00845983 has its CatchHandler @ 0084599c */
  std::__ndk1::regex_error::regex_error(prVar1,4);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(prVar1,&std::__ndk1::regex_error::typeinfo,std::__ndk1::regex_error::~regex_error);
}

