/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908a98
 */

undefined8 FUN_00908a98(ushort *param_1,uint param_2,char *param_3,uint *param_4)

{
  ushort uVar1;
  char *pcVar2;
  undefined4 *puVar3;
  undefined8 uVar4;
  ushort *__cp;
  
  uVar1 = *param_1;
  if (uVar1 == 1) {
    if (param_2 < 3) {
      *param_3 = '\0';
    }
    else {
      curl_msnprintf(param_3,0x2e,&DAT_002b6c62,param_1 + 1);
    }
    *param_4 = 0;
LAB_00908b4c:
    uVar4 = 1;
  }
  else {
    if (uVar1 == 10) {
      __cp = param_1 + 4;
LAB_00908adc:
      pcVar2 = inet_ntop((uint)uVar1,__cp,param_3,0x2e);
      if (pcVar2 != (char *)0x0) {
        *param_4 = (uint)(param_1[1] >> 8) | (param_1[1] & 0xff00ff) << 8;
        goto LAB_00908b4c;
      }
    }
    else if (uVar1 == 2) {
      __cp = param_1 + 2;
      goto LAB_00908adc;
    }
    *param_3 = '\0';
    *param_4 = 0;
    puVar3 = (undefined4 *)__errno();
    uVar4 = 0;
    *puVar3 = 0x61;
  }
  return uVar4;
}

