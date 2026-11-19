/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0210
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::get(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >&, char) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,basic_streambuf *param_1,
          char param_2)

{
  uint uVar1;
  undefined1 *puVar2;
  uint uVar3;
  int iVar4;
  long *plVar5;
  sentry local_24 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] == (sentry)0x1) {
    while( true ) {
      plVar5 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
      if ((byte *)plVar5[3] == (byte *)plVar5[4]) {
                    /* try { // try from 00bd02ac to 00bd02af has its CatchHandler @ 00bd0370 */
        uVar3 = (**(code **)(*plVar5 + 0x48))();
        if (uVar3 == 0xffffffff) {
          uVar3 = 2;
          goto LAB_00bd0330;
        }
      }
      else {
        uVar3 = (uint)*(byte *)plVar5[3];
      }
      if ((uint)(byte)param_2 == (uVar3 & 0xff)) break;
      puVar2 = *(undefined1 **)(param_1 + 0x30);
      if (puVar2 == *(undefined1 **)(param_1 + 0x38)) {
                    /* try { // try from 00bd02e8 to 00bd031f has its CatchHandler @ 00bd0374 */
        iVar4 = (**(code **)(*(long *)param_1 + 0x68))(param_1,uVar3 & 0xff);
        if (iVar4 == -1) break;
      }
      else {
        *(undefined1 **)(param_1 + 0x30) = puVar2 + 1;
        *puVar2 = (char)uVar3;
      }
      if (*(long *)(this + 8) != 0x7fffffffffffffff) {
        *(long *)(this + 8) = *(long *)(this + 8) + 1;
      }
      plVar5 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
      if (plVar5[3] == plVar5[4]) {
        (**(code **)(*plVar5 + 0x50))();
      }
      else {
        plVar5[3] = plVar5[3] + 1;
      }
    }
    uVar3 = 0;
LAB_00bd0330:
    uVar1 = uVar3 | 4;
    if (*(long *)(this + 8) != 0) {
      uVar1 = uVar3;
    }
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar1)
    ;
  }
  return this;
}

