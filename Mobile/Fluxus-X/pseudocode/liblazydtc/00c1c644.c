/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1c644
 */

undefined8 * FUN_00c1c644(long *param_1,undefined8 param_2,undefined8 param_3)

{
  char *pcVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  void *pvVar5;
  undefined1 auVar6 [16];
  
  auVar6 = FUN_00c10abc(param_1,1);
  if (((auVar6._8_8_ == 0) || (pcVar1 = (char *)*param_1, pcVar1 == (char *)param_1[1])) ||
     (*pcVar1 != 'E')) {
    puVar4 = (undefined8 *)0x0;
  }
  else {
    pvVar5 = (void *)param_1[0x266];
    *param_1 = (long)(pcVar1 + 1);
    lVar3 = *(long *)((long)pvVar5 + 8);
    puVar2 = pvVar5;
    if (lVar3 - 0xfc0U < 0xfffffffffffff00f || lVar3 == -0x31) {
      puVar2 = malloc(0x1000);
      if (puVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      lVar3 = 0;
      *puVar2 = pvVar5;
      puVar2[1] = 0;
      param_1[0x266] = (long)puVar2;
    }
    *(long *)((long)puVar2 + 8) = lVar3 + 0x30;
    puVar4 = (undefined8 *)((long)puVar2 + lVar3 + 0x10);
    *puVar4 = &PTR_LAB_00cb1fb8;
    *(undefined1 *)((long)puVar2 + lVar3 + 0x18) = 0x4d;
    *(undefined1 (*) [16])((long)puVar2 + lVar3 + 0x30) = auVar6;
    *(undefined8 *)((long)puVar2 + lVar3 + 0x20) = param_2;
    *(undefined8 *)((long)puVar2 + lVar3 + 0x28) = param_3;
    *(ushort *)((long)puVar2 + lVar3 + 0x19) =
         *(ushort *)((long)puVar2 + lVar3 + 0x19) & 0xf000 | 0x540;
  }
  return puVar4;
}

