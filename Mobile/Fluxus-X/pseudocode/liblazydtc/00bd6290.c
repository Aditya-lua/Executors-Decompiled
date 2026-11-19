/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd6290
 */

basic_ostream * FUN_00bd6290(basic_ostream *param_1,undefined4 param_2)

{
  basic_ostream *pbVar1;
  int iVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_58 [16];
  locale alStack_48 [8];
  
                    /* try { // try from 00bd62b4 to 00bd62bf has its CatchHandler @ 00bd63ec */
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_58,param_1);
  if (local_58[0] == (sentry)0x1) {
                    /* try { // try from 00bd62d4 to 00bd62df has its CatchHandler @ 00bd63d8 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd62e0 to 00bd62ef has its CatchHandler @ 00bd63c8 */
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
                    /* try { // try from 00bd6318 to 00bd6327 has its CatchHandler @ 00bd63dc */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6328 to 00bd6347 has its CatchHandler @ 00bd63c4 */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_48,(id *)&std::__ndk1::ctype<wchar_t>::id);
      iVar2 = (**(code **)(*plVar4 + 0x58))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_48);
      *(int *)(pbVar1 + 0x90) = iVar2;
    }
                    /* try { // try from 00bd636c to 00bd6377 has its CatchHandler @ 00bd63dc */
    lVar5 = (**(code **)(*plVar3 + 0x30))(plVar3,uVar6,pbVar1,iVar2,param_2);
    if (lVar5 == 0) {
                    /* try { // try from 00bd6390 to 00bd6397 has its CatchHandler @ 00bd63c0 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(local_58);
  return param_1;
}

