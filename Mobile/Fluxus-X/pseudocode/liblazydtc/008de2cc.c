/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008de2cc
 */

void FUN_008de2cc(undefined8 *param_1,char *param_2,long param_3)

{
  byte bVar1;
  long lVar2;
  undefined1 auVar3 [12];
  long lVar4;
  bool bVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined1 auVar12 [12];
  undefined8 local_7e0;
  undefined8 uStack_7d8;
  undefined4 local_7d0;
  undefined4 uStack_7cc;
  undefined4 uStack_7c8;
  undefined4 uStack_7c4;
  undefined8 uStack_7c0;
  undefined8 uStack_7b8;
  undefined1 auStack_7b0 [1912];
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  if ((0xfffffffffc0003fe < param_3 - 0x4000019U) && (*param_2 != '\0')) {
    bVar1 = param_2[param_3 + -0x18];
    if (((((byte)(bVar1 ^ param_2[param_3 + -8]) == 0x70) &&
         ((((byte)(param_2[param_3 + -4] ^ bVar1) == 0x32 &&
           ((byte)(param_2[param_3 + -0x17] ^ param_2[param_3 + -7]) == 0x18)) &&
          ((byte)(param_2[param_3 + -3] ^ param_2[param_3 + -0x17]) == 0xc4)))) &&
        ((((byte)(param_2[param_3 + -0x16] ^ param_2[param_3 + -6]) == 0x17 &&
          ((byte)(param_2[param_3 + -2] ^ param_2[param_3 + -0x16]) == 0x6a)) &&
         ((byte)(param_2[param_3 + -0x15] ^ param_2[param_3 + -5]) == 0x74)))) &&
       ((byte)(param_2[param_3 + -1] ^ param_2[param_3 + -0x15]) == 1)) {
      uVar7 = 0;
      uVar8 = 0;
      uVar9 = 0;
      uStack_7d8 = *(undefined8 *)(param_2 + param_3 + -0x10);
      local_7e0 = *(undefined8 *)(param_2 + param_3 + -0x18);
      uVar11 = 0;
      do {
        uVar10 = uVar11;
        lVar4 = uVar8 - 0x30;
        uVar11 = uVar7 & 0x38;
        bVar5 = 7 < uVar8;
        uVar8 = uVar8 + 1;
        uVar7 = uVar7 + 8;
        uVar6 = uVar10;
        if (bVar5) {
          uVar6 = uVar9;
        }
        uVar6 = (ulong)(byte)auStack_7b0[lVar4] << uVar11 | uVar6;
        uVar11 = uVar6;
        if (bVar5) {
          uVar11 = uVar10;
          uVar9 = uVar6;
        }
      } while (uVar8 != 0x10);
      auVar12 = FUN_008decbc(*param_1,uVar10,uVar6);
      blake3_hasher_init(auStack_7b0);
      blake3_hasher_update(auStack_7b0,param_2,param_3 + -0x18);
      uStack_7c8 = 0;
      uStack_7c4 = 0;
      local_7d0 = 0;
      uStack_7cc = 0;
      uStack_7b8 = 0;
      uStack_7c0 = 0;
      blake3_hasher_finalize(auStack_7b0,&local_7d0,0x20);
      auVar3._4_4_ = uStack_7c8;
      auVar3._0_4_ = uStack_7cc;
      auVar3._8_4_ = uStack_7c4;
      bVar5 = auVar12 == auVar3;
      goto LAB_008de474;
    }
  }
  bVar5 = false;
LAB_008de474:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar5);
  }
  return;
}

