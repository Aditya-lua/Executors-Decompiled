/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2edc
 */

void FUN_00bc2edc(undefined8 param_1)

{
  undefined8 uVar1;
  
  uVar1 = __cxa_allocate_exception(0x10);
                    /* try { // try from 00bc2efc to 00bc2f03 has its CatchHandler @ 00bc2f1c */
  FUN_00bc2f30(uVar1,param_1);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(uVar1,&std::overflow_error::typeinfo,std::underflow_error::~underflow_error);
}

