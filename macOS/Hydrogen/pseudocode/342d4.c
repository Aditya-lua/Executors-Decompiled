
byte * FUN_000342d4(void)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  byte *pbVar6;
  byte *pbVar7;
  uint uVar8;
  long lVar9;
  undefined *puVar10;
  byte *unaff_x19;
  long unaff_x21;
  byte *unaff_x22;
  int iVar11;
  undefined1 auVar12 [16];
  
  pbVar6 = (byte *)func_0x0002dd0c();
  if ((pbVar6 == unaff_x22) && (pbVar6 != unaff_x19)) {
    bVar2 = *unaff_x22;
    if (bVar2 == 0x24) {
      puVar5 = (undefined8 *)__Znwm(0x18);
      uVar1 = *(uint *)(unaff_x21 + 0x18);
      lVar9 = *(long *)(unaff_x21 + 0x38);
      puVar10 = &UNK_009b30b8;
    }
    else {
      if (bVar2 == 0x28) {
        if ((*(byte *)(unaff_x21 + 0x18) >> 1 & 1) == 0) {
          puVar5 = (undefined8 *)__Znwm(0x18);
          iVar11 = *(int *)(unaff_x21 + 0x1c) + 1;
          *(int *)(unaff_x21 + 0x1c) = iVar11;
          lVar9 = *(long *)(unaff_x21 + 0x38);
          uVar4 = *(undefined8 *)(lVar9 + 8);
          *puVar5 = &UNK_009b33e0;
          puVar5[1] = uVar4;
          *(int *)(puVar5 + 2) = iVar11;
          *(undefined8 **)(lVar9 + 8) = puVar5;
          *(undefined8 *)(unaff_x21 + 0x38) = *(undefined8 *)(*(long *)(unaff_x21 + 0x38) + 8);
        }
        else {
          iVar11 = *(int *)(unaff_x21 + 0x1c);
        }
        *(int *)(unaff_x21 + 0x24) = *(int *)(unaff_x21 + 0x24) + 1;
        pbVar7 = unaff_x19;
        pbVar6 = (byte *)func_0x0002b468();
        if ((pbVar6 == unaff_x19) || (*pbVar6 != 0x29)) {
          auVar12 = func_0x0002c744();
          pbVar6 = auVar12._8_8_;
          if (pbVar6 != pbVar7) {
            switch(*pbVar6) {
            case 0x24:
            case 0x28:
            case 0x2a:
            case 0x2b:
            case 0x2e:
            case 0x3f:
            case 0x5b:
            case 0x5c:
            case 0x5e:
            case 0x7b:
            case 0x7c:
              break;
            default:
code_r0x00034424:
              func_0x0002e718(auVar12._0_8_,(int)(char)*pbVar6);
              return pbVar6 + 1;
            case 0x29:
              if (*(int *)(auVar12._0_8_ + 0x24) == 0) goto code_r0x00034424;
            }
          }
          return pbVar6;
        }
        if ((*(byte *)(unaff_x21 + 0x18) >> 1 & 1) == 0) {
          puVar5 = (undefined8 *)__Znwm(0x18);
          lVar9 = *(long *)(unaff_x21 + 0x38);
          uVar4 = *(undefined8 *)(lVar9 + 8);
          *puVar5 = &UNK_009b3428;
          puVar5[1] = uVar4;
          *(int *)(puVar5 + 2) = iVar11;
          *(undefined8 **)(lVar9 + 8) = puVar5;
          *(undefined8 *)(unaff_x21 + 0x38) = *(undefined8 *)(*(long *)(unaff_x21 + 0x38) + 8);
        }
        *(int *)(unaff_x21 + 0x24) = *(int *)(unaff_x21 + 0x24) + -1;
        pbVar6 = pbVar6 + 1;
        goto LAB_00034370;
      }
      if (bVar2 != 0x5e) {
        return unaff_x22;
      }
      puVar5 = (undefined8 *)__Znwm(0x18);
      uVar1 = *(uint *)(unaff_x21 + 0x18);
      lVar9 = *(long *)(unaff_x21 + 0x38);
      puVar10 = &UNK_009b3070;
    }
    uVar4 = *(undefined8 *)(lVar9 + 8);
    *puVar5 = puVar10 + 0x10;
    puVar5[1] = uVar4;
    *(bool *)(puVar5 + 2) = (uVar1 & 0x5f0) == 0x400;
    *(undefined8 **)(lVar9 + 8) = puVar5;
    *(undefined8 *)(unaff_x21 + 0x38) = *(undefined8 *)(*(long *)(unaff_x21 + 0x38) + 8);
    pbVar6 = unaff_x22 + 1;
  }
  else {
LAB_00034370:
    if (pbVar6 == unaff_x22) {
      return unaff_x22;
    }
  }
  if (pbVar6 == unaff_x19) {
    return pbVar6;
  }
  uVar1 = *(uint *)(unaff_x21 + 0x18) & 0x1f0;
  bVar2 = *pbVar6;
  if ((char)bVar2 < '?') {
    if (bVar2 == 0x2a) {
      pbVar7 = pbVar6 + 1;
      if ((uVar1 != 0 || pbVar7 == unaff_x19) || (*pbVar7 != 0x3f)) goto code_r0x0002c458;
      pbVar6 = pbVar6 + 2;
    }
    else {
      if (bVar2 != 0x2b) {
        return pbVar6;
      }
      pbVar7 = pbVar6 + 1;
      if (((uVar1 != 0) || (pbVar7 == unaff_x19)) || (*pbVar7 != 0x3f)) {
code_r0x0002c458:
        func_0x00033274();
        return pbVar7;
      }
      pbVar6 = pbVar6 + 2;
    }
code_r0x0002c3d8:
    func_0x00033274();
    return pbVar6;
  }
  if (bVar2 == 0x3f) {
    pbVar7 = pbVar6 + 1;
    if ((uVar1 == 0 && pbVar7 != unaff_x19) && (*pbVar7 == 0x3f)) {
      func_0x00033274();
      return pbVar6 + 2;
    }
    func_0x00033274();
    return pbVar7;
  }
  if (bVar2 != 0x7b) {
    return pbVar6;
  }
  pbVar7 = pbVar6 + 1;
  if ((pbVar7 != unaff_x19) &&
     ((bVar2 = *pbVar7, (bVar2 & 0xf8) == 0x30 || ((bVar2 & 0xfe) == 0x38)))) {
    uVar8 = (uint)bVar2;
    for (pbVar6 = pbVar6 + 2; iVar11 = uVar8 - 0x30, pbVar6 != unaff_x19; pbVar6 = pbVar6 + 1) {
      bVar2 = *pbVar6;
      if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto code_r0x0002c32c;
      if (0xccccccb < iVar11) goto code_r0x0002c620;
      uVar8 = (uint)bVar2 + iVar11 * 10;
    }
    pbVar6 = unaff_x19;
code_r0x0002c32c:
    if (pbVar6 != pbVar7) {
      if (pbVar6 == unaff_x19) goto code_r0x0002c624;
      if (*pbVar6 == 0x2c) {
        pbVar7 = pbVar6 + 1;
        if (pbVar7 != unaff_x19) {
          bVar2 = *pbVar7;
          if (bVar2 == 0x7d) {
            pbVar7 = pbVar6 + 2;
            if (((uVar1 != 0) || (pbVar7 == unaff_x19)) || (*pbVar7 != 0x3f)) goto code_r0x0002c458;
            pbVar6 = pbVar6 + 3;
            goto code_r0x0002c3d8;
          }
          uVar8 = (uint)bVar2;
          if (((bVar2 & 0xf8) != 0x30) && ((uVar8 & 0xfe) != 0x38)) goto code_r0x0002c624;
          for (pbVar6 = pbVar6 + 2; iVar3 = uVar8 - 0x30, pbVar6 != unaff_x19; pbVar6 = pbVar6 + 1)
          {
            bVar2 = *pbVar6;
            if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto code_r0x0002c57c;
            if (0xccccccb < iVar3) goto code_r0x0002c620;
            uVar8 = (uint)bVar2 + iVar3 * 10;
          }
          pbVar6 = unaff_x19;
code_r0x0002c57c:
          if (((pbVar6 == pbVar7) || (pbVar6 == unaff_x19)) || (*pbVar6 != 0x7d))
          goto code_r0x0002c624;
          if (iVar11 <= iVar3) {
            pbVar7 = pbVar6 + 1;
            if (((uVar1 == 0) && (pbVar7 != unaff_x19)) && (*pbVar7 == 0x3f)) {
              func_0x00033274();
              return pbVar6 + 2;
            }
            func_0x00033274();
            return pbVar7;
          }
        }
      }
      else if (*pbVar6 == 0x7d) {
        pbVar7 = pbVar6 + 1;
        if (((uVar1 == 0) && (pbVar7 != unaff_x19)) && (*pbVar7 == 0x3f)) {
          func_0x00033274();
          return pbVar6 + 2;
        }
        func_0x00033274();
        return pbVar7;
      }
    }
  }
