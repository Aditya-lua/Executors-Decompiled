/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aedeb0
 */

int UI_dup_input_boolean
              (UI *ui,char *prompt,char *action_desc,char *ok_chars,char *cancel_chars,int flags,
              char *result_buf)

{
  byte bVar1;
  int iVar2;
  char *pcVar3;
  long lVar4;
  long lVar5;
  char *ptr;
  char *ptr_00;
  byte *ptr_01;
  char *__s;
  undefined8 uVar6;
  UI *pUVar7;
  byte *pbVar8;
  
  if (prompt == (char *)0x0) {
    ptr = (char *)0x0;
joined_r0x00aedf10:
    ptr_00 = (char *)0x0;
    if ((action_desc == (char *)0x0) ||
       (ptr_00 = CRYPTO_strdup(action_desc,"crypto/ui/ui_lib.c",0x117), ptr_00 != (char *)0x0)) {
      ptr_01 = (byte *)0x0;
      if ((ok_chars == (char *)0x0) ||
         (ptr_01 = (byte *)CRYPTO_strdup(ok_chars,"crypto/ui/ui_lib.c",0x11f), ptr_01 != (byte *)0x0
         )) {
        if (cancel_chars == (char *)0x0) {
          __s = (char *)0x0;
LAB_00aee000:
          if (ptr_01 == (byte *)0x0) {
            ERR_new();
            uVar6 = 0xa0;
          }
          else {
            if (__s != (char *)0x0) {
              bVar1 = *ptr_01;
              pbVar8 = ptr_01;
              while (bVar1 != 0) {
                pbVar8 = pbVar8 + 1;
                pcVar3 = strchr(__s,(uint)bVar1);
                if (pcVar3 != (char *)0x0) {
                  ERR_new();
                  ERR_set_debug("crypto/ui/ui_lib.c",0xa6,"general_allocate_boolean");
                  ERR_set_error(0x28,0x68,0);
                }
                bVar1 = *pbVar8;
              }
              lVar4 = FUN_00aef184(ptr,1,3,flags,result_buf);
              if (lVar4 == 0) {
                return -1;
              }
              pUVar7 = ui + 8;
              if (*(long *)pUVar7 == 0) {
                lVar5 = OPENSSL_sk_new_null();
                *(long *)pUVar7 = lVar5;
                if (lVar5 == 0) {
                  FUN_00aed930(lVar4);
                  return -1;
                }
              }
              *(char **)(lVar4 + 0x38) = __s;
              *(char **)(lVar4 + 0x28) = ptr_00;
              *(byte **)(lVar4 + 0x30) = ptr_01;
              iVar2 = OPENSSL_sk_push(*(undefined8 *)pUVar7,lVar4);
              if (iVar2 < 1) {
                FUN_00aed930(lVar4);
                return iVar2 + -1;
              }
              return iVar2;
            }
            ERR_new();
            uVar6 = 0xa2;
          }
          ERR_set_debug("crypto/ui/ui_lib.c",uVar6,"general_allocate_boolean");
          ERR_set_error(0x28,0xc0102,0);
          return -1;
        }
        __s = CRYPTO_strdup(cancel_chars,"crypto/ui/ui_lib.c",0x127);
        if (__s != (char *)0x0) goto LAB_00aee000;
        ERR_new();
        uVar6 = 0x129;
      }
      else {
        ERR_new();
        uVar6 = 0x121;
      }
      ERR_set_debug("crypto/ui/ui_lib.c",uVar6,"UI_dup_input_boolean");
      ERR_set_error(0x28,0xc0100,0);
      goto LAB_00aee064;
    }
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x119,"UI_dup_input_boolean");
    ERR_set_error(0x28,0xc0100,0);
  }
  else {
    ptr = CRYPTO_strdup(prompt,"crypto/ui/ui_lib.c",0x10f);
    if (ptr != (char *)0x0) goto joined_r0x00aedf10;
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x111,"UI_dup_input_boolean");
    ERR_set_error(0x28,0xc0100,0);
    ptr_00 = (char *)0x0;
  }
  ptr_01 = (byte *)0x0;
LAB_00aee064:
  CRYPTO_free(ptr);
  CRYPTO_free(ptr_00);
  CRYPTO_free(ptr_01);
  CRYPTO_free((void *)0x0);
  return -1;
}

