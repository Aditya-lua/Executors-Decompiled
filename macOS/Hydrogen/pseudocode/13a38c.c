
undefined8 FUN_0013a38c(long param_1)

{
  int iVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  long lVar7;
  long in_x9;
  long *plVar8;
  int iVar9;
  int in_w12;
  undefined *in_x14;
  long unaff_x19;
  int unaff_w21;
  long lVar10;
  long *unaff_x22;
  ulong uVar11;
  long *unaff_x24;
  int unaff_w26;
  long lVar12;
  int *in_stack_00000000;
  
  if (unaff_w26 < in_w12) {
    iVar9 = *(int *)(in_x9 + (long)unaff_w26 * 0xc + 4);
    do {
      bVar2 = *(byte *)(in_x9 + (long)unaff_w26 * 0xc);
      uVar11 = (ulong)bVar2;
      if ((bVar2 & 0xfe) == 0xfc) {
        iVar5 = 6;
        iVar4 = *(int *)(in_x9 + (long)unaff_w26 * 0xc + 4);
      }
      else {
        iVar4 = 1;
        if ((bVar2 & 0xe0) == 0xc0) {
          iVar4 = 2;
        }
        iVar5 = 3;
        if ((bVar2 & 0xf0) != 0xe0) {
          iVar5 = iVar4;
        }
        iVar4 = 4;
        if ((bVar2 & 0xf8) != 0xf0) {
          iVar4 = iVar5;
        }
        iVar5 = 5;
        if ((bVar2 & 0xfc) != 0xf8) {
          iVar5 = iVar4;
        }
        iVar4 = *(int *)(in_x9 + (long)unaff_w26 * 0xc + 4);
      }
      if (iVar9 != iVar4) break;
      lVar12 = (long)unaff_w26;
      if ((char)bVar2 < '\0') {
        iVar4 = ___maskrune(uVar11,0x4000);
        if ((unaff_w21 == 0) == (iVar4 != 0)) {
          uVar6 = ___maskrune(uVar11,0x4000);
          in_x14 = PTR___DefaultRuneLocale_009b0028;
          goto LAB_0013a63c;
        }
        param_1 = *unaff_x22;
        in_x9 = *unaff_x24;
        in_x14 = PTR___DefaultRuneLocale_009b0028;
      }
      else {
        uVar6 = *(uint *)(in_x14 + uVar11 * 4 + 0x3c) & 0x4000;
        if ((uint)(unaff_w21 == 0) == uVar6 >> 0xe) {
LAB_0013a63c:
          if ((uVar6 != 0) &&
             (lVar7 = *unaff_x24, unaff_w26 < (int)((ulong)(*unaff_x22 - lVar7) >> 2) * -0x55555555)
             ) {
            lVar10 = (long)unaff_w26 * 0xc;
            goto LAB_0013a66c;
          }
          break;
        }
      }
      unaff_w26 = iVar5 + unaff_w26;
    } while (unaff_w26 < (int)((ulong)(param_1 - in_x9) >> 2) * -0x55555555);
  }
  goto LAB_0013a4f0;
  while( true ) {
    lVar12 = lVar12 + 1;
    lVar7 = *unaff_x24;
    lVar10 = lVar10 + 0xc;
    if ((int)((ulong)(*unaff_x22 - lVar7) >> 2) * -0x55555555 <= lVar12) break;
LAB_0013a66c:
    bVar2 = *(byte *)(lVar7 + lVar10);
    if ((char)bVar2 < '\0') {
      uVar6 = ___maskrune((ulong)bVar2,0x4000);
      in_x14 = PTR___DefaultRuneLocale_009b0028;
    }
    else {
      uVar6 = *(uint *)(in_x14 + (ulong)bVar2 * 4 + 0x3c) & 0x4000;
    }
    if (uVar6 == 0) break;
  }
  unaff_w26 = (int)lVar12;
LAB_0013a4f0:
  iVar9 = 0;
  iVar4 = *in_stack_00000000;
  if ((0 < unaff_w26) &&
     ((ulong)(long)iVar4 <
      (ulong)((*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8) >> 3) * -0x5555555555555555)))
  {
    iVar9 = 0;
    uVar6 = 0;
    plVar8 = (long *)(*(long *)(unaff_x19 + 8) + (long)iVar4 * 0x18);
    lVar12 = *plVar8;
    do {
      while( true ) {
        if ((int)((ulong)(plVar8[1] - lVar12) >> 2) * -0x55555555 <= (int)uVar6) goto LAB_0013a5f4;
        bVar2 = *(byte *)(lVar12 + (ulong)uVar6 * 0xc);
        iVar5 = 1;
        if ((bVar2 & 0xe0) == 0xc0) {
          iVar5 = 2;
        }
        iVar1 = 3;
        if ((bVar2 & 0xf0) != 0xe0) {
          iVar1 = iVar5;
        }
        iVar5 = 4;
        if ((bVar2 & 0xf8) != 0xf0) {
          iVar5 = iVar1;
        }
        iVar1 = 5;
        if ((bVar2 & 0xfc) != 0xf8) {
          iVar1 = iVar5;
        }
        iVar5 = 6;
        if ((bVar2 & 0xfe) != 0xfc) {
          iVar5 = iVar1;
        }
        if (bVar2 != 9) break;
        iVar1 = *(int *)(unaff_x19 + 0x54);
        iVar3 = 0;
        if (iVar1 != 0) {
          iVar3 = iVar9 / iVar1;
        }
        iVar9 = iVar1 + iVar3 * iVar1;
        uVar6 = iVar5 + uVar6;
        if (unaff_w26 <= (int)uVar6) goto LAB_0013a5f4;
      }
      iVar9 = iVar9 + 1;
      uVar6 = iVar5 + uVar6;
    } while ((int)uVar6 < unaff_w26);
  }
LAB_0013a5f4:
  return CONCAT44(iVar9,iVar4);
}

