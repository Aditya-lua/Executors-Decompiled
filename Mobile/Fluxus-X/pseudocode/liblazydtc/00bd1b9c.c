/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd1b9c
 */

basic_ostream * FUN_00bd1b9c(undefined8 param_1,basic_ostream *param_2)

{
  basic_ostream *pbVar1;
  uint uVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  sentry local_50 [16];
  locale alStack_28 [8];
  
                    /* try { // try from 00bd1bc0 to 00bd1bcb has its CatchHandler @ 00bd1cf8 */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::sentry(local_50,param_2);
  if (local_50[0] == (sentry)0x1) {
                    /* try { // try from 00bd1be0 to 00bd1beb has its CatchHandler @ 00bd1ce4 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd1bec to 00bd1bfb has its CatchHandler @ 00bd1cd4 */
    plVar3 = (long *)std::__ndk1::locale::use_facet
                               (alStack_28,
                                (id *)&std::__ndk1::
                                       num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                       ::id);
    std::__ndk1::locale::~locale(alStack_28);
    pbVar1 = param_2 + *(long *)(*(long *)param_2 + -0x18);
    uVar6 = *(undefined8 *)(pbVar1 + 0x28);
    if (*(int *)(pbVar1 + 0x90) == -1) {
                    /* try { // try from 00bd1c24 to 00bd1c33 has its CatchHandler @ 00bd1ce8 */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd1c34 to 00bd1c53 has its CatchHandler @ 00bd1cd0 */
      plVar4 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_28,(id *)&std::__ndk1::ctype<char>::id);
      uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,0x20);
      std::__ndk1::locale::~locale(alStack_28);
      *(uint *)(pbVar1 + 0x90) = uVar2 & 0xff;
    }
                    /* try { // try from 00bd1c74 to 00bd1c83 has its CatchHandler @ 00bd1ce8 */
    lVar5 = (**(code **)(*plVar3 + 0x48))(param_1,plVar3,uVar6,pbVar1);
    if (lVar5 == 0) {
                    /* try { // try from 00bd1c9c to 00bd1ca3 has its CatchHandler @ 00bd1ccc */
      std::__ndk1::ios_base::clear
                ((ios_base *)(param_2 + *(long *)(*(long *)param_2 + -0x18)),
                 *(uint *)((ios_base *)(param_2 + *(long *)(*(long *)param_2 + -0x18)) + 0x20) | 5);
    }
  }
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry(local_50);
  return param_2;
}

