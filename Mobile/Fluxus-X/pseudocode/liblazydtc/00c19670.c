/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c19670
 */

void FUN_00c19670(long param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 uVar3;
  void *pvVar4;
  
  pvVar4 = *(void **)(param_1 + 0x1330);
  lVar2 = *(long *)((long)pvVar4 + 8);
  puVar1 = pvVar4;
  if (lVar2 - 0xfb0U < 0xfffffffffffff00f || lVar2 == -0x41) {
    puVar1 = malloc(0x1000);
    if (puVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    lVar2 = 0;
    *puVar1 = pvVar4;
    puVar1[1] = 0;
    *(undefined8 **)(param_1 + 0x1330) = puVar1;
  }
  *(long *)((long)puVar1 + 8) = lVar2 + 0x40;
  *(undefined ***)((long)puVar1 + lVar2 + 0x10) = &PTR_LAB_00cb1f40;
  *(undefined1 *)((long)puVar1 + lVar2 + 0x18) = 0x3c;
  *(char **)((long)puVar1 + lVar2 + 0x20) = "sizeof... ";
  *(undefined8 *)((long)puVar1 + lVar2 + 0x28) = 10;
  uVar3 = *param_2;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x38) = 0;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x40) = 0;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x30) = uVar3;
  *(ushort *)((long)puVar1 + lVar2 + 0x19) =
       *(ushort *)((long)puVar1 + lVar2 + 0x19) & 0xf000 | 0x540;
  return;
}

