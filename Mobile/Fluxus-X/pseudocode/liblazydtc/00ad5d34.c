/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad5d34
 */

undefined8
ossl_rsa_padding_add_PKCS1_type_2_ex
          (undefined8 param_1,undefined2 *param_2,int param_3,void *param_4,uint param_5)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  char *pcVar5;
  
  if (param_3 + -0xb < (int)param_5) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pk1.c",0x81,"ossl_rsa_padding_add_PKCS1_type_2_ex");
    uVar4 = 0x6e;
  }
  else {
    if (-1 < (int)param_5) {
      pcVar5 = (char *)(param_2 + 1);
      *param_2 = 0x200;
      iVar1 = (param_3 + -3) - param_5;
      iVar2 = RAND_bytes_ex(param_1,pcVar5,(long)iVar1,0);
      if (iVar2 < 1) {
        return 0;
      }
      if (0 < iVar1) {
        iVar2 = 0;
        do {
          while (*pcVar5 == '\0') {
            iVar3 = RAND_bytes_ex(param_1,pcVar5,1,0);
            if (iVar3 < 1) {
              return 0;
            }
          }
          iVar2 = iVar2 + 1;
          pcVar5 = pcVar5 + 1;
        } while (iVar2 < iVar1);
      }
      *pcVar5 = '\0';
      memcpy(pcVar5 + 1,param_4,(ulong)param_5);
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_pk1.c",0x84,"ossl_rsa_padding_add_PKCS1_type_2_ex");
    uVar4 = 0xb5;
  }
  ERR_set_error(4,uVar4,0);
  return 0;
}

