/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00917358
 */

ulong FUN_00917358(long param_1,char *param_2,uint param_3,ulong param_4,undefined8 *param_5)

{
  ushort uVar1;
  long lVar2;
  int iVar3;
  uint uVar4;
  size_t sVar5;
  char *pcVar6;
  char *pcVar7;
  undefined8 uVar8;
  char *pcVar9;
  undefined8 *puVar10;
  char cVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  undefined8 uStack_90;
  char *local_88;
  undefined4 local_7c;
  undefined8 local_78;
  undefined8 uStack_70;
  long local_68;
  
  puVar10 = &uStack_90;
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_88 = (char *)0x0;
  lVar14 = *(long *)(param_1 + 0x20);
  sVar5 = strlen(param_2);
  if ((6 < sVar5) &&
     ((iVar3 = curl_strequal(param_2 + (sVar5 - 6),".onion"), iVar3 != 0 ||
      (iVar3 = curl_strequal(param_2 + (sVar5 - 7),".onion."), iVar3 != 0)))) {
    pcVar6 = (char *)FUN_00904b80(param_1,"Not resolving .onion address (RFC 7686)");
    uVar13 = 0xffffffff;
    goto LAB_00917808;
  }
  *param_5 = 0;
  *(ulong *)(lVar14 + 0x3a0) = *(ulong *)(lVar14 + 0x3a0) & 0xfffffffffdffffff;
  if (*(long *)(param_1 + 0xd0) != 0) {
    FUN_0093f628(param_1,3,2);
  }
  pcVar7 = (char *)FUN_00916d64(param_1,param_2,param_3);
  pcVar6 = pcVar7;
  local_88 = pcVar7;
  if (pcVar7 == (char *)0x0) {
    uVar13 = 0xffffffff;
    lVar12 = *(long *)(param_1 + 0xd0);
  }
  else {
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      pcVar6 = (char *)FUN_00904c98(param_1,"Hostname %s was found in DNS cache",param_2);
    }
    uVar13 = 0;
    *(long *)(pcVar7 + 0x10) = *(long *)(pcVar7 + 0x10) + 1;
    lVar12 = *(long *)(param_1 + 0xd0);
  }
  if (lVar12 != 0) {
    pcVar6 = (char *)FUN_0093f680(param_1,3);
  }
  if (pcVar7 == (char *)0x0) {
    uStack_90._4_4_ = 0;
    if (*(long *)(param_1 + 0xa28) != 0) {
      FUN_0092f198(param_1,1);
      iVar3 = (**(code **)(param_1 + 0xa28))
                        (*(undefined8 *)(param_1 + 0xda8),0,*(undefined8 *)(param_1 + 0xa30));
      pcVar6 = (char *)FUN_0092f198(param_1,0);
      if (iVar3 == 0) goto LAB_009174e8;
LAB_00917804:
      uVar13 = 0xffffffff;
      goto LAB_00917808;
    }
LAB_009174e8:
    iVar3 = inet_pton(2,param_2,&uStack_90);
    if (iVar3 < 1) {
      uVar4 = inet_pton(10,param_2,&local_78);
      if (0 < (int)uVar4) {
        uVar8 = 10;
        puVar10 = &local_78;
        goto LAB_0091752c;
      }
      if (*(char *)(lVar14 + 0x573) == '\x02') {
        cVar11 = *(char *)(*(long *)(param_1 + 0xc0) + 0x230);
        if (cVar11 == '\0') {
          iVar3 = socket(10,2,0);
          if (iVar3 == -1) {
            cVar11 = '\x01';
            uVar4 = 0xffffffff;
          }
          else {
            uVar4 = close(iVar3);
            cVar11 = '\x02';
          }
          *(char *)(*(long *)(param_1 + 0xc0) + 0x230) = cVar11;
        }
        pcVar6 = (char *)(ulong)uVar4;
        if (cVar11 != '\x02') goto LAB_00917804;
      }
      iVar3 = curl_strequal(param_2,"localhost");
      if ((iVar3 == 0) &&
         ((sVar5 = strlen(param_2), sVar5 < 10 ||
          (iVar3 = curl_strnequal(".localhost",param_2 + (sVar5 - 10),10), iVar3 == 0)))) {
        if (((param_4 & 1) == 0) || ((*(byte *)(param_1 + 0xa88) & 1) == 0)) {
          pcVar6 = (char *)FUN_0091833c(param_1,lVar14);
          if (((ulong)pcVar6 & 1) == 0) goto LAB_00917804;
          pcVar6 = (char *)thunk_FUN_0090ee24(param_1,param_2,param_3,(long)&uStack_90 + 4);
          pcVar7 = pcVar6;
        }
        else {
          pcVar6 = (char *)FUN_00911368(param_1,param_2,param_3,(long)&uStack_90 + 4);
          pcVar7 = pcVar6;
        }
joined_r0x0091772c:
        if (pcVar7 == (char *)0x0) goto LAB_009177bc;
        goto LAB_00917540;
      }
      sVar5 = strlen(param_2);
      uVar4 = inet_pton(2,"127.0.0.1",&local_7c);
      pcVar6 = (char *)(ulong)uVar4;
      if (0 < (int)uVar4) {
        pcVar7 = (char *)(*(code *)PTR_calloc_00cc4690)(1,sVar5 + 0x41);
        pcVar6 = (char *)0x0;
        if (pcVar7 != (char *)0x0) {
          uVar1 = (ushort)(param_3 >> 8) & 0xff | (ushort)((param_3 & 0xff00ff) << 8);
          pcVar7[0x10] = '\x10';
          pcVar7[0x11] = '\0';
          pcVar7[0x12] = '\0';
          pcVar7[0x13] = '\0';
          pcVar7[8] = '\x01';
          pcVar7[9] = '\0';
          pcVar7[10] = '\0';
          pcVar7[0xb] = '\0';
          pcVar7[0xc] = '\x06';
          pcVar7[0xd] = '\0';
          pcVar7[0xe] = '\0';
          pcVar7[0xf] = '\0';
          pcVar7[0] = '\0';
          pcVar7[1] = '\0';
          pcVar7[2] = '\0';
          pcVar7[3] = '\0';
          pcVar7[4] = '\x02';
          pcVar7[5] = '\0';
          pcVar7[6] = '\0';
          pcVar7[7] = '\0';
          pcVar6 = pcVar7 + 0x30;
          pcVar6[0] = '\x02';
          pcVar6[1] = '\0';
          *(ushort *)(pcVar7 + 0x32) = uVar1;
          *(undefined4 *)(pcVar7 + 0x34) = local_7c;
          *(char **)(pcVar7 + 0x18) = pcVar7 + 0x40;
          *(char **)(pcVar7 + 0x20) = pcVar6;
          pcVar7[0x38] = '\0';
          pcVar7[0x39] = '\0';
          pcVar7[0x3a] = '\0';
          pcVar7[0x3b] = '\0';
          pcVar7[0x3c] = '\0';
          pcVar7[0x3d] = '\0';
          pcVar7[0x3e] = '\0';
          pcVar7[0x3f] = '\0';
          strcpy(pcVar7 + 0x40,param_2);
          sVar5 = strlen(param_2);
          pcVar9 = (char *)(*(code *)PTR_calloc_00cc4690)(1,sVar5 + 0x4d);
          pcVar6 = (char *)0x0;
          if (pcVar9 != (char *)0x0) {
            inet_pton(10,"::1",&local_78);
            pcVar9[0x10] = '\x1c';
            pcVar9[0x11] = '\0';
            pcVar9[0x12] = '\0';
            pcVar9[0x13] = '\0';
            pcVar9[8] = '\x01';
            pcVar9[9] = '\0';
            pcVar9[10] = '\0';
            pcVar9[0xb] = '\0';
            pcVar9[0xc] = '\x06';
            pcVar9[0xd] = '\0';
            pcVar9[0xe] = '\0';
            pcVar9[0xf] = '\0';
            pcVar9[0] = '\0';
            pcVar9[1] = '\0';
            pcVar9[2] = '\0';
            pcVar9[3] = '\0';
            pcVar9[4] = '\n';
            pcVar9[5] = '\0';
            pcVar9[6] = '\0';
            pcVar9[7] = '\0';
            pcVar6 = pcVar9 + 0x30;
            pcVar6[0] = '\n';
            pcVar6[1] = '\0';
            *(ushort *)(pcVar9 + 0x32) = uVar1;
            pcVar9[0x34] = '\0';
            pcVar9[0x35] = '\0';
            pcVar9[0x36] = '\0';
            pcVar9[0x37] = '\0';
            *(char **)(pcVar9 + 0x20) = pcVar6;
            pcVar9[0x28] = '\0';
            pcVar9[0x29] = '\0';
            pcVar9[0x2a] = '\0';
            pcVar9[0x2b] = '\0';
            pcVar9[0x2c] = '\0';
            pcVar9[0x2d] = '\0';
            pcVar9[0x2e] = '\0';
            pcVar9[0x2f] = '\0';
            pcVar9[0x48] = '\0';
            pcVar9[0x49] = '\0';
            pcVar9[0x4a] = '\0';
            pcVar9[0x4b] = '\0';
            *(undefined8 *)(pcVar9 + 0x40) = uStack_70;
            *(undefined8 *)(pcVar9 + 0x38) = local_78;
            *(char **)(pcVar9 + 0x18) = pcVar9 + 0x4c;
            pcVar6 = strcpy(pcVar9 + 0x4c,param_2);
            *(char **)(pcVar9 + 0x28) = pcVar7;
            pcVar7 = pcVar9;
          }
        }
        goto joined_r0x0091772c;
      }
LAB_009177bc:
      if (uStack_90._4_4_ != 0) {
        if ((*(byte *)(*(long *)(param_1 + 0x20) + 0x3a3) >> 1 & 1) == 0) {
          pcVar6 = (char *)FUN_0090ec74(param_1,&local_88);
        }
        else {
          pcVar6 = (char *)FUN_00911dc8(param_1,&local_88);
        }
        iVar3 = (int)pcVar6;
        if (local_88 != (char *)0x0) {
          pcVar6 = (char *)FUN_009178a8(param_1);
        }
        if (iVar3 != 0) goto LAB_00917804;
        uVar13 = (ulong)(local_88 == (char *)0x0);
      }
    }
    else {
      uVar8 = 2;
LAB_0091752c:
      pcVar7 = (char *)FUN_0090f5c8(uVar8,puVar10,param_2,param_3);
      pcVar6 = (char *)0x0;
      if (pcVar7 == (char *)0x0) goto LAB_00917804;
LAB_00917540:
      if (*(long *)(param_1 + 0xd0) != 0) {
        FUN_0093f628(param_1,3,2);
      }
      local_88 = (char *)FUN_00916f7c(param_1,pcVar7,param_2,0,param_3);
      if (*(long *)(param_1 + 0xd0) != 0) {
        FUN_0093f680(param_1,3);
      }
      if (local_88 == (char *)0x0) {
        pcVar6 = (char *)FUN_0090f270(pcVar7);
      }
      else {
        pcVar6 = (char *)FUN_009178a8(param_1);
        uVar13 = 0;
      }
    }
    pcVar7 = local_88;
  }
  *param_5 = pcVar7;
LAB_00917808:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(pcVar6);
  }
  return uVar13;
}

