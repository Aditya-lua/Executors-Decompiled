/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080e064
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0080e064(void)

{
  int iVar1;
  
  if (((DAT_00d1b8b0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b8b0), iVar1 != 0)) {
    uRam0000000000d1b878 = 0xc9c0e5e51d0abb77;
    _DAT_00d1b870 = 0xccc4e2a14900a722;
    uRam0000000000d1b888 = 0xdad4e1a41f15a077;
    _DAT_00d1b880 = 0xd7c6f8aa0700f532;
    uRam0000000000d1b898 = 0xe3aa0011b439;
    _DAT_00d1b890 = 0xd6d5fea00d4df524;
    uRam0000000000d1b8a6 = 0x8dec0d40e832dcd3;
    _DAT_00d1b89e = 0x9a9c;
    uRam0000000000d1b8a0 = 0xf8aa1a45f933;
    DAT_00d1b8ae = 1;
    uRam0000000000d1b858 = 0xdac5adff070abc23;
    _DAT_00d1b850 = 0xdccff8a3020aba3f;
    uRam0000000000d1b868 = 0xcccee1a64926f539;
    _DAT_00d1b860 = 0xd0c8f9a4070ca124;
    __cxa_atexit(&LAB_0080e9ec,&DAT_00d1b850,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b8b0);
    return;
  }
  return;
}

