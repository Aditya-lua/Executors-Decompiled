
/* WARNING: Possible PIC construction at 0x00033bd0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00033bd4) */

byte * FUN_00033a68(byte *param_1,undefined8 param_2,byte *param_3)

{
  int iVar1;
  byte bVar2;
  byte *pbVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  byte *pbVar6;
  byte *extraout_x1;
  uint uVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  byte *pbVar11;
  int iVar12;
  byte *pbVar13;
  long unaff_x19;
  byte *unaff_x20;
  byte *unaff_x21;
  undefined1 auVar14 [16];
  
  if ((param_1 != unaff_x21) || (param_1 == unaff_x20)) {
    return param_1;
  }
  if (unaff_x21 + 1 == unaff_x20) {
    return unaff_x21;
  }
  if (*unaff_x21 != 0x5c) {
    return unaff_x21;
  }
  bVar2 = unaff_x21[1];
  if (bVar2 == 0x28) {
    pbVar3 = unaff_x21 + 2;
    if ((*(byte *)(unaff_x19 + 0x18) >> 1 & 1) == 0) {
      puVar5 = (undefined8 *)__Znwm(0x18);
      iVar1 = *(int *)(unaff_x19 + 0x1c) + 1;
      *(int *)(unaff_x19 + 0x1c) = iVar1;
      lVar8 = *(long *)(unaff_x19 + 0x38);
      uVar10 = *(undefined8 *)(lVar8 + 8);
      *puVar5 = &UNK_009b33e0;
      puVar5[1] = uVar10;
      *(int *)(puVar5 + 2) = iVar1;
      *(undefined8 **)(lVar8 + 8) = puVar5;
      *(undefined8 *)(unaff_x19 + 0x38) = *(undefined8 *)(*(long *)(unaff_x19 + 0x38) + 8);
    }
    else {
      iVar1 = *(int *)(unaff_x19 + 0x1c);
    }
    pbVar6 = unaff_x21;
    if (pbVar3 == unaff_x20) {
LAB_00033c60:
      func_0x0002c744();
      unaff_x20 = param_3;
      pbVar3 = pbVar6;
      goto LAB_00033c64;
    }
    param_3 = unaff_x20;
    pbVar6 = (byte *)func_0x00033a44();
    if (pbVar6 == pbVar3) {
      pbVar6 = pbVar3;
      if (((unaff_x21 + 3 != unaff_x20) && (*pbVar3 == 0x5c)) && (unaff_x21[3] == 0x29)) {
        if ((*(byte *)(unaff_x19 + 0x18) >> 1 & 1) == 0) {
          puVar5 = (undefined8 *)__Znwm(0x18);
          lVar8 = *(long *)(unaff_x19 + 0x38);
          uVar10 = *(undefined8 *)(lVar8 + 8);
          *puVar5 = &UNK_009b3428;
          puVar5[1] = uVar10;
          *(int *)(puVar5 + 2) = iVar1;
          *(undefined8 **)(lVar8 + 8) = puVar5;
          *(undefined8 *)(unaff_x19 + 0x38) = *(undefined8 *)(*(long *)(unaff_x19 + 0x38) + 8);
          return unaff_x21 + 4;
        }
        return unaff_x21 + 4;
      }
      goto LAB_00033c60;
    }
  }
  else {
    uVar7 = (uint)bVar2;
    if (((bVar2 & 0xf8) != 0x30) && ((uVar7 & 0xfe) != 0x38)) {
      return unaff_x21;
    }
    if (8 < uVar7 - 0x31) {
      return unaff_x21;
    }
    unaff_x20 = param_3;
    pbVar3 = unaff_x21;
    if (uVar7 - 0x30 <= *(uint *)(unaff_x19 + 0x1c)) {
      func_0x0002e8a8();
      return unaff_x21 + 2;
    }
LAB_00033c64:
    func_0x0002e85c();
    pbVar6 = extraout_x1;
  }
  if (pbVar6 == unaff_x20) {
    return pbVar6;
  }
  if (*pbVar6 == 0x2a) {
    func_0x00033274();
    return pbVar6 + 1;
  }
  if (pbVar6 + 1 == unaff_x20) {
    return pbVar6;
  }
  if (*pbVar6 != 0x5c) {
    return pbVar6;
  }
  if (pbVar6[1] != 0x7b) {
    return pbVar6;
  }
  pbVar11 = pbVar6 + (ulong)(pbVar6[1] == 0x7b) * 2;
  if ((pbVar11 == unaff_x20) ||
     ((bVar2 = *pbVar11, (bVar2 & 0xf8) != 0x30 && ((bVar2 & 0xfe) != 0x38)))) {
LAB_00033ed8:
    auVar14 = func_0x000333ac();
    pbVar6 = auVar14._8_8_;
    lVar8 = auVar14._0_8_;
    if (pbVar6 != unaff_x20) {
      pbVar11 = pbVar6 + 1;
      uVar7 = (uint)*pbVar6;
      if ((pbVar11 != unaff_x20) || (uVar7 != 0x24)) {
        if (0x2e < uVar7 - 0x2e || (1L << ((ulong)(uVar7 - 0x2e) & 0x3f) & 0x600000000001U) == 0) {
          func_0x0002e718(lVar8,(int)(char)*pbVar6);
          return pbVar11;
        }
        if ((pbVar11 != unaff_x20) && (uVar7 == 0x5c)) {
          uVar7 = (int)(char)*pbVar11 - 0x24;
          if ((uVar7 < 0x3b) && ((1L << ((ulong)uVar7 & 0x3f) & 0x580000000000441U) != 0)) {
            func_0x0002e718(lVar8,(int)(char)*pbVar11);
            return pbVar6 + 2;
          }
        }
        if (*pbVar6 == 0x2e) {
          puVar5 = (undefined8 *)__Znwm(0x10);
          lVar9 = *(long *)(lVar8 + 0x38);
          uVar10 = *(undefined8 *)(lVar9 + 8);
          *puVar5 = &UNK_009b35d8;
          puVar5[1] = uVar10;
          *(undefined8 **)(lVar9 + 8) = puVar5;
          *(undefined8 *)(lVar8 + 0x38) = *(undefined8 *)(*(long *)(lVar8 + 0x38) + 8);
          return pbVar11;
        }
      }
    }
    if ((pbVar6 == unaff_x20) || (*pbVar6 != 0x5b)) {
      return pbVar6;
    }
    if (pbVar6 + 1 != unaff_x20) {
      bVar2 = pbVar6[1];
      pbVar11 = pbVar6 + 2;
      if (bVar2 != 0x5e) {
        pbVar11 = pbVar6 + 1;
      }
      pbVar3 = (byte *)__Znwm(0xb0);
      func_0x0002f53c(pbVar3,lVar8,*(undefined8 *)(*(long *)(lVar8 + 0x38) + 8),bVar2 == 0x5e,
                      *(uint *)(lVar8 + 0x18) & 1,*(uint *)(lVar8 + 0x18) >> 3 & 1);
      *(byte **)(*(long *)(lVar8 + 0x38) + 8) = pbVar3;
      *(byte **)(lVar8 + 0x38) = pbVar3;
      if (pbVar11 != unaff_x20) {
        if (((*(ushort *)(lVar8 + 0x18) & 0x1f0) != 0) && (*pbVar11 == 0x5d)) {
          func_0x0002f0ac(pbVar3,0x5d);
          pbVar11 = pbVar11 + 1;
        }
        if (pbVar11 != unaff_x20) {
          do {
            pbVar6 = pbVar11;
            pbVar11 = (byte *)func_0x000308dc(lVar8,pbVar6,unaff_x20,pbVar3);
          } while (pbVar11 != pbVar6);
          if (pbVar6 != unaff_x20) {
            if (*pbVar6 == 0x2d) {
              func_0x0002f0ac(pbVar3,0x2d);
              pbVar6 = pbVar6 + 1;
            }
            if ((pbVar6 != unaff_x20) && (*pbVar6 == 0x5d)) {
              return pbVar6 + 1;
            }
          }
        }
      }
    }
    uVar10 = func_0x00030890();
    __ZdlPv(pbVar3);
    __Unwind_Resume(uVar10);
    uVar10 = ___cxa_allocate_exception(0x18);
    __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar10,0xb);
    pbVar3 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
    uVar4 = ___cxa_throw(uVar10,PTR___ZTINSt3__111regex_errorE_009b00f0);
    ___cxa_free_exception(uVar10);
    auVar14 = __Unwind_Resume(uVar4);
    pbVar6 = auVar14._8_8_;
    if (pbVar6 == pbVar3) {
code_r0x0002dee8:
      return pbVar6;
    }
    switch(*pbVar6) {
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
      goto code_r0x0002dee8;
    default:
      func_0x0002e718(auVar14._0_8_,(int)(char)*pbVar6);
      return pbVar6 + 1;
    }
  }
  uVar7 = (uint)bVar2;
  pbVar13 = pbVar11;
  while( true ) {
    pbVar13 = pbVar13 + 1;
    iVar1 = uVar7 - 0x30;
    if (pbVar13 == unaff_x20) break;
    bVar2 = *pbVar13;
    if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto LAB_00033d5c;
    if (0xccccccb < iVar1) goto LAB_00033ed8;
    uVar7 = (uint)bVar2 + iVar1 * 10;
  }
  pbVar13 = unaff_x20;
