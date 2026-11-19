/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd65c8
 */

basic_ostream * FUN_00bd65c8(basic_ostream *param_1,undefined8 param_2)

{
  basic_ostream *pbVar1;
  int iVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_58 [16];
  locale alStack_48 [8];
  
                    /* try { // try from 00bd65ec to 00bd65f7 has its CatchHandler @ 00bd6724 */
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_58,param_1);
  if (local_58[0] == (sentry)0x1) {
                    /* try { // try from 00bd660c to 00bd6617 has its CatchHandler @ 00bd6710 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6618 to 00bd6627 has its CatchHandler @ 00bd6700 */
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
                    /* try { // try from 00bd6650 to 00bd665f has its CatchHandler @ 00bd6714 */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6660 to 00bd667f has its CatchHandler @ 00bd66fc */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_48,(id *)&std::__ndk1::ctype<wchar_t>::id);
      iVar2 = (**(code **)(*plVar4 + 0x58))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_48);
      *(int *)(pbVar1 + 0x90) = iVar2;
    }
                    /* try { // try from 00bd66a0 to 00bd66af has its CatchHandler @ 00bd6714 */
    lVar5 = (**(code **)(*plVar3 + 0x30))(plVar3,uVar6,pbVar1,iVar2,param_2);
    if (lVar5 == 0) {
                    /* try { // try from 00bd66c8 to 00bd66cf has its CatchHandler @ 00bd66f8 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(local_58);
  return param_1;
}

