/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00952adc
 */

int FUN_00952adc(long param_1,int param_2)

{
  long lVar1;
  ushort uVar2;
  undefined2 uVar3;
  uint uVar4;
  uint uVar5;
  undefined4 uVar6;
  int iVar7;
  size_t sVar8;
  char *__s;
  char *pcVar9;
  undefined4 *puVar10;
  int *piVar11;
  undefined8 uVar12;
  undefined *puVar13;
  undefined4 uVar14;
  char cVar15;
  long lVar16;
  uint uVar17;
  byte bVar18;
  char *pcVar19;
  long lVar20;
  uint uVar21;
  long *local_6b0;
  socklen_t local_6a4;
  int local_6a0;
  char local_69c [68];
  char acStack_658 [52];
  undefined1 auStack_624 [256];
  char acStack_524 [1028];
  sockaddr local_120 [8];
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined7 uStack_80;
  undefined1 local_79;
  undefined7 uStack_78;
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  lVar16 = *(long *)(param_1 + 0x20);
  local_6a0 = -1;
  uStack_78 = 0;
  uStack_80 = 0;
  local_79 = 0;
  uStack_98 = 0;
  local_a0 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  pcVar19 = *(char **)(param_1 + 0x858);
  local_6b0 = (long *)0x0;
  if (pcVar19 == (char *)0x0) {
    uVar17 = 0;
    uVar21 = 0;
LAB_00952ce0:
    local_6a4 = 0x80;
    iVar7 = getsockname(*(int *)(lVar16 + 0x220),local_120,&local_6a4);
    if (iVar7 != 0) {
LAB_00952d00:
      piVar11 = (int *)__errno();
      iVar7 = *piVar11;
      goto LAB_00952d08;
    }
    pcVar19 = local_120[0].sa_data + 6;
    if (local_120[0].sa_family != 10) {
      pcVar19 = (char *)((ulong)local_120 | 4);
    }
    pcVar9 = acStack_524;
    pcVar19 = inet_ntop((uint)local_120[0].sa_family,pcVar19,acStack_524,0x401);
    if (pcVar19 != (char *)0x0) {
      bVar18 = 0;
LAB_00952d54:
      iVar7 = FUN_00917358(param_1,pcVar9,0,0,&local_6b0);
      if (iVar7 == 1) {
        FUN_0090ebcc(param_1,&local_6b0);
      }
      if (local_6b0 != (long *)0x0) {
        lVar20 = *local_6b0;
        FUN_00917b54(param_1);
        if (lVar20 != 0) {
          while (iVar7 = FUN_0090bfe8(param_1,lVar20,0,*(undefined1 *)(lVar16 + 0x572),&local_6a0),
                iVar7 != 0) {
            lVar20 = *(long *)(lVar20 + 0x28);
            if (lVar20 == 0) goto LAB_00952dc0;
          }
          if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
              ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
              )) && (0 < DAT_00cc46c0)) {
            if (*(long *)(param_1 + 0x20) == 0) {
              puVar13 = &DAT_002c11b5;
            }
            else {
              puVar13 = (&PTR_DAT_00c508c0)[*(byte *)(*(long *)(param_1 + 0x20) + 0x536)];
            }
            FUN_00905258(param_1,"[%s] ftp_state_use_port(), opened socket",puVar13);
          }
          memcpy(local_120,*(void **)(lVar20 + 0x20),(ulong)*(uint *)(lVar20 + 0x10));
          local_6a4 = *(socklen_t *)(lVar20 + 0x10);
          if ((uVar17 & 0xffff) <= (uVar21 & 0xffff)) goto LAB_00952f94;
LAB_0095306c:
          FUN_00904b80(param_1,"bind() failed, we ran out of ports");
          goto LAB_00952df8;
        }
      }
      pcVar19 = "failed to resolve the address provided to PORT: %s";
      goto LAB_00952df4;
    }
  }
  else {
    sVar8 = strlen(pcVar19);
    uVar17 = 0;
    uVar21 = 0;
    if (sVar8 < 2) goto LAB_00952ce0;
    if (*pcVar19 == ':') {
      sVar8 = 0;
      pcVar9 = (char *)0x0;
      __s = pcVar19;
LAB_00952bdc:
      pcVar19 = pcVar9;
      pcVar9 = strchr(__s,0x3a);
      if (pcVar9 == (char *)0x0) {
        uVar4 = 0;
        uVar5 = 0;
      }
      else {
        strtoul(pcVar9 + 1,(char **)0x0,10);
        uVar4 = FUN_00963a54();
        pcVar9 = strchr(pcVar9,0x2d);
        if (pcVar9 == (char *)0x0) {
          uVar5 = uVar4;
        }
        else {
          strtoul(pcVar9 + 1,(char **)0x0,10);
          uVar5 = FUN_00963a54();
        }
      }
    }
    else if (*pcVar19 == '[') {
      pcVar9 = pcVar19 + 1;
      __s = strchr(pcVar9,0x5d);
      if (__s != (char *)0x0) {
        sVar8 = (long)__s - (long)pcVar9;
        goto LAB_00952bdc;
      }
      sVar8 = 0;
      pcVar19 = (char *)0x0;
      uVar4 = 0;
      uVar5 = 0;
    }
    else {
      __s = strchr(pcVar19,0x3a);
      if (__s == (char *)0x0) {
        sVar8 = strlen(pcVar19);
        uVar4 = 0;
        uVar5 = 0;
      }
      else {
        sVar8 = (long)__s - (long)pcVar19;
        iVar7 = inet_pton(10,pcVar19,local_120[0].sa_data + 6);
        uVar4 = 0;
        uVar5 = 0;
        pcVar9 = pcVar19;
        if (iVar7 != 1) goto LAB_00952bdc;
      }
    }
    uVar17 = 0;
    if ((uVar4 & 0xffff) <= (uVar5 & 0xffff)) {
      uVar17 = uVar4;
    }
    uVar21 = 0;
    if ((uVar4 & 0xffff) <= (uVar5 & 0xffff)) {
      uVar21 = uVar5;
    }
    if (sVar8 == 0) goto LAB_00952ce0;
    if (sVar8 < 0x32) {
      pcVar9 = acStack_658;
      memcpy(acStack_658,pcVar19,sVar8);
      pcVar9[sVar8] = '\0';
      uVar14 = **(undefined4 **)(lVar16 + 0x38);
      uVar6 = FUN_00925a5c(*(undefined4 **)(lVar16 + 0x38) + 4);
      iVar7 = FUN_00925b58(uVar14,uVar6,*(undefined4 *)(lVar16 + 0x568),acStack_658,acStack_524,
                           0x401);
      if (iVar7 == 0) {
        bVar18 = 1;
      }
      else {
        if (iVar7 == 1) goto LAB_00952df8;
        if (iVar7 != 2) goto LAB_00952ce0;
        bVar18 = 1;
        pcVar9 = acStack_524;
      }
      goto LAB_00952d54;
    }
  }
  goto LAB_00952df8;
