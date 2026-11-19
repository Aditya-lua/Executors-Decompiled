/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aedd18
 */

int UI_add_input_boolean
              (UI *ui,char *prompt,char *action_desc,char *ok_chars,char *cancel_chars,int flags,
              char *result_buf)

{
  byte bVar1;
  int iVar2;
  char *pcVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  UI *pUVar7;
  byte *pbVar8;
  
  if (ok_chars == (char *)0x0) {
    ERR_new();
    uVar6 = 0xa0;
  }
  else {
    if (cancel_chars != (char *)0x0) {
      bVar1 = *ok_chars;
      pbVar8 = (byte *)ok_chars;
      while (bVar1 != 0) {
        pbVar8 = pbVar8 + 1;
        pcVar3 = strchr(cancel_chars,(uint)bVar1);
        if (pcVar3 != (char *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/ui/ui_lib.c",0xa6,"general_allocate_boolean");
          ERR_set_error(0x28,0x68,0);
        }
        bVar1 = *pbVar8;
      }
      lVar4 = FUN_00aef184(prompt,0,3,flags,result_buf);
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
      *(char **)(lVar4 + 0x38) = cancel_chars;
      *(char **)(lVar4 + 0x28) = action_desc;
      *(char **)(lVar4 + 0x30) = ok_chars;
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

