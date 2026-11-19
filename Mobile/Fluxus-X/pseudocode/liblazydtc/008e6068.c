/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e6068
 */

/* cpr::AcceptEncoding::disabled() const */

void cpr::AcceptEncoding::disabled(void)

{
  long lVar1;
  long in_x0;
  logic_error *plVar2;
  long lVar3;
  undefined8 uVar4;
  basic_string_conflict *in_x2;
  long *plVar5;
  char acStack_68 [24];
  basic_string_conflict abStack_50 [24];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  plVar5 = DAT_00d1ff00;
joined_r0x008e6098:
  do {
    if (plVar5 == (long *)0x0) {
LAB_008e60c4:
      plVar2 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008e60d0 to 008e60db has its CatchHandler @ 008e6204 */
      std::logic_error::logic_error(plVar2,"map::at:  key not found");
      *(undefined ***)plVar2 = &PTR__domain_error_00cb0670;
                    /* WARNING: Subroutine does not return */
      __cxa_throw(plVar2,&std::out_of_range::typeinfo,std::domain_error::~domain_error);
    }
    if (4 < *(int *)(plVar5 + 4)) {
      plVar5 = (long *)*plVar5;
      goto joined_r0x008e6098;
    }
    if (*(int *)(plVar5 + 4) == 4) {
      if (plVar5 != (long *)0x0) {
        lVar3 = FUN_00871a60();
        uVar4 = 0;
        if (lVar3 != 0) {
          if (*(long *)(in_x0 + 0x18) != 1) {
            plVar2 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008e615c to 008e6167 has its CatchHandler @ 008e61cc */
            getString();
                    /* try { // try from 008e6168 to 008e617b has its CatchHandler @ 008e61b8 */
            std::__ndk1::operator+
                      ((__ndk1 *)
                       "AcceptEncoding does not accept any other values if \'disabled\' is present. You set the following encodings: "
                       ,acStack_68,in_x2);
                    /* try { // try from 008e6180 to 008e61b7 has its CatchHandler @ 008e61d0 */
            std::logic_error::logic_error(plVar2,abStack_50);
            *(undefined ***)plVar2 = &PTR__domain_error_00cb05f0;
                    /* WARNING: Subroutine does not return */
            __cxa_throw(plVar2,&std::invalid_argument::typeinfo,std::domain_error::~domain_error);
          }
          uVar4 = 1;
        }
        if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail(uVar4);
        }
        return;
      }
      goto LAB_008e60c4;
    }
    plVar5 = (long *)plVar5[1];
  } while( true );
}

