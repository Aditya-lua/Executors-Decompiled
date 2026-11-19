/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbb14
 */

void FUN_00bcbb14(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  system_error *psVar1;
  
  psVar1 = (system_error *)__cxa_allocate_exception(0x20);
                    /* try { // try from 00bcbb40 to 00bcbb4f has its CatchHandler @ 00bcbb68 */
  std::__ndk1::system_error::system_error(psVar1,param_1,param_2,param_3);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(psVar1,&std::__ndk1::system_error::typeinfo,std::__ndk1::system_error::~system_error);
}

