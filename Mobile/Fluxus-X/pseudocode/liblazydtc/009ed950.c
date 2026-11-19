/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ed950
 */

int FUN_009ed950(byte *param_1,uint param_2,uint param_3,uint param_4,undefined8 param_5,
                undefined8 param_6,undefined8 param_7)

{
  long lVar1;
  byte *pbVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  uint uVar7;
  long lVar8;
  byte *str;
  int iVar9;
  uchar local_70 [8];
  ulong local_68;
  
  if ((param_3 & 7) == 2) {
    if ((param_2 & 1) == 0) goto LAB_009ed9d0;
    ERR_new();
    ERR_set_debug("crypto/asn1/a_strex.c",0xa1,"do_buf");
    uVar6 = 0x81;
  }
  else {
    if (((param_3 & 7) != 4) || ((param_2 & 3) == 0)) {
LAB_009ed9d0:
      if (param_2 == 0) {
        return 0;
      }
      iVar9 = 0;
      lVar1 = (long)(int)param_2;
      str = param_1;
      do {
        uVar7 = 0;
        if (str == param_1 && (param_4 & 1) != 0) {
          uVar7 = 0x20;
        }
        switch(param_3 & 7) {
        case 0:
          iVar4 = UTF8_getc(str,param_2,&local_68);
          if (iVar4 < 0) {
            return -1;
          }
          param_2 = param_2 - iVar4;
          str = str + iVar4;
          break;
        case 1:
          local_68 = (ulong)*str;
          str = str + 1;
          break;
        case 2:
          bVar3 = *str;
          pbVar2 = str + 1;
          str = str + 2;
          local_68 = (ulong)CONCAT11(bVar3,*pbVar2);
          break;
        default:
          return -1;
        case 4:
          local_68 = (ulong)*str << 0x18 | (ulong)str[1] << 0x10 | (ulong)str[2] << 8 |
                     (ulong)str[3];
          str = str + 4;
        }
        if (str == param_1 + lVar1 && (param_4 & 1) != 0) {
          uVar7 = 0x40;
        }
        if ((param_3 >> 3 & 1) == 0) {
          iVar4 = FUN_009edbbc(local_68,uVar7 | param_4,param_5,param_6,param_7);
          if (iVar4 < 0) {
            return -1;
          }
          iVar9 = iVar4 + iVar9;
        }
        else {
          iVar4 = UTF8_putc(local_70,6,local_68);
          if (0 < iVar4) {
            lVar8 = 0;
            do {
              iVar5 = FUN_009edbbc(local_70[lVar8],uVar7 | param_4,param_5,param_6,param_7);
              if (iVar5 < 0) {
                return -1;
              }
              lVar8 = lVar8 + 1;
              iVar9 = iVar5 + iVar9;
            } while (lVar8 < iVar4);
          }
        }
      } while (str != param_1 + lVar1);
      return iVar9;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/a_strex.c",0x9b,"do_buf");
    uVar6 = 0x85;
  }
  ERR_set_error(0xd,uVar6,0);
  return -1;
}

