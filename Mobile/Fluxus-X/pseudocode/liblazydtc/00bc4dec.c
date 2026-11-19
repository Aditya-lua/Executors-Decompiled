/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4dec
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::append(char const*) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          char *param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  size_t __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar5;
  
  __n = strlen(param_1);
  uVar4 = *(ulong *)this;
  uVar2 = 0x16;
  if (((byte)*this & 1) != 0) {
    uVar2 = (uVar4 & 0xfffffffffffffffe) - 1;
  }
  uVar3 = uVar4 >> 1 & 0x7f;
  if ((uVar4 & 1) != 0) {
    uVar3 = *(ulong *)(this + 8);
  }
  if (uVar2 - uVar3 < __n) {
    __grow_by_and_replace(this,uVar2,(__n - uVar2) + uVar3,uVar3,uVar3,0,__n,param_1);
  }
  else if (__n != 0) {
    pbVar5 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x10);
    if ((uVar4 & 1) == 0) {
      pbVar5 = this + 1;
    }
    memmove(pbVar5 + uVar3,param_1,__n);
    lVar1 = uVar3 + __n;
    if (((byte)*this & 1) == 0) {
      *this = SUB41((int)lVar1 << 1,0);
    }
    else {
      *(long *)(this + 8) = lVar1;
    }
    pbVar5[lVar1] =
         (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  }
  return this;
}

