
void FUN_006b8324(long param_1)

{
  ulong uVar1;
  uint *puVar2;
  uint *puVar3;
  undefined8 in_x10;
  ulong uVar4;
  ulong in_x11;
  undefined8 uVar5;
  uint *in_x12;
  uint *puVar6;
  ulong uVar7;
  ulong in_x14;
  uint *unaff_x19;
  uint *unaff_x20;
  
  do {
    do {
      puVar3 = in_x12 + in_x14 * 2 + 2;
      uVar1 = in_x14 << 1 | 1;
      uVar4 = in_x14 * 2 + 2;
      uVar7 = uVar1;
      if ((long)uVar4 < param_1) {
        uVar7 = uVar4;
        puVar2 = in_x12 + in_x14 * 2 + 4;
        if (in_x12[in_x14 * 2 + 4] <= *puVar3) {
          uVar7 = uVar1;
          puVar2 = puVar3;
        }
        puVar3 = puVar2;
      }
      *(undefined8 *)in_x12 = *(undefined8 *)puVar3;
      in_x12 = puVar3;
      in_x14 = uVar7;
    } while ((long)uVar7 <= (long)in_x11);
    unaff_x19 = unaff_x19 + -2;
    if (puVar3 == unaff_x19) {
      *(undefined8 *)puVar3 = in_x10;
    }
    else {
      *(undefined8 *)puVar3 = *(undefined8 *)unaff_x19;
      *(undefined8 *)unaff_x19 = in_x10;
      uVar4 = (long)puVar3 + (8 - (long)unaff_x20);
      if (8 < (long)uVar4) {
        uVar4 = (uVar4 >> 3) - 2 >> 1;
        if (unaff_x20[uVar4 * 2] < *puVar3) {
          uVar5 = *(undefined8 *)puVar3;
          puVar2 = unaff_x20 + uVar4 * 2;
          do {
            puVar6 = puVar2;
            *(undefined8 *)puVar3 = *(undefined8 *)puVar6;
            if (uVar4 == 0) break;
            uVar4 = uVar4 - 1 >> 1;
            puVar3 = puVar6;
            puVar2 = unaff_x20 + uVar4 * 2;
          } while (unaff_x20[uVar4 * 2] < (uint)uVar5);
          *(undefined8 *)puVar6 = uVar5;
        }
      }
    }
    if (param_1 < 3) {
      return;
    }
    in_x14 = 0;
    in_x10 = *(undefined8 *)unaff_x20;
    in_x11 = param_1 - 3U >> 1;
    param_1 = param_1 + -1;
    in_x12 = unaff_x20;
  } while( true );
}

