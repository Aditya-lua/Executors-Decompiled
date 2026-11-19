/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081ec44
 */

void FUN_0081ec44(long *param_1,byte *param_2,uint param_3)

{
  ios_base *piVar1;
  long lVar2;
  byte *pbVar3;
  
  param_1[0x1d] = 0;
  param_1[0x17] = (long)&PTR_LAB_00c51c18;
  *param_1 = (long)&PTR__basic_istream_00c51c48;
  param_1[1] = 0;
  param_1[0x17] = (long)&PTR__basic_istream_00c51c70;
  piVar1 = (ios_base *)((long)param_1 + *(long *)(*param_1 + -0x18));
                    /* try { // try from 0081eca8 to 0081ecb3 has its CatchHandler @ 0081ed2c */
  std::__ndk1::ios_base::init(piVar1,param_1 + 2);
  *(undefined8 *)(piVar1 + 0x88) = 0;
  *(undefined4 *)(piVar1 + 0x90) = 0xffffffff;
  *param_1 = (long)&PTR_FUN_00c51bf0;
  param_1[0x17] = (long)&PTR_LAB_00c51c18;
                    /* try { // try from 0081eccc to 0081ecd3 has its CatchHandler @ 0081ed24 */
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf
            ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 2));
  pbVar3 = *(byte **)(param_2 + 0x10);
  if ((*param_2 & 1) == 0) {
    pbVar3 = param_2 + 1;
  }
                    /* try { // try from 0081ece4 to 0081ed0b has its CatchHandler @ 0081ed34 */
  lVar2 = std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::open
                    ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 2),
                     (char *)pbVar3,param_3 | 8);
  if (lVar2 == 0) {
    piVar1 = (ios_base *)((long)param_1 + *(long *)(*param_1 + -0x18));
    std::__ndk1::ios_base::clear(piVar1,*(uint *)(piVar1 + 0x20) | 4);
  }
  return;
}

