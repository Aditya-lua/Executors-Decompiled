/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b9e4
 */

undefined8
FUN_00a9b9e4(char *param_1,ulong param_2,ulong *param_3,byte *param_4,long param_5,char param_6)

{
  ulong uVar1;
  char *pcVar2;
  
  uVar1 = param_5 * 3;
  if (param_6 == '\0') {
    uVar1 = param_5 << 1 | 1;
  }
  if (param_3 != (ulong *)0x0) {
    *param_3 = uVar1;
  }
  if (param_1 != (char *)0x0) {
    if (param_2 < uVar1) {
      ERR_new();
      ERR_set_debug("crypto/o_str.c",0xee,"buf2hexstr_sep");
      ERR_set_error(0xf,0x74,0);
      return 0;
    }
    for (; param_5 != 0; param_5 = param_5 + -1) {
      *param_1 = "0123456789ABCDEF"[*param_4 >> 4];
      param_1[1] = "0123456789ABCDEF"[(ulong)*param_4 & 0xf];
      if (param_6 == '\0') {
        pcVar2 = param_1 + 2;
      }
      else {
        pcVar2 = param_1 + 3;
        param_1[2] = param_6;
      }
      param_4 = param_4 + 1;
      param_1 = pcVar2;
    }
    pcVar2 = param_1 + -1;
    if (param_6 == '\0') {
      pcVar2 = param_1;
    }
    *pcVar2 = '\0';
  }
  return 1;
}

