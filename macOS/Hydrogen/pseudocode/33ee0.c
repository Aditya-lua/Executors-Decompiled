
byte * FUN_00033ee0(long param_1,byte *param_2,byte *param_3)

{
  byte bVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  uint uVar5;
  long lVar6;
  byte *pbVar7;
  byte *pbVar8;
  undefined1 auVar9 [16];
  undefined8 in_stack_00000008;
  
  if (param_2 != param_3) {
    pbVar7 = param_2 + 1;
    uVar5 = (uint)*param_2;
    if ((pbVar7 != param_3) || (uVar5 != 0x24)) {
      if (0x2e < uVar5 - 0x2e || (1L << ((ulong)(uVar5 - 0x2e) & 0x3f) & 0x600000000001U) == 0) {
        func_0x0002e718(param_1,(int)(char)*param_2);
        return pbVar7;
      }
      if ((pbVar7 != param_3) && (uVar5 == 0x5c)) {
        uVar5 = (int)(char)*pbVar7 - 0x24;
        if ((uVar5 < 0x3b) && ((1L << ((ulong)uVar5 & 0x3f) & 0x580000000000441U) != 0)) {
          func_0x0002e718(param_1,(int)(char)*pbVar7);
          return param_2 + 2;
        }
      }
      if (*param_2 == 0x2e) {
        puVar4 = (undefined8 *)__Znwm(0x10);
        lVar6 = *(long *)(param_1 + 0x38);
        uVar2 = *(undefined8 *)(lVar6 + 8);
        *puVar4 = &UNK_009b35d8;
        puVar4[1] = uVar2;
        *(undefined8 **)(lVar6 + 8) = puVar4;
        *(undefined8 *)(param_1 + 0x38) = *(undefined8 *)(*(long *)(param_1 + 0x38) + 8);
        return pbVar7;
      }
    }
  }
  if ((param_2 == param_3) || (*param_2 != 0x5b)) {
    return param_2;
  }
  if (param_2 + 1 != param_3) {
    bVar1 = param_2[1];
    pbVar7 = param_2 + 2;
    if (bVar1 != 0x5e) {
      pbVar7 = param_2 + 1;
    }
    in_stack_00000008 = __Znwm(0xb0);
    func_0x0002f53c(in_stack_00000008,param_1,*(undefined8 *)(*(long *)(param_1 + 0x38) + 8),
                    bVar1 == 0x5e,*(uint *)(param_1 + 0x18) & 1,*(uint *)(param_1 + 0x18) >> 3 & 1);
    *(undefined8 *)(*(long *)(param_1 + 0x38) + 8) = in_stack_00000008;
    *(undefined8 *)(param_1 + 0x38) = in_stack_00000008;
    if (pbVar7 != param_3) {
      if (((*(ushort *)(param_1 + 0x18) & 0x1f0) != 0) && (*pbVar7 == 0x5d)) {
        func_0x0002f0ac(in_stack_00000008,0x5d);
        pbVar7 = pbVar7 + 1;
      }
      if (pbVar7 != param_3) {
        do {
          pbVar8 = pbVar7;
          pbVar7 = (byte *)func_0x000308dc(param_1,pbVar8,param_3,in_stack_00000008);
        } while (pbVar7 != pbVar8);
        if (pbVar8 != param_3) {
          if (*pbVar8 == 0x2d) {
            func_0x0002f0ac(in_stack_00000008,0x2d);
            pbVar8 = pbVar8 + 1;
          }
          if ((pbVar8 != param_3) && (*pbVar8 == 0x5d)) {
            return pbVar8 + 1;
          }
        }
      }
    }
  }
  uVar2 = func_0x00030890();
  __ZdlPv(in_stack_00000008);
  __Unwind_Resume(uVar2);
  uVar2 = ___cxa_allocate_exception(0x18);
  __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar2,0xb);
  pbVar7 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
  uVar3 = ___cxa_throw(uVar2,PTR___ZTINSt3__111regex_errorE_009b00f0);
  ___cxa_free_exception(uVar2);
  auVar9 = __Unwind_Resume(uVar3);
  pbVar8 = auVar9._8_8_;
  if (pbVar8 == pbVar7) {
code_r0x0002dee8:
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
    goto code_r0x0002dee8;
  default:
    func_0x0002e718(auVar9._0_8_,(int)(char)*pbVar8);
    return pbVar8 + 1;
  }
}

