/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0428
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::getline(char*, long, char) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::getline
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2,
          char param_3)

{
  uint uVar1;
  long *plVar2;
  uint uVar3;
  long lVar4;
  char *pcVar5;
  sentry local_54 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_54,(basic_istream *)this,true);
  if (local_54[0] == (sentry)0x1) {
    while( true ) {
      plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
      if ((byte *)plVar2[3] == (byte *)plVar2[4]) {
                    /* try { // try from 00bd04b0 to 00bd04b3 has its CatchHandler @ 00bd060c */
        uVar1 = (**(code **)(*plVar2 + 0x48))();
        if (uVar1 == 0xffffffff) {
          uVar3 = 2;
          uVar1 = 2;
          goto joined_r0x00bd05f8;
        }
      }
      else {
        uVar1 = (uint)*(byte *)plVar2[3];
      }
      if ((uint)(byte)param_3 == (uVar1 & 0xff)) {
        plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
        if (plVar2[3] == plVar2[4]) {
                    /* try { // try from 00bd057c to 00bd057f has its CatchHandler @ 00bd0600 */
          (**(code **)(*plVar2 + 0x50))();
        }
        else {
          plVar2[3] = plVar2[3] + 1;
        }
        if (*(long *)(this + 8) == 0x7fffffffffffffff) goto LAB_00bd0590;
        uVar3 = 0;
        uVar1 = 0;
        *(long *)(this + 8) = *(long *)(this + 8) + 1;
        goto joined_r0x00bd05f8;
      }
      if (param_2 + -1 <= *(long *)(this + 8)) break;
      lVar4 = *(long *)this;
      pcVar5 = param_1 + 1;
      *param_1 = (char)uVar1;
      plVar2 = *(long **)(this + *(long *)(lVar4 + -0x18) + 0x28);
      if (plVar2[3] == plVar2[4]) {
                    /* try { // try from 00bd0508 to 00bd050b has its CatchHandler @ 00bd0604 */
        (**(code **)(*plVar2 + 0x50))();
      }
      else {
        plVar2[3] = plVar2[3] + 1;
      }
      param_1 = pcVar5;
      if (*(long *)(this + 8) != 0x7fffffffffffffff) {
        *(long *)(this + 8) = *(long *)(this + 8) + 1;
      }
    }
    uVar3 = 4;
    uVar1 = 4;
  }
  else {
LAB_00bd0590:
    uVar3 = 0;
    uVar1 = 0;
  }
joined_r0x00bd05f8:
  if (0 < param_2) {
    *param_1 = '\0';
    uVar1 = uVar3;
  }
  uVar3 = uVar1 | 4;
  if (*(long *)(this + 8) != 0) {
    uVar3 = uVar1;
  }
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar3);
  return this;
}

