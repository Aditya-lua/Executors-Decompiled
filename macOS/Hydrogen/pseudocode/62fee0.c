
void FUN_0062fee0(void)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  int iVar5;
  long *plVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *puVar9;
  long lVar10;
  undefined8 *puVar11;
  long unaff_x22;
  long unaff_x23;
  undefined8 *puVar12;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  long in_stack_00000078;
  
  do {
    if (unaff_x19 < 2) {
      do {
        (**(code **)(*unaff_x20 + 0x48))();
        (**(code **)(*unaff_x20 + 0x38))();
        lVar2 = (**(code **)(*unaff_x20 + 0x20))();
        func_0x00677180(unaff_x22,lVar2 + 8);
        func_0x00677180(unaff_x23,lVar2 + 0x28);
        *(undefined1 *)(unaff_x28 + 0x48) = *(undefined1 *)(lVar2 + 0x48);
        lVar2 = unaff_x28;
        do {
          unaff_x28 = lVar2 + 0x50;
          unaff_x25 = unaff_x25 + 1;
          if (unaff_x25 == in_stack_00000028) {
            if (in_stack_00000070 <= in_stack_00000068) {
              in_stack_00000068 = in_stack_00000070;
            }
            if (in_stack_00000078 != 0) {
              if (in_stack_00000068 != 0) {
                do {
                  *(undefined8 *)(in_stack_00000078 + -8 + in_stack_00000068 * 8) = 0;
                  in_stack_00000068 = in_stack_00000068 - 1;
                } while (in_stack_00000068 != 0);
              }
              func_0x00611644();
            }
            if (in_stack_00000050 <= in_stack_00000048) {
              in_stack_00000048 = in_stack_00000050;
            }
            if (in_stack_00000058 != 0) {
              if (in_stack_00000048 != 0) {
                do {
                  *(undefined8 *)(in_stack_00000058 + -8 + in_stack_00000048 * 8) = 0;
                  in_stack_00000048 = in_stack_00000048 - 1;
                } while (in_stack_00000048 != 0);
              }
              func_0x00611644();
            }
            if (*(long *)(unaff_x29 + -0x88) != 0) {
              func_0x0064b344(unaff_x29 + -0x88);
              __ZdlPv(*(undefined8 *)(unaff_x29 + -0x88));
            }
            puVar9 = *(undefined8 **)(unaff_x29 + -0x70);
            if (puVar9 != (undefined8 *)0x0) {
              puVar4 = puVar9;
              if (*(undefined8 **)(unaff_x29 + -0x68) != puVar9) {
                puVar4 = *(undefined8 **)(unaff_x29 + -0x68);
                do {
                  puVar11 = puVar4 + -3;
                  puVar12 = (undefined8 *)*puVar11;
                  if (puVar12 != (undefined8 *)0x0) {
                    puVar8 = (undefined8 *)puVar4[-2];
                    puVar3 = puVar12;
                    if (puVar8 != puVar12) {
                      do {
                        puVar8 = puVar8 + -10;
                        (**(code **)*puVar8)(puVar8);
                      } while (puVar8 != puVar12);
                      puVar3 = (undefined8 *)*puVar11;
                    }
                    puVar4[-2] = puVar12;
                    __ZdlPv(puVar3);
                  }
                  puVar4 = puVar11;
                } while (puVar11 != puVar9);
                puVar4 = *(undefined8 **)(unaff_x29 + -0x70);
              }
              *(undefined8 **)(unaff_x29 + -0x68) = puVar9;
              __ZdlPv(puVar4);
            }
            return;
          }
          plVar6 = (long *)(*(long *)(unaff_x29 + -0x70) + unaff_x25 * unaff_x26);
          lVar1 = *plVar6;
          lVar10 = in_stack_00000030 + (plVar6[1] - lVar1 >> 4) * -0x3333333333333333;
          unaff_x22 = lVar2 + 0x58;
          func_0x00677180(unaff_x22,lVar1 + lVar10 * unaff_x27 + 8);
          unaff_x23 = lVar2 + 0x78;
          func_0x00677180(unaff_x23,lVar1 + lVar10 * unaff_x27 + 0x28);
          *(undefined1 *)(lVar2 + 0x98) = *(undefined1 *)(lVar1 + lVar10 * unaff_x27 + 0x48);
          plVar6 = (long *)(*(long *)(unaff_x29 + -0x70) + unaff_x25 * unaff_x26);
          uVar7 = (plVar6[1] - *plVar6 >> 4) * -0x3333333333333333;
          lVar2 = unaff_x28;
        } while (uVar7 < 2);
        iVar5 = (int)uVar7;
      } while (iVar5 < 3);
      unaff_x19 = (ulong)(iVar5 - 2) + 1;
    }
    (**(code **)(*unaff_x20 + 0x48))();
    (**(code **)(*unaff_x20 + 0x48))();
    unaff_x19 = unaff_x19 + -1;
  } while( true );
}

