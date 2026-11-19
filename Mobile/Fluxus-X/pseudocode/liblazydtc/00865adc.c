/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00865adc
 */

long FUN_00865adc(undefined8 *param_1,long param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  long lVar2;
  ulong *puVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  ulong *puVar7;
  undefined8 *puVar8;
  ulong local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if ((param_2 != 0) && (*(int *)(param_2 + 8) == DAT_00d1b170)) {
    uVar6 = param_1[1];
    *(undefined1 *)(param_2 + 0x41) = 1;
    if (*(long *)(param_2 + 0x28) != 0) {
      puVar8 = *(undefined8 **)(param_2 + 0x20);
      puVar1 = puVar8 + *(long *)(param_2 + 0x28);
      do {
        puVar7 = (ulong *)*puVar8;
        local_70 = *puVar7;
        lVar4 = *(long *)*param_1;
        if (*(long *)(lVar4 + 0x228) != 0) {
          uVar5 = (local_70 >> 4 ^ local_70 >> 9) * -0x61c8864680b583eb >>
                  ((ulong)*(byte *)(lVar4 + 0x230) & 0x3f);
          if ((*(ulong *)(*(long *)(lVar4 + 0x218) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0)
          {
            do {
              if (*(ulong *)(*(long *)(lVar4 + 0x200) + uVar5 * 0x18) == local_70) {
                FUN_00860ecc(uVar6,puVar7 + 1,"Duplicate exported identifier \'%s\'",*puVar7);
                goto LAB_00865b78;
              }
              uVar5 = uVar5 + 1 & *(long *)(lVar4 + 0x220) - 1U;
            } while ((*(ulong *)(*(long *)(lVar4 + 0x218) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1)
                     != 0);
          }
        }
        puVar3 = (ulong *)FUN_0086fd10(lVar4 + 0x200,&local_70);
        uVar5 = puVar7[1];
        puVar3[1] = puVar7[2];
        *puVar3 = uVar5;
        *(undefined1 *)((long)puVar7 + 0x31) = 1;
LAB_00865b78:
        puVar8 = puVar8 + 1;
      } while (puVar8 != puVar1);
    }
    uVar6 = *param_3;
    *(undefined8 *)(param_2 + 0x4c) = param_3[1];
    *(undefined8 *)(param_2 + 0x44) = uVar6;
    if ((*(byte *)(param_2 + 0x54) & 1) == 0) {
      *(undefined1 *)(param_2 + 0x54) = 1;
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return param_2;
}

