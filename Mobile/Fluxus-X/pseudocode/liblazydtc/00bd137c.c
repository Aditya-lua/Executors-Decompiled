/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd137c
 */

basic_ostream * FUN_00bd137c(basic_ostream *param_1,undefined4 param_2)

{
  basic_ostream *pbVar1;
  uint uVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_58 [16];
  locale alStack_48 [8];
  
                    /* try { // try from 00bd13a0 to 00bd13ab has its CatchHandler @ 00bd14d8 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::sentry(local_58,param_1);
  if (local_58[0] == (sentry)0x1) {
                    /* try { // try from 00bd13c0 to 00bd13cb has its CatchHandler @ 00bd14c4 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd13cc to 00bd13db has its CatchHandler @ 00bd14b4 */
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
                    /* try { // try from 00bd1404 to 00bd1413 has its CatchHandler @ 00bd14c8 */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd1414 to 00bd1433 has its CatchHandler @ 00bd14b0 */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_48,(id *)&std::__ndk1::ctype<char>::id);
      uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_48);
      uVar2 = uVar2 & 0xff;
      *(uint *)(pbVar1 + 0x90) = uVar2;
    }
                    /* try { // try from 00bd1458 to 00bd1463 has its CatchHandler @ 00bd14c8 */
    lVar5 = (**(code **)(*plVar3 + 0x30))(plVar3,uVar6,pbVar1,uVar2,param_2);
    if (lVar5 == 0) {
                    /* try { // try from 00bd147c to 00bd1483 has its CatchHandler @ 00bd14ac */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                 *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry(local_58);
  return param_1;
}

