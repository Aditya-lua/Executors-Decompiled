
/* WARNING: Removing unreachable block (ram,0x00138a20) */
/* WARNING: Removing unreachable block (ram,0x001386dc) */

void FUN_00138924(ulong param_1,uint param_2,undefined8 param_3,int *param_4)

{
  int iVar1;
  long *plVar2;
  int iVar3;
  uint in_w9;
  int iVar4;
  ulong in_x10;
  long in_x11;
  long lVar5;
  int in_w12;
  int in_w13;
  ulong in_x14;
  int iVar6;
  long in_x15;
  byte bVar7;
  int in_w16;
  ulong uVar8;
  byte in_w17;
  long unaff_x19;
  long *plVar9;
  long lVar10;
  int *unaff_x21;
  long lVar11;
  long unaff_x24;
  int unaff_w25;
  uint uVar12;
  ulong unaff_x26;
  long *plVar13;
  long *plVar14;
  
code_r0x00138924:
  uVar12 = (uint)unaff_x26;
  if (param_2 == 0xf8) {
    uVar12 = uVar12 + 5;
  }
  else {
    if ((in_w17 & 0xf8) != 0xf0) {
      if ((in_w17 & 0xf0) != 0xe0) goto LAB_001388d8;
      uVar12 = uVar12 + 3;
      goto joined_r0x00138984;
    }
    uVar12 = uVar12 + 4;
  }
  for (; unaff_x26 = (ulong)uVar12, unaff_x26 < in_x14; uVar12 = iVar3 + uVar12) {
    while( true ) {
      uVar12 = (uint)unaff_x26;
      if (in_w12 <= in_w13) goto LAB_001385b4;
      in_w17 = *(byte *)(in_x11 + unaff_x26 * in_x15);
      if (in_w17 == 9) break;
      in_w13 = in_w13 + 1;
      if ((in_w17 & 0xfe) != 0xfc) {
        param_2 = in_w17 & 0xfc;
        goto code_r0x00138924;
      }
      uVar12 = uVar12 + 6;
joined_r0x00138984:
      unaff_x26 = (ulong)uVar12;
      if (in_x14 <= unaff_x26) goto LAB_001385b4;
    }
    iVar3 = *(int *)(unaff_x19 + 0x54);
    iVar4 = 0;
    if (iVar3 != 0) {
      iVar4 = in_w13 / iVar3;
    }
    in_w13 = iVar3 + iVar4 * iVar3;
    in_w17 = 0;
LAB_001388d8:
    iVar3 = in_w16;
    if ((in_w17 & 0xe0) == 0xc0) {
      iVar3 = in_w16 + 1;
    }
  }
LAB_001385b4:
  iVar3 = (int)param_1;
  plVar2 = (long *)(unaff_x24 + (long)iVar3 * 0x18);
  if (unaff_w25 != iVar3) {
    plVar13 = (long *)(unaff_x24 + (long)unaff_w25 * 0x18);
    lVar5 = *plVar2 + (long)(int)in_w9 * 0xc;
    plVar14 = (long *)(unaff_x24 + (long)iVar3 * 0x18 + 8);
    if (lVar5 != *plVar14) {
      *plVar14 = lVar5;
    }
    if (uVar12 != 0) {
      lVar11 = *plVar13;
      lVar10 = lVar11 + (long)(int)uVar12 * 0xc;
      plVar9 = (long *)(unaff_x24 + (long)unaff_w25 * 0x18 + 8);
      lVar5 = *plVar9 - lVar10;
      if (lVar5 != 0) {
        _memmove(lVar11,lVar10,lVar5 + -3);
      }
      *plVar9 = lVar11 + lVar5;
    }
    iVar4 = *unaff_x21;
    iVar3 = *param_4;
    if (iVar4 < iVar3) {
      lVar5 = *plVar13;
      lVar10 = *(long *)(unaff_x24 + (long)unaff_w25 * 0x18 + 8);
      func_0x00149130(plVar2,*plVar14,lVar5,lVar10,(lVar10 - lVar5 >> 2) * -0x5555555555555555);
      iVar4 = *unaff_x21;
      iVar3 = *param_4;
    }
    if (iVar4 < iVar3) {
      func_0x00138a58();
    }
    goto code_r0x00138a30;
  }
  if (param_1 < in_x10) {
    lVar5 = *(long *)(unaff_x24 + (long)iVar3 * 0x18 + 8) - *plVar2;
    if (lVar5 != 0) {
      uVar8 = 0;
      iVar4 = 0;
      do {
        bVar7 = *(byte *)(*plVar2 + uVar8 * 0xc);
        if (bVar7 == 9) {
          iVar6 = *(int *)(unaff_x19 + 0x54);
          iVar1 = 0;
          if (iVar6 != 0) {
            iVar1 = iVar4 / iVar6;
          }
          iVar4 = iVar6 + iVar1 * iVar6;
          bVar7 = 0;
code_r0x0013864c:
          iVar6 = 1;
          if ((bVar7 & 0xe0) == 0xc0) {
            iVar6 = 2;
          }
        }
        else {
          iVar4 = iVar4 + 1;
          if ((bVar7 & 0xfe) == 0xfc) {
            iVar6 = 6;
          }
          else if ((bVar7 & 0xfc) == 0xf8) {
            iVar6 = 5;
          }
          else if ((bVar7 & 0xf8) == 0xf0) {
            iVar6 = 4;
          }
          else {
            if ((bVar7 & 0xf0) != 0xe0) goto code_r0x0013864c;
            iVar6 = 3;
          }
        }
        uVar8 = (ulong)(uint)(iVar6 + (int)uVar8);
      } while (uVar8 < (ulong)((lVar5 >> 2) * -0x5555555555555555));
      goto code_r0x00138998;
    }
    lVar5 = *plVar2;
    lVar10 = lVar5 + (long)(int)in_w9 * 0xc;
    if (-1 < param_4[1]) goto code_r0x00138a04;
  }
  else {
    iVar4 = 0;
code_r0x00138998:
    lVar5 = *plVar2;
    lVar10 = lVar5 + (long)(int)in_w9 * 0xc;
    if (iVar4 <= param_4[1]) {
code_r0x00138a04:
      plVar2 = (long *)(unaff_x24 + (long)iVar3 * 0x18 + 8);
      if (lVar10 != *plVar2) {
        *plVar2 = lVar10;
      }
      goto code_r0x00138a30;
    }
  }
  if (in_w9 != uVar12) {
    lVar5 = lVar5 + (long)(int)uVar12 * 0xc;
    plVar2 = (long *)(unaff_x24 + (long)iVar3 * 0x18 + 8);
    lVar11 = *plVar2 - lVar5;
    if (lVar11 != 0) {
      _memmove(lVar10,lVar5,lVar11 + -3);
    }
    *plVar2 = lVar10 + lVar11;
  }
code_r0x00138a30:
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  return;
}

