/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c17a90
 */

undefined8 * FUN_00c17a90(long *param_1)

{
  short *psVar1;
  short *psVar2;
  short *psVar3;
  byte *pbVar4;
  undefined8 *puVar5;
  ulong uVar6;
  char *pcVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 *puVar10;
  short *psVar11;
  byte *pbVar12;
  byte *pbVar13;
  void *pvVar14;
  undefined8 local_40;
  long lStack_38;
  long local_18;
  
  psVar2 = (short *)*param_1;
  psVar3 = (short *)param_1[1];
  if (psVar2 == psVar3) {
    return (undefined8 *)0x0;
  }
  if ((char)*psVar2 != 'L') {
    return (undefined8 *)0x0;
  }
  psVar11 = (short *)((long)psVar2 + 1);
  uVar6 = (long)psVar3 - (long)psVar11;
  *param_1 = (long)psVar11;
  if (psVar3 == psVar11) {
code_r0x00c17b44:
    local_18 = FUN_00c10bfc();
    if (local_18 == 0) {
      return (undefined8 *)0x0;
    }
    local_40 = (byte *)*param_1;
    pbVar4 = (byte *)param_1[1];
    pbVar12 = local_40;
    if ((local_40 != pbVar4) && (*local_40 == 0x6e)) {
      pbVar12 = local_40 + 1;
      *param_1 = (long)pbVar12;
    }
    if (pbVar4 == pbVar12) {
      return (undefined8 *)0x0;
    }
    if (*pbVar12 - 0x3a < 0xfffffff6) {
      return (undefined8 *)0x0;
    }
    do {
      if (*pbVar12 - 0x3a < 0xfffffff6) {
        pbVar13 = pbVar12;
        goto LAB_00c17be8;
      }
      pbVar12 = pbVar12 + 1;
      *param_1 = (long)pbVar12;
    } while (pbVar12 != pbVar4);
    pbVar13 = pbVar4;
LAB_00c17be8:
    lStack_38 = (long)pbVar13 - (long)local_40;
    if (lStack_38 == 0) {
      return (undefined8 *)0x0;
    }
    if (pbVar12 == pbVar4) {
      return (undefined8 *)0x0;
    }
    if (*pbVar12 == 0x45) {
      *param_1 = (long)(pbVar12 + 1);
      puVar5 = (undefined8 *)FUN_00c1d14c(param_1,&local_18,&local_40);
      return puVar5;
    }
    return (undefined8 *)0x0;
  }
  switch(*(char *)psVar11) {
  case 'A':
    local_40 = (byte *)FUN_00c10bfc();
    if (local_40 == (byte *)0x0) {
      return (undefined8 *)0x0;
    }
    pcVar7 = (char *)*param_1;
    if (pcVar7 == (char *)param_1[1]) {
      return (undefined8 *)0x0;
    }
    if (*pcVar7 == 'E') {
      *param_1 = (long)(pcVar7 + 1);
      puVar5 = (undefined8 *)FUN_00c1c7e0(param_1,&local_40);
      return puVar5;
    }
    return (undefined8 *)0x0;
  default:
    goto code_r0x00c17b44;
  case 'D':
    if (uVar6 < 2) {
      return (undefined8 *)0x0;
    }
    if (*psVar11 != 0x6e44) {
      return (undefined8 *)0x0;
    }
    psVar11 = (short *)((long)psVar2 + 3);
    *param_1 = (long)psVar11;
    if ((psVar11 != psVar3) && (*(char *)psVar11 == '0')) {
      psVar11 = psVar2 + 2;
      *param_1 = (long)psVar11;
    }
    if (psVar11 == psVar3) {
      return (undefined8 *)0x0;
    }
    if ((char)*psVar11 == 'E') {
      *param_1 = (long)((long)psVar11 + 1);
      puVar5 = (undefined8 *)FUN_00c1c880(param_1,"nullptr");
      return puVar5;
    }
    return (undefined8 *)0x0;
  case 'T':
    return (undefined8 *)0x0;
  case 'U':
    if (uVar6 < 2) {
      return (undefined8 *)0x0;
    }
    if ((char)psVar2[1] != 'l') {
      return (undefined8 *)0x0;
    }
    local_40 = (byte *)FUN_00c1c92c(param_1,0);
    if (local_40 == (byte *)0x0) {
      return (undefined8 *)0x0;
    }
    pcVar7 = (char *)*param_1;
    if (pcVar7 == (char *)param_1[1]) {
      return (undefined8 *)0x0;
    }
    if (*pcVar7 == 'E') {
      *param_1 = (long)(pcVar7 + 1);
      puVar5 = (undefined8 *)FUN_00c1d0ac(param_1,&local_40);
      return puVar5;
    }
    return (undefined8 *)0x0;
  case '_':
    if (uVar6 < 2) {
      return (undefined8 *)0x0;
    }
    if (*psVar11 != 0x5a5f) {
      return (undefined8 *)0x0;
    }
    *param_1 = (long)((long)psVar2 + 3);
    puVar5 = (undefined8 *)FUN_00c10038();
    if (puVar5 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    pcVar7 = (char *)*param_1;
    if (pcVar7 == (char *)param_1[1]) {
      return (undefined8 *)0x0;
    }
    if (*pcVar7 == 'E') {
      *param_1 = (long)(pcVar7 + 1);
      return puVar5;
    }
    return (undefined8 *)0x0;
  case 'a':
    pcVar7 = "signed char";
    uVar8 = 0xb;
    break;
  case 'b':
    if ((uVar6 < 3) || (*psVar11 != 0x3062 || *(char *)((long)psVar2 + 3) != 'E')) {
      uVar6 = FUN_00c0ffd8(param_1,&DAT_002bacc6,3);
      if ((uVar6 & 1) == 0) {
        return (undefined8 *)0x0;
      }
      local_40 = (byte *)CONCAT44(local_40._4_4_,1);
    }
    else {
      local_40 = (byte *)((ulong)local_40._4_4_ << 0x20);
      *param_1 = (long)(psVar2 + 2);
    }
    puVar5 = (undefined8 *)FUN_00c1c738(param_1,&local_40);
    return puVar5;
  case 'c':
    pcVar7 = "char";
    uVar8 = 4;
    break;
  case 'd':
    *param_1 = (long)(psVar2 + 1);
    if ((ulong)((long)psVar3 - (long)(psVar2 + 1)) < 0x11) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 1) - 0x30) && (5 < *(byte *)(psVar2 + 1) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 3) - 0x30) && (5 < *(byte *)((long)psVar2 + 3) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 2) - 0x30) && (5 < *(byte *)(psVar2 + 2) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 5) - 0x30) && (5 < *(byte *)((long)psVar2 + 5) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 3) - 0x30) && (5 < *(byte *)(psVar2 + 3) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 7) - 0x30) && (5 < *(byte *)((long)psVar2 + 7) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 4) - 0x30) && (5 < *(byte *)(psVar2 + 4) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 9) - 0x30) && (5 < *(byte *)((long)psVar2 + 9) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 5) - 0x30) && (5 < *(byte *)(psVar2 + 5) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 0xb) - 0x30) && (5 < *(byte *)((long)psVar2 + 0xb) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 6) - 0x30) && (5 < *(byte *)(psVar2 + 6) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 0xd) - 0x30) && (5 < *(byte *)((long)psVar2 + 0xd) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 7) - 0x30) && (5 < *(byte *)(psVar2 + 7) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 0xf) - 0x30) && (5 < *(byte *)((long)psVar2 + 0xf) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 8) - 0x30) && (5 < *(byte *)(psVar2 + 8) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 0x11) - 0x30) && (5 < *(byte *)((long)psVar2 + 0x11) - 0x61))
    {
      return (undefined8 *)0x0;
    }
    psVar11 = psVar2 + 9;
    *param_1 = (long)psVar11;
    if (psVar11 == psVar3) {
      return (undefined8 *)0x0;
    }
    if ((char)*psVar11 != 'E') {
      return (undefined8 *)0x0;
    }
    pvVar14 = (void *)param_1[0x266];
    *param_1 = (long)((long)psVar2 + 0x13);
    lVar9 = *(long *)((long)pvVar14 + 8);
    puVar5 = pvVar14;
    if (lVar9 - 0xfd0U < 0xfffffffffffff00f || lVar9 == -0x21) {
      puVar5 = malloc(0x1000);
      if (puVar5 == (void *)0x0) {
LAB_00c18410:
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      lVar9 = 0;
      *puVar5 = pvVar14;
      puVar5[1] = 0;
      param_1[0x266] = (long)puVar5;
    }
    *(long *)((long)puVar5 + 8) = lVar9 + 0x20;
    puVar10 = (undefined8 *)((long)puVar5 + lVar9 + 0x10);
    *puVar10 = &PTR_LAB_00cb2120;
    *(undefined1 *)((long)puVar5 + lVar9 + 0x18) = 0x4f;
    *(ushort *)((long)puVar5 + lVar9 + 0x19) =
         *(ushort *)((long)puVar5 + lVar9 + 0x19) & 0xf000 | 0x540;
    uVar8 = 0x10;
    goto LAB_00c18114;
  case 'e':
    psVar11 = psVar2 + 1;
    *param_1 = (long)psVar11;
    if ((ulong)((long)psVar3 - (long)psVar11) < 0x21) {
      return (undefined8 *)0x0;
    }
    lVar9 = 0;
    psVar1 = psVar2 + 0x11;
    do {
      if (9 < *(byte *)((long)psVar11 + lVar9) - 0x30 && 5 < *(byte *)((long)psVar11 + lVar9) - 0x61
         ) {
        return (undefined8 *)0x0;
      }
      lVar9 = lVar9 + 1;
    } while (lVar9 != 0x20);
    *param_1 = (long)psVar1;
    if (psVar1 == psVar3) {
      return (undefined8 *)0x0;
    }
    if ((char)*psVar1 != 'E') {
      return (undefined8 *)0x0;
    }
    pvVar14 = (void *)param_1[0x266];
    *param_1 = (long)((long)psVar2 + 0x23);
    lVar9 = *(long *)((long)pvVar14 + 8);
    puVar5 = pvVar14;
    if (lVar9 - 0xfd0U < 0xfffffffffffff00f || lVar9 == -0x21) {
      puVar5 = malloc(0x1000);
      if (puVar5 == (void *)0x0) goto LAB_00c18410;
      lVar9 = 0;
      *puVar5 = pvVar14;
      puVar5[1] = 0;
      param_1[0x266] = (long)puVar5;
    }
    *(long *)((long)puVar5 + 8) = lVar9 + 0x20;
    puVar10 = (undefined8 *)((long)puVar5 + lVar9 + 0x10);
    *puVar10 = &PTR_LAB_00cb2198;
    *(undefined1 *)((long)puVar5 + lVar9 + 0x18) = 0x50;
    *(ushort *)((long)puVar5 + lVar9 + 0x19) =
         *(ushort *)((long)puVar5 + lVar9 + 0x19) & 0xf000 | 0x540;
    uVar8 = 0x20;
    goto LAB_00c18114;
  case 'f':
    *param_1 = (long)(psVar2 + 1);
    if ((ulong)((long)psVar3 - (long)(psVar2 + 1)) < 9) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 1) - 0x30) && (5 < *(byte *)(psVar2 + 1) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 3) - 0x30) && (5 < *(byte *)((long)psVar2 + 3) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 2) - 0x30) && (5 < *(byte *)(psVar2 + 2) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 5) - 0x30) && (5 < *(byte *)((long)psVar2 + 5) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 3) - 0x30) && (5 < *(byte *)(psVar2 + 3) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 7) - 0x30) && (5 < *(byte *)((long)psVar2 + 7) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)(psVar2 + 4) - 0x30) && (5 < *(byte *)(psVar2 + 4) - 0x61)) {
      return (undefined8 *)0x0;
    }
    if ((9 < *(byte *)((long)psVar2 + 9) - 0x30) && (5 < *(byte *)((long)psVar2 + 9) - 0x61)) {
      return (undefined8 *)0x0;
    }
    psVar11 = psVar2 + 5;
    *param_1 = (long)psVar11;
    if (psVar11 == psVar3) {
      return (undefined8 *)0x0;
    }
    if ((char)*psVar11 != 'E') {
      return (undefined8 *)0x0;
    }
    pvVar14 = (void *)param_1[0x266];
    *param_1 = (long)((long)psVar2 + 0xb);
    lVar9 = *(long *)((long)pvVar14 + 8);
    puVar5 = pvVar14;
    if (lVar9 - 0xfd0U < 0xfffffffffffff00f || lVar9 == -0x21) {
      puVar5 = malloc(0x1000);
      if (puVar5 == (void *)0x0) goto LAB_00c18410;
      lVar9 = 0;
      *puVar5 = pvVar14;
      puVar5[1] = 0;
      param_1[0x266] = (long)puVar5;
    }
    *(long *)((long)puVar5 + 8) = lVar9 + 0x20;
    puVar10 = (undefined8 *)((long)puVar5 + lVar9 + 0x10);
    *puVar10 = &PTR_LAB_00cb20a8;
    *(undefined1 *)((long)puVar5 + lVar9 + 0x18) = 0x4e;
    *(ushort *)((long)puVar5 + lVar9 + 0x19) =
         *(ushort *)((long)puVar5 + lVar9 + 0x19) & 0xf000 | 0x540;
    uVar8 = 8;
