/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9bc38
 */

undefined8 openssl_strerror_r(int param_1,char *param_2,ulong param_3)

{
  char cVar1;
  undefined8 uVar2;
  char *pcVar3;
  char *pcVar4;
  
  uVar2 = 0;
  if ((1 < param_3) && (pcVar3 = strerror(param_1), uVar2 = 0, pcVar3 != (char *)0x0)) {
    do {
      cVar1 = *pcVar3;
      pcVar4 = param_2;
      if (cVar1 == '\0') goto LAB_00a9bc88;
      param_3 = param_3 - 1;
      pcVar3 = pcVar3 + 1;
      pcVar4 = param_2 + 1;
      *param_2 = cVar1;
      param_2 = pcVar4;
    } while (1 < param_3);
    if (param_3 != 0) {
LAB_00a9bc88:
      *pcVar4 = '\0';
    }
    uVar2 = 1;
  }
  return uVar2;
}

