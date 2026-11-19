/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8134
 */

undefined8 SSL_get0_peer_scts(long param_1)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  OCSP_RESPONSE *resp;
  OCSP_BASICRESP *bs;
  OCSP_SINGLERESP *x;
  X509 *x_00;
  void *pvVar4;
  int idx;
  uchar *local_48;
  
  if (*(int *)(param_1 + 0xb80) == 0) {
    if (*(uchar **)(param_1 + 0xa68) == (uchar *)0x0) {
LAB_009b81a0:
      if ((*(uchar **)(param_1 + 0xa88) == (uchar *)0x0) || (*(long *)(param_1 + 0xa90) == 0)) {
        bs = (OCSP_BASICRESP *)0x0;
        resp = (OCSP_RESPONSE *)0x0;
LAB_009b825c:
        iVar1 = 0;
        pvVar4 = (void *)0x0;
      }
      else {
        local_48 = *(uchar **)(param_1 + 0xa88);
        resp = d2i_OCSP_RESPONSE((OCSP_RESPONSE **)0x0,&local_48,
                                 (long)(int)*(long *)(param_1 + 0xa90));
        if (resp == (OCSP_RESPONSE *)0x0) {
          bs = (OCSP_BASICRESP *)0x0;
          goto LAB_009b825c;
        }
        bs = OCSP_response_get1_basic(resp);
        if ((bs == (OCSP_BASICRESP *)0x0) || (iVar1 = OCSP_resp_count(bs), iVar1 < 1))
        goto LAB_009b825c;
        idx = 0;
        pvVar4 = (void *)0x0;
        iVar1 = 0;
        do {
          x = OCSP_resp_get0(bs,idx);
          if (x != (OCSP_SINGLERESP *)0x0) {
            pvVar4 = OCSP_SINGLERESP_get1_ext_d2i(x,0x3ba,(int *)0x0,(int *)0x0);
            iVar1 = FUN_009b9958(param_1 + 0xb78,pvVar4,3);
            if (iVar1 < 0) break;
          }
          idx = idx + 1;
          iVar2 = OCSP_resp_count(bs);
        } while (idx < iVar2);
      }
      SCT_LIST_free(pvVar4);
      OCSP_BASICRESP_free(bs);
      OCSP_RESPONSE_free(resp);
      if (-1 < iVar1) {
        if ((*(long *)(param_1 + 0x918) != 0) &&
           (x_00 = *(X509 **)(*(long *)(param_1 + 0x918) + 0x2b8), x_00 != (X509 *)0x0)) {
          pvVar4 = X509_get_ext_d2i(x_00,0x3b7,(int *)0x0,(int *)0x0);
          iVar1 = FUN_009b9958(param_1 + 0xb78,pvVar4,2);
          SCT_LIST_free(pvVar4);
          if (iVar1 < 0) goto LAB_009b82cc;
        }
        *(undefined4 *)(param_1 + 0xb80) = 1;
        goto LAB_009b8158;
      }
    }
    else {
      local_48 = *(uchar **)(param_1 + 0xa68);
      uVar3 = o2i_SCT_LIST(0,&local_48,*(undefined2 *)(param_1 + 0xa70));
      iVar1 = FUN_009b9958(param_1 + 0xb78,uVar3,1);
      SCT_LIST_free(uVar3);
      if (-1 < iVar1) goto LAB_009b81a0;
    }
LAB_009b82cc:
    uVar3 = 0;
  }
  else {
LAB_009b8158:
    uVar3 = *(undefined8 *)(param_1 + 0xb78);
  }
  return uVar3;
}

