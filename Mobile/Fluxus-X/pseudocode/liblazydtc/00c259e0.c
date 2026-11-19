/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c259e0
 */

void FUN_00c259e0(long param_1,undefined8 *param_2,undefined1 *param_3)

{
  undefined1 uVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 uVar4;
  void *pvVar5;
  
  pvVar5 = *(void **)(param_1 + 0x1330);
  lVar3 = *(long *)((long)pvVar5 + 8);
  puVar2 = pvVar5;
  if (lVar3 - 0xfd0U < 0xfffffffffffff00f || lVar3 == -0x21) {
    puVar2 = malloc(0x1000);
    if (puVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    lVar3 = 0;
    *puVar2 = pvVar5;
    puVar2[1] = 0;
    *(undefined8 **)(param_1 + 0x1330) = puVar2;
  }
  *(long *)((long)puVar2 + 8) = lVar3 + 0x20;
  *(undefined ***)((long)puVar2 + lVar3 + 0x10) = &PTR_LAB_00cb3cc8;
  uVar4 = *param_2;
  *(undefined1 *)((long)puVar2 + lVar3 + 0x18) = 0x20;
  uVar1 = *param_3;
  *(undefined8 *)((long)puVar2 + lVar3 + 0x20) = uVar4;
  *(ushort *)((long)puVar2 + lVar3 + 0x19) =
       *(ushort *)((long)puVar2 + lVar3 + 0x19) & 0xf000 | 0x540;
  *(undefined1 *)((long)puVar2 + lVar3 + 0x28) = uVar1;
  return;
}

