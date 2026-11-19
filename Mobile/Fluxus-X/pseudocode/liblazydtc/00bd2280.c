/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2280
 */

/* std::__ndk1::basic_iostream<char, std::__ndk1::char_traits<char>
   >::basic_iostream(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >*) */

void std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::basic_iostream
               (basic_streambuf *param_1)

{
  ios_base *this;
  long *in_x1;
  void *in_x2;
  long lVar1;
  long lVar2;
  basic_streambuf *pbVar3;
  
  lVar1 = in_x1[1];
  *(long *)param_1 = lVar1;
  lVar1 = *(long *)(lVar1 + -0x18);
  lVar2 = in_x1[2];
  *(undefined8 *)(param_1 + 8) = 0;
  *(long *)(param_1 + lVar1) = lVar2;
  this = (ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18));
  ios_base::init(this,in_x2);
  *(undefined8 *)(this + 0x88) = 0;
  *(undefined4 *)(this + 0x90) = 0xffffffff;
  lVar1 = in_x1[3];
  pbVar3 = param_1 + 0x10;
  *(long *)pbVar3 = lVar1;
  *(long *)(pbVar3 + *(long *)(lVar1 + -0x18)) = in_x1[4];
  lVar1 = *in_x1;
  *(long *)param_1 = lVar1;
  *(long *)(param_1 + *(long *)(lVar1 + -0x18)) = in_x1[5];
  *(long *)pbVar3 = in_x1[6];
  return;
}

