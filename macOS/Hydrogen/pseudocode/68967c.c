
void FUN_0068967c(ulong *param_1)

{
  long lVar1;
  undefined8 *in_x9;
  ulong in_x10;
  undefined8 *puVar2;
  undefined8 *puVar3;
  ulong *in_x11;
  undefined8 *in_x12;
  undefined8 *in_x13;
  undefined8 *in_x14;
  ulong uVar4;
  ulong uVar5;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uVar6;
  
  do {
    uVar5 = in_x10 + 1 & 0x3ffffffffffffff8;
    uVar6 = *unaff_x19;
    uVar4 = uVar5;
    puVar2 = in_x9 + 4;
    do {
      puVar2[-3] = uVar6;
      puVar2[-4] = uVar6;
      puVar2[-1] = uVar6;
      puVar2[-2] = uVar6;
      puVar2[1] = uVar6;
      *puVar2 = uVar6;
      puVar2[3] = uVar6;
      puVar2[2] = uVar6;
      uVar4 = uVar4 - 8;
      puVar2 = puVar2 + 8;
    } while (uVar4 != 0);
    puVar2 = in_x9 + uVar5;
    if (in_x10 + 1 == uVar5) goto LAB_006896c0;
    do {
      do {
        puVar3 = puVar2 + 1;
        *puVar2 = *unaff_x19;
        puVar2 = puVar3;
      } while (puVar3 != in_x14);
LAB_006896c0:
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
      uVar4 = (long)in_x14 + (-8 - (long)in_x9);
      puVar2 = in_x9;
    } while ((uVar4 < 0x68) ||
            ((in_x9 < in_x13 &&
             (unaff_x19 < (undefined8 *)((long)in_x9 + (uVar4 & 0xfffffffffffffff8) + 8)))));
    in_x10 = uVar4 >> 3;
  } while( true );
}

