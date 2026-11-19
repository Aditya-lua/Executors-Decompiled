/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00961590
 */

/* WARNING: Type propagation algorithm not settling */

void curl_url_get(long *param_1,int param_2,long *param_3,uint param_4)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  undefined *puVar6;
  undefined1 *puVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  long lVar10;
  bool bVar11;
  int iVar12;
  undefined8 uVar13;
  size_t sVar14;
  ulong uVar15;
  long lVar16;
  char *__s;
  ulong uVar17;
  long lVar18;
  uint uVar19;
  undefined1 *puVar20;
  char *pcVar21;
  char *pcVar22;
  uint uVar23;
  uint uVar24;
  undefined1 *puVar25;
  uint uVar26;
  undefined *puVar27;
  undefined8 uVar28;
  size_t local_c8 [4];
  char acStack_a8 [8];
  undefined1 local_a0;
  undefined7 uStack_9f;
  long local_70;
  
  lVar10 = tpidr_el0;
  local_70 = *(long *)(lVar10 + 0x28);
  if (param_1 == (long *)0x0) {
    uVar13 = 1;
    goto LAB_00961e24;
  }
  if (param_3 == (long *)0x0) {
    uVar13 = 2;
    goto LAB_00961e24;
  }
  *param_3 = 0;
  switch(param_2) {
  case 0:
    puVar25 = (undefined1 *)param_1[3];
    pcVar21 = (char *)param_1[6];
    puVar20 = &DAT_002ad461;
    if (((param_1[9] == 0) &&
        (puVar20 = &DAT_002ab32c, (*(byte *)((long)param_1 + 0x52) >> 1 & 1) != 0)) &&
       (puVar20 = &DAT_002ab32c, (param_4 & 0x4000) != 0)) {
      puVar20 = &DAT_002ad461;
    }
    if (((char *)param_1[8] == (char *)0x0) || (*(char *)param_1[8] == '\0')) {
      puVar27 = &DAT_002ab32c;
      if (((*(byte *)((long)param_1 + 0x52) & 1) != 0) &&
         (puVar27 = &DAT_002ab32c, (param_4 & 0x4000) != 0)) {
        puVar27 = &DAT_002a35cf;
      }
      if (*param_1 == 0) goto LAB_0096189c;
LAB_00961858:
      iVar12 = curl_strequal(&DAT_002d74d1);
      if (iVar12 == 0) goto LAB_0096189c;
      puVar25 = &DAT_002ab32c;
      if ((undefined1 *)param_1[9] != (undefined1 *)0x0) {
        puVar25 = (undefined1 *)param_1[9];
      }
      lVar18 = curl_maprintf("file://%s%s%s",param_1[7],puVar20,puVar25);
      if (lVar18 == 0) goto LAB_00961e20;
LAB_00961e14:
      uVar13 = 0;
      *param_3 = lVar18;
      goto LAB_00961e24;
    }
    puVar27 = &DAT_002a35cf;
    if (*param_1 != 0) goto LAB_00961858;
LAB_0096189c:
    if (param_1[4] == 0) {
      uVar13 = 0xe;
      goto LAB_00961e24;
    }
    pcVar22 = (char *)*param_1;
    if (pcVar22 == (char *)0x0) {
      if ((param_4 >> 2 & 1) == 0) {
        uVar13 = 10;
        goto LAB_00961e24;
      }
      pcVar22 = "https";
    }
    lVar18 = FUN_00946e30(pcVar22);
    if (((param_4 & 1) == 0) || (pcVar21 != (char *)0x0)) {
      if ((pcVar21 == (char *)0x0) || (lVar18 == 0)) {
        if (lVar18 == 0) goto LAB_00961c40;
      }
      else if (*(uint *)(lVar18 + 0x88) == (uint)*(ushort *)(param_1 + 10) && (param_4 & 2) != 0) {
        pcVar21 = (char *)0x0;
      }
LAB_00961c2c:
      puVar1 = (undefined1 *)0x0;
      if ((*(byte *)(lVar18 + 0x95) & 4) != 0) {
        puVar1 = puVar25;
      }
      puVar25 = puVar1;
    }
    else {
      if (lVar18 != 0) {
        pcVar21 = acStack_a8;
        curl_msnprintf(acStack_a8,7,&DAT_002cb1c1,*(undefined4 *)(lVar18 + 0x88));
        goto LAB_00961c2c;
      }
      pcVar21 = (char *)0x0;
    }
LAB_00961c40:
    __s = (char *)param_1[4];
    if (*__s != '[') {
      if ((param_4 >> 7 & 1) != 0) {
        lVar16 = curl_easy_escape(0,__s,0);
        if (lVar16 == 0) goto LAB_00961e20;
joined_r0x00961d18:
        if ((param_4 >> 0xf & 1) == 0) {
LAB_00961d24:
          curl_msnprintf(&local_a0,0x2d,"%s://",pcVar22);
        }
        else {
LAB_00961d1c:
          if ((*(byte *)((long)param_1 + 0x52) >> 2 & 1) == 0) goto LAB_00961d24;
          local_a0 = 0;
        }
        puVar8 = (undefined1 *)param_1[1];
        puVar9 = (undefined1 *)param_1[2];
        puVar1 = &DAT_002ab32c;
        if (puVar8 != (undefined1 *)0x0) {
          puVar1 = puVar8;
        }
        puVar2 = &DAT_002bcda4;
        puVar3 = puVar9;
        if (puVar9 == (undefined1 *)0x0) {
          puVar2 = &DAT_002ab32c;
          puVar3 = &DAT_002ab32c;
        }
        bVar11 = puVar25 == (undefined1 *)0x0;
        puVar4 = &DAT_002b529b;
        if (bVar11) {
          puVar4 = &DAT_002ab32c;
          puVar25 = &DAT_002ab32c;
        }
        puVar5 = &DAT_002b94dc;
        if (bVar11) {
          puVar5 = &DAT_002ab32c;
        }
        if (puVar8 != (undefined1 *)0x0 || puVar9 != (undefined1 *)0x0) {
          puVar5 = &DAT_002b94dc;
        }
        lVar18 = lVar16;
        if (lVar16 == 0) {
          lVar18 = param_1[4];
        }
        puVar8 = &DAT_002bcda4;
        if (pcVar21 == (char *)0x0) {
          puVar8 = &DAT_002ab32c;
          pcVar21 = "";
        }
        puVar6 = &DAT_002a91de;
        if ((undefined *)param_1[7] != (undefined *)0x0) {
          puVar6 = (undefined *)param_1[7];
        }
        puVar9 = &DAT_002ab32c;
        if ((undefined1 *)param_1[8] != (undefined1 *)0x0) {
          puVar9 = (undefined1 *)param_1[8];
        }
        puVar7 = &DAT_002ab32c;
        if ((undefined1 *)param_1[9] != (undefined1 *)0x0) {
          puVar7 = (undefined1 *)param_1[9];
        }
        lVar18 = curl_maprintf("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s",&local_a0,puVar1,puVar2,puVar3,
                               puVar4,puVar25,puVar5,lVar18,puVar8,pcVar21,puVar6,puVar27,puVar9,
                               puVar20,puVar7);
        (*(code *)PTR_free_00cc4678)(lVar16);
        if (lVar18 != 0) goto LAB_00961e14;
        goto LAB_00961e20;
      }
      if ((param_4 >> 0xc & 1) == 0) {
        lVar16 = 0;
        if ((param_4 >> 0xd & 1) != 0) {
          uVar15 = FUN_0095c6a8(__s);
          lVar16 = 0;
          if ((uVar15 & 1) != 0) {
            iVar12 = strncmp("xn--",(char *)param_1[4],4);
            lVar16 = 0;
            if (iVar12 == 0) goto LAB_00961b7c;
          }
        }
        goto joined_r0x00961d18;
      }
      uVar15 = FUN_0095c6a8(__s);
      lVar16 = 0;
      if ((uVar15 & 1) != 0) goto joined_r0x00961d18;
      goto LAB_00961b7c;
    }
    if (param_1[5] == 0) {
      lVar16 = 0;
      goto joined_r0x00961d18;
    }
    sVar14 = strlen(__s);
    FUN_00904528(local_c8,&fde_table_entry_007a1200);
    iVar12 = FUN_009048cc(local_c8,"%.*s%%25%s]",(int)sVar14 + -1,param_1[4],param_1[5]);
    if (iVar12 == 0) {
      lVar16 = FUN_00904974(local_c8);
      if ((param_4 >> 0xf & 1) != 0) goto LAB_00961d1c;
      goto LAB_00961d24;
    }
    goto LAB_00961e20;
  case 1:
    pcVar21 = (char *)*param_1;
    uVar24 = 0;
    if ((param_4 >> 0xf & 1) == 0) {
      uVar13 = 10;
    }
    else {
      uVar13 = 10;
      if ((*(byte *)((long)param_1 + 0x52) >> 2 & 1) != 0) goto LAB_00961e24;
    }
    goto joined_r0x009616bc;
  case 2:
    pcVar21 = (char *)param_1[1];
    uVar24 = param_4 >> 6 & 1;
    uVar13 = 0xb;
joined_r0x009616bc:
    uVar23 = 0;
    uVar19 = 0;
    goto joined_r0x009617e0;
  case 3:
    pcVar21 = (char *)param_1[2];
    uVar13 = 0xc;
    goto joined_r0x00961678;
  case 4:
    pcVar21 = (char *)param_1[3];
    uVar13 = 0xd;
joined_r0x00961678:
    uVar23 = 0;
    uVar19 = 0;
    break;
  case 5:
    pcVar21 = (char *)param_1[4];
    uVar19 = param_4 >> 0xc & 1;
    uVar23 = param_4 >> 0xd & 1;
    uVar13 = 0xe;
    break;
  case 6:
    pcVar21 = (char *)param_1[6];
    if ((((param_4 & 1) == 0) || (pcVar21 != (char *)0x0)) || (*param_1 == 0)) {
      if (pcVar21 != (char *)0x0) {
        if (((*param_1 == 0) || (lVar18 = FUN_00946e30(), lVar18 == 0)) || ((param_4 >> 1 & 1) == 0)
           ) goto LAB_009618d0;
        uVar24 = 0;
        uVar19 = 0;
        uVar23 = 0;
        uVar26 = 0;
        if (*(uint *)(lVar18 + 0x88) != (uint)*(ushort *)(param_1 + 10)) goto LAB_009618e0;
      }
    }
    else {
      lVar18 = FUN_00946e30();
      if (lVar18 != 0) {
        pcVar21 = acStack_a8;
        curl_msnprintf(acStack_a8,7,&DAT_002cb1c1,*(undefined4 *)(lVar18 + 0x88));
LAB_009618d0:
        uVar24 = 0;
        goto LAB_009618d4;
      }
    }
    uVar13 = 0xf;
    goto LAB_00961e24;
  case 7:
    uVar19 = 0;
    uVar23 = 0;
    uVar26 = 0;
    uVar24 = param_4 >> 6 & 1;
    pcVar21 = "/";
    if ((char *)param_1[7] != (char *)0x0) {
      pcVar21 = (char *)param_1[7];
    }
    goto LAB_009618e0;
  case 8:
    pcVar21 = (char *)param_1[8];
    if (pcVar21 != (char *)0x0) {
      uVar24 = param_4 >> 6 & 1;
      uVar19 = 0;
      uVar23 = 0;
      uVar26 = uVar24;
      if (((param_4 >> 0xe & 1) != 0) || (*pcVar21 != '\0')) goto LAB_009618e0;
    }
    uVar13 = 0x10;
    goto LAB_00961e24;
  case 9:
    pcVar21 = (char *)param_1[9];
    uVar24 = param_4 >> 6 & 1;
    if (pcVar21 == (char *)0x0) {
      uVar13 = 0x11;
      if (((param_4 >> 0xe & 1) == 0) || ((*(byte *)((long)param_1 + 0x52) >> 1 & 1) == 0))
      goto LAB_00961e24;
      uVar19 = 0;
      uVar23 = 0;
      pcVar21 = "";
      uVar26 = 0;
    }
    else {
LAB_009618d4:
      uVar19 = 0;
      uVar23 = 0;
      uVar26 = 0;
    }
    goto LAB_009618e0;
  case 10:
    pcVar21 = (char *)param_1[5];
    uVar23 = 0;
    uVar19 = 0;
    uVar13 = 0x12;
    break;
  default:
    uVar13 = 9;
    goto LAB_00961e24;
  }
  uVar24 = param_4 >> 6 & 1;
