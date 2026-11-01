
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_0072eeac(long *param_1,long param_2,undefined8 param_3,undefined1 *param_4,int param_5)

{
  uint uVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  char *pcVar5;
  undefined1 *puVar6;
  long unaff_x19;
  long *unaff_x20;
  undefined8 uVar7;
  int *piVar8;
  long lVar9;
  undefined1 uStack0000000000000038;
  long lStack0000000000000138;
  undefined1 uStack0000000000000180;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined1 *puStack_28;
  long *plStack_20;
  long lStack_18;
  undefined1 *puStack_10;
  undefined *puStack_8;
  
  lStack0000000000000138 = *(long *)PTR____stack_chk_guard_009b01e8;
  puVar6 = param_4;
  if ((*(byte *)((long)param_1 + 0x24) & 1) == 0) {
    piVar8 = (int *)param_1[2];
    *param_4 = 0;
    unaff_x20 = param_1;
    if (piVar8[0x26] == -1) {
      uVar7 = func_0x0072fcc8(param_1);
      unaff_x19 = param_2;
      if ((int)uVar7 == 0) {
        if (*piVar8 == 5) {
          lVar9 = param_1[2];
          iVar2 = _connect(*(undefined4 *)(lVar9 + 0x98),lVar9 + 0x18,*(undefined4 *)(lVar9 + 0x14))
          ;
          if (iVar2 == -1) {
            piVar8 = (int *)___error();
            iVar2 = *piVar8;
            if (1 < iVar2 - 0x23U) {
              if (((param_2 != 0) && (*(char *)(param_2 + 0xa1d) < '\0')) &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + param_2 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + param_2 + 0x18) + 8))))) {
                param_1 = (long *)(lVar9 + 0x9c);
                func_0x0077ea88(iVar2,&uStack0000000000000038,0x100);
                func_0x0073cab8(param_2,"Immediate connect fail for %s: %s");
              }
              *(int *)(param_2 + 0xc54) = iVar2;
              uVar7 = 7;
              unaff_x20 = param_1;
              goto LAB_0072eef8;
            }
            if (param_2 != 0) goto LAB_0072f0ac;
          }
          else {
            *(byte *)(lVar9 + 0x134) = *(byte *)(lVar9 + 0x134) | 8;
            func_0x0072fadc(param_1[2],param_2);
            if (param_2 != 0) {
              if ((*(char *)(param_2 + 0xa1d) < '\0') &&
                 (((*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + param_2 + 0x18) == 0 ||
                   (0 < *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + param_2 + 0x18) + 8))) && (0 < *(int *)(*param_1 + 0xc))
                  ))) {
                func_0x0073cbdc(param_2,param_1,"%s socket %d connected: [%s:%d] -> [%s:%d]");
              }
LAB_0072f0ac:
              if (((*(char *)(param_2 + 0xa1d) < '\0') &&
                  ((*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + param_2 + 0x18) == 0 ||
                   (0 < *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + param_2 + 0x18) + 8))))) &&
                 (0 < *(int *)(*param_1 + 0xc))) {
                pcVar5 = "cf_udp_connect(), opened socket=%d (%s:%d)";
                goto LAB_0072f0f4;
              }
            }
          }
        }
        else if ((((param_2 != 0) && (*(char *)(param_2 + 0xa1d) < '\0')) &&
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + param_2 + 0x18) == 0 ||
                  (0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + param_2 + 0x18) + 8))))) &&
                (0 < *(int *)(*param_1 + 0xc))) {
          pcVar5 = "cf_udp_connect(), opened socket=%d (unconnected)";
LAB_0072f0f4:
          func_0x0073cbdc(param_2,param_1,pcVar5);
        }
        uVar7 = 0;
        *param_4 = 1;
        *(byte *)((long)param_1 + 0x24) = *(byte *)((long)param_1 + 0x24) | 1;
      }
      else if ((((param_2 != 0) && (*(char *)(param_2 + 0xa1d) < '\0')) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + param_2 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + param_2 + 0x18) + 8))))) && (0 < *(int *)(*param_1 + 0xc)))
      {
        func_0x0073cbdc(param_2,param_1,"cf_udp_connect(), open failed -> %d");
      }
    }
    else {
      uVar7 = 7;
    }
  }
  else {
    uVar7 = 0;
    *param_4 = 1;
  }
