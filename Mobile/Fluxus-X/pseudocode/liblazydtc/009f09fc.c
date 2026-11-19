/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f09fc
 */

void EVP_PKEY_asn1_copy(EVP_PKEY_ASN1_METHOD *dst,EVP_PKEY_ASN1_METHOD *src)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  uVar4 = *(undefined8 *)(dst + 8);
  uVar3 = *(undefined8 *)dst;
  uVar1 = *(undefined8 *)(dst + 0x10);
  uVar2 = *(undefined8 *)(dst + 0x18);
  memcpy(dst,src,0x140);
  *(undefined8 *)(dst + 0x10) = uVar1;
  *(undefined8 *)(dst + 0x18) = uVar2;
  *(undefined8 *)(dst + 8) = uVar4;
  *(undefined8 *)dst = uVar3;
  return;
}