LAB_00952dc0:
  puVar10 = (undefined4 *)__errno();
  pcVar9 = (char *)FUN_00941a94(*puVar10,auStack_624,0x100);
  pcVar19 = "socket failure: %s";
  goto LAB_00952df4;
LAB_0095325c:
  do {
    if ((((param_2 != 0) || ((*(ulong *)(lVar16 + 0x3a0) & 0x20000) != 0)) &&
        ((local_120[0].sa_family == 2 || (param_2 != 1)))) && ((local_120[0].sa_family | 8) == 10))
    {
      if (param_2 == 0) {
        uVar14 = 1;
        if (local_120[0].sa_family != 2) {
          uVar14 = 2;
        }
        iVar7 = FUN_009453ec(param_1,lVar16 + 0x428,"%s |%d|%s|%hu|",&DAT_00748ae0,uVar14,&local_a0)
        ;
        if (iVar7 != 0) {
          uVar12 = curl_easy_strerror(iVar7);
          pcVar19 = "Failure sending EPRT command: %s";
          goto LAB_009533e8;
        }
        uVar14 = 0;
        goto LAB_0095329c;
      }
      if (param_2 == 1) {
        pcVar19 = (char *)&local_a0;
        pcVar9 = local_69c;
        goto LAB_00953370;
      }
    }
    param_2 = param_2 + 1;
  } while (param_2 != 2);
LAB_00953298:
  uVar14 = 2;
LAB_0095329c:
  *(undefined4 *)(lVar16 + 0x528) = uVar14;
  lVar20 = *(long *)(param_1 + 0x20);
  if ((((param_1 != 0) && (*(byte *)(lVar20 + 0x536) != 0x1c)) &&
      ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
     (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
      (0 < DAT_00cc46c0)))) {
    if (lVar20 == 0) {
      puVar13 = &DAT_002c11b5;
    }
    else {
      puVar13 = (&PTR_DAT_00c508c0)[*(byte *)(lVar20 + 0x536)];
    }
    FUN_00905258(param_1,"[%s] -> [%s]",puVar13,&DAT_002ad367);
  }
  iVar7 = 0;
  *(undefined1 *)(lVar20 + 0x536) = 0x1c;
  goto LAB_00952e8c;
LAB_00953370:
  cVar15 = *pcVar19;
  if (cVar15 == '.') {
    cVar15 = ',';
  }
  else if (cVar15 == '\0') goto LAB_0095338c;
  *pcVar9 = cVar15;
  pcVar19 = pcVar19 + 1;
  pcVar9 = pcVar9 + 1;
  goto LAB_00953370;
LAB_0095338c:
  *pcVar9 = '\0';
  curl_msnprintf(pcVar9,0x14,",%d,%d",(ushort)(byte)(char)uVar3,uVar2);
  iVar7 = FUN_009453ec(param_1,lVar16 + 0x428,"%s %s",&DAT_00748ae5,local_69c);
  if (iVar7 == 0) {
    uVar14 = 1;
    goto LAB_0095329c;
  }
  uVar12 = curl_easy_strerror(iVar7);
  pcVar19 = "Failure sending PORT command: %s";
