/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091a178
 */

int FUN_0091a178(long param_1,long param_2,long param_3,undefined8 param_4,undefined8 param_5,
                uint param_6)

{
  long lVar1;
  long lVar2;
  undefined1 *puVar3;
  char *pcVar4;
  undefined1 *puVar5;
  long lVar6;
  bool bVar7;
  int iVar8;
  size_t sVar9;
  undefined8 uVar10;
  byte bVar11;
  uint uVar12;
  long lVar13;
  char *pcVar14;
  long *plVar15;
  long local_68;
  long lStack_60;
  long local_58;
  
  lVar6 = tpidr_el0;
  local_58 = *(long *)(lVar6 + 0x28);
  lVar13 = *(long *)(param_3 + 8);
  pcVar14 = (char *)0x0;
  if (lVar13 < 8) {
    if (lVar13 != 1) {
      if (lVar13 != 2) goto LAB_0091a408;
      iVar8 = FUN_00924ab4(param_1,param_6 & 1,param_4,param_5);
      if (iVar8 != 0) goto LAB_0091a510;
      pcVar14 = "Digest";
      goto LAB_0091a404;
    }
    if ((param_6 & 1) == 0) {
      if (*(long *)(param_1 + 0x12f0) == 0) {
        pcVar14 = (char *)0x0;
      }
      else {
        lVar13 = FUN_00941e8c(param_1,"Authorization",0xd);
        pcVar14 = (char *)0x0;
        if (lVar13 == 0) goto LAB_0091a2e4;
      }
LAB_0091a3f8:
      *(byte *)(param_3 + 0x18) = *(byte *)(param_3 + 0x18) | 1;
      goto LAB_0091a404;
    }
    pcVar14 = (char *)0x0;
    uVar12 = (uint)*(undefined8 *)(param_2 + 0x3a0);
    if ((uVar12 >> 2 & 1) == 0) goto LAB_0091a3f8;
    if (((uVar12 >> 5 & 1) == 0) || ((*(byte *)(param_1 + 0xa82) >> 3 & 1) == 0)) {
      plVar15 = *(long **)(param_1 + 0x340);
    }
    else {
      plVar15 = *(long **)(param_1 + 0x6c0);
    }
    for (; plVar15 != (long *)0x0; plVar15 = (long *)plVar15[1]) {
      iVar8 = curl_strnequal(*plVar15,"Proxy-authorization",0x13);
      if ((iVar8 != 0) && ((*(byte *)(*plVar15 + 0x13) & 0xfe) == 0x3a)) {
        pcVar14 = (char *)0x0;
        if (*plVar15 != 0) goto LAB_0091a3f8;
        break;
      }
    }
LAB_0091a2e4:
    bVar7 = (param_6 & 1) == 0;
    local_68 = 0;
    lStack_60 = 0;
    lVar13 = 0x1300;
    if (bVar7) {
      lVar13 = 0x12b8;
    }
    lVar1 = 0x1308;
    if (bVar7) {
      lVar1 = 0x12f0;
    }
    lVar2 = 0x1310;
    if (bVar7) {
      lVar2 = 0x12f8;
    }
    puVar5 = &DAT_002ab32c;
    if (*(undefined1 **)(param_1 + lVar1) != (undefined1 *)0x0) {
      puVar5 = *(undefined1 **)(param_1 + lVar1);
    }
    puVar3 = &DAT_002ab32c;
    if (*(undefined1 **)(param_1 + lVar2) != (undefined1 *)0x0) {
      puVar3 = *(undefined1 **)(param_1 + lVar2);
    }
    pcVar14 = (char *)curl_maprintf("%s:%s",puVar5,puVar3);
    if (pcVar14 != (char *)0x0) {
      sVar9 = strlen(pcVar14);
      iVar8 = FUN_0091e888(pcVar14,sVar9,&local_68,&lStack_60);
      if (iVar8 == 0) {
        if (local_68 == 0) {
          iVar8 = 9;
        }
        else {
          (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + lVar13));
          pcVar4 = "Proxy-";
          if ((param_6 & 1) == 0) {
            pcVar4 = "";
          }
          uVar10 = curl_maprintf("%sAuthorization: Basic %s\r\n",pcVar4,local_68);
          *(undefined8 *)(param_1 + lVar13) = uVar10;
          (*(code *)PTR_free_00cc4678)(local_68);
          iVar8 = 0x1b;
          if (*(long *)(param_1 + lVar13) != 0) {
            iVar8 = 0;
          }
        }
      }
      (*(code *)PTR_free_00cc4678)(pcVar14);
      if (iVar8 != 0) goto LAB_0091a510;
      pcVar14 = "Basic";
      goto LAB_0091a3f8;
    }
LAB_0091a540:
    iVar8 = 0x1b;
  }
  else {
    if (lVar13 == 8) {
      iVar8 = FUN_00924f0c(param_1,param_6 & 1);
      if (iVar8 != 0) goto LAB_0091a510;
      pcVar14 = "NTLM";
LAB_0091a404:
      lVar13 = *(long *)(param_3 + 8);
    }
    else if (lVar13 == 0x80) {
      iVar8 = FUN_00921ec4(param_1,param_6 & 1);
      if (iVar8 != 0) goto LAB_0091a510;
      pcVar14 = "AWS_SIGV4";
      goto LAB_0091a404;
    }
LAB_0091a408:
    if (lVar13 == 0x40) {
      if ((((param_6 & 1) == 0) && (*(long *)(param_1 + 0x918) != 0)) &&
         (lVar13 = FUN_00941e8c(param_1,"Authorization",0xd), lVar13 == 0)) {
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12b8));
        lVar13 = curl_maprintf("Authorization: Bearer %s\r\n",*(undefined8 *)(param_1 + 0x918));
        *(long *)(param_1 + 0x12b8) = lVar13;
        if (lVar13 == 0) goto LAB_0091a540;
        pcVar14 = "Bearer";
      }
      *(byte *)(param_3 + 0x18) = *(byte *)(param_3 + 0x18) | 1;
    }
    if (pcVar14 == (char *)0x0) {
      bVar11 = *(byte *)(param_3 + 0x18) & 0xfd;
    }
    else {
      if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        bVar7 = (param_6 & 1) == 0;
        lVar13 = 0x1308;
        if (bVar7) {
          lVar13 = 0x12f0;
        }
        pcVar4 = "Proxy";
        if (bVar7) {
          pcVar4 = "Server";
        }
        puVar5 = &DAT_002ab32c;
        if (*(undefined1 **)(param_1 + lVar13) != (undefined1 *)0x0) {
          puVar5 = *(undefined1 **)(param_1 + lVar13);
        }
        FUN_00904c98(param_1,"%s auth using %s with user \'%s\'",pcVar4,pcVar14,puVar5);
      }
      bVar11 = ((*(byte *)(param_3 + 0x18) & 1) << 1 | *(byte *)(param_3 + 0x18) & 0xfd) ^ 2;
    }
    iVar8 = 0;
    *(byte *)(param_3 + 0x18) = bVar11;
  }
LAB_0091a510:
  if (*(long *)(lVar6 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar8;
}

