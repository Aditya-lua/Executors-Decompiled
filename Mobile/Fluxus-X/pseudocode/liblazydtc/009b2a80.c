/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2a80
 */

long SSL_ctrl(SSL *ssl,int cmd,long larg,void *parg)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined4 uVar4;
  int iVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  uint uVar9;
  char **ppcVar10;
  
  uVar9 = (uint)larg;
  switch(cmd) {
  case 0x10:
    *(void **)&ssl[1].tlsext_ocsp_resplen = parg;
    uVar7 = 1;
    break;
  default:
                    /* WARNING: Could not recover jumptable at 0x009b2ad0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    lVar6 = (*ssl->method->ssl_ctrl)(ssl,cmd,larg,parg);
    return lVar6;
  case 0x21:
    uVar9 = *(uint *)&ssl[3].tlsext_debug_arg | uVar9;
    uVar7 = (ulong)uVar9;
    *(uint *)&ssl[3].tlsext_debug_arg = uVar9;
    break;
  case 0x28:
    uVar7 = (ulong)*(int *)&ssl[4].client_CA;
    break;
  case 0x29:
    uVar7 = (ulong)*(int *)&ssl[4].client_CA;
    *(uint *)&ssl[4].client_CA = uVar9;
    break;
  case 0x32:
    uVar7._0_4_ = ssl[3].servername_done;
    uVar7._4_4_ = ssl[3].tlsext_status_type;
    break;
  case 0x33:
    if (-1 < larg) {
      ssl[3].servername_done = (int)larg;
      ssl[3].tlsext_status_type = (int)((ulong)larg >> 0x20);
      lVar8._0_4_ = ssl[3].servername_done;
      lVar8._4_4_ = ssl[3].tlsext_status_type;
      return lVar8;
    }
    goto LAB_009b2dac;
  case 0x34:
    if (0x3e00 < larg - 0x200U) {
      return 0;
    }
    ssl[3].tlsext_ocsp_exts = (X509_EXTENSIONS *)larg;
    if (ssl[3].tlsext_ocsp_ids <= (ulong)larg) {
      return 1;
    }
    goto LAB_009b2d58;
  case 0x4c:
    uVar7 = (ulong)(int)ssl[1].max_send_fragment;
    break;
  case 0x4e:
    uVar9 = *(uint *)&ssl[3].tlsext_debug_arg & (uVar9 ^ 0xffffffff);
    uVar7 = (ulong)uVar9;
    *(uint *)&ssl[3].tlsext_debug_arg = uVar9;
    break;
  case 99:
    uVar9 = *(uint *)((ssl[3].d1)->cookie + 0x18) | uVar9;
    uVar7 = (ulong)uVar9;
    *(uint *)((ssl[3].d1)->cookie + 0x18) = uVar9;
    break;
  case 100:
    uVar9 = *(uint *)((ssl[3].d1)->cookie + 0x18) & (uVar9 ^ 0xffffffff);
    uVar7 = (ulong)uVar9;
    *(uint *)((ssl[3].d1)->cookie + 0x18) = uVar9;
    break;
  case 0x6e:
    if (parg == (void *)0x0) {
      return 2;
    }
    if (ssl[1].msg_callback_arg != (void *)0x0) {
      *(void **)parg = ssl[1].msg_callback_arg;
      return (long)ssl[1].hit;
    }
LAB_009b2dac:
    uVar7 = 0;
    break;
  case 0x7a:
    lVar6._0_4_ = ssl[3].sid_ctx_length;
    lVar6._4_1_ = ssl[3].sid_ctx[0];
    lVar6._5_1_ = ssl[3].sid_ctx[1];
    lVar6._6_1_ = ssl[3].sid_ctx[2];
    lVar6._7_1_ = ssl[3].sid_ctx[3];
    if (((lVar6 == 0) || (iVar5 = SSL_in_init(ssl), iVar5 != 0)) ||
       (iVar5 = ossl_statem_get_in_handshake(ssl), iVar5 != 0)) {
      uVar7 = 0xffffffffffffffff;
    }
    else {
      uVar7 = (ulong)*(uint *)(*(long *)&ssl[3].sid_ctx_length + 0x388) & 1;
    }
    break;
  case 0x7b:
    uVar3 = *(uint *)&ssl[3].tlsext_hostname;
    uVar1 = uVar9 & 0xffffff00;
    uVar2 = uVar3 & 0xffffff00;
    if ((((uVar3 != 0) && (uVar9 == 0x100 || uVar1 == 0xfe00)) && (uVar3 != 0x100)) &&
       (uVar2 != 0xfe00)) {
      return 0;
    }
    if ((uVar9 != 0) && ((uVar3 == 0x100 || uVar2 == 0xfe00) && (uVar9 != 0x100 && uVar1 != 0xfe00))
       ) {
      return 0;
    }
    if ((uVar9 != 0x100 && uVar1 != 0xfe00) && (uVar3 != 0x100 && uVar2 != 0xfe00)) {
      if (((uVar9 != 0) && ((int)uVar9 < 0x300)) && (uVar3 == 0 || 0x2ff < (int)uVar3)) {
        return 0;
      }
    }
    uVar4 = **(undefined4 **)(*(long *)&ssl[3].ex_data.dummy + 8);
    ppcVar10 = (char **)((long)&ssl[3].tlsext_debug_arg + 4);
    goto LAB_009b2d2c;
  case 0x7c:
    uVar3 = *(uint *)((long)&ssl[3].tlsext_debug_arg + 4);
    uVar1 = uVar9 & 0xffffff00;
    uVar2 = uVar3 & 0xffffff00;
    if ((((uVar9 != 0) && (uVar3 == 0x100 || uVar2 == 0xfe00)) && (uVar9 != 0x100)) &&
       (uVar1 != 0xfe00)) {
      return 0;
    }
    if ((uVar3 != 0) && ((uVar9 == 0x100 || uVar1 == 0xfe00) && (uVar3 != 0x100 && uVar2 != 0xfe00))
       ) {
      return 0;
    }
    if ((((uVar9 != 0x100 && uVar1 != 0xfe00) && (uVar3 != 0x100 && uVar2 != 0xfe00)) &&
        (0x2ff < (int)uVar9 || uVar9 == 0)) && ((uVar3 != 0 && ((int)uVar3 < 0x300)))) {
      return 0;
    }
    uVar4 = **(undefined4 **)(*(long *)&ssl[3].ex_data.dummy + 8);
    ppcVar10 = &ssl[3].tlsext_hostname;
LAB_009b2d2c:
    iVar5 = ssl_set_version_bound(uVar4,larg & 0xffffffff,ppcVar10);
    uVar7 = (ulong)(iVar5 != 0);
    break;
  case 0x7d:
    if (ssl[3].tlsext_ocsp_exts <= (X509_EXTENSIONS *)(larg + -1)) {
      return 0;
    }
LAB_009b2d58:
    ssl[3].tlsext_ocsp_ids = (stack_st_OCSP_RESPID *)larg;
    uVar7 = 1;
    break;
  case 0x7e:
    uVar7 = 0;
    if (larg - 1U < 0x20) {
      uVar7 = 1;
      ssl[3].tlsext_ocsp_resp = (uchar *)larg;
      if (1 < larg) {
        *(undefined4 *)&ssl[4].client_CA = 1;
      }
    }
    break;
  case 0x82:
    uVar7 = (ulong)*(int *)((long)&ssl[3].tlsext_debug_arg + 4);
    break;
  case 0x83:
    uVar7 = (ulong)*(int *)&ssl[3].tlsext_hostname;
    break;
  case 0x88:
    ssl->rwstate = 8;
    uVar7 = 1;
  }
  return uVar7;
}

