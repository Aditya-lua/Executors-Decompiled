/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aef928
 */

undefined8 FUN_00aef928(undefined8 param_1,UI_STRING *param_2)

{
  FILE *param0;
  UI_string_types UVar1;
  uint uVar2;
  int iVar3;
  char *pcVar4;
  char *__s2;
  undefined8 uVar5;
  
  UVar1 = UI_get_string_type(param_2);
  param0 = DAT_00d22330;
  if (UVar1 == UIT_PROMPT) {
    pcVar4 = UI_get0_output_string(param_2);
    fputs(pcVar4,DAT_00d22330);
    fflush(DAT_00d22330);
    uVar2 = UI_get_input_flags(param_2);
    uVar5 = 1;
LAB_00aef9dc:
    uVar5 = FUN_00aefafc(param_1,param_2,uVar2 & 1,uVar5);
    return uVar5;
  }
  if (UVar1 == UIT_VERIFY) {
    pcVar4 = UI_get0_output_string(param_2);
    fprintf(param0,"Verifying - %s",pcVar4);
    fflush(DAT_00d22330);
    uVar2 = UI_get_input_flags(param_2);
    uVar5 = FUN_00aefafc(param_1,param_2,uVar2 & 1,1);
    if ((int)uVar5 < 1) {
      return uVar5;
    }
    pcVar4 = UI_get0_result_string(param_2);
    __s2 = UI_get0_test_string(param_2);
    iVar3 = strcmp(pcVar4,__s2);
    if (iVar3 != 0) {
      fwrite("Verify failure\n",0xf,1,DAT_00d22330);
      fflush(DAT_00d22330);
      return 0;
    }
  }
  else if (UVar1 == UIT_BOOLEAN) {
    pcVar4 = UI_get0_output_string(param_2);
    fputs(pcVar4,DAT_00d22330);
    pcVar4 = UI_get0_action_string(param_2);
    fputs(pcVar4,DAT_00d22330);
    fflush(DAT_00d22330);
    uVar2 = UI_get_input_flags(param_2);
    uVar5 = 0;
    goto LAB_00aef9dc;
  }
  return 1;
}

