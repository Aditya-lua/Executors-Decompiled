/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c86c0
 */

long SSL_srp_server_param_with_username(long param_1,undefined4 *param_2)

{
  int iVar1;
  long lVar2;
  BIGNUM *pBVar3;
  uchar auStack_50 [48];
  
  *param_2 = 0x73;
  if ((*(code **)(param_1 + 0xbd8) == (code *)0x0) ||
     (lVar2 = (**(code **)(param_1 + 0xbd8))(param_1,param_2,*(undefined8 *)(param_1 + 0xbd0)),
     (int)lVar2 == 0)) {
    *param_2 = 0x50;
    if (((*(long *)(param_1 + 0xbf8) == 0) ||
        (((*(long *)(param_1 + 0xc00) == 0 || (*(long *)(param_1 + 0xc08) == 0)) ||
         (*(long *)(param_1 + 0xc30) == 0)))) ||
       (iVar1 = RAND_priv_bytes_ex(**(undefined8 **)(param_1 + 0x9a8),auStack_50,0x30,0), iVar1 < 1)
       ) {
      lVar2 = 2;
    }
    else {
      pBVar3 = BN_bin2bn(auStack_50,0x30,(BIGNUM *)0x0);
      *(BIGNUM **)(param_1 + 0xc28) = pBVar3;
      OPENSSL_cleanse(auStack_50,0x30);
      lVar2 = SRP_Calc_B_ex(*(undefined8 *)(param_1 + 0xc28),*(undefined8 *)(param_1 + 0xbf8),
                            *(undefined8 *)(param_1 + 0xc00),*(undefined8 *)(param_1 + 0xc30),
                            **(undefined8 **)(param_1 + 0x9a8),
                            (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
      *(long *)(param_1 + 0xc10) = lVar2;
      lVar2 = (ulong)(lVar2 == 0) << 1;
    }
  }
  return lVar2;
}

