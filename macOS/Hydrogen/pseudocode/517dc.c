
void FUN_000517dc(long param_1,undefined8 *param_2)

{
  long *plVar1;
  bool bVar2;
  undefined8 *puVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  long *plVar8;
  long *plVar9;
  long *unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x22;
  undefined8 *puVar10;
  undefined8 *unaff_x24;
  long *unaff_x25;
  
  do {
    func_0x0003767c(param_1,param_2);
    unaff_x20[2] = unaff_x20[2] + 1;
    if (unaff_x22 == (undefined8 *)0x0) {
      puVar10 = (undefined8 *)0x0;
    }
    else {
      puVar10 = (undefined8 *)unaff_x22[2];
      if (puVar10 != (undefined8 *)0x0) {
        puVar3 = (undefined8 *)*puVar10;
        if (puVar3 == unaff_x22) {
          *puVar10 = 0;
          while (puVar3 = (undefined8 *)puVar10[1], (undefined8 *)puVar10[1] != (undefined8 *)0x0) {
            do {
              puVar10 = puVar3;
              puVar3 = (undefined8 *)*puVar10;
            } while ((undefined8 *)*puVar10 != (undefined8 *)0x0);
          }
        }
        else {
          puVar10[1] = 0;
          while (puVar3 != (undefined8 *)0x0) {
            do {
              puVar10 = puVar3;
              puVar3 = (undefined8 *)*puVar10;
            } while ((undefined8 *)*puVar10 != (undefined8 *)0x0);
            puVar3 = (undefined8 *)puVar10[1];
          }
        }
      }
    }
    plVar1 = (long *)unaff_x25[1];
    plVar8 = unaff_x25;
    if ((long *)unaff_x25[1] == (long *)0x0) {
      do {
        unaff_x25 = (long *)plVar8[2];
        bVar2 = (long *)*unaff_x25 != plVar8;
        plVar8 = unaff_x25;
      } while (bVar2);
    }
    else {
      do {
        unaff_x25 = plVar1;
        plVar1 = (long *)*unaff_x25;
      } while ((long *)*unaff_x25 != (long *)0x0);
    }
    if ((unaff_x22 == (undefined8 *)0x0) || (unaff_x25 == unaff_x19)) {
      func_0x00051a2c();
      if (puVar10 != (undefined8 *)0x0) {
        for (lVar4 = puVar10[2]; lVar4 != 0; lVar4 = *(long *)(lVar4 + 0x10)) {
        }
        func_0x00051a2c();
      }
      if (unaff_x25 != unaff_x19) {
        do {
          puVar10 = (undefined8 *)__Znwm(0x28);
          uVar5 = unaff_x25[4];
          puVar10[4] = uVar5;
          plVar8 = (long *)unaff_x20[1];
          plVar1 = unaff_x20 + 1;
          while (plVar8 != (long *)0x0) {
            while (plVar9 = plVar8, (ulong)plVar9[4] <= uVar5) {
              plVar8 = (long *)plVar9[1];
              if ((long *)plVar9[1] == (long *)0x0) {
                plVar1 = plVar9 + 1;
                *puVar10 = 0;
                puVar10[1] = 0;
                puVar10[2] = plVar9;
                *plVar1 = (long)puVar10;
                lVar4 = *(long *)*unaff_x20;
                goto joined_r0x000519f0;
              }
            }
            plVar1 = plVar9;
            plVar8 = (long *)*plVar9;
          }
          *puVar10 = 0;
          puVar10[1] = 0;
          puVar10[2] = plVar1;
          *plVar1 = (long)puVar10;
          lVar4 = *(long *)*unaff_x20;
joined_r0x000519f0:
          if (lVar4 != 0) {
            *unaff_x20 = lVar4;
            puVar10 = (undefined8 *)*plVar1;
          }
          func_0x0003767c(unaff_x20[1],puVar10);
          unaff_x20[2] = unaff_x20[2] + 1;
          plVar1 = (long *)unaff_x25[1];
          plVar8 = unaff_x25;
          if ((long *)unaff_x25[1] == (long *)0x0) {
            do {
              unaff_x25 = (long *)plVar8[2];
              bVar2 = (long *)*unaff_x25 != plVar8;
              plVar8 = unaff_x25;
            } while (bVar2);
          }
          else {
            do {
              unaff_x25 = plVar1;
              plVar1 = (long *)*unaff_x25;
            } while ((long *)*unaff_x25 != (long *)0x0);
          }
        } while (unaff_x25 != unaff_x19);
      }
      return;
    }
    uVar5 = unaff_x25[4];
    unaff_x22[4] = uVar5;
    puVar6 = (undefined8 *)*unaff_x24;
    puVar3 = unaff_x24;
    while (puVar6 != (undefined8 *)0x0) {
      while (puVar7 = puVar6, (ulong)puVar7[4] <= uVar5) {
        puVar6 = (undefined8 *)puVar7[1];
        if ((undefined8 *)puVar7[1] == (undefined8 *)0x0) {
          puVar3 = puVar7 + 1;
          *unaff_x22 = 0;
          unaff_x22[1] = 0;
          unaff_x22[2] = puVar7;
          *puVar3 = unaff_x22;
          lVar4 = *(long *)*unaff_x20;
          goto joined_r0x000518ac;
        }
      }
      puVar3 = puVar7;
      puVar6 = (undefined8 *)*puVar7;
    }
    *unaff_x22 = 0;
    unaff_x22[1] = 0;
    unaff_x22[2] = puVar3;
    *puVar3 = unaff_x22;
    lVar4 = *(long *)*unaff_x20;
joined_r0x000518ac:
    if (lVar4 != 0) {
      *unaff_x20 = lVar4;
      unaff_x22 = (undefined8 *)*puVar3;
    }
    param_1 = unaff_x20[1];
    param_2 = unaff_x22;
    unaff_x22 = puVar10;
  } while( true );
}

