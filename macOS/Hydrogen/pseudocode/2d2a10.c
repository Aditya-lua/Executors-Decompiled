
undefined8
FUN_002d2a10(ulong param_1,undefined8 param_2,undefined8 param_3,char *param_4,ulong param_5)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  bool in_ZR;
  long *plVar5;
  undefined8 uVar6;
  int in_w9;
  uint uVar7;
  char *pcVar8;
  ulong in_x10;
  ulong uVar9;
  ulong uVar10;
  uint in_w11;
  uint uVar11;
  long lVar12;
  long lVar13;
  int in_w12;
  ulong uVar14;
  ulong in_x13;
  ulong uVar15;
  undefined8 unaff_x19;
  char *unaff_x20;
  long *unaff_x21;
  int unaff_w22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x29;
  undefined1 auVar16 [16];
  char cStack0000000000000008;
  undefined1 uStack0000000000000015;
  undefined1 uStack0000000000000016;
  undefined1 auStack_c0 [72];
  undefined1 auStack_78 [72];
  
  if (in_ZR) {
    in_x13 = in_x10;
  }
  uVar9 = in_x13 >> 8;
  if (in_x13 < 0x100) {
    uVar9 = in_x13;
  }
  uVar10 = uVar9 >> 4;
  if (uVar9 < 0x10) {
    uVar10 = uVar9;
  }
  uVar14 = uVar10 >> 2;
  if (uVar10 < 4) {
    uVar14 = uVar10;
  }
  uVar7 = in_w11 | in_w9 << 6 | in_w12 << 5 | (uint)!in_ZR << 4 | (uint)(0xff < in_x13) << 3 |
          (uint)(0xf < uVar9) << 2 | (uint)(3 < uVar10) << 1;
  if (1 < uVar14) {
    uVar7 = uVar7 + 1;
  }
  if (param_1 == uVar7 + 7 >> 3) {
    param_5 = unaff_x24 + 0x48;
    if (unaff_w22 == 4) {
      param_4 = &cStack0000000000000008;
      (**(code **)(*unaff_x21 + 0x68))();
      uVar4 = *(uint *)(unaff_x21 + 0x29);
      uVar9 = (ulong)uVar4;
      uVar7 = uVar4 & (int)uVar4 >> 0x1f;
      lVar12 = uVar9 * 8;
      do {
        lVar12 = lVar12 + -8;
        uVar11 = (uint)uVar9;
        uVar9 = (ulong)(uVar11 - 1);
        if ((int)uVar11 < 1) {
          if ((int)uVar4 < 0) {
            lVar13 = unaff_x21[0x28];
            goto LAB_002d2b34;
          }
          pcVar8 = (char *)0x0;
          goto LAB_002d2bbc;
        }
        lVar13 = unaff_x21[0x28];
      } while (*(long *)(lVar13 + lVar12) == 0);
      uVar7 = uVar11;
LAB_002d2b34:
      uVar10 = *(ulong *)(lVar13 + (long)(int)(uVar7 - 1) * 8);
      uVar14 = uVar10 >> 0x20;
      uVar9 = uVar14;
      if (uVar14 == 0) {
        uVar9 = uVar10;
      }
      uVar15 = uVar9 >> 0x10;
      uVar1 = uVar15;
      if (uVar15 == 0) {
        uVar1 = uVar9;
      }
      uVar9 = uVar1 >> 8;
      if (uVar1 < 0x100) {
        uVar9 = uVar1;
      }
      uVar2 = uVar9 >> 4;
      if (uVar9 < 0x10) {
        uVar2 = uVar9;
      }
      uVar3 = uVar2 >> 2;
      if (uVar2 < 4) {
        uVar3 = uVar2;
      }
      uVar7 = (uint)(uVar10 != 0) | (uVar7 - 1) * 0x40 | (uint)(uVar14 != 0) << 5 |
              (uint)(uVar15 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar9) << 2 |
              (uint)(3 < uVar2) << 1;
      if (1 < uVar3) {
        uVar7 = uVar7 + 1;
      }
      pcVar8 = (char *)(ulong)(uVar7 + 7 >> 3);
LAB_002d2bbc:
      if (_cStack0000000000000008 != pcVar8) goto code_r0x002d2c04;
      *unaff_x20 = '\x04';
    }
    else {
      (**(code **)(*unaff_x21 + 0x68))();
      *unaff_x20 = ((&uStack0000000000000015)[(long)_cStack0000000000000008] & 1) + (char)unaff_w22;
      param_4 = _cStack0000000000000008;
      if ((unaff_w22 == 6) && (_cStack0000000000000008 != (char *)0x0)) {
        _memcpy(_cStack0000000000000008 + unaff_x23,&uStack0000000000000016);
      }
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return unaff_x19;
    }
  }
  else {
    func_0x0079ea3c();
code_r0x002d2c04:
    func_0x0079ea14();
  }
  auVar16 = ___stack_chk_fail();
  plVar5 = auVar16._0_8_;
  uVar4 = *(uint *)(plVar5 + 0x29);
  uVar9 = (ulong)uVar4;
  uVar7 = uVar4 & (int)uVar4 >> 0x1f;
  lVar12 = uVar9 * 8;
  do {
    lVar12 = lVar12 + -8;
    uVar11 = (uint)uVar9;
    uVar9 = (ulong)(uVar11 - 1);
    if ((int)uVar11 < 1) {
      if (-1 < (int)uVar4) {
        uVar9 = 0;
        if (param_5 != 1) goto code_r0x002d2d8c;
        goto code_r0x002d2d14;
      }
      lVar13 = plVar5[0x28];
      goto code_r0x002d2c7c;
    }
    lVar13 = plVar5[0x28];
  } while (*(long *)(lVar13 + lVar12) == 0);
  uVar7 = uVar11;
code_r0x002d2c7c:
  uVar10 = *(ulong *)(lVar13 + (long)(int)(uVar7 - 1) * 8);
  uVar14 = uVar10 >> 0x20;
  uVar9 = uVar14;
  if (uVar14 == 0) {
    uVar9 = uVar10;
  }
  uVar15 = uVar9 >> 0x10;
  uVar1 = uVar15;
  if (uVar15 == 0) {
    uVar1 = uVar9;
  }
  uVar9 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar9 = uVar1;
  }
  uVar2 = uVar9 >> 4;
  if (uVar9 < 0x10) {
    uVar2 = uVar9;
  }
  uVar3 = uVar2 >> 2;
  if (uVar2 < 4) {
    uVar3 = uVar2;
  }
  uVar7 = (uint)(uVar10 != 0) | (uVar7 - 1) * 0x40 | (uint)(uVar14 != 0) << 5 |
          (uint)(uVar15 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar9) << 2 |
          (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar7 = uVar7 + 1;
  }
  uVar9 = (ulong)(uVar7 + 7 >> 3);
  if ((uVar9 << 1 | 1) == param_5) {
code_r0x002d2d14:
    if (*param_4 == '\x04') {
      uVar6 = (**(code **)(*plVar5 + 0x70))(plVar5,auStack_78,param_4 + 1,uVar9);
      if (((int)uVar6 != 0) &&
         (uVar6 = (**(code **)(*plVar5 + 0x70))(plVar5,auStack_c0,param_4 + 1 + uVar9,uVar9),
         (int)uVar6 != 0)) {
        uVar6 = func_0x002c8858(plVar5,auVar16._8_8_,auStack_78,auStack_c0);
      }
      return uVar6;
    }
  }
code_r0x002d2d8c:
  func_0x0028f83c(0xf,0,0x6d,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x8a);
  return 0;
}

