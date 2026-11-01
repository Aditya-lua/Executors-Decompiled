
void FUN_00689f6c(undefined8 *param_1,long param_2)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  ulong uVar4;
  undefined8 *in_x9;
  ulong in_x10;
  ulong in_x11;
  long lVar5;
  undefined8 *in_x12;
  undefined8 *in_x13;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x25;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  do {
    uVar4 = in_x11;
    do {
      uVar7 = in_x13[-4];
      uVar9 = in_x13[-1];
      uVar8 = in_x13[-2];
      uVar11 = in_x13[1];
      uVar10 = *in_x13;
      uVar13 = in_x13[3];
      uVar12 = in_x13[2];
      in_x12[-3] = in_x13[-3];
      in_x12[-4] = uVar7;
      in_x12[-1] = uVar9;
      in_x12[-2] = uVar8;
      in_x12[1] = uVar11;
      *in_x12 = uVar10;
      in_x12[3] = uVar13;
      in_x12[2] = uVar12;
      uVar4 = uVar4 - 8;
      in_x12 = in_x12 + 8;
      in_x13 = in_x13 + 8;
    } while (uVar4 != 0);
    if (in_x10 == in_x11) goto LAB_00689fa0;
    do {
      while( true ) {
        do {
          puVar6 = in_x9 + 1;
          *in_x9 = *unaff_x20;
          in_x9 = puVar6;
          unaff_x20 = unaff_x20 + 1;
        } while (puVar6 != unaff_x24);
LAB_00689fa0:
        do {
          *unaff_x19 = param_2;
          unaff_x19[1] = (long)param_1;
          unaff_x19[2] = (long)unaff_x24;
          unaff_x19[3] = param_2 + unaff_x22;
          if (unaff_x21 != (undefined8 *)0x0) {
            __ZdlPv(unaff_x21);
            unaff_x24 = (undefined8 *)unaff_x19[2];
          }
          while( true ) {
            do {
              *unaff_x24 = unaff_x23;
              unaff_x24 = (undefined8 *)(unaff_x19[2] + 8);
              unaff_x19[2] = (long)unaff_x24;
              unaff_x25 = unaff_x25 + -1;
              if (unaff_x25 == 0) {
                return;
              }
              puVar6 = (undefined8 *)unaff_x19[1];
              unaff_x20 = puVar6 + 1;
              unaff_x23 = *puVar6;
              unaff_x19[1] = (long)unaff_x20;
            } while (unaff_x24 != (undefined8 *)unaff_x19[3]);
            unaff_x21 = (undefined8 *)*unaff_x19;
            if (unaff_x20 < unaff_x21 || (long)unaff_x20 - (long)unaff_x21 == 0) break;
            lVar3 = (long)unaff_x20 - (long)unaff_x21 >> 3;
            lVar5 = lVar3 + 2;
            if (-2 < lVar3) {
              lVar5 = lVar3 + 1;
            }
            lVar3 = (long)unaff_x24 - (long)unaff_x20;
            if (lVar3 != 0) {
              _memmove(unaff_x20 + -(lVar5 >> 1),unaff_x20,lVar3);
              unaff_x24 = (undefined8 *)unaff_x19[1];
            }
            puVar6 = unaff_x24 + -(lVar5 >> 1);
            unaff_x24 = (undefined8 *)((long)(unaff_x20 + -(lVar5 >> 1)) + lVar3);
            unaff_x19[1] = (long)puVar6;
            unaff_x19[2] = (long)unaff_x24;
          }
          uVar4 = (long)unaff_x24 - (long)unaff_x21 >> 2;
          if ((long)unaff_x24 - (long)unaff_x21 == 0) {
            uVar4 = 1;
          }
          if (uVar4 >> 0x3d != 0) {
            func_0x00017514();
            func_0x00017514();
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x68a048);
            (*pcVar2)();
          }
          unaff_x22 = uVar4 << 3;
          param_2 = __Znwm(unaff_x22);
          param_1 = (undefined8 *)(param_2 + (uVar4 >> 2) * 8);
          uVar1 = (long)unaff_x24 - (long)unaff_x20;
          unaff_x24 = param_1;
        } while (uVar1 == 0);
        unaff_x24 = (undefined8 *)((long)param_1 + (uVar1 & 0xfffffffffffffff8));
        if (0x37 < uVar1 - 8) break;
        in_x9 = param_1;
      }
      lVar5 = (uVar4 >> 2) * 8;
      in_x9 = param_1;
    } while ((ulong)((lVar5 + param_2) - (long)unaff_x20) < 0x40);
    in_x10 = (uVar1 - 8 >> 3) + 1;
    in_x11 = in_x10 & 0x3ffffffffffffff8;
    in_x9 = param_1 + in_x11;
    unaff_x20 = unaff_x20 + in_x11;
    in_x12 = (undefined8 *)(param_2 + lVar5 + 0x20);
    in_x13 = puVar6 + 5;
  } while( true );
}

