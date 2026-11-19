/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c17774
 */

void FUN_00c17774(long param_1,undefined8 *param_2,undefined8 *param_3,undefined1 *param_4,
                 ushort *param_5)

{
  undefined1 uVar1;
  ushort uVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uVar5;
  void *pvVar6;
  
  pvVar6 = *(void **)(param_1 + 0x1330);
  lVar4 = *(long *)((long)pvVar6 + 8);
  puVar3 = pvVar6;
  if (lVar4 - 0xfc0U < 0xfffffffffffff00f || lVar4 == -0x31) {
    puVar3 = malloc(0x1000);
    if (puVar3 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    lVar4 = 0;
    *puVar3 = pvVar6;
    puVar3[1] = 0;
    *(undefined8 **)(param_1 + 0x1330) = puVar3;
  }
  uVar5 = *param_2;
  *(long *)((long)puVar3 + 8) = lVar4 + 0x30;
  *(undefined ***)((long)puVar3 + lVar4 + 0x10) = &PTR_LAB_00cb1d60;
  uVar2 = *param_5;
  *(undefined8 *)((long)puVar3 + lVar4 + 0x20) = uVar5;
  *(undefined1 *)((long)puVar3 + lVar4 + 0x18) = 0x3f;
  uVar5 = *param_3;
  uVar1 = *param_4;
  *(undefined8 *)((long)puVar3 + lVar4 + 0x30) = param_3[1];
  *(undefined8 *)((long)puVar3 + lVar4 + 0x28) = uVar5;
  *(ushort *)((long)puVar3 + lVar4 + 0x19) =
       *(ushort *)((long)puVar3 + lVar4 + 0x19) & 0xf000 | uVar2 & 0x3f | 0x540;
  *(undefined1 *)((long)puVar3 + lVar4 + 0x38) = uVar1;
  return;
}

