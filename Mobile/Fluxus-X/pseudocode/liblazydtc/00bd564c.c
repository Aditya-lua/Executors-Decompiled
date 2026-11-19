/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd564c
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::seekg(std::__ndk1::fpos<mbstate_t>) */

basic_istream *
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekg
          (basic_istream *param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  uint uVar2;
  long extraout_x1;
  sentry local_34 [4];
  
  uVar1 = *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) & 0xfffffffd
  ;
  ios_base::clear((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),uVar1);
  sentry::sentry(local_34,param_1,true);
  if (local_34[0] == (sentry)0x1) {
                    /* try { // try from 00bd56c0 to 00bd56cf has its CatchHandler @ 00bd5710 */
    (**(code **)(**(long **)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28) + 0x28))
              (*(long **)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28),param_2,param_3,8);
    uVar2 = uVar1 | 4;
    if (extraout_x1 != -1) {
      uVar2 = uVar1;
    }
    ios_base::clear((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                    *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) |
                    uVar2);
  }
  return param_1;
}

