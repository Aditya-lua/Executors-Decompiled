/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f787c
 */

void FUN_009f787c(undefined8 *param_1,ushort *param_2)

{
  char *pcVar1;
  code *UNRECOVERED_JUMPTABLE;
  long lVar2;
  
  do {
    if ((*param_2 & 0x306) != 0) goto switchD_009f78f8_caseD_1;
    pcVar1 = (char *)(**(code **)(param_2 + 0x10))();
    if (*pcVar1 != '\0') {
      switch(*pcVar1) {
      case '\x01':
      case '\x02':
      case '\x06':
        goto switchD_009f78f8_caseD_1;
      default:
        goto switchD_009f78f8_caseD_3;
      case '\x04':
        if ((*(long *)(pcVar1 + 0x20) == 0) ||
           (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(pcVar1 + 0x20) + 0x18),
           UNRECOVERED_JUMPTABLE == (code *)0x0)) goto switchD_009f78f8_caseD_1;
        goto LAB_009f78c8;
      case '\x05':
        if ((pcVar1 == (char *)0x0) || (lVar2 = *(long *)(pcVar1 + 0x20), lVar2 == 0))
        goto switchD_009f78f8_caseD_1;
      }
      goto LAB_009f78c0;
    }
    param_2 = *(ushort **)(pcVar1 + 0x10);
  } while (param_2 != (ushort *)0x0);
  lVar2 = *(long *)(pcVar1 + 0x20);
  if (lVar2 == 0) {
    if (*(int *)(pcVar1 + 8) == 1) {
      *(int *)param_1 = (int)*(undefined8 *)(pcVar1 + 0x28);
      return;
    }
  }
  else {
LAB_009f78c0:
    UNRECOVERED_JUMPTABLE = *(code **)(lVar2 + 0x20);
    if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
LAB_009f78c8:
                    /* WARNING: Could not recover jumptable at 0x009f78d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)(param_1,pcVar1);
      return;
    }
  }
switchD_009f78f8_caseD_1:
  *param_1 = 0;
switchD_009f78f8_caseD_3:
  return;
}

