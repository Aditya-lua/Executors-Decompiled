/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba79dc
 */

ulong mbedtls_rsa_pkcs1_encrypt
                (long param_1,code *param_2,undefined8 param_3,ulong param_4,void *param_5,
                undefined1 *param_6)

{
  char *pcVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  int iVar6;
  
  if (*(int *)(param_1 + 0xe0) == 1) {
    uVar3 = mbedtls_rsa_rsaes_oaep_encrypt(param_1,param_2,param_3,0,0,param_4,param_5,param_6);
    return uVar3;
  }
  if (*(int *)(param_1 + 0xe0) == 0) {
    uVar3 = 0xffffbf80;
    if ((param_4 < 0xfffffffffffffff5) && (uVar4 = *(ulong *)(param_1 + 8), param_4 + 0xb <= uVar4))
    {
      *param_6 = 0;
      if (param_2 != (code *)0x0) {
        pcVar1 = param_6 + 2;
        lVar5 = uVar4 + (-3 - param_4);
        param_6[1] = 2;
        do {
          if (lVar5 == 0) {
            *pcVar1 = '\0';
            if (param_4 != 0) {
              memcpy(pcVar1 + 1,param_5,param_4);
            }
            uVar3 = mbedtls_rsa_public(param_1,param_6,param_6);
            return uVar3;
          }
          lVar5 = lVar5 + -1;
          iVar6 = 100;
          do {
            iVar2 = (*param_2)(param_3,pcVar1,1);
            if ((*pcVar1 != '\0') || (iVar6 = iVar6 + -1, iVar6 == 0)) break;
          } while (iVar2 == 0);
          if ((iVar2 != 0) || (iVar6 == 0)) {
            return (ulong)(iVar2 - 0x4480);
          }
          pcVar1 = pcVar1 + 1;
        } while( true );
      }
      uVar3 = 0xffffbf80;
    }
  }
  else {
    uVar3 = 0xffffbf00;
  }
  return uVar3;
}

