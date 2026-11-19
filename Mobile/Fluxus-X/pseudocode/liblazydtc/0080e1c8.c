/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080e1c8
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0080e1c8(void)

{
  int iVar1;
  
  if (((DAT_00d1b938 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1b938), iVar1 != 0)) {
    uRam0000000000d1b900 = 0x991e0c409205f66;
    _DAT_00d1b8f8 = 0x5d8ceac95d6d552a;
    uRam0000000000d1b910 = 0x4c9cfdd812321123;
    _DAT_00d1b908 = 0x4ddab2c9182f4660;
    uRam0000000000d1b920 = 0x422f;
    _DAT_00d1b918 = 0x59baa903e32582f;
    uRam0000000000d1b92a = 0x31264ddab2c9182f;
    _DAT_00d1b922 = 0x99aecdf082e;
    uRam0000000000d1b928 = 0x4660;
    DAT_00d1b932 = 1;
    uRam0000000000d1b8c0 = 0x478aaf97132e587b;
    _DAT_00d1b8b8 = 0x4a91facb162e5e67;
    uRam0000000000d1b8d0 = 0x408becc30827116b;
    _DAT_00d1b8c8 = 0x4c8bfdc20d31447c;
    uRam0000000000d1b8e0 = 0x1dfe1c214355061;
    _DAT_00d1b8d8 = 0x409de2c21e615f60;
    uRam0000000000d1b8f0 = 0x14bcfcc45d2f5e66;
    _DAT_00d1b8e8 = 0x5d9ee1c40932546b;
    __cxa_atexit(&LAB_0080ea04,&DAT_00d1b8b8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b938);
    return;
  }
  return;
}

