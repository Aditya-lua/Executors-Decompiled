/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009edbbc
 */

undefined4
FUN_009edbbc(ulong param_1,uint param_2,undefined1 *param_3,code *param_4,undefined8 param_5)

{
  int iVar1;
  char *pcVar2;
  undefined8 uVar3;
  uint uVar4;
  uint uVar5;
  undefined4 uVar6;
  char acStack_44 [20];
  undefined1 local_24 [4];
  
  if (param_1 >> 0x20 != 0) {
    return 0xffffffff;
  }
  if (param_1 < 0x10000) {
    if (param_1 < 0x100) {
      uVar4 = (uint)param_1;
      local_24[0] = (undefined1)param_1;
      if ((uVar4 >> 7 & 1) == 0) {
        uVar5 = *(ushort *)(&DAT_0074dd94 + (param_1 & 0xff) * 2) & param_2;
      }
      else {
        uVar5 = param_2 & 4;
      }
      if ((uVar5 & 0x61) != 0) {
        if ((uVar5 >> 3 & 1) == 0) {
          iVar1 = (*param_4)(param_5,&DAT_002ab715,1);
          if (iVar1 == 0) {
            return 0xffffffff;
          }
          iVar1 = (*param_4)(param_5,local_24,1);
          uVar6 = 2;
          if (iVar1 == 0) {
            uVar6 = 0xffffffff;
          }
          return uVar6;
        }
        if (param_3 != (undefined1 *)0x0) {
          *param_3 = 1;
        }
LAB_009edd14:
        iVar1 = (*param_4)(param_5,local_24,1);
        uVar6 = 1;
        if (iVar1 == 0) {
          uVar6 = 0xffffffff;
        }
        return uVar6;
      }
      if ((uVar5 & 0x406) == 0) {
        if (((uVar4 & 0xff) != 0x5c) || ((param_2 & 0x40f) == 0)) goto LAB_009edd14;
        pcVar2 = "\\\\";
        uVar3 = 2;
        uVar6 = 2;
      }
      else {
        BIO_snprintf(acStack_44,0xb,"\\%02X",uVar4 & 0xff);
        pcVar2 = acStack_44;
        uVar3 = 3;
        uVar6 = 3;
      }
    }
    else {
      BIO_snprintf(acStack_44,0x13,"\\U%04lX",param_1);
      pcVar2 = acStack_44;
      uVar3 = 6;
      uVar6 = 6;
    }
  }
  else {
    BIO_snprintf(acStack_44,0x13,"\\W%08lX",param_1);
    pcVar2 = acStack_44;
    uVar3 = 10;
    uVar6 = 10;
  }
  iVar1 = (*param_4)(param_5,pcVar2,uVar3);
  if (iVar1 == 0) {
    uVar6 = 0xffffffff;
  }
  return uVar6;
}

