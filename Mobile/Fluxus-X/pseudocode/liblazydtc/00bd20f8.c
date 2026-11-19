/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd20f8
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char>
   >::seekp(std::__ndk1::fpos<mbstate_t>) */

basic_ostream *
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::seekp
          (basic_ostream *param_1,undefined8 param_2,undefined8 param_3)

{
  long extraout_x1;
  sentry asStack_40 [16];
  
  sentry::sentry(asStack_40,param_1);
                    /* try { // try from 00bd2150 to 00bd215f has its CatchHandler @ 00bd21a8 */
  if ((((byte)param_1[*(long *)(*(long *)param_1 + -0x18) + 0x20] & 5) == 0) &&
     ((**(code **)(**(long **)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28) + 0x28))
                (*(long **)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x28),param_2,param_3,
                 0x10), extraout_x1 == -1)) {
                    /* try { // try from 00bd2178 to 00bd217f has its CatchHandler @ 00bd21a4 */
    ios_base::clear((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                    *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20) |
                    4);
  }
  sentry::~sentry(asStack_40);
  return param_1;
}

