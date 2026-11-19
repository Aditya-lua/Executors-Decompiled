/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcaab4
 */

void FUN_00bcaab4(undefined8 param_1)

{
  undefined8 uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_38;
  undefined1 auStack_37 [15];
  undefined1 *local_28;
  
  FUN_00bcab58(&local_38,param_1,": no conversion");
  if (((byte)local_38 & 1) == 0) {
    local_28 = auStack_37;
  }
                    /* try { // try from 00bcaaec to 00bcaaef has its CatchHandler @ 00bcaaf0 */
  uVar1 = FUN_00bcab04(local_28);
                    /* catch() { ... } // from try @ 00bcaaec with catch @ 00bcaaf0 */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  ~basic_string(&local_38);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar1);
}

