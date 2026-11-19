/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14d48
 */

int X509_NAME_entry_count(X509_NAME *name)

{
  uint uVar1;
  
  uVar1 = 0;
  if (name != (X509_NAME *)0x0) {
    uVar1 = OPENSSL_sk_num(name->entries);
    uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  }
  return uVar1;
}

