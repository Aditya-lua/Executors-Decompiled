/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096386c
 */

undefined8 * curl_version(void)

{
  long lVar1;
  undefined8 uVar2;
  size_t __n;
  size_t __n_00;
  undefined1 *puVar3;
  char acStack_138 [40];
  char acStack_110 [200];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  thunk_FUN_0096f9e8(acStack_110,200);
  uVar2 = zlibVersion();
  curl_msnprintf(acStack_138,0x28,"zlib/%s",uVar2);
  DAT_00d1ff98._0_5_ = 0x756362696c;
  DAT_00d1ff98._5_3_ = 0x2f6c72;
  uRam0000000000d1ffa0 = 0x312e392e38;
  __n = strlen(acStack_110);
  if (__n + 2 < 0x11f) {
    DAT_00d1ffa5 = 0x20;
    memcpy(&DAT_00d1ffa6,acStack_110,__n);
    puVar3 = &DAT_00d1ffa6 + __n;
    __n_00 = strlen(acStack_138);
    if (__n_00 + 2 < 0x11e - __n) {
      *puVar3 = 0x20;
      memcpy((void *)(__n + 0xd1ffa7),acStack_138,__n_00);
      puVar3 = (undefined1 *)((long)(__n + 0xd1ffa7) + __n_00);
    }
  }
  else {
    puVar3 = &DAT_00d1ffa5;
  }
  *puVar3 = 0;
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return &DAT_00d1ff98;
}