LAB_00c18114:
    puVar10[2] = psVar2 + 1;
    puVar10[3] = uVar8;
    return puVar10;
  case 'h':
    pcVar7 = "unsigned char";
    uVar8 = 0xd;
    break;
  case 'i':
    pcVar7 = "";
    uVar8 = 0;
    break;
  case 'j':
    pcVar7 = "u";
    goto LAB_00c18024;
  case 'l':
    pcVar7 = "l";
LAB_00c18024:
    uVar8 = 1;
    break;
  case 'm':
    pcVar7 = "ul";
    uVar8 = 2;
    break;
  case 'n':
    pcVar7 = "__int128";
    uVar8 = 8;
    break;
  case 'o':
    pcVar7 = "unsigned __int128";
    uVar8 = 0x11;
    break;
  case 's':
    pcVar7 = "short";
    uVar8 = 5;
    break;
  case 't':
    pcVar7 = "unsigned short";
    uVar8 = 0xe;
    break;
  case 'w':
    pcVar7 = "wchar_t";
    uVar8 = 7;
    break;
  case 'x':
    pcVar7 = "ll";
    uVar8 = 2;
    break;
  case 'y':
    pcVar7 = "ull";
    uVar8 = 3;
  }
  *param_1 = (long)(psVar2 + 1);
  puVar5 = (undefined8 *)FUN_00c1c644(param_1,pcVar7,uVar8);
  return puVar5;
}

