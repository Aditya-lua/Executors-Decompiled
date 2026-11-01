
void FUN_000516ac(undefined8 param_1,undefined8 param_2,long *param_3)

{
  bool bVar1;
  undefined8 uVar2;
  long *plVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  long lVar6;
  long *plVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long *plVar10;
  long *plVar11;
  long *plVar12;
  long *plVar13;
  undefined1 auVar14 [16];
  undefined1 uStack0000000000000010;
  undefined8 in_stack_00000018;
  
  func_0x00051a2c(&uStack0000000000000010);
  uVar2 = __Unwind_Resume();
  func_0x00051a2c(&uStack0000000000000010,in_stack_00000018);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00051a2c(&uStack0000000000000010,in_stack_00000018);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00051a2c(&uStack0000000000000010,in_stack_00000018);
  auVar14 = __Unwind_Resume(uVar2);
  plVar7 = auVar14._8_8_;
  plVar3 = auVar14._0_8_;
  if (plVar3[2] != 0) {
    puVar4 = (undefined8 *)*plVar3;
    plVar13 = plVar3 + 1;
    *plVar3 = (long)plVar13;
    *(undefined8 *)(*plVar13 + 0x10) = 0;
    plVar3[2] = 0;
    *plVar13 = 0;
    puVar8 = (undefined8 *)puVar4[1];
    if (puVar8 != (undefined8 *)0x0) {
      puVar4 = puVar8;
    }
    if (puVar4 == (undefined8 *)0x0) {
      puVar8 = (undefined8 *)0x0;
    }
    else {
      puVar8 = (undefined8 *)puVar4[2];
      if (puVar8 != (undefined8 *)0x0) {
        puVar5 = (undefined8 *)*puVar8;
        if (puVar5 == puVar4) {
          *puVar8 = 0;
          while (puVar5 = (undefined8 *)puVar8[1], (undefined8 *)puVar8[1] != (undefined8 *)0x0) {
            do {
              puVar8 = puVar5;
              puVar5 = (undefined8 *)*puVar8;
            } while ((undefined8 *)*puVar8 != (undefined8 *)0x0);
          }
        }
        else {
          puVar8[1] = 0;
          while (puVar5 != (undefined8 *)0x0) {
            do {
              puVar8 = puVar5;
              puVar5 = (undefined8 *)*puVar8;
            } while ((undefined8 *)*puVar8 != (undefined8 *)0x0);
            puVar5 = (undefined8 *)puVar8[1];
          }
        }
      }
      if (plVar7 != param_3) {
        puVar5 = puVar4;
        do {
          puVar4 = puVar8;
          uVar9 = plVar7[4];
          puVar5[4] = uVar9;
          plVar10 = (long *)*plVar13;
          plVar12 = plVar13;
          while (plVar10 != (long *)0x0) {
            while (plVar11 = plVar10, (ulong)plVar11[4] <= uVar9) {
              plVar10 = (long *)plVar11[1];
              if ((long *)plVar11[1] == (long *)0x0) {
                plVar12 = plVar11 + 1;
                *puVar5 = 0;
                puVar5[1] = 0;
                puVar5[2] = plVar11;
                *plVar12 = (long)puVar5;
                lVar6 = *(long *)*plVar3;
                goto joined_r0x000518ac;
              }
            }
            plVar12 = plVar11;
            plVar10 = (long *)*plVar11;
          }
          *puVar5 = 0;
          puVar5[1] = 0;
          puVar5[2] = plVar12;
          *plVar12 = (long)puVar5;
          lVar6 = *(long *)*plVar3;
joined_r0x000518ac:
          if (lVar6 != 0) {
            *plVar3 = lVar6;
            puVar5 = (undefined8 *)*plVar12;
          }
          func_0x0003767c(plVar3[1],puVar5);
          plVar3[2] = plVar3[2] + 1;
          if (puVar4 == (undefined8 *)0x0) {
            puVar8 = (undefined8 *)0x0;
          }
          else {
            puVar8 = (undefined8 *)puVar4[2];
            if (puVar8 != (undefined8 *)0x0) {
              puVar5 = (undefined8 *)*puVar8;
              if (puVar5 == puVar4) {
                *puVar8 = 0;
                while (puVar5 = (undefined8 *)puVar8[1],
                      (undefined8 *)puVar8[1] != (undefined8 *)0x0) {
                  do {
                    puVar8 = puVar5;
                    puVar5 = (undefined8 *)*puVar8;
                  } while ((undefined8 *)*puVar8 != (undefined8 *)0x0);
                }
              }
              else {
                puVar8[1] = 0;
                while (puVar5 != (undefined8 *)0x0) {
                  do {
                    puVar8 = puVar5;
                    puVar5 = (undefined8 *)*puVar8;
                  } while ((undefined8 *)*puVar8 != (undefined8 *)0x0);
                  puVar5 = (undefined8 *)puVar8[1];
                }
              }
            }
          }
          plVar12 = (long *)plVar7[1];
          plVar10 = plVar7;
          if ((long *)plVar7[1] == (long *)0x0) {
            do {
              plVar7 = (long *)plVar10[2];
              bVar1 = (long *)*plVar7 != plVar10;
              plVar10 = plVar7;
            } while (bVar1);
          }
          else {
            do {
              plVar7 = plVar12;
              plVar12 = (long *)*plVar7;
            } while ((long *)*plVar7 != (long *)0x0);
          }
          if (puVar4 == (undefined8 *)0x0) break;
          puVar5 = puVar4;
        } while (plVar7 != param_3);
      }
      func_0x00051a2c(plVar3,puVar4);
      if (puVar8 == (undefined8 *)0x0) goto LAB_0005190c;
      puVar4 = (undefined8 *)puVar8[2];
      while (puVar5 = puVar4, puVar5 != (undefined8 *)0x0) {
        puVar8 = puVar5;
        puVar4 = (undefined8 *)puVar5[2];
      }
    }
    func_0x00051a2c(plVar3,puVar8);
  }
LAB_0005190c:
  if (plVar7 != param_3) {
    do {
      puVar4 = (undefined8 *)__Znwm(0x28);
      uVar9 = plVar7[4];
      puVar4[4] = uVar9;
      plVar12 = (long *)plVar3[1];
      plVar13 = plVar3 + 1;
      while (plVar12 != (long *)0x0) {
        while (plVar10 = plVar12, (ulong)plVar10[4] <= uVar9) {
          plVar12 = (long *)plVar10[1];
          if ((long *)plVar10[1] == (long *)0x0) {
            plVar13 = plVar10 + 1;
            *puVar4 = 0;
            puVar4[1] = 0;
            puVar4[2] = plVar10;
            *plVar13 = (long)puVar4;
            lVar6 = *(long *)*plVar3;
            goto joined_r0x000519f0;
          }
        }
        plVar13 = plVar10;
        plVar12 = (long *)*plVar10;
      }
      *puVar4 = 0;
      puVar4[1] = 0;
      puVar4[2] = plVar13;
      *plVar13 = (long)puVar4;
      lVar6 = *(long *)*plVar3;
joined_r0x000519f0:
      if (lVar6 != 0) {
        *plVar3 = lVar6;
        puVar4 = (undefined8 *)*plVar13;
      }
      func_0x0003767c(plVar3[1],puVar4);
      plVar3[2] = plVar3[2] + 1;
      plVar13 = (long *)plVar7[1];
      plVar12 = plVar7;
      if ((long *)plVar7[1] == (long *)0x0) {
        do {
          plVar7 = (long *)plVar12[2];
          bVar1 = (long *)*plVar7 != plVar12;
          plVar12 = plVar7;
        } while (bVar1);
      }
      else {
        do {
          plVar7 = plVar13;
          plVar13 = (long *)*plVar7;
        } while ((long *)*plVar7 != (long *)0x0);
      }
    } while (plVar7 != param_3);
  }
  return;
}

