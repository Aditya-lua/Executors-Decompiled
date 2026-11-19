/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097b0bc
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::sentry::sentry(std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >&, bool) */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::sentry::sentry
          (sentry *this,basic_istream *param_1,bool param_2)

{
  ios_base *this_00;
  long lVar1;
  long *plVar2;
  byte bVar3;
  int iVar4;
  long lVar5;
  long *plVar6;
  locale alStack_50 [8];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  *this = (sentry)0x0;
  this_00 = (ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18));
  if (*(uint *)(this_00 + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
      basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88));
    }
    if ((!param_2) && (((byte)param_1[*(long *)(*(long *)param_1 + -0x18) + 9] >> 4 & 1) != 0)) {
      ios_base::getloc();
                    /* try { // try from 0097b13c to 0097b14b has its CatchHandler @ 0097b2ac */
      lVar5 = locale::use_facet(alStack_50,(id *)&ctype<char>::id);
      locale::~locale(alStack_50);
      plVar6 = *(long **)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28);
      while (plVar6 != (long *)0x0) {
        while( true ) {
          if ((plVar6[3] == plVar6[4]) &&
             (iVar4 = (**(code **)(*plVar6 + 0x48))(plVar6), iVar4 == -1)) goto LAB_0097b24c;
          if ((byte *)plVar6[3] == (byte *)plVar6[4]) {
            bVar3 = (**(code **)(*plVar6 + 0x48))(plVar6);
          }
          else {
            bVar3 = *(byte *)plVar6[3];
          }
          plVar2 = plVar6;
          if (((char)bVar3 < '\0') ||
             ((*(byte *)(*(long *)(lVar5 + 0x10) + (ulong)bVar3 * 8) & 1) == 0))
          goto joined_r0x0097b218;
          if (plVar6[3] == plVar6[4]) break;
          plVar6[3] = plVar6[3] + 1;
          if (plVar6 == (long *)0x0) goto LAB_0097b208;
        }
        (**(code **)(*plVar6 + 0x50))(plVar6);
      }
LAB_0097b208:
      plVar2 = (long *)0x0;
joined_r0x0097b218:
      if ((plVar6 == (long *)0x0) ||
         ((plVar2[3] == plVar2[4] && (iVar4 = (**(code **)(*plVar6 + 0x48))(), iVar4 == -1)))) {
LAB_0097b24c:
        ios_base::clear((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                        *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20
                                 ) | 6);
      }
    }
    *this = (sentry)(*(int *)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x20) == 0);
  }
  else {
    ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 4);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

