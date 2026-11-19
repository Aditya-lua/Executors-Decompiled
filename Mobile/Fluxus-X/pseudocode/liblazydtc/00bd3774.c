/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd3774
 */

basic_istream * FUN_00bd3774(basic_istream *param_1,undefined4 *param_2)

{
  long *plVar1;
  undefined4 uVar2;
  locale alStack_38 [8];
  long local_30;
  sentry local_28 [4];
  uint local_24;
  
  local_24 = 0;
  std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry
            (local_28,param_1,false);
  if (local_28[0] != (sentry)0x1) {
    return param_1;
  }
                    /* try { // try from 00bd37b8 to 00bd37c3 has its CatchHandler @ 00bd387c */
  std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bd37c4 to 00bd37fb has its CatchHandler @ 00bd3884 */
  plVar1 = (long *)std::__ndk1::locale::use_facet
                             (alStack_38,
                              (id *)&std::__ndk1::
                                     num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                                     ::id);
  (**(code **)(*plVar1 + 0x20))
            (plVar1,*(undefined8 *)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28),0,
             param_1 + *(long *)(*(long *)param_1 + -0x18),&local_24,&local_30);
  std::__ndk1::locale::~locale(alStack_38);
  if (local_30 < -0x80000000) {
    uVar2 = 0x80000000;
  }
  else {
    if (local_30 < 0x80000000) {
      *param_2 = (int)local_30;
      goto LAB_00bd3848;
    }
    uVar2 = 0x7fffffff;
  }
  local_24 = local_24 | 4;
  *param_2 = uVar2;
LAB_00bd3848:
  std::__ndk1::ios_base::clear
            ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
             *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) |
             local_24);
  return param_1;
}