LAB_0072eef8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack0000000000000138) {
    return uVar7;
  }
  puVar3 = (undefined8 *)___stack_chk_fail();
  puStack_8 = &DAT_0072f174;
  uStack_38 = 0;
  uStack_30 = uVar7;
  puStack_28 = param_4;
  plStack_20 = unaff_x20;
  lStack_18 = unaff_x19;
  puStack_10 = &uStack0000000000000180;
  piVar8 = (int *)(*pcRam0000000000a2b608)(1,0x138);
  if (piVar8 == (int *)0x0) {
    uVar7 = 0x1b;
  }
  else {
    piVar8[0x4c] = 0;
    piVar8[0x4d] = 0;
    piVar8[0x46] = 0;
    piVar8[0x47] = 0;
    piVar8[0x44] = 0;
    piVar8[0x45] = 0;
    piVar8[0x4a] = 0;
    piVar8[0x4b] = 0;
    piVar8[0x48] = 0;
    piVar8[0x49] = 0;
    piVar8[0x3e] = 0;
    piVar8[0x3f] = 0;
    piVar8[0x3c] = 0;
    piVar8[0x3d] = 0;
    piVar8[0x42] = 0;
    piVar8[0x43] = 0;
    piVar8[0x40] = 0;
    piVar8[0x41] = 0;
    piVar8[0x36] = 0;
    piVar8[0x37] = 0;
    piVar8[0x34] = 0;
    piVar8[0x35] = 0;
    piVar8[0x3a] = 0;
    piVar8[0x3b] = 0;
    piVar8[0x38] = 0;
    piVar8[0x39] = 0;
    piVar8[0x2e] = 0;
    piVar8[0x2f] = 0;
    piVar8[0x2c] = 0;
    piVar8[0x2d] = 0;
    piVar8[0x32] = 0;
    piVar8[0x33] = 0;
    piVar8[0x30] = 0;
    piVar8[0x31] = 0;
    piVar8[0x26] = 0;
    piVar8[0x27] = 0;
    piVar8[0x24] = 0;
    piVar8[0x25] = 0;
    piVar8[0x2a] = 0;
    piVar8[0x2b] = 0;
    piVar8[0x28] = 0;
    piVar8[0x29] = 0;
    piVar8[0x1e] = 0;
    piVar8[0x1f] = 0;
    piVar8[0x1c] = 0;
    piVar8[0x1d] = 0;
    piVar8[0x22] = 0;
    piVar8[0x23] = 0;
    piVar8[0x20] = 0;
    piVar8[0x21] = 0;
    piVar8[0x16] = 0;
    piVar8[0x17] = 0;
    piVar8[0x14] = 0;
    piVar8[0x15] = 0;
    piVar8[0x1a] = 0;
    piVar8[0x1b] = 0;
    piVar8[0x18] = 0;
    piVar8[0x19] = 0;
    piVar8[0xe] = 0;
    piVar8[0xf] = 0;
    piVar8[0xc] = 0;
    piVar8[0xd] = 0;
    piVar8[0x12] = 0;
    piVar8[0x13] = 0;
    piVar8[0x10] = 0;
    piVar8[0x11] = 0;
    piVar8[6] = 0;
    piVar8[7] = 0;
    piVar8[4] = 0;
    piVar8[5] = 0;
    piVar8[10] = 0;
    piVar8[0xb] = 0;
    piVar8[8] = 0;
    piVar8[9] = 0;
    piVar8[2] = 0;
    piVar8[3] = 0;
    piVar8[0] = 0;
    piVar8[1] = 0;
    piVar8[0x26] = -1;
    *piVar8 = param_5;
    piVar8[2] = *(int *)(puVar6 + 4);
    if (param_5 == 3) {
      *(undefined8 *)(piVar8 + 3) = _UNK_008ccd40;
      uVar1 = *(uint *)(puVar6 + 0x10);
      piVar8[5] = uVar1;
    }
    else if (param_5 == 6) {
      *(undefined8 *)(piVar8 + 3) = _UNK_007fc080;
      uVar1 = *(uint *)(puVar6 + 0x10);
      piVar8[5] = uVar1;
    }
    else {
      *(undefined8 *)(piVar8 + 3) = _UNK_008ccd48;
      uVar1 = *(uint *)(puVar6 + 0x10);
      piVar8[5] = uVar1;
    }
    if (uVar1 < 0x81) {
      _memcpy(piVar8 + 6,*(undefined8 *)(puVar6 + 0x20));
      uVar7 = func_0x00730fe0(&uStack_38,0xa2b2f0,piVar8);
      uVar4 = uStack_38;
      if ((int)uVar7 != 0) {
        uVar4 = 0;
      }
      *puVar3 = uVar4;
      uVar4 = uStack_38;
      if ((int)uVar7 == 0) {
        return uVar7;
      }
      goto code_r0x0072f2c8;
    }
    uVar7 = 100;
  }
  *puVar3 = 0;
  uVar4 = 0;
code_r0x0072f2c8:
  (*pcRam0000000000a2b5f0)(uVar4);
  uStack_38 = 0;
  (*pcRam0000000000a2b5f0)(piVar8);
  return uVar7;
}

