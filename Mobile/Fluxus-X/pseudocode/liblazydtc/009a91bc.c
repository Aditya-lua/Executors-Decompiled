/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a91bc
 */

undefined8 ssl3_put_cipher_by_char(long param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if (*(uint *)(param_1 + 0x18) >> 0x18 == 3) {
    uVar2 = 2;
    uVar1 = WPACKET_put_bytes__(param_2,*(uint *)(param_1 + 0x18) & 0xffff,2);
    if ((int)uVar1 == 0) {
      return uVar1;
    }
  }
  *param_3 = uVar2;
  return 1;
}

