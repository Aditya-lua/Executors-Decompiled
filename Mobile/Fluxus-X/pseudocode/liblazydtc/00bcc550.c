/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc550
 */

/* std::__ndk1::__assoc_sub_state::__sub_wait(std::__ndk1::unique_lock<std::__ndk1::mutex>&) */

void __thiscall
std::__ndk1::__assoc_sub_state::__sub_wait(__assoc_sub_state *this,unique_lock *param_1)

{
  uint uVar1;
  unique_lock uVar2;
  long lVar3;
  
  uVar1 = *(uint *)(this + 0x70);
  if ((uVar1 >> 2 & 1) == 0) {
    if ((uVar1 >> 3 & 1) != 0) {
      uVar2 = param_1[8];
      *(uint *)(this + 0x70) = uVar1 & 0xfffffff3;
      if (((byte)uVar2 & 1) == 0) {
                    /* WARNING: Subroutine does not return */
        __throw_system_error(1,"unique_lock::unlock: not locked");
      }
      mutex::unlock(*(mutex **)param_1);
      lVar3 = *(long *)this;
      param_1[8] = (unique_lock)0x0;
                    /* WARNING: Could not recover jumptable at 0x00bcc5cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(lVar3 + 0x18))(this);
      return;
    }
    do {
      condition_variable::wait((condition_variable *)(this + 0x40),param_1);
    } while (((byte)this[0x70] >> 2 & 1) == 0);
  }
  return;
}

