/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba78c0
 */

ulong mbedtls_rsa_rsaes_pkcs1_v15_encrypt
                (long param_1,code *param_2,undefined8 param_3,ulong param_4,void *param_5,
                undefined1 *param_6)

{
  char *pcVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  int iVar5;
  
  if (((0xfffffffffffffff4 < param_4) || (uVar3 = *(ulong *)(param_1 + 8), uVar3 < param_4 + 0xb))
     || (*param_6 = 0, param_2 == (code *)0x0)) {
    return 0xffffbf80;
  }
  pcVar1 = param_6 + 2;
  lVar4 = (-3 - param_4) + uVar3;
  param_6[1] = 2;
  do {
    if (lVar4 == 0) {
      *pcVar1 = '\0';
      if (param_4 != 0) {
        memcpy(pcVar1 + 1,param_5,param_4);
      }
      uVar3 = mbedtls_rsa_public(param_1,param_6,param_6);
      return uVar3;
    }
    lVar4 = lVar4 + -1;
    iVar5 = 100;
    do {
      iVar2 = (*param_2)(param_3,pcVar1,1);
      if ((*pcVar1 != '\0') || (iVar5 = iVar5 + -1, iVar5 == 0)) break;
    } while (iVar2 == 0);
    if ((iVar2 != 0) || (iVar5 == 0)) {
      return (ulong)(iVar2 - 0x4480);
    }
    pcVar1 = pcVar1 + 1;
  } while( true );
}

