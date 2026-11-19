/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c18ad8
 */

undefined8 * FUN_00c18ad8(long *param_1)

{
  byte *pbVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  byte *pbVar6;
  long lVar7;
  byte *pbVar8;
  byte *pbVar9;
  long lVar10;
  void *pvVar11;
  
  lVar2 = FUN_00c10bfc();
  puVar5 = (undefined8 *)0x0;
  if (lVar2 != 0) {
    lVar3 = FUN_00c16098(param_1);
    puVar5 = (undefined8 *)0x0;
    if (lVar3 != 0) {
      pbVar9 = (byte *)*param_1;
      pbVar1 = (byte *)param_1[1];
      pbVar6 = pbVar9;
      if ((pbVar9 != pbVar1) && (*pbVar9 == 0x6e)) {
        pbVar6 = pbVar9 + 1;
        *param_1 = (long)pbVar6;
      }
      if ((pbVar1 == pbVar6) || (*pbVar6 - 0x3a < 0xfffffff6)) {
        pbVar9 = (byte *)0x0;
        lVar10 = 0;
      }
      else {
        do {
          if (*pbVar6 - 0x3a < 0xfffffff6) {
            pbVar8 = pbVar6;
            goto LAB_00c18b8c;
          }
          pbVar6 = pbVar6 + 1;
          *param_1 = (long)pbVar6;
        } while (pbVar6 != pbVar1);
        pbVar8 = pbVar1;
LAB_00c18b8c:
        lVar10 = (long)pbVar8 - (long)pbVar9;
      }
      if ((pbVar6 == pbVar1) || (*pbVar6 != 0x45)) {
        puVar5 = (undefined8 *)0x0;
      }
      else {
        pvVar11 = (void *)param_1[0x266];
        *param_1 = (long)(pbVar6 + 1);
        lVar7 = *(long *)((long)pvVar11 + 8);
        puVar4 = pvVar11;
        if (lVar7 - 0xfc0U < 0xfffffffffffff00f || lVar7 == -0x31) {
          puVar4 = malloc(0x1000);
          if (puVar4 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            std::terminate();
          }
          lVar7 = 0;
          *puVar4 = pvVar11;
          puVar4[1] = 0;
          param_1[0x266] = (long)puVar4;
        }
        *(long *)((long)puVar4 + 8) = lVar7 + 0x30;
        puVar5 = (undefined8 *)((long)puVar4 + lVar7 + 0x10);
        *puVar5 = &PTR_LAB_00cb2a08;
        *(undefined1 *)((long)puVar4 + lVar7 + 0x18) = 0x45;
        *(long *)((long)puVar4 + lVar7 + 0x20) = lVar2;
        *(long *)((long)puVar4 + lVar7 + 0x28) = lVar3;
        *(byte **)((long)puVar4 + lVar7 + 0x30) = pbVar9;
        *(long *)((long)puVar4 + lVar7 + 0x38) = lVar10;
        *(ushort *)((long)puVar4 + lVar7 + 0x19) =
             *(ushort *)((long)puVar4 + lVar7 + 0x19) & 0xf000 | 0x542;
      }
    }
  }
  return puVar5;
}

