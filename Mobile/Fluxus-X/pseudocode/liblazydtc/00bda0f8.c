/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda0f8
 */

/* std::__ndk1::collate<char>::do_transform(char const*, char const*) const */

char * std::__ndk1::collate<char>::do_transform(char *param_1,char *param_2)

{
  ulong uVar1;
  char *in_x2;
  ulong *in_x8;
  ulong __n;
  char *__dest;
  
  __n = (long)in_x2 - (long)param_2;
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    __dest = (char *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)__n << 1);
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
    __dest = operator_new(uVar1);
    in_x8[1] = __n;
    in_x8[2] = (ulong)__dest;
    *in_x8 = uVar1 | 1;
    param_1 = __dest;
  }
  if (in_x2 != param_2) {
    param_1 = memcpy(__dest,param_2,__n);
  }
  __dest[__n] = '\0';
  return param_1;
}

