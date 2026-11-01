
undefined8 FUN_006ff828(void)

{
  long lVar1;
  undefined1 in_ZR;
  int extraout_w9;
  byte *in_x9;
  byte *pbVar2;
  uint uVar3;
  ulong in_x10;
  uint in_w11;
  ulong uVar4;
  uint uVar5;
  uint uVar6;
  byte *unaff_x21;
  
code_r0x006ff828:
  if ((bool)in_ZR) {
    in_x10 = 0;
  }
  if (in_w11 == 0) goto LAB_006ff7ac;
  pbVar2 = in_x9 + in_x10;
  do {
    if ((pbVar2[1] & 0xc0) != 0x80) {
      func_0x006e3870();
      func_0x006e3870();
      return 2;
    }
LAB_006ff7ac:
    func_0x006e644c();
    if (extraout_w9 < 1) {
      return 0;
    }
    uVar6 = (uint)*unaff_x21;
    pbVar2 = unaff_x21;
  } while (-1 < (char)*unaff_x21);
  uVar3 = 0;
  uVar4 = 0;
  uVar5 = 0;
  do {
    if ((uVar6 >> 6 & 1) == 0) {
      if ((uint)uVar4 < 4) {
        uVar5 = (uVar6 & 0x7f) << (ulong)(uVar3 & 0x1f) | uVar5;
        if (uVar5 >> 0x10 < 0x11) {
          in_x10 = uVar4 & 0xffffffff;
          in_w11 = (uint)(uVar5 >> 0xb != 0x1b &&
                         *(uint *)(&UNK_008c8470 + (uVar4 & 0xffffffff) * 4) < uVar5);
          in_ZR = in_w11 == 0;
          in_x9 = unaff_x21;
          goto code_r0x006ff828;
        }
      }
      break;
    }
    lVar1 = uVar4 + 1;
    uVar4 = uVar4 + 1;
    uVar5 = unaff_x21[lVar1] & 0x3f | uVar5 << 6;
    uVar6 = uVar6 << 1;
    uVar3 = uVar3 + 5;
  } while ((unaff_x21[lVar1] & 0xc0) == 0x80);
  goto LAB_006ff7ac;
}

