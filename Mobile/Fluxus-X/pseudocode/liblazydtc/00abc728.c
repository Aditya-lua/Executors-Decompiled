/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc728
 */

undefined8 PKCS12_SAFEBAG_get0_p8inf(undefined8 *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = OBJ_obj2nid((ASN1_OBJECT *)*param_1);
  uVar2 = 0;
  if (iVar1 == 0x96) {
    uVar2 = param_1[1];
  }
  return uVar2;
}

