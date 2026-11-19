/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf8bdc
 */

void FUN_00bf8bdc(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  long *plVar5;
  long *plVar6;
  ulong uVar7;
  undefined8 *local_48;
  undefined ***local_40;
  undefined8 **local_38;
  
  local_48 = &std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::id;
  if (std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::id != -1) {
    local_38 = &local_48;
    local_40 = (undefined ***)&local_38;
    std::__ndk1::__call_once
              ((ulong *)&std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::id,&local_40,
               (_func_void_void_ptr *)&LAB_00c0bab0);
  }
  uVar2 = (ulong)DAT_00d272b8;
  uVar7 = uVar2 - 1;
  if (((ulong)(*(long *)(param_2 + 0x18) - *(long *)(param_2 + 0x10) >> 3) <= uVar7) ||
     (lVar4 = *(long *)(*(long *)(param_2 + 0x10) + uVar7 * 8), lVar4 == 0)) {
                    /* WARNING: Subroutine does not return */
    FUN_00bd8968();
  }
  FUN_00c2bce0(1,lVar4 + 8);
  plVar5 = (long *)(param_1 + 0x10);
  lVar1 = *plVar5;
  uVar3 = *(long *)(param_1 + 0x18) - lVar1 >> 3;
  if (uVar3 <= uVar7) {
    if (uVar2 < uVar3 || uVar2 - uVar3 == 0) {
      if (uVar2 < uVar3) {
        *(ulong *)(param_1 + 0x18) = lVar1 + uVar2 * 8;
      }
    }
    else {
                    /* try { // try from 00bf8c8c to 00bf8c93 has its CatchHandler @ 00bf8cf4 */
      FUN_00c0b6e4(plVar5,uVar2 - uVar3);
      lVar1 = *plVar5;
    }
  }
  plVar6 = *(long **)(lVar1 + uVar7 * 8);
  if ((plVar6 != (long *)0x0) && (lVar1 = FUN_00c2bd10(0xffffffffffffffff,plVar6 + 1), lVar1 == 0))
  {
    (**(code **)(*plVar6 + 0x10))(plVar6);
  }
  *(long *)(*plVar5 + uVar7 * 8) = lVar4;
  return;
}

