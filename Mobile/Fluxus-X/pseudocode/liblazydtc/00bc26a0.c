/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc26a0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */
/* std::current_exception() */

void std::current_exception(void)

{
  undefined8 uVar1;
  undefined8 *in_x8;
  
  uVar1 = __cxa_current_primary_exception();
  *in_x8 = uVar1;
  return;
}

