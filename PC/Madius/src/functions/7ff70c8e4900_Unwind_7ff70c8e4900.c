/* 7ff70c8e4900 Unwind@7ff70c8e4900 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Unwind_7ff70c8e4900(void)

{
  byte *pbVar1;
  
  pbVar1 = (byte *)(*(longlong *)
                     ((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 0x28
                   );
  *pbVar1 = *pbVar1 & 0xfe;
  return;
}


