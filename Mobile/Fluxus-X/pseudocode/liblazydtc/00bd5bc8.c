/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5bc8
 */

basic_ostream * FUN_00bd5bc8(basic_ostream *param_1,uint param_2)

{
  basic_ostream *pbVar1;
  int iVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_58 [16];
  locale alStack_48 [8];
  
                    /* try { // try from 00bd5bec to 00bd5bf7 has its CatchHandler @ 00bd5d24 */
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_58,param_1);
  if (local_58[0] == (sentry)0x1) {
                    /* try { // try from 00bd5c0c to 00bd5c17 has its CatchHandler @ 00bd5d10 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd5c18 to 00bd5c27 has its CatchHandler @ 00bd5d00 */
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
                    /* try { // try from 00bd5c50 to 00bd5c5f has its CatchHandler @ 00bd5d14 */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd5c60 to 00bd5c7f has its CatchHandler @ 00bd5cfc */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_48,(id *)&std::__ndk1::ctype<wchar_t>::id);
      iVar2 = (**(code **)(*plVar4 + 0x58))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_48);
      *(int *)(pbVar1 + 0x90) = iVar2;
    }
                    /* try { // try from 00bd5ca0 to 00bd5caf has its CatchHandler @ 00bd5d14 */
    lVar5 = (**(code **)(*plVar3 + 0x18))(plVar3,uVar6,pbVar1,iVar2,param_2 & 1);
    if (lVar5 == 0) {
                    /* try { // try from 00bd5cc8 to 00bd5ccf has its CatchHandler @ 00bd5cf8 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(local_58);
  return param_1;
}

