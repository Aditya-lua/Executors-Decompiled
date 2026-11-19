/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a94050
 */

undefined8 FUN_00a94050(undefined8 param_1,int param_2,undefined8 param_3,DES_cblock *param_4)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  
  if (param_2 == 6) {
    iVar1 = EVP_CIPHER_CTX_get_key_length();
    if ((iVar1 < 0) || (iVar2 = RAND_priv_bytes(param_4,iVar1), iVar2 < 1)) {
      uVar3 = 0;
    }
    else {
      DES_set_odd_parity(param_4);
      if ((0xf < iVar1) && (DES_set_odd_parity(param_4 + 1), 0x17 < iVar1)) {
        DES_set_odd_parity(param_4 + 2);
      }
      uVar3 = 1;
    }
  }
  else {
    uVar3 = 0xffffffff;
  }
  return uVar3;
}

