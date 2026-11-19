/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009032c0
 */

void FUN_009032c0(long *param_1,char *param_2)

{
  char cVar1;
  long lVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  FILE *__stream;
  char *__s;
  undefined8 uVar9;
  undefined1 auStack_508 [36];
  int local_4e4;
  undefined4 local_4e0;
  undefined4 local_4dc;
  undefined4 uStack_4d8;
  undefined1 auStack_4d4 [68];
  undefined1 auStack_490 [12];
  undefined1 auStack_484 [12];
  undefined1 auStack_478 [516];
  undefined1 auStack_274 [516];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  (*(code *)PTR_free_00cc4678)(*param_1);
  lVar8 = (*(code *)PTR_strdup_00cc4688)(param_2);
  *param_1 = lVar8;
  if (lVar8 == 0) {
    uVar9 = 0x1b;
  }
  else {
    __stream = fopen(param_2,"r");
    uVar9 = 0;
    if (__stream != (FILE *)0x0) {
      FUN_00904528(auStack_508,0xfff);
      iVar5 = FUN_009049b8(auStack_508,__stream);
      if (iVar5 != 0) {
        do {
          for (__s = (char *)FUN_00904974(auStack_508);
              (cVar1 = *__s, cVar1 == '\t' || (cVar1 == ' ')); __s = __s + 1) {
          }
          if ((cVar1 != '#') &&
             (iVar5 = sscanf(__s,"%10s %512s %u %10s %512s %u \"%64[^\"]\" %u %u",auStack_484,
                             auStack_274,&uStack_4d8,auStack_490,auStack_478,&local_4dc,auStack_4d4,
                             &local_4e4,&local_4e0), iVar5 == 9)) {
            uVar9 = FUN_009313b8(auStack_4d4);
            uVar4 = uStack_4d8;
            uVar3 = local_4dc;
            iVar5 = curl_strequal(auStack_490,&DAT_002a16c6);
            if (iVar5 == 0) {
              iVar5 = curl_strequal(auStack_490,&DAT_002a7217);
              if (iVar5 == 0) {
                iVar7 = curl_strequal(auStack_490,&DAT_002cee98);
                iVar5 = 0;
                if (iVar7 != 0) {
                  iVar5 = 0x20;
                }
              }
              else {
                iVar5 = 0x10;
              }
            }
            else {
              iVar5 = 8;
            }
            iVar7 = curl_strequal(auStack_484,&DAT_002a16c6);
            if (iVar7 == 0) {
              iVar7 = curl_strequal(auStack_484,&DAT_002a7217);
              if (iVar7 == 0) {
                iVar6 = curl_strequal(auStack_484,&DAT_002cee98);
                iVar7 = 0;
                if (iVar6 != 0) {
                  iVar7 = 0x20;
                }
              }
              else {
                iVar7 = 0x10;
              }
            }
            else {
              iVar7 = 8;
            }
            if (((iVar5 != 0) && (iVar7 != 0)) &&
               (lVar8 = FUN_00904258(auStack_274,auStack_478,iVar7,iVar5,uVar4,uVar3), lVar8 != 0))
            {
              *(undefined8 *)(lVar8 + 0x20) = uVar9;
              *(undefined4 *)(lVar8 + 0x2c) = local_4e0;
              *(bool *)(lVar8 + 0x28) = local_4e4 != 0;
              FUN_00925d10(param_1 + 1,lVar8,lVar8 + 0x30);
            }
          }
          iVar5 = FUN_009049b8(auStack_508,__stream);
        } while (iVar5 != 0);
      }
      FUN_00904534(auStack_508);
      fclose(__stream);
      uVar9 = 0;
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar9);
  }
  return;
}

