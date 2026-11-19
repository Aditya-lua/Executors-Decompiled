/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924a2c
 */

undefined8 FUN_00924a2c(long param_1,ulong param_2,long param_3)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  char cVar4;
  char *pcVar5;
  
  lVar1 = param_1 + 0xd18;
  if ((param_2 & 1) == 0) {
    lVar1 = param_1 + 0xce0;
  }
  iVar2 = curl_strnequal(param_3,"Digest",6);
  if (iVar2 != 0) {
    pcVar5 = (char *)(param_3 + 6);
    cVar4 = *pcVar5;
    if ((cVar4 == ' ') || (cVar4 == '\t')) {
      while ((cVar4 == ' ' || (cVar4 == '\t'))) {
        pcVar5 = pcVar5 + 1;
        cVar4 = *pcVar5;
      }
      uVar3 = FUN_00964834(pcVar5,lVar1);
      return uVar3;
    }
  }
  return 0x3d;
}

