/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0052c
 */

ulong ossl_a2ucompare(undefined8 param_1,char *param_2)

{
  int iVar1;
  ulong uVar2;
  undefined8 local_230;
  char acStack_224 [516];
  
  local_230 = 0x201;
  iVar1 = ossl_a2ulabel(param_1,acStack_224,&local_230);
  if (iVar1 < 1) {
    uVar2 = 0xffffffff;
  }
  else {
    iVar1 = strcmp(acStack_224,param_2);
    uVar2 = (ulong)(iVar1 != 0);
  }
  return uVar2;
}

