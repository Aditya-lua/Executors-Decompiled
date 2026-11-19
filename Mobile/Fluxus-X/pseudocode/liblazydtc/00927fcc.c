/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00927fcc
 */

void FUN_00927fcc(undefined8 param_1,long param_2)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  long local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  uVar4 = FUN_009356e0(&local_50,param_1,&PTR_s_cr_mime_00c4f808,4);
  if ((int)uVar4 == 0) {
    lVar5 = *(long *)(local_50 + 0x10);
    *(long *)(lVar5 + 0x20) = param_2;
    *(undefined8 *)(param_2 + 0xa0) = 0;
    *(undefined8 *)(param_2 + 0xa8) = 0;
    *(undefined8 *)(param_2 + 0x98) = 0;
    uVar1 = (*(uint *)(param_2 + 0x14) & 2) << 1;
    if ((uVar1 < *(uint *)(param_2 + 0x78)) &&
       ((*(code **)(param_2 + 0x28) == (code *)0x0 ||
        (iVar3 = (**(code **)(param_2 + 0x28))(*(undefined8 *)(param_2 + 0x38),0,0), iVar3 != 0))))
    {
      *(undefined8 *)(param_2 + 0x1b0) = 1;
      FUN_0093578c(param_1,local_50);
      uVar4 = 0x41;
    }
    else {
      *(uint *)(param_2 + 0x78) = uVar1;
      *(undefined8 *)(param_2 + 0x80) = 0;
      *(undefined8 *)(param_2 + 0x88) = 0;
      *(undefined8 *)(param_2 + 0x1b0) = 1;
      uVar4 = FUN_009280cc(*(undefined8 *)(lVar5 + 0x20));
      *(undefined8 *)(lVar5 + 0x28) = uVar4;
      uVar4 = FUN_00935ad8(param_1,local_50);
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

