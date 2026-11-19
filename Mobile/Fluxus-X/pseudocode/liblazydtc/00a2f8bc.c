/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f8bc
 */

ulong ossl_ec_key_simple_priv2oct(long param_1,long param_2,ulong param_3)

{
  uint uVar1;
  ulong uVar2;
  int iVar3;
  
  iVar3 = EC_GROUP_order_bits(*(undefined8 *)(param_1 + 0x18));
  uVar1 = iVar3 + 0xe;
  if (-1 < (int)(iVar3 + 7U)) {
    uVar1 = iVar3 + 7U;
  }
  if (*(long *)(param_1 + 0x28) != 0) {
    uVar2 = (long)((ulong)uVar1 << 0x20) >> 0x23;
    if (param_2 == 0) {
      return uVar2;
    }
    if (param_3 < uVar2) {
      return 0;
    }
    iVar3 = BN_bn2binpad(*(long *)(param_1 + 0x28),param_2,uVar2 & 0xffffffff);
    if (iVar3 != -1) {
      return uVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x3a0,"ossl_ec_key_simple_priv2oct");
    ERR_set_error(0x10,100,0);
  }
  return 0;
}

