/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3bf8
 */

undefined8 ssl_hmac_final(long *param_1)

{
  undefined8 uVar1;
  
  if (*param_1 != 0) {
    uVar1 = EVP_MAC_final(*param_1);
    return uVar1;
  }
  if (param_1[1] == 0) {
    return 0;
  }
  uVar1 = ssl_hmac_old_final();
  return uVar1;
}

