/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd278
 */

/* std::__ndk1::thread::detach() */

void __thiscall std::__ndk1::thread::detach(thread *this)

{
  int iVar1;
  
  if (*(pthread_t *)this == 0) {
    iVar1 = 0x16;
  }
  else {
    iVar1 = pthread_detach(*(pthread_t *)this);
    if (iVar1 == 0) {
      *(undefined8 *)this = 0;
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  __throw_system_error(iVar1,"thread::detach failed");
}

