/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081f528
 */

void FUN_0081f528(long *param_1,byte *param_2,uint param_3)

{
  ios_base *piVar1;
  long lVar2;
  byte *pbVar3;
  
  param_1[0x1c] = 0;
  param_1[0x16] = (long)&PTR_FUN_00cad228;
  *param_1 = (long)&PTR__basic_ostream_00cad270;
  param_1[0x16] = (long)&PTR__basic_ostream_00cad298;
  piVar1 = (ios_base *)((long)param_1 + *(long *)(*param_1 + -0x18));
                    /* try { // try from 0081f588 to 0081f593 has its CatchHandler @ 0081f60c */
  std::__ndk1::ios_base::init(piVar1,param_1 + 1);
  *(undefined8 *)(piVar1 + 0x88) = 0;
  *(undefined4 *)(piVar1 + 0x90) = 0xffffffff;
  *param_1 = (long)&PTR_FUN_00cad200;
  param_1[0x16] = (long)&PTR_FUN_00cad228;
                    /* try { // try from 0081f5ac to 0081f5b3 has its CatchHandler @ 0081f604 */
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf
            ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 1));
  pbVar3 = *(byte **)(param_2 + 0x10);
  if ((*param_2 & 1) == 0) {
    pbVar3 = param_2 + 1;
  }
                    /* try { // try from 0081f5c4 to 0081f5eb has its CatchHandler @ 0081f614 */
  lVar2 = std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::open
                    ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 1),
                     (char *)pbVar3,param_3 | 0x10);
  if (lVar2 == 0) {
    piVar1 = (ios_base *)((long)param_1 + *(long *)(*param_1 + -0x18));
    std::__ndk1::ios_base::clear(piVar1,*(uint *)(piVar1 + 0x20) | 4);
  }
  return;
}

