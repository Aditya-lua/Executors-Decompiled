
/* WARNING: Type propagation algorithm not settling */

undefined * FUN_0017bc30(undefined8 *param_1,long param_2,undefined *param_3)

{
  code *pcVar1;
  uint uVar2;
  ulong uVar3;
  undefined *puVar4;
  long *plVar5;
  undefined *extraout_x8;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  undefined *puVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined *puStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  
  if (param_3 != (undefined *)0x0) {
    puVar4 = (undefined *)0x0;
    lVar8 = (long)param_3 << 4;
    plVar9 = (long *)(param_2 + 8);
    do {
      if (*plVar9 != 0) goto LAB_0017bc80;
      puVar4 = puVar4 + 1;
      lVar8 = lVar8 + -0x10;
      plVar9 = plVar9 + 2;
    } while (lVar8 != 0);
    puVar4 = (undefined *)(((ulong)(param_3 + -1) & 0xfffffffffffffff) + 1);
LAB_0017bc80:
    uVar6 = (long)param_3 - (long)puVar4;
    if (param_3 < puVar4) {
LAB_0017bdd4:
      uVar3 = func_0x007a28a4(puVar4,param_3,&UNK_009bebc8);
LAB_0017bdec:
      param_3 = &UNK_009bebc8;
      func_0x007a28a4(uVar3,uVar6);
LAB_0017bdfc:
      puStack_80 = &UNK_009bec08;
      uStack_78 = 1;
      uStack_68 = 0;
      uStack_60 = 0;
      uStack_70 = 8;
      auVar13 = func_0x007a2420(&puStack_80,&UNK_009bec18);
      lVar8 = auVar13._8_8_;
      if (param_3 != (undefined *)0x0) {
        do {
          auVar14 = func_0x00437984(auVar13._0_8_,lVar8,param_3);
          puVar4 = auVar14._8_8_;
          if ((auVar14._0_8_ & 1) == 0) {
            if (puVar4 == (undefined *)0x0) {
              return &UNK_009beb98;
            }
            puVar10 = param_3 + -(long)puVar4;
            if (param_3 < puVar4) {
              func_0x007a28a4(puVar4,param_3,&UNK_009bebb0);
                    /* WARNING: Does not return */
              pcVar1 = (code *)SoftwareBreakpoint(1,0x17bf64);
              (*pcVar1)();
            }
            lVar8 = lVar8 + (long)puVar4;
          }
          else {
            uVar6 = (ulong)puVar4 & 3;
            puVar10 = param_3;
            if (uVar6 < 2) {
              if (uVar6 == 0) {
                if (puVar4[0x10] != '#') {
                  return puVar4;
                }
              }
              else {
                if (puVar4[0xf] != '#') {
                  return puVar4;
                }
                uVar12 = *(undefined8 *)(puVar4 + -1);
                puVar11 = *(undefined8 **)(puVar4 + 7);
                if ((code *)*puVar11 != (code *)0x0) {
                  (*(code *)*puVar11)(uVar12);
                }
                if (puVar11[1] != 0) {
                  func_0x00187bd4(uVar12,puVar11[1],puVar11[2]);
                }
                func_0x00187bd4(puVar4 + -1,0x18,8);
              }
            }
            else if (uVar6 == 2) {
              if ((ulong)puVar4 >> 0x20 != 4) {
                return puVar4;
              }
            }
            else if ((ulong)puVar4 >> 0x20 != 0x23) {
              return puVar4;
            }
          }
          param_3 = puVar10;
        } while (puVar10 != (undefined *)0x0);
      }
      return (undefined *)0x0;
    }
    if (uVar6 != 0) {
      plVar9 = (long *)(param_2 + (long)puVar4 * 0x10);
      pcVar1 = (code *)*param_1;
      uVar12 = param_1[1];
      do {
        lVar8 = uVar6 << 4;
        do {
          plVar5 = plVar9 + -2;
          lVar7 = lVar8;
          do {
            if (lVar7 == 0) {
              param_3 = (undefined *)0x0;
              puStack_80 = (undefined *)0x0;
              uVar2 = (*pcVar1)(uVar12,1,0,&puStack_80);
              goto joined_r0x0017bccc;
            }
            param_3 = (undefined *)plVar5[3];
            plVar5 = plVar5 + 2;
            lVar7 = lVar7 + -0x10;
          } while (param_3 == (undefined *)0x0);
          puStack_80 = (undefined *)0x0;
          uVar2 = (*pcVar1)(uVar12,*plVar5,param_3,&puStack_80);
joined_r0x0017bccc:
        } while (uVar2 == 4);
        if (uVar2 != 0) {
          return (undefined *)((ulong)uVar2 << 0x20 | 2);
        }
        if (puStack_80 == (undefined *)0x0) {
          return &UNK_009beb98;
        }
        uVar3 = 0;
        puVar4 = puStack_80;
        plVar5 = plVar9 + 1;
        do {
          puVar10 = puVar4 + -*plVar5;
          if (puVar4 < (undefined *)*plVar5) goto LAB_0017bd4c;
          uVar3 = uVar3 + 1;
          lVar8 = lVar8 + -0x10;
          puVar4 = puVar10;
          plVar5 = plVar5 + 2;
        } while (lVar8 != 0);
        uVar3 = (uVar6 - 1 & 0xfffffffffffffff) + 1;
LAB_0017bd4c:
        if (uVar6 < uVar3) goto LAB_0017bdec;
        if (uVar6 - uVar3 == 0) {
          if (puVar4 == (undefined *)0x0) {
            return (undefined *)0x0;
          }
          puStack_80 = &UNK_009bebe0;
          uStack_78 = 1;
          uStack_68 = 0;
          uStack_60 = 0;
          uStack_70 = 8;
          func_0x007a2420(&puStack_80,&UNK_009bebf0);
          puVar4 = extraout_x8;
          goto LAB_0017bdd4;
        }
        plVar9 = plVar9 + uVar3 * 2;
        if ((undefined *)plVar9[1] < puVar4) goto LAB_0017bdfc;
        *plVar9 = (long)(puVar4 + *plVar9);
        plVar9[1] = plVar9[1] - (long)puVar4;
        uVar6 = uVar6 - uVar3;
      } while( true );
    }
  }
  return (undefined *)0x0;
}

