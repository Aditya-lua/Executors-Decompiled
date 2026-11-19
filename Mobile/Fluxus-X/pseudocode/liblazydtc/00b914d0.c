/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b914d0
 */

int FUN_00b914d0(undefined4 *param_1,uint param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  int iVar2;
  char cVar3;
  undefined2 local_50;
  undefined2 local_4e;
  undefined8 local_4c;
  undefined8 local_44;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_50 = 0x1100;
  local_4e = (undefined2)(param_4 * 8);
  if (0xfff8 < (ulong)(param_4 * 8)) {
    local_4e = 0xffff;
  }
  local_44 = 0;
  local_3c = 0;
  local_4c = 0x140000000000;
  param_2 = param_2 & 0xff;
  *(byte *)((long)param_1 + 5) = *(byte *)((long)param_1 + 5) | 1;
  cVar3 = '\x10';
  switch(param_2) {
  case 3:
    break;
  case 4:
  case 5:
    cVar3 = '\x14';
    break;
  default:
    cVar3 = ((param_2 | 0x2000000) == 0x2000013) << 6;
    break;
  case 8:
  case 0xc:
  case 0x10:
    cVar3 = '\x1c';
    break;
  case 9:
  case 0xd:
  case 0x11:
    cVar3 = ' ';
    break;
  case 10:
  case 0x12:
    cVar3 = '0';
    break;
  case 0xb:
    cVar3 = '@';
  }
  *(char *)(param_1 + 1) = cVar3;
  iVar2 = mbedtls_psa_mac_sign_setup(param_1 + 2,&local_50,param_3,param_4,param_2 | 0x3800000);
  if ((iVar2 != -0x86) && (iVar2 == 0)) {
    *param_1 = 1;
  }
  psa_reset_key_attributes(&local_50);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

