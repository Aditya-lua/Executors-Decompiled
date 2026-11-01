
void FUN_00689648(ulong *param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 *in_x9;
  long in_x10;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong *in_x11;
  undefined8 *in_x12;
  undefined8 *in_x13;
  undefined8 *in_x14;
  ulong uVar5;
  ulong uVar6;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uVar7;
  
  do {
    uVar5 = in_x10 - 8;
    puVar3 = in_x9;
    if ((uVar5 < 0x68) ||
       ((in_x9 < in_x13 &&
        (unaff_x19 < (undefined8 *)((long)in_x9 + (uVar5 & 0xfffffffffffffff8) + 8))))) {
LAB_006896b0:
      do {
        puVar4 = puVar3 + 1;
        *puVar3 = *unaff_x19;
        puVar3 = puVar4;
      } while (puVar4 != in_x14);
    }
    else {
      uVar5 = (uVar5 >> 3) + 1;
      uVar6 = uVar5 & 0x3ffffffffffffff8;
      uVar7 = *unaff_x19;
      uVar2 = uVar6;
      puVar3 = in_x9 + 4;
      do {
        puVar3[-3] = uVar7;
        puVar3[-4] = uVar7;
        puVar3[-1] = uVar7;
        puVar3[-2] = uVar7;
        puVar3[1] = uVar7;
        *puVar3 = uVar7;
        puVar3[3] = uVar7;
        puVar3[2] = uVar7;
        uVar2 = uVar2 - 8;
        puVar3 = puVar3 + 8;
      } while (uVar2 != 0);
      puVar3 = in_x9 + uVar6;
      if (uVar5 != uVar6) goto LAB_006896b0;
    }
    lVar1 = *(long *)(unaff_x20 + 0x28) + ((long)in_x14 - (long)in_x9 >> 3);
    *(long *)(unaff_x20 + 0x28) = lVar1;
    while( true ) {
      if (param_1 == in_x11) {
        return;
      }
      param_1 = param_1 + 1;
      in_x9 = (undefined8 *)*param_1;
      if (in_x9 == in_x12) {
        return;
      }
      in_x14 = in_x12;
      if (param_1 != in_x11) {
        in_x14 = (undefined8 *)(*param_1 + 0x1000);
      }
      if (in_x9 != in_x14) break;
      *(long *)(unaff_x20 + 0x28) = lVar1;
    }
    in_x10 = (long)in_x14 - (long)in_x9;
  } while( true );
}

