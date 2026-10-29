/* 7ff70c8dc3d0 Unwind@7ff70c8dc3d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Unwind_7ff70c8dc3d0(void)

{
  byte *pbVar1;
  
  pbVar1 = (byte *)(*(longlong *)
                     ((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 0x28
                   );
  *pbVar1 = *pbVar1 & 0xfe;
  return;
}


