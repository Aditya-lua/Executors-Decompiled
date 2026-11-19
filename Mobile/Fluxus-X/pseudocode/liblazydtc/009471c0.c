/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009471c0
 */

int FUN_009471c0(long param_1,char *param_2,undefined1 *param_3)

{
  long lVar1;
  long lVar2;
  int iVar3;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  *param_2 = '\0';
  FUN_00932998(param_1 + 0xd8,param_1);
  iVar3 = FUN_009472e8(param_1,&local_50,param_2);
  lVar2 = local_50;
  if (iVar3 == 0) {
    if (1 < *(ulong *)(local_50 + 1000)) {
      iVar3 = 0;
      *param_3 = 1;
      goto LAB_009472b8;
    }
    iVar3 = 0;
    if (*param_2 != '\0') goto LAB_009472b8;
    iVar3 = FUN_00947128(param_1,param_3);
    lVar2 = local_50;
  }
  if (((iVar3 != 0x59) && (iVar3 != 0)) && (lVar2 != 0)) {
    FUN_0092bab8(param_1);
    FUN_0090fe90(param_1,lVar2,1);
    if (*(long *)(lVar2 + 0x30) != 0) {
      FUN_00917b54(param_1);
      *(undefined8 *)(lVar2 + 0x30) = 0;
    }
    FUN_00924ee4(lVar2);
    FUN_009109f8(param_1,lVar2,1);
  }
LAB_009472b8:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

