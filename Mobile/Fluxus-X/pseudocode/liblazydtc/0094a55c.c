/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094a55c
 */

int FUN_0094a55c(long param_1,long param_2,undefined8 param_3,uint param_4)

{
  uint uVar1;
  long *plVar2;
  long lVar3;
  char *pcVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  undefined8 uVar9;
  ulong uVar10;
  long lVar11;
  size_t sVar12;
  uint uVar13;
  char *local_98;
  undefined8 local_90;
  char *local_88;
  long local_80;
  long local_78;
  char *local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  local_78 = 0;
  local_70 = (char *)0x0;
  local_88 = (char *)0x0;
  local_80 = 0;
  lVar8 = curl_url();
  local_98 = (char *)0x0;
  local_90 = 0;
  if (lVar8 == 0) goto LAB_0094a604;
  iVar6 = curl_url_set(lVar8,0,param_3,0x208);
  if (iVar6 != 0) {
    uVar9 = curl_url_strerror();
    FUN_00904b80(param_1,"Unsupported proxy syntax in \'%s\': %s",param_3,uVar9);
    iVar6 = 5;
    goto LAB_0094a608;
  }
  iVar6 = curl_url_get(lVar8,1,&local_90,0);
  if (iVar6 != 0) goto LAB_0094a604;
  iVar6 = curl_strequal("https",local_90);
  if (iVar6 == 0) {
    iVar6 = curl_strequal("socks5h",local_90);
    if (iVar6 == 0) {
      iVar6 = curl_strequal("socks5",local_90);
      if (iVar6 == 0) {
        iVar6 = curl_strequal("socks4a",local_90);
        if (iVar6 == 0) {
          iVar6 = curl_strequal("socks4",local_90);
          if ((iVar6 == 0) && (iVar6 = curl_strequal("socks",local_90), iVar6 == 0)) {
            iVar6 = curl_strequal(&DAT_002b3577,local_90);
            if (iVar6 == 0) {
              FUN_00904b80(param_1,"Unsupported proxy scheme for \'%s\'",param_3);
              iVar6 = 7;
              goto LAB_0094a608;
            }
          }
          else {
            param_4 = 4;
          }
        }
        else {
          param_4 = 6;
        }
      }
      else {
        param_4 = 5;
      }
    }
    else {
      param_4 = 7;
    }
  }
  else {
    bVar5 = param_4 == 3;
    param_4 = 2;
    if (bVar5) {
      param_4 = 3;
    }
  }
  uVar10 = FUN_0096a5f4(param_1,0x10);
  if (((param_4 | 1) == 3) && ((uVar10 & 1) == 0)) {
    FUN_00904b80(param_1,
                 "Unsupported proxy \'%s\', libcurl is built without the HTTPS-proxy support.",
                 param_3);
    iVar6 = 4;
    goto LAB_0094a608;
  }
  uVar1 = param_4 & 0xfffffffc;
  plVar2 = (long *)(param_2 + 0x90);
  if (uVar1 != 4) {
    plVar2 = (long *)(param_2 + 200);
  }
  *(char *)((long)plVar2 + 0x24) = (char)param_4;
  iVar7 = curl_url_get(lVar8,2,&local_78,0x40);
  if (((iVar7 != 0xb) && (iVar6 = 0, iVar7 != 0)) ||
     ((iVar7 = curl_url_get(lVar8,3,&local_80,0x40), iVar7 != 0xc && (iVar6 = 0, iVar7 != 0))))
  goto LAB_0094a608;
  if (local_78 != 0 || local_80 != 0) {
    (*(code *)PTR_free_00cc4678)(plVar2[5]);
    plVar2[5] = local_78;
    iVar6 = FUN_00937c50(param_1 + 0x1308);
    local_78 = 0;
    if (iVar6 != 0) goto LAB_0094a608;
    (*(code *)PTR_free_00cc4678)(plVar2[6]);
    plVar2[6] = 0;
    if ((local_80 == 0) && (local_80 = (*(code *)PTR_strdup_00cc4688)(&DAT_002ab32c), local_80 == 0)
       ) goto LAB_0094a604;
    plVar2[6] = local_80;
    iVar6 = FUN_00937c50(param_1 + 0x1310);
    local_80 = 0;
    if (iVar6 != 0) goto LAB_0094a608;
    *(ulong *)(param_2 + 0x3a0) = *(ulong *)(param_2 + 0x3a0) | 4;
  }
  curl_url_get(lVar8,6,&local_70,0);
  if (local_70 == (char *)0x0) {
    uVar13 = (uint)*(ushort *)(param_1 + 0x6c8);
    if ((*(ushort *)(param_1 + 0x6c8) == 0) && (uVar13 = 0x1bb, (param_4 | 1) != 3)) {
      uVar13 = 0x438;
    }
LAB_0094a8cc:
    *(uint *)(plVar2 + 4) = uVar13;
    if (((uVar1 == 4) || (*(int *)(param_2 + 0x15c) < 0)) || (*(long *)(param_2 + 0x90) == 0)) {
      *(uint *)(param_2 + 0x15c) = uVar13;
    }
  }
  else {
    lVar11 = strtol(local_70,(char **)0x0,10);
    (*(code *)PTR_free_00cc4678)(local_70);
    uVar13 = (uint)lVar11;
    if (-1 < (int)uVar13) goto LAB_0094a8cc;
  }
  iVar6 = curl_url_get(lVar8,5,&local_88,0x40);
  if (iVar6 == 0) {
    if ((uVar1 == 4) && (iVar6 = curl_strequal("localhost",local_88), iVar6 != 0)) {
      iVar6 = curl_url_get(lVar8,7,&local_98,0x40);
      if (iVar6 != 0) goto LAB_0094a604;
      iVar6 = strcmp("/",local_98);
      if (iVar6 == 0) goto LAB_0094a998;
      (*(code *)PTR_free_00cc4678)(local_88);
      local_88 = (char *)curl_maprintf("localhost%s",local_98);
      if (local_88 == (char *)0x0) goto LAB_0094a604;
      (*(code *)PTR_free_00cc4678)(*plVar2);
      *plVar2 = (long)local_88;
      plVar2[2] = (long)local_88;
    }
    else {
LAB_0094a998:
      (*(code *)PTR_free_00cc4678)(*plVar2);
      pcVar4 = local_88;
      *plVar2 = (long)local_88;
      if (*local_88 == '[') {
        sVar12 = strlen(local_88);
        pcVar4[sVar12 - 1] = '\0';
        local_88 = local_88 + 1;
        FUN_0094a44c(lVar8,param_1,param_2);
      }
      plVar2[2] = (long)local_88;
    }
    iVar6 = 0;
    local_88 = (char *)0x0;
  }
  else {
LAB_0094a604:
    iVar6 = 0x1b;
  }
LAB_0094a608:
  (*(code *)PTR_free_00cc4678)(local_78);
  (*(code *)PTR_free_00cc4678)(local_80);
  (*(code *)PTR_free_00cc4678)(local_88);
  (*(code *)PTR_free_00cc4678)(local_90);
  (*(code *)PTR_free_00cc4678)(local_98);
  curl_url_cleanup(lVar8);
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

