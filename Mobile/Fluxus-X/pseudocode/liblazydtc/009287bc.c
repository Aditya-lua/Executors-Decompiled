/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009287bc
 */

size_t FUN_009287bc(long param_1,void *param_2,ulong param_3,char *param_4)

{
  int iVar1;
  ulong uVar2;
  char *__src;
  undefined4 uVar3;
  long lVar4;
  undefined8 uVar5;
  code *pcVar6;
  size_t sVar7;
  size_t sVar8;
  long lVar9;
  size_t __n;
  long lVar10;
  
  sVar7 = *(size_t *)(param_1 + 0x1b0);
  if (sVar7 + 1 < 2) {
    return sVar7;
  }
  if (sVar7 - 0x10000000 < 2) {
    return sVar7;
  }
  if ((*(long *)(param_1 + 0x70) != -1) &&
     (sVar7 = 0, *(long *)(param_1 + 0x70) <= *(long *)(param_1 + 0x88))) goto LAB_00928aa0;
  if (*(int *)(param_1 + 0x10) == 2) {
    if (*(FILE **)(param_1 + 0x40) != (FILE *)0x0) {
      iVar1 = feof(*(FILE **)(param_1 + 0x40));
      sVar7 = 0;
      if (iVar1 != 0) goto LAB_00928aa0;
    }
LAB_00928a28:
    pcVar6 = *(code **)(param_1 + 0x20);
    if (pcVar6 == (code *)0x0) {
      sVar7 = 0;
      goto LAB_00928aa0;
    }
    if ((*(byte *)(param_1 + 0x14) >> 2 & 1) == 0) {
      if (*param_4 != '\0') {
        return 0xfffffffffffffffe;
      }
      *param_4 = '\x01';
    }
    sVar7 = (*pcVar6)(param_2,1,param_3,*(undefined8 *)(param_1 + 0x38));
  }
  else {
    if (*(int *)(param_1 + 0x10) != 4) goto LAB_00928a28;
    sVar7 = 0;
    if (param_3 == 0) goto LAB_00928aa0;
    lVar10 = *(long *)(param_1 + 0x38);
    sVar8 = sVar7;
    do {
      __n = 0;
      if (8 < *(uint *)(lVar10 + 0x48)) goto switchD_00928880_caseD_1;
      lVar9 = *(long *)(lVar10 + 0x50);
      sVar7 = sVar8;
      switch(*(uint *)(lVar10 + 0x48)) {
      case 0:
      case 4:
        __n = 0;
        *(undefined4 *)(lVar10 + 0x48) = 5;
        *(undefined8 *)(lVar10 + 0x50) = *(undefined8 *)(lVar10 + 8);
        *(undefined8 *)(lVar10 + 0x58) = 2;
        break;
      case 5:
        uVar2 = FUN_00963a7c(*(undefined8 *)(lVar10 + 0x58));
        if (uVar2 < 4) {
          __n = param_3;
          if (4 - uVar2 <= param_3) {
            __n = 4 - uVar2;
          }
          memcpy(param_2,&UNK_002d2f93 + uVar2,__n);
          *(size_t *)(lVar10 + 0x58) = *(long *)(lVar10 + 0x58) + __n;
          if (__n != 0) break;
        }
        uVar3 = 6;
        goto LAB_009289f4;
      case 6:
        uVar2 = FUN_00963a7c(*(undefined8 *)(lVar10 + 0x58));
        if (lVar9 == 0) {
          if (uVar2 < 0x2e) goto LAB_0092896c;
          if (uVar2 - 0x2e < 4) {
            __src = "Unsupported HTTP/1 subversion in response" + uVar2 + 0x1e;
            lVar4 = 0x32;
            goto LAB_00928978;
          }
        }
        else {
          if (uVar2 < 0x2e) {
LAB_0092896c:
            __src = (char *)(lVar10 + 0x18 + uVar2);
            lVar4 = 0x2e;
          }
          else {
            if (1 < uVar2 - 0x2e) goto LAB_009289ec;
            __src = "Unexpected TYPE" + uVar2 + 1;
            lVar4 = 0x30;
          }
LAB_00928978:
          __n = param_3;
          if (lVar4 - uVar2 <= param_3) {
            __n = lVar4 - uVar2;
          }
          memcpy(param_2,__src,__n);
          *(size_t *)(lVar10 + 0x58) = __n + *(long *)(lVar10 + 0x58);
          if (__n != 0) break;
        }
LAB_009289ec:
        uVar3 = 7;
LAB_009289f4:
        __n = 0;
        *(undefined4 *)(lVar10 + 0x48) = uVar3;
        *(long *)(lVar10 + 0x50) = lVar9;
LAB_009289fc:
        *(undefined8 *)(lVar10 + 0x58) = 0;
        break;
      case 7:
        if (lVar9 == 0) {
          *(undefined4 *)(lVar10 + 0x48) = 8;
          __n = 0;
          *(undefined8 *)(lVar10 + 0x50) = 0;
          *(undefined8 *)(lVar10 + 0x58) = 0;
          break;
        }
        __n = FUN_00927320(lVar9,param_2,param_3,param_4);
        if (__n == 0) {
          uVar5 = *(undefined8 *)(lVar9 + 8);
          *(undefined4 *)(lVar10 + 0x48) = 5;
          *(undefined8 *)(lVar10 + 0x50) = uVar5;
          goto LAB_009289fc;
        }
        if ((1 < __n - 0x10000000) && (1 < __n + 2)) break;
        sVar7 = __n;
        if (sVar8 != 0) {
          sVar7 = sVar8;
        }
      case 8:
        goto switchD_00928880_caseD_8;
      }
switchD_00928880_caseD_1:
      sVar7 = __n + sVar8;
      param_3 = param_3 - __n;
      param_2 = (void *)((long)param_2 + __n);
      sVar8 = sVar7;
    } while (param_3 != 0);
  }
switchD_00928880_caseD_8:
  if ((1 < sVar7 + 1) && (1 < sVar7 - 0x10000000)) {
    if (sVar7 == 0xfffffffffffffffe) {
      return 0xfffffffffffffffe;
    }
    *(size_t *)(param_1 + 0x88) = *(long *)(param_1 + 0x88) + sVar7;
  }
LAB_00928aa0:
  *(size_t *)(param_1 + 0x1b0) = sVar7;
  return sVar7;
}

