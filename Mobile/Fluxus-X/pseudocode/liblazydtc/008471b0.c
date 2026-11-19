/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008471b0
 */

void FUN_008471b0(ulong *param_1,long param_2,char *param_3,char *param_4)

{
  ulong uVar1;
  byte bVar2;
  long lVar3;
  char *extraout_x1;
  ulong uVar4;
  __ndk1 *p_Var5;
  ulong local_88;
  ulong uStack_80;
  ulong local_78;
  undefined8 local_70;
  ulong uStack_68;
  __ndk1 *local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  uVar4 = (long)param_4 - (long)param_3;
  local_58 = *(long *)(lVar3 + 0x28);
  if (uVar4 < 0xfffffffffffffff8) {
    if (uVar4 < 0x17) {
      p_Var5 = (__ndk1 *)((ulong)&local_70 | 1);
      local_70 = CONCAT71(local_70._1_7_,(char)((int)uVar4 << 1));
    }
    else {
      uVar1 = 0x1a;
      if ((uVar4 | 7) != 0x17) {
        uVar1 = (uVar4 | 7) + 1;
      }
      p_Var5 = operator_new(uVar1);
      local_70 = uVar1 | 1;
      uStack_68 = uVar4;
      local_60 = p_Var5;
    }
    if (param_4 != param_3) {
      memcpy(p_Var5,param_3,uVar4);
      param_3 = extraout_x1;
    }
    p_Var5[uVar4] = (__ndk1)0x0;
    param_1[1] = 0;
    param_1[2] = 0;
    *param_1 = 0;
    uVar4 = local_70 >> 1 & 0x7f;
    if ((local_70 & 1) != 0) {
      uVar4 = uStack_68;
    }
    if (uVar4 != 0) {
      p_Var5 = local_60;
      if ((local_70 & 1) == 0) {
        p_Var5 = (__ndk1 *)((long)&local_70 + 1);
      }
                    /* try { // try from 0084728c to 00847293 has its CatchHandler @ 00847420 */
      std::__ndk1::__get_collation_name(p_Var5,param_3);
      param_1[1] = uStack_80;
      *param_1 = local_88;
      param_1[2] = local_78;
      uVar4 = (ulong)(byte)((byte)*param_1 >> 1);
      if (((byte)*param_1 & 1) != 0) {
        uVar4 = param_1[1];
      }
      if (uVar4 == 0) {
        uVar4 = local_70 >> 1 & 0x7f;
        if ((local_70 & 1) != 0) {
          uVar4 = uStack_68;
        }
        if (uVar4 < 3) {
          p_Var5 = (__ndk1 *)((ulong)&local_70 | 1);
          if ((local_70 & 1) != 0) {
            p_Var5 = local_60;
          }
                    /* try { // try from 008472f4 to 008472ff has its CatchHandler @ 0084741c */
          (**(code **)(**(long **)(param_2 + 0x10) + 0x20))
                    (&local_88,*(long **)(param_2 + 0x10),p_Var5,p_Var5 + uVar4);
          if ((*param_1 & 1) != 0) {
            operator_delete((void *)param_1[2],*param_1 & 0xfffffffffffffffe);
          }
          param_1[1] = uStack_80;
          *param_1 = local_88;
          bVar2 = (byte)*param_1;
          param_1[2] = local_78;
          uVar4 = (ulong)(bVar2 >> 1);
          if ((bVar2 & 1) != 0) {
            uVar4 = param_1[1];
          }
          if ((uVar4 == 0xc) || (uVar4 == 1)) {
            if (param_1 != &local_70) {
              if ((bVar2 & 1) == 0) {
                if ((local_70 & 1) == 0) {
                  param_1[1] = uStack_68;
                  *param_1 = local_70;
                  param_1[2] = (ulong)local_60;
                }
                else {
                  FUN_007fdf5c(param_1,local_60,uStack_68);
                }
              }
              else {
                uVar4 = local_70 >> 1 & 0x7f;
                p_Var5 = (__ndk1 *)((ulong)&local_70 | 1);
                if ((local_70 & 1) != 0) {
                  uVar4 = uStack_68;
                  p_Var5 = local_60;
                }
                    /* try { // try from 00847398 to 008473bf has its CatchHandler @ 00847418 */
                FUN_007fe004(param_1,p_Var5,uVar4);
              }
            }
          }
          else if ((bVar2 & 1) == 0) {
            *(undefined2 *)param_1 = 0;
          }
          else {
            *(undefined1 *)param_1[2] = 0;
            param_1[1] = 0;
          }
        }
      }
    }
    if ((local_70 & 1) != 0) {
      operator_delete(local_60,local_70 & 0xfffffffffffffffe);
    }
    if (*(long *)(lVar3 + 0x28) == local_58) {
      return;
    }
  }
  else if (*(long *)(lVar3 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

