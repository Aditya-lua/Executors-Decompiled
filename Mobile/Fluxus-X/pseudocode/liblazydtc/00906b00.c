/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00906b00
 */

void FUN_00906b00(long *param_1,long param_2,int param_3,long param_4)

{
  if (*(int *)(param_2 + 0xa8) == param_3) {
    return;
  }
  switch(param_3) {
  case 0:
    if ((param_4 != 0) && ((*(byte *)(param_4 + 0xa85) >> 4 & 1) != 0)) {
      if (*(long *)(param_4 + 0x12a0) == 0) {
        if (param_1 == (long *)0x0) goto LAB_00906c60;
      }
      else if ((param_1 == (long *)0x0) || (*(int *)(*(long *)(param_4 + 0x12a0) + 8) < 1))
      goto LAB_00906c60;
      if (0 < *(int *)(*param_1 + 0xc)) {
        FUN_00904ddc(param_4,param_1,"new tunnel state \'init\'");
      }
    }
LAB_00906c60:
    FUN_0090456c(param_2);
    FUN_0090456c(param_2 + 0x20);
    *(undefined4 *)(param_2 + 0xa8) = 0;
    *(undefined4 *)(param_2 + 0x98) = 1;
    *(undefined8 *)(param_2 + 0xa0) = 0;
    *(byte *)(param_2 + 0xac) = *(byte *)(param_2 + 0xac) & 0xfd;
    return;
  case 1:
    if ((param_4 != 0) && ((*(byte *)(param_4 + 0xa85) >> 4 & 1) != 0)) {
      if (*(long *)(param_4 + 0x12a0) == 0) {
        if (param_1 == (long *)0x0) goto LAB_00906cb4;
      }
      else if ((param_1 == (long *)0x0) || (*(int *)(*(long *)(param_4 + 0x12a0) + 8) < 1))
      goto LAB_00906cb4;
      if (0 < *(int *)(*param_1 + 0xc)) {
        FUN_00904ddc(param_4,param_1,"new tunnel state \'connect\'");
      }
    }
LAB_00906cb4:
    *(undefined4 *)(param_2 + 0xa8) = 1;
    *(undefined4 *)(param_2 + 0x98) = 1;
    FUN_0090456c(param_2);
    return;
  case 2:
    if ((param_4 != 0) && ((*(byte *)(param_4 + 0xa85) >> 4 & 1) != 0)) {
      if (*(long *)(param_4 + 0x12a0) == 0) {
        if (param_1 == (long *)0x0) goto LAB_00906cf8;
      }
      else if ((param_1 == (long *)0x0) || (*(int *)(*(long *)(param_4 + 0x12a0) + 8) < 1))
      goto LAB_00906cf8;
      if (0 < *(int *)(*param_1 + 0xc)) {
        FUN_00904ddc(param_4,param_1,"new tunnel state \'receive\'");
      }
    }
LAB_00906cf8:
    *(undefined4 *)(param_2 + 0xa8) = 2;
    return;
  case 3:
    if ((param_4 != 0) && ((*(byte *)(param_4 + 0xa85) >> 4 & 1) != 0)) {
      if (*(long *)(param_4 + 0x12a0) == 0) {
        if (param_1 == (long *)0x0) goto LAB_00906d28;
      }
      else if ((param_1 == (long *)0x0) || (*(int *)(*(long *)(param_4 + 0x12a0) + 8) < 1))
      goto LAB_00906d28;
      if (0 < *(int *)(*param_1 + 0xc)) {
        FUN_00904ddc(param_4,param_1,"new tunnel state \'response\'");
      }
    }
LAB_00906d28:
    *(undefined4 *)(param_2 + 0xa8) = 3;
    return;
  case 4:
    if ((param_4 != 0) && ((*(byte *)(param_4 + 0xa85) >> 4 & 1) != 0)) {
      if (*(long *)(param_4 + 0x12a0) == 0) {
        if (param_1 != (long *)0x0) goto LAB_00906d38;
      }
      else if ((param_1 != (long *)0x0) && (0 < *(int *)(*(long *)(param_4 + 0x12a0) + 8))) {
LAB_00906d38:
        if ((0 < *(int *)(*param_1 + 0xc)) &&
           (FUN_00904ddc(param_4,param_1,"new tunnel state \'established\'"),
           (*(byte *)(param_4 + 0xa85) >> 4 & 1) == 0)) goto LAB_00906d88;
      }
      if ((*(long *)(param_4 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_4 + 0x12a0) + 8))) {
        FUN_00904c98(param_4,"CONNECT phase completed");
      }
    }
LAB_00906d88:
    *(byte *)(param_4 + 0xd88) = *(byte *)(param_4 + 0xd88) & 0xfc | 1;
    break;
  case 5:
    if ((param_4 != 0) && ((*(byte *)(param_4 + 0xa85) >> 4 & 1) != 0)) {
      if (*(long *)(param_4 + 0x12a0) == 0) {
        if (param_1 != (long *)0x0) goto LAB_00906ddc;
      }
      else if ((param_1 != (long *)0x0) && (0 < *(int *)(*(long *)(param_4 + 0x12a0) + 8))) {
LAB_00906ddc:
        if (0 < *(int *)(*param_1 + 0xc)) {
          FUN_00904ddc(param_4,param_1,"new tunnel state \'failed\'");
        }
      }
    }
    break;
  default:
    goto switchD_00906b48_default;
  }
  *(int *)(param_2 + 0xa8) = param_3;
  FUN_0090456c(param_2);
  FUN_0090456c(param_2 + 0x20);
  *(undefined4 *)(param_4 + 0x1328) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_4 + 0x1300));
  *(undefined8 *)(param_4 + 0x1300) = 0;
switchD_00906b48_default:
  return;
}

