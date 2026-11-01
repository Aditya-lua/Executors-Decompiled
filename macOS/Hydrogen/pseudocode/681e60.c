
ulong FUN_00681e60(void)

{
  ulong uVar1;
  ulong unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  ulong *unaff_x22;
  long unaff_x26;
  
  do {
    uVar1 = (unaff_x22[4] & 0xff00ff00ff00ff00) >> 8 | (unaff_x22[4] & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    unaff_x22[4] = uVar1 >> 0x20 | uVar1 << 0x20;
    if ((unaff_x26 != 5) &&
       (uVar1 = (unaff_x22[5] & 0xff00ff00ff00ff00) >> 8 | (unaff_x22[5] & 0xff00ff00ff00ff) << 8,
       uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10,
       unaff_x22[5] = uVar1 >> 0x20 | uVar1 << 0x20, unaff_x26 != 6)) {
      uVar1 = (unaff_x22[6] & 0xff00ff00ff00ff00) >> 8 | (unaff_x22[6] & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      unaff_x22[6] = uVar1 >> 0x20 | uVar1 << 0x20;
    }
    do {
      (**(code **)(*unaff_x20 + 0xb0))();
      unaff_x19 = unaff_x19 - unaff_x21;
      if (unaff_x19 < unaff_x21) {
        return unaff_x19;
      }
      _memcpy();
      uVar1 = (*unaff_x22 & 0xff00ff00ff00ff00) >> 8 | (*unaff_x22 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      *unaff_x22 = uVar1 >> 0x20 | uVar1 << 0x20;
    } while ((((unaff_x26 == 1) ||
              (uVar1 = (unaff_x22[1] & 0xff00ff00ff00ff00) >> 8 |
                       (unaff_x22[1] & 0xff00ff00ff00ff) << 8,
              uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10,
              unaff_x22[1] = uVar1 >> 0x20 | uVar1 << 0x20, unaff_x26 == 2)) ||
             (uVar1 = (unaff_x22[2] & 0xff00ff00ff00ff00) >> 8 |
                      (unaff_x22[2] & 0xff00ff00ff00ff) << 8,
             uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10,
             unaff_x22[2] = uVar1 >> 0x20 | uVar1 << 0x20, unaff_x26 == 3)) ||
            (uVar1 = (unaff_x22[3] & 0xff00ff00ff00ff00) >> 8 |
                     (unaff_x22[3] & 0xff00ff00ff00ff) << 8,
            uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10,
            unaff_x22[3] = uVar1 >> 0x20 | uVar1 << 0x20, unaff_x26 == 4));
  } while( true );
}

