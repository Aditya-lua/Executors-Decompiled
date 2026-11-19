/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd7d1c
 */

/* std::__ndk1::basic_ostringstream<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_ostringstream<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&&) */

basic_ostringstream<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_ostringstream<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
operator=(basic_ostringstream<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
          *this,basic_ostringstream *param_1)

{
  ios_base *this_00;
  ios_base *piVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  
  this_00 = (ios_base *)(this + *(long *)(*(long *)this + -0x18));
  piVar1 = (ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18));
  ios_base::swap(this_00,piVar1);
  uVar4 = *(undefined8 *)(this_00 + 0x88);
  uVar2 = *(undefined4 *)(piVar1 + 0x90);
  *(undefined8 *)(this_00 + 0x88) = *(undefined8 *)(piVar1 + 0x88);
  uVar3 = *(undefined4 *)(this_00 + 0x90);
  *(undefined8 *)(piVar1 + 0x88) = uVar4;
  *(undefined4 *)(this_00 + 0x90) = uVar2;
  *(undefined4 *)(piVar1 + 0x90) = uVar3;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::operator=
            ((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             (this + 8),(basic_stringbuf *)(param_1 + 8));
  return this;
}

