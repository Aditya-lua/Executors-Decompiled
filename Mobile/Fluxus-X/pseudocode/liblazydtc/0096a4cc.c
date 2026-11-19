/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096a4cc
 */

int FUN_0096a4cc(long param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = 0;
  lVar4 = *(long *)(*(long *)(param_1 + 0x18) + 0x3a0);
  lVar3 = (*(code *)PTR_calloc_00cc4690)(1,0x60);
  if (lVar3 == 0) {
    iVar2 = 0x1b;
  }
  else {
    *(ulong *)(lVar3 + 0x28) = (lVar4 << 0x27) >> 0x3f & 0x749238;
    lVar4 = (*(code *)PTR_calloc_00cc4690)(1,*(undefined8 *)(PTR_DAT_00cc4d08 + 0x18));
    *(long *)(lVar3 + 0x30) = lVar4;
    if (lVar4 == 0) {
      (*(code *)PTR_free_00cc4678)(lVar3);
      iVar2 = 0x1b;
    }
    else {
      iVar2 = FUN_00907328(&local_50,&PTR_s_SSL_PROXY_00cc4d98,lVar3);
      if (iVar2 == 0) {
        FUN_009073e8(param_1,local_50);
      }
      else {
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar3 + 0x30));
        (*(code *)PTR_free_00cc4678)(lVar3);
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

