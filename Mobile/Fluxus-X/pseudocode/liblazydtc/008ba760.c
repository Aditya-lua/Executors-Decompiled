/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ba760
 */

void FUN_008ba760(undefined8 param_1,long param_2,int param_3)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  
  if (0x4000000 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_008b39cc(param_1,"table overflow");
  }
  lVar3 = *(long *)(param_2 + 0x28);
  if ((DAT_00d1fc90 & 1) == 0) {
    iVar2 = __cxa_guard_acquire(&DAT_00d1fc90);
    if (iVar2 != 0) {
                    /* try { // try from 008ba838 to 008ba83b has its CatchHandler @ 008ba858 */
      DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1fc90);
    }
  }
  if (lVar3 == (long)&DWORD_007f3700 + DAT_00d1fc88) {
    iVar2 = 0;
  }
  else {
    iVar2 = 1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f);
  }
  uVar1 = FUN_008ba870(param_2,param_3,0xffffffff);
  FUN_008ba968(param_1,param_2,uVar1,iVar2);
  return;
}

