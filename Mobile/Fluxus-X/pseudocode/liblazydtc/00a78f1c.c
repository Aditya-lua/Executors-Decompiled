/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a78f1c
 */

bool FUN_00a78f1c(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  
  puVar1 = CRYPTO_malloc(0x20,"crypto/dsa/dsa_pmeth.c",0x28);
  if (puVar1 != (undefined8 *)0x0) {
    puVar1[1] = 0;
    puVar1[3] = 0;
    *puVar1 = 0xe000000800;
    *(undefined8 **)(param_1 + 0x68) = puVar1 + 2;
    *(undefined8 **)(param_1 + 0x98) = puVar1;
    *(undefined4 *)(param_1 + 0x70) = 2;
    puVar2 = *(undefined8 **)(param_2 + 0x98);
    *puVar1 = *puVar2;
    puVar1[1] = puVar2[1];
    puVar1[3] = puVar2[3];
  }
  return puVar1 != (undefined8 *)0x0;
}

