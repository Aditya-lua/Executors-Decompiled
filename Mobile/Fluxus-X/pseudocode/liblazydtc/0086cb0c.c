/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086cb0c
 */

void FUN_0086cb0c(long param_1)

{
  void *pvVar1;
  long lVar2;
  void *pvVar3;
  byte bVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined4 uVar7;
  int iVar8;
  char *pcVar9;
  char *pcVar10;
  size_t sVar11;
  int *piVar12;
  undefined8 *puVar13;
  ulong uVar14;
  size_t sVar15;
  undefined1 *puVar16;
  char *pcVar17;
  undefined8 *puVar18;
  undefined1 *puVar19;
  long lVar20;
  undefined8 uVar21;
  char *pcVar22;
  ulong uVar23;
  size_t sVar24;
  void *pvVar25;
  ulong uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  double dVar29;
  long local_2a0;
  size_t sStack_298;
  undefined8 local_290;
  undefined8 uStack_288;
  char *local_280;
  char *local_278;
  undefined8 uStack_270;
  long local_78;
  
  lVar5 = tpidr_el0;
  local_78 = *(long *)(lVar5 + 0x28);
  uStack_288 = *(undefined8 *)(param_1 + 0x9c);
  local_290 = *(undefined8 *)(param_1 + 0x94);
  uVar21 = *(undefined8 *)(param_1 + 0xa8);
  uVar7 = FUN_008521f4(param_1 + 0x90);
  FUN_00802564(param_1 + 0x498,uVar21,uVar7);
  bVar4 = *(byte *)(param_1 + 0x498);
  uVar23 = (ulong)bVar4;
  local_2a0 = 0;
  sStack_298 = 0;
  if ((*(byte *)(param_1 + 0x68) & 1) == 0) {
    sVar24 = *(size_t *)(param_1 + 0x4a0);
  }
  else {
    sVar24 = *(size_t *)(param_1 + 0x4a0);
    sVar15 = (size_t)(bVar4 >> 1);
    lVar2 = param_1 + 0x499;
    sVar11 = sVar15;
    if ((bVar4 & 1) != 0) {
      lVar2 = *(long *)(param_1 + 0x4a8);
      sVar11 = sVar24;
    }
    uVar26 = sVar11 + 1;
    if (sVar11 == 0xffffffffffffffff) {
      local_2a0 = 0;
    }
    else {
      local_2a0 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar26);
      uVar23 = 0;
      if ((uVar26 < 8) || ((ulong)(local_2a0 - lVar2) < 0x20)) {
LAB_0086cc40:
        lVar20 = (sVar11 - uVar23) + 1;
        puVar16 = (undefined1 *)(local_2a0 + uVar23);
        puVar19 = (undefined1 *)(lVar2 + uVar23);
        do {
          lVar20 = lVar20 + -1;
          *puVar16 = *puVar19;
          puVar16 = puVar16 + 1;
          puVar19 = puVar19 + 1;
        } while (lVar20 != 0);
      }
      else if (uVar26 < 0x20) {
        uVar14 = 0;
LAB_0086cc14:
        uVar23 = uVar26 & 0xfffffffffffffff8;
        lVar20 = uVar14 - uVar23;
        puVar13 = (undefined8 *)(local_2a0 + uVar14);
        puVar18 = (undefined8 *)(lVar2 + uVar14);
        do {
          lVar20 = lVar20 + 8;
          *puVar13 = *puVar18;
          puVar13 = puVar13 + 1;
          puVar18 = puVar18 + 1;
        } while (lVar20 != 0);
        if (uVar26 != uVar23) goto LAB_0086cc40;
      }
      else {
        uVar23 = uVar26 & 0xffffffffffffffe0;
        puVar13 = (undefined8 *)(local_2a0 + 0x10);
        puVar18 = (undefined8 *)(lVar2 + 0x10);
        uVar14 = uVar23;
        do {
          puVar6 = puVar18 + -1;
          uVar21 = puVar18[-2];
          uVar28 = puVar18[1];
          uVar27 = *puVar18;
          uVar14 = uVar14 - 0x20;
          puVar18 = puVar18 + 4;
          puVar13[-1] = *puVar6;
          puVar13[-2] = uVar21;
          puVar13[1] = uVar28;
          *puVar13 = uVar27;
          puVar13 = puVar13 + 4;
        } while (uVar14 != 0);
        if (uVar26 != uVar23) {
          uVar14 = uVar23;
          if ((uVar26 & 0x18) == 0) goto LAB_0086cc40;
          goto LAB_0086cc14;
        }
      }
      bVar4 = *(byte *)(param_1 + 0x498);
      uVar23 = (ulong)bVar4;
      sVar24 = *(size_t *)(param_1 + 0x4a0);
      sVar15 = (size_t)(bVar4 >> 1);
    }
    sStack_298 = sVar15;
    if ((bVar4 & 1) != 0) {
      sStack_298 = sVar24;
    }
  }
  uVar26 = uVar23 >> 1;
  sVar11 = uVar26;
  if ((uVar23 & 1) != 0) {
    sVar11 = sVar24;
  }
  if (sVar11 != 0) {
    pvVar25 = *(void **)(param_1 + 0x4a8);
    pvVar1 = (void *)(param_1 + 0x499);
    pvVar3 = pvVar1;
    if ((uVar23 & 1) != 0) {
      pvVar3 = pvVar25;
    }
    pcVar9 = memchr(pvVar3,0x5f,sVar11);
    if ((pcVar9 != (char *)0x0) && ((long)pcVar9 - (long)pvVar3 != -1)) {
      pcVar22 = (char *)((long)pvVar3 + sVar11);
      if (pcVar9 != pcVar22) {
        pcVar17 = pcVar9 + 1;
        pcVar10 = pcVar9;
        if (pcVar17 != pcVar22) {
          do {
            pcVar9 = pcVar10;
            if (*pcVar17 != '_') {
              pcVar9 = pcVar10 + 1;
              *pcVar10 = *pcVar17;
            }
            pcVar17 = pcVar17 + 1;
            pcVar10 = pcVar9;
          } while (pcVar17 != pcVar22);
          uVar23 = (ulong)*(byte *)(param_1 + 0x498);
          pvVar25 = *(void **)(param_1 + 0x4a8);
          sVar24 = *(size_t *)(param_1 + 0x4a0);
          uVar26 = (ulong)(*(byte *)(param_1 + 0x498) >> 1);
        }
      }
      pvVar3 = pvVar1;
      if ((uVar23 & 1) != 0) {
        uVar26 = sVar24;
        pvVar3 = pvVar25;
      }
      uVar14 = (long)pcVar9 - (long)pvVar3;
      if (uVar26 < uVar14) {
        if (*(long *)(lVar5 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
          FUN_00814f80();
        }
        goto LAB_0086d044;
      }
      if ((long)pvVar3 + (uVar26 - (long)pcVar9) == -1) {
        if ((uVar23 & 1) == 0) {
          *(char *)(param_1 + 0x498) = (char)((int)uVar14 << 1);
          *(undefined1 *)((long)pvVar1 + uVar14) = 0;
        }
        else {
          *(ulong *)(param_1 + 0x4a0) = uVar14;
          *(undefined1 *)((long)pvVar25 + uVar14) = 0;
        }
      }
      else {
        FUN_0081ff10(param_1 + 0x498);
      }
    }
  }
  pcVar9 = (char *)(param_1 + 0x499);
  if ((*(byte *)(param_1 + 0x498) & 1) != 0) {
    pcVar9 = *(char **)(param_1 + 0x4a8);
  }
  if (*pcVar9 == '0') {
    bVar4 = pcVar9[1];
    if (0x61 < bVar4) {
      if (bVar4 != 0x78) {
        if (bVar4 == 0x62) goto LAB_0086cda0;
        goto LAB_0086ce48;
      }
LAB_0086cdd8:
      if (pcVar9[2] == '\0') goto LAB_0086ce48;
      local_278 = (char *)0x0;
      uVar23 = strtoull(pcVar9,&local_278,0x10);
      if (*local_278 != '\0') goto LAB_0086ce64;
      dVar29 = (double)uVar23;
      if (uVar23 == 0xffffffffffffffff) {
        piVar12 = (int *)__errno();
        if (*piVar12 == 0x22) {
          *piVar12 = 0;
          uVar23 = strtoull(pcVar9,&local_278,0x10);
          if (*piVar12 == 0x22) {
            iVar8 = 4;
            goto LAB_0086cf5c;
          }
          goto LAB_0086cf00;
        }
LAB_0086cf48:
        uVar23 = 0xffffffffffffffff;
      }
      else {
LAB_0086cf00:
        if (uVar23 >> 0x35 == 0) goto LAB_0086cf58;
      }
      if (uVar23 == (long)dVar29) goto LAB_0086cf58;
LAB_0086d028:
      iVar8 = 1;
      goto LAB_0086cf5c;
    }
    if (bVar4 != 0x42) {
LAB_0086cdd0:
      if (bVar4 != 0x58) goto LAB_0086ce48;
      goto LAB_0086cdd8;
    }
LAB_0086cda0:
    pcVar22 = pcVar9 + 2;
    if (*pcVar22 == '\0') goto LAB_0086cdd0;
    if ((*pcVar22 != '0') || ((byte)(pcVar9[3] | 0x20U) != 0x62)) {
      local_278 = (char *)0x0;
      iVar8 = 2;
      uVar23 = strtoull(pcVar22,&local_278,2);
      if (*local_278 == '\0') {
        dVar29 = (double)uVar23;
        if (uVar23 == 0xffffffffffffffff) {
          piVar12 = (int *)__errno();
          if (*piVar12 == 0x22) {
            *piVar12 = 0;
            uVar23 = strtoull(pcVar22,&local_278,2);
            if (*piVar12 == 0x22) {
              iVar8 = 3;
              goto LAB_0086cf5c;
            }
            goto LAB_0086cf00;
          }
          goto LAB_0086cf48;
        }
        goto LAB_0086cf00;
      }
      dVar29 = 0.0;
      goto LAB_0086cf5c;
    }
    FUN_00858f2c(param_1);
LAB_0086cf6c:
    local_278 = (char *)0x0;
    uStack_270 = 0;
    pcVar9 = (char *)FUN_008659e8(param_1,&local_290,&local_278,"Malformed number");
  }
  else {
LAB_0086ce48:
    local_280 = (char *)0x0;
    dVar29 = strtod(pcVar9,&local_280);
    if (*local_280 == '\0') {
      if (9007199254740992.0 <= dVar29) {
        sVar24 = strspn(pcVar9,"0123456789");
        sVar11 = strlen(pcVar9);
        if (sVar24 == sVar11) {
          FUN_008700d8(dVar29,&local_278);
          iVar8 = strcmp((char *)&local_278,pcVar9);
          if (iVar8 != 0) goto LAB_0086d028;
        }
      }
LAB_0086cf58:
      iVar8 = 0;
    }
    else {
LAB_0086ce64:
      dVar29 = 0.0;
      iVar8 = 2;
    }
LAB_0086cf5c:
    FUN_00858f2c(param_1);
    if (iVar8 == 2) goto LAB_0086cf6c;
    pcVar9 = (char *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
    FUN_0084ec44(dVar29,pcVar9,&local_290,iVar8);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar21 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x18);
      FUN_00851dc0(uVar21,&local_2a0);
      local_278 = pcVar9;
      puVar13 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_278);
      *puVar13 = uVar21;
    }
  }
  if (*(long *)(lVar5 + 0x28) == local_78) {
    return;
  }
LAB_0086d044:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(pcVar9);
}

