/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c179c8
 */

void FUN_00c179c8(long param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 ushort *param_5)

{
  ushort uVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  void *pvVar6;
  undefined8 uVar7;
  
  pvVar6 = *(void **)(param_1 + 0x1330);
  lVar3 = *(long *)((long)pvVar6 + 8);
  puVar2 = pvVar6;
  if (lVar3 - 0xfc0U < 0xfffffffffffff00f || lVar3 == -0x31) {
    puVar2 = malloc(0x1000);
    if (puVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    lVar3 = 0;
    *puVar2 = pvVar6;
    puVar2[1] = 0;
    *(undefined8 **)(param_1 + 0x1330) = puVar2;
  }
  *(long *)((long)puVar2 + 8) = lVar3 + 0x30;
  *(undefined ***)((long)puVar2 + lVar3 + 0x10) = &PTR_LAB_00cb1ec8;
  uVar1 = *param_5;
  *(undefined1 *)((long)puVar2 + lVar3 + 0x18) = 0x3d;
  uVar4 = *param_3;
  uVar7 = *param_2;
  uVar5 = *param_4;
  *(undefined8 *)((long)puVar2 + lVar3 + 0x28) = param_2[1];
  *(undefined8 *)((long)puVar2 + lVar3 + 0x20) = uVar7;
  *(ushort *)((long)puVar2 + lVar3 + 0x19) =
       *(ushort *)((long)puVar2 + lVar3 + 0x19) & 0xf000 | uVar1 & 0x3f | 0x540;
  *(undefined8 *)((long)puVar2 + lVar3 + 0x30) = uVar4;
  *(undefined8 *)((long)puVar2 + lVar3 + 0x38) = uVar5;
  return;
}

