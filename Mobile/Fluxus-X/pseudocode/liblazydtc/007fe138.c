/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe138
 */

void FUN_007fe138(undefined8 param_1)

{
  undefined8 uVar1;
  
  uVar1 = __cxa_allocate_exception(0x10);
                    /* try { // try from 007fe154 to 007fe15b has its CatchHandler @ 007fe174 */
  FUN_007fe188(uVar1,param_1);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(uVar1,&std::length_error::typeinfo,std::domain_error::~domain_error);
}

