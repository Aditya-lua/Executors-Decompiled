/* 7ff70c7a0440 FUN_7ff70c7a0440 */

void FUN_7ff70c7a0440(longlong param_1)

{
  char cVar1;
  undefined8 *puVar2;
  code *pcVar3;
  undefined8 ***pppuVar4;
  ulonglong uVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 ****ppppuVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  longlong lVar11;
  undefined8 ***apppuStack_70 [2];
  undefined8 uStack_60;
  ulonglong uStack_58;
  undefined8 ***pppuStack_50;
  undefined8 uStack_48;
  
  uStack_48 = 0xfffffffffffffffe;
  cVar1 = *(char *)(param_1 + 0x40);
  if (cVar1 == '\x03') {
    puVar6 = *(undefined8 **)(param_1 + 0x48);
    if (puVar6[3] != 0) {
      FUN_7ff70c8f9dd0();
      puVar6 = *(undefined8 **)(param_1 + 0x48);
    }
    uVar7 = FUN_7ff70c8fa930(*puVar6);
    *(undefined8 *)(*(longlong *)(param_1 + 0x48) + 0x18) = uVar7;
    if (*(char *)(param_1 + 0x40) != '\x03') {
      FUN_7ff70c7b0920();
LAB_7ff70c7a0775:
                    /* WARNING: Does not return */
      pcVar3 = (code *)invalidInstructionException();
      (*pcVar3)();
    }
    puVar6 = *(undefined8 **)(param_1 + 0x18);
    puVar2 = *(undefined8 **)(param_1 + 0x20);
    if (puVar6 != puVar2) {
      do {
        if (*(char *)(puVar6 + 0xe) == '\x01') {
          FUN_7ff70c8fca90(puVar6 + 0xf,apppuStack_70);
          FUN_7ff70c8fcaa0(puVar6 + 0xf,&pppuStack_50);
          if (apppuStack_70[0] != pppuStack_50) {
            do {
              pppuVar4 = apppuStack_70[0];
              uVar7 = FUN_7ff70c8faad0(*(undefined8 *)(*(longlong *)(param_1 + 0x48) + 0x18));
              if (puVar6[10] != 0) {
                puVar9 = puVar6 + 8;
                if (0xf < (ulonglong)puVar6[0xb]) {
                  puVar9 = (undefined8 *)puVar6[8];
                }
                FUN_7ff70c8fabd0(uVar7,puVar9);
              }
              ppppuVar8 = (undefined8 ****)pppuVar4;
              if ((undefined8 ***)0xf < pppuVar4[3]) {
                ppppuVar8 = (undefined8 ****)*pppuVar4;
              }
              FUN_7ff70c8fa660(uVar7,ppppuVar8);
              puVar9 = puVar6;
              if (0xf < (ulonglong)puVar6[3]) {
                puVar9 = (undefined8 *)*puVar6;
              }
              FUN_7ff70c8fac30(uVar7,puVar9);
              if ((undefined8 ***)pppuVar4[6] != (undefined8 ***)0x0) {
                if (pppuVar4[7] < (undefined8 ***)0x10) {
                  ppppuVar8 = (undefined8 ****)(pppuVar4 + 4);
                }
                else {
                  ppppuVar8 = (undefined8 ****)pppuVar4[4];
                }
                FUN_7ff70c8fac90(uVar7,ppppuVar8);
              }
              apppuStack_70[0] = apppuStack_70[0] + 8;
            } while (apppuStack_70[0] != pppuStack_50);
          }
        }
        else {
          uVar7 = FUN_7ff70c8faad0(*(undefined8 *)(*(longlong *)(param_1 + 0x48) + 0x18));
          if (puVar6[10] != 0) {
            if ((ulonglong)puVar6[0xb] < 0x10) {
              puVar9 = puVar6 + 8;
            }
            else {
              puVar9 = (undefined8 *)puVar6[8];
            }
            FUN_7ff70c8fabd0(uVar7,puVar9);
          }
          cVar1 = *(char *)((longlong)puVar6 + 0x71);
          puVar9 = puVar6;
          if (0xf < (ulonglong)puVar6[3]) {
            puVar9 = (undefined8 *)*puVar6;
          }
          FUN_7ff70c8fac30(uVar7,puVar9);
          if (cVar1 == '\x01') {
            FUN_7ff70c8fa550(uVar7,puVar6[0xc],puVar6[0xd]);
            if ((ulonglong)puVar6[7] < 0x10) {
              puVar9 = puVar6 + 4;
            }
            else {
              puVar9 = (undefined8 *)puVar6[4];
            }
            FUN_7ff70c8fac90(uVar7,puVar9);
          }
          else {
            if ((ulonglong)puVar6[7] < 0x10) {
              puVar9 = puVar6 + 4;
            }
            else {
              puVar9 = (undefined8 *)puVar6[4];
            }
            FUN_7ff70c8fa550(uVar7,puVar9,0xffffffffffffffff);
          }
        }
        puVar6 = puVar6 + 0x12;
      } while (puVar6 != puVar2);
    }
    uVar7 = **(undefined8 **)(param_1 + 0x48);
    lVar11 = (*(undefined8 **)(param_1 + 0x48))[3];
    uVar10 = 0x281d;
  }
  else {
    if (cVar1 != '\x02') {
      if (cVar1 != '\x01') {
        return;
      }
      FUN_7ff70c8f7390(param_1 + 0x18,apppuStack_70,*(undefined8 *)(param_1 + 0x48));
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x75a8,uStack_60);
      ppppuVar8 = apppuStack_70;
      if (0xf < uStack_58) {
        ppppuVar8 = (undefined8 ****)apppuStack_70[0];
      }
      FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x27b5,ppppuVar8);
      if (uStack_58 < 0x10) {
        return;
      }
      uVar5 = uStack_58 + 1;
      ppppuVar8 = (undefined8 ****)apppuStack_70[0];
      if (0xfff < uVar5) {
        ppppuVar8 = (undefined8 ****)apppuStack_70[0][-1];
        if (0x1f < (ulonglong)((longlong)apppuStack_70[0] + (-8 - (longlong)ppppuVar8)))
        goto LAB_7ff70c7a0775;
        uVar5 = uStack_58 + 0x28;
      }
      thunk_FUN_7ff70ca90250(ppppuVar8,uVar5);
      return;
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x75a8,*(undefined8 *)(param_1 + 0x30));
    if (*(ulonglong *)(param_1 + 0x38) < 0x10) {
      lVar11 = param_1 + 0x20;
    }
    else {
      lVar11 = *(longlong *)(param_1 + 0x20);
    }
    uVar7 = **(undefined8 **)(param_1 + 0x48);
    uVar10 = 0x27b5;
  }
  FUN_7ff70c8f5030(uVar7,uVar10,lVar11);
  return;
}


