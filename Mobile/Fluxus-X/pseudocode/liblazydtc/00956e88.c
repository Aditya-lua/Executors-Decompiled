/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00956e88
 */

undefined8 FUN_00956e88(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  char *pcVar3;
  long lVar4;
  undefined1 *puVar5;
  long lVar6;
  
  lVar6 = *(long *)(param_1 + 0x1a0);
  lVar4 = *(long *)(lVar6 + 0x18);
  if (lVar4 == 0) {
    lVar4 = *(long *)(lVar6 + 0x20);
    if (lVar4 == 0) {
      FUN_00904b80(param_1,"Cannot FETCH without a UID.");
      return 3;
    }
    puVar5 = &DAT_002ab32c;
    if (*(undefined1 **)(lVar6 + 0x28) != (undefined1 *)0x0) {
      puVar5 = *(undefined1 **)(lVar6 + 0x28);
    }
    if (*(long *)(lVar6 + 0x30) != 0) {
      pcVar3 = "FETCH %s BODY[%s]<%s>";
      goto LAB_00956ef0;
    }
    pcVar3 = "FETCH %s BODY[%s]";
  }
  else {
    puVar5 = &DAT_002ab32c;
    if (*(undefined1 **)(lVar6 + 0x28) != (undefined1 *)0x0) {
      puVar5 = *(undefined1 **)(lVar6 + 0x28);
    }
    if (*(long *)(lVar6 + 0x30) != 0) {
      pcVar3 = "UID FETCH %s BODY[%s]<%s>";
LAB_00956ef0:
      uVar2 = FUN_00956a58(param_1,pcVar3,lVar4,puVar5);
      iVar1 = (int)uVar2;
      goto joined_r0x00956ef8;
    }
    pcVar3 = "UID FETCH %s BODY[%s]";
  }
  uVar2 = FUN_00956a58(param_1,pcVar3,lVar4,puVar5);
  iVar1 = (int)uVar2;
joined_r0x00956ef8:
  if (iVar1 == 0) {
    *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x518) = 9;
  }
  return uVar2;
}

