/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe518
 */

void FUN_007fe518(long *param_1,char *param_2,uint param_3)

{
  ios_base *piVar1;
  long lVar2;
  
  param_1[0x1d] = 0;
  param_1[0x17] = (long)&PTR_LAB_00c51c18;
  *param_1 = (long)&PTR__basic_istream_00c51c48;
  param_1[1] = 0;
  param_1[0x17] = (long)&PTR__basic_istream_00c51c70;
  piVar1 = (ios_base *)((long)param_1 + *(long *)(*param_1 + -0x18));
                    /* try { // try from 007fe57c to 007fe587 has its CatchHandler @ 007fe5f4 */
  std::__ndk1::ios_base::init(piVar1,param_1 + 2);
  *(undefined8 *)(piVar1 + 0x88) = 0;
  *(undefined4 *)(piVar1 + 0x90) = 0xffffffff;
  *param_1 = (long)&PTR_FUN_00c51bf0;
  param_1[0x17] = (long)&PTR_LAB_00c51c18;
                    /* try { // try from 007fe5a0 to 007fe5a7 has its CatchHandler @ 007fe5ec */
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf
            ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 2));
                    /* try { // try from 007fe5a8 to 007fe5d3 has its CatchHandler @ 007fe5fc */
  lVar2 = std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::open
                    ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 2),param_2,
                     param_3 | 8);
  if (lVar2 == 0) {
    piVar1 = (ios_base *)((long)param_1 + *(long *)(*param_1 + -0x18));
    std::__ndk1::ios_base::clear(piVar1,*(uint *)(piVar1 + 0x20) | 4);
  }
  return;
}

