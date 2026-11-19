/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b94e0
 */

undefined8 SSL_verify_client_post_handshake(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
    if (*(int *)(param_1 + 0x38) == 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x16f8,"SSL_verify_client_post_handshake");
      uVar2 = 0x11c;
    }
    else {
      iVar1 = SSL_is_init_finished(param_1);
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0x16fd,"SSL_verify_client_post_handshake");
        uVar2 = 0x79;
      }
      else {
        switch(*(undefined4 *)(param_1 + 0xba8)) {
        case 0:
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x1703,"SSL_verify_client_post_handshake");
          uVar2 = 0x117;
          break;
        default:
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x1707,"SSL_verify_client_post_handshake");
          uVar2 = 0xc0103;
          break;
        case 2:
          *(undefined4 *)(param_1 + 0xba8) = 3;
          iVar1 = send_certificate_request(param_1);
          if (iVar1 != 0) {
            ossl_statem_set_in_init(param_1,1);
            return 1;
          }
          *(undefined4 *)(param_1 + 0xba8) = 2;
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x1718,"SSL_verify_client_post_handshake");
          uVar2 = 0x11b;
          break;
        case 3:
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x170c,"SSL_verify_client_post_handshake");
          uVar2 = 0x11d;
          break;
        case 4:
          ERR_new();
          ERR_set_debug("ssl/ssl_lib.c",0x170f,"SSL_verify_client_post_handshake");
          uVar2 = 0x11e;
        }
      }
    }
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x16f4,"SSL_verify_client_post_handshake");
    uVar2 = 0x10a;
  }
  ERR_set_error(0x14,uVar2,0);
  return 0;
}

