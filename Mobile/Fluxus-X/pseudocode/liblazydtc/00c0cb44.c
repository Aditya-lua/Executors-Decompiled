/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0cb44
 */

undefined8 FUN_00c0cb44(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long *plVar1;
  long local_48;
  undefined8 *local_40;
  undefined8 ***local_38;
  undefined8 **local_18;
  
  std::__ndk1::ios_base::getloc();
  local_40 = &std::__ndk1::ctype<wchar_t>::id;
  if (std::__ndk1::ctype<wchar_t>::id != -1) {
    local_18 = &local_40;
    local_38 = &local_18;
                    /* try { // try from 00c0cb98 to 00c0cbeb has its CatchHandler @ 00c0cc14 */
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::ctype<wchar_t>::id,&local_38,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_48 + 0x18) - *(long *)(local_48 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (plVar1 = *(long **)(*(long *)(local_48 + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     plVar1 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00c0cc10 to 00c0cc13 has its CatchHandler @ 00c0cc14 */
    FUN_00bd8968();
  }
  (**(code **)(*plVar1 + 0x60))(plVar1,"0123456789abcdefABCDEFxX+-pPiInN","pPiInN",param_3);
  std::__ndk1::locale::~locale((locale *)&local_48);
  return param_3;
}