LAB_009533e8:
  FUN_00904b80(param_1,pcVar19,uVar12);
  lVar20 = *(long *)(param_1 + 0x20);
  goto joined_r0x009533f4;
LAB_00952f94:
  do {
    uVar5 = uVar17;
    while( true ) {
      local_120[0].sa_data._0_2_ = (ushort)(uVar5 >> 8) & 0xff | (ushort)((uVar5 & 0xff00ff) << 8);
      iVar7 = bind(local_6a0,local_120,local_6a4);
      if (iVar7 == 0) {
        local_6a4 = 0x80;
        iVar7 = getsockname(local_6a0,local_120,&local_6a4);
        if (iVar7 != 0) goto LAB_00952d00;
        if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
            && (0 < DAT_00cc46c0)))) {
          if (*(long *)(param_1 + 0x20) == 0) {
            puVar13 = &DAT_002c11b5;
          }
          else {
            puVar13 = (&PTR_DAT_00c508c0)[*(byte *)(*(long *)(param_1 + 0x20) + 0x536)];
          }
          FUN_00905258(param_1,"[%s] ftp_state_use_port(), socket bound to port %d",puVar13,
                       uVar5 & 0xffff);
        }
        iVar7 = listen(local_6a0,1);
        if (iVar7 != 0) goto LAB_00952dc0;
        if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
            ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
           && (0 < DAT_00cc46c0)) {
          if (*(long *)(param_1 + 0x20) == 0) {
            puVar13 = &DAT_002c11b5;
          }
          else {
            puVar13 = (&PTR_DAT_00c508c0)[*(byte *)(*(long *)(param_1 + 0x20) + 0x536)];
          }
          FUN_00905258(param_1,"[%s] ftp_state_use_port(), listening on %d",puVar13,uVar5 & 0xffff);
        }
        FUN_00916bac(lVar20,&local_a0,0x2f);
        if ((*(ulong *)(lVar16 + 0x3a0) & 0x21000) == 0x1000) {
          *(ulong *)(lVar16 + 0x3a0) = *(ulong *)(lVar16 + 0x3a0) | 0x20000;
        }
        iVar7 = FUN_0090d97c(param_1,lVar16,1,&local_6a0);
        uVar3 = local_120[0].sa_data._0_2_;
        if (iVar7 != 0) goto LAB_00952dfc;
        local_6a0 = -1;
        if (param_2 == 2) goto LAB_00953298;
        uVar2 = (ushort)local_120[0].sa_data._0_2_ >> 8;
        goto LAB_0095325c;
      }
      piVar11 = (int *)__errno();
      iVar7 = *piVar11;
      if (iVar7 == 99 && !(bool)(bVar18 ^ 1)) break;
      if ((iVar7 != 0xd) && (iVar7 != 0x62)) {
        uVar12 = FUN_00941a94(iVar7,auStack_624,0x100);
        FUN_00904b80(param_1,"bind(port=%hu) failed: %s",uVar5 & 0xffff,uVar12);
        goto LAB_00952df8;
      }
      uVar5 = uVar5 + 1;
      if ((uVar21 & 0xffff) < (uVar5 & 0xffff)) goto LAB_0095306c;
    }
    if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      uVar12 = FUN_00941a94(99,auStack_624,0x100);
      FUN_00904c98(param_1,"bind(port=%hu) on non-local address failed: %s",uVar5 & 0xffff,uVar12);
    }
    local_6a4 = 0x80;
    iVar7 = getsockname(*(int *)(lVar16 + 0x220),local_120,&local_6a4);
    bVar18 = 0;
  } while (iVar7 == 0);
  iVar7 = *piVar11;
LAB_00952d08:
  pcVar9 = (char *)FUN_00941a94(iVar7,auStack_624,0x100);
  pcVar19 = "getsockname() failed: %s";
LAB_00952df4:
  FUN_00904b80(param_1,pcVar19,pcVar9);
LAB_00952df8:
  iVar7 = 0x1e;
LAB_00952dfc:
  lVar20 = *(long *)(param_1 + 0x20);
joined_r0x009533f4:
  if (((((param_1 != 0) && (*(byte *)(lVar20 + 0x536) != 0)) &&
       ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46c0)) {
    if (lVar20 == 0) {
      puVar13 = &DAT_002c11b5;
    }
    else {
      puVar13 = (&PTR_DAT_00c508c0)[*(byte *)(lVar20 + 0x536)];
    }
    FUN_00905258(param_1,"[%s] -> [%s]",puVar13,&DAT_002c11b9);
  }
  *(undefined1 *)(lVar20 + 0x536) = 0;
LAB_00952e8c:
  if (local_6a0 != -1) {
    FUN_0090c144(param_1,lVar16);
  }
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar7;
}

