/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3b60
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::basic_string(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
basic_string(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
            basic_string_conflict *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  if (((byte)*param_1 & 1) == 0) {
    uVar2 = *(undefined8 *)(param_1 + 8);
    uVar1 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    *(undefined8 *)(this + 8) = uVar2;
    *(undefined8 *)this = uVar1;
    return;
  }
  FUN_007ff40c(this,*(undefined8 *)(param_1 + 0x10),*(undefined8 *)(param_1 + 8));
  return;
}

