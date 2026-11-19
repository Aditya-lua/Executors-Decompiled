/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1e714
 */

void FUN_00c1e714(long param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined8 *param_5,undefined8 *param_6)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  void *pvVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  pvVar5 = *(void **)(param_1 + 0x1330);
  lVar2 = *(long *)((long)pvVar5 + 8);
  puVar1 = pvVar5;
  if (lVar2 - 4000U < 0xfffffffffffff00f || lVar2 == -0x51) {
    puVar1 = malloc(0x1000);
    if (puVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    lVar2 = 0;
    *puVar1 = pvVar5;
    puVar1[1] = 0;
    *(undefined8 **)(param_1 + 0x1330) = puVar1;
  }
  uVar3 = *param_3;
  *(long *)((long)puVar1 + 8) = lVar2 + 0x50;
  *(undefined ***)((long)puVar1 + lVar2 + 0x10) = &PTR_LAB_00cb25d0;
  uVar4 = *param_5;
  *(undefined1 *)((long)puVar1 + lVar2 + 0x18) = 0x34;
  uVar7 = param_2[1];
  uVar6 = *param_2;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x30) = uVar3;
  uVar8 = param_4[1];
  uVar3 = *param_4;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x48) = uVar4;
  uVar9 = param_6[1];
  uVar4 = *param_6;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x28) = uVar7;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x20) = uVar6;
  *(ushort *)((long)puVar1 + lVar2 + 0x19) =
       *(ushort *)((long)puVar1 + lVar2 + 0x19) & 0xf000 | 0x540;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x40) = uVar8;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x38) = uVar3;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x58) = uVar9;
  *(undefined8 *)((long)puVar1 + lVar2 + 0x50) = uVar4;
  return;
}

