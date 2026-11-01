
char * FUN_0028f2f4(ulong param_1)

{
  char *pcVar1;
  char *pcVar2;
  long in_x9;
  
  pcVar2 = *(char **)(in_x9 + (param_1 & 0xffffffff) * 8);
  pcVar1 = "unknown library";
  if (pcVar2 != (char *)0x0) {
    pcVar1 = pcVar2;
  }
  return pcVar1;
}

