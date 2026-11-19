/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00904258
 */

long * FUN_00904258(char *param_1,char *param_2,undefined4 param_3,undefined4 param_4,
                   undefined4 param_5,undefined4 param_6)

{
  size_t sVar1;
  undefined2 uVar2;
  long *plVar3;
  size_t sVar4;
  size_t sVar5;
  long lVar6;
  long lVar7;
  
  plVar3 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x48);
  if (plVar3 != (long *)0x0) {
    sVar4 = strlen(param_1);
    sVar5 = strlen(param_2);
    if ((sVar4 != 0) && (sVar5 != 0)) {
      if ((sVar4 < 3) || (*param_1 != '[')) {
        sVar1 = sVar4 - 1;
        if (param_1[sVar4 - 1] != '.') {
          sVar1 = sVar4;
        }
      }
      else {
        param_1 = param_1 + 1;
        sVar1 = sVar4 - 2;
      }
      if ((2 < sVar5) && (*param_2 == '[')) {
        param_2 = param_2 + 1;
        sVar5 = sVar5 - 2;
      }
      lVar6 = FUN_00941948(param_1,sVar1);
      *plVar3 = lVar6;
      lVar7 = 0;
      if (lVar6 != 0) {
        lVar7 = FUN_00941948(param_2,sVar5);
        plVar3[2] = lVar7;
        if (lVar7 != 0) {
          *(undefined4 *)((long)plVar3 + 0xc) = param_3;
          *(undefined4 *)((long)plVar3 + 0x1c) = param_4;
          uVar2 = FUN_00963a54(param_5);
          *(undefined2 *)(plVar3 + 1) = uVar2;
          uVar2 = FUN_00963a54(param_6);
          *(undefined2 *)(plVar3 + 3) = uVar2;
          return plVar3;
        }
        lVar7 = *plVar3;
      }
      (*(code *)PTR_free_00cc4678)(lVar7);
      (*(code *)PTR_free_00cc4678)(plVar3[2]);
    }
    (*(code *)PTR_free_00cc4678)(plVar3);
  }
  return (long *)0x0;
}

