/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0de0
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::seekg(std::__ndk1::fpos<mbstate_t>) */

basic_istream *
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::seekg
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
                    /* try { // try from 00bd0e54 to 00bd0e63 has its CatchHandler @ 00bd0ea4 */
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

