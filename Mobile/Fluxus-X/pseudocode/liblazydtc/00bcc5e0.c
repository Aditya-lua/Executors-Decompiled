/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc5e0
 */

/* std::__ndk1::__assoc_sub_state::wait() */

void __thiscall std::__ndk1::__assoc_sub_state::wait(__assoc_sub_state *this)

{
  mutex *this_00;
  uint uVar1;
  mutex *local_30;
  byte local_28;
  
  this_00 = (mutex *)(this + 0x18);
  local_28 = 1;
  local_30 = this_00;
  mutex::lock(this_00);
  uVar1 = *(uint *)(this + 0x70);
  if ((uVar1 >> 2 & 1) == 0) {
    if ((uVar1 >> 3 & 1) != 0) {
      *(uint *)(this + 0x70) = uVar1 & 0xfffffff3;
      mutex::unlock(this_00);
                    /* WARNING: Could not recover jumptable at 0x00bcc680. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*(long *)this + 0x18))(this);
      return;
    }
    do {
      condition_variable::wait((condition_variable *)(this + 0x40),(unique_lock *)&local_30);
    } while (((byte)this[0x70] >> 2 & 1) == 0);
    if ((local_28 & 1) == 0) {
      return;
    }
  }
  mutex::unlock(local_30);
  return;
}

