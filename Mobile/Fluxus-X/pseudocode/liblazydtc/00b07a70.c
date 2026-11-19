/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b07a70
 */

uint FUN_00b07a70(ASN1_STRING *param_1,int param_2,code *param_3,undefined4 param_4,void *param_5,
                 size_t param_6,long *param_7)

{
  uint uVar1;
  int iVar2;
  uchar *__s1;
  long lVar3;
  uchar *local_48;
  
  __s1 = param_1->data;
  if (__s1 != (uchar *)0x0) {
    iVar2 = param_1->length;
    if (iVar2 != 0) {
      if (param_2 < 1) {
        iVar2 = ASN1_STRING_to_UTF8(&local_48,param_1);
        if (-1 < iVar2) {
          uVar1 = (*param_3)(local_48,(long)iVar2,param_5,param_6,param_4);
          if ((param_7 != (long *)0x0) && (0 < (int)uVar1)) {
            lVar3 = CRYPTO_strndup(local_48,(long)iVar2,"crypto/x509/v3_utl.c",0x361);
            *param_7 = lVar3;
            if (lVar3 == 0) {
              CRYPTO_free(local_48);
              return 0xffffffff;
            }
          }
          CRYPTO_free(local_48);
          return uVar1;
        }
      }
      else {
        if (param_1->type != param_2) {
          return 0;
        }
        if (param_2 == 0x16) {
          uVar1 = (*param_3)(__s1,(long)iVar2,param_5,param_6,param_4);
        }
        else {
          if (iVar2 != (int)param_6) {
            return 0;
          }
          iVar2 = memcmp(__s1,param_5,param_6);
          uVar1 = (uint)(iVar2 == 0);
        }
        if (param_7 == (long *)0x0) {
          return uVar1;
        }
        if ((int)uVar1 < 1) {
          return uVar1;
        }
        lVar3 = CRYPTO_strndup(param_1->data,(long)param_1->length,"crypto/x509/v3_utl.c",0x350);
        *param_7 = lVar3;
        if (lVar3 != 0) {
          return uVar1;
        }
      }
      return 0xffffffff;
    }
  }
  return 0;
}

