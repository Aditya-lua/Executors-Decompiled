
byte * thunk_FUN_0002c230(undefined8 param_1,undefined8 param_2,byte *param_3,undefined8 param_4,
                         ulong param_5,ulong param_6)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  byte *pbVar6;
  undefined8 uVar7;
  long lVar8;
  uint uVar9;
  byte *pbVar10;
  undefined1 auVar11 [16];
  
  auVar11 = func_0x0002c744();
  pbVar6 = auVar11._8_8_;
  lVar5 = auVar11._0_8_;
  if (pbVar6 == param_3) {
    return pbVar6;
  }
  uVar1 = *(uint *)(lVar5 + 0x18) & 0x1f0;
  bVar2 = *pbVar6;
  if ((char)bVar2 < '?') {
    if (bVar2 == 0x2a) {
      pbVar10 = pbVar6 + 1;
      if ((uVar1 != 0 || pbVar10 == param_3) || (*pbVar10 != 0x3f)) {
        lVar8 = 0;
        goto code_r0x0002c458;
      }
      pbVar6 = pbVar6 + 2;
      lVar8 = 0;
    }
    else {
      if (bVar2 != 0x2b) {
        return pbVar6;
      }
      pbVar10 = pbVar6 + 1;
      if (((uVar1 != 0) || (pbVar10 == param_3)) || (*pbVar10 != 0x3f)) {
        lVar8 = 1;
code_r0x0002c458:
        func_0x00033274(lVar5,lVar8,0xffffffffffffffff,param_4,param_5 & 0xffffffff,
                        param_6 & 0xffffffff,1);
        return pbVar10;
      }
      pbVar6 = pbVar6 + 2;
      lVar8 = 1;
    }
code_r0x0002c3d8:
    func_0x00033274(lVar5,lVar8,0xffffffffffffffff,param_4,param_5 & 0xffffffff,param_6 & 0xffffffff
                    ,0);
    return pbVar6;
  }
  if (bVar2 == 0x3f) {
    pbVar10 = pbVar6 + 1;
    if ((uVar1 == 0 && pbVar10 != param_3) && (*pbVar10 == 0x3f)) {
      func_0x00033274(lVar5,0,1,param_4,param_5 & 0xffffffff,param_6 & 0xffffffff,0);
      return pbVar6 + 2;
    }
    func_0x00033274(lVar5,0,1,param_4,param_5 & 0xffffffff,param_6 & 0xffffffff,1);
    return pbVar10;
  }
  if (bVar2 != 0x7b) {
    return pbVar6;
  }
  pbVar10 = pbVar6 + 1;
  if ((pbVar10 != param_3) &&
     ((bVar2 = *pbVar10, (bVar2 & 0xf8) == 0x30 || ((bVar2 & 0xfe) == 0x38)))) {
    uVar9 = (uint)bVar2;
    for (pbVar6 = pbVar6 + 2; iVar3 = uVar9 - 0x30, pbVar6 != param_3; pbVar6 = pbVar6 + 1) {
      bVar2 = *pbVar6;
      if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto code_r0x0002c32c;
      if (0xccccccb < iVar3) goto code_r0x0002c620;
      uVar9 = (uint)bVar2 + iVar3 * 10;
    }
    pbVar6 = param_3;
code_r0x0002c32c:
    if (pbVar6 != pbVar10) {
      if (pbVar6 == param_3) goto code_r0x0002c624;
      if (*pbVar6 == 0x2c) {
        pbVar10 = pbVar6 + 1;
        if (pbVar10 != param_3) {
          bVar2 = *pbVar10;
          if (bVar2 == 0x7d) {
            pbVar10 = pbVar6 + 2;
            if (((uVar1 != 0) || (pbVar10 == param_3)) || (*pbVar10 != 0x3f)) {
              lVar8 = (long)iVar3;
              goto code_r0x0002c458;
            }
            lVar8 = (long)iVar3;
            pbVar6 = pbVar6 + 3;
            goto code_r0x0002c3d8;
          }
          uVar9 = (uint)bVar2;
          if (((bVar2 & 0xf8) != 0x30) && ((uVar9 & 0xfe) != 0x38)) goto code_r0x0002c624;
          for (pbVar6 = pbVar6 + 2; iVar4 = uVar9 - 0x30, pbVar6 != param_3; pbVar6 = pbVar6 + 1) {
            bVar2 = *pbVar6;
            if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto code_r0x0002c57c;
            if (0xccccccb < iVar4) goto code_r0x0002c620;
            uVar9 = (uint)bVar2 + iVar4 * 10;
          }
          pbVar6 = param_3;
code_r0x0002c57c:
          if (((pbVar6 == pbVar10) || (pbVar6 == param_3)) || (*pbVar6 != 0x7d))
          goto code_r0x0002c624;
          if (iVar3 <= iVar4) {
            pbVar10 = pbVar6 + 1;
            if (((uVar1 == 0) && (pbVar10 != param_3)) && (*pbVar10 == 0x3f)) {
              func_0x00033274(lVar5,(long)iVar3,(long)iVar4,param_4,param_5 & 0xffffffff,
                              param_6 & 0xffffffff,0);
              return pbVar6 + 2;
            }
            func_0x00033274(lVar5,(long)iVar3,(long)iVar4,param_4,param_5 & 0xffffffff,
                            param_6 & 0xffffffff,1);
            return pbVar10;
          }
        }
      }
      else if (*pbVar6 == 0x7d) {
        pbVar10 = pbVar6 + 1;
        if (((uVar1 == 0) && (pbVar10 != param_3)) && (*pbVar10 == 0x3f)) {
          func_0x00033274(lVar5,(long)iVar3,(long)iVar3,param_4,param_5 & 0xffffffff,
                          param_6 & 0xffffffff,0);
          return pbVar6 + 2;
        }
        func_0x00033274(lVar5,(long)iVar3,(long)iVar3,param_4,param_5 & 0xffffffff,
                        param_6 & 0xffffffff,1);
        return pbVar10;
      }
    }
  }
code_r0x0002c620:
  func_0x000333ac();
code_r0x0002c624:
  pbVar6 = (byte *)func_0x000333f8();
  uVar7 = __ZNSt3__16localeC1Ev();
  uVar7 = __ZNKSt3__16locale9use_facetERNS0_2idE(uVar7,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  *(undefined8 *)(pbVar6 + 8) = uVar7;
  uVar7 = __ZNKSt3__16locale9use_facetERNS0_2idE(pbVar6,PTR___ZNSt3__17collateIcE2idE_009b00a0);
  *(undefined8 *)(pbVar6 + 0x10) = uVar7;
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

