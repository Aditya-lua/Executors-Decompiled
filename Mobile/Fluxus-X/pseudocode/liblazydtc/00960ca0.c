/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00960ca0
 */

int FUN_00960ca0(long *param_1,void *param_2,size_t param_3,uint param_4,undefined8 param_5,
                ulong param_6)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  int iVar6;
  void *pvVar7;
  long lVar8;
  char *pcVar9;
  char *pcVar10;
  int *piVar11;
  ulong uVar12;
  byte *__nptr;
  size_t sVar13;
  size_t sVar14;
  long lVar15;
  long *plVar16;
  uint uVar17;
  long lVar18;
  long local_88;
  char *local_80;
  char *local_78;
  ulong uStack_70;
  ulong local_68;
  ulong uStack_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_80 = (char *)0x0;
  local_78 = (char *)0x0;
  local_88 = 0;
  pvVar7 = memchr(param_2,0x40,param_3);
  if (pvVar7 == (void *)0x0) {
    iVar5 = 0;
    pcVar9 = (char *)0x0;
LAB_00960d58:
    (*(code *)PTR_free_00cc4678)(pcVar9);
    (*(code *)PTR_free_00cc4678)(local_80);
    (*(code *)PTR_free_00cc4678)(local_88);
    lVar18 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    param_1[3] = 0;
    if (iVar5 != 0) goto LAB_00961204;
  }
  else {
    if (*param_1 == 0) {
      lVar18 = (long)pvVar7 + (1 - (long)param_2);
      lVar15 = lVar18 + -1;
LAB_00960d38:
      plVar16 = (long *)0x0;
    }
    else {
      lVar8 = FUN_00946e30();
      lVar18 = (long)pvVar7 + (1 - (long)param_2);
      lVar15 = lVar18 + -1;
      if ((lVar8 == 0) || ((*(byte *)(lVar8 + 0x95) >> 2 & 1) == 0)) goto LAB_00960d38;
      plVar16 = &local_88;
    }
    iVar5 = FUN_00946fb0(param_2,lVar15,&local_78,&local_80,plVar16);
    pcVar9 = local_78;
    if (iVar5 != 0) {
      iVar5 = 0x17;
      goto LAB_00960d58;
    }
    if (local_78 != (char *)0x0) {
      if ((param_4 >> 5 & 1) != 0) {
        iVar5 = 8;
        goto LAB_00960d58;
      }
      (*(code *)PTR_free_00cc4678)(param_1[1]);
      param_1[1] = (long)local_78;
    }
    if (local_80 != (char *)0x0) {
      (*(code *)PTR_free_00cc4678)(param_1[2]);
      param_1[2] = (long)local_80;
    }
    if (local_88 != 0) {
      (*(code *)PTR_free_00cc4678)(param_1[3]);
      param_1[3] = local_88;
    }
  }
  iVar6 = FUN_009045fc(param_5,(long)param_2 + lVar18,param_3 - lVar18);
  if (iVar6 != 0) {
LAB_00960dac:
    iVar5 = 0x1f;
    if (iVar6 != 100) {
      iVar5 = 7;
    }
    goto LAB_00961204;
  }
  pcVar9 = (char *)FUN_00904974(param_5);
  if (*pcVar9 == '[') {
    pcVar10 = strchr(pcVar9,0x5d);
    if (pcVar10 == (char *)0x0) {
      iVar5 = 0x16;
      goto LAB_00961204;
    }
    pcVar10 = pcVar10 + 1;
    if (*pcVar10 != '\0') {
      if (*pcVar10 == ':') goto LAB_00960e90;
      goto LAB_00960f9c;
    }
  }
  else {
    pcVar10 = strchr(pcVar9,0x3a);
    if (pcVar10 != (char *)0x0) {
LAB_00960e90:
      local_78 = (char *)0x0;
      FUN_0090498c(param_5,(long)pcVar10 - (long)pcVar9);
      uVar17 = (uint)(byte)pcVar10[1];
      if (uVar17 == 0) {
        if ((param_6 & 1) != 0) goto LAB_00960f40;
      }
      else if (uVar17 - 0x30 < 10) {
        piVar11 = (int *)__errno();
        *piVar11 = 0;
        uVar12 = strtoul(pcVar10 + 1,&local_78,10);
        if (((uVar12 >> 0x10 == 0) && (*piVar11 == 0)) && (*local_78 == '\0')) {
          *(short *)(param_1 + 10) = (short)uVar12;
          (*(code *)PTR_free_00cc4678)(param_1[6]);
          lVar15 = curl_maprintf(&DAT_002d11bf,uVar12);
          param_1[6] = lVar15;
          if (lVar15 == 0) {
LAB_00960f20:
            iVar5 = 7;
            goto LAB_00961204;
          }
          goto LAB_00960f40;
        }
      }
LAB_00960f9c:
      iVar5 = 4;
      goto LAB_00961204;
    }
  }
