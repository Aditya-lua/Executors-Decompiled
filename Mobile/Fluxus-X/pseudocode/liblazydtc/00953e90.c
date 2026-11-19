/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00953e90
 */

int FUN_00953e90(long param_1)

{
  byte bVar1;
  byte bVar2;
  long lVar3;
  int iVar4;
  char *pcVar5;
  undefined8 uVar6;
  long lVar7;
  size_t sVar8;
  char *pcVar9;
  size_t sVar10;
  long lVar11;
  undefined8 *puVar12;
  long local_58;
  char *local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  lVar11 = *(long *)(param_1 + 0x20);
  puVar12 = *(undefined8 **)(param_1 + 0x1a0);
  local_58 = 0;
  local_50 = (char *)0x0;
  *(byte *)(lVar11 + 0x53a) = *(byte *)(lVar11 + 0x53a) & 0xeb;
  iVar4 = FUN_0091583c(*puVar12,0,&local_50,&local_58,3);
  pcVar9 = local_50;
  if (iVar4 != 0) {
    FUN_00904b80(param_1,"path contains control characters");
    goto LAB_009541d4;
  }
  if (*(char *)(param_1 + 0x710) == '\x03') {
    pcVar5 = strrchr(local_50,0x2f);
    if (pcVar5 == (char *)0x0) goto LAB_00954018;
    lVar7 = (*(code *)PTR_calloc_00cc4690)(1,8);
    *(long *)(lVar11 + 0x4e8) = lVar7;
    if (lVar7 == 0) {
LAB_00954190:
      (*(code *)PTR_free_00cc4678)(local_50);
      iVar4 = 0x1b;
      goto LAB_009541d4;
    }
    lVar7 = (long)pcVar5 - (long)pcVar9;
    if (lVar7 == 0) {
      lVar7 = 1;
    }
    uVar6 = FUN_00941948(local_50,lVar7);
    **(undefined8 **)(lVar11 + 0x4e8) = uVar6;
    if (**(long **)(lVar11 + 0x4e8) == 0) goto LAB_00954190;
    pcVar9 = pcVar5 + 1;
    *(undefined4 *)(lVar11 + 0x520) = 1;
    if (*pcVar9 == '\0') goto LAB_0095403c;
    goto LAB_00954024;
  }
  if (*(char *)(param_1 + 0x710) != '\x02') {
    lVar7 = 0;
    pcVar5 = local_50;
    do {
      if (*pcVar5 == '/') {
        lVar7 = lVar7 + 1;
      }
      else if (*pcVar5 == '\0') goto LAB_00953fe4;
      pcVar5 = pcVar5 + 1;
    } while( true );
  }
  if (local_58 == 0) goto LAB_0095403c;
  pcVar5 = (char *)0x0;
  if (local_50[local_58 + -1] != '/') goto LAB_00954018;
  goto LAB_00954040;
LAB_00953fe4:
  if (lVar7 == 0) {
LAB_00954018:
    if (pcVar9 != (char *)0x0) goto LAB_0095401c;
  }
  else {
    lVar7 = (*(code *)PTR_calloc_00cc4690)(lVar7,8);
    *(long *)(lVar11 + 0x4e8) = lVar7;
    if (lVar7 == 0) goto LAB_00954190;
    pcVar5 = strchr(pcVar9,0x2f);
    if (pcVar5 == (char *)0x0) goto LAB_00954018;
    do {
      lVar7 = (long)pcVar5 - (long)pcVar9;
      if (lVar7 == 0) {
        if (*(int *)(lVar11 + 0x520) == 0) {
          lVar7 = 1;
          goto LAB_00954148;
        }
      }
      else {
LAB_00954148:
        lVar7 = FUN_00941948(pcVar9,lVar7);
        if (lVar7 == 0) goto LAB_00954190;
        iVar4 = *(int *)(lVar11 + 0x520);
        *(int *)(lVar11 + 0x520) = iVar4 + 1;
        *(long *)(*(long *)(lVar11 + 0x4e8) + (long)iVar4 * 8) = lVar7;
      }
      pcVar9 = pcVar5 + 1;
      pcVar5 = strchr(pcVar9,0x2f);
    } while (pcVar5 != (char *)0x0);
LAB_0095401c:
    if (*pcVar9 != '\0') {
LAB_00954024:
      pcVar5 = (char *)(*(code *)PTR_strdup_00cc4688)(pcVar9);
      goto LAB_00954040;
    }
  }
LAB_0095403c:
  pcVar5 = (char *)0x0;
LAB_00954040:
  lVar7 = local_58;
  *(char **)(lVar11 + 0x4e0) = pcVar5;
  if ((((*(uint *)(param_1 + 0x131c) >> 0x11 & 1) != 0) && (pcVar5 == (char *)0x0)) &&
     (*(int *)(puVar12 + 2) == 0)) {
    FUN_00904b80(param_1,"Uploading to a URL without a filename");
    (*(code *)PTR_free_00cc4678)(local_50);
    iVar4 = 3;
    goto LAB_009541d4;
  }
  bVar2 = *(byte *)(lVar11 + 0x53a);
  bVar1 = bVar2 & 0xf7;
  *(byte *)(lVar11 + 0x53a) = bVar1;
  if ((*(char *)(param_1 + 0x710) == '\x02') && (*local_50 == '/')) {
LAB_00954118:
    *(byte *)(lVar11 + 0x53a) = bVar2 | 8;
  }
  else if (*(char *)(lVar11 + 0x3a0) < '\0') {
    pcVar9 = *(char **)(lVar11 + 0x4f8);
    if (pcVar9 != (char *)0x0) goto LAB_009540a4;
  }
  else {
    pcVar9 = "";
LAB_009540a4:
    sVar10 = 0;
    if (*(char *)(param_1 + 0x710) != '\x02') {
      sVar10 = 0;
      if (pcVar5 != (char *)0x0) {
        sVar10 = strlen(pcVar5);
      }
      sVar10 = lVar7 - sVar10;
    }
    sVar8 = strlen(pcVar9);
    if ((sVar8 == sVar10) && (iVar4 = strncmp(local_50,pcVar9,sVar10), iVar4 == 0)) {
      bVar2 = bVar1;
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Request has same path as previous transfer");
        bVar2 = *(byte *)(lVar11 + 0x53a);
      }
      goto LAB_00954118;
    }
  }
  (*(code *)PTR_free_00cc4678)(local_50);
  iVar4 = 0;
LAB_009541d4:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

