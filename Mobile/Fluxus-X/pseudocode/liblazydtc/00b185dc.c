/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b185dc
 */

undefined8 OSSL_HTTP_REQ_CTX_exchange(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  if (param_1 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x37d,"OSSL_HTTP_REQ_CTX_exchange");
    uVar2 = 0xc0102;
LAB_00b18648:
    ERR_set_error(0x3d,uVar2,0);
  }
  else {
    do {
      iVar1 = OSSL_HTTP_REQ_CTX_nbio(param_1);
      if (iVar1 != -1) {
        if (iVar1 != 0) {
          lVar3 = 0x20;
          if (*param_1 != 0x1007) {
            lVar3 = 0x58;
          }
          return *(undefined8 *)((long)param_1 + lVar3);
        }
        if (*(long *)(param_1 + 0x2e) != 0) {
          return 0;
        }
        lVar3 = *(long *)(param_1 + 0x22);
        ERR_new(0);
        if (lVar3 < 1) {
          ERR_set_debug("crypto/http/http_client.c",0x390,"OSSL_HTTP_REQ_CTX_exchange");
          uVar2 = 0x67;
        }
        else {
          ERR_set_debug("crypto/http/http_client.c",0x38e,"OSSL_HTTP_REQ_CTX_exchange");
          uVar2 = 0x66;
        }
        goto LAB_00b18648;
      }
      iVar1 = BIO_wait(*(undefined8 *)(param_1 + 8),*(undefined8 *)(param_1 + 0x2a),100);
    } while (0 < iVar1);
  }
  return 0;
}

