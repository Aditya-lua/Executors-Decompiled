/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a50b14
 */

int ENGINE_set_default(ENGINE *e,uint flags)

{
  int iVar1;
  int iVar2;
  
  if (((((((flags >> 6 & 1) == 0) || (iVar1 = ENGINE_set_default_ciphers(e), iVar2 = 0, iVar1 != 0))
        && (((flags >> 7 & 1) == 0 || (iVar1 = ENGINE_set_default_digests(e), iVar2 = 0, iVar1 != 0)
            ))) &&
       (((flags & 1) == 0 || (iVar1 = ENGINE_set_default_RSA(e), iVar2 = 0, iVar1 != 0)))) &&
      (((flags >> 1 & 1) == 0 || (iVar1 = ENGINE_set_default_DSA(e), iVar2 = 0, iVar1 != 0)))) &&
     ((((((flags >> 2 & 1) == 0 || (iVar1 = ENGINE_set_default_DH(e), iVar2 = 0, iVar1 != 0)) &&
        (((flags >> 0xb & 1) == 0 || (iVar1 = ENGINE_set_default_EC(e), iVar2 = 0, iVar1 != 0)))) &&
       (((flags >> 3 & 1) == 0 || (iVar1 = ENGINE_set_default_RAND(e), iVar2 = 0, iVar1 != 0)))) &&
      ((((flags >> 9 & 1) == 0 || (iVar1 = ENGINE_set_default_pkey_meths(e), iVar2 = 0, iVar1 != 0))
       && (((flags >> 10 & 1) == 0 ||
           (iVar1 = ENGINE_set_default_pkey_asn1_meths(e), iVar2 = 0, iVar1 != 0)))))))) {
    iVar2 = 1;
  }
  return iVar2;
}

