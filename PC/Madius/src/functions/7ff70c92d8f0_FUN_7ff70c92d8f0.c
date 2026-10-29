/* 7ff70c92d8f0 FUN_7ff70c92d8f0 */

ulonglong FUN_7ff70c92d8f0(longlong *param_1)

{
  byte *pbVar1;
  longlong lVar2;
  code *pcVar3;
  char cVar4;
  undefined8 uVar5;
  ulonglong uVar6;
  undefined8 *puVar7;
  byte *pbVar8;
  ulonglong uVar9;
  longlong lVar10;
  byte *pbVar11;
  
  uVar9 = 0;
LAB_7ff70c92d938:
  uVar6 = uVar9;
  switch((int)param_1[0xe]) {
  default:
    break;
  case 0x24:
    puVar7 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    *puVar7 = &UNK_7ff70cb46710;
    *(undefined4 *)(puVar7 + 1) = 3;
code_r0x7ff70c92dbf2:
    *(undefined8 *)((longlong)puVar7 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar7 + 0x14) = 0;
    lVar10 = param_1[8];
    puVar7[3] = lVar10;
    lVar2 = *(longlong *)(lVar10 + 0x10);
    if (lVar2 != 0) {
      puVar7[2] = lVar2;
      *(undefined8 **)(lVar2 + 0x18) = puVar7;
      lVar10 = param_1[8];
    }
    *(undefined8 **)(lVar10 + 0x10) = puVar7;
    param_1[8] = (longlong)puVar7;
    pbVar8 = (byte *)*param_1;
    pbVar11 = (byte *)param_1[1];
    if (pbVar8 != pbVar11) {
code_r0x7ff70c92dc32:
      if ((((*pbVar8 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
          (pbVar1 = pbVar8 + 1, pbVar1 != pbVar11)) &&
         ((((param_1[0xc] & 8U) == 0 && ((*pbVar1 & 0xfe) == 0x28)) ||
          (((param_1[0xc] & 0x10U) == 0 && ((*pbVar1 == 0x7d || (*pbVar1 == 0x7b)))))))) {
        pbVar8 = pbVar1;
      }
      *param_1 = (longlong)(pbVar8 + 1);
    }
    goto code_r0x7ff70c92dc78;
  case 0x28:
    pbVar8 = (byte *)*param_1;
    if (pbVar8 != (byte *)param_1[1]) {
      if ((((*pbVar8 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
          (pbVar11 = pbVar8 + 1, pbVar11 != (byte *)param_1[1])) &&
         ((((param_1[0xc] & 8U) == 0 && ((*pbVar11 & 0xfe) == 0x28)) ||
          (((param_1[0xc] & 0x10U) == 0 && ((*pbVar11 == 0x7d || (*pbVar11 == 0x7b)))))))) {
        pbVar8 = pbVar11;
      }
      *param_1 = (longlong)(pbVar8 + 1);
    }
    FUN_7ff70c92d1b0(param_1);
    cVar4 = func_0x7ff70c92e130(param_1);
    if ((int)param_1[0xe] != 0x29) goto code_r0x7ff70c92de4d;
    pbVar8 = (byte *)*param_1;
    if (pbVar8 != (byte *)param_1[1]) {
      if ((((*pbVar8 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
          (pbVar11 = pbVar8 + 1, pbVar11 != (byte *)param_1[1])) &&
         ((((param_1[0xc] & 8U) == 0 && ((*pbVar11 & 0xfe) == 0x28)) ||
          (((param_1[0xc] & 0x10U) == 0 && ((*pbVar11 == 0x7d || (*pbVar11 == 0x7b)))))))) {
        pbVar8 = pbVar11;
      }
      *param_1 = (longlong)(pbVar8 + 1);
    }
    uVar5 = FUN_7ff70c92d1b0(param_1);
    uVar9 = CONCAT71((int7)((ulonglong)uVar5 >> 8),1);
    if (cVar4 != '\0') goto code_r0x7ff70c92d92e;
    goto LAB_7ff70c92d938;
  case 0x29:
    if (*(int *)((longlong)param_1 + 0x14) != 0) goto code_r0x7ff70c92de28;
    if ((*(byte *)((longlong)param_1 + 99) & 8) == 0) goto code_r0x7ff70c92de4d;
    break;
  case 0x2a:
    if ((byte)(~(byte)uVar6 & (*(byte *)((longlong)param_1 + 99) & 2) >> 1) == 0)
    goto code_r0x7ff70c92de39;
    break;
  case 0x2b:
  case 0x3f:
  case 0x7b:
code_r0x7ff70c92de39:
    FUN_7ff70cb12980(10);
code_r0x7ff70c92de43:
    FUN_7ff70cb12980(4);
code_r0x7ff70c92de4d:
    FUN_7ff70cb12980(5);
code_r0x7ff70c92de57:
    FUN_7ff70cb12980(6);
    pcVar3 = (code *)swi(3);
    uVar9 = (*pcVar3)();
    return uVar9;
  case 0x2e:
    puVar7 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    *puVar7 = &UNK_7ff70cb46710;
    *(undefined4 *)(puVar7 + 1) = 5;
    *(undefined8 *)((longlong)puVar7 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar7 + 0x14) = 0;
    lVar10 = param_1[8];
    puVar7[3] = lVar10;
    lVar2 = *(longlong *)(lVar10 + 0x10);
    if (lVar2 != 0) {
      puVar7[2] = lVar2;
      *(undefined8 **)(lVar2 + 0x18) = puVar7;
      lVar10 = param_1[8];
    }
    *(undefined8 **)(lVar10 + 0x10) = puVar7;
    param_1[8] = (longlong)puVar7;
    pbVar8 = (byte *)*param_1;
    pbVar11 = (byte *)param_1[1];
    if (pbVar8 != pbVar11) goto code_r0x7ff70c92dd4c;
    goto LAB_7ff70c92d926;
  case 0x5b:
    *(undefined1 *)((longlong)param_1 + 0x74) = 1;
    if (*param_1 != param_1[1]) {
      *param_1 = *param_1 + 1;
    }
    FUN_7ff70c92d1b0(param_1);
    func_0x7ff70c92e040(param_1);
    *(undefined1 *)((longlong)param_1 + 0x74) = 0;
    if ((int)param_1[0xe] != 0x5d) goto code_r0x7ff70c92de43;
    pbVar8 = (byte *)*param_1;
    pbVar11 = (byte *)param_1[1];
    if (pbVar8 == pbVar11) goto LAB_7ff70c92d926;
    if (*pbVar8 == 0x5c) goto code_r0x7ff70c92dd5f;
    goto LAB_7ff70c92d920;
  case 0x5c:
    pbVar8 = (byte *)*param_1;
    if (pbVar8 != (byte *)param_1[1]) {
      if ((((*pbVar8 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
          (pbVar11 = pbVar8 + 1, pbVar11 != (byte *)param_1[1])) &&
         ((((param_1[0xc] & 8U) == 0 && ((*pbVar11 & 0xfe) == 0x28)) ||
          (((param_1[0xc] & 0x10U) == 0 && ((*pbVar11 == 0x7d || (*pbVar11 == 0x7b)))))))) {
        pbVar8 = pbVar11;
      }
      *param_1 = (longlong)(pbVar8 + 1);
    }
    FUN_7ff70c92d1b0(param_1);
    if ((*(char *)((longlong)param_1 + 0x75) == 'b' & (byte)param_1[0xc] >> 6) == 1) {
      puVar7 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
      *puVar7 = &UNK_7ff70cb46710;
      *(undefined4 *)(puVar7 + 1) = 4;
      goto code_r0x7ff70c92dbf2;
    }
    if ((*(char *)((longlong)param_1 + 0x75) == 'B' & (byte)((ulonglong)param_1[0xc] >> 6) & 3) != 1
       ) {
      func_0x7ff70c92de70(param_1);
      goto code_r0x7ff70c92d92e;
    }
    puVar7 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    *puVar7 = &UNK_7ff70cb46710;
    *(undefined4 *)(puVar7 + 1) = 4;
    *(undefined8 *)((longlong)puVar7 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar7 + 0x14) = 0;
    lVar10 = param_1[8];
    puVar7[3] = lVar10;
    lVar2 = *(longlong *)(lVar10 + 0x10);
    if (lVar2 != 0) {
      puVar7[2] = lVar2;
      *(undefined8 **)(lVar2 + 0x18) = puVar7;
      lVar10 = param_1[8];
    }
    *(undefined8 **)(lVar10 + 0x10) = puVar7;
    param_1[8] = (longlong)puVar7;
    *(byte *)((longlong)puVar7 + 0xc) = *(byte *)((longlong)puVar7 + 0xc) ^ 1;
    pbVar8 = (byte *)*param_1;
    pbVar11 = (byte *)param_1[1];
    if (pbVar8 != pbVar11) goto code_r0x7ff70c92dc32;
code_r0x7ff70c92dc78:
    uVar5 = FUN_7ff70c92d1b0(param_1);
    uVar9 = CONCAT71((int7)((ulonglong)uVar5 >> 8),1);
    goto LAB_7ff70c92d938;
  case 0x5d:
    if ((*(byte *)((longlong)param_1 + 99) & 0x10) == 0) goto code_r0x7ff70c92de43;
    break;
  case 0x5e:
    if ((*(byte *)((longlong)param_1 + 99) & (byte)uVar6) != 0) break;
    puVar7 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
    *puVar7 = &UNK_7ff70cb46710;
    *(undefined4 *)(puVar7 + 1) = 2;
    *(undefined8 *)((longlong)puVar7 + 0xc) = 0;
    *(undefined4 *)((longlong)puVar7 + 0x14) = 0;
    lVar10 = param_1[8];
    puVar7[3] = lVar10;
    lVar2 = *(longlong *)(lVar10 + 0x10);
    if (lVar2 != 0) {
      puVar7[2] = lVar2;
      *(undefined8 **)(lVar2 + 0x18) = puVar7;
      lVar10 = param_1[8];
    }
    *(undefined8 **)(lVar10 + 0x10) = puVar7;
    param_1[8] = (longlong)puVar7;
    pbVar8 = (byte *)*param_1;
    if (pbVar8 != (byte *)param_1[1]) {
      if ((((*pbVar8 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) &&
          (pbVar11 = pbVar8 + 1, pbVar11 != (byte *)param_1[1])) &&
         ((((param_1[0xc] & 8U) == 0 && ((*pbVar11 & 0xfe) == 0x28)) ||
          (((param_1[0xc] & 0x10U) == 0 && ((*pbVar11 == 0x7d || (*pbVar11 == 0x7b)))))))) {
        pbVar8 = pbVar11;
      }
      *param_1 = (longlong)(pbVar8 + 1);
    }
    uVar5 = FUN_7ff70c92d1b0(param_1);
    uVar9 = CONCAT71((int7)((ulonglong)uVar5 >> 8),1);
    if (((*(byte *)((longlong)param_1 + 99) & 2) == 0) ||
       ((uVar6 & 1) != 0 || (int)param_1[0xe] != 0x2a)) goto LAB_7ff70c92d938;
    break;
  case 0x7d:
    if ((*(byte *)((longlong)param_1 + 99) & 8) == 0) goto code_r0x7ff70c92de57;
    break;
  case -1:
  case 0x7c:
code_r0x7ff70c92de28:
    return uVar6 & 0xffffff01;
  }
  FUN_7ff70c92e540(param_1 + 7,*(undefined1 *)((longlong)param_1 + 0x75));
  pbVar8 = (byte *)*param_1;
  pbVar11 = (byte *)param_1[1];
  if (pbVar8 != pbVar11) {
code_r0x7ff70c92dd4c:
    if ((*pbVar8 == 0x5c) && (*(char *)((longlong)param_1 + 0x74) == '\0')) {
code_r0x7ff70c92dd5f:
      pbVar1 = pbVar8 + 1;
      if ((pbVar1 != pbVar11) &&
         ((((param_1[0xc] & 8U) == 0 && ((*pbVar1 & 0xfe) == 0x28)) ||
          (((param_1[0xc] & 0x10U) == 0 && ((*pbVar1 == 0x7d || (*pbVar1 == 0x7b)))))))) {
        pbVar8 = pbVar1;
      }
    }
LAB_7ff70c92d920:
    *param_1 = (longlong)(pbVar8 + 1);
  }
LAB_7ff70c92d926:
  FUN_7ff70c92d1b0(param_1);
code_r0x7ff70c92d92e:
  uVar5 = FUN_7ff70c92e640(param_1);
  uVar9 = CONCAT71((int7)((ulonglong)uVar5 >> 8),1);
  goto LAB_7ff70c92d938;
}