joined_r0x009617e0:
  uVar26 = 0;
  if (pcVar21 == (char *)0x0) goto LAB_00961e24;
LAB_009618e0:
  sVar14 = strlen(pcVar21);
  pcVar21 = (char *)FUN_00941948(pcVar21,sVar14);
  *param_3 = (long)pcVar21;
  if (pcVar21 == (char *)0x0) {
LAB_00961e20:
    uVar13 = 7;
    goto LAB_00961e24;
  }
  if (uVar26 == 1 && sVar14 != 0) {
    if (sVar14 < 0x10) {
      uVar17 = 0;
    }
    else {
      uVar17 = sVar14 & 0xfffffffffffffff0;
      pcVar22 = pcVar21 + 7;
      pcVar21 = pcVar21 + uVar17;
      uVar15 = uVar17;
      do {
        uVar28 = *(undefined8 *)(pcVar22 + 1);
        uVar13 = *(undefined8 *)(pcVar22 + -7);
        if ((char)uVar13 == '+') {
          pcVar22[-7] = ' ';
        }
        if ((char)((ulong)uVar13 >> 8) == '+') {
          pcVar22[-6] = ' ';
        }
        if ((char)((ulong)uVar13 >> 0x10) == '+') {
          pcVar22[-5] = ' ';
        }
        if ((char)((ulong)uVar13 >> 0x18) == '+') {
          pcVar22[-4] = ' ';
        }
        if ((char)((ulong)uVar13 >> 0x20) == '+') {
          pcVar22[-3] = ' ';
        }
        if ((char)((ulong)uVar13 >> 0x28) == '+') {
          pcVar22[-2] = ' ';
        }
        if ((char)((ulong)uVar13 >> 0x30) == '+') {
          pcVar22[-1] = ' ';
        }
        if ((char)((ulong)uVar13 >> 0x38) == '+') {
          *pcVar22 = ' ';
        }
        if ((char)uVar28 == '+') {
          pcVar22[1] = ' ';
        }
        if ((char)((ulong)uVar28 >> 8) == '+') {
          pcVar22[2] = ' ';
        }
        if ((char)((ulong)uVar28 >> 0x10) == '+') {
          pcVar22[3] = ' ';
        }
        if ((char)((ulong)uVar28 >> 0x18) == '+') {
          pcVar22[4] = ' ';
        }
        if ((char)((ulong)uVar28 >> 0x20) == '+') {
          pcVar22[5] = ' ';
        }
        if ((char)((ulong)uVar28 >> 0x28) == '+') {
          pcVar22[6] = ' ';
        }
        if ((char)((ulong)uVar28 >> 0x30) == '+') {
          pcVar22[7] = ' ';
        }
        if ((char)((ulong)uVar28 >> 0x38) == '+') {
          pcVar22[8] = ' ';
        }
        uVar15 = uVar15 - 0x10;
        pcVar22 = pcVar22 + 0x10;
      } while (uVar15 != 0);
      if (sVar14 == uVar17) goto LAB_00961abc;
    }
    lVar18 = sVar14 - uVar17;
    do {
      if (*pcVar21 == '+') {
        *pcVar21 = ' ';
      }
      lVar18 = lVar18 + -1;
      pcVar21 = pcVar21 + 1;
    } while (lVar18 != 0);
  }
