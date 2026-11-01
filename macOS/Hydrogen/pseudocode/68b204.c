
void FUN_0068b204(void)

{
  undefined8 *unaff_x19;
  
  if (*(char *)((long)unaff_x19 + 0x47) < '\0') {
    __ZdlPv(unaff_x19[6]);
  }
  *unaff_x19 = &UNK_00a0c238;
  unaff_x19[1] = &UNK_00a0c3e0;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
  return;
}

