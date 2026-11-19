/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086549c
 */

void FUN_0086549c(long *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  char cVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  
  plVar3 = (long *)*param_1;
  lVar7 = *plVar3;
  lVar4 = plVar3[1];
  lVar6 = param_1[1] * 0x20;
  if (lVar6 + lVar7 != lVar4) {
    lVar8 = lVar7 + lVar6;
    if (lVar8 + (lVar4 - (lVar6 + lVar7)) != lVar4) {
      lVar8 = lVar4 - lVar7;
      do {
        puVar1 = (undefined8 *)(lVar7 + lVar6);
        puVar2 = (undefined8 *)(lVar7 + lVar8);
        cVar5 = *(char *)(puVar1 + 3);
        if (cVar5 == *(char *)(puVar2 + 3)) {
          if (cVar5 != '\0') {
            puVar1 = (undefined8 *)(lVar7 + lVar8);
            puVar2 = (undefined8 *)(lVar7 + lVar6);
            *puVar2 = *puVar1;
            uVar9 = puVar1[1];
            puVar2[2] = puVar1[2];
            puVar2[1] = uVar9;
          }
        }
        else if (cVar5 == '\0') {
          uVar9 = puVar2[2];
          uVar11 = puVar2[1];
          uVar10 = *puVar2;
          *(undefined1 *)(puVar1 + 3) = 1;
          puVar1[2] = uVar9;
          puVar1[1] = uVar11;
          *puVar1 = uVar10;
        }
        else {
          *(undefined1 *)(puVar1 + 3) = 0;
        }
        lVar7 = lVar7 + 0x20;
      } while (lVar7 + lVar8 != lVar4);
      lVar8 = lVar7 + lVar6;
    }
    plVar3[1] = lVar8;
  }
  return;
}

