/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8904
 */

undefined4 srp_generate_server_master_secret(long param_1)

{
  uint uVar1;
  int iVar2;
  undefined4 uVar3;
  BIGNUM *a;
  BIGNUM *a_00;
  uchar *to;
  
  iVar2 = SRP_Verify_A_mod_N(*(undefined8 *)(param_1 + 0xc18),*(undefined8 *)(param_1 + 0xbf8));
  if (iVar2 == 0) {
    a_00 = (BIGNUM *)0x0;
    a = (BIGNUM *)0x0;
  }
  else {
    a = (BIGNUM *)
        SRP_Calc_u_ex(*(undefined8 *)(param_1 + 0xc18),*(undefined8 *)(param_1 + 0xc10),
                      *(undefined8 *)(param_1 + 0xbf8),**(undefined8 **)(param_1 + 0x9a8),
                      (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
    if (a == (BIGNUM *)0x0) {
      a_00 = (BIGNUM *)0x0;
    }
    else {
      a_00 = (BIGNUM *)
             SRP_Calc_server_key(*(undefined8 *)(param_1 + 0xc18),*(undefined8 *)(param_1 + 0xc30),a
                                 ,*(undefined8 *)(param_1 + 0xc28),*(undefined8 *)(param_1 + 0xbf8))
      ;
      if (a_00 != (BIGNUM *)0x0) {
        iVar2 = BN_num_bits(a_00);
        uVar1 = iVar2 + 0xe;
        if (-1 < (int)(iVar2 + 7U)) {
          uVar1 = iVar2 + 7U;
        }
        to = CRYPTO_malloc((int)uVar1 >> 3,"ssl/tls_srp.c",0x13d);
        if (to != (uchar *)0x0) {
          BN_bn2bin(a_00,to);
          uVar3 = ssl_generate_master_secret(param_1,to,(long)((ulong)uVar1 << 0x20) >> 0x23,1);
          goto LAB_009c8a1c;
        }
        ERR_new();
        ERR_set_debug("ssl/tls_srp.c",0x13e,"srp_generate_server_master_secret");
        ossl_statem_fatal(param_1,0x50,0xc0100,0);
      }
    }
  }
  uVar3 = 0;
LAB_009c8a1c:
  BN_clear_free(a_00);
  BN_clear_free(a);
  return uVar3;
}

