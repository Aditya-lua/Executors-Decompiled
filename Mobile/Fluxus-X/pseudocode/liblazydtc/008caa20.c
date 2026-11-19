/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008caa20
 */

void FUN_008caa20(long param_1,undefined8 *param_2)

{
  long lVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 local_58;
  undefined4 local_4c;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  lVar4 = *(long *)(param_1 + 0x68);
  if (*(long *)(param_1 + 0x48) - lVar4 < 0x11) {
    FUN_008b41e4(param_1,1);
    lVar4 = *(long *)(param_1 + 0x68);
  }
  uVar2 = *(uint *)(param_2 + 2);
  local_58 = *param_2;
  lVar1 = param_2[1];
  lVar5 = *(long *)(param_1 + 0x58);
  *(long *)(param_1 + 0x68) = lVar4 + 0x10;
  *(undefined4 *)(lVar4 + 0xc) = 0;
  local_4c = 6;
  FUN_008cadd4(param_1,&local_58,lVar1 + ((ulong)(uVar2 >> 0x14) & 0x3ff) * 0x10,lVar4);
  if ((int)uVar2 < 0) {
    lVar4 = lVar4 - lVar5;
    lVar5 = *(long *)(param_1 + 0x58) + lVar4;
    if (((*(int *)(lVar5 + 0xc) != 0) &&
        (FUN_008cadd4(param_1,lVar5,lVar1 + ((ulong)(uVar2 >> 10) & 0x3ff) * 0x10,lVar5),
        2 < uVar2 >> 0x1e)) &&
       (lVar4 = *(long *)(param_1 + 0x58) + lVar4, *(int *)(lVar4 + 0xc) != 0)) {
      FUN_008cadd4(param_1,lVar4,lVar1 + ((ulong)uVar2 & 0x3ff) * 0x10,lVar4);
    }
  }
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

