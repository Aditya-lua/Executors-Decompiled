
void FUN_0045dca0(ulong param_1)

{
  int iVar1;
  byte bVar2;
  int in_w10;
  long in_x12;
  byte *in_x13;
  undefined1 uStack0000000000000008;
  
  do {
    bVar2 = *in_x13;
    if (9 < bVar2 - 0x30) break;
    in_x13 = in_x13 + 1;
    iVar1 = in_w10 * 10 + (bVar2 - 0x30 & 0xff);
    if (0xffff < in_w10) {
      iVar1 = in_w10;
    }
    in_x12 = in_x12 + -1;
    in_w10 = iVar1;
  } while (in_x12 != 0);
  if (param_1 < 0x13) {
    _bzero(&uStack0000000000000008 + param_1,0x13 - param_1);
  }
  _memcpy();
  return;
}

