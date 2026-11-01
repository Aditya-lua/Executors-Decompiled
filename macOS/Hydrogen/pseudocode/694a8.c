
ulong FUN_000694a8(void)

{
  byte *pbVar1;
  bool bVar2;
  int in_w8;
  long in_x9;
  long in_x10;
  ulong unaff_x19;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  byte bStack0000000000000018;
  
  if (-1 < in_w8) {
    in_x10 = in_x9;
  }
  if (in_x10 == 7) {
    pbVar1 = _bStack0000000000000018;
    if (-1 < in_w8) {
      pbVar1 = &bStack0000000000000018;
    }
    bVar2 = (*pbVar1 & 0xdf) == 0x43;
    unaff_x19 = (ulong)bVar2;
    if (bVar2) {
      pbVar1 = _bStack0000000000000018;
      if (-1 < in_w8) {
        pbVar1 = &bStack0000000000000018;
      }
      bVar2 = (pbVar1[1] & 0xdf) == 0x48;
      unaff_x19 = (ulong)bVar2;
      if (bVar2) {
        pbVar1 = _bStack0000000000000018;
        if (-1 < in_w8) {
          pbVar1 = &bStack0000000000000018;
        }
        bVar2 = (pbVar1[2] & 0xdf) == 0x55;
        unaff_x19 = (ulong)bVar2;
        if (bVar2) {
          pbVar1 = _bStack0000000000000018;
          if (-1 < in_w8) {
            pbVar1 = &bStack0000000000000018;
          }
          bVar2 = (pbVar1[3] & 0xdf) == 0x4e;
          unaff_x19 = (ulong)bVar2;
          if (bVar2) {
            pbVar1 = _bStack0000000000000018;
            if (-1 < in_w8) {
              pbVar1 = &bStack0000000000000018;
            }
            bVar2 = (pbVar1[4] & 0xdf) == 0x4b;
            unaff_x19 = (ulong)bVar2;
            if (bVar2) {
              pbVar1 = _bStack0000000000000018;
              if (-1 < in_w8) {
                pbVar1 = &bStack0000000000000018;
              }
              bVar2 = (pbVar1[5] & 0xdf) == 0x45;
              unaff_x19 = (ulong)bVar2;
              if (bVar2) {
                pbVar1 = _bStack0000000000000018;
                if (-1 < in_w8) {
                  pbVar1 = &bStack0000000000000018;
                }
                unaff_x19 = (ulong)((pbVar1[6] & 0xdf) == 0x44);
              }
            }
          }
        }
      }
    }
  }
  if (in_w8 < 0) {
    __ZdlPv(_bStack0000000000000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    return unaff_x19;
  }
  return unaff_x19;
}

