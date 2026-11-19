/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd38f4
 */

basic_istream * FUN_00bd38f4(basic_istream *param_1,undefined8 param_2)

{
  long *plVar1;
  locale alStack_30 [8];
  sentry local_28 [4];
  uint local_24;
  
  local_24 = 0;
  std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_28,param_1,false);
  if (local_28[0] == (sentry)0x1) {
                    /* try { // try from 00bd3938 to 00bd3943 has its CatchHandler @ 00bd39b8 */
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd3944 to 00bd397b has its CatchHandler @ 00bd39c0 */
    plVar1 = (long *)std::__ndk1::locale::use_facet
                               (alStack_30,
                                (id *)&std::__ndk1::
                                       num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                                       ::id);
    (**(code **)(*plVar1 + 0x38))
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

