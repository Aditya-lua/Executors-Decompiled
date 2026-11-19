/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd9c3c
 */

void FUN_00bd9c3c(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  byte bVar1;
  long *plVar2;
  long lVar3;
  locale alStack_38 [8];
  
  *param_1 = &PTR__basic_streambuf_00cacde8;
  std::__ndk1::locale::locale((locale *)(param_1 + 1));
  *param_1 = &PTR__basic_streambuf_00cad498;
  param_1[8] = param_2;
  param_1[5] = 0;
  param_1[4] = 0;
  param_1[7] = 0;
  param_1[6] = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  std::__ndk1::locale::locale(alStack_38,(locale *)(param_1 + 1));
                    /* try { // try from 00bd9c9c to 00bd9cab has its CatchHandler @ 00bd9cec */
  plVar2 = (long *)std::__ndk1::locale::use_facet
                             (alStack_38,(id *)&std::__ndk1::codecvt<wchar_t,char,mbstate_t>::id);
  std::__ndk1::locale::~locale(alStack_38);
  lVar3 = *plVar2;
  param_1[9] = plVar2;
  param_1[10] = param_3;
  bVar1 = (**(code **)(lVar3 + 0x38))(plVar2);
  *(byte *)(param_1 + 0xb) = bVar1 & 1;
  return;
}

