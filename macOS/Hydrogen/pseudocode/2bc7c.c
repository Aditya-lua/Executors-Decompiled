
byte * FUN_0002bc7c(undefined8 param_1,byte *param_2)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  byte *pbVar5;
  undefined8 uVar6;
  uint uVar7;
  byte *unaff_x19;
  long unaff_x20;
  byte *unaff_x21;
  
  if (param_2 == unaff_x21) {
    return unaff_x21;
  }
  if (param_2 == unaff_x19) {
    return param_2;
  }
  uVar1 = *(uint *)(unaff_x20 + 0x18) & 0x1f0;
  bVar2 = *param_2;
  if ((char)bVar2 < '?') {
    if (bVar2 == 0x2a) {
      pbVar5 = param_2 + 1;
      if ((uVar1 != 0 || pbVar5 == unaff_x19) || (*pbVar5 != 0x3f)) goto code_r0x0002c458;
      param_2 = param_2 + 2;
    }
    else {
      if (bVar2 != 0x2b) {
        return param_2;
      }
      pbVar5 = param_2 + 1;
      if (((uVar1 != 0) || (pbVar5 == unaff_x19)) || (*pbVar5 != 0x3f)) {
code_r0x0002c458:
        func_0x00033274();
        return pbVar5;
      }
      param_2 = param_2 + 2;
    }
code_r0x0002c3d8:
    func_0x00033274();
    return param_2;
  }
  if (bVar2 == 0x3f) {
    pbVar5 = param_2 + 1;
    if ((uVar1 == 0 && pbVar5 != unaff_x19) && (*pbVar5 == 0x3f)) {
      func_0x00033274();
      return param_2 + 2;
    }
    func_0x00033274();
    return pbVar5;
  }
  if (bVar2 != 0x7b) {
    return param_2;
  }
  pbVar5 = param_2 + 1;
  if ((pbVar5 != unaff_x19) &&
     ((bVar2 = *pbVar5, (bVar2 & 0xf8) == 0x30 || ((bVar2 & 0xfe) == 0x38)))) {
    uVar7 = (uint)bVar2;
    for (param_2 = param_2 + 2; iVar3 = uVar7 - 0x30, param_2 != unaff_x19; param_2 = param_2 + 1) {
      bVar2 = *param_2;
      if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto code_r0x0002c32c;
      if (0xccccccb < iVar3) goto code_r0x0002c620;
      uVar7 = (uint)bVar2 + iVar3 * 10;
    }
    param_2 = unaff_x19;
code_r0x0002c32c:
    if (param_2 != pbVar5) {
      if (param_2 == unaff_x19) goto code_r0x0002c624;
      if (*param_2 == 0x2c) {
        pbVar5 = param_2 + 1;
        if (pbVar5 != unaff_x19) {
          bVar2 = *pbVar5;
          if (bVar2 == 0x7d) {
            pbVar5 = param_2 + 2;
            if (((uVar1 != 0) || (pbVar5 == unaff_x19)) || (*pbVar5 != 0x3f)) goto code_r0x0002c458;
            param_2 = param_2 + 3;
            goto code_r0x0002c3d8;
          }
          uVar7 = (uint)bVar2;
          if (((bVar2 & 0xf8) != 0x30) && ((uVar7 & 0xfe) != 0x38)) goto code_r0x0002c624;
          for (param_2 = param_2 + 2; iVar4 = uVar7 - 0x30, param_2 != unaff_x19;
              param_2 = param_2 + 1) {
            bVar2 = *param_2;
            if (((bVar2 & 0xf8) != 0x30) && ((bVar2 & 0xfe) != 0x38)) goto code_r0x0002c57c;
            if (0xccccccb < iVar4) goto code_r0x0002c620;
            uVar7 = (uint)bVar2 + iVar4 * 10;
          }
          param_2 = unaff_x19;
code_r0x0002c57c:
          if (((param_2 == pbVar5) || (param_2 == unaff_x19)) || (*param_2 != 0x7d))
          goto code_r0x0002c624;
          if (iVar3 <= iVar4) {
            pbVar5 = param_2 + 1;
            if (((uVar1 == 0) && (pbVar5 != unaff_x19)) && (*pbVar5 == 0x3f)) {
              func_0x00033274();
              return param_2 + 2;
            }
            func_0x00033274();
            return pbVar5;
          }
        }
      }
      else if (*param_2 == 0x7d) {
        pbVar5 = param_2 + 1;
        if (((uVar1 == 0) && (pbVar5 != unaff_x19)) && (*pbVar5 == 0x3f)) {
          func_0x00033274();
          return param_2 + 2;
        }
        func_0x00033274();
        return pbVar5;
      }
    }
  }
code_r0x0002c620:
  func_0x000333ac();
code_r0x0002c624:
  pbVar5 = (byte *)func_0x000333f8();
  uVar6 = __ZNSt3__16localeC1Ev();
  uVar6 = __ZNKSt3__16locale9use_facetERNS0_2idE(uVar6,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  *(undefined8 *)(pbVar5 + 8) = uVar6;
  uVar6 = __ZNKSt3__16locale9use_facetERNS0_2idE(pbVar5,PTR___ZNSt3__17collateIcE2idE_009b00a0);
  *(undefined8 *)(pbVar5 + 0x10) = uVar6;
  pbVar5[0x20] = 0;
  pbVar5[0x21] = 0;
  pbVar5[0x22] = 0;
  pbVar5[0x23] = 0;
  pbVar5[0x24] = 0;
  pbVar5[0x25] = 0;
  pbVar5[0x26] = 0;
  pbVar5[0x27] = 0;
  pbVar5[0x18] = 0;
  pbVar5[0x19] = 0;
  pbVar5[0x1a] = 0;
  pbVar5[0x1b] = 0;
  pbVar5[0x1c] = 0;
  pbVar5[0x1d] = 0;
  pbVar5[0x1e] = 0;
  pbVar5[0x1f] = 0;
  pbVar5[0x30] = 0;
  pbVar5[0x31] = 0;
  pbVar5[0x32] = 0;
  pbVar5[0x33] = 0;
  pbVar5[0x34] = 0;
  pbVar5[0x35] = 0;
  pbVar5[0x36] = 0;
  pbVar5[0x37] = 0;
  pbVar5[0x28] = 0;
  pbVar5[0x29] = 0;
  pbVar5[0x2a] = 0;
  pbVar5[0x2b] = 0;
  pbVar5[0x2c] = 0;
  pbVar5[0x2d] = 0;
  pbVar5[0x2e] = 0;
  pbVar5[0x2f] = 0;
  pbVar5[0x38] = 0;
  pbVar5[0x39] = 0;
  pbVar5[0x3a] = 0;
  pbVar5[0x3b] = 0;
  pbVar5[0x3c] = 0;
  pbVar5[0x3d] = 0;
  pbVar5[0x3e] = 0;
  pbVar5[0x3f] = 0;
  return pbVar5;
}

