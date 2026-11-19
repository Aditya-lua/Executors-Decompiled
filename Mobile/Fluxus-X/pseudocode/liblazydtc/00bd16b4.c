/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd16b4
 */

basic_ostream * FUN_00bd16b4(basic_ostream *param_1,undefined8 param_2)

{
  basic_ostream *pbVar1;
  uint uVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_58 [16];
  locale alStack_48 [8];
  
                    /* try { // try from 00bd16d8 to 00bd16e3 has its CatchHandler @ 00bd1810 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::sentry(local_58,param_1);
  if (local_58[0] == (sentry)0x1) {
                    /* try { // try from 00bd16f8 to 00bd1703 has its CatchHandler @ 00bd17fc */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd1704 to 00bd1713 has its CatchHandler @ 00bd17ec */
    plVar3 = (long *)std::__ndk1::locale::use_facet
                               (alStack_48,
                                (id *)&std::__ndk1::
                                       num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                       ::id);
    std::__ndk1::locale::~locale(alStack_48);
    pbVar1 = param_1 + *(long *)(*(long *)param_1 + -0x18);
    uVar2 = *(uint *)(pbVar1 + 0x90);
    uVar6 = *(undefined8 *)(pbVar1 + 0x28);
    if (uVar2 == 0xffffffff) {
                    /* try { // try from 00bd173c to 00bd174b has its CatchHandler @ 00bd1800 */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd174c to 00bd176b has its CatchHandler @ 00bd17e8 */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_48,(id *)&std::__ndk1::ctype<char>::id);
      uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_48);
      uVar2 = uVar2 & 0xff;
      *(uint *)(pbVar1 + 0x90) = uVar2;
    }
                    /* try { // try from 00bd178c to 00bd179b has its CatchHandler @ 00bd1800 */
    lVar5 = (**(code **)(*plVar3 + 0x28))(plVar3,uVar6,pbVar1,uVar2,param_2);
    if (lVar5 == 0) {
                    /* try { // try from 00bd17b4 to 00bd17bb has its CatchHandler @ 00bd17e4 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry(local_58);
  return param_1;
}

