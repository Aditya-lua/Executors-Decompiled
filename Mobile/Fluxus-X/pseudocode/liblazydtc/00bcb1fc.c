/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb1fc
 */

void FUN_00bcb1fc(undefined8 *param_1,undefined8 param_2,int param_3)

{
  char *pcVar1;
  
  if (param_3 < 0x1000) {
    FUN_00bcb00c();
    return;
  }
  pcVar1 = operator_new(0x28);
  param_1[2] = pcVar1;
  pcVar1[0x20] = 'r';
  pcVar1[0x21] = '\0';
  param_1[1] = 0x21;
  *param_1 = 0x29;
  builtin_strncpy(pcVar1,"unspecified system_category erro",0x20);
  return;
}

