/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084a030
 */

void FUN_0084a030(void)

{
  regex_error *prVar1;
  
  prVar1 = (regex_error *)__cxa_allocate_exception(0x18);
                    /* try { // try from 0084a048 to 0084a04f has its CatchHandler @ 0084a068 */
  std::__ndk1::regex_error::regex_error(prVar1,0xf);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(prVar1,&std::__ndk1::regex_error::typeinfo,std::__ndk1::regex_error::~regex_error);
}

