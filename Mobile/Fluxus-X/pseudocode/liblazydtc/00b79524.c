/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b79524
 */

undefined8 mbedtls_md_hmac_reset(long *param_1)

{
  undefined8 uVar1;
  long lVar2;
  
  if (((param_1 == (long *)0x0) || (*param_1 == 0)) || (lVar2 = param_1[2], lVar2 == 0)) {
    uVar1 = 0xffffaf00;
  }
  else {
    uVar1 = mbedtls_md_starts(param_1);
    if ((int)uVar1 == 0) {
      uVar1 = mbedtls_md_update(param_1,lVar2,*(undefined1 *)(*param_1 + 5));
      return uVar1;
    }
  }
  return uVar1;
}

