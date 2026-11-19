/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ac72c
 */

undefined8 ssl_cert_add1_chain_cert(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  uVar1 = ssl_cert_add0_chain_cert();
  if ((int)uVar1 != 0) {
    X509_up_ref(param_3);
    uVar1 = 1;
  }
  return uVar1;
}

