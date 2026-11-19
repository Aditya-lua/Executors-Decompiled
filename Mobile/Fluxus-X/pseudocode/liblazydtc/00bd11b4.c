/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd11b4
 */

basic_ostream * FUN_00bd11b4(basic_ostream *param_1,ushort param_2)

{
  basic_ostream *pbVar1;
  uint uVar2;
  uint uVar3;
  long *plVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  sentry local_60 [16];
  locale alStack_38 [8];
  
                    /* try { // try from 00bd11dc to 00bd11e7 has its CatchHandler @ 00bd133c */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::sentry(local_60,param_1);
  if (local_60[0] == (sentry)0x1) {
    uVar2 = *(uint *)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 8);
                    /* try { // try from 00bd1204 to 00bd120b has its CatchHandler @ 00bd1328 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd120c to 00bd121b has its CatchHandler @ 00bd1318 */
    plVar4 = (long *)std::__ndk1::locale::use_facet
                               (alStack_38,
                                (id *)&std::__ndk1::
                                       num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                       ::id);
    std::__ndk1::locale::~locale(alStack_38);
    pbVar1 = param_1 + *(long *)(*(long *)param_1 + -0x18);
    uVar3 = *(uint *)(pbVar1 + 0x90);
    uVar8 = *(undefined8 *)(pbVar1 + 0x28);
    if (uVar3 == 0xffffffff) {
                    /* try { // try from 00bd1244 to 00bd1253 has its CatchHandler @ 00bd132c */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd1254 to 00bd1273 has its CatchHandler @ 00bd1314 */
      plVar5 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_38,(id *)&std::__ndk1::ctype<char>::id);
      uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,0x20);
      std::__ndk1::locale::~locale(alStack_38);
      uVar3 = uVar3 & 0xff;
      *(uint *)(pbVar1 + 0x90) = uVar3;
    }
    if (((uVar2 & 0x4a) == 0x40) || ((uVar2 & 0x4a) == 8)) {
      uVar7 = (ulong)param_2;
    }
    else {
      uVar7 = (ulong)(short)param_2;
    }
                    /* try { // try from 00bd12b8 to 00bd12c3 has its CatchHandler @ 00bd132c */
    lVar6 = (**(code **)(*plVar4 + 0x20))(plVar4,uVar8,pbVar1,uVar3,uVar7);
    if (lVar6 == 0) {
                    /* try { // try from 00bd12dc to 00bd12e3 has its CatchHandler @ 00bd1310 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry(local_60);
  return param_1;
}

