
/* WARNING: Removing unreachable block (ram,0x006b731c) */
/* WARNING: Removing unreachable block (ram,0x006b732c) */
/* WARNING: Removing unreachable block (ram,0x006b7330) */
/* WARNING: Removing unreachable block (ram,0x006b7340) */
/* WARNING: Removing unreachable block (ram,0x006b7318) */
/* WARNING: Removing unreachable block (ram,0x006b7350) */

void FUN_006b72b0(long param_1,long param_2)

{
  long lVar1;
  
  for (lVar1 = *(long *)(param_1 + 8); lVar1 != param_2; lVar1 = lVar1 + -0x88) {
    if (*(long *)(lVar1 + -0x30) != 0) {
      *(long *)(lVar1 + -0x28) = *(long *)(lVar1 + -0x30);
      __ZdlPv();
    }
  }
  *(long *)(param_1 + 8) = param_2;
  return;
}

