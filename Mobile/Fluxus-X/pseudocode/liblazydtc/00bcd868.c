/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd868
 */

/* std::__ndk1::random_device::TEMPNAMEPLACEHOLDERVALUE() */

undefined4 __thiscall std::__ndk1::random_device::operator()(random_device *this)

{
  int *piVar1;
  ssize_t sVar2;
  undefined4 *__buf;
  size_t __nbytes;
  undefined4 local_14;
  
  __buf = &local_14;
  __nbytes = 4;
  do {
    while (sVar2 = read(*(int *)this,__buf,__nbytes), sVar2 != -1) {
      if (sVar2 == 0) {
                    /* WARNING: Subroutine does not return */
        __throw_system_error(0x2a,"random_device got EOF");
      }
      __nbytes = __nbytes - sVar2;
      __buf = (undefined4 *)((long)__buf + sVar2);
      if (__nbytes == 0) {
        return local_14;
      }
    }
    piVar1 = (int *)__errno();
    if (*piVar1 != 4) {
                    /* WARNING: Subroutine does not return */
      __throw_system_error(*piVar1,"random_device got an unexpected error");
    }
  } while (__nbytes != 0);
  return local_14;
}

