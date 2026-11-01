
void FUN_00711eac(long param_1,undefined1 param_2 [16],undefined1 param_3 [16])

{
  undefined8 *in_x9;
  long in_x10;
  long in_x11;
  undefined8 *in_x12;
  undefined8 *in_x13;
  long in_x14;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long lVar1;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  uVar5 = param_3._8_8_;
  uVar4 = param_3._0_8_;
  uVar3 = param_2._8_8_;
  uVar2 = param_2._0_8_;
  while( true ) {
    uVar9 = in_x12[-3];
    uVar8 = in_x12[-4];
    uVar7 = in_x12[-1];
    uVar6 = in_x12[-2];
    in_x13[1] = uVar5;
    *in_x13 = uVar4;
    in_x13[3] = uVar3;
    in_x13[2] = uVar2;
    in_x13[-3] = uVar9;
    in_x13[-4] = uVar8;
    in_x13[-1] = uVar7;
    in_x13[-2] = uVar6;
    in_x13 = in_x13 + -8;
    in_x14 = in_x14 + -8;
    if (in_x14 == 0) break;
    uVar5 = in_x12[-7];
    uVar4 = in_x12[-8];
    uVar3 = in_x12[-5];
    uVar2 = in_x12[-6];
    in_x12 = in_x12 + -8;
  }
  if (in_x10 != in_x11) {
    do {
      unaff_x21 = unaff_x21 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *unaff_x21;
    } while (unaff_x21 != unaff_x23);
  }
  lVar1 = *unaff_x20;
  *unaff_x20 = (long)in_x9;
  unaff_x20[1] = unaff_x22;
  unaff_x20[2] = param_1;
  if (lVar1 != 0) {
    __ZdlPv(lVar1);
  }
  unaff_x20[1] = unaff_x22;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  return;
}

