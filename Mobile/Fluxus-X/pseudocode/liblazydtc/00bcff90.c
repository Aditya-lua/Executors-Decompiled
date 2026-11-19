/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcff90
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::get(char*, long, char) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2,
          char param_3)

{
  uint uVar1;
  long *plVar2;
  uint uVar3;
  long lVar4;
  char *pcVar5;
  sentry local_34 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_34,(basic_istream *)this,true);
  if (local_34[0] == (sentry)0x1) {
    if (param_2 < 1) {
      uVar1 = 4;
    }
    else {
      lVar4 = *(long *)(this + 8);
      if (lVar4 < param_2 + -1) {
        do {
          plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
          if ((byte *)plVar2[3] == (byte *)plVar2[4]) {
                    /* try { // try from 00bd0050 to 00bd0053 has its CatchHandler @ 00bd0128 */
            uVar1 = (**(code **)(*plVar2 + 0x48))();
            if (uVar1 == 0xffffffff) {
              uVar3 = 2;
              goto LAB_00bd00c8;
            }
          }
          else {
            uVar1 = (uint)*(byte *)plVar2[3];
          }
          if ((uint)(byte)param_3 == (uVar1 & 0xff)) {
            uVar3 = 0;
            goto LAB_00bd00c8;
          }
          pcVar5 = param_1 + 1;
          *param_1 = (char)uVar1;
          lVar4 = 0x7fffffffffffffff;
          if (*(long *)(this + 8) != 0x7fffffffffffffff) {
            lVar4 = *(long *)(this + 8) + 1;
            *(long *)(this + 8) = lVar4;
          }
          plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
          if (plVar2[3] == plVar2[4]) {
                    /* try { // try from 00bd0094 to 00bd0097 has its CatchHandler @ 00bd0120 */
            (**(code **)(*plVar2 + 0x50))();
            lVar4 = *(long *)(this + 8);
          }
          else {
            plVar2[3] = plVar2[3] + 1;
          }
          param_1 = pcVar5;
        } while (lVar4 < param_2 + -1);
        uVar3 = 0;
LAB_00bd00c8:
        lVar4 = *(long *)(this + 8);
      }
      else {
        uVar3 = 0;
      }
      uVar1 = uVar3 | 4;
      if (lVar4 != 0) {
        uVar1 = uVar3;
      }
      *param_1 = '\0';
    }
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar1)
    ;
  }
  if (0 < param_2) {
    *param_1 = '\0';
  }
  return this;
}

