
undefined8 FUN_00304330(long param_1,undefined8 param_2,uint param_3,ulong param_4,long *param_5)

{
  uint uVar1;
  int iVar2;
  bool in_ZR;
  undefined8 uVar3;
  long *plVar4;
  ulong in_x9;
  ulong uVar5;
  long lVar6;
  long lVar7;
  uint uVar8;
  long unaff_x22;
  undefined1 auVar9 [16];
  
  if (in_ZR) {
    uVar3 = 0xffffffff;
    if (0x19 < param_3) {
LAB_00304470:
      return uVar3;
    }
    lVar6 = in_x9 + (in_x9 & 8);
    uVar8 = (uint)param_4;
    switch(param_3) {
    case 0:
      *(undefined8 *)(lVar6 + 0x278) = 0;
      *(undefined4 *)(lVar6 + 0x288) = *(undefined4 *)(param_1 + 0xc);
      *(long *)(lVar6 + 0x280) = unaff_x22 + 0x34;
      *(undefined8 *)(lVar6 + 0x28c) = 0xffffffff;
      return 1;
    default:
      goto LAB_00304470;
    case 8:
      if (*(int *)(*param_5 + 0x10) != 0x2a8) goto code_r0x003046fc;
      uVar5 = param_5[2];
      if ((uVar5 & 7) == 0) {
        lVar7 = uVar5 + (uVar5 & 8);
        _memcpy(lVar7,lVar6,0x2a0);
        if (*(long *)(lVar6 + 0x280) == unaff_x22 + 0x34) {
          *(undefined4 **)(lVar7 + 0x280) = (undefined4 *)((long)param_5 + 0x34);
          return 1;
        }
        lVar6 = func_0x0036effc(*(long *)(lVar6 + 0x280),(long)*(int *)(lVar6 + 0x288));
        *(long *)(lVar7 + 0x280) = lVar6;
        if (lVar6 == 0) {
          return 0;
        }
        return 1;
      }
      goto code_r0x00304700;
    case 9:
      if (0 < (int)uVar8) {
        if ((0x10 < uVar8) && (*(int *)(lVar6 + 0x288) < (int)uVar8)) {
          if (*(long *)(lVar6 + 0x280) != unaff_x22 + 0x34) {
            func_0x0036e3d8();
          }
          lVar7 = func_0x0036e274(param_4 & 0xffffffff);
          *(long *)(lVar6 + 0x280) = lVar7;
          if (lVar7 == 0) {
            return 0;
          }
        }
        *(uint *)(lVar6 + 0x288) = uVar8;
        return 1;
      }
      break;
    case 0x10:
      if (((0xffffffef < uVar8 - 0x11) && (*(int *)(unaff_x22 + 0x1c) != 0)) &&
         (-1 < *(int *)(lVar6 + 0x28c))) {
        _memcpy(param_5,unaff_x22 + 0x44,param_4 & 0xffffffff);
        return 1;
      }
      break;
    case 0x11:
      if (uVar8 - 0x11 < 0xfffffff0) {
        return 0;
      }
      if (*(int *)(unaff_x22 + 0x1c) == 0) {
        _memcpy(unaff_x22 + 0x44,param_5,param_4 & 0xffffffff);
        *(uint *)(lVar6 + 0x28c) = uVar8;
        return 1;
      }
      break;
    case 0x12:
      if (uVar8 == 0xffffffff) {
        if (*(int *)(lVar6 + 0x288) != 0) {
          _memcpy(*(undefined8 *)(lVar6 + 0x280),param_5);
        }
      }
      else {
        if ((int)uVar8 < 4) {
          return 0;
        }
        if ((int)(*(int *)(lVar6 + 0x288) - uVar8) < 8) {
          return 0;
        }
        _memcpy(*(undefined8 *)(lVar6 + 0x280),param_5,param_4 & 0xffffffff);
        if (*(int *)(unaff_x22 + 0x1c) != 0) {
          func_0x002b0104(*(long *)(lVar6 + 0x280) + (param_4 & 0xffffffff),
                          (long)*(int *)(lVar6 + 0x288) - (long)(int)uVar8,&UNK_00831b38);
        }
      }
      *(undefined4 *)(lVar6 + 0x290) = 1;
      return 1;
    case 0x13:
      if ((*(int *)(lVar6 + 0x290) != 0) && (*(int *)(lVar6 + 0x278) != 0)) {
        func_0x002f36d4(lVar6,lVar6 + 0x180,*(undefined8 *)(lVar6 + 0x280),
                        (long)*(int *)(lVar6 + 0x288));
        uVar1 = *(uint *)(lVar6 + 0x288);
        if ((((int)uVar8 < 1) || ((int)uVar1 < (int)uVar8)) && (param_4 = (ulong)uVar1, uVar1 == 0))
        {
          lVar7 = 0;
        }
        else {
          _memcpy(param_5,(*(long *)(lVar6 + 0x280) + (long)(int)uVar1) - (long)(int)param_4);
          lVar7 = (long)*(int *)(lVar6 + 0x288);
        }
        lVar7 = *(long *)(lVar6 + 0x280) + lVar7;
        uVar5 = *(ulong *)(lVar7 + -8);
        uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar5 = (uVar5 >> 0x20 | uVar5 << 0x20) + 1;
        uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        *(ulong *)(lVar7 + -8) = uVar5 >> 0x20 | uVar5 << 0x20;
code_r0x00304614:
        *(undefined4 *)(lVar6 + 0x27c) = 1;
        return 1;
      }
      break;
    case 0x18:
      if (((*(int *)(lVar6 + 0x290) != 0) && (*(int *)(lVar6 + 0x278) != 0)) &&
         (*(int *)(unaff_x22 + 0x1c) == 0)) {
        if (uVar8 != 0) {
          _memcpy((*(long *)(lVar6 + 0x280) + (long)*(int *)(lVar6 + 0x288)) - (long)(int)uVar8,
                  param_5);
        }
        func_0x002f36d4(lVar6,lVar6 + 0x180,*(undefined8 *)(lVar6 + 0x280),
                        (long)*(int *)(lVar6 + 0x288));
        goto code_r0x00304614;
      }
      break;
    case 0x19:
      *(undefined4 *)param_5 = *(undefined4 *)(lVar6 + 0x288);
      return 1;
    }
    return 0;
  }
  uVar3 = func_0x0079f3d4();
code_r0x003046fc:
  func_0x0079f3f8(uVar3);
code_r0x00304700:
  auVar9 = func_0x0079f3d4();
  lVar6 = auVar9._8_8_;
  plVar4 = auVar9._0_8_;
  if (lVar6 == 0 && param_4 == 0) {
    return 1;
  }
  lVar7 = plVar4[2];
  if (lVar6 == 0) {
    if (param_4 == 0) {
      return 1;
    }
  }
  else {
    iVar2 = (int)plVar4[3] * 8;
    if (*(int *)((long)plVar4 + 0x1c) == 0) {
      if (((iVar2 == 0x80) || (iVar2 == 0x100)) || (iVar2 == 0xc0)) {
        if ((uRam0000000000a334f8 >> 2 & 1) == 0) {
          if ((uRam0000000000a334f8 & 1) == 0) goto LAB_003047ac;
          func_0x0038a680(lVar6,iVar2,lVar7);
        }
        else {
          func_0x00378700(lVar6,iVar2,lVar7);
        }
      }
    }
    else if (((iVar2 == 0x80) || (iVar2 == 0x100)) || (iVar2 == 0xc0)) {
      if ((uRam0000000000a334f8 >> 2 & 1) == 0) {
        if ((uRam0000000000a334f8 & 1) == 0) {
LAB_003047ac:
          func_0x00296a94(lVar6,iVar2,lVar7);
        }
        else {
          func_0x0038a640(lVar6,iVar2,lVar7);
        }
      }
      else {
        func_0x003784e0(lVar6,iVar2,lVar7);
      }
    }
    if (param_4 == 0) {
      lVar6 = 0;
      goto LAB_00304824;
    }
  }
  lVar6 = (long)plVar4 + 0x34;
  if (*(int *)(*plVar4 + 0xc) != 0) {
    _memcpy(lVar6,param_4);
  }
LAB_00304824:
  *(long *)(lVar7 + 0xf8) = lVar6;
  return 1;
}

