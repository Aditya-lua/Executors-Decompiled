/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcecf8
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::sentry::sentry(std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >&, bool) */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::sentry::sentry
          (sentry *this,basic_istream *param_1,bool param_2)

{
  ios_base *this_00;
  byte bVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  long *plVar5;
  locale alStack_38 [8];
  
  lVar3 = *(long *)param_1;
  *this = (sentry)0x0;
  this_00 = (ios_base *)(param_1 + *(long *)(lVar3 + -0x18));
  if (*(uint *)(this_00 + 0x20) != 0) {
    ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 4);
    return;
  }
  if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88) !=
      (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
    basic_ostream<char,std::__ndk1::char_traits<char>>::flush
              (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this_00 + 0x88));
    lVar3 = *(long *)param_1;
  }
  if ((param_2) || (((byte)param_1[*(long *)(lVar3 + -0x18) + 9] >> 4 & 1) == 0)) goto LAB_00bcee64;
  ios_base::getloc();
                    /* try { // try from 00bced80 to 00bced8f has its CatchHandler @ 00bceeb4 */
  lVar3 = locale::use_facet(alStack_38,(id *)&ctype<char>::id);
  locale::~locale(alStack_38);
  plVar5 = *(long **)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28);
  if (plVar5 != (long *)0x0) {
LAB_00bcedd4:
    if ((plVar5[3] == plVar5[4]) && (iVar2 = (**(code **)(*plVar5 + 0x48))(plVar5), iVar2 == -1))
    goto LAB_00bcedb0;
    if ((byte *)plVar5[3] == (byte *)plVar5[4]) {
      uVar4 = (**(code **)(*plVar5 + 0x48))(plVar5);
      uVar4 = uVar4 & 0xff;
      if ((uint)uVar4 >> 7 != 0) goto LAB_00bcee54;
    }
    else {
      bVar1 = *(byte *)plVar5[3];
      uVar4 = (ulong)bVar1;
      if ((char)bVar1 < '\0') goto LAB_00bcee54;
    }
    if ((*(ulong *)(*(long *)(lVar3 + 0x10) + uVar4 * 8) & 1) == 0) goto LAB_00bcee54;
    if (plVar5[3] == plVar5[4]) {
      (**(code **)(*plVar5 + 0x50))(plVar5);
    }
    else {
      plVar5[3] = plVar5[3] + 1;
    }
    goto LAB_00bcedd4;
  }
LAB_00bcedb0:
  lVar3 = *(long *)param_1;
LAB_00bcedb4:
  ios_base::clear((ios_base *)(param_1 + *(long *)(lVar3 + -0x18)),
                  *(uint *)((ios_base *)(param_1 + *(long *)(lVar3 + -0x18)) + 0x20) | 6);
LAB_00bcee60:
  lVar3 = *(long *)param_1;
LAB_00bcee64:
  *this = (sentry)(*(int *)(param_1 + *(long *)(lVar3 + -0x18) + 0x20) == 0);
  return;
LAB_00bcee54:
  if (plVar5[3] == plVar5[4]) {
    iVar2 = (**(code **)(*plVar5 + 0x48))(plVar5);
    lVar3 = *(long *)param_1;
    if (iVar2 != -1) goto LAB_00bcee64;
    goto LAB_00bcedb4;
  }
  goto LAB_00bcee60;
}

