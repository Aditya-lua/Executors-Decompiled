/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1777c
 */

/* WARNING: Removing unreachable block (ram,0x00b178a0) */

undefined8 FUN_00b1777c(long param_1,char *param_2,BIO *param_3)

{
  undefined4 uVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  FILE *local_28;
  
  local_28 = (FILE *)0x0;
  if ((param_1 == 0) || ((param_2 != (char *)0x0 && (param_3 == (BIO *)0x0)))) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x11a,"set1_content");
    uVar1 = 0xc0102;
LAB_00b177d4:
    ERR_set_error(0x3d,uVar1,0);
LAB_00b177dc:
    uVar4 = 0;
  }
  else {
    if ((*(int *)(param_1 + 0xa0) != 0) &&
       (uVar4 = OSSL_HTTP_REQ_CTX_add1_header(param_1,"Connection","keep-alive"), (int)uVar4 == 0))
    {
      return uVar4;
    }
    iVar3 = BIO_free(*(BIO **)(param_1 + 0x60));
    *(undefined8 *)(param_1 + 0x60) = 0;
    if (param_3 != (BIO *)0x0) {
      if (*(int *)(param_1 + 0x68) == 0) {
        ERR_new(iVar3);
        ERR_set_debug("crypto/http/http_client.c",0x127,"set1_content");
        uVar1 = 0xc0101;
        goto LAB_00b177d4;
      }
      if ((param_2 != (char *)0x0) &&
         (iVar3 = BIO_printf(*(BIO **)(param_1 + 0x58),"Content-Type: %s\r\n",param_2), iVar3 < 1))
      goto LAB_00b177dc;
      iVar3 = BIO_method_type(param_3);
      if (iVar3 == 0x402) {
        lVar5 = BIO_ctrl(param_3,0x6b,0,&local_28);
        if ((lVar5 == 1) && (iVar3 = fseek(local_28,0,2), iVar3 == 0)) {
          lVar5 = ftell(local_28);
          fseek(local_28,0,0);
          bVar2 = local_28 != (FILE *)0x0;
          if (0 < lVar5) goto LAB_00b178f8;
        }
        else {
          bVar2 = false;
          lVar5 = 0;
          local_28 = (FILE *)0x0;
        }
LAB_00b178f4:
        if (bVar2) goto LAB_00b178f8;
      }
      else {
        lVar5 = BIO_ctrl(param_3,3,0,(void *)0x0);
        bVar2 = false;
        if (lVar5 < 1) goto LAB_00b178f4;
LAB_00b178f8:
        iVar3 = BIO_printf(*(BIO **)(param_1 + 0x58),"Content-Length: %ld\r\n",lVar5);
        if (iVar3 < 0) goto LAB_00b177dc;
      }
      uVar4 = BIO_up_ref(param_3);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      *(BIO **)(param_1 + 0x60) = param_3;
    }
    uVar4 = 1;
  }
  return uVar4;
}

