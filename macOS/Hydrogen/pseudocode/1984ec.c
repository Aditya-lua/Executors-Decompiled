
void FUN_001984ec(long param_1)

{
  undefined8 *puVar1;
  undefined1 in_ZR;
  long in_x9;
  long lVar2;
  long in_x10;
  undefined4 *in_x11;
  undefined8 *puVar3;
  undefined8 *in_x12;
  undefined8 *puVar4;
  undefined8 *in_x13;
  long in_x14;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar7;
  
  while( true ) {
    if ((bool)in_ZR) {
      uVar5 = 0;
      uVar6 = 0;
    }
    else {
      uVar5 = in_x12[-0x16];
      uVar6 = in_x12[-0x15];
    }
    *(undefined8 *)(in_x11 + -0x3e) = in_x13[-8];
    *(undefined8 *)(in_x11 + -0x3c) = uVar6;
    *(undefined8 *)(in_x11 + -0x3a) = uVar5;
    in_x11[-0x38] = 0;
    if (in_x12[-0x14] == in_x14) {
      uVar5 = 0;
      uVar6 = 0;
    }
    else {
      uVar5 = in_x12[-0x13];
      uVar6 = in_x12[-0x12];
    }
    *(undefined8 *)(in_x11 + -0x36) = in_x13[-6];
    *(undefined8 *)(in_x11 + -0x34) = uVar6;
    *(undefined8 *)(in_x11 + -0x32) = uVar5;
    in_x11[-0x30] = 0;
    if (in_x12[-0x11] == in_x14) {
      uVar5 = 0;
      uVar6 = 0;
    }
    else {
      uVar5 = in_x12[-0x10];
      uVar6 = in_x12[-0xf];
    }
    *(undefined8 *)(in_x11 + -0x2e) = in_x13[-4];
    *(undefined8 *)(in_x11 + -0x2c) = uVar6;
    *(undefined8 *)(in_x11 + -0x2a) = uVar5;
    in_x11[-0x28] = 0;
    if (in_x12[-0xe] == in_x14) {
      uVar5 = 0;
      uVar6 = 0;
    }
    else {
      uVar5 = in_x12[-0xd];
      uVar6 = in_x12[-0xc];
    }
    *(undefined8 *)(in_x11 + -0x26) = in_x13[-2];
    *(undefined8 *)(in_x11 + -0x24) = uVar6;
    *(undefined8 *)(in_x11 + -0x22) = uVar5;
    in_x11[-0x20] = 0;
    if (in_x12[-0xb] == in_x14) {
      uVar5 = 0;
      uVar6 = 0;
    }
    else {
      uVar5 = in_x12[-10];
      uVar6 = in_x12[-9];
    }
    *(undefined8 *)(in_x11 + -0x1e) = *in_x13;
    *(undefined8 *)(in_x11 + -0x1c) = uVar6;
    *(undefined8 *)(in_x11 + -0x1a) = uVar5;
    in_x11[-0x18] = 0;
    if (in_x12[-8] == in_x14) {
      uVar5 = 0;
      uVar6 = 0;
    }
    else {
      uVar5 = in_x12[-7];
      uVar6 = in_x12[-6];
    }
    *(undefined8 *)(in_x11 + -0x16) = in_x13[2];
    *(undefined8 *)(in_x11 + -0x14) = uVar6;
    *(undefined8 *)(in_x11 + -0x12) = uVar5;
    in_x11[-0x10] = 0;
    if (in_x12[-5] == in_x14) {
      uVar5 = 0;
      uVar6 = 0;
    }
    else {
      uVar5 = in_x12[-4];
      uVar6 = in_x12[-3];
    }
    *(undefined8 *)(in_x11 + -0xe) = in_x13[4];
    *(undefined8 *)(in_x11 + -0xc) = uVar6;
    *(undefined8 *)(in_x11 + -10) = uVar5;
    in_x11[-8] = 0;
    if (in_x12[-2] == in_x14) {
      uVar5 = 0;
      uVar6 = 0;
    }
    else {
      uVar5 = in_x12[-1];
      uVar6 = *in_x12;
    }
    *(undefined8 *)(in_x11 + -6) = in_x13[6];
    *(undefined8 *)(in_x11 + -4) = uVar6;
    in_x9 = in_x9 + -8;
    *(undefined8 *)(in_x11 + -2) = uVar5;
    *in_x11 = 0;
    in_x11 = in_x11 + 0x40;
    in_x13 = in_x13 + 0x10;
    if (in_x10 == in_x9) break;
    in_ZR = in_x12[1] == in_x14;
    in_x12 = in_x12 + 0x18;
  }
  if (param_1 != 0) {
    lVar2 = 0;
    puVar4 = (undefined8 *)(unaff_x25 + in_x9 * -0x18 + 8);
    puVar3 = (undefined8 *)(unaff_x26 + in_x9 * -0x10);
    do {
      if (puVar4[-1] == -0x8000000000000000) {
        uVar5 = 0;
        uVar6 = 0;
      }
      else {
        uVar5 = *puVar4;
        uVar6 = puVar4[1];
      }
      puVar1 = (undefined8 *)(unaff_x21 + in_x9 * -0x20 + lVar2);
      *puVar1 = *puVar3;
      puVar1[1] = uVar6;
      puVar1[2] = uVar5;
      *(undefined4 *)(puVar1 + 3) = 0;
      lVar2 = lVar2 + 0x20;
      puVar4 = puVar4 + 3;
      puVar3 = puVar3 + 2;
    } while (param_1 * 0x20 != lVar2);
  }
  if (unaff_x19[6] != 0) {
    func_0x00187bd4(unaff_x19[7],unaff_x19[6] << 5,8);
  }
  unaff_x19[6] = unaff_x22;
  unaff_x19[7] = unaff_x21;
  unaff_x19[8] = unaff_x24;
  *(int *)(unaff_x19 + 9) = (int)unaff_x24;
  unaff_x19[10] = unaff_x21;
  unaff_x20[10] = unaff_x21;
  uVar5 = *unaff_x19;
  uVar7 = unaff_x19[3];
  uVar6 = unaff_x19[2];
  unaff_x20[1] = unaff_x19[1];
  *unaff_x20 = uVar5;
  unaff_x20[3] = uVar7;
  unaff_x20[2] = uVar6;
  uVar5 = unaff_x19[4];
  uVar7 = unaff_x19[7];
  uVar6 = unaff_x19[6];
  unaff_x20[5] = unaff_x19[5];
  unaff_x20[4] = uVar5;
  unaff_x20[7] = uVar7;
  unaff_x20[6] = uVar6;
  uVar5 = unaff_x19[8];
  unaff_x20[9] = unaff_x19[9];
  unaff_x20[8] = uVar5;
  return;
}

