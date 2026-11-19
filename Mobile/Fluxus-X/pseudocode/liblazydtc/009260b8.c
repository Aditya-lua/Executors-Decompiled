/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009260b8
 */

/* WARNING: Removing unreachable block (ram,0x00926558) */
/* WARNING: Removing unreachable block (ram,0x00926568) */

int FUN_009260b8(undefined8 param_1,undefined8 *param_2,long param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int iVar4;
  long *plVar5;
  undefined8 *puVar6;
  uint uVar7;
  long *plVar8;
  long *plVar9;
  size_t sVar10;
  undefined8 uVar11;
  char *__s;
  long lVar12;
  
  switch(*(undefined4 *)(param_3 + 0x10)) {
  case 0:
    break;
  case 1:
    if (param_2 == (undefined8 *)0x0) goto switchD_009260fc_default;
    __s = *(char **)(param_3 + 0x18);
    sVar10 = *(size_t *)(param_3 + 0x70);
    if ((code *)param_2[6] != (code *)0x0) {
      (*(code *)param_2[6])(param_2[7]);
    }
    param_2[0x36] = 1;
    param_2[3] = 0;
    param_2[4] = 0;
    param_2[5] = 0;
    param_2[6] = 0;
    param_2[7] = param_2;
    param_2[8] = 0;
    param_2[0xe] = 0;
    param_2[0x14] = 0;
    param_2[0x15] = 0;
    param_2[0x13] = 0;
    *(undefined4 *)(param_2 + 2) = 0;
    *(uint *)((long)param_2 + 0x14) = *(uint *)((long)param_2 + 0x14) & 0xfffffffb;
    *(undefined4 *)(param_2 + 0xf) = 0;
    if (__s == (char *)0x0) break;
    if (sVar10 == 0xffffffffffffffff) {
      sVar10 = strlen(__s);
    }
    lVar12 = FUN_00941948(__s,sVar10);
    param_2[3] = lVar12;
    if (lVar12 != 0) {
      param_2[4] = FUN_00926c78;
      param_2[5] = &LAB_00926cec;
      param_2[0xe] = sVar10;
      param_2[6] = &LAB_00926d44;
      *(undefined4 *)(param_2 + 2) = 1;
      *(uint *)((long)param_2 + 0x14) = *(uint *)((long)param_2 + 0x14) | 4;
      if (*(long *)(param_3 + 0x50) != 0) goto LAB_009263c4;
      goto LAB_00926404;
    }
    goto LAB_009264b8;
  case 2:
    iVar4 = curl_mime_filedata(param_2,*(undefined8 *)(param_3 + 0x18));
    if (iVar4 != 0x1a) goto LAB_009263b8;
    break;
  case 3:
    if (param_2 == (undefined8 *)0x0) goto switchD_009260fc_default;
    uVar11 = *(undefined8 *)(param_3 + 0x70);
    lVar12 = *(long *)(param_3 + 0x20);
    uVar2 = *(undefined8 *)(param_3 + 0x28);
    uVar1 = *(undefined8 *)(param_3 + 0x30);
    uVar3 = *(undefined8 *)(param_3 + 0x38);
    if ((code *)param_2[6] != (code *)0x0) {
      (*(code *)param_2[6])(param_2[7]);
    }
    param_2[0x36] = 1;
    param_2[3] = 0;
    param_2[4] = 0;
    param_2[5] = 0;
    param_2[6] = 0;
    param_2[7] = param_2;
    param_2[8] = 0;
    param_2[0xe] = 0;
    param_2[0x14] = 0;
    param_2[0x15] = 0;
    param_2[0x13] = 0;
    *(undefined4 *)(param_2 + 2) = 0;
    *(uint *)((long)param_2 + 0x14) = *(uint *)((long)param_2 + 0x14) & 0xfffffffb;
    *(undefined4 *)(param_2 + 0xf) = 0;
    if (lVar12 == 0) break;
    param_2[4] = lVar12;
    param_2[5] = uVar2;
    param_2[6] = uVar1;
    param_2[7] = uVar3;
    param_2[0xe] = uVar11;
    *(undefined4 *)(param_2 + 2) = 3;
    lVar12 = *(long *)(param_3 + 0x50);
    goto joined_r0x00926240;
  case 4:
    plVar5 = (long *)(*(code *)PTR_malloc_00cc4670)(0x60);
    if (plVar5 != (long *)0x0) {
      *plVar5 = 0;
      plVar5[1] = 0;
      plVar5[4] = 0x2d2d2d2d2d2d2d2d;
      plVar5[5] = 0x2d2d2d2d2d2d2d2d;
      plVar5[2] = 0;
      plVar5[3] = 0x2d2d2d2d2d2d2d2d;
      iVar4 = FUN_00932640(param_1,plVar5 + 6,0x17);
      if (iVar4 == 0) {
        *(undefined4 *)(plVar5 + 9) = 0;
        plVar5[10] = 0;
        plVar5[0xb] = 0;
        if (param_2 == (undefined8 *)0x0) {
LAB_009263ac:
          iVar4 = 0x2b;
        }
        else {
          if ((*(int *)(param_2 + 2) != 4) || ((long *)param_2[7] != plVar5)) {
            if ((code *)param_2[6] != (code *)0x0) {
              (*(code *)param_2[6])(param_2[7]);
            }
            param_2[0x36] = 1;
            param_2[3] = 0;
            param_2[4] = 0;
            param_2[5] = 0;
            param_2[6] = 0;
            param_2[7] = param_2;
            param_2[8] = 0;
            param_2[0xe] = 0;
            param_2[0x14] = 0;
            param_2[0x15] = 0;
            param_2[0x13] = 0;
            *(undefined4 *)(param_2 + 2) = 0;
            *(uint *)((long)param_2 + 0x14) = *(uint *)((long)param_2 + 0x14) & 0xfffffffb;
            *(undefined4 *)(param_2 + 0xf) = 0;
            if (*plVar5 != 0) goto LAB_009263ac;
            plVar9 = (long *)*param_2;
            if ((long *)*param_2 != (long *)0x0) {
              do {
                plVar8 = plVar9;
                puVar6 = (undefined8 *)*plVar8;
                if (puVar6 == (undefined8 *)0x0) break;
                plVar9 = (long *)*puVar6;
              } while (plVar9 != (long *)0x0);
              if (plVar8 == plVar5) goto LAB_009263ac;
            }
            *plVar5 = (long)param_2;
            param_2[6] = &LAB_009271bc;
            param_2[7] = plVar5;
            param_2[5] = &LAB_009270d4;
            param_2[0xe] = 0xffffffffffffffff;
            *(undefined4 *)(param_2 + 2) = 4;
          }
          iVar4 = 0;
          for (lVar12 = *(long *)(*(long *)(param_3 + 0x38) + 8); lVar12 != 0;
              lVar12 = *(long *)(lVar12 + 8)) {
            puVar6 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(0x1b8);
            if (puVar6 == (undefined8 *)0x0) goto LAB_009264b8;
            memset(puVar6 + 1,0,0x1a8);
            puVar6[0x36] = 1;
            *(undefined4 *)(puVar6 + 0xf) = 0;
            puVar6[0x10] = 0;
            puVar6[0x11] = 0;
            *puVar6 = plVar5;
            plVar9 = plVar5;
            if ((long *)plVar5[2] != (long *)0x0) {
              plVar9 = (long *)plVar5[2];
            }
            plVar9[1] = (long)puVar6;
            plVar5[2] = (long)puVar6;
            iVar4 = FUN_009260b8(param_1,puVar6,lVar12);
            if (iVar4 != 0) break;
          }
        }
        goto LAB_009263b8;
      }
      (*(code *)PTR_free_00cc4678)(plVar5);
    }
    iVar4 = 0x1b;
LAB_009263b8:
    if (iVar4 != 0) goto LAB_009264cc;
    break;
  default:
    goto switchD_009260fc_default;
  }
  lVar12 = *(long *)(param_3 + 0x50);
joined_r0x00926240:
  if (lVar12 == 0) {
LAB_00926404:
    param_2[0x12] = *(undefined8 *)(param_3 + 0x90);
    if (param_2 == (undefined8 *)0x0) {
switchD_009260fc_default:
      iVar4 = 0x2b;
      goto LAB_009264cc;
    }
    lVar12 = *(long *)(param_3 + 0x58);
    (*(code *)PTR_free_00cc4678)(param_2[0xb]);
    param_2[0xb] = 0;
    if (lVar12 != 0) {
      lVar12 = (*(code *)PTR_strdup_00cc4688)(lVar12);
      param_2[0xb] = lVar12;
      if (lVar12 == 0) goto LAB_009264b8;
    }
    lVar12 = *(long *)(param_3 + 0x68);
    (*(code *)PTR_free_00cc4678)(param_2[0xd]);
    param_2[0xd] = 0;
    if (lVar12 != 0) {
      lVar12 = (*(code *)PTR_strdup_00cc4688)(lVar12);
      param_2[0xd] = lVar12;
      if (lVar12 == 0) goto LAB_009264b8;
    }
    lVar12 = *(long *)(param_3 + 0x60);
    (*(code *)PTR_free_00cc4678)(param_2[0xc]);
    param_2[0xc] = 0;
    if (lVar12 == 0) {
      return 0;
    }
    lVar12 = (*(code *)PTR_strdup_00cc4688)(lVar12);
    param_2[0xc] = lVar12;
    if (lVar12 != 0) {
      return 0;
    }
  }
  else {
LAB_009263c4:
    lVar12 = FUN_0093f7d8();
    if (lVar12 != 0) {
      if (param_2 != (undefined8 *)0x0) {
        uVar7 = *(uint *)((long)param_2 + 0x14);
        if ((uVar7 & 1) != 0) {
          if (param_2[10] != lVar12) {
            curl_slist_free_all();
            uVar7 = *(uint *)((long)param_2 + 0x14);
          }
          uVar7 = uVar7 & 0xfffffffe;
          *(uint *)((long)param_2 + 0x14) = uVar7;
        }
        param_2[10] = lVar12;
        *(uint *)((long)param_2 + 0x14) = uVar7 | 1;
        goto LAB_00926404;
      }
      curl_slist_free_all(lVar12);
      goto switchD_009260fc_default;
    }
  }
LAB_009264b8:
  iVar4 = 0x1b;
LAB_009264cc:
  FUN_00925eb8(param_2);
  return iVar4;
}

