/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945e90
 */

int FUN_00945e90(long *param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 *puVar6;
  undefined8 local_48;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = 0;
  if ((*(byte *)(*param_1 + 0x3a) & 1) != 0) {
    lVar3 = FUN_009252a8(param_2);
    if (lVar3 == 0) {
      puVar6 = &DAT_002ab32c;
      uVar4 = 0;
    }
    else {
      lVar3 = FUN_009252b0(param_2);
      if (lVar3 != 0) {
        uVar4 = FUN_009252a8(param_2);
        uVar5 = FUN_009252b0(param_2);
        iVar2 = FUN_0091e888(uVar4,uVar5,&local_40,&local_48);
        if (iVar2 == 0) {
          FUN_0092525c(param_2,local_40,local_48,curl_free);
        }
        goto LAB_00945f54;
      }
      puVar6 = &DAT_002c4dac;
      uVar4 = 1;
    }
    FUN_0092525c(param_2,puVar6,uVar4,0);
    iVar2 = 0;
  }
LAB_00945f54:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

