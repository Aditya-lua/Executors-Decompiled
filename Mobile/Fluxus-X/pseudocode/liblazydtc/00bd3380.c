/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd3380
 */

basic_istream * FUN_00bd3380(basic_istream *param_1,undefined8 param_2)

{
  long *plVar1;
  locale alStack_30 [8];
  sentry local_28 [4];
  uint local_24;
  
  local_24 = 0;
  std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_28,param_1,false);
  if (local_28[0] == (sentry)0x1) {
                    /* try { // try from 00bd33c4 to 00bd33cf has its CatchHandler @ 00bd3444 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd33d0 to 00bd3407 has its CatchHandler @ 00bd344c */
    plVar1 = (long *)std::__ndk1::locale::use_facet
                               (alStack_30,
                                (id *)&std::__ndk1::
                                       num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                                       ::id);
    (**(code **)(*plVar1 + 0x18))
              (plVar1,*(undefined8 *)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28),0,
               param_1 + *(long *)(*(long *)param_1 + -0x18),&local_24,param_2);
    std::__ndk1::locale::~locale(alStack_30);
    std::__ndk1::ios_base::clear
              ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
               *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) |
               local_24);
  }
  return param_1;
}

