
/* WARNING: Possible PIC construction at 0x006f0e74: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006f0e78) */

void FUN_006f1b0c(undefined8 param_1,char *param_2)

{
  undefined1 *puVar1;
  bool in_ZR;
  byte bVar2;
  char *pcVar3;
  long unaff_x19;
  undefined8 in_stack_00000000;
  char *in_stack_00000008;
  undefined1 *in_stack_00000010;
  undefined *in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  if (in_ZR) {
    return;
  }
  puVar1 = &uStack0000000000000020;
code_r0x006f0d7c:
  *(undefined8 *)(puVar1 + -0x20) = in_stack_00000000;
  *(char **)(puVar1 + -0x18) = in_stack_00000008;
  *(undefined1 **)(puVar1 + -0x10) = in_stack_00000010;
  *(undefined **)(puVar1 + -8) = in_stack_00000018;
  in_stack_00000010 = puVar1 + -0x10;
  bVar2 = param_2[1];
  in_stack_00000008 = param_2;
  while( true ) {
    bVar2 = bVar2 & 0xfc;
    in_stack_00000008[1] = bVar2;
    if (*in_stack_00000008 != '\b') break;
    in_stack_00000008[1] = bVar2 | 4;
    in_stack_00000008 = (char *)((long)(in_stack_00000008 + 8) - *(long *)(in_stack_00000008 + 8));
    if (in_stack_00000008 == (char *)0x0) {
      return;
    }
    bVar2 = in_stack_00000008[1];
    if ((bVar2 & 3) == 0) {
      return;
    }
  }
  switch(*in_stack_00000008) {
  case '\x06':
    *(undefined8 *)(in_stack_00000008 + 0x28) = *(undefined8 *)(unaff_x19 + 0x28);
    *(char **)(unaff_x19 + 0x28) = in_stack_00000008;
    return;
  case '\a':
    *(undefined8 *)(in_stack_00000008 + 8) = *(undefined8 *)(unaff_x19 + 0x28);
    *(char **)(unaff_x19 + 0x28) = in_stack_00000008;
    return;
  default:
    goto code_r0x006f0dc4;
  case '\t':
    *(undefined8 *)(in_stack_00000008 + 0x68) = *(undefined8 *)(unaff_x19 + 0x28);
    *(char **)(unaff_x19 + 0x28) = in_stack_00000008;
    return;
  case '\n':
    goto code_r0x006f0e8c;
  case '\v':
    *(undefined8 *)(in_stack_00000008 + 0x80) = *(undefined8 *)(unaff_x19 + 0x28);
    *(char **)(unaff_x19 + 0x28) = in_stack_00000008;
    return;
  case '\f':
    break;
  }
  pcVar3 = *(char **)(in_stack_00000008 + 8);
  if ((*(int *)(pcVar3 + 0xc) < 5) || (param_2 = *(char **)pcVar3, (param_2[1] & 3U) == 0)) {
    if (pcVar3 != in_stack_00000008 + 0x10) {
code_r0x006f0dc4:
      return;
    }
    bVar2 = in_stack_00000008[1];
code_r0x006f0e8c:
    in_stack_00000008[1] = bVar2 | 4;
    return;
  }
  in_stack_00000018 = &UNK_006f0e78;
  puVar1 = puVar1 + -0x20;
  goto code_r0x006f0d7c;
}

