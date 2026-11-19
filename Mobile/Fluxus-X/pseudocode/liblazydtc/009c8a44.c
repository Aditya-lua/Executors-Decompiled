/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8a44
 */

undefined4 srp_generate_client_master_secret(long param_1)

{
  uint uVar1;
  int iVar2;
  undefined4 uVar3;
  BIGNUM *a;
  char *__s;
  BIGNUM *a_00;
  BIGNUM *a_01;
  uchar *to;
  size_t sVar4;
  
  iVar2 = SRP_Verify_B_mod_N(*(undefined8 *)(param_1 + 0xc10),*(undefined8 *)(param_1 + 0xbf8));
  if (iVar2 == 0) {
    a = (BIGNUM *)0x0;
  }
  else {
    a = (BIGNUM *)
        SRP_Calc_u_ex(*(undefined8 *)(param_1 + 0xc18),*(undefined8 *)(param_1 + 0xc10),
                      *(undefined8 *)(param_1 + 0xbf8),**(undefined8 **)(param_1 + 0x9a8),
                      (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
    if ((a != (BIGNUM *)0x0) && (*(code **)(param_1 + 0xbe8) != (code *)0x0)) {
      __s = (char *)(**(code **)(param_1 + 0xbe8))(param_1,*(undefined8 *)(param_1 + 0xbd0));
      if (__s == (char *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/tls_srp.c",0x160,"srp_generate_client_master_secret");
        ossl_statem_fatal(param_1,0x50,0xea,0);
        a_00 = (BIGNUM *)0x0;
      }
      else {
        a_00 = (BIGNUM *)
               SRP_Calc_x_ex(*(undefined8 *)(param_1 + 0xc08),*(undefined8 *)(param_1 + 0xbf0),__s,
                             **(undefined8 **)(param_1 + 0x9a8),
                             (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
        if (a_00 != (BIGNUM *)0x0) {
          a_01 = (BIGNUM *)
                 SRP_Calc_client_key_ex
                           (*(undefined8 *)(param_1 + 0xbf8),*(undefined8 *)(param_1 + 0xc10),
                            *(undefined8 *)(param_1 + 0xc00),a_00,*(undefined8 *)(param_1 + 0xc20),a
                            ,**(undefined8 **)(param_1 + 0x9a8),
                            (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
          if (a_01 != (BIGNUM *)0x0) {
            iVar2 = BN_num_bits(a_01);
            uVar1 = iVar2 + 0xe;
            if (-1 < (int)(iVar2 + 7U)) {
              uVar1 = iVar2 + 7U;
            }
            to = CRYPTO_malloc((int)uVar1 >> 3,"ssl/tls_srp.c",0x16f);
            if (to == (uchar *)0x0) {
              ERR_new();
              ERR_set_debug("ssl/tls_srp.c",0x170,"srp_generate_client_master_secret");
              ossl_statem_fatal(param_1,0x50,0xc0100,0);
              uVar3 = 0;
            }
            else {
              BN_bn2bin(a_01,to);
              uVar3 = ssl_generate_master_secret(param_1,to,(long)((ulong)uVar1 << 0x20) >> 0x23,1);
            }
            goto LAB_009c8ba8;
          }
        }
        ERR_new();
        ERR_set_debug("ssl/tls_srp.c",0x16a,"srp_generate_client_master_secret");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
      }
      a_01 = (BIGNUM *)0x0;
      uVar3 = 0;
      goto LAB_009c8ba8;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/tls_srp.c",0x15a,"srp_generate_client_master_secret");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  a_00 = (BIGNUM *)0x0;
  a_01 = (BIGNUM *)0x0;
  uVar3 = 0;
  __s = (char *)0x0;
LAB_009c8ba8:
  BN_clear_free(a_01);
  BN_clear_free(a_00);
  if (__s != (char *)0x0) {
    sVar4 = strlen(__s);
    CRYPTO_clear_free(__s,sVar4,"ssl/tls_srp.c",0x17a);
  }
  BN_clear_free(a);
  return uVar3;
}

