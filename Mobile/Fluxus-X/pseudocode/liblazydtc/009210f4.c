/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009210f4
 */

int curl_formget(undefined8 param_1,undefined8 param_2,code *param_3)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 auStack_2200 [8192];
  undefined1 auStack_200 [440];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  FUN_00925f84(auStack_200);
  iVar2 = FUN_00921204(0,auStack_200,param_1,0);
  if ((iVar2 == 0) && (iVar2 = FUN_00927968(0,auStack_200,"multipart/form-data",0,1), iVar2 == 0)) {
    do {
      uVar3 = FUN_009272ac(auStack_2200,1,0x2000,auStack_200);
      if (uVar3 == 0) {
        iVar2 = 0;
        goto LAB_009211c8;
      }
    } while ((uVar3 < 0x2001) && (uVar4 = (*param_3)(param_2,auStack_2200,uVar3), uVar4 == uVar3));
    iVar2 = 0x2a;
    if (uVar3 != 0x10000000) {
      iVar2 = 0x1a;
    }
  }
LAB_009211c8:
  FUN_00925eb8(auStack_200);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

