/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd6aa8
 */

basic_ostream * FUN_00bd6aa8(undefined8 param_1,basic_ostream *param_2)

{
  basic_ostream *pbVar1;
  int iVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_58 [16];
  locale alStack_48 [8];
  
                    /* try { // try from 00bd6ad0 to 00bd6adb has its CatchHandler @ 00bd6c0c */
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_58,param_2);
  if (local_58[0] == (sentry)0x1) {
                    /* try { // try from 00bd6af0 to 00bd6afb has its CatchHandler @ 00bd6bf8 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6afc to 00bd6b0b has its CatchHandler @ 00bd6be8 */
    plVar3 = (long *)std::__ndk1::locale::use_facet
                               (alStack_48,
                                (id *)&std::__ndk1::
                                       num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                                       ::id);
    std::__ndk1::locale::~locale(alStack_48);
    pbVar1 = param_2 + *(long *)(*(long *)param_2 + -0x18);
    iVar2 = *(int *)(pbVar1 + 0x90);
    uVar6 = *(undefined8 *)(pbVar1 + 0x28);
    if (iVar2 == -1) {
                    /* try { // try from 00bd6b34 to 00bd6b43 has its CatchHandler @ 00bd6bfc */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6b44 to 00bd6b63 has its CatchHandler @ 00bd6be4 */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_48,(id *)&std::__ndk1::ctype<wchar_t>::id);
      iVar2 = (**(code **)(*plVar4 + 0x58))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_48);
      *(int *)(pbVar1 + 0x90) = iVar2;
    }
                    /* try { // try from 00bd6b84 to 00bd6b93 has its CatchHandler @ 00bd6bfc */
    lVar5 = (**(code **)(*plVar3 + 0x40))(param_1,plVar3,uVar6,pbVar1,iVar2);
    if (lVar5 == 0) {
                    /* try { // try from 00bd6bac to 00bd6bb3 has its CatchHandler @ 00bd6be0 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_2 + *(long *)(*(long *)param_2 + -0x18)),
                 *(uint *)((ios_base *)(param_2 + *(long *)(*(long *)param_2 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(local_58);
  return param_2;
}

