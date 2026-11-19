/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924f0c
 */

int FUN_00924f0c(long param_1,ulong param_2)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  char *pcVar3;
  long lVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  int *piVar13;
  undefined *puVar14;
  undefined8 uVar15;
  long *plVar16;
  undefined1 auStack_90 [24];
  undefined8 local_78;
  undefined8 local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  local_78 = 0;
  local_70 = 0;
  lVar8 = *(long *)(param_1 + 0x20);
  if ((param_2 & 1) == 0) {
    puVar10 = (undefined8 *)(lVar8 + 0x50);
    lVar6 = lVar8 + 0x3f8;
    piVar13 = (int *)(lVar8 + 0x3f0);
    plVar16 = (long *)(param_1 + 0x12b8);
    puVar9 = (undefined8 *)(param_1 + 0x12f0);
    puVar11 = (undefined8 *)(param_1 + 0x12f8);
    puVar14 = &UNK_002a95db;
    if (*(undefined **)(param_1 + 0x798) != (undefined *)0x0) {
      puVar14 = *(undefined **)(param_1 + 0x798);
    }
    lVar8 = param_1 + 0xd50;
  }
  else {
    puVar10 = (undefined8 *)(lVar8 + 0xd8);
    lVar6 = lVar8 + 0x410;
    piVar13 = (int *)(lVar8 + 0x3f4);
    plVar16 = (long *)(param_1 + 0x1300);
    puVar9 = (undefined8 *)(param_1 + 0x1308);
    puVar11 = (undefined8 *)(param_1 + 0x1310);
    puVar14 = &UNK_002a95db;
    if (*(undefined **)(param_1 + 0x800) != (undefined *)0x0) {
      puVar14 = *(undefined **)(param_1 + 0x800);
    }
    lVar8 = param_1 + 0xd70;
  }
  puVar12 = (undefined1 *)*puVar11;
  uVar15 = *puVar10;
  puVar1 = &DAT_002ab32c;
  if ((undefined1 *)*puVar9 != (undefined1 *)0x0) {
    puVar1 = (undefined1 *)*puVar9;
  }
  *(byte *)(lVar8 + 0x18) = *(byte *)(lVar8 + 0x18) & 0xfe;
  puVar2 = &DAT_002ab32c;
  if (puVar12 != (undefined1 *)0x0) {
    puVar2 = puVar12;
  }
  FUN_00925214(auStack_90);
  iVar5 = *piVar13;
  if (iVar5 == 2) {
    iVar5 = FUN_009671d0(param_1,puVar1,puVar2,lVar6,auStack_90);
    if (iVar5 != 0) goto LAB_009251c8;
    lVar6 = FUN_009252b0(auStack_90);
    if (lVar6 == 0) {
      iVar5 = 0;
      goto LAB_009251c8;
    }
    uVar15 = FUN_009252a8(auStack_90);
    uVar7 = FUN_009252b0(auStack_90);
    iVar5 = FUN_0091e888(uVar15,uVar7,&local_70,&local_78);
    if (iVar5 != 0) goto LAB_009251c8;
    (*(code *)PTR_free_00cc4678)(*plVar16);
    pcVar3 = "Proxy-";
    if ((param_2 & 1) == 0) {
      pcVar3 = "";
    }
    lVar6 = curl_maprintf("%sAuthorization: NTLM %s\r\n",pcVar3,local_70);
    *plVar16 = lVar6;
    (*(code *)PTR_free_00cc4678)(local_70);
    if (*plVar16 == 0) {
      iVar5 = 0x1b;
      goto LAB_009251c8;
    }
    *piVar13 = 3;
  }
  else {
    if (iVar5 != 4) {
      if (iVar5 != 3) {
        iVar5 = FUN_009670b4(param_1,puVar1,puVar2,puVar14,uVar15,lVar6,auStack_90);
        if (iVar5 == 0) {
          uVar15 = FUN_009252a8(auStack_90);
          uVar7 = FUN_009252b0(auStack_90);
          iVar5 = FUN_0091e888(uVar15,uVar7,&local_70,&local_78);
          if (iVar5 == 0) {
            (*(code *)PTR_free_00cc4678)(*plVar16);
            pcVar3 = "Proxy-";
            if ((param_2 & 1) == 0) {
              pcVar3 = "";
            }
            lVar8 = curl_maprintf("%sAuthorization: NTLM %s\r\n",pcVar3,local_70);
            *plVar16 = lVar8;
            (*(code *)PTR_free_00cc4678)(local_70);
            iVar5 = 0x1b;
            if (*plVar16 != 0) {
              iVar5 = 0;
            }
          }
        }
        goto LAB_009251c8;
      }
      *piVar13 = 4;
    }
    (*(code *)PTR_free_00cc4678)(*plVar16);
    *plVar16 = 0;
  }
  iVar5 = 0;
  *(byte *)(lVar8 + 0x18) = *(byte *)(lVar8 + 0x18) | 1;
LAB_009251c8:
  FUN_00925220(auStack_90);
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

