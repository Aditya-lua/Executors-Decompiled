/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b13cc
 */

bool ssl_cert_is_disabled(long param_1,undefined8 param_2)

{
  bool bVar1;
  long lVar2;
  
  lVar2 = ssl_cert_lookup_by_idx(param_2);
  if (lVar2 == 0) {
    bVar1 = true;
  }
  else {
    bVar1 = (*(uint *)(param_1 + 0x64c) & *(uint *)(lVar2 + 4)) != 0;
  }
  return bVar1;
}

