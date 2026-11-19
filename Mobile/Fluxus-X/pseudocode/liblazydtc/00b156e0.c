/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b156e0
 */

void X509_REQ_verify_ex(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  uVar1 = X509_REQ_INFO_it();
  ASN1_item_verify_ex(uVar1,param_1 + 0x38,*(undefined8 *)(param_1 + 0x48),param_1,
                      *(undefined8 *)(param_1 + 0x60),param_2,param_3,param_4);
  return;
}

