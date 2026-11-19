/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ebc5c
 */

ulong dtls_raw_hello_verify_request(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  ulong uVar2;
  
  uVar2 = WPACKET_put_bytes__(param_1,0xfeff,2);
  if ((int)uVar2 != 0) {
    iVar1 = WPACKET_sub_memcpy__(param_1,param_2,param_3,1);
    uVar2 = (ulong)(iVar1 != 0);
  }
  return uVar2;
}

