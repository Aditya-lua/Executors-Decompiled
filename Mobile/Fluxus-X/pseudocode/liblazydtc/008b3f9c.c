/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3f9c
 */

void FUN_008b3f9c(undefined8 param_1,undefined4 param_2)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)__cxa_allocate_exception(0x18);
  *(undefined4 *)(puVar1 + 2) = param_2;
  *puVar1 = &PTR__bad_exception_00c4d150;
  puVar1[1] = param_1;
                    /* WARNING: Subroutine does not return */
  __cxa_throw(puVar1,&PTR_PTR_00c4d128,std::bad_exception::~bad_exception);
}

