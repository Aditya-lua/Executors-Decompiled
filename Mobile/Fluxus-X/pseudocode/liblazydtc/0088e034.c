/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088e034
 */

void FUN_0088e034(undefined8 *param_1,long param_2,undefined4 param_3)

{
  uint uVar1;
  int iVar2;
  undefined4 uVar3;
  size_t sVar4;
  ulong uVar5;
  char *pcVar6;
  undefined8 uVar7;
  
  if (0 < *(int *)(param_1 + 1)) {
    pcVar6 = *(char **)(param_2 + 0x20);
    if (param_1[0x20] != 0) {
      uVar5 = ((ulong)pcVar6 >> 4 ^ (ulong)pcVar6 >> 9) * -0x61c8864680b583eb >>
              ((ulong)*(byte *)(param_1 + 0x21) & 0x3f);
      if ((*(ulong *)(param_1[0x1e] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
        do {
          if (*(char **)(param_1[0x1b] + uVar5 * 0x10) == pcVar6) {
            if (*(int *)(param_1[0x1b] + uVar5 * 0x10 + 8) == 2) goto LAB_0088e134;
            break;
          }
          uVar5 = uVar5 + 1 & param_1[0x1f] - 1;
        } while ((*(ulong *)(param_1[0x1e] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
      }
    }
    uVar7 = *param_1;
    sVar4 = strlen(pcVar6);
    uVar1 = FUN_00875070(uVar7,pcVar6,sVar4);
    if ((int)uVar1 < 0) goto LAB_0088e1bc;
    if (uVar1 < 0x400) {
      iVar2 = FUN_00877dd8();
      uVar5 = FUN_0087515c(*param_1,iVar2);
      if ((uVar5 >> 0xf & 0x1ffff) == 0) {
        FUN_00875cac(*param_1,0xc,param_3,uVar5 & 0xffffffff);
        goto LAB_0088e188;
      }
    }
  }
LAB_0088e134:
  pcVar6 = *(char **)(param_2 + 0x20);
  sVar4 = strlen(pcVar6);
  iVar2 = FUN_00875070(*param_1,pcVar6,sVar4);
  if (-1 < iVar2) {
    uVar7 = *param_1;
    uVar3 = FUN_00877e08(pcVar6,sVar4);
    FUN_00875b54(uVar7,7,param_3,0,uVar3);
LAB_0088e188:
    FUN_00875d18(*param_1,iVar2);
    return;
  }
LAB_0088e1bc:
                    /* WARNING: Subroutine does not return */
  FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
}

