
void FUN_000f2af4(void)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  undefined8 *unaff_x19;
  long unaff_x20;
  int unaff_w22;
  int unaff_w23;
  uint unaff_w24;
  int iVar5;
  ulong unaff_x25;
  undefined8 unaff_d8;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  undefined8 unaff_d15;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000018;
  
  do {
    lVar4 = func_0x000b810c(-(unaff_x25 >> 0x1f & 1) & 0xfffffff800000000 |
                            (unaff_x25 & 0xffffffff) << 3);
    if (*(long *)(unaff_x20 + 0x80) != 0) {
      _memcpy(lVar4,*(long *)(unaff_x20 + 0x80),(long)*(int *)(unaff_x20 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x80));
    }
    *(long *)(unaff_x20 + 0x80) = lVar4;
    *(int *)(unaff_x20 + 0x7c) = (int)unaff_x25;
    iVar5 = *(int *)(unaff_x20 + 0x78);
    while( true ) {
      *(ulong *)(lVar4 + (long)iVar5 * 8) =
           CONCAT44((float)((ulong)in_stack_00000000 >> 0x20) * unaff_s12 * unaff_s9 +
                    (float)((ulong)unaff_d15 >> 0x20) * unaff_s11 * unaff_s10 +
                    (float)((ulong)unaff_d8 >> 0x20),
                    (float)in_stack_00000000 * -(unaff_s12 * unaff_s9) +
                    (float)unaff_d15 * unaff_s11 * unaff_s10 + (float)unaff_d8);
      iVar3 = *(int *)(unaff_x20 + 0x78);
      iVar5 = iVar3 + 1;
      *(int *)(unaff_x20 + 0x78) = iVar5;
      unaff_w22 = unaff_w22 + 1;
      if (unaff_w23 == unaff_w22) {
        return;
      }
      unaff_s11 = in_stack_00000018._4_4_;
      unaff_s12 = (float)___sincosf_stret(in_stack_00000018._4_4_ +
                                          unaff_s14 * ((float)unaff_w22 / unaff_s13));
      unaff_d8 = *unaff_x19;
      if (iVar5 == *(int *)(unaff_x20 + 0x7c)) break;
      lVar4 = *(long *)(unaff_x20 + 0x80);
    }
    iVar1 = iVar5;
    if (iVar5 < 0) {
      iVar1 = iVar3 + 2;
    }
    uVar2 = unaff_w24;
    if (iVar5 != 0) {
      uVar2 = iVar5 + (iVar1 >> 1);
    }
    if ((int)uVar2 <= (int)(iVar3 + 2U)) {
      uVar2 = iVar3 + 2U;
    }
    unaff_x25 = (ulong)uVar2;
  } while( true );
}

