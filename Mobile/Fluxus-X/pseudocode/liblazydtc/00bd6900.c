/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd6900
 */

basic_ostream * FUN_00bd6900(basic_ostream *param_1,undefined8 param_2)

{
  basic_ostream *pbVar1;
  int iVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_58 [16];
  locale alStack_48 [8];
  
                    /* try { // try from 00bd6924 to 00bd692f has its CatchHandler @ 00bd6a5c */
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_58,param_1);
  if (local_58[0] == (sentry)0x1) {
                    /* try { // try from 00bd6944 to 00bd694f has its CatchHandler @ 00bd6a48 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6950 to 00bd695f has its CatchHandler @ 00bd6a38 */
    plVar3 = (long *)std::__ndk1::locale::use_facet
                               (alStack_48,
                                (id *)&std::__ndk1::
                                       num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                                       ::id);
    std::__ndk1::locale::~locale(alStack_48);
    pbVar1 = param_1 + *(long *)(*(long *)param_1 + -0x18);
    iVar2 = *(int *)(pbVar1 + 0x90);
    uVar6 = *(undefined8 *)(pbVar1 + 0x28);
    if (iVar2 == -1) {
                    /* try { // try from 00bd6988 to 00bd6997 has its CatchHandler @ 00bd6a4c */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6998 to 00bd69b7 has its CatchHandler @ 00bd6a34 */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_48,(id *)&std::__ndk1::ctype<wchar_t>::id);
      iVar2 = (**(code **)(*plVar4 + 0x58))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_48);
      *(int *)(pbVar1 + 0x90) = iVar2;
    }
                    /* try { // try from 00bd69d8 to 00bd69e7 has its CatchHandler @ 00bd6a4c */
    lVar5 = (**(code **)(*plVar3 + 0x38))(plVar3,uVar6,pbVar1,iVar2,param_2);
    if (lVar5 == 0) {
                    /* try { // try from 00bd6a00 to 00bd6a07 has its CatchHandler @ 00bd6a30 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(local_58);
  return param_1;
}

