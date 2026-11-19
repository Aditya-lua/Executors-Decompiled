/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06e5c
 */

undefined8 X509_check_ip_asc(undefined8 param_1,long param_2,undefined4 param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_30 [16];
  
  if ((param_2 == 0) || (iVar1 = ossl_a2i_ipadd(auStack_30), iVar1 == 0)) {
    return 0xfffffffe;
  }
  uVar2 = FUN_00b06b10(param_1,auStack_30,(long)iVar1,param_3,7,0);
  return uVar2;
}

