/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900340
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >& std::__ndk1::getline<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >(std::__ndk1::basic_istream<char,
   std::__ndk1::char_traits<char> >&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, char) */

basic_istream *
std::__ndk1::getline<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
          (basic_istream *param_1,basic_string_conflict *param_2,char param_3)

{
  ios_base *this;
  byte *pbVar1;
  uint uVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  
  lVar4 = *(long *)param_1;
  this = (ios_base *)(param_1 + *(long *)(lVar4 + -0x18));
  if (*(uint *)(this + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
      basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this + 0x88));
      lVar4 = *(long *)param_1;
      if (*(int *)(param_1 + *(long *)(lVar4 + -0x18) + 0x20) != 0) {
        return param_1;
      }
    }
    if (((byte)*param_2 & 1) == 0) {
      *(undefined2 *)param_2 = 0;
    }
    else {
      **(undefined1 **)(param_2 + 0x10) = 0;
      *(undefined8 *)(param_2 + 8) = 0;
    }
    lVar5 = 0;
    while( true ) {
      plVar3 = *(long **)(param_1 + *(long *)(lVar4 + -0x18) + 0x28);
      pbVar1 = (byte *)plVar3[3];
      if (pbVar1 == (byte *)plVar3[4]) {
                    /* try { // try from 00900410 to 00900413 has its CatchHandler @ 00900490 */
        uVar2 = (**(code **)(*plVar3 + 0x50))();
        if (uVar2 == 0xffffffff) {
          uVar2 = 6;
          if (lVar5 != 0) {
            uVar2 = 2;
          }
          goto LAB_0090046c;
        }
      }
      else {
        plVar3[3] = (long)(pbVar1 + 1);
        uVar2 = (uint)*pbVar1;
      }
      if ((uVar2 & 0xff) == (uint)(byte)param_3) {
        uVar2 = 0;
        goto LAB_0090046c;
      }
                    /* try { // try from 0090042c to 00900437 has its CatchHandler @ 00900494 */
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
                ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 param_2,(char)uVar2);
      if ((((byte)*param_2 & 1) != 0) && (*(long *)(param_2 + 8) == -0x11)) break;
      lVar4 = *(long *)param_1;
      lVar5 = lVar5 + -1;
    }
    uVar2 = 4;
LAB_0090046c:
                    /* try { // try from 00900480 to 00900483 has its CatchHandler @ 00900488 */
    ios_base::clear((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                    *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) |
                    uVar2);
  }
  else {
                    /* try { // try from 00900378 to 0090039f has its CatchHandler @ 0090048c */
    ios_base::clear(this,*(uint *)(this + 0x20) | 4);
  }
  return param_1;
}

