
ulong FUN_00191768(void)

{
  uint uVar1;
  ulong uVar2;
  undefined1 uStack000000000000000f;
  
  uStack000000000000000f = '\0';
  uVar1 = _SecKeychainGetUserInteractionAllowed(&uStack000000000000000f);
  uVar2 = 0;
  if (uStack000000000000000f != '\0' && uVar1 == 0) {
    uVar2 = 0x100;
  }
  uVar2 = uVar2 | (ulong)uVar1 << 0x20;
  if (uVar1 != 0) {
    uVar2 = uVar2 + 1;
  }
  return uVar2;
}

