/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcf240
 */

basic_istream * FUN_00bcf240(basic_istream *param_1,undefined2 *param_2)

{
  long *plVar1;
  undefined2 uVar2;
  locale alStack_38 [8];
  long local_30;
  sentry local_28 [4];
  uint local_24;
  
  local_24 = 0;
  std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::sentry::sentry
            (local_28,param_1,false);
  if (local_28[0] != (sentry)0x1) {
    return param_1;
  }
                    /* try { // try from 00bcf284 to 00bcf28f has its CatchHandler @ 00bcf344 */
  std::__ndk1::ios_base::getloc();
                    /* try { // try from 00bcf290 to 00bcf2c7 has its CatchHandler @ 00bcf34c */
  plVar1 = (long *)std::__ndk1::locale::use_facet
                             (alStack_38,
                              (id *)&std::__ndk1::
                                     num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                     ::id);
  (**(code **)(*plVar1 + 0x20))
            (plVar1,*(undefined8 *)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28),0,
             param_1 + *(long *)(*(long *)param_1 + -0x18),&local_24,&local_30);
  std::__ndk1::locale::~locale(alStack_38);
  if (local_30 < -0x8000) {
    uVar2 = 0x8000;
  }
  else {
    if (local_30 < 0x8000) {
      *param_2 = (short)local_30;
      goto LAB_00bcf310;
    }
    uVar2 = 0x7fff;
  }
  local_24 = local_24 | 4;
  *param_2 = uVar2;
LAB_00bcf310:
  std::__ndk1::ios_base::clear
            ((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
             *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) |
             local_24);
  return param_1;
}

