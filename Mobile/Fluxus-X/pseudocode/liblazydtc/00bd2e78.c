/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2e78
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::sentry::sentry(std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >&, bool)
    */

void __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
          (sentry *this,basic_istream *param_1,bool param_2)

{
  ios_base *this_00;
  undefined4 uVar1;
  int iVar2;
  long *plVar3;
  ulong uVar4;
  long lVar5;
  long *plVar6;
  locale alStack_38 [8];
  
  lVar5 = *(long *)param_1;
  *this = (sentry)0x0;
  this_00 = (ios_base *)(param_1 + *(long *)(lVar5 + -0x18));
  if (*(uint *)(this_00 + 0x20) != 0) {
    ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 4);
    return;
  }
  if (*(basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> **)(this_00 + 0x88) !=
      (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *)0x0) {
    basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::flush
              (*(basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> **)(this_00 + 0x88));
    lVar5 = *(long *)param_1;
  }
  if ((!param_2) && (((byte)param_1[*(long *)(lVar5 + -0x18) + 9] >> 4 & 1) != 0)) {
    ios_base::getloc();
                    /* try { // try from 00bd2f00 to 00bd2f0f has its CatchHandler @ 00bd304c */
    plVar3 = (long *)locale::use_facet(alStack_38,(id *)&ctype<wchar_t>::id);
    locale::~locale(alStack_38);
    plVar6 = *(long **)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28);
    if (plVar6 == (long *)0x0) {
LAB_00bd2f30:
      lVar5 = *(long *)param_1;
    }
    else {
      while( true ) {
        if ((int *)plVar6[3] == (int *)plVar6[4]) {
          iVar2 = (**(code **)(*plVar6 + 0x48))(plVar6);
        }
        else {
          iVar2 = *(int *)plVar6[3];
        }
        if (iVar2 == -1) goto LAB_00bd2f30;
        if ((undefined4 *)plVar6[3] == (undefined4 *)plVar6[4]) {
          uVar1 = (**(code **)(*plVar6 + 0x48))(plVar6);
        }
        else {
          uVar1 = *(undefined4 *)plVar6[3];
        }
        uVar4 = (**(code **)(*plVar3 + 0x18))(plVar3,1,uVar1);
        if ((uVar4 & 1) == 0) break;
        if (plVar6[3] == plVar6[4]) {
          (**(code **)(*plVar6 + 0x50))(plVar6);
        }
        else {
          plVar6[3] = plVar6[3] + 4;
        }
      }
      if ((int *)plVar6[3] == (int *)plVar6[4]) {
        iVar2 = (**(code **)(*plVar6 + 0x48))(plVar6);
      }
      else {
        iVar2 = *(int *)plVar6[3];
      }
      lVar5 = *(long *)param_1;
      if (iVar2 != -1) goto LAB_00bd2f4c;
    }
    ios_base::clear((ios_base *)(param_1 + *(long *)(lVar5 + -0x18)),
                    *(uint *)((ios_base *)(param_1 + *(long *)(lVar5 + -0x18)) + 0x20) | 6);
    lVar5 = *(long *)param_1;
  }
LAB_00bd2f4c:
  *this = (sentry)(*(int *)(param_1 + *(long *)(lVar5 + -0x18) + 0x20) == 0);
  return;
}

