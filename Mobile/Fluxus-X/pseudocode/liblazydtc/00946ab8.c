/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946ab8
 */

int FUN_00946ab8(undefined8 *param_1)

{
  int iVar1;
  undefined4 *puVar2;
  
  puVar2 = (undefined4 *)(*(code *)PTR_calloc_00cc4690)(1,0x1420);
  if (puVar2 == (undefined4 *)0x0) {
    iVar1 = 0x1b;
  }
  else {
    *puVar2 = 0xc0dedbad;
    FUN_0093271c(puVar2 + 0x36);
    iVar1 = FUN_0090e9b4(puVar2,puVar2 + 0x36a);
    if (iVar1 == 0) {
      FUN_0094690c(puVar2);
      FUN_00904528(puVar2 + 0x318,0x19000);
      FUN_00915c9c(puVar2);
      *(undefined8 *)(puVar2 + 2) = 0xffffffffffffffff;
      *(undefined8 *)(puVar2 + 0x316) = 0xffffffffffffffff;
      *(undefined8 *)(puVar2 + 0x314) = 0xffffffffffffffff;
      *(undefined8 *)(puVar2 + 0x322) = 0xffffffffffffffff;
      puVar2[0x2b7] = puVar2[0x2b7] | 0x10;
      *param_1 = puVar2;
    }
    else {
      FUN_00932a98(puVar2 + 0x36,puVar2);
      (*(code *)PTR_free_00cc4678)(puVar2);
    }
  }
  return iVar1;
}

