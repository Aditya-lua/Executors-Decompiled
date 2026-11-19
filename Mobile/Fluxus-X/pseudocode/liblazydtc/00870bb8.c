/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00870bb8
 */

void FUN_00870bb8(void)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)__cxa_allocate_exception(8);
  *puVar1 = &PTR__bad_function_call_00cac7b8;
                    /* WARNING: Subroutine does not return */
  __cxa_throw(puVar1,&std::__ndk1::bad_function_call::typeinfo,
              std::__ndk1::bad_function_call::~bad_function_call);
}