LAB_00960f40:
  lVar15 = FUN_00904984(param_5);
  if (lVar15 == 0) {
LAB_00961200:
    iVar5 = 0xe;
  }
  else {
    __nptr = (byte *)FUN_00904974(param_5);
    uStack_60 = 0;
    local_68 = 0;
    uStack_70 = 0;
    local_78 = (char *)0x0;
    if (*__nptr == 0x5b) {
      pcVar9 = (char *)FUN_00904974(param_5);
      sVar13 = FUN_00904984(param_5);
    }
    else {
      piVar11 = (int *)__errno();
      *piVar11 = 0;
      local_80 = (char *)0x0;
      if (*__nptr - 0x30 < 10) {
        uVar12 = 0;
LAB_00960fcc:
        local_80 = (char *)0x0;
        pcVar10 = (char *)strtoul((char *)__nptr,&local_80,0);
        pcVar9 = local_80;
        if (((ulong)pcVar10 >> 0x20 != 0) || (*piVar11 != 0)) goto LAB_00961150;
        (&local_78)[uVar12] = pcVar10;
        uVar4 = uStack_60;
        uVar3 = local_68;
        uVar2 = uStack_70;
        pcVar10 = local_78;
        if (*local_80 == '.') {
          if (uVar12 != 3) goto code_r0x00961008;
          goto LAB_00961150;
        }
        if (*local_80 != '\0') goto LAB_00961150;
        switch(uVar12 & 0x7fffffff) {
        case 0:
          FUN_0090456c(param_5);
          uVar17 = (uint)local_78;
          iVar5 = FUN_009048cc(param_5,"%u.%u.%u.%u",(ulong)local_78 >> 0x18,uVar17 >> 0x10 & 0xff,
                               uVar17 >> 8 & 0xff,uVar17 & 0xff);
          break;
        case 1:
          if (((char *)0xff < local_78) || (uStack_70 >> 0x18 != 0)) goto LAB_00961150;
          FUN_0090456c(param_5);
          uVar17 = (uint)uVar2;
          iVar5 = FUN_009048cc(param_5,"%u.%u.%u.%u",(ulong)pcVar10 & 0xffffffff,
                               uVar17 >> 0x10 & 0xff,uVar17 >> 8 & 0xff,uVar17 & 0xff);
          break;
        case 2:
          if (((local_78 < (char *)0x100) && (uStack_70 < 0x100)) && (local_68 >> 0x10 == 0)) {
            FUN_0090456c(param_5);
            uVar17 = (uint)uVar3;
            iVar5 = FUN_009048cc(param_5,"%u.%u.%u.%u",(ulong)pcVar10 & 0xffffffff,
                                 uVar2 & 0xffffffff,uVar17 >> 8 & 0xff,uVar17 & 0xff);
            goto joined_r0x0096127c;
          }
          goto LAB_00961150;
        case 3:
          if (((local_78 < (char *)0x100) && (uStack_70 < 0x100)) &&
             ((local_68 < 0x100 && (uStack_60 < 0x100)))) {
            FUN_0090456c(param_5);
            iVar5 = FUN_009048cc(param_5,"%u.%u.%u.%u",(ulong)pcVar10 & 0xffffffff,
                                 uVar2 & 0xffffffff,uVar3 & 0xffffffff,uVar4 & 0xffffffff);
joined_r0x0096127c:
            if (iVar5 == 0) goto switchD_00961048_default;
            goto LAB_00960f20;
          }
          goto LAB_00961150;
        default:
          goto switchD_00961048_default;
        }
        if (iVar5 != 0) goto LAB_00960f20;
switchD_00961048_default:
        iVar5 = 0;
        goto LAB_00961204;
      }
LAB_00961150:
      pcVar9 = (char *)FUN_00904974(param_5);
      pcVar10 = strchr(pcVar9,0x25);
      if (pcVar10 != (char *)0x0) {
        iVar5 = FUN_0091583c(pcVar9,0,&local_80,&local_78,3);
        if (iVar5 != 0) {
          iVar5 = 0x15;
          goto LAB_00961204;
        }
        FUN_0090456c(param_5);
        iVar6 = FUN_009045fc(param_5,local_80,local_78);
        (*(code *)PTR_free_00cc4678)(local_80);
        if (iVar6 != 0) goto LAB_00960dac;
      }
      pcVar9 = (char *)FUN_00904974(param_5);
      sVar13 = FUN_00904984(param_5);
      if (sVar13 == 0) goto LAB_00961200;
      if (*pcVar9 != '[') {
        sVar14 = strcspn(pcVar9," \r\n\t/:#?!@{}[]\\$\'\"^`*<>=;,+&()%");
        iVar5 = 0;
        if (sVar14 != sVar13) {
          iVar5 = 0x15;
        }
        goto LAB_00961204;
      }
    }
    iVar5 = FUN_009636a0(param_1,pcVar9,sVar13);
  }
LAB_00961204:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
code_r0x00961008:
  local_80 = (char *)0x0;
  __nptr = (byte *)(pcVar9 + 1);
  uVar12 = uVar12 + 1;
  if (9 < *__nptr - 0x30) goto LAB_00961150;
  goto LAB_00960fcc;
}

