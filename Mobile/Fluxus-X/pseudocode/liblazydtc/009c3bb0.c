/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3bb0
 */

undefined8 ssl_hmac_size(long *param_1)

{
  undefined8 uVar1;
  
  if (*param_1 != 0) {
    uVar1 = EVP_MAC_CTX_get_mac_size(*param_1);
    return uVar1;
  }
  if (param_1[1] == 0) {
    return 0;
  }
  uVar1 = ssl_hmac_old_size();
  return uVar1;
}

