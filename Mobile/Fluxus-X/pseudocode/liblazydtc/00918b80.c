/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00918b80
 */

void FUN_00918b80(undefined8 param_1,long param_2,char *param_3)

{
  char cVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  FILE *__stream;
  char *pcVar5;
  size_t sVar6;
  long lVar7;
  long lVar8;
  undefined8 uVar9;
  size_t sVar10;
  undefined1 auStack_1d8 [32];
  char acStack_1b8 [68];
  char local_174 [260];
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_2 + 0x20));
  lVar4 = (*(code *)PTR_strdup_00cc4688)(param_3);
  *(long *)(param_2 + 0x20) = lVar4;
  if (lVar4 == 0) {
    uVar9 = 0x1b;
  }
  else {
    __stream = fopen(param_3,"r");
    uVar9 = 0;
    if (__stream != (FILE *)0x0) {
      FUN_00904528(auStack_1d8,0xfff);
      iVar3 = FUN_009049b8(auStack_1d8,__stream);
      if (iVar3 != 0) {
        do {
          pcVar5 = (char *)FUN_00904974(auStack_1d8);
          while( true ) {
            cVar1 = *pcVar5;
            if ((cVar1 != '\t') && (cVar1 != ' ')) break;
            pcVar5 = pcVar5 + 1;
          }
          if (((cVar1 != '#') && (sVar6 = strlen(pcVar5), 1 < sVar6)) &&
             (iVar3 = sscanf(pcVar5,"%256s \"%64[^\"]\"",local_174,acStack_1b8), iVar3 == 2)) {
            iVar3 = strcmp(acStack_1b8,"unlimited");
            if (iVar3 == 0) {
              lVar4 = 0x7fffffffffffffff;
            }
            else {
              lVar4 = FUN_009313b8(acStack_1b8);
            }
            cVar1 = local_174[0];
            pcVar5 = (char *)((ulong)local_174 | 1);
            if (local_174[0] != '.') {
              pcVar5 = local_174;
            }
            lVar7 = FUN_00918714(param_2,pcVar5,local_174[0] == '.');
            if (lVar7 == 0) {
              sVar6 = strlen(pcVar5);
              if (((sVar6 != 0) &&
                  ((sVar10 = sVar6 - 1, pcVar5[sVar10] != '.' || (sVar6 = sVar10, sVar10 != 0)))) &&
                 (lVar7 = (*(code *)PTR_calloc_00cc4690)(1,0x30), lVar7 != 0)) {
                lVar8 = FUN_00941948(pcVar5,sVar6);
                if (lVar8 == 0) {
                  (*(code *)PTR_free_00cc4678)(lVar7);
                }
                else {
                  *(long *)(lVar7 + 0x18) = lVar8;
                  *(long *)(lVar7 + 0x28) = lVar4;
                  *(bool *)(lVar7 + 0x20) = cVar1 == '.';
                  FUN_00925d10(param_2,lVar7,lVar7);
                }
              }
            }
            else if (*(long *)(lVar7 + 0x28) < lVar4) {
              *(long *)(lVar7 + 0x28) = lVar4;
            }
          }
          iVar3 = FUN_009049b8(auStack_1d8,__stream);
        } while (iVar3 != 0);
      }
      FUN_00904534(auStack_1d8);
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