LAB_00033d5c:
  if (pbVar13 == pbVar11) goto LAB_00033ed8;
  if (pbVar13 != unaff_x20) {
    pbVar11 = pbVar13 + 1;
    if (*pbVar13 == 0x2c) {
      if (pbVar11 != unaff_x20) {
        bVar2 = *pbVar11;
        if (((bVar2 & 0xf8) == 0x30) || ((bVar2 & 0xfe) == 0x38)) {
          pbVar11 = pbVar13 + 2;
          if (pbVar11 != unaff_x20) {
            uVar7 = (uint)bVar2;
            do {
              iVar12 = uVar7 - 0x30;
              bVar2 = *pbVar11;
              if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto LAB_00033da4;
              if (0xccccccb < iVar12) goto LAB_00033ed8;
              uVar7 = (uint)bVar2 + iVar12 * 10;
              pbVar11 = pbVar11 + 1;
            } while (pbVar11 != unaff_x20);
          }
        }
        else {
          iVar12 = -1;
LAB_00033da4:
          if ((((pbVar11 != unaff_x20) && (pbVar11 + 1 != unaff_x20)) && (*pbVar11 == 0x5c)) &&
             (pbVar11[1] == 0x7d)) {
            pbVar6 = pbVar11 + 2;
            if (iVar12 != -1) {
              if (iVar1 <= iVar12) {
                func_0x00033274();
                return pbVar6;
              }
              goto LAB_00033ed8;
            }
            goto LAB_00033eb0;
          }
        }
      }
    }
    else if (((pbVar11 != unaff_x20) && (*pbVar13 == 0x5c)) && (*pbVar11 == 0x7d)) {
      func_0x00033274();
      return pbVar13 + 2;
    }
  }
  func_0x000333f8();
LAB_00033eb0:
  func_0x00033274();
  return pbVar6;
}

