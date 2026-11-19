/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e8234
 */

undefined8 tls_construct_server_done(long param_1)

{
  undefined8 uVar1;
  
  if ((*(int *)(param_1 + 0x348) == 0) &&
     (uVar1 = ssl3_digest_cached_records(param_1,0), (int)uVar1 == 0)) {
    return uVar1;
  }
  return 1;
}

