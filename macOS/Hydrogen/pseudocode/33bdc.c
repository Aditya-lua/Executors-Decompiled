
/* WARNING: Possible PIC construction at 0x00033bd0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00033bd4) */

byte * FUN_00033bdc(undefined8 param_1,undefined8 param_2,byte *param_3)

{
  byte bVar1;
  int iVar2;
  bool in_ZR;
  undefined8 uVar3;
  byte *pbVar4;
  undefined8 *puVar5;
  byte *extraout_x1;
  uint uVar6;
  long lVar7;
  long lVar8;
  undefined8 uVar9;
  byte *pbVar10;
  int iVar11;
  byte *pbVar12;
  long unaff_x19;
  byte *unaff_x20;
  byte *unaff_x21;
  byte *unaff_x22;
  undefined4 unaff_w23;
  undefined1 auVar13 [16];
  
  if (in_ZR) {
code_r0x00033be0:
    if (unaff_x21 + 1 != unaff_x20) {
      if (*unaff_x21 == 0x5c) {
        if (unaff_x21[1] == 0x29) {
          if ((*(byte *)(unaff_x19 + 0x18) >> 1 & 1) == 0) {
            puVar5 = (undefined8 *)__Znwm(0x18);
            lVar7 = *(long *)(unaff_x19 + 0x38);
            uVar9 = *(undefined8 *)(lVar7 + 8);
            *puVar5 = &UNK_009b3428;
            puVar5[1] = uVar9;
            *(undefined4 *)(puVar5 + 2) = unaff_w23;
            *(undefined8 **)(lVar7 + 8) = puVar5;
            *(undefined8 *)(unaff_x19 + 0x38) = *(undefined8 *)(*(long *)(unaff_x19 + 0x38) + 8);
            return unaff_x21 + 2;
          }
          return unaff_x21 + 2;
        }
      }
    }
LAB_00033c60:
    unaff_x22 = unaff_x21;
    unaff_x20 = param_3;
    func_0x0002c744();
    func_0x0002e85c();
    pbVar4 = extraout_x1;
  }
  else {
    if (unaff_x22 == unaff_x20) goto LAB_00033c60;
    param_3 = unaff_x20;
    pbVar4 = (byte *)func_0x00033a44();
    unaff_x21 = unaff_x22;
    if (pbVar4 == unaff_x22) goto code_r0x00033be0;
  }
  if (pbVar4 == unaff_x20) {
    return pbVar4;
  }
  if (*pbVar4 == 0x2a) {
    func_0x00033274();
    return pbVar4 + 1;
  }
  if (pbVar4 + 1 == unaff_x20) {
    return pbVar4;
  }
  if (*pbVar4 != 0x5c) {
    return pbVar4;
  }
  if (pbVar4[1] != 0x7b) {
    return pbVar4;
  }
  pbVar10 = pbVar4 + (ulong)(pbVar4[1] == 0x7b) * 2;
  if ((pbVar10 == unaff_x20) ||
     ((bVar1 = *pbVar10, (bVar1 & 0xf8) != 0x30 && ((bVar1 & 0xfe) != 0x38)))) {
LAB_00033ed8:
    auVar13 = func_0x000333ac();
    pbVar4 = auVar13._8_8_;
    lVar7 = auVar13._0_8_;
    if (pbVar4 != unaff_x20) {
      pbVar10 = pbVar4 + 1;
      uVar6 = (uint)*pbVar4;
      if ((pbVar10 != unaff_x20) || (uVar6 != 0x24)) {
        if (0x2e < uVar6 - 0x2e || (1L << ((ulong)(uVar6 - 0x2e) & 0x3f) & 0x600000000001U) == 0) {
          func_0x0002e718(lVar7,(int)(char)*pbVar4);
          return pbVar10;
        }
        if ((pbVar10 != unaff_x20) && (uVar6 == 0x5c)) {
          uVar6 = (int)(char)*pbVar10 - 0x24;
          if ((uVar6 < 0x3b) && ((1L << ((ulong)uVar6 & 0x3f) & 0x580000000000441U) != 0)) {
            func_0x0002e718(lVar7,(int)(char)*pbVar10);
            return pbVar4 + 2;
          }
        }
        if (*pbVar4 == 0x2e) {
          puVar5 = (undefined8 *)__Znwm(0x10);
          lVar8 = *(long *)(lVar7 + 0x38);
          uVar9 = *(undefined8 *)(lVar8 + 8);
          *puVar5 = &UNK_009b35d8;
          puVar5[1] = uVar9;
          *(undefined8 **)(lVar8 + 8) = puVar5;
          *(undefined8 *)(lVar7 + 0x38) = *(undefined8 *)(*(long *)(lVar7 + 0x38) + 8);
          return pbVar10;
        }
      }
    }
    if ((pbVar4 == unaff_x20) || (*pbVar4 != 0x5b)) {
      return pbVar4;
    }
    if (pbVar4 + 1 != unaff_x20) {
      bVar1 = pbVar4[1];
      pbVar10 = pbVar4 + 2;
      if (bVar1 != 0x5e) {
        pbVar10 = pbVar4 + 1;
      }
      unaff_x22 = (byte *)__Znwm(0xb0);
      func_0x0002f53c(unaff_x22,lVar7,*(undefined8 *)(*(long *)(lVar7 + 0x38) + 8),bVar1 == 0x5e,
                      *(uint *)(lVar7 + 0x18) & 1,*(uint *)(lVar7 + 0x18) >> 3 & 1);
      *(byte **)(*(long *)(lVar7 + 0x38) + 8) = unaff_x22;
      *(byte **)(lVar7 + 0x38) = unaff_x22;
      if (pbVar10 != unaff_x20) {
        if (((*(ushort *)(lVar7 + 0x18) & 0x1f0) != 0) && (*pbVar10 == 0x5d)) {
          func_0x0002f0ac(unaff_x22,0x5d);
          pbVar10 = pbVar10 + 1;
        }
        if (pbVar10 != unaff_x20) {
          do {
            pbVar4 = pbVar10;
            pbVar10 = (byte *)func_0x000308dc(lVar7,pbVar4,unaff_x20,unaff_x22);
          } while (pbVar10 != pbVar4);
          if (pbVar4 != unaff_x20) {
            if (*pbVar4 == 0x2d) {
              func_0x0002f0ac(unaff_x22,0x2d);
              pbVar4 = pbVar4 + 1;
            }
            if ((pbVar4 != unaff_x20) && (*pbVar4 == 0x5d)) {
              return pbVar4 + 1;
            }
          }
        }
      }
    }
    uVar9 = func_0x00030890();
    __ZdlPv(unaff_x22);
    __Unwind_Resume(uVar9);
    uVar9 = ___cxa_allocate_exception(0x18);
    __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar9,0xb);
    pbVar4 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
    uVar3 = ___cxa_throw(uVar9,PTR___ZTINSt3__111regex_errorE_009b00f0);
    ___cxa_free_exception(uVar9);
    auVar13 = __Unwind_Resume(uVar3);
    pbVar10 = auVar13._8_8_;
    if (pbVar10 == pbVar4) {
code_r0x0002dee8:
      return pbVar10;
    }
    switch(*pbVar10) {
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
      func_0x0002e718(auVar13._0_8_,(int)(char)*pbVar10);
      return pbVar10 + 1;
    }
  }
  uVar6 = (uint)bVar1;
  pbVar12 = pbVar10;
  while( true ) {
    pbVar12 = pbVar12 + 1;
    iVar2 = uVar6 - 0x30;
    if (pbVar12 == unaff_x20) break;
    bVar1 = *pbVar12;
    if (((bVar1 & 0xf8) != 0x30) && ((bVar1 & 0xfe) != 0x38)) goto LAB_00033d5c;
    if (0xccccccb < iVar2) goto LAB_00033ed8;
    uVar6 = (uint)bVar1 + iVar2 * 10;
  }
  pbVar12 = unaff_x20;
