/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4748
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::assign(unsigned long, char) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,char param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__s;
  ulong uVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar5;
  
  uVar4 = *(ulong *)this;
  uVar1 = 0x16;
  if (((byte)*this & 1) != 0) {
    uVar1 = (uVar4 & 0xfffffffffffffffe) - 1;
  }
  if (uVar1 < param_1) {
    if (-uVar1 - 9 < param_1 - uVar1) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    pbVar5 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x10);
    if ((uVar4 & 1) == 0) {
      pbVar5 = this + 1;
    }
    if (uVar1 < 0x7ffffffffffffff3) {
      uVar2 = param_1;
      if (param_1 <= uVar1 * 2) {
        uVar2 = uVar1 * 2;
      }
      uVar3 = 0x1a;
      if ((uVar2 | 7) != 0x17) {
        uVar3 = (uVar2 | 7) + 1;
      }
      uVar4 = 0x17;
      if (0x16 < uVar2) {
        uVar4 = uVar3;
      }
      __s = operator_new(uVar4);
      if (uVar1 != 0x16) goto LAB_00bc483c;
    }
    else {
      uVar4 = 0xfffffffffffffff7;
      __s = operator_new(0xfffffffffffffff7);
LAB_00bc483c:
      operator_delete(pbVar5,uVar1 + 1);
    }
    *(undefined8 *)(this + 8) = 0;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = __s;
    *(ulong *)this = uVar4 | 1;
LAB_00bc4850:
    memset(__s,(uint)(byte)param_2,param_1);
    if (((byte)*this & 1) == 0) {
LAB_00bc481c:
      *this = SUB41((int)param_1 << 1,0);
      goto LAB_00bc486c;
    }
  }
  else {
    __s = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
           (this + 0x10);
    if ((uVar4 & 1) == 0) {
      __s = this + 1;
    }
    if (param_1 != 0) goto LAB_00bc4850;
    if ((uVar4 & 1) == 0) goto LAB_00bc481c;
  }
  *(ulong *)(this + 8) = param_1;
LAB_00bc486c:
  __s[param_1] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0
  ;
  return this;
}

