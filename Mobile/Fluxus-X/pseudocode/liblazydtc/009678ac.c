/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009678ac
 */

undefined8 FUN_009678ac(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  char *__s;
  size_t sVar1;
  undefined8 uVar2;
  
  __s = (char *)curl_maprintf(&DAT_002cd1ea,param_1,param_2);
  if (__s == (char *)0x0) {
    uVar2 = 0x1b;
  }
  else {
    sVar1 = strlen(__s);
    FUN_0092525c(param_3,__s,sVar1,curl_free);
    uVar2 = 0;
  }
  return uVar2;
}

