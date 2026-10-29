/* 7ff70c92d390 FUN_7ff70c92d390 */

void FUN_7ff70c92d390(undefined8 *param_1)

{
  byte *pbVar1;
  longlong lVar2;
  longlong lVar3;
  char cVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  byte *pbVar7;
  longlong lVar8;
  undefined8 *puVar9;
  longlong lVar10;
  undefined4 uVar11;
  
  lVar2 = param_1[8];
  cVar4 = FUN_7ff70c92d8f0();
  if (cVar4 == '\0') {
    if (*(int *)(param_1 + 0xe) != 0x7c) {
      return;
    }
    puVar5 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    *puVar5 = &UNK_7ff70cb46710;
    *(undefined4 *)(puVar5 + 1) = 8;
    *(undefined8 *)((longlong)puVar5 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar5 + 0x14) = 0;
    lVar8 = param_1[8];
    puVar5[3] = lVar8;
    lVar3 = *(longlong *)(lVar8 + 0x10);
    if (lVar3 != 0) {
      puVar5[2] = lVar3;
      *(undefined8 **)(lVar3 + 0x18) = puVar5;
      lVar8 = param_1[8];
    }
    *(undefined8 **)(lVar8 + 0x10) = puVar5;
    param_1[8] = puVar5;
    uVar11 = 0xe;
    if (*(int *)(puVar5 + 1) - 8U < 4) {
      uVar11 = *(undefined4 *)(&UNK_7ff70cb46304 + (ulonglong)(*(int *)(puVar5 + 1) - 8U) * 4);
    }
    puVar6 = (undefined8 *)FUN_7ff70ca8ff40(0x28);
    *(undefined4 *)(puVar6 + 1) = uVar11;
    *(undefined8 *)((longlong)puVar6 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar6 + 0x14) = 0;
    *puVar6 = &UNK_7ff70cb46a78;
    puVar6[4] = puVar5;
    puVar6[3] = puVar5;
    lVar8 = puVar5[2];
    if (lVar8 != 0) {
      puVar6[2] = lVar8;
      *(undefined8 **)(lVar8 + 0x18) = puVar6;
      puVar5 = (undefined8 *)param_1[8];
    }
    puVar5[2] = puVar6;
    param_1[8] = puVar6;
  }
  if (*(int *)(param_1 + 0xe) == 0x7c) {
    puVar5 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    *(undefined4 *)(puVar5 + 1) = 0x11;
    *(undefined8 *)((longlong)puVar5 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar5 + 0x14) = 0;
    *puVar5 = &UNK_7ff70cb46998;
    lVar8 = param_1[8];
    puVar5[3] = lVar8;
    lVar3 = *(longlong *)(lVar8 + 0x10);
    if (lVar3 != 0) {
      puVar5[2] = lVar3;
      *(undefined8 **)(lVar3 + 0x18) = puVar5;
      lVar8 = param_1[8];
    }
    *(undefined8 **)(lVar8 + 0x10) = puVar5;
    param_1[8] = puVar5;
    puVar6 = (undefined8 *)FUN_7ff70ca8ff40(0x30);
    puVar6[1] = 0x10;
    *puVar6 = &UNK_7ff70cb46a08;
    puVar6[4] = puVar5;
    puVar6[5] = 0;
    lVar8 = *(longlong *)(lVar2 + 0x10);
    *(undefined8 **)(*(longlong *)(lVar8 + 0x18) + 0x10) = puVar6;
    puVar6[3] = *(undefined8 *)(lVar8 + 0x18);
    *(undefined8 **)(lVar8 + 0x18) = puVar6;
    puVar6[2] = lVar8;
    do {
      pbVar7 = (byte *)*param_1;
      if (pbVar7 != (byte *)param_1[1]) {
        if ((((*pbVar7 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
            (pbVar1 = pbVar7 + 1, pbVar1 != (byte *)param_1[1])) &&
           ((((param_1[0xc] & 8) == 0 && ((*pbVar1 & 0xfe) == 0x28)) ||
            (((param_1[0xc] & 0x10) == 0 && ((*pbVar1 == 0x7d || (*pbVar1 == 0x7b)))))))) {
          pbVar7 = pbVar1;
        }
        *param_1 = pbVar7 + 1;
      }
      FUN_7ff70c92d1b0(param_1);
      cVar4 = FUN_7ff70c92d8f0(param_1);
      if (cVar4 == '\0') {
        puVar6 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
        *puVar6 = &UNK_7ff70cb46710;
        *(undefined4 *)(puVar6 + 1) = 8;
        *(undefined8 *)((longlong)puVar6 + 0xc) = 0;
        *(undefined4 *)((longlong)puVar6 + 0x14) = 0;
        lVar8 = param_1[8];
        puVar6[3] = lVar8;
        lVar3 = *(longlong *)(lVar8 + 0x10);
        if (lVar3 != 0) {
          puVar6[2] = lVar3;
          *(undefined8 **)(lVar3 + 0x18) = puVar6;
          lVar8 = param_1[8];
        }
        *(undefined8 **)(lVar8 + 0x10) = puVar6;
        param_1[8] = puVar6;
        uVar11 = 0xe;
        if (*(int *)(puVar6 + 1) - 8U < 4) {
          uVar11 = *(undefined4 *)(&UNK_7ff70cb46304 + (ulonglong)(*(int *)(puVar6 + 1) - 8U) * 4);
        }
        puVar9 = (undefined8 *)FUN_7ff70ca8ff40(0x28);
        *(undefined4 *)(puVar9 + 1) = uVar11;
        *(undefined8 *)((longlong)puVar9 + 0xc) = 0;
        *(undefined4 *)((longlong)puVar9 + 0x14) = 0;
        *puVar9 = &UNK_7ff70cb46a78;
        puVar9[4] = puVar6;
        puVar9[3] = puVar6;
        lVar8 = puVar6[2];
        if (lVar8 != 0) {
          puVar9[2] = lVar8;
          *(undefined8 **)(lVar8 + 0x18) = puVar9;
          puVar6 = (undefined8 *)param_1[8];
        }
        puVar6[2] = puVar9;
        param_1[8] = puVar9;
      }
      else {
        puVar9 = (undefined8 *)param_1[8];
      }
      lVar8 = *(longlong *)(lVar2 + 0x10);
      lVar3 = puVar5[2];
      param_1[8] = puVar5;
      puVar5[2] = 0;
      puVar9[2] = puVar5;
      do {
        lVar10 = lVar8;
        lVar8 = *(longlong *)(lVar10 + 0x28);
      } while (lVar8 != 0);
      puVar6 = (undefined8 *)FUN_7ff70ca8ff40(0x30);
      *(undefined4 *)(puVar6 + 1) = 0x10;
      *(undefined8 *)((longlong)puVar6 + 0xc) = 0;
      *(undefined8 *)((longlong)puVar6 + 0x14) = 0;
      *(undefined4 *)((longlong)puVar6 + 0x1c) = 0;
      *puVar6 = &UNK_7ff70cb46a08;
      puVar6[4] = puVar5;
      puVar6[5] = 0;
      *(undefined8 **)(lVar10 + 0x28) = puVar6;
      puVar6[2] = lVar3;
      *(undefined8 **)(lVar3 + 0x18) = puVar6;
    } while (*(int *)(param_1 + 0xe) == 0x7c);
  }
  return;
}


