/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af86d8
 */

undefined8 FUN_00af86d8(BIO *param_1,int param_2,uint param_3,int *param_4)

{
  char *param2;
  undefined1 *puVar1;
  int iVar2;
  byte bVar3;
  size_t sVar4;
  uint uVar5;
  size_t __n;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  char acStack_62 [18];
  
  iVar2 = *param_4;
  __n = (size_t)iVar2;
  if (iVar2 < 0) {
    return 0;
  }
  if (param_2 == 1) {
    if (4 < iVar2) {
      return 0;
    }
    if (iVar2 < 1) {
      sVar4 = 0;
    }
    else {
      memcpy(acStack_62 + 2,*(void **)(param_4 + 2),__n);
      if ((*(ulong *)(param_4 + 4) & 7) != 0) {
        uVar5 = 8 - (int)(*(ulong *)(param_4 + 4) & 7);
        if ((param_3 & 0xff) == 0) {
          bVar3 = acStack_62[__n + 1] & (byte)(-0x100 >> (uVar5 & 0x1f));
        }
        else {
          bVar3 = acStack_62[__n + 1] | (byte)(0xff >> (ulong)(uVar5 & 0x1f));
        }
        acStack_62[__n + 1] = bVar3;
      }
      sVar4 = __n;
    }
    memset(acStack_62 + sVar4 + 2,param_3,4 - __n);
    BIO_printf(param_1,"%d.%d.%d.%d",(uint)(byte)acStack_62[2],(uint)(byte)acStack_62[3],
               (uint)(byte)acStack_62[4],(uint)(byte)acStack_62[5]);
  }
  else if (param_2 == 2) {
    if (0x10 < iVar2) {
      return 0;
    }
    if (iVar2 < 1) {
      __n = 0;
    }
    else {
      memcpy(acStack_62 + 2,*(void **)(param_4 + 2),__n);
      if ((*(ulong *)(param_4 + 4) & 7) != 0) {
        uVar5 = 8 - (int)(*(ulong *)(param_4 + 4) & 7);
        if ((param_3 & 0xff) == 0) {
          bVar3 = acStack_62[__n + 1] & (byte)(-0x100 >> (uVar5 & 0x1f));
        }
        else {
          bVar3 = acStack_62[__n + 1] | (byte)(0xff >> (ulong)(uVar5 & 0x1f));
        }
        acStack_62[__n + 1] = bVar3;
      }
    }
    memset(acStack_62 + __n + 2,param_3,(long)(0x10 - iVar2));
    uVar8 = 0x10;
    do {
      uVar7 = uVar8;
      if (uVar7 == 0) goto LAB_00af8928;
    } while ((acStack_62[uVar7 + 1] == '\0') && (uVar8 = uVar7 - 2, acStack_62[uVar7] == '\0'));
    uVar5 = (uint)uVar7;
    if ((int)uVar5 < 1) {
LAB_00af8928:
      BIO_puts(param_1,":");
    }
    else {
      uVar8 = 0;
      do {
        puVar1 = &DAT_002bcda4;
        if (0xd < uVar8) {
          puVar1 = &DAT_002ab32c;
        }
        BIO_printf(param_1,"%x%s",(ulong)CONCAT11(acStack_62[uVar8 + 2],acStack_62[uVar8 + 3]),
                   puVar1);
        uVar8 = uVar8 + 2;
      } while (uVar8 < (uVar7 & 0xfffffffe));
      if (0xf < uVar5) {
        return 1;
      }
      BIO_puts(param_1,":");
      if (uVar5 != 0) {
        return 1;
      }
    }
    BIO_puts(param_1,":");
  }
  else {
    if (0 < iVar2) {
      lVar6 = 0;
      do {
        param2 = "";
        if (lVar6 != 0) {
          param2 = ":";
        }
        BIO_printf(param_1,"%s%02x",param2,(uint)*(byte *)(*(long *)(param_4 + 2) + lVar6));
        lVar6 = lVar6 + 1;
      } while (lVar6 < *param_4);
    }
    BIO_printf(param_1,"[%d]",(ulong)(param_4[4] & 7));
  }
  return 1;
}

