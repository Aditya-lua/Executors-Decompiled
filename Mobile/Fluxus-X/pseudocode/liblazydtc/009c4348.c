/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c4348
 */

undefined8 FUN_009c4348(void *param_1,int param_2,ulong *param_3)

{
  undefined2 uVar1;
  int iVar2;
  char *pcVar3;
  int *piVar4;
  ulong uVar5;
  ulong uVar6;
  undefined2 *puVar7;
  undefined8 local_60;
  char acStack_58 [40];
  
  local_60 = 0;
  if (param_1 == (void *)0x0) {
    return 0;
  }
  if (param_2 < 0x28) {
    uVar6 = *param_3;
    if (uVar6 == 0x38) {
      return 0;
    }
    memcpy(acStack_58,param_1,(long)param_2);
    acStack_58[param_2] = '\0';
    pcVar3 = strchr(acStack_58,0x2b);
    if (pcVar3 == (char *)0x0) {
      puVar7 = &DAT_00c57d28;
      uVar5 = 0;
      do {
        if ((*(char **)(puVar7 + -4) != (char *)0x0) &&
           (iVar2 = strcmp(acStack_58,*(char **)(puVar7 + -4)), iVar2 == 0)) {
          uVar1 = *puVar7;
          *param_3 = uVar6 + 1;
          *(undefined2 *)((long)param_3 + uVar6 * 2 + 8) = uVar1;
          goto joined_r0x009c44cc;
        }
        uVar5 = uVar5 + 1;
        puVar7 = puVar7 + 0x14;
      } while (uVar5 < 0x1c);
      if (uVar5 == 0x1c) {
        return 0;
      }
joined_r0x009c4488:
      uVar6 = uVar6 - 1;
joined_r0x009c44cc:
      if (uVar6 != 0) {
        uVar5 = 0;
        do {
          if (*(short *)((long)param_3 + uVar5 * 2 + 8) == *(short *)((long)param_3 + uVar6 * 2 + 8)
             ) {
            *param_3 = uVar6;
            return 0;
          }
          uVar5 = uVar5 + 1;
        } while (uVar5 < uVar6);
      }
      return 1;
    }
    *pcVar3 = '\0';
    if (pcVar3[1] != '\0') {
      FUN_009c6444((long)&local_60 + 4,&local_60,acStack_58);
      FUN_009c6444((long)&local_60 + 4,&local_60,pcVar3 + 1);
      if (local_60._4_4_ != 0) {
        if ((int)local_60 == 0) {
          return 0;
        }
        uVar6 = 0;
        piVar4 = &DAT_00c57d2c;
        do {
          if ((*piVar4 == (int)local_60) && (piVar4[2] == local_60._4_4_)) {
            uVar6 = *param_3;
            iVar2 = piVar4[-1];
            *param_3 = uVar6 + 1;
            *(short *)((long)param_3 + uVar6 * 2 + 8) = (short)iVar2;
            goto joined_r0x009c44cc;
          }
          uVar6 = uVar6 + 1;
          piVar4 = piVar4 + 10;
        } while (uVar6 < 0x1c);
        if (uVar6 == 0x1c) {
          return 0;
        }
        uVar6 = *param_3;
        goto joined_r0x009c4488;
      }
    }
  }
  return 0;
}

