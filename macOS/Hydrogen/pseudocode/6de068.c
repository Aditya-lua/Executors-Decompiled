
/* WARNING: Removing unreachable block (ram,0x006de090) */

undefined8 FUN_006de068(long param_1)

{
  long lVar1;
  int *piVar2;
  undefined1 in_ZR;
  ulong in_x9;
  long *in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong uVar3;
  long in_x13;
  ulong uVar4;
  ulong in_x14;
  ulong in_x15;
  ulong uVar5;
  ulong in_x16;
  ulong uVar6;
  long unaff_x19;
  
  do {
    if ((bool)in_ZR) {
      lVar1 = in_x13 + in_x15 * 0x10;
      piVar2 = (int *)0x0;
      if (lVar1 != 0) {
        piVar2 = (int *)(lVar1 + 8);
      }
      uVar3 = *(ulong *)(unaff_x19 + 0x40);
joined_r0x006de09c:
      if (uVar3 != in_x9) {
        uVar4 = 0;
        uVar5 = uVar3 >> 4 ^ uVar3 >> 9;
        do {
          uVar5 = uVar5 & in_x10[1] - 1U;
          uVar6 = *(ulong *)(*in_x10 + uVar5 * 0x10);
          if (uVar6 == uVar3) {
            if (param_1 == 0) {
              return 0;
            }
            if (piVar2 == (int *)0x0) {
              return 0;
            }
            if (*piVar2 == *(int *)(*in_x10 + uVar5 * 0x10 + 8)) {
              func_0x006de830();
              return 0;
            }
            return 0;
          }
          uVar4 = uVar4 + 1;
          uVar5 = uVar4 + uVar5;
        } while (uVar6 != in_x9 && uVar4 <= in_x10[1] - 1U);
      }
      return 0;
    }
    if (in_x16 == in_x9) {
LAB_006de084:
      piVar2 = (int *)0x0;
      uVar3 = *(ulong *)(unaff_x19 + 0x40);
      goto joined_r0x006de09c;
    }
    in_x12 = in_x12 + 1;
    if (in_x14 < in_x12) goto LAB_006de084;
    in_x15 = in_x12 + in_x15 & in_x14;
    in_x16 = *(ulong *)(in_x13 + in_x15 * 0x10);
    in_ZR = in_x16 == in_x11;
  } while( true );
}

