/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00926b98
 */

undefined8 curl_mime_name(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  if (param_1 == 0) {
    uVar2 = 0x2b;
  }
  else {
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x68));
    *(undefined8 *)(param_1 + 0x68) = 0;
    if (param_2 != 0) {
      lVar1 = (*(code *)PTR_strdup_00cc4688)(param_2);
      *(long *)(param_1 + 0x68) = lVar1;
      if (lVar1 == 0) {
        return 0x1b;
      }
    }
    uVar2 = 0;
  }
  return uVar2;
}

