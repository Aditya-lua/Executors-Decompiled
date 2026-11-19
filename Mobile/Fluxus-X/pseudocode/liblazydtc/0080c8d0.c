/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080c8d0
 */

void FUN_0080c8d0(undefined8 param_1)

{
  undefined8 uVar1;
  
  uVar1 = __cxa_allocate_exception(0x10);
                    /* try { // try from 0080c8ec to 0080c8f3 has its CatchHandler @ 0080c90c */
  FUN_0080c920(uVar1,param_1);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(uVar1,&std::out_of_range::typeinfo,std::domain_error::~domain_error);
}

