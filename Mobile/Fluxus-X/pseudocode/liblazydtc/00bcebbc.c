/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcebbc
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::basic_istream(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >*) */

void std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::basic_istream
               (basic_streambuf *param_1)

{
  ios_base *this;
  long *in_x1;
  void *in_x2;
  long lVar1;
  long lVar2;
  
  lVar1 = *in_x1;
  *(long *)param_1 = lVar1;
  lVar1 = *(long *)(lVar1 + -0x18);
  lVar2 = in_x1[1];
  *(undefined8 *)(param_1 + 8) = 0;
  *(long *)(param_1 + lVar1) = lVar2;
  this = (ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18));
  ios_base::init(this,in_x2);
  *(undefined8 *)(this + 0x88) = 0;
  *(undefined4 *)(this + 0x90) = 0xffffffff;
  return;
}

