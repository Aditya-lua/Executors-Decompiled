/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009268ac
 */

undefined8 * curl_mime_init(undefined8 param_1)

{
  int iVar1;
  undefined8 *puVar2;
  
  puVar2 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(0x60);
  if (puVar2 != (undefined8 *)0x0) {
    *puVar2 = 0;
    puVar2[1] = 0;
    puVar2[4] = 0x2d2d2d2d2d2d2d2d;
    puVar2[5] = 0x2d2d2d2d2d2d2d2d;
    puVar2[2] = 0;
    puVar2[3] = 0x2d2d2d2d2d2d2d2d;
    iVar1 = FUN_00932640(param_1,puVar2 + 6,0x17);
    if (iVar1 == 0) {
      *(undefined4 *)(puVar2 + 9) = 0;
      puVar2[10] = 0;
      puVar2[0xb] = 0;
    }
    else {
      (*(code *)PTR_free_00cc4678)(puVar2);
      puVar2 = (undefined8 *)0x0;
    }
  }
  return puVar2;
}

