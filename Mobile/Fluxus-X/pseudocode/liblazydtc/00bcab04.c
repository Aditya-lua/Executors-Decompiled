/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcab04
 */

void FUN_00bcab04(undefined8 param_1)

{
  undefined8 uVar1;
  
  uVar1 = __cxa_allocate_exception(0x10);
                    /* try { // try from 00bcab24 to 00bcab2b has its CatchHandler @ 00bcab44 */
  FUN_008de29c(uVar1,param_1);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(uVar1,&std::invalid_argument::typeinfo,std::domain_error::~domain_error);
}

