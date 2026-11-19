/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c228c4
 */

undefined8 * FUN_00c228c4(long *param_1,undefined8 *param_2)

{
  ushort uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  char *pcVar4;
  long lVar5;
  void *pvVar6;
  undefined1 auVar7 [16];
  
  pcVar4 = (char *)*param_1;
  puVar2 = param_2;
  if (pcVar4 != (char *)param_1[1]) {
    do {
      puVar2 = param_2;
      if (*pcVar4 != 'B') break;
      *param_1 = (long)(pcVar4 + 1);
      auVar7 = FUN_00c22edc(param_1);
      if (auVar7._8_8_ == 0) {
        return (undefined8 *)0x0;
      }
      pvVar6 = (void *)param_1[0x266];
      lVar5 = *(long *)((long)pvVar6 + 8);
      puVar3 = pvVar6;
      if (lVar5 - 0xfc0U < 0xfffffffffffff00f || lVar5 == -0x31) {
        puVar3 = malloc(0x1000);
        if (puVar3 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar5 = 0;
        *puVar3 = pvVar6;
        puVar3[1] = 0;
        param_1[0x266] = (long)puVar3;
      }
      *(long *)((long)puVar3 + 8) = lVar5 + 0x30;
      uVar1 = *(ushort *)((long)param_2 + 9);
      puVar2 = (undefined8 *)((long)puVar3 + lVar5 + 0x10);
      *puVar2 = &PTR_LAB_00cb3188;
      *(long *)((long)puVar3 + lVar5 + 0x28) = auVar7._0_8_;
      *(undefined8 **)((long)puVar3 + lVar5 + 0x20) = param_2;
      *(undefined1 *)((long)puVar3 + lVar5 + 0x18) = 9;
      *(long *)((long)puVar3 + lVar5 + 0x30) = auVar7._8_8_;
      *(ushort *)((long)puVar3 + lVar5 + 0x19) =
           *(ushort *)((long)puVar3 + lVar5 + 0x19) & 0xf000 | uVar1 & 0xfc0;
      pcVar4 = (char *)*param_1;
      param_2 = puVar2;
    } while (pcVar4 != (char *)param_1[1]);
  }
  return puVar2;
}

