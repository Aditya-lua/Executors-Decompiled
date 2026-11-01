
undefined8 FUN_004690e4(void)

{
  long lVar1;
  long lVar2;
  ushort uVar3;
  uint uVar4;
  ulong uVar5;
  ulong uVar6;
  uint in_w8;
  byte *in_x9;
  ulong in_x10;
  uint in_w11;
  long unaff_x19;
  short *unaff_x23;
  char unaff_w24;
  int unaff_w25;
  short *psVar7;
  short *unaff_x26;
  byte *unaff_x27;
  code *pcVar8;
  
code_r0x004690e4:
  in_x9[-2] = (char)in_w11 - (char)(in_w11 * unaff_w25 >> 0x10) * unaff_w24 | 0x30;
  if (((unaff_x27 != in_x9 + -2) &&
      (uVar4 = ((uint)(in_x10 >> 2) & 0x3fffffff) * 0x147b >> 0x11,
      in_x9[-3] = (char)uVar4 - (char)(uVar4 * unaff_w25 >> 0x10) * unaff_w24 | 0x30,
      unaff_x27 != in_x9 + -3)) &&
     (uVar4 = ((uint)(in_x10 >> 3) & 0x1fffffff) * 0x20c5 >> 0x14,
     in_x9[-4] = (char)uVar4 - (char)(uVar4 * unaff_w25 >> 0x10) * unaff_w24 | 0x30,
     unaff_x27 != in_x9 + -4)) {
    in_x9[-5] = (byte)(in_w8 * 0x347 >> 0x13) | 0x30;
  }
LAB_00469050:
  uVar5 = (**(code **)(unaff_x19 + 0x18))();
joined_r0x00469060:
  do {
    psVar7 = unaff_x26;
    if ((uVar5 & 1) != 0) {
      return 1;
    }
    while( true ) {
      if (psVar7 == unaff_x23) {
        return 0;
      }
      unaff_x26 = psVar7 + 0xc;
      if (*psVar7 != 0) {
        if (*psVar7 != 1) {
          uVar5 = (**(code **)(unaff_x19 + 0x18))();
          goto joined_r0x00469060;
        }
        uVar3 = psVar7[1];
        in_x10 = (ulong)uVar3;
        lVar1 = 2;
        if (99 < uVar3) {
          lVar1 = 3;
        }
        lVar2 = 1;
        if (9 < uVar3) {
          lVar2 = lVar1;
        }
        in_w8 = (uint)(uVar3 >> 4);
        lVar1 = 4;
        if (0x270 < in_w8) {
          lVar1 = 5;
        }
        if (999 < uVar3) {
          lVar2 = lVar1;
        }
        in_x9 = unaff_x27 + lVar2;
        in_w11 = uVar3 / 10;
        in_x9[-1] = (char)uVar3 - (char)in_w11 * unaff_w24 | 0x30;
        if (unaff_x27 != in_x9 + -1) goto code_r0x004690e4;
        goto LAB_00469050;
      }
      uVar5 = *(ulong *)(psVar7 + 4);
      if (0x40 < uVar5) break;
      psVar7 = unaff_x26;
      if (uVar5 != 0) goto code_r0x004691cc;
    }
    pcVar8 = *(code **)(unaff_x19 + 0x18);
    do {
      uVar6 = (*pcVar8)();
      if ((uVar6 & 1) != 0) {
        return 1;
      }
      uVar5 = uVar5 - 0x40;
    } while (0x40 < uVar5);
code_r0x004691cc:
    uVar5 = (**(code **)(unaff_x19 + 0x18))();
  } while( true );
}

