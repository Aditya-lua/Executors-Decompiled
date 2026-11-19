/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009053c4
 */

void FUN_009053c4(void)

{
  long lVar1;
  int iVar2;
  char *__s;
  char *pcVar3;
  undefined8 uVar4;
  undefined **ppuVar5;
  long lVar6;
  undefined4 uVar7;
  undefined8 *puVar8;
  char *pcStack_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  __s = (char *)(*(code *)PTR_strdup_00cc4688)();
  if (__s == (char *)0x0) {
    uVar4 = 0x1b;
  }
  else {
    pcVar3 = strtok_r(__s,", ",&pcStack_70);
    while (pcVar3 != (char *)0x0) {
      if (*pcVar3 == '+') {
        pcVar3 = pcVar3 + 1;
LAB_00905474:
        uVar7 = 1;
      }
      else {
        if (*pcVar3 != '-') goto LAB_00905474;
        uVar7 = 0;
        pcVar3 = pcVar3 + 1;
      }
      lVar6 = 0;
      do {
        iVar2 = curl_strequal(pcVar3,&DAT_002d8fd5);
        puVar8 = *(undefined8 **)((long)&PTR_PTR_00c4f238 + lVar6);
        if (iVar2 == 0) {
          iVar2 = curl_strequal(pcVar3,*puVar8);
          if (iVar2 != 0) {
            *(undefined4 *)((long)puVar8 + 0xc) = uVar7;
            break;
          }
        }
        else {
          *(undefined4 *)((long)puVar8 + 0xc) = uVar7;
        }
        lVar6 = lVar6 + 8;
      } while (lVar6 != 0x68);
      iVar2 = curl_strequal(pcVar3,&DAT_002d8fd5);
      if (iVar2 == 0) {
        iVar2 = curl_strequal(pcVar3,PTR_DAT_00cc4698);
        ppuVar5 = &PTR_DAT_00cc4698;
        if (iVar2 == 0) goto LAB_009054d0;
LAB_00905578:
        *(undefined4 *)(ppuVar5 + 1) = uVar7;
      }
      else {
        DAT_00cc46a0 = uVar7;
LAB_009054d0:
        iVar2 = curl_strequal(pcVar3,&DAT_002d8fd5);
        if (iVar2 == 0) {
          iVar2 = curl_strequal(pcVar3,PTR_s_WRITE_00cc46a8);
          ppuVar5 = &PTR_s_WRITE_00cc46a8;
          if (iVar2 != 0) goto LAB_00905578;
        }
        else {
          DAT_00cc46b0 = uVar7;
        }
        iVar2 = curl_strequal(pcVar3,&DAT_002d8fd5);
        if (iVar2 == 0) {
          iVar2 = curl_strequal(pcVar3,PTR_DAT_00cc46b8);
          ppuVar5 = &PTR_DAT_00cc46b8;
          if (iVar2 != 0) goto LAB_00905578;
        }
        else {
          DAT_00cc46c0 = uVar7;
        }
        iVar2 = curl_strequal(pcVar3,&DAT_002d8fd5);
        if (iVar2 != 0) {
          ppuVar5 = &PTR_DAT_00cc4b00;
          goto LAB_00905578;
        }
        iVar2 = curl_strequal(pcVar3,PTR_DAT_00cc4b00);
        ppuVar5 = &PTR_DAT_00cc4b00;
        if (iVar2 != 0) goto LAB_00905578;
      }
      pcVar3 = strtok_r((char *)0x0,", ",&pcStack_70);
    }
    (*(code *)PTR_free_00cc4678)(__s);
    uVar4 = 0;
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

