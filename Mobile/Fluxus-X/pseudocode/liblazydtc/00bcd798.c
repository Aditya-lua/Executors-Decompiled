/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd798
 */

/* std::__ndk1::random_device::random_device(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::random_device::random_device(random_device *this,basic_string_conflict *param_1)

{
  int iVar1;
  int *piVar2;
  basic_string_conflict *in_x2;
  basic_string_conflict *__file;
  byte local_38;
  char acStack_37 [15];
  char *local_28;
  
  __file = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    __file = param_1 + 1;
  }
  iVar1 = open((char *)__file,0);
  *(int *)this = iVar1;
  if (-1 < iVar1) {
    return;
  }
  piVar2 = (int *)__errno();
  iVar1 = *piVar2;
  operator+((__ndk1 *)"random_device failed to open ",(char *)param_1,in_x2);
  if ((local_38 & 1) == 0) {
    local_28 = acStack_37;
  }
                    /* try { // try from 00bcd818 to 00bcd81f has its CatchHandler @ 00bcd820 */
                    /* WARNING: Subroutine does not return */
  __throw_system_error(iVar1,local_28);
}

