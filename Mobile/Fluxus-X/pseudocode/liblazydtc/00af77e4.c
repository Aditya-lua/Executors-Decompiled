/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af77e4
 */

undefined8 FUN_00af77e4(undefined8 param_1,undefined8 param_2,BIO *param_3,uint param_4)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  char *pcVar7;
  undefined1 *puVar8;
  int *piVar9;
  uint param4;
  undefined8 uVar10;
  
  iVar2 = OPENSSL_sk_num(param_2);
  if (0 < iVar2) {
    iVar2 = 0;
    do {
      puVar5 = (undefined8 *)OPENSSL_sk_value(param_2,iVar2);
      if (((puVar5 == (undefined8 *)0x0) || (piVar9 = (int *)*puVar5, piVar9 == (int *)0x0)) ||
         (puVar8 = *(undefined1 **)(piVar9 + 2), puVar8 == (undefined1 *)0x0)) {
        param4 = 0;
LAB_00af78c0:
        BIO_printf(param_3,"%*sUnknown AFI %u",param_4,"",param4);
      }
      else {
        param4 = 0;
        if (*piVar9 < 2) goto LAB_00af78c0;
        param4 = (uint)CONCAT11(*puVar8,puVar8[1]);
        if (param4 == 2) {
          pcVar7 = "%*sIPv6";
        }
        else {
          if (param4 != 1) goto LAB_00af78c0;
          pcVar7 = "%*sIPv4";
        }
        BIO_printf(param_3,pcVar7,(ulong)param_4,&DAT_002ab32c);
      }
      if (2 < *(int *)*puVar5) {
        bVar1 = *(byte *)(*(long *)((int *)*puVar5 + 2) + 2);
        switch(bVar1) {
        case 1:
          pcVar7 = " (Unicast)";
          break;
        case 2:
          pcVar7 = " (Multicast)";
          break;
        case 3:
          pcVar7 = " (Unicast/Multicast)";
          break;
        case 4:
          pcVar7 = " (MPLS)";
          break;
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 0xb:
        case 0xc:
        case 0xd:
        case 0xe:
        case 0xf:
        case 0x10:
        case 0x11:
        case 0x12:
        case 0x13:
        case 0x14:
        case 0x15:
        case 0x16:
        case 0x17:
        case 0x18:
        case 0x19:
        case 0x1a:
        case 0x1b:
        case 0x1c:
        case 0x1d:
        case 0x1e:
        case 0x1f:
        case 0x20:
        case 0x21:
        case 0x22:
        case 0x23:
        case 0x24:
        case 0x25:
        case 0x26:
        case 0x27:
        case 0x28:
        case 0x29:
        case 0x2a:
        case 0x2b:
        case 0x2c:
        case 0x2d:
        case 0x2e:
        case 0x2f:
        case 0x30:
        case 0x31:
        case 0x32:
        case 0x33:
        case 0x34:
        case 0x35:
        case 0x36:
        case 0x37:
        case 0x38:
        case 0x39:
        case 0x3a:
        case 0x3b:
        case 0x3c:
        case 0x3d:
        case 0x3e:
        case 0x3f:
switchD_00af7910_caseD_5:
          BIO_printf(param_3," (Unknown SAFI %u)",(uint)bVar1);
          goto LAB_00af79b0;
        case 0x40:
          pcVar7 = " (Tunnel)";
          break;
        case 0x41:
          pcVar7 = " (VPLS)";
          break;
        case 0x42:
          pcVar7 = " (BGP MDT)";
          break;
        default:
          if (bVar1 != 0x80) goto switchD_00af7910_caseD_5;
          pcVar7 = " (MPLS-labeled VPN)";
        }
        BIO_puts(param_3,pcVar7);
      }
LAB_00af79b0:
      if (*(int *)puVar5[1] == 1) {
        BIO_puts(param_3,":\n");
        uVar10 = *(undefined8 *)(puVar5[1] + 8);
        iVar4 = OPENSSL_sk_num(uVar10);
        if (0 < iVar4) {
          iVar4 = 0;
          do {
            piVar9 = (int *)OPENSSL_sk_value(uVar10,iVar4);
            BIO_printf(param_3,"%*s",(ulong)(param_4 + 2),&DAT_002ab32c);
            if (*piVar9 == 1) {
              uVar6 = FUN_00af86d8(param_3,param4,0,**(undefined8 **)(piVar9 + 2));
              if ((int)uVar6 == 0) {
                return uVar6;
              }
              BIO_puts(param_3,"-");
              uVar6 = FUN_00af86d8(param_3,param4,0xff,*(undefined8 *)(*(long *)(piVar9 + 2) + 8));
              if ((int)uVar6 == 0) {
                return uVar6;
              }
              BIO_puts(param_3,"\n");
            }
            else if (*piVar9 == 0) {
              uVar6 = FUN_00af86d8(param_3,param4,0,*(undefined8 *)(piVar9 + 2));
              if ((int)uVar6 == 0) {
                return uVar6;
              }
              BIO_printf(param_3,"/%d\n",
                         (ulong)(**(int **)(piVar9 + 2) * 8 - ((*(int **)(piVar9 + 2))[4] & 7U)));
            }
            iVar4 = iVar4 + 1;
            iVar3 = OPENSSL_sk_num(uVar10);
          } while (iVar4 < iVar3);
        }
      }
      else if (*(int *)puVar5[1] == 0) {
        BIO_puts(param_3,": inherit\n");
      }
      iVar2 = iVar2 + 1;
      iVar4 = OPENSSL_sk_num(param_2);
    } while (iVar2 < iVar4);
  }
  return 1;
}

