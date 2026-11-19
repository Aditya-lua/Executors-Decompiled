/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eab8c
 */

/* cpr::CurlHolder::urlEncode(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) const */

void cpr::CurlHolder::urlEncode(basic_string_conflict *param_1)

{
  uint uVar1;
  char *__s;
  size_t __n;
  byte *in_x1;
  ulong *in_x8;
  byte *pbVar2;
  void *__dest;
  ulong uVar3;
  
  pbVar2 = *(byte **)(in_x1 + 0x10);
  uVar1 = *(uint *)(in_x1 + 8);
  if ((*in_x1 & 1) == 0) {
    pbVar2 = in_x1 + 1;
    uVar1 = (uint)(*in_x1 >> 1);
  }
  __s = (char *)curl_easy_escape(*(undefined8 *)param_1,pbVar2,uVar1);
  in_x8[1] = 0;
  in_x8[2] = 0;
  *in_x8 = 0;
  if (__s == (char *)0x0) {
    *(undefined2 *)in_x8 = 0;
    return;
  }
  __n = strlen(__s);
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n < 0x17) {
    __dest = (void *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_008eac40;
  }
  else {
    uVar3 = __n + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar3);
    in_x8[1] = __n;
    in_x8[2] = (ulong)__dest;
    *in_x8 = uVar3 | 1;
  }
  memcpy(__dest,__s,__n);
LAB_008eac40:
  *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 008eac44 to 008eac4b has its CatchHandler @ 008eac68 */
  curl_free(__s);
  return;
}

