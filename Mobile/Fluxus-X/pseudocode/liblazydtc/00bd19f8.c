/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd19f8
 */

basic_ostream * FUN_00bd19f8(undefined8 param_1,basic_ostream *param_2)

{
  basic_ostream *pbVar1;
  uint uVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_58 [16];
  locale alStack_48 [8];
  
                    /* try { // try from 00bd1a20 to 00bd1a2b has its CatchHandler @ 00bd1b5c */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::sentry(local_58,param_2);
  if (local_58[0] == (sentry)0x1) {
                    /* try { // try from 00bd1a40 to 00bd1a4b has its CatchHandler @ 00bd1b48 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd1a4c to 00bd1a5b has its CatchHandler @ 00bd1b38 */
    plVar3 = (long *)std::__ndk1::locale::use_facet
                               (alStack_48,
                                (id *)&std::__ndk1::
                                       num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                       ::id);
    std::__ndk1::locale::~locale(alStack_48);
    pbVar1 = param_2 + *(long *)(*(long *)param_2 + -0x18);
    uVar6 = *(undefined8 *)(pbVar1 + 0x28);
    if (*(int *)(pbVar1 + 0x90) == -1) {
                    /* try { // try from 00bd1a84 to 00bd1a93 has its CatchHandler @ 00bd1b4c */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd1a94 to 00bd1ab3 has its CatchHandler @ 00bd1b34 */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_48,(id *)&std::__ndk1::ctype<char>::id);
      uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_48);
      *(uint *)(pbVar1 + 0x90) = uVar2 & 0xff;
    }
                    /* try { // try from 00bd1ad4 to 00bd1ae3 has its CatchHandler @ 00bd1b4c */
    lVar5 = (**(code **)(*plVar3 + 0x40))(param_1,plVar3,uVar6,pbVar1);
    if (lVar5 == 0) {
                    /* try { // try from 00bd1afc to 00bd1b03 has its CatchHandler @ 00bd1b30 */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_2 + *(long *)(*(long *)param_2 + -0x18)),
                 *(uint *)((ios_base *)(param_2 + *(long *)(*(long *)param_2 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry(local_58);
  return param_2;
}

