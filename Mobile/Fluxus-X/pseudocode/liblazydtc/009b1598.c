/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b1598
 */

undefined8 OPENSSL_init_ssl(ulong param_1)

{
  undefined8 uVar1;
  
  if (DAT_00d218c8 == '\x01') {
    uVar1 = 0;
    if ((DAT_00d218c4 & 1) == 0) {
      DAT_00d218c4 = 1;
      ERR_new(0);
      ERR_set_debug("ssl/ssl_init.c",0x67,"OPENSSL_init_ssl");
      ERR_set_error(0x14,0xc0105,0);
      uVar1 = 0;
    }
  }
  else {
    uVar1 = OPENSSL_init_crypto(param_1 >> 1 & 0x40 ^ 0x4c | param_1);
    if ((((int)uVar1 != 0) &&
        (uVar1 = CRYPTO_THREAD_run_once(&DAT_00d218cc,FUN_009b16b4), (int)uVar1 != 0)) &&
       (uVar1 = 0, DAT_00d218d0 != '\0')) {
      if (((uint)param_1 >> 0x14 & 1) != 0) {
        uVar1 = CRYPTO_THREAD_run_once(&DAT_00d218d4,&LAB_009b16ec);
        if ((int)uVar1 == 0) {
          return uVar1;
        }
        if (DAT_00d218d8 == '\0') {
          return 0;
        }
      }
      if ((((uint)param_1 >> 0x15 & 1) == 0) ||
         ((uVar1 = CRYPTO_THREAD_run_once(&DAT_00d218d4,FUN_009b16fc), (int)uVar1 != 0 &&
          (uVar1 = 0, DAT_00d218d8 != '\0')))) {
        uVar1 = 1;
      }
    }
  }
  return uVar1;
}

