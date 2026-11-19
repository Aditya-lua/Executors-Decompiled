/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ae364
 */

void FUN_008ae364(long param_1,int param_2)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_2 < 2) {
    if (param_2 == 0) {
      if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
        FUN_008b63a4(param_1,param_1,param_1 + 0x38);
      }
      lVar4 = *(long *)(param_1 + 0x50);
      puVar6 = *(undefined8 **)(param_1 + 0x68);
      puVar5 = *(undefined8 **)(lVar4 + 0x18);
      if (puVar5 < puVar6 + 2) {
        if (0x1f3f0 < (long)puVar6 - *(long *)(param_1 + 0x70)) {
LAB_008ae4dc:
          FUN_008b9568(param_1,"stack overflow");
          if (*(long *)(lVar1 + 0x28) == local_38) {
            FUN_008aa5f4(param_1);
          }
          goto LAB_008ae504;
        }
        if (*(long *)(param_1 + 0x48) - (long)puVar6 < 0x11) {
          local_3c = 1;
          iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
          if (iVar2 != 0) goto LAB_008ae4dc;
          lVar4 = *(long *)(param_1 + 0x50);
          puVar6 = *(undefined8 **)(param_1 + 0x68);
          puVar5 = *(undefined8 **)(lVar4 + 0x18);
        }
        if (puVar5 < puVar6 + 2) {
          *(undefined8 **)(lVar4 + 0x18) = puVar6 + 2;
        }
      }
      uVar3 = FUN_008b9ff8(param_1,&DAT_002ab32c,0);
      *puVar6 = uVar3;
      lVar4 = *(long *)(param_1 + 0x68);
      *(undefined4 *)((long)puVar6 + 0xc) = 5;
      lVar4 = lVar4 + 0x10;
      goto LAB_008ae4b4;
    }
  }
  else {
    if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
      FUN_008b52c4(param_1,1);
    }
    if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
      FUN_008b63a4(param_1,param_1,param_1 + 0x38);
    }
    FUN_008cc074(param_1,param_2,
                 (int)((ulong)(*(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x70)) >> 4) + -1);
    lVar4 = *(long *)(param_1 + 0x68) + (ulong)(param_2 - 1) * -0x10;
LAB_008ae4b4:
    *(long *)(param_1 + 0x68) = lVar4;
  }
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008ae504:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

