/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0cc28
 */

void FUN_00c0cc28(undefined8 param_1,undefined8 param_2,undefined4 *param_3)

{
  undefined4 uVar1;
  long lVar2;
  long *plVar3;
  long local_50;
  undefined8 *local_48;
  undefined ***local_40;
  undefined8 **local_38;
  
  std::__ndk1::ios_base::getloc();
  local_48 = &std::__ndk1::numpunct<wchar_t>::id;
  if (std::__ndk1::numpunct<wchar_t>::id != -1) {
    local_38 = &local_48;
    local_40 = (undefined ***)&local_38;
                    /* try { // try from 00c0cc7c to 00c0ccdb has its CatchHandler @ 00c0cd00 */
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::numpunct<wchar_t>::id,&local_40,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_50 + 0x18) - *(long *)(local_50 + 0x10) >> 3) <=
       (long)DAT_00d272f8 - 1U) ||
     (plVar3 = *(long **)(*(long *)(local_50 + 0x10) + ((long)DAT_00d272f8 - 1U) * 8),
     plVar3 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00c0ccfc to 00c0ccff has its CatchHandler @ 00c0cd00 */
    FUN_00bd8968();
  }
  uVar1 = (**(code **)(*plVar3 + 0x20))(plVar3);
  lVar2 = *plVar3;
  *param_3 = uVar1;
  (**(code **)(lVar2 + 0x28))(param_1,plVar3);
  std::__ndk1::locale::~locale((locale *)&local_50);
  return;
}

