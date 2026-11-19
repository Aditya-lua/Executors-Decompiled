/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9c88
 */

int SSL_CONF_cmd(byte *param_1,long param_2,char *param_3)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  char *pcVar4;
  uint uVar5;
  byte bVar6;
  int iVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  ulong uVar10;
  ulong *puVar11;
  long local_28;
  
  local_28 = param_2;
  if (param_2 == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_conf.c",0x379,"SSL_CONF_cmd");
    uVar9 = 0x181;
  }
  else {
    iVar7 = FUN_009b9ec0(param_1,&local_28);
    if ((iVar7 == 0) ||
       (puVar8 = (undefined8 *)FUN_009b9fa4(param_1,local_28), puVar8 == (undefined8 *)0x0)) {
      if ((*param_1 >> 4 & 1) != 0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_conf.c",0x39a,"SSL_CONF_cmd");
        ERR_set_error(0x14,0x182,"cmd=%s",local_28);
      }
      return -2;
    }
    if (*(short *)((long)puVar8 + 0x1a) != 4) {
      if (param_3 == (char *)0x0) {
        iVar7 = -3;
        bVar6 = *param_1;
      }
      else {
        iVar7 = (*(code *)*puVar8)(param_1,param_3);
        if (0 < iVar7) {
          return 2;
        }
        if (iVar7 != -2) {
          iVar7 = 0;
        }
        bVar6 = *param_1;
      }
      if ((bVar6 >> 4 & 1) == 0) {
        return iVar7;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_conf.c",0x392,"SSL_CONF_cmd");
      pcVar4 = "<EMPTY>";
      if (param_3 != (char *)0x0) {
        pcVar4 = param_3;
      }
      ERR_set_error(0x14,0x180,"cmd=%s, value=%s",local_28,pcVar4);
      return iVar7;
    }
    if ((ulong)((long)(puVar8 + -0x18ad2a) >> 5) < 0x18) {
      puVar11 = *(ulong **)(param_1 + 0x28);
      if (puVar11 == (ulong *)0x0) {
        return 1;
      }
      lVar1 = ((long)(puVar8 + -0x18ad2a) >> 5) * 0x10;
      uVar10 = *(ulong *)(&DAT_0074c4c8 + lVar1);
      uVar3 = *(uint *)(&DAT_0074c4d0 + lVar1) & 0xf00;
      uVar2 = ~*(uint *)(&DAT_0074c4d0 + lVar1) & 1;
      if (uVar3 == 0) {
        if (uVar2 == 0) {
          uVar10 = *puVar11 & (uVar10 ^ 0xffffffffffffffff);
        }
        else {
          uVar10 = *puVar11 | uVar10;
        }
        *puVar11 = uVar10;
        return 1;
      }
      if (uVar3 == 0x200) {
        param_1 = param_1 + 0x80;
      }
      else {
        if (uVar3 != 0x100) {
          return 1;
        }
        param_1 = param_1 + 0x78;
      }
      uVar5 = **(uint **)param_1;
      uVar3 = uVar5 & ((uint)uVar10 ^ 0xffffffff);
      if (uVar2 != 0) {
        uVar3 = uVar5 | (uint)uVar10;
      }
      **(uint **)param_1 = uVar3;
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_conf.c",0x36c,"ctrl_switch_option");
    uVar9 = 0xc0103;
  }
  ERR_set_error(0x14,uVar9,0);
  return 0;
}

