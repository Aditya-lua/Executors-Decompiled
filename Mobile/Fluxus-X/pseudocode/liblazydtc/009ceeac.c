/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ceeac
 */

undefined8 ssl3_cbc_record_digest_supported(void)

{
  int iVar1;
  undefined8 uVar2;
  
  EVP_MD_CTX_get0_md();
  iVar1 = EVP_MD_get_type();
  uVar2 = 1;
  if (((3 < iVar1 - 0x2a0U) && (iVar1 != 4)) && (iVar1 != 0x40)) {
    uVar2 = 0;
  }
  return uVar2;
}