LAB_00033d5c:
  if (pbVar12 == pbVar10) goto LAB_00033ed8;
  if (pbVar12 != unaff_x20) {
    pbVar10 = pbVar12 + 1;
    if (*pbVar12 == 0x2c) {
      if (pbVar10 != unaff_x20) {
        bVar1 = *pbVar10;
        if (((bVar1 & 0xf8) == 0x30) || ((bVar1 & 0xfe) == 0x38)) {
          pbVar10 = pbVar12 + 2;
          if (pbVar10 != unaff_x20) {
            uVar6 = (uint)bVar1;
            do {
              iVar11 = uVar6 - 0x30;
              bVar1 = *pbVar10;
              if (((bVar1 & 0xf8) != 0x30) && ((bVar1 & 0xfe) != 0x38)) goto LAB_00033da4;
              if (0xccccccb < iVar11) goto LAB_00033ed8;
              uVar6 = (uint)bVar1 + iVar11 * 10;
              pbVar10 = pbVar10 + 1;
            } while (pbVar10 != unaff_x20);
          }
        }
        else {
          iVar11 = -1;
LAB_00033da4:
          if ((((pbVar10 != unaff_x20) && (pbVar10 + 1 != unaff_x20)) && (*pbVar10 == 0x5c)) &&
             (pbVar10[1] == 0x7d)) {
            pbVar4 = pbVar10 + 2;
            if (iVar11 != -1) {
              if (iVar2 <= iVar11) {
                func_0x00033274();
                return pbVar4;
              }
              goto LAB_00033ed8;
            }
            goto LAB_00033eb0;
          }
        }
      }
    }
    else if (((pbVar10 != unaff_x20) && (*pbVar12 == 0x5c)) && (*pbVar10 == 0x7d)) {
      func_0x00033274();
      return pbVar12 + 2;
    }
  }
  func_0x000333f8();
LAB_00033eb0:
  func_0x00033274();
  return pbVar4;
}

