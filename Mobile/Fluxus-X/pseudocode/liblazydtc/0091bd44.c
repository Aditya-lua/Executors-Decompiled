/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091bd44
 */

ulong FUN_0091bd44(long param_1,long param_2,undefined8 param_3)

{
  undefined1 *puVar1;
  bool bVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  long *plVar6;
  size_t sVar7;
  size_t sVar8;
  long lVar9;
  char *pcVar10;
  char *__s;
  ulong uVar11;
  long *plVar12;
  
  if (*(long *)(param_1 + 0x808) == 0) {
    lVar9 = 0;
    lVar5 = *(long *)(param_1 + 0xa90);
LAB_0091bd9c:
    if (lVar5 == 0) {
      return 0;
    }
  }
  else {
    lVar5 = FUN_00941e8c(param_1,"Cookie",6);
    lVar9 = 0;
    if (lVar5 != 0) {
      lVar5 = *(long *)(param_1 + 0xa90);
      goto LAB_0091bd9c;
    }
    lVar9 = *(long *)(param_1 + 0x808);
    lVar5 = *(long *)(param_1 + 0xa90);
    if (lVar9 == 0) goto LAB_0091bd9c;
  }
  if ((lVar5 == 0) || ((*(byte *)(param_1 + 0x131d) >> 3 & 1) == 0)) {
LAB_0091bf18:
    iVar3 = 0;
    uVar11 = 0;
  }
  else {
    pcVar10 = *(char **)(param_1 + 0x12d8);
    if (pcVar10 == (char *)0x0) {
      pcVar10 = *(char **)(param_2 + 0x50);
    }
    if ((((*(byte *)(*(long *)(param_2 + 0x3a8) + 0x8c) >> 1 & 1) == 0) &&
        (iVar3 = curl_strequal("localhost",pcVar10), iVar3 == 0)) &&
       (iVar3 = strcmp(pcVar10,"127.0.0.1"), iVar3 != 0)) {
      iVar3 = strcmp(pcVar10,"::1");
      bVar2 = iVar3 == 0;
    }
    else {
      bVar2 = true;
    }
    FUN_0093f628(param_1,2,2);
    plVar6 = (long *)FUN_009144b4(param_1,*(undefined8 *)(param_1 + 0xa90),pcVar10,
                                  *(undefined8 *)(param_1 + 0x11a8),bVar2);
    FUN_0093f680(param_1,2);
    if (plVar6 == (long *)0x0) goto LAB_0091bf18;
    iVar3 = 0;
    lVar5 = 8;
    plVar12 = plVar6;
    do {
      pcVar10 = (char *)plVar12[2];
      if (pcVar10 != (char *)0x0) {
        if (iVar3 == 0) {
          uVar4 = FUN_009045fc(param_3,"Cookie: ",8);
          if (uVar4 == 0) {
            pcVar10 = (char *)plVar12[2];
            goto LAB_0091be90;
          }
          iVar3 = 0;
        }
        else {
LAB_0091be90:
          __s = (char *)plVar12[1];
          sVar7 = strlen(__s);
          sVar8 = strlen(pcVar10);
          uVar11 = sVar7 + sVar8 + lVar5 + 1;
          if (0xffe < uVar11 >> 1) {
            if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
               ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_1,"Restricted outgoing cookies due to header size, \'%s\' not sent"
                           ,__s);
            }
            uVar11 = 0;
            bVar2 = true;
            goto LAB_0091c050;
          }
          puVar1 = &DAT_002baf99;
          if (iVar3 == 0) {
            puVar1 = &DAT_002ab32c;
          }
          uVar4 = FUN_009048cc(param_3,"%s%s=%s",puVar1,__s,pcVar10);
          if (uVar4 == 0) {
            lVar5 = uVar11 + (ulong)(iVar3 != 0) * 2;
            iVar3 = iVar3 + 1;
            goto LAB_0091bf04;
          }
        }
        uVar11 = (ulong)uVar4;
        goto LAB_0091c04c;
      }
LAB_0091bf04:
      plVar12 = (long *)*plVar12;
    } while (plVar12 != (long *)0x0);
    uVar11 = 0;
LAB_0091c04c:
    bVar2 = false;
LAB_0091c050:
    FUN_00914b48(plVar6);
    if (bVar2) goto LAB_0091bf68;
  }
  if ((lVar9 != 0) && ((int)uVar11 == 0)) {
    if (iVar3 == 0) {
      uVar4 = FUN_009045fc(param_3,"Cookie: ",8);
      if (uVar4 != 0) {
        return (ulong)uVar4;
      }
    }
    puVar1 = &DAT_002baf99;
    if (iVar3 == 0) {
      puVar1 = &DAT_002ab32c;
    }
    uVar11 = FUN_009048cc(param_3,&DAT_002a368e,puVar1,lVar9);
    uVar11 = uVar11 & 0xffffffff;
    iVar3 = iVar3 + 1;
  }
LAB_0091bf68:
  if ((iVar3 == 0) || ((int)uVar11 != 0)) {
    return uVar11;
  }
  uVar11 = FUN_009045fc(param_3,&DAT_002b917a,2);
  return uVar11;
}

