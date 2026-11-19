/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2714
 */

/* std::nested_exception::rethrow_nested() const */

void __thiscall std::nested_exception::rethrow_nested(nested_exception *this)

{
  undefined8 uVar1;
  long lVar2;
  exception_ptr aeStack_30 [8];
  undefined8 local_28;
  
  local_28 = 0;
  lVar2 = *(long *)(this + 8);
  exception_ptr::~exception_ptr((exception_ptr *)&local_28);
  if (lVar2 == 0) {
                    /* WARNING: Subroutine does not return */
    terminate();
  }
  exception_ptr::exception_ptr(aeStack_30,(exception_ptr *)(this + 8));
                    /* try { // try from 00bc2750 to 00bc2757 has its CatchHandler @ 00bc2758 */
  uVar1 = rethrow_exception(aeStack_30);
                    /* catch() { ... } // from try @ 00bc2750 with catch @ 00bc2758 */
  exception_ptr::~exception_ptr(aeStack_30);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar1);
}