code_r0x0002c620:
  func_0x000333ac();
code_r0x0002c624:
  pbVar6 = (byte *)func_0x000333f8();
  uVar4 = __ZNSt3__16localeC1Ev();
  uVar4 = __ZNKSt3__16locale9use_facetERNS0_2idE(uVar4,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  *(undefined8 *)(pbVar6 + 8) = uVar4;
  uVar4 = __ZNKSt3__16locale9use_facetERNS0_2idE(pbVar6,PTR___ZNSt3__17collateIcE2idE_009b00a0);
  *(undefined8 *)(pbVar6 + 0x10) = uVar4;
  pbVar6[0x20] = 0;
  pbVar6[0x21] = 0;
  pbVar6[0x22] = 0;
  pbVar6[0x23] = 0;
  pbVar6[0x24] = 0;
  pbVar6[0x25] = 0;
  pbVar6[0x26] = 0;
  pbVar6[0x27] = 0;
  pbVar6[0x18] = 0;
  pbVar6[0x19] = 0;
  pbVar6[0x1a] = 0;
  pbVar6[0x1b] = 0;
  pbVar6[0x1c] = 0;
  pbVar6[0x1d] = 0;
  pbVar6[0x1e] = 0;
  pbVar6[0x1f] = 0;
  pbVar6[0x30] = 0;
  pbVar6[0x31] = 0;
  pbVar6[0x32] = 0;
  pbVar6[0x33] = 0;
  pbVar6[0x34] = 0;
  pbVar6[0x35] = 0;
  pbVar6[0x36] = 0;
  pbVar6[0x37] = 0;
  pbVar6[0x28] = 0;
  pbVar6[0x29] = 0;
  pbVar6[0x2a] = 0;
  pbVar6[0x2b] = 0;
  pbVar6[0x2c] = 0;
  pbVar6[0x2d] = 0;
  pbVar6[0x2e] = 0;
  pbVar6[0x2f] = 0;
  pbVar6[0x38] = 0;
  pbVar6[0x39] = 0;
  pbVar6[0x3a] = 0;
  pbVar6[0x3b] = 0;
  pbVar6[0x3c] = 0;
  pbVar6[0x3d] = 0;
  pbVar6[0x3e] = 0;
  pbVar6[0x3f] = 0;
  return pbVar6;
}

