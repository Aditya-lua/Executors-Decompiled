/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00927320
 */

size_t FUN_00927320(long param_1,void *param_2,ulong param_3,undefined8 param_4)

{
  char cVar1;
  byte bVar2;
  int iVar3;
  ulong uVar4;
  undefined4 uVar5;
  long lVar6;
  size_t sVar7;
  long *plVar8;
  char *pcVar9;
  ulong __n;
  size_t sVar10;
  size_t sVar11;
  void *pvVar12;
  ulong uVar13;
  
  sVar11 = 0;
  if (param_3 == 0) {
switchD_00927390_caseD_8:
    return sVar11;
  }
  sVar7 = 0;
LAB_00927374:
  sVar10 = 0;
  if (8 < *(uint *)(param_1 + 0x78)) goto switchD_00927390_caseD_5;
  plVar8 = *(long **)(param_1 + 0x80);
  sVar11 = sVar7;
  switch(*(uint *)(param_1 + 0x78)) {
  case 0:
    uVar5 = 4;
    if ((*(uint *)(param_1 + 0x14) & 2) == 0) {
      uVar5 = 1;
    }
    *(undefined4 *)(param_1 + 0x78) = uVar5;
    *(undefined8 *)(param_1 + 0x80) = *(undefined8 *)(param_1 + 0x48);
LAB_00927414:
    sVar10 = 0;
    *(undefined8 *)(param_1 + 0x88) = 0;
    break;
  case 1:
    if (plVar8 == (long *)0x0) {
      lVar6 = *(long *)(param_1 + 0x50);
LAB_00927404:
      *(undefined4 *)(param_1 + 0x78) = 2;
      *(long *)(param_1 + 0x80) = lVar6;
      goto LAB_00927414;
    }
LAB_0092741c:
    pcVar9 = (char *)*plVar8;
    sVar11 = strlen(pcVar9);
    uVar4 = FUN_00963a7c(*(undefined8 *)(param_1 + 0x88));
    uVar13 = uVar4 - sVar11;
    if (uVar4 < sVar11) {
      pcVar9 = pcVar9 + uVar4;
      uVar4 = sVar11 - uVar4;
LAB_009275d8:
      sVar10 = param_3;
      if (uVar4 <= param_3) {
        sVar10 = uVar4;
      }
      memcpy(param_2,pcVar9,sVar10);
      *(size_t *)(param_1 + 0x88) = *(long *)(param_1 + 0x88) + sVar10;
      if (sVar10 != 0) break;
    }
    else if (uVar13 < 2) {
      pcVar9 = &DAT_002b917a + uVar13;
      uVar4 = 2 - uVar13;
      goto LAB_009275d8;
    }
    sVar10 = 0;
    *(long *)(param_1 + 0x80) = plVar8[1];
    *(undefined8 *)(param_1 + 0x88) = 0;
    break;
  case 2:
    if (plVar8 != (long *)0x0) {
      iVar3 = curl_strnequal(*plVar8,"Content-Type",0xc);
      if ((iVar3 != 0) && (*(char *)(*plVar8 + 0xc) == ':')) {
        pcVar9 = (char *)(*plVar8 + 0xd);
        do {
          cVar1 = *pcVar9;
          pcVar9 = pcVar9 + 1;
        } while (cVar1 == ' ');
        lVar6 = plVar8[1];
        goto LAB_00927404;
      }
      goto LAB_0092741c;
    }
    uVar5 = 3;
    goto LAB_00927614;
  case 3:
    uVar13 = FUN_00963a7c(*(undefined8 *)(param_1 + 0x88));
    if (uVar13 < 2) {
      sVar10 = param_3;
      if (2 - uVar13 <= param_3) {
        sVar10 = 2 - uVar13;
      }
      memcpy(param_2,&DAT_002b917a + uVar13,sVar10);
      *(size_t *)(param_1 + 0x88) = *(long *)(param_1 + 0x88) + sVar10;
      if (sVar10 != 0) break;
    }
    uVar5 = 4;
    goto LAB_00927614;
  case 4:
    *(undefined8 *)(param_1 + 0xa0) = 0;
    *(undefined8 *)(param_1 + 0xa8) = 0;
    *(undefined8 *)(param_1 + 0x98) = 0;
    uVar5 = 7;
LAB_00927614:
    sVar10 = 0;
    *(undefined4 *)(param_1 + 0x78) = uVar5;
    *(undefined8 *)(param_1 + 0x80) = 0;
    *(undefined8 *)(param_1 + 0x88) = 0;
    break;
  case 7:
    if (*(long *)(param_1 + 0x90) != 0) {
      sVar11 = 0;
      bVar2 = 0;
      pvVar12 = param_2;
      uVar13 = param_3;
LAB_009274e4:
      do {
        uVar4 = *(ulong *)(param_1 + 0xa0);
        __n = *(ulong *)(param_1 + 0xa8);
        if ((bool)(__n <= uVar4 & (bVar2 ^ 1))) {
LAB_00927520:
          if (uVar4 != 0) {
            __n = __n - uVar4;
            if (__n != 0) {
              memmove((void *)(param_1 + 0xb0),(void *)(param_1 + uVar4 + 0xb0),__n);
            }
            *(undefined8 *)(param_1 + 0xa0) = 0;
            *(ulong *)(param_1 + 0xa8) = __n;
          }
          if (__n < 0x100) {
            sVar10 = FUN_009287bc(param_1,param_1 + __n + 0xb0,0x100 - __n,param_4);
            if ((1 < sVar10 + 2) && (1 < sVar10 - 0x10000000)) {
              if (sVar10 == 0) {
                bVar2 = 1;
              }
              else {
                *(size_t *)(param_1 + 0xa8) = *(long *)(param_1 + 0xa8) + sVar10;
              }
              goto LAB_009274e4;
            }
            if (sVar11 != 0) {
              sVar10 = sVar11;
            }
            sVar11 = sVar10;
          }
          else if (sVar11 == 0) {
            sVar11 = 0xffffffffffffffff;
          }
LAB_00927650:
          sVar10 = sVar11;
          goto LAB_0092765c;
        }
        sVar10 = (**(code **)(*(long *)(param_1 + 0x90) + 8))(pvVar12,uVar13,bVar2,param_1);
        if (sVar10 == 0) {
          if (bVar2 == 0) {
            uVar4 = *(ulong *)(param_1 + 0xa0);
            __n = *(ulong *)(param_1 + 0xa8);
            goto LAB_00927520;
          }
          goto LAB_00927650;
        }
        if (sVar10 + 2 < 2) goto LAB_00927690;
        sVar11 = sVar10 + sVar11;
        pvVar12 = (void *)((long)pvVar12 + sVar10);
        uVar13 = uVar13 - sVar10;
      } while( true );
    }
    sVar10 = FUN_009287bc(param_1,param_2,param_3,param_4);
    goto LAB_0092765c;
  case 8:
    goto switchD_00927390_caseD_8;
  }
switchD_00927390_caseD_5:
  sVar11 = sVar10 + sVar7;
  param_3 = param_3 - sVar10;
  param_2 = (void *)((long)param_2 + sVar10);
  sVar7 = sVar11;
  if (param_3 == 0) goto switchD_00927390_caseD_8;
  goto LAB_00927374;
LAB_00927690:
  if (sVar11 != 0) {
    sVar10 = sVar11;
  }
LAB_0092765c:
  if ((1 < sVar10 + 2) && (1 < sVar10 - 0x10000000)) {
    if (sVar10 != 0) goto switchD_00927390_caseD_5;
    *(undefined4 *)(param_1 + 0x78) = 8;
    *(undefined8 *)(param_1 + 0x80) = 0;
    *(undefined8 *)(param_1 + 0x88) = 0;
    if (*(int *)(param_1 + 0x10) == 2) {
      if (*(FILE **)(param_1 + 0x40) == (FILE *)0x0) {
        sVar10 = 0;
      }
      else {
        fclose(*(FILE **)(param_1 + 0x40));
        sVar10 = 0;
        *(undefined8 *)(param_1 + 0x40) = 0;
      }
    }
  }
  sVar11 = sVar10;
  if (sVar7 != 0) {
    sVar11 = sVar7;
  }
  goto switchD_00927390_caseD_8;
}

