
ulong thunk_FUN_00139fb0(void)

{
  bool bVar1;
  int iVar2;
  byte bVar3;
  int iVar4;
  ulong uVar5;
  undefined *puVar6;
  int iVar7;
  int iVar8;
  uint in_w8;
  ulong in_x9;
  long lVar9;
  int in_w10;
  uint uVar10;
  long *plVar11;
  byte *pbVar12;
  ulong unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long *unaff_x22;
  long lVar13;
  long lVar14;
  
  puVar6 = PTR___DefaultRuneLocale_009b0028;
  if (in_w10 <= (int)in_x9) goto LAB_0013a1b8;
  if (0 < (int)in_x9) {
    lVar13 = in_x9 << 0x20;
    lVar14 = ((in_x9 & 0xffffffff) + (in_x9 & 0xffffffff) * 2) * 4;
    in_x9 = in_x9 & 0xffffffff;
    do {
      bVar3 = *(byte *)(*unaff_x22 + lVar14);
      if ((char)bVar3 < '\0') {
        iVar7 = ___maskrune((ulong)bVar3,0x4000);
        if (iVar7 == 0) goto LAB_0013a020;
      }
      else if ((*(uint *)(puVar6 + (ulong)bVar3 * 4 + 0x3c) & 0x4000) == 0) {
LAB_0013a020:
        iVar7 = (int)in_x9;
        if (iVar7 < 1) goto LAB_0013a0c0;
        lVar14 = 0;
        lVar9 = *unaff_x22;
        pbVar12 = (byte *)(lVar9 + (in_x9 & 0xffffffff) * 0xc);
        goto LAB_0013a07c;
      }
      lVar14 = lVar14 + -0xc;
      lVar13 = lVar13 + -0x100000000;
      uVar5 = in_x9 - 1;
      bVar1 = 0 < (long)in_x9;
      in_x9 = uVar5;
    } while (uVar5 != 0 && bVar1);
    goto LAB_0013a0ac;
  }
  goto LAB_0013a0c0;
LAB_0013a07c:
  do {
    bVar3 = *pbVar12;
    if ((bVar3 & 0xc0) != 0x80) {
      iVar8 = (int)lVar14;
      if ((bVar3 < 0x21) && ((*(uint *)(puVar6 + (ulong)bVar3 * 4 + 0x3c) >> 0xe & 1) != 0)) {
        in_x9 = (ulong)(iVar7 + iVar8 + 1);
        goto LAB_0013a0c0;
      }
      if (*(int *)(lVar9 + (long)(int)((ulong)lVar13 >> 0x20) * 0xc + 4) !=
          *(int *)(lVar9 + (ulong)(uint)(iVar7 + -1 + iVar8) * 0xc + 4)) {
        in_x9 = (ulong)(uint)(iVar7 + iVar8);
        goto LAB_0013a0c0;
      }
    }
    lVar14 = lVar14 + -1;
    pbVar12 = pbVar12 + -0xc;
  } while (1 < (long)((in_x9 & 0xffffffff) + 1 + lVar14));
LAB_0013a0ac:
  in_x9 = 0;
LAB_0013a0c0:
  in_w8 = 0;
  iVar7 = (int)in_x9;
  if ((0 < iVar7) &&
     (unaff_x21 <
      (ulong)((*(long *)(unaff_x20 + 0x10) - *(long *)(unaff_x20 + 8) >> 3) * -0x5555555555555555)))
  {
    in_w8 = 0;
    uVar10 = 0;
    plVar11 = (long *)(*(long *)(unaff_x20 + 8) + (long)(int)unaff_x21 * 0x18);
    lVar13 = *plVar11;
    do {
      while( true ) {
        if ((int)((ulong)(plVar11[1] - lVar13) >> 2) * -0x55555555 <= (int)uVar10)
        goto LAB_0013a1b8;
        bVar3 = *(byte *)(lVar13 + (ulong)uVar10 * 0xc);
        iVar8 = 1;
        if ((bVar3 & 0xe0) == 0xc0) {
          iVar8 = 2;
        }
        iVar2 = 3;
        if ((bVar3 & 0xf0) != 0xe0) {
          iVar2 = iVar8;
        }
        iVar8 = 4;
        if ((bVar3 & 0xf8) != 0xf0) {
          iVar8 = iVar2;
        }
        iVar2 = 5;
        if ((bVar3 & 0xfc) != 0xf8) {
          iVar2 = iVar8;
        }
        iVar8 = 6;
        if ((bVar3 & 0xfe) != 0xfc) {
          iVar8 = iVar2;
        }
        if (bVar3 != 9) break;
        iVar2 = *(int *)(unaff_x20 + 0x54);
        iVar4 = 0;
        if (iVar2 != 0) {
          iVar4 = (int)in_w8 / iVar2;
        }
        in_w8 = iVar2 + iVar4 * iVar2;
        uVar10 = iVar8 + uVar10;
        if (iVar7 <= (int)uVar10) goto LAB_0013a1b8;
      }
      in_w8 = in_w8 + 1;
      uVar10 = iVar8 + uVar10;
    } while ((int)uVar10 < iVar7);
  }
LAB_0013a1b8:
  return unaff_x19 & 0xffffffff | (ulong)in_w8 << 0x20;
}

