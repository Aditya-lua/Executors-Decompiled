/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd22c
 */

/* std::__ndk1::thread::join() */

void __thiscall std::__ndk1::thread::join(thread *this)

{
  int iVar1;
  
  if (*(pthread_t *)this == 0) {
    iVar1 = 0x16;
  }
  else {
    iVar1 = pthread_join(*(pthread_t *)this,(void **)0x0);
    if (iVar1 == 0) {
      *(undefined8 *)this = 0;
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  __throw_system_error(iVar1,"thread::join failed");
}

