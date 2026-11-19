/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc2d8
 */

/* std::__ndk1::__assoc_sub_state::set_exception(std::exception_ptr) */

void __thiscall
std::__ndk1::__assoc_sub_state::set_exception(__assoc_sub_state *this,exception_ptr *param_2)

{
  long lVar1;
  undefined8 local_38;
  
  mutex::lock((mutex *)(this + 0x18));
  if (((byte)this[0x70] & 1) == 0) {
    local_38 = 0;
    lVar1 = *(long *)(this + 0x10);
    exception_ptr::~exception_ptr((exception_ptr *)&local_38);
    if (lVar1 == 0) {
      exception_ptr::operator=((exception_ptr *)(this + 0x10),param_2);
      *(uint *)(this + 0x70) = *(uint *)(this + 0x70) | 4;
      condition_variable::notify_all((condition_variable *)(this + 0x40));
      mutex::unlock((mutex *)(this + 0x18));
      return;
    }
  }
                    /* try { // try from 00bcc360 to 00bcc367 has its CatchHandler @ 00bcc368 */
                    /* WARNING: Subroutine does not return */
  FUN_00bcc1b4(2);
}

