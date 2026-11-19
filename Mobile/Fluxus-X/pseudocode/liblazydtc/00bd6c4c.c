/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd6c4c
 */

basic_ostream * FUN_00bd6c4c(undefined8 param_1,basic_ostream *param_2)

{
  basic_ostream *pbVar1;
  int iVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_50 [16];
  locale alStack_28 [8];
  
                    /* try { // try from 00bd6c70 to 00bd6c7b has its CatchHandler @ 00bd6da8 */
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_50,param_2);
  if (local_50[0] == (sentry)0x1) {
                    /* try { // try from 00bd6c90 to 00bd6c9b has its CatchHandler @ 00bd6d94 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6c9c to 00bd6cab has its CatchHandler @ 00bd6d84 */
    plVar3 = (long *)std::__ndk1::locale::use_facet
                               (alStack_28,
                                (id *)&std::__ndk1::
                                       num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                                       ::id);
    std::__ndk1::locale::~locale(alStack_28);
    pbVar1 = param_2 + *(long *)(*(long *)param_2 + -0x18);
    iVar2 = *(int *)(pbVar1 + 0x90);
    uVar6 = *(undefined8 *)(pbVar1 + 0x28);
    if (iVar2 == -1) {
                    /* try { // try from 00bd6cd4 to 00bd6ce3 has its CatchHandler @ 00bd6d98 */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6ce4 to 00bd6d03 has its CatchHandler @ 00bd6d80 */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_28,(id *)&std::__ndk1::ctype<wchar_t>::id);
      iVar2 = (**(code **)(*plVar4 + 0x58))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_28);
      *(int *)(pbVar1 + 0x90) = iVar2;
    }
                    /* try { // try from 00bd6d24 to 00bd6d33 has its CatchHandler @ 00bd6d98 */
    lVar5 = (**(code **)(*plVar3 + 0x48))(param_1,plVar3,uVar6,pbVar1,iVar2);
    if (lVar5 == 0) {
                    /* try { // try from 00bd6d4c to 00bd6d53 has its CatchHandler @ 00bd6d7c */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_2 + *(long *)(*(long *)param_2 + -0x18)),
                 *(uint *)((ios_base *)(param_2 + *(long *)(*(long *)param_2 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(local_50);
  return param_2;
}

