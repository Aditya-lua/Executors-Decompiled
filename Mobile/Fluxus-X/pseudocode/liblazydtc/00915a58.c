/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00915a58
 */

int FUN_00915a58(undefined8 param_1,char *param_2,undefined8 *param_3,undefined8 *param_4)

{
  long lVar1;
  int iVar2;
  FILE *pFVar3;
  size_t sVar4;
  long lVar5;
  size_t sVar6;
  char *__file;
  stat sStack_128;
  undefined1 auStack_84 [44];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  *param_4 = 0;
  pFVar3 = fopen(param_2,"w");
  *param_3 = pFVar3;
  if (pFVar3 == (FILE *)0x0) {
    __file = (char *)0x0;
LAB_00915b04:
    iVar2 = 0x17;
  }
  else {
    iVar2 = fileno(pFVar3);
    iVar2 = fstat(iVar2,&sStack_128);
    if (iVar2 == -1) {
      iVar2 = 0;
      goto LAB_00915b24;
    }
    iVar2 = 0;
    if (((uint)sStack_128.st_nlink & 0xf000) != 0x8000) goto LAB_00915b24;
    fclose((FILE *)*param_3);
    *param_3 = 0;
    iVar2 = FUN_00932640(param_1,auStack_84,0x29);
    if (iVar2 == 0) {
      FUN_00904528(sStack_128.__unused + 1,&fde_table_entry_007a1200);
      sVar4 = strlen(param_2);
      if (sVar4 == 0) {
LAB_00915bbc:
        sVar4 = 0;
      }
      else {
        do {
          sVar6 = sVar4;
          sVar4 = sVar6 - 1;
          if (sVar4 == 0xffffffffffffffff) {
            sVar6 = 0;
            break;
          }
        } while (param_2[sVar4] != '/');
        do {
          sVar4 = sVar6;
          sVar6 = sVar4 - 1;
          if (sVar6 == 0xffffffffffffffff) goto LAB_00915bbc;
        } while (param_2[sVar6] == '/');
      }
      iVar2 = FUN_009045fc(sStack_128.__unused + 1,param_2,sVar4);
      if ((iVar2 == 0) &&
         (((sVar4 == 0 ||
           (iVar2 = FUN_009045fc(sStack_128.__unused + 1,&DAT_002a91de,1), iVar2 == 0)) &&
          (lVar5 = FUN_00904974(sStack_128.__unused + 1), lVar5 != 0)))) {
        __file = (char *)curl_maprintf("%s%s.tmp",lVar5,auStack_84);
        (*(code *)PTR_free_00cc4678)(lVar5);
        if (__file != (char *)0x0) {
          iVar2 = open(__file,0xc1,(ulong)((uint)sStack_128.st_nlink | 0x180));
          if (iVar2 != -1) {
            pFVar3 = fdopen(iVar2,"w");
            *param_3 = pFVar3;
            if (pFVar3 != (FILE *)0x0) {
              iVar2 = 0;
              *param_4 = __file;
              goto LAB_00915b24;
            }
            close(iVar2);
            unlink(__file);
          }
          goto LAB_00915b04;
        }
        iVar2 = 0x1b;
      }
      else {
        __file = (char *)0x0;
        iVar2 = 0x1b;
      }
    }
    else {
      __file = (char *)0x0;
    }
  }
  (*(code *)PTR_free_00cc4678)(__file);
LAB_00915b24:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

