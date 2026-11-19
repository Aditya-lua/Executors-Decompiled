/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009848c4
 */

/* ix::Socket::accept(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&) */

undefined8 __thiscall ix::Socket::accept(Socket *this,basic_string_conflict *param_1)

{
  if (*(int *)(this + 8) == -1) {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_1
           ,"Socket is uninitialized",0x17);
    return 0;
  }
  return 1;
}

