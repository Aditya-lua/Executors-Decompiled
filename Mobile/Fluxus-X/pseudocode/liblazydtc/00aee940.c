/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee940
 */

int UI_process(UI *ui)

{
  char *pcVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  char *pcVar6;
  code *pcVar7;
  
  if ((*(code **)(*(long *)ui + 8) == (code *)0x0) ||
     (iVar2 = (**(code **)(*(long *)ui + 8))(ui), 0 < iVar2)) {
    if (((byte)ui[0x29] & 1) != 0) {
      ERR_print_errors_cb(FUN_00aeeb28,ui);
    }
    iVar2 = OPENSSL_sk_num(*(undefined8 *)(ui + 8));
    lVar5 = *(long *)ui;
    if (0 < iVar2) {
      iVar2 = 0;
      pcVar6 = "writing strings";
      do {
        pcVar7 = *(code **)(lVar5 + 0x10);
        if (pcVar7 != (code *)0x0) {
          uVar4 = OPENSSL_sk_value(*(undefined8 *)(ui + 8),iVar2);
          iVar3 = (*pcVar7)(ui,uVar4);
          if (iVar3 < 1) goto LAB_00aeeaa0;
        }
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(*(undefined8 *)(ui + 8));
        lVar5 = *(long *)ui;
      } while (iVar2 < iVar3);
    }
    if (*(code **)(lVar5 + 0x18) != (code *)0x0) {
      iVar2 = (**(code **)(lVar5 + 0x18))(ui);
      if (iVar2 == 0) {
        pcVar6 = "flushing";
        goto LAB_00aeeaa0;
      }
      if (iVar2 == -1) {
LAB_00aeea7c:
        pcVar6 = "processing";
        iVar2 = -2;
        *(uint *)(ui + 0x28) = *(uint *)(ui + 0x28) & 0xfffffffe;
        goto LAB_00aeeaa4;
      }
    }
    iVar2 = OPENSSL_sk_num(*(undefined8 *)(ui + 8));
    if (0 < iVar2) {
      iVar2 = 0;
      pcVar6 = "reading strings";
      do {
        pcVar7 = *(code **)(*(long *)ui + 0x20);
        if (pcVar7 == (code *)0x0) goto LAB_00aeea7c;
        uVar4 = OPENSSL_sk_value(*(undefined8 *)(ui + 8),iVar2);
        iVar3 = (*pcVar7)(ui,uVar4);
        if (iVar3 == 0) goto LAB_00aeeaa0;
        if (iVar3 == -1) goto LAB_00aeea7c;
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(*(undefined8 *)(ui + 8));
      } while (iVar2 < iVar3);
    }
    iVar2 = 0;
    pcVar6 = (char *)0x0;
  }
  else {
    pcVar6 = "opening session";
LAB_00aeeaa0:
    iVar2 = -1;
  }
LAB_00aeeaa4:
  if ((*(code **)(*(long *)ui + 0x28) == (code *)0x0) ||
     (iVar3 = (**(code **)(*(long *)ui + 0x28))(ui), 0 < iVar3)) {
    if (iVar2 != -1) {
      return iVar2;
    }
  }
  else {
    pcVar1 = "closing session";
    if (pcVar6 != (char *)0x0) {
      pcVar1 = pcVar6;
    }
    pcVar6 = pcVar1;
  }
  ERR_new();
  ERR_set_debug("crypto/ui/ui_lib.c",0x224,"UI_process");
  ERR_set_error(0x28,0x6b,"while %s",pcVar6);
  return -1;
}

