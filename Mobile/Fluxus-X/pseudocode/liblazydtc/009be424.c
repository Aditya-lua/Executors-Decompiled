/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be424
 */

void FUN_009be424(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  int iVar3;
  undefined8 *puVar4;
  long *plVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  
  puVar4 = *(undefined8 **)(param_2 + 0x328);
  if ((puVar4 != (undefined8 *)0x0) &&
     (puVar6 = *(undefined8 **)(param_2 + 800), puVar6 != (undefined8 *)0x0)) {
    puVar1 = (undefined8 *)(param_1 + 0x48);
    puVar2 = (undefined8 *)(param_1 + 0x40);
    if (puVar4 == puVar1) {
      if (puVar6 == puVar2) {
        *puVar2 = 0;
        *(undefined8 *)(param_1 + 0x48) = 0;
      }
      else {
        *puVar1 = puVar6;
        puVar6[0x65] = puVar1;
      }
    }
    else if (puVar6 == puVar2) {
      *puVar2 = puVar4;
      puVar4[100] = puVar2;
    }
    else {
      puVar4[100] = puVar6;
      *(undefined8 **)(*(long *)(param_2 + 800) + 0x328) = puVar4;
    }
    *(undefined8 *)(param_2 + 0x390) = 0;
    *(long *)(param_2 + 800) = 0;
    *(undefined8 *)(param_2 + 0x328) = 0;
  }
  plVar5 = (long *)(param_1 + 0x40);
  lVar8 = *plVar5;
  if (lVar8 == 0) {
    *(long *)(param_1 + 0x48) = param_2;
    *(long *)(param_1 + 0x40) = param_2;
    *(long **)(param_2 + 800) = plVar5;
    *(long **)(param_2 + 0x328) = (long *)(param_1 + 0x48);
    *(long *)(param_2 + 0x390) = param_1;
    return;
  }
  iVar3 = *(int *)(param_2 + 0x2f0);
  if (iVar3 == 0) {
    if (*(int *)(lVar8 + 0x2f0) == 0) goto LAB_009be4e4;
    lVar9 = *(long *)(param_1 + 0x48);
    if (*(int *)(lVar9 + 0x2f0) == 0) {
      lVar7 = *(long *)(param_2 + 0x2e8);
      goto LAB_009be520;
    }
LAB_009be52c:
    plVar5 = (long *)(param_1 + 0x48);
    *(long *)(param_2 + 800) = lVar9;
    *(long *)(lVar9 + 0x328) = param_2;
    *(long **)(param_2 + 0x328) = plVar5;
  }
  else {
    if (*(int *)(lVar8 + 0x2f0) != 0) {
LAB_009be4e4:
      lVar7 = *(long *)(param_2 + 0x2e8);
      if (lVar7 < *(long *)(lVar8 + 0x2e8)) {
        lVar9 = *(long *)(param_1 + 0x48);
        if (iVar3 == 0) {
          if (*(int *)(lVar9 + 0x2f0) != 0) goto LAB_009be52c;
        }
        else if (*(int *)(lVar9 + 0x2f0) == 0) goto LAB_009be564;
LAB_009be520:
        if (*(long *)(lVar9 + 0x2e8) <= lVar7) {
LAB_009be564:
          do {
            lVar8 = *(long *)(lVar8 + 0x328);
            if (lVar8 == param_1 + 0x48) goto LAB_009be53c;
            if (iVar3 == 0) {
              if (*(int *)(lVar8 + 0x2f0) != 0) goto LAB_009be564;
            }
            else if (*(int *)(lVar8 + 0x2f0) == 0) goto LAB_009be574;
            if (*(long *)(lVar8 + 0x2e8) <= lVar7) {
LAB_009be574:
              *(long *)(param_2 + 0x328) = lVar8;
              *(undefined8 *)(param_2 + 800) = *(undefined8 *)(lVar8 + 800);
              *(long *)(*(long *)(lVar8 + 800) + 0x328) = param_2;
              *(long *)(lVar8 + 800) = param_2;
              *(long *)(param_2 + 0x390) = param_1;
              return;
            }
          } while( true );
        }
        goto LAB_009be52c;
      }
    }
    *(long *)(param_2 + 0x328) = lVar8;
    *(long *)(lVar8 + 800) = param_2;
    *(long **)(param_2 + 800) = plVar5;
  }
  *plVar5 = param_2;
LAB_009be53c:
  *(long *)(param_2 + 0x390) = param_1;
  return;
}

