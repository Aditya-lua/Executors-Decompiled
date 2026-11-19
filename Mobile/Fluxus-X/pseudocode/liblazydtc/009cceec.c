/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cceec
 */

void SSL3_RECORD_clear(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  if (param_2 != 0) {
    puVar1 = (undefined8 *)(param_1 + 0x30);
    do {
      uVar2 = *puVar1;
      memset(puVar1 + -6,0,0x50);
      param_2 = param_2 + -1;
      *puVar1 = uVar2;
      puVar1 = puVar1 + 10;
    } while (param_2 != 0);
  }
  return;
}

