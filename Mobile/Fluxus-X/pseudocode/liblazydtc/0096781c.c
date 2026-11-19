/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096781c
 */

undefined8
FUN_0096781c(undefined8 param_1,undefined8 param_2,long param_3,undefined8 param_4,
            undefined8 param_5)

{
  char *__s;
  size_t sVar1;
  undefined8 uVar2;
  
  if ((param_3 == 0x50) || (param_3 == 0)) {
    __s = (char *)curl_maprintf(&DAT_002b71b1,param_1,param_2,param_4);
  }
  else {
    __s = (char *)curl_maprintf(&DAT_002a1aa9,param_1,param_2);
  }
  if (__s == (char *)0x0) {
    uVar2 = 0x1b;
  }
  else {
    sVar1 = strlen(__s);
    FUN_0092525c(param_5,__s,sVar1,curl_free);
    uVar2 = 0;
  }
  return uVar2;
}

