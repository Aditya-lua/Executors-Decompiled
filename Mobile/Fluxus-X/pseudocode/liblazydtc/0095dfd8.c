/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095dfd8
 */

int FUN_0095dfd8(long param_1,void *param_2,ulong param_3)

{
  long lVar1;
  int iVar2;
  void *pvVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long local_78;
  undefined4 local_70;
  undefined2 local_6c;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if ((long)param_3 < 0) {
    iVar2 = 100;
  }
  else {
    lVar5 = *(long *)(param_1 + 0x20);
    lVar4 = *(long *)(param_1 + 0x1a0);
    pvVar3 = memchr(param_2,0xff,param_3);
    if (pvVar3 == (void *)0x0) {
      iVar2 = 0;
    }
    else {
      lVar4 = lVar4 + 0x1cb8;
      FUN_0090456c(lVar4);
      if (param_3 == 0) {
        iVar2 = 0;
      }
      else {
        uVar6 = 0;
        while( true ) {
          iVar2 = FUN_009045fc(lVar4,(char *)((long)param_2 + uVar6),1);
          if (iVar2 != 0) break;
          if (*(char *)((long)param_2 + uVar6) == -1) {
            iVar2 = FUN_009045fc(lVar4,&DAT_002b716d,1);
          }
          if ((iVar2 != 0) || (uVar6 = uVar6 + 1, param_3 <= uVar6)) break;
        }
      }
      param_3 = FUN_00904984(lVar4);
      param_2 = (void *)FUN_0090497c(lVar4);
      if (iVar2 != 0) goto LAB_0095e140;
    }
    if (param_3 != 0) {
      uVar6 = 0;
      while( true ) {
        local_70 = *(undefined4 *)(lVar5 + 0x220);
        local_6c = 4;
        iVar2 = FUN_0093475c(&local_70,1,0xffffffffffffffff);
        if (iVar2 + 1U < 2) break;
        local_78 = 0;
        iVar2 = FUN_009434ec(param_1,(long)param_2 + uVar6,param_3 - uVar6,&local_78);
        if ((iVar2 != 0) || (uVar6 = local_78 + uVar6, param_3 <= uVar6)) goto LAB_0095e140;
      }
      iVar2 = 0x37;
    }
  }
LAB_0095e140:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