LAB_00961abc:
  if (uVar24 != 0) {
    iVar12 = FUN_0091583c(*param_3,0,&local_a0,local_c8,3);
    (*(code *)PTR_free_00cc4678)(*param_3);
    if (iVar12 != 0) {
      *param_3 = 0;
      uVar13 = 6;
      goto LAB_00961e24;
    }
    *param_3 = CONCAT71(uStack_9f,local_a0);
    sVar14 = local_c8[0];
  }
  if ((param_4 >> 7 & 1) == 0) {
    if (uVar19 == 0) {
      if (((uVar23 == 0) || (uVar15 = FUN_0095c6a8(param_1[4]), (uVar15 & 1) == 0)) ||
         (iVar12 = strncmp("xn--",(char *)param_1[4],4), iVar12 != 0)) goto LAB_00961bac;
    }
    else {
      uVar15 = FUN_0095c6a8(param_1[4]);
      if ((uVar15 & 1) != 0) goto LAB_00961bac;
    }
LAB_00961b7c:
    uVar13 = 0x1e;
  }
  else {
    FUN_00904528(&local_a0,&fde_table_entry_007a1200);
    uVar13 = FUN_00961e58(&local_a0,*param_3,sVar14,1,param_2 == 8);
    if ((int)uVar13 != 0) goto LAB_00961e24;
    (*(code *)PTR_free_00cc4678)(*param_3);
    lVar18 = FUN_00904974(&local_a0);
    *param_3 = lVar18;
LAB_00961bac:
    uVar13 = 0;
  }
LAB_00961e24:
  if (*(long *)(lVar10 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar13);
  }
  return;
}

