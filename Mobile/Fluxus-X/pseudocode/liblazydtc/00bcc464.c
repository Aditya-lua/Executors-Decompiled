/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc464
 */

/* std::__ndk1::__assoc_sub_state::copy() */

void __thiscall std::__ndk1::__assoc_sub_state::copy(__assoc_sub_state *this)

{
  mutex *this_00;
  uint uVar1;
  undefined8 uVar2;
  long lVar3;
  exception_ptr aeStack_40 [8];
  undefined8 local_38;
  mutex *local_30;
  byte local_28;
  
  this_00 = (mutex *)(this + 0x18);
  local_28 = 1;
  local_30 = this_00;
  mutex::lock(this_00);
  uVar1 = *(uint *)(this + 0x70);
  if ((uVar1 >> 2 & 1) == 0) {
    if ((uVar1 >> 3 & 1) == 0) {
      do {
        condition_variable::wait((condition_variable *)(this + 0x40),(unique_lock *)&local_30);
      } while (((byte)this[0x70] >> 2 & 1) == 0);
    }
    else {
      *(uint *)(this + 0x70) = uVar1 & 0xfffffff3;
      mutex::unlock(this_00);
      local_28 = 0;
      (**(code **)(*(long *)this + 0x18))(this);
    }
  }
  lVar3 = *(long *)(this + 0x10);
  local_38 = 0;
  exception_ptr::~exception_ptr((exception_ptr *)&local_38);
  if (lVar3 != 0) {
    exception_ptr::exception_ptr(aeStack_40,(exception_ptr *)(this + 0x10));
                    /* try { // try from 00bcc524 to 00bcc52b has its CatchHandler @ 00bcc52c */
    uVar2 = rethrow_exception(aeStack_40);
                    /* catch() { ... } // from try @ 00bcc524 with catch @ 00bcc52c */
    exception_ptr::~exception_ptr(aeStack_40);
    if ((local_28 & 1) != 0) {
      mutex::unlock(local_30);
    }
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar2);
  }
  if (local_28 == 1) {
    mutex::unlock(local_30);
  }
  return;
}

