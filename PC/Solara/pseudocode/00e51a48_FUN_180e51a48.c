/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

bool FUN_180e51a48(void)

{
  if (_DAT_1810c2350 == -2) {
    _DAT_1810c2350 = CreateFileW(&UNK_181044f00,0x40000000,3,0,3,0,0);
  }
  return _DAT_1810c2350 != -1;
}


