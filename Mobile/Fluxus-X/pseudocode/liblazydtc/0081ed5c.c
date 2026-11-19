/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081ed5c
 */

void FUN_0081ed5c(long *param_1)

{
  ios_base *this;
  
  param_1[0x14] = 0;
  param_1[0xe] = (long)&PTR_FUN_00c51798;
  *param_1 = (long)&PTR__basic_ostream_00c517c8;
  param_1[0xe] = (long)&PTR__basic_ostream_00c517f0;
  this = (ios_base *)((long)param_1 + *(long *)(*param_1 + -0x18));
                    /* try { // try from 0081edb4 to 0081edbf has its CatchHandler @ 0081ee78 */
  std::__ndk1::ios_base::init(this,param_1 + 1);
  *(undefined8 *)(this + 0x88) = 0;
  *(undefined4 *)(this + 0x90) = 0xffffffff;
  param_1[0xe] = (long)&PTR_FUN_00c51798;
  *param_1 = (long)&PTR_FUN_00c51770;
  param_1[1] = (long)&PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::locale((locale *)(param_1 + 2));
  param_1[1] = (long)&PTR_LAB_00c4e678;
  param_1[10] = 0;
  param_1[9] = 0;
  param_1[6] = 0;
  param_1[5] = 0;
  param_1[8] = 0;
  param_1[7] = 0;
  param_1[4] = 0;
  param_1[3] = 0;
  param_1[0xc] = 0;
  param_1[0xb] = 0;
  *(undefined4 *)(param_1 + 0xd) = 0x10;
                    /* try { // try from 0081ee1c to 0081ee23 has its CatchHandler @ 0081ee3c */
  FUN_0081f034(param_1 + 1);
  return;
}

