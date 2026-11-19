/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e1b68
 */

undefined8 dtls_construct_change_cipher_spec(int *param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  
  if (*param_1 == 0x100) {
    lVar2 = *(long *)(param_1 + 0x12e);
    *(short *)(lVar2 + 0x10e) = *(short *)(lVar2 + 0x10e) + 1;
    iVar1 = WPACKET_put_bytes__(param_2,*(undefined2 *)(lVar2 + 0x10c),2);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_dtls.c",999,"dtls_construct_change_cipher_spec");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      return 0;
    }
  }
  return 1;
}

