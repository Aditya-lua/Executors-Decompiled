
/* WARNING: Removing unreachable block (ram,0x007246d8) */
/* WARNING: Removing unreachable block (ram,0x007246f8) */

bool FUN_007245a8(long param_1,undefined8 param_2,long param_3)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000048;
  
  if ((*(int *)(param_1 + 0x138) == 0) || (*(uint *)(param_1 + 0x13c) <= *(uint *)(param_3 + 4))) {
    func_0x00721808(param_1,param_2,param_3,0);
    func_0x0070c3d0(&uStack0000000000000028,param_1 + 0x60);
    iVar2 = (int)uStack0000000000000028;
  }
  else {
    uStack0000000000000018 = 0;
    in_stack_00000020 = 0;
    func_0x0070aa08(&uStack0000000000000028,&uStack0000000000000018);
    func_0x0070aa74(&uStack0000000000000048,&uStack0000000000000028);
    func_0x00798aa4(&uStack0000000000000028,"; did you forget to close %s at line %d?");
    puVar1 = (undefined8 *)CONCAT44(uStack0000000000000028._4_4_,(int)uStack0000000000000028);
    if (-1 < in_stack_00000038._7_1_) {
      puVar1 = &uStack0000000000000028;
    }
    func_0x00721808(param_1,param_2,param_3,puVar1);
    if (in_stack_00000038._7_1_ < '\0') {
      __ZdlPv(CONCAT44(uStack0000000000000028._4_4_,(int)uStack0000000000000028));
    }
    func_0x0070c3d0(&uStack0000000000000028,param_1 + 0x60);
    iVar2 = (int)uStack0000000000000028;
  }
  if (iVar2 == (int)param_2) {
    uStack0000000000000028._0_4_ = iVar2;
    func_0x00710d48(param_1);
    func_0x00710d48(param_1);
  }
  return iVar2 == (int)param_2;
}

