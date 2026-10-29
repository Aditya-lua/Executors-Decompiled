/* 7ff70c9340a0 FUN_7ff70c9340a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c9340a0(void)

{
  longlong lVar1;
  
  lVar1 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8);
  return CONCAT71((int7)((ulonglong)lVar1 >> 8),(*(byte *)(lVar1 + 0x140) & 0x17) != 0);
}


