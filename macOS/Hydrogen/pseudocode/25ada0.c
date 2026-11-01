
void FUN_0025ada0(long *param_1,long *param_2,long *param_3)

{
  bool bVar1;
  long lVar2;
  undefined4 uVar3;
  ulong uVar4;
  ulong extraout_x8;
  ulong extraout_x8_00;
  ulong extraout_x8_01;
  long extraout_x9;
  long lVar5;
  long extraout_x9_00;
  long extraout_x9_01;
  long extraout_x9_02;
  long lVar6;
  undefined8 *puVar7;
  long lVar8;
  long lVar9;
  undefined1 uStack0000000000000008;
  ulong uStack0000000000000010;
  ulong uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  ulong in_stack_00000070;
  long in_stack_00000078;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  long in_stack_00000098;
  byte in_stack_000000a0;
  ulong in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 uStack00000000000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  ulong in_stack_000000e0;
  undefined1 uStack00000000000000e8;
  undefined7 uStack00000000000000e9;
  undefined8 uStack00000000000000f8;
  long in_stack_00000100;
  long in_stack_00000108;
  undefined8 uStack0000000000000110;
  ulong in_stack_00000118;
  long in_stack_00000120;
  long in_stack_00000128;
  long in_stack_00000130;
  ulong in_stack_00000138;
  long in_stack_00000140;
  undefined8 uStack0000000000000148;
  undefined1 uStack0000000000000150;
  undefined7 uStack0000000000000151;
  long in_stack_00000158;
  long in_stack_00000160;
  long in_stack_00000168;
  ulong in_stack_00000170;
  long in_stack_00000178;
  
  _uStack0000000000000008 = *param_2;
  uStack0000000000000010 = param_2[1];
  uStack0000000000000018 = 0;
  func_0x00263a40(&uStack0000000000000088,&uStack0000000000000008,2);
  lVar6 = in_stack_00000098;
  lVar9 = in_stack_00000090;
  lVar2 = uStack0000000000000088;
  if (uStack0000000000000088 == -0x7fffffffffffffd4) {
    if (uStack0000000000000018 < uStack0000000000000010) {
      bVar1 = *(char *)(_uStack0000000000000008 + uStack0000000000000018) == '\x17';
    }
    else {
      bVar1 = false;
    }
    uStack00000000000000c0 = CONCAT71(uStack00000000000000c0._1_7_,bVar1);
    uStack0000000000000150 = 0x12;
    uStack0000000000000148 = -0x7fffffffffffffe4;
    uVar3 = 0x17;
    if (!bVar1) {
      uVar3 = 0x18;
    }
    func_0x00262c20(&uStack0000000000000110,&uStack0000000000000008,uVar3,&uStack0000000000000148,
                    &uStack00000000000000c0,0xffff);
    if (uStack0000000000000110 == -0x7fffffffffffffd4) {
      in_stack_000000d8 = lVar6;
      in_stack_000000e0 = in_stack_00000118;
      uStack00000000000000e8 = 0xb;
      in_stack_000000d0 = lVar9;
      uStack00000000000000c0 = 0;
      if (uStack0000000000000018 == uStack0000000000000010) {
LAB_0025aedc:
        in_stack_00000078 = CONCAT71(uStack00000000000000e9,uStack00000000000000e8);
        lVar6 = 0;
        lVar2 = 0;
        if (uStack0000000000000018 != uStack0000000000000010) {
LAB_0025b024:
          lVar6 = *param_3;
          lVar9 = param_3[3];
          lVar2 = param_3[2];
          param_1[1] = param_3[1];
          *param_1 = lVar6;
          param_1[3] = lVar9;
          param_1[2] = lVar2;
          lVar6 = param_3[4];
          param_1[5] = param_3[5];
          param_1[4] = lVar6;
          param_1[6] = param_3[6];
          return;
        }
      }
      else {
        func_0x00263a40(&uStack0000000000000148,&uStack0000000000000008,0x30);
        uVar4 = CONCAT71(uStack0000000000000151,uStack0000000000000150);
        if (uStack0000000000000148 != -0x7fffffffffffffd4) {
          lVar5 = in_stack_00000158;
          lVar8 = uStack0000000000000148;
          in_stack_00000060 = in_stack_00000160;
          in_stack_00000068 = in_stack_00000168;
          in_stack_00000070 = in_stack_00000170;
          in_stack_00000078 = in_stack_00000178;
          goto LAB_0025b05c;
        }
        if (in_stack_00000158 == 0) goto LAB_0025aedc;
        in_stack_00000100 = in_stack_00000158;
        in_stack_00000108 = 0;
        uStack00000000000000f8 = uVar4;
        do {
          uStack0000000000000150 = 0x17;
          uStack0000000000000148 = -0x7fffffffffffffe4;
          func_0x00263630(&uStack0000000000000110,&uStack00000000000000f8,0x30,
                          &uStack0000000000000148,&uStack00000000000000c0,0xffff);
          if (uStack0000000000000110 != -0x7fffffffffffffd4) goto LAB_0025b04c;
        } while (in_stack_00000108 != in_stack_00000100);
        in_stack_00000078 = CONCAT71(uStack00000000000000e9,uStack00000000000000e8);
        lVar6 = uStack00000000000000c0;
        lVar2 = in_stack_000000c8;
        if (uStack0000000000000018 != uStack0000000000000010) goto LAB_0025b024;
      }
      param_1[4] = in_stack_000000d8;
      param_1[3] = in_stack_000000d0;
      param_1[6] = in_stack_00000078;
      param_1[5] = in_stack_000000e0;
      param_1[2] = lVar2;
      param_1[1] = lVar6;
      *param_1 = -0x7fffffffffffffd4;
      lVar6 = *param_3;
      if (lVar6 < -0x7fffffffffffffd4) {
        return;
      }
      in_stack_00000020 = in_stack_000000d0;
      in_stack_00000028 = in_stack_000000d8;
      in_stack_00000030 = in_stack_000000e0;
      in_stack_00000038 = in_stack_00000078;
      in_stack_00000060 = in_stack_000000d0;
      in_stack_00000068 = in_stack_000000d8;
      in_stack_00000070 = in_stack_000000e0;
      if ((((*(byte *)(param_3 + 3) & 1) == 0) && (lVar2 = param_3[4], lVar2 != -0x8000000000000000)
          ) && (lVar2 != 0)) {
        func_0x00187bd4(param_3[5],lVar2,1);
      }
      lVar2 = param_3[1];
      lVar9 = param_3[2];
      if (lVar9 != 0) {
        puVar7 = (undefined8 *)(lVar2 + 8);
        do {
          if (puVar7[-1] != 0) {
            func_0x00187bd4(*puVar7,puVar7[-1],1);
          }
          puVar7 = puVar7 + 3;
          lVar9 = lVar9 + -1;
        } while (lVar9 != 0);
      }
      goto LAB_0025b0e0;
    }
LAB_0025b04c:
    uVar4 = in_stack_00000118;
    lVar5 = in_stack_00000120;
    lVar8 = uStack0000000000000110;
    in_stack_00000060 = in_stack_00000128;
    in_stack_00000068 = in_stack_00000130;
    in_stack_00000070 = in_stack_00000138;
    in_stack_00000078 = in_stack_00000140;
  }
  else {
    uVar4 = 0x800000000000002b;
    lVar8 = -0x7ffffffffffffff3;
    lVar5 = extraout_x9;
    if (-0x7fffffffffffffd5 < uStack0000000000000088) {
      uVar4 = (ulong)in_stack_000000a0;
      if (in_stack_000000a0 == 0) {
        uVar4 = in_stack_000000a8 | 0x8000000000000000;
        lVar5 = -0x8000000000000000;
        if (uVar4 != 0x8000000000000000) {
          func_0x00187bd4(in_stack_000000b0,in_stack_000000a8,1);
          uVar4 = extraout_x8;
          lVar5 = extraout_x9_00;
        }
      }
      if (lVar6 != 0) {
        puVar7 = (undefined8 *)(lVar9 + 8);
        do {
          if (puVar7[-1] != 0) {
            func_0x00187bd4(*puVar7,puVar7[-1],1);
            uVar4 = extraout_x8_00;
            lVar5 = extraout_x9_01;
          }
          puVar7 = puVar7 + 3;
          lVar6 = lVar6 + -1;
        } while (lVar6 != 0);
      }
      if (lVar2 != 0) {
        func_0x00187bd4(lVar9,lVar2 * 0x18,8);
        uVar4 = extraout_x8_01;
        lVar5 = extraout_x9_02;
      }
    }
  }
LAB_0025b05c:
  in_stack_00000048 = in_stack_00000068;
  in_stack_00000040 = in_stack_00000060;
  in_stack_00000058 = in_stack_00000078;
  in_stack_00000050 = in_stack_00000070;
  param_1[4] = in_stack_00000068;
  param_1[3] = in_stack_00000060;
  param_1[6] = in_stack_00000078;
  param_1[5] = in_stack_00000070;
  *param_1 = lVar8;
  param_1[1] = uVar4;
  param_1[2] = lVar5;
  lVar6 = *param_3;
  if (lVar6 < -0x7fffffffffffffd4) {
    return;
  }
  if ((((*(byte *)(param_3 + 3) & 1) == 0) && (lVar2 = param_3[4], lVar2 != -0x8000000000000000)) &&
     (lVar2 != 0)) {
    func_0x00187bd4(param_3[5],lVar2,1);
  }
  lVar2 = param_3[1];
  lVar9 = param_3[2];
  if (lVar9 != 0) {
    puVar7 = (undefined8 *)(lVar2 + 8);
    do {
      if (puVar7[-1] != 0) {
        func_0x00187bd4(*puVar7,puVar7[-1],1);
      }
      puVar7 = puVar7 + 3;
      lVar9 = lVar9 + -1;
    } while (lVar9 != 0);
  }
LAB_0025b0e0:
  if (lVar6 != 0) {
    func_0x00187bd4(lVar2,lVar6 * 0x18,8);
  }
  return;
}

