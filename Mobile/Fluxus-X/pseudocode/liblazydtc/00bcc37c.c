/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc37c
 */

/* std::__ndk1::__assoc_sub_state::set_exception_at_thread_exit(std::exception_ptr) */

void __thiscall
std::__ndk1::__assoc_sub_state::set_exception_at_thread_exit
          (__assoc_sub_state *this,exception_ptr *param_2)

{
  pthread_key_t *ppVar1;
  __thread_struct *this_00;
  long lVar2;
  undefined8 local_38;
  
  mutex::lock((mutex *)(this + 0x18));
  if (((byte)this[0x70] & 1) == 0) {
    local_38 = 0;
    lVar2 = *(long *)(this + 0x10);
    exception_ptr::~exception_ptr((exception_ptr *)&local_38);
    if (lVar2 == 0) {
      exception_ptr::operator=((exception_ptr *)(this + 0x10),param_2);
                    /* try { // try from 00bcc3d0 to 00bcc40b has its CatchHandler @ 00bcc40c */
      ppVar1 = (pthread_key_t *)__thread_local_data();
      this_00 = pthread_getspecific(*ppVar1);
      __thread_struct::__make_ready_at_thread_exit(this_00,this);
      mutex::unlock((mutex *)(this + 0x18));
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_00bcc1b4(2);
}

