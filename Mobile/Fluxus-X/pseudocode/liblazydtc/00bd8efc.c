/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd8efc
 */

void FUN_00bd8efc(undefined8 *param_1,undefined8 param_2)

{
  long *plVar1;
  locale alStack_28 [8];
  
  plVar1 = param_1 + 0x15;
  *plVar1 = (long)&PTR__basic_streambuf_00cacde8;
  param_1[0x22] = 0;
  std::__ndk1::locale::locale((locale *)(param_1 + 0x16));
  *plVar1 = (long)&PTR__basic_streambuf_00cad400;
  param_1[0x1d] = param_2;
  param_1[0x1f] = param_1 + 0x22;
  param_1[0x1a] = 0;
  param_1[0x19] = 0;
  param_1[0x1c] = 0;
  param_1[0x1b] = 0;
  param_1[0x18] = 0;
  param_1[0x17] = 0;
  *(undefined4 *)((long)param_1 + 0x104) = 0xffffffff;
  *(undefined1 *)(param_1 + 0x21) = 0;
  std::__ndk1::locale::locale(alStack_28,(locale *)(param_1 + 0x16));
                    /* try { // try from 00bd8f80 to 00bd8f8b has its CatchHandler @ 00bd8ff8 */
  (**(code **)(*plVar1 + 0x10))(plVar1,alStack_28);
  std::__ndk1::locale::~locale(alStack_28);
  param_1[8] = 0;
  *(undefined ***)(param_1 + 2) = &PTR__basic_istream_00cace98;
  *param_1 = &PTR__basic_istream_00cace70;
  param_1[1] = 0;
                    /* try { // try from 00bd8fb4 to 00bd8fbf has its CatchHandler @ 00bd8fe4 */
  std::__ndk1::ios_base::init((ios_base *)(param_1 + 2),plVar1);
  param_1[0x13] = 0;
  *(undefined4 *)(param_1 + 0x14) = 0xffffffff;
  return;
}

