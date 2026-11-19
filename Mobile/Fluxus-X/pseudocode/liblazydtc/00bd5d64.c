/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5d64
 */

basic_ostream * FUN_00bd5d64(basic_ostream *param_1,ushort param_2)

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
  
                    /* try { // try from 00bd5d8c to 00bd5d97 has its CatchHandler @ 00bd5eec */
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_60,param_1);
  if (local_60[0] == (sentry)0x1) {
    uVar2 = *(uint *)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 8);
                    /* try { // try from 00bd5db4 to 00bd5dbb has its CatchHandler @ 00bd5ed8 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd5dbc to 00bd5dcb has its CatchHandler @ 00bd5ec8 */
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
                    /* try { // try from 00bd5df4 to 00bd5e03 has its CatchHandler @ 00bd5edc */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd5e04 to 00bd5e23 has its CatchHandler @ 00bd5ec4 */
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
      uVar7 = (ulong)(short)param_2;
    }
                    /* try { // try from 00bd5e68 to 00bd5e73 has its CatchHandler @ 00bd5edc */
    lVar6 = (**(code **)(*plVar4 + 0x20))(plVar4,uVar8,pbVar1,iVar3,uVar7);
    if (lVar6 == 0) {
                    /* try { // try from 00bd5e8c to 00bd5e93 has its CatchHandler @ 00bd5ec0 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(local_60);
  return param_1;
}

