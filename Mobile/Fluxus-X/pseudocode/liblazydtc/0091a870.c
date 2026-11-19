/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091a870
 */

undefined8
FUN_0091a870(long param_1,undefined8 param_2,long param_3,undefined8 param_4,ulong param_5)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  byte *pbVar4;
  size_t sVar5;
  byte *__s;
  ulong uVar6;
  
  uVar3 = curl_strnequal();
  if ((int)uVar3 != 0) {
    for (__s = (byte *)(param_1 + param_3);
        ((bVar1 = *__s, bVar1 == 9 || (bVar1 == 0x20)) || ((bVar1 != 0 && (bVar1 - 10 < 4))));
        __s = __s + 1) {
    }
    pbVar4 = (byte *)strchr((char *)__s,0xd);
    if ((pbVar4 == (byte *)0x0) && (pbVar4 = (byte *)strchr((char *)__s,10), pbVar4 == (byte *)0x0))
    {
      sVar5 = strlen((char *)__s);
      pbVar4 = __s + sVar5;
    }
    uVar6 = (long)pbVar4 - (long)__s;
    uVar3 = 0;
    if (param_5 <= uVar6) {
      do {
        iVar2 = curl_strnequal(__s,param_4,param_5);
        if (iVar2 != 0) {
          return 1;
        }
        uVar6 = uVar6 - 1;
        __s = __s + 1;
      } while (param_5 <= uVar6);
      uVar3 = 0;
    }
  }
  return uVar3;
}

