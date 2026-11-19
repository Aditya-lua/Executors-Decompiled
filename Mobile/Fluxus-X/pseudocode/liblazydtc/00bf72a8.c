/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf72a8
 */

void FUN_00bf72a8(long param_1,long param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  long *plVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 *local_48;
  undefined ***local_40;
  undefined8 **local_38;
  
  local_48 = &std::__ndk1::
              time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
              id;
  if (std::__ndk1::
      time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::id != -1
     ) {
    local_38 = &local_48;
    local_40 = (undefined ***)&local_38;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::
                         time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                         ::id,&local_40,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar1 = (ulong)DAT_00d27038;
  uVar6 = uVar1 - 1;
  FUN_00c2bce0(1,param_2 + 8);
  plVar4 = (long *)(param_1 + 0x10);
  lVar2 = *plVar4;
  uVar3 = *(long *)(param_1 + 0x18) - lVar2 >> 3;
  if (uVar3 <= uVar6) {
    if (uVar1 < uVar3 || uVar1 - uVar3 == 0) {
      if (uVar1 < uVar3) {
        *(ulong *)(param_1 + 0x18) = lVar2 + uVar1 * 8;
      }
    }
    else {
                    /* try { // try from 00bf7340 to 00bf7347 has its CatchHandler @ 00bf73a4 */
      FUN_00c0b6e4(plVar4,uVar1 - uVar3);
      lVar2 = *plVar4;
    }
  }
  plVar5 = *(long **)(lVar2 + uVar6 * 8);
  if ((plVar5 != (long *)0x0) && (lVar2 = FUN_00c2bd10(0xffffffffffffffff,plVar5 + 1), lVar2 == 0))
  {
    (**(code **)(*plVar5 + 0x10))(plVar5);
  }
  *(long *)(*plVar4 + uVar6 * 8) = param_2;
  return;
}

