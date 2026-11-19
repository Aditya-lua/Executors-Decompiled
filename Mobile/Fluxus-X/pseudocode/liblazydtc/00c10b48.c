/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c10b48
 */

undefined8 * FUN_00c10b48(long param_1,char *param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  size_t sVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  void *pvVar6;
  
  pvVar6 = *(void **)(param_1 + 0x1330);
  lVar3 = *(long *)((long)pvVar6 + 8);
  puVar1 = pvVar6;
  if (lVar3 - 0xfc0U < 0xfffffffffffff00f || lVar3 == -0x31) {
    puVar1 = malloc(0x1000);
    if (puVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    lVar3 = 0;
    *puVar1 = pvVar6;
    puVar1[1] = 0;
    *(undefined8 **)(param_1 + 0x1330) = puVar1;
  }
  *(long *)((long)puVar1 + 8) = lVar3 + 0x30;
  sVar2 = strlen(param_2);
  uVar4 = *param_3;
  puVar5 = (undefined8 *)((long)puVar1 + lVar3 + 0x10);
  *puVar5 = &PTR_LAB_00cb13c0;
  *(char **)((long)puVar1 + lVar3 + 0x20) = param_2;
  *(undefined1 *)((long)puVar1 + lVar3 + 0x18) = 0x15;
  *(size_t *)((long)puVar1 + lVar3 + 0x28) = sVar2;
  *(undefined8 *)((long)puVar1 + lVar3 + 0x30) = uVar4;
  *(ushort *)((long)puVar1 + lVar3 + 0x19) =
       *(ushort *)((long)puVar1 + lVar3 + 0x19) & 0xf000 | 0x540;
  return puVar5;
}

