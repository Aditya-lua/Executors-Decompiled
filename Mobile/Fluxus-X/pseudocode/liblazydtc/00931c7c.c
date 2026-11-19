/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931c7c
 */

void FUN_00931c7c(long param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  undefined8 uVar2;
  long *plVar3;
  
  switch(param_2) {
  case 1:
    *(undefined8 *)(param_1 + 0xb50) = param_3;
    *(undefined8 *)(param_1 + 0xb58) = param_4;
    break;
  case 2:
    *(undefined8 *)(param_1 + 0xb40) = param_3;
    *(undefined8 *)(param_1 + 0xb48) = param_4;
    *(byte *)(param_1 + 0xc34) = *(byte *)(param_1 + 0xc34) & 0xfd;
    break;
  case 3:
    uVar2 = FUN_00941e38(param_3,param_4,*(undefined8 *)(param_1 + 0xb50),
                         *(undefined8 *)(param_1 + 0xb58));
    *(undefined8 *)(param_1 + 0xaf8) = uVar2;
    break;
  case 4:
    plVar3 = (long *)(param_1 + 0xb00);
    goto LAB_00931d28;
  case 5:
    plVar3 = (long *)(param_1 + 0xb08);
    goto LAB_00931d28;
  case 6:
    plVar3 = (long *)(param_1 + 0xb10);
    goto LAB_00931d28;
  case 7:
    plVar3 = (long *)(param_1 + 0xb18);
    goto LAB_00931d28;
  case 8:
    if ((*(byte *)(param_1 + 0xc34) >> 1 & 1) != 0) {
      return;
    }
    plVar3 = (long *)(param_1 + 0xb20);
    *(byte *)(param_1 + 0xc34) = *(byte *)(param_1 + 0xc34) | 2;
LAB_00931d28:
    lVar1 = FUN_00941e38(param_3,param_4,*(undefined8 *)(param_1 + 0xb40),
                         *(undefined8 *)(param_1 + 0xb48));
    if (lVar1 < 2) {
      lVar1 = 1;
    }
    *plVar3 = lVar1 + *plVar3;
    break;
  case 10:
    *(undefined8 *)(param_1 + 0xb60) = param_3;
    *(undefined8 *)(param_1 + 0xb68) = param_4;
    break;
  case 0xb:
    uVar2 = FUN_00941e38(param_3,param_4,*(undefined8 *)(param_1 + 0xb30),
                         *(undefined8 *)(param_1 + 0xb38));
    *(undefined8 *)(param_1 + 0xb28) = uVar2;
  }
  return;
}

