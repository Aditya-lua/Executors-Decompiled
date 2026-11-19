/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbaeac
 */

void ZSTD_decompressBlock_internal
               (long param_1,ulong param_2,ulong param_3,long param_4,ulong param_5)

{
  ulong uVar1;
  long lVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  int local_6c;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if (*(int *)(param_1 + 0x75e0) == 0) {
    if (param_5 < 0x20001) goto LAB_00bbaf18;
  }
  else if (param_5 <= *(uint *)(param_1 + 0x74f8)) {
LAB_00bbaf18:
    uVar4 = FUN_00bba2e4(param_1,param_4,param_5,param_2,param_3);
    if (uVar4 < 0xffffffffffffff89) {
      param_4 = param_4 + uVar4;
      lVar6 = param_5 - uVar4;
      if (*(int *)(param_1 + 0x75e0) == 0) {
        uVar4 = 0x20000;
      }
      else {
        uVar4 = (ulong)*(uint *)(param_1 + 0x74f8);
      }
      lVar7 = *(long *)(param_1 + 0x74d0);
      uVar3 = *(uint *)(param_1 + 0x75fc);
      uVar1 = param_3;
      if (uVar4 <= param_3) {
        uVar1 = uVar4;
      }
      uVar5 = ZSTD_decodeSeqHeaders(param_1,&local_6c,param_4,lVar6);
      uVar4 = uVar5;
      if (uVar5 < 0xffffffffffffff89) {
        uVar4 = 0xffffffffffffffba;
        if ((param_2 < 0xfffffffffff00000) && (param_2 != 0 && param_3 != 0 || local_6c < 1)) {
          lVar6 = lVar6 - uVar5;
          if ((uVar3 == 0) && ((0x1000000 < (param_2 + uVar1) - lVar7 && (8 < local_6c)))) {
            uVar3 = FUN_00bbb08c(*(undefined8 *)(param_1 + 0x10),local_6c);
            uVar3 = (uint)(6 < uVar3);
          }
          *(undefined4 *)(param_1 + 0x75fc) = 0;
          if (uVar3 == 0) {
            if (*(int *)(param_1 + 0x76a0) == 2) {
              uVar4 = FUN_00bbd630();
            }
            else {
              uVar4 = FUN_00bbee80(param_1,param_2,param_3,param_4 + uVar5,lVar6,local_6c);
            }
          }
          else {
            uVar4 = FUN_00bbb0e8(param_1,param_2,param_3,param_4 + uVar5,lVar6);
          }
        }
      }
    }
    goto LAB_00bbb058;
  }
  uVar4 = 0xffffffffffffffb8;
LAB_00bbb058:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

