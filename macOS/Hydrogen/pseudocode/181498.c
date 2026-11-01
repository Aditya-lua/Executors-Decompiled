
void FUN_00181498(long *param_1,long *param_2,long param_3)

{
  code *pcVar1;
  long lVar2;
  long unaff_x23;
  
  lVar2 = *param_1;
  *param_1 = lVar2 + 1;
  if (lVar2 < 0) {
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x18180c);
    (*pcVar1)();
  }
  param_2[2] = *(long *)(param_3 + 0x10);
  *param_2 = unaff_x23 + 0x21;
  param_2[1] = (long)param_1;
  return;
}

