/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc128
 */

/* std::__ndk1::__assoc_sub_state::set_value() */

void __thiscall std::__ndk1::__assoc_sub_state::set_value(__assoc_sub_state *this)

{
  long lVar1;
  undefined8 local_28;
  
  mutex::lock((mutex *)(this + 0x18));
  if (((byte)this[0x70] & 1) == 0) {
    lVar1 = *(long *)(this + 0x10);
    local_28 = 0;
    exception_ptr::~exception_ptr((exception_ptr *)&local_28);
    if (lVar1 == 0) {
      *(uint *)(this + 0x70) = *(uint *)(this + 0x70) | 5;
      condition_variable::notify_all((condition_variable *)(this + 0x40));
      mutex::unlock((mutex *)(this + 0x18));
      return;
    }
  }
                    /* try { // try from 00bcc198 to 00bcc19f has its CatchHandler @ 00bcc1a0 */
                    /* WARNING: Subroutine does not return */
  FUN_00bcc1b4(2);
}

