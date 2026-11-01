
void FUN_0005f374(long *param_1,byte *param_2,byte *param_3,byte *param_4,ulong param_5,
                 ulong param_6)

{
  byte bVar1;
  byte bVar2;
  long *plVar3;
  long *plVar4;
  byte *pbVar5;
  ulong uVar6;
  byte *pbVar7;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  long *in_x13;
  ulong in_x14;
  long *in_x15;
  long *plVar8;
  long *in_x16;
  ulong in_x17;
  long *unaff_x19;
  ulong unaff_x20;
  
  do {
    plVar8 = in_x15;
    if (*(char *)(in_x12 + param_6) == *(char *)(in_x12 + (ulong)*param_4)) {
      param_3 = param_3 + 1;
      param_4 = param_4 + 1;
      param_5 = param_5 - 1;
      plVar3 = in_x15;
      if (param_5 == 0) {
        plVar3 = (long *)*in_x15;
        plVar8 = (long *)0x0;
        in_x16 = in_x15;
        param_5 = in_x17;
        if (plVar3 != (long *)0x0) goto LAB_0005f338;
        goto LAB_0005f308;
      }
    }
    else {
LAB_0005f308:
      do {
        while( true ) {
          *param_1 = (long)plVar8;
          *in_x16 = **(long **)(*unaff_x19 + in_x14 * 8);
          **(undefined8 **)(*unaff_x19 + in_x14 * 8) = in_x13;
          while( true ) {
            while( true ) {
              in_x13 = (long *)*param_1;
              if (in_x13 == (long *)0x0) {
                return;
              }
              in_x14 = in_x13[1];
              if (in_x10 < 2) {
                in_x14 = in_x14 & in_x11;
              }
              else if (unaff_x20 <= in_x14) {
                uVar6 = 0;
                if (unaff_x20 != 0) {
                  uVar6 = in_x14 / unaff_x20;
                }
                in_x14 = in_x14 - uVar6 * unaff_x20;
              }
              if (in_x14 != in_x9) break;
              param_1 = in_x13;
            }
            if (*(long *)(*unaff_x19 + in_x14 * 8) != 0) break;
            *(long **)(*unaff_x19 + in_x14 * 8) = param_1;
            param_1 = in_x13;
            in_x9 = in_x14;
          }
          plVar3 = (long *)*in_x13;
          in_x16 = in_x13;
          if (plVar3 != (long *)0x0) break;
          plVar8 = plVar3;
        }
        bVar1 = *(byte *)((long)in_x13 + 0x27);
        param_5 = in_x13[3];
        if (-1 < (char)bVar1) {
          param_5 = (ulong)bVar1;
        }
        if (param_5 == 0) {
          uVar6 = plVar3[3];
          if (-1 < (char)*(byte *)((long)plVar3 + 0x27)) {
            uVar6 = (ulong)*(byte *)((long)plVar3 + 0x27);
          }
          while( true ) {
            plVar8 = plVar3;
            if (uVar6 != 0) break;
            plVar8 = (long *)*plVar3;
            in_x16 = plVar3;
            if (plVar8 == (long *)0x0) break;
            plVar3 = plVar8;
            uVar6 = plVar8[3];
            if (-1 < (char)*(byte *)((long)plVar8 + 0x27)) {
              uVar6 = (ulong)*(byte *)((long)plVar8 + 0x27);
            }
          }
          goto LAB_0005f308;
        }
        param_2 = (byte *)(in_x13 + 2);
        if (-1 < (char)bVar1) {
          while( true ) {
            plVar4 = plVar3;
            bVar2 = *(byte *)((long)plVar4 + 0x27);
            uVar6 = plVar4[3];
            if (-1 < (char)bVar2) {
              uVar6 = (ulong)bVar2;
            }
            plVar8 = plVar4;
            if (param_5 != uVar6) break;
            pbVar5 = (byte *)plVar4[2];
            if (-1 < (char)bVar2) {
              pbVar5 = (byte *)(plVar4 + 2);
            }
            uVar6 = (ulong)bVar1;
            pbVar7 = param_2;
            do {
              if (*(char *)(in_x12 + (ulong)*pbVar7) != *(char *)(in_x12 + (ulong)*pbVar5))
              goto LAB_0005f308;
              pbVar7 = pbVar7 + 1;
              pbVar5 = pbVar5 + 1;
              uVar6 = uVar6 - 1;
            } while (uVar6 != 0);
            plVar8 = (long *)0x0;
            plVar3 = (long *)*plVar4;
            in_x16 = plVar4;
            if ((long *)*plVar4 == (long *)0x0) break;
          }
          goto LAB_0005f308;
        }
LAB_0005f338:
        bVar1 = *(byte *)((long)plVar3 + 0x27);
        uVar6 = plVar3[3];
        if (-1 < (char)bVar1) {
          uVar6 = (ulong)bVar1;
        }
        plVar8 = plVar3;
      } while (param_5 != uVar6);
      param_3 = *(byte **)param_2;
      param_4 = (byte *)plVar3[2];
      if (-1 < (char)bVar1) {
        param_4 = (byte *)(plVar3 + 2);
      }
      in_x17 = param_5;
    }
    param_6 = (ulong)*param_3;
    in_x15 = plVar3;
  } while( true );
}

