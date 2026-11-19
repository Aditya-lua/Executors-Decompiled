/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd60c8
 */

basic_ostream * FUN_00bd60c8(basic_ostream *param_1,uint param_2)

{
  basic_ostream *pbVar1;
  uint uVar2;
  int iVar3;
  long *plVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  sentry local_60 [16];
  locale alStack_38 [8];
  
                    /* try { // try from 00bd60f0 to 00bd60fb has its CatchHandler @ 00bd6250 */
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_60,param_1);
  if (local_60[0] == (sentry)0x1) {
    uVar2 = *(uint *)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 8);
                    /* try { // try from 00bd6118 to 00bd611f has its CatchHandler @ 00bd623c */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6120 to 00bd612f has its CatchHandler @ 00bd622c */
    plVar4 = (long *)std::__ndk1::locale::use_facet
                               (alStack_38,
                                (id *)&std::__ndk1::
                                       num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                                       ::id);
    std::__ndk1::locale::~locale(alStack_38);
    pbVar1 = param_1 + *(long *)(*(long *)param_1 + -0x18);
    iVar3 = *(int *)(pbVar1 + 0x90);
    uVar8 = *(undefined8 *)(pbVar1 + 0x28);
    if (iVar3 == -1) {
                    /* try { // try from 00bd6158 to 00bd6167 has its CatchHandler @ 00bd6240 */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd6168 to 00bd6187 has its CatchHandler @ 00bd6228 */
      plVar5 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_38,(id *)&std::__ndk1::ctype<wchar_t>::id);
      iVar3 = (**(code **)(*plVar5 + 0x58))(plVar5,0x20);
      std::__ndk1::locale::~locale(alStack_38);
      *(int *)(pbVar1 + 0x90) = iVar3;
    }
    if (((uVar2 & 0x4a) == 0x40) || ((uVar2 & 0x4a) == 8)) {
      uVar7 = (ulong)param_2;
    }
    else {
      uVar7 = (ulong)(int)param_2;
    }
                    /* try { // try from 00bd61cc to 00bd61d7 has its CatchHandler @ 00bd6240 */
    lVar6 = (**(code **)(*plVar4 + 0x20))(plVar4,uVar8,pbVar1,iVar3,uVar7);
    if (lVar6 == 0) {
                    /* try { // try from 00bd61f0 to 00bd61f7 has its CatchHandler @ 00bd6224 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(local_60);
  return param_1;
}

