/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00956d44
 */

void FUN_00956d44(char *param_1,ulong param_2)

{
  char cVar1;
  long lVar2;
  int iVar3;
  size_t sVar4;
  size_t sVar5;
  undefined8 uVar6;
  undefined1 auStack_58 [32];
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  uVar6 = 0;
  if (param_1 != (char *)0x0) {
    sVar4 = strlen(param_1);
    sVar5 = strcspn(param_1,"() {%*]\\\"");
    if (sVar4 == sVar5) {
      uVar6 = (*(code *)PTR_strdup_00cc4688)(param_1);
    }
    else {
      FUN_00904528(auStack_58,2000);
      if ((param_2 & 1) == 0) {
        iVar3 = FUN_009045fc(auStack_58,&DAT_002c6ec4,1);
        uVar6 = 0;
        if (iVar3 != 0) goto LAB_00956e60;
      }
      do {
        cVar1 = *param_1;
        if ((cVar1 == '\"') || (cVar1 == '\\')) {
          iVar3 = FUN_009045fc(auStack_58,&DAT_002ab715,1);
          if (iVar3 != 0) break;
        }
        else if (cVar1 == '\0') {
          if ((param_2 & 1) == 0) {
            iVar3 = FUN_009045fc(auStack_58,&DAT_002c6ec4,1);
            uVar6 = 0;
            if (iVar3 != 0) goto LAB_00956e60;
          }
          uVar6 = FUN_00904974(auStack_58);
          goto LAB_00956e60;
        }
        iVar3 = FUN_009045fc(auStack_58,param_1,1);
        param_1 = param_1 + 1;
      } while (iVar3 == 0);
      uVar6 = 0;
    }
  }
LAB_00956e60:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

