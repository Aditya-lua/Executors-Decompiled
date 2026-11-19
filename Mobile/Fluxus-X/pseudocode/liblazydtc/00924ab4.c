/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924ab4
 */

int FUN_00924ab4(long param_1,ulong param_2,undefined8 param_3,char *param_4)

{
  undefined1 *puVar1;
  long lVar2;
  int iVar3;
  char *pcVar4;
  long lVar5;
  byte bVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  long *plVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  long *plVar12;
  long lVar13;
  undefined1 auStack_78 [8];
  undefined8 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if ((param_2 & 1) == 0) {
    plVar9 = (long *)(param_1 + 0xce0);
    plVar12 = (long *)(param_1 + 0x12b8);
    puVar7 = (undefined8 *)(param_1 + 0x12f0);
    puVar8 = (undefined8 *)(param_1 + 0x12f8);
    lVar13 = param_1 + 0xd50;
  }
  else {
    plVar9 = (long *)(param_1 + 0xd18);
    plVar12 = (long *)(param_1 + 0x1300);
    puVar7 = (undefined8 *)(param_1 + 0x1308);
    puVar8 = (undefined8 *)(param_1 + 0x1310);
    lVar13 = param_1 + 0xd70;
  }
  puVar10 = (undefined1 *)*puVar7;
  puVar11 = (undefined1 *)*puVar8;
  (*(code *)PTR_free_00cc4678)(*plVar12);
  *plVar12 = 0;
  puVar1 = &DAT_002ab32c;
  if (puVar10 != (undefined1 *)0x0) {
    puVar1 = puVar10;
  }
  puVar10 = &DAT_002ab32c;
  if (puVar11 != (undefined1 *)0x0) {
    puVar10 = puVar11;
  }
  if (*plVar9 == 0) {
    bVar6 = *(byte *)(lVar13 + 0x18) & 0xfe;
LAB_00924c60:
    iVar3 = 0;
    *(byte *)(lVar13 + 0x18) = bVar6;
  }
  else {
    if (((*(byte *)(lVar13 + 0x18) >> 2 & 1) == 0) ||
       (pcVar4 = strchr(param_4,0x3f), pcVar4 == (char *)0x0)) {
      lVar5 = (*(code *)PTR_strdup_00cc4688)(param_4);
    }
    else {
      lVar5 = curl_maprintf(&DAT_002bae9b,(int)pcVar4 - (int)param_4,param_4);
    }
    if (lVar5 != 0) {
      iVar3 = FUN_00964ec0(param_1,puVar1,puVar10,param_3,lVar5,plVar9,&local_70,auStack_78);
      (*(code *)PTR_free_00cc4678)(lVar5);
      if (iVar3 != 0) goto LAB_00924c6c;
      pcVar4 = "Proxy-";
      if ((param_2 & 1) == 0) {
        pcVar4 = "";
      }
      lVar5 = curl_maprintf("%sAuthorization: Digest %s\r\n",pcVar4,local_70);
      *plVar12 = lVar5;
      (*(code *)PTR_free_00cc4678)(local_70);
      if (*plVar12 != 0) {
        bVar6 = *(byte *)(lVar13 + 0x18) | 1;
        goto LAB_00924c60;
      }
    }
    iVar3 = 0x1b;
  }
LAB_00924c6c:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

