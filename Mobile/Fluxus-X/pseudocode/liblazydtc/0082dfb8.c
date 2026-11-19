/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082dfb8
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_0082dfb8(long param_1,undefined4 param_2)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  
  if ((DAT_00d1d478 == 0) || (DAT_00d1d480 != *(long *)(param_1 + 0x60))) {
    if (((DAT_00d1d490 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1d490), iVar1 != 0)) {
      DAT_00d1d488 = 0x7a9e9a50;
      _DAT_00d1d48c = 0x169;
      __cxa_atexit(&LAB_0082e178,&DAT_00d1d488,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d490);
    }
    if (DAT_00d1d48d == '\x01') {
      _DAT_00d1d48c = (ushort)(DAT_00d1d48c ^ 0x69);
      DAT_00d1d488 = DAT_00d1d488 ^ 0x1ff3fb37;
    }
    FUN_008acba4(param_1,0xffffd8ee,&DAT_00d1d488);
    iVar1 = FUN_008ab0e0(param_1,0xffffffff);
    if ((iVar1 == 8) && (iVar1 = FUN_008ad4b0(param_1,0xffffffff), iVar1 != 0)) {
      DAT_00d1d478 = FUN_008abf34(param_1,0xffffffff);
      DAT_00d1d480 = *(long *)(param_1 + 0x60);
      FUN_008aa994(param_1,0xfffffffe);
    }
    FUN_008aa994(param_1,0xfffffffe);
  }
  iVar1 = FUN_008ab0e0(param_1,param_2);
  if (iVar1 == 8) {
    uVar2 = FUN_008ad4b0(param_1,param_2);
    if ((int)uVar2 != 0) {
      lVar3 = FUN_008abf34(param_1,0xffffffff);
      FUN_008aa994(param_1,0xfffffffe);
      uVar2 = (ulong)(lVar3 == DAT_00d1d478);
    }
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

