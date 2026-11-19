/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095bdf4
 */

int FUN_0095bdf4(long param_1)

{
  undefined1 *puVar1;
  char *pcVar2;
  long lVar3;
  int iVar4;
  size_t sVar5;
  ulong uVar6;
  long lVar7;
  char *pcVar8;
  char *pcVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined8 local_68;
  long lStack_60;
  char *local_58;
  undefined8 uStack_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  lVar7 = *(long *)(param_1 + 0x1a0);
  lVar10 = *(long *)(param_1 + 0x20);
  puVar11 = *(undefined8 **)(lVar7 + 0x10);
  if (puVar11 == (undefined8 *)0x0) {
    pcVar9 = *(char **)(lVar7 + 8);
    pcVar8 = "HELP";
    if ((pcVar9 != (char *)0x0) && (pcVar8 = "HELP", *pcVar9 != '\0')) {
      pcVar8 = pcVar9;
    }
    iVar4 = FUN_009453ec(param_1,lVar10 + 0x428,&DAT_002b6c62,pcVar8);
  }
  else {
    pcVar8 = *(char **)(lVar7 + 8);
    if ((pcVar8 == (char *)0x0) || (*pcVar8 == '\0')) {
      uStack_50 = 0;
      local_58 = (char *)0x0;
      lStack_60 = 0;
      local_68 = 0;
      pcVar9 = (char *)**(undefined8 **)(lVar7 + 0x10);
      pcVar8 = pcVar9 + 1;
      if (*pcVar9 != '<') {
        pcVar8 = pcVar9;
      }
      pcVar8 = (char *)(*(code *)PTR_strdup_00cc4688)(pcVar8);
      if (pcVar8 == (char *)0x0) {
        iVar4 = 0x1b;
        goto LAB_0095c00c;
      }
      sVar5 = strlen(pcVar8);
      if ((sVar5 != 0) && (pcVar8[sVar5 - 1] == '>')) {
        pcVar8[sVar5 - 1] = '\0';
      }
      local_58 = strchr(pcVar8,0x40);
      if (local_58 != (char *)0x0) {
        *local_58 = '\0';
        local_58 = local_58 + 1;
        FUN_0095c6d4(&local_68);
      }
      pcVar9 = "";
      if ((*(byte *)(lVar10 + 0x4f8) >> 3 & 1) != 0) {
        if (lStack_60 == 0) {
          uVar6 = FUN_0095c6a8(pcVar8);
          pcVar9 = " SMTPUTF8";
          if ((uVar6 & 1) != 0) {
            uVar6 = FUN_0095c6a8(local_58);
            pcVar9 = "";
            if ((uVar6 & 1) == 0) {
              pcVar9 = " SMTPUTF8";
            }
          }
        }
        else {
          pcVar9 = " SMTPUTF8";
        }
      }
      puVar1 = &DAT_002b94dc;
      pcVar2 = local_58;
      if (local_58 == (char *)0x0) {
        puVar1 = &DAT_002ab32c;
        pcVar2 = "";
      }
      iVar4 = FUN_009453ec(param_1,lVar10 + 0x428,"VRFY %s%s%s%s",pcVar8,puVar1,pcVar2,pcVar9);
      (*(code *)PTR_free_00cc4678)(pcVar8);
    }
    else {
      pcVar9 = "";
      if ((*(byte *)(lVar10 + 0x4f8) >> 3 & 1) != 0) {
        iVar4 = strcmp(pcVar8,"EXPN");
        pcVar9 = " SMTPUTF8";
        if (iVar4 != 0) {
          pcVar9 = "";
        }
      }
      iVar4 = FUN_009453ec(param_1,lVar10 + 0x428,"%s %s%s",pcVar8,*puVar11,pcVar9);
    }
  }
  if (iVar4 == 0) {
    *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4e8) = 7;
  }
LAB_0095c00c:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

