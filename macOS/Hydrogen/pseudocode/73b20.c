
byte * FUN_00073b20(void)

{
  undefined4 uVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  byte *pbVar5;
  undefined8 *puVar6;
  byte *pbVar7;
  byte *pbVar8;
  byte *pbVar9;
  uint uVar10;
  long lVar11;
  byte *pbVar12;
  long lVar13;
  uint uVar14;
  undefined8 uVar15;
  long unaff_x19;
  byte *unaff_x20;
  byte *unaff_x21;
  undefined1 auVar16 [16];
  
  uVar1 = *(undefined4 *)(unaff_x19 + 0x1c);
  *(int *)(unaff_x19 + 0x24) = *(int *)(unaff_x19 + 0x24) + 1;
  pbVar8 = unaff_x20;
  pbVar5 = (byte *)func_0x00072d7c();
  if ((pbVar5 != unaff_x20) && (unaff_x21 = pbVar5, *pbVar5 == 0x29)) {
    if ((*(byte *)(unaff_x19 + 0x18) >> 1 & 1) == 0) {
      puVar6 = (undefined8 *)__Znwm(0x18);
      lVar13 = *(long *)(unaff_x19 + 0x38);
      uVar15 = *(undefined8 *)(lVar13 + 8);
      *puVar6 = &UNK_009b3428;
      puVar6[1] = uVar15;
      *(undefined4 *)(puVar6 + 2) = uVar1;
      *(undefined8 **)(lVar13 + 8) = puVar6;
      *(undefined8 *)(unaff_x19 + 0x38) = *(undefined8 *)(*(long *)(unaff_x19 + 0x38) + 8);
    }
    *(int *)(unaff_x19 + 0x24) = *(int *)(unaff_x19 + 0x24) + -1;
    return pbVar5 + 1;
  }
  auVar16 = func_0x0002c744();
  pbVar5 = auVar16._8_8_;
  lVar13 = auVar16._0_8_;
  if (pbVar5 == pbVar8) {
    return pbVar5;
  }
  uVar10 = *(uint *)(lVar13 + 0x18) & 0x1f0;
  bVar2 = *pbVar5;
  if ((char)bVar2 < '?') {
    if (bVar2 == 0x2a) {
      pbVar12 = pbVar5 + 1;
      if ((uVar10 != 0 || pbVar12 == pbVar8) || (*pbVar12 != 0x3f)) {
        lVar11 = 0;
        goto LAB_00073df0;
      }
      pbVar5 = pbVar5 + 2;
      lVar11 = 0;
    }
    else {
      if (bVar2 != 0x2b) {
        return pbVar5;
      }
      pbVar12 = pbVar5 + 1;
      if (((uVar10 != 0) || (pbVar12 == pbVar8)) || (*pbVar12 != 0x3f)) {
        lVar11 = 1;
LAB_00073df0:
        func_0x00033274(lVar13,lVar11,0xffffffffffffffff);
        return pbVar12;
      }
      pbVar5 = pbVar5 + 2;
      lVar11 = 1;
    }
LAB_00073d70:
    func_0x00033274(lVar13,lVar11,0xffffffffffffffff);
    return pbVar5;
  }
  if (bVar2 == 0x3f) {
    pbVar12 = pbVar5 + 1;
    if ((uVar10 == 0 && pbVar12 != pbVar8) && (*pbVar12 == 0x3f)) {
      func_0x00033274(lVar13,0,1);
      return pbVar5 + 2;
    }
    func_0x00033274(lVar13,0,1);
    return pbVar12;
  }
  if (bVar2 != 0x7b) {
    return pbVar5;
  }
  pbVar12 = pbVar5 + 1;
  if ((pbVar12 == pbVar8) ||
     ((bVar2 = *pbVar12, (bVar2 & 0xf8) != 0x30 && ((bVar2 & 0xfe) != 0x38)))) {
LAB_00073fb8:
    func_0x000333ac();
  }
  else {
    uVar14 = (uint)bVar2;
    for (pbVar5 = pbVar5 + 2; iVar3 = uVar14 - 0x30, pbVar5 != pbVar8; pbVar5 = pbVar5 + 1) {
      bVar2 = *pbVar5;
      if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto LAB_00073cd8;
      if (0xccccccb < iVar3) goto LAB_00073fb8;
      uVar14 = (uint)bVar2 + iVar3 * 10;
    }
    pbVar5 = pbVar8;
LAB_00073cd8:
    if (pbVar5 == pbVar12) goto LAB_00073fb8;
    if (pbVar5 == pbVar8) goto LAB_00073fbc;
    if (*pbVar5 != 0x2c) {
      if (*pbVar5 == 0x7d) {
        pbVar12 = pbVar5 + 1;
        if (((uVar10 == 0) && (pbVar12 != pbVar8)) && (*pbVar12 == 0x3f)) {
          func_0x00033274(lVar13,(long)iVar3,(long)iVar3);
          return pbVar5 + 2;
        }
        func_0x00033274(lVar13,(long)iVar3,(long)iVar3);
        return pbVar12;
      }
      goto LAB_00073fb8;
    }
    pbVar12 = pbVar5 + 1;
    if (pbVar12 == pbVar8) goto LAB_00073fb8;
    bVar2 = *pbVar12;
    if (bVar2 == 0x7d) {
      pbVar12 = pbVar5 + 2;
      if (((uVar10 != 0) || (pbVar12 == pbVar8)) || (*pbVar12 != 0x3f)) {
        lVar11 = (long)iVar3;
        goto LAB_00073df0;
      }
      lVar11 = (long)iVar3;
      pbVar5 = pbVar5 + 3;
      goto LAB_00073d70;
    }
    uVar14 = (uint)bVar2;
    if (((bVar2 & 0xf8) == 0x30) || ((uVar14 & 0xfe) == 0x38)) {
      for (pbVar5 = pbVar5 + 2; iVar4 = uVar14 - 0x30, pbVar5 != pbVar8; pbVar5 = pbVar5 + 1) {
        bVar2 = *pbVar5;
        if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto LAB_00073f14;
        if (0xccccccb < iVar4) goto LAB_00073fb8;
        uVar14 = (uint)bVar2 + iVar4 * 10;
      }
      pbVar5 = pbVar8;
LAB_00073f14:
      if (((pbVar5 != pbVar12) && (pbVar5 != pbVar8)) && (*pbVar5 == 0x7d)) {
        if (iVar3 <= iVar4) {
          pbVar12 = pbVar5 + 1;
          if (((uVar10 == 0) && (pbVar12 != pbVar8)) && (*pbVar12 == 0x3f)) {
            func_0x00033274(lVar13,(long)iVar3,(long)iVar4);
            return pbVar5 + 2;
          }
          func_0x00033274(lVar13,(long)iVar3,(long)iVar4);
          return pbVar12;
        }
        goto LAB_00073fb8;
      }
    }
  }
LAB_00073fbc:
  auVar16 = func_0x000333f8();
  pbVar5 = auVar16._8_8_;
  pbVar12 = auVar16._0_8_;
  if (pbVar5 == pbVar8) {
    return pbVar5;
  }
  if (*pbVar5 != 0x5c) {
    return pbVar5;
  }
  pbVar9 = pbVar5 + 1;
  if (pbVar9 == pbVar8) goto LAB_00074120;
  uVar10 = *pbVar9 - 0x30;
  if (uVar10 == 0) {
    func_0x0002e718(pbVar12);
    return pbVar5 + 2;
  }
  if (8 < *pbVar9 - 0x31) goto LAB_000740cc;
  pbVar7 = pbVar5 + 2;
  if (pbVar7 == pbVar8) {
    pbVar7 = pbVar8;
LAB_000740b0:
    if (uVar10 <= *(uint *)(pbVar12 + 0x1c)) {
      func_0x0002e8a8(pbVar12);
      if (pbVar7 != pbVar9) {
        return pbVar7;
      }
LAB_000740cc:
      pbVar7 = (byte *)func_0x000742e4(pbVar12,pbVar9,pbVar8);
      if (pbVar9 != pbVar7) {
        return pbVar7;
      }
      pbVar8 = (byte *)func_0x0007452c(pbVar12,pbVar9,pbVar8,0);
      if (pbVar9 != pbVar8) {
        pbVar5 = pbVar8;
      }
      return pbVar5;
    }
  }
  else {
    do {
      bVar2 = *pbVar7;
      if (9 < bVar2 - 0x30) goto LAB_000740a4;
      if (0x19999998 < uVar10) goto LAB_0007411c;
      pbVar7 = pbVar7 + 1;
      uVar10 = ((uint)bVar2 + uVar10 * 10) - 0x30;
    } while (pbVar7 != pbVar8);
    pbVar7 = pbVar8;
LAB_000740a4:
    if (uVar10 != 0) goto LAB_000740b0;
  }
LAB_0007411c:
  func_0x0002e85c();
  unaff_x21 = pbVar12;
LAB_00074120:
  auVar16 = func_0x0002dfa0();
  pbVar5 = auVar16._8_8_;
  lVar13 = auVar16._0_8_;
  if ((pbVar5 == pbVar8) || (*pbVar5 != 0x5b)) {
    return pbVar5;
  }
  pbVar12 = pbVar8;
  if (pbVar5 + 1 != pbVar8) {
    bVar2 = pbVar5[1];
    pbVar9 = pbVar5 + 2;
    if (bVar2 != 0x5e) {
      pbVar9 = pbVar5 + 1;
    }
    unaff_x21 = (byte *)__Znwm(0xb0);
    pbVar12 = *(byte **)(*(long *)(lVar13 + 0x38) + 8);
    func_0x0002f53c(unaff_x21,lVar13,pbVar12,bVar2 == 0x5e,*(uint *)(lVar13 + 0x18) & 1,
                    *(uint *)(lVar13 + 0x18) >> 3 & 1);
    *(byte **)(*(long *)(lVar13 + 0x38) + 8) = unaff_x21;
    *(byte **)(lVar13 + 0x38) = unaff_x21;
    if (pbVar9 != pbVar8) {
      if (((*(ushort *)(lVar13 + 0x18) & 0x1f0) != 0) && (*pbVar9 == 0x5d)) {
        func_0x0002f0ac(unaff_x21,0x5d);
        pbVar9 = pbVar9 + 1;
      }
      if (pbVar9 != pbVar8) {
        do {
          pbVar5 = pbVar9;
          pbVar12 = pbVar8;
          pbVar9 = (byte *)func_0x00074a1c(lVar13,pbVar5,pbVar8,unaff_x21);
        } while (pbVar5 != pbVar9);
        if (pbVar5 != pbVar8) {
          if (*pbVar5 == 0x2d) {
            func_0x0002f0ac(unaff_x21,0x2d);
            pbVar5 = pbVar5 + 1;
          }
          if ((pbVar5 != pbVar8) && (*pbVar5 == 0x5d)) {
            return pbVar5 + 1;
          }
        }
      }
    }
  }
  uVar15 = func_0x00030890();
  __ZdlPv(unaff_x21);
  auVar16 = __Unwind_Resume(uVar15);
  pbVar8 = auVar16._8_8_;
  if (pbVar8 == pbVar12) {
code_r0x000742b4:
    return pbVar8;
  }
  switch(*pbVar8) {
  case 0x24:
  case 0x28:
  case 0x29:
  case 0x2a:
  case 0x2b:
  case 0x2e:
  case 0x3f:
  case 0x5b:
  case 0x5c:
  case 0x5d:
  case 0x5e:
  case 0x7b:
  case 0x7c:
  case 0x7d:
    goto code_r0x000742b4;
  default:
    func_0x0002e718(auVar16._0_8_,(int)(char)*pbVar8);
    return pbVar8 + 1;
  }
}

