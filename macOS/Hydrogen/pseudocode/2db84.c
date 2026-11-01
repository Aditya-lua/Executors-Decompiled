
byte * FUN_0002db84(undefined8 param_1,undefined8 param_2,byte *param_3)

{
  byte bVar1;
  long lVar2;
  byte *pbVar3;
  byte *pbVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  uint uVar7;
  byte *pbVar8;
  long unaff_x19;
  long unaff_x21;
  undefined1 auVar9 [16];
  
  *(undefined8 *)(unaff_x19 + 0x28) = param_1;
  __ZdlPv();
  auVar9 = __Unwind_Resume();
  pbVar8 = auVar9._8_8_;
  lVar2 = auVar9._0_8_;
  if ((pbVar8 == param_3) || (*pbVar8 != 0x5c)) {
    return pbVar8;
  }
  pbVar4 = pbVar8 + 1;
  if (pbVar4 == param_3) goto LAB_0002dd08;
  uVar7 = *pbVar4 - 0x30;
  if (uVar7 == 0) {
    func_0x0002e718(lVar2);
    return pbVar8 + 2;
  }
  if (8 < *pbVar4 - 0x31) goto code_r0x0002dc9c;
  pbVar3 = pbVar8 + 2;
  if (pbVar3 == param_3) {
    pbVar3 = param_3;
code_r0x0002dc80:
    if (uVar7 <= *(uint *)(lVar2 + 0x1c)) {
      func_0x0002e8a8(lVar2);
      if (pbVar3 != pbVar4) {
        return pbVar3;
      }
code_r0x0002dc9c:
      pbVar3 = (byte *)func_0x0002dfec(lVar2,pbVar4,param_3);
      if (pbVar3 != pbVar4) {
        return pbVar3;
      }
      pbVar3 = (byte *)func_0x0002e234(lVar2,pbVar4,param_3,0);
      if (pbVar3 != pbVar4) {
        pbVar8 = pbVar3;
      }
      return pbVar8;
    }
  }
  else {
    do {
      bVar1 = *pbVar3;
      if (9 < bVar1 - 0x30) goto code_r0x0002dc74;
      if (0x19999998 < uVar7) goto code_r0x0002dd04;
      pbVar3 = pbVar3 + 1;
      uVar7 = ((uint)bVar1 + uVar7 * 10) - 0x30;
    } while (pbVar3 != param_3);
    pbVar3 = param_3;
code_r0x0002dc74:
    if (uVar7 != 0) goto code_r0x0002dc80;
  }
code_r0x0002dd04:
  func_0x0002e85c();
  unaff_x21 = lVar2;
LAB_0002dd08:
  auVar9 = func_0x0002dfa0();
  pbVar8 = auVar9._8_8_;
  lVar2 = auVar9._0_8_;
  if ((pbVar8 == param_3) || (*pbVar8 != 0x5b)) {
    return pbVar8;
  }
  if (pbVar8 + 1 != param_3) {
    bVar1 = pbVar8[1];
    pbVar4 = pbVar8 + 2;
    if (bVar1 != 0x5e) {
      pbVar4 = pbVar8 + 1;
    }
    unaff_x21 = __Znwm(0xb0);
    func_0x0002f53c(unaff_x21,lVar2,*(undefined8 *)(*(long *)(lVar2 + 0x38) + 8),bVar1 == 0x5e,
                    *(uint *)(lVar2 + 0x18) & 1,*(uint *)(lVar2 + 0x18) >> 3 & 1);
    *(long *)(*(long *)(lVar2 + 0x38) + 8) = unaff_x21;
    *(long *)(lVar2 + 0x38) = unaff_x21;
    if (pbVar4 != param_3) {
      if (((*(ushort *)(lVar2 + 0x18) & 0x1f0) != 0) && (*pbVar4 == 0x5d)) {
        func_0x0002f0ac(unaff_x21,0x5d);
        pbVar4 = pbVar4 + 1;
      }
      if (pbVar4 != param_3) {
        do {
          pbVar8 = pbVar4;
          pbVar4 = (byte *)func_0x000308dc(lVar2,pbVar8,param_3,unaff_x21);
        } while (pbVar4 != pbVar8);
        if (pbVar8 != param_3) {
          if (*pbVar8 == 0x2d) {
            func_0x0002f0ac(unaff_x21,0x2d);
            pbVar8 = pbVar8 + 1;
          }
          if ((pbVar8 != param_3) && (*pbVar8 == 0x5d)) {
            return pbVar8 + 1;
          }
        }
      }
    }
  }
  uVar5 = func_0x00030890();
  __ZdlPv(unaff_x21);
  __Unwind_Resume(uVar5);
  uVar5 = ___cxa_allocate_exception(0x18);
  __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar5,0xb);
  pbVar8 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
  uVar6 = ___cxa_throw(uVar5,PTR___ZTINSt3__111regex_errorE_009b00f0);
  ___cxa_free_exception(uVar5);
  auVar9 = __Unwind_Resume(uVar6);
  pbVar4 = auVar9._8_8_;
  if (pbVar4 == pbVar8) {
code_r0x0002dee8:
    return pbVar4;
  }
  switch(*pbVar4) {
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
    func_0x0002e718(auVar9._0_8_,(int)(char)*pbVar4);
    return pbVar4 + 1;
  }
}

