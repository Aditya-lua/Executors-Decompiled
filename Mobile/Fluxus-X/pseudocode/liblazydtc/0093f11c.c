/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f11c
 */

undefined4 * curl_share_init(void)

{
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)(*(code *)PTR_calloc_00cc4690)(1,0x110);
  if (puVar1 != (undefined4 *)0x0) {
    *puVar1 = 0x7e117a1e;
    puVar1[1] = puVar1[1] | 2;
    FUN_00917c68(puVar1 + 0x2e,0x17);
  }
  return puVar1;
}

