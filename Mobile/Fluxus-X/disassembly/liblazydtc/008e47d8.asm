; FUN_008e47d8 @ 008e47d8
008e47d8	sub sp,sp,#0x90
008e47dc	stp x30,x23,[sp, #0x60]
008e47e0	stp x22,x21,[sp, #0x70]
008e47e4	stp x20,x19,[sp, #0x80]
008e47e8	ldr x19,[x0]
008e47ec	add x0,sp,#0x38
008e47f0	mov x20,x1
008e47f4	bl 0x008e3f88
008e47f8	adrp x22,0xc4e000
008e47fc	mov x23,#0x1
008e4800	mov w21,#0x11
008e4804	add x22,x22,#0x320
008e4808	movk x23,#0x40, LSL #32
008e480c	add x1,sp,#0x20
008e4810	add x2,sp,#0x38
008e4814	mov x0,x19
008e4818	str w21,[sp, #0x28]
008e481c	str x22,[sp, #0x20]
008e4820	stur x23,[sp, #0x2c]
008e4824	bl 0x008e3bb4
008e4828	add x1,sp,#0x8
008e482c	mov x0,x19
008e4830	str w21,[sp, #0x10]
008e4834	str x22,[sp, #0x8]
008e4838	stur x23,[sp, #0x14]
008e483c	bl 0x008e3c94
008e4840	add x1,sp,#0x38
008e4844	mov x0,x19
008e4848	bl 0x008e4084
008e484c	mov x0,x19
008e4850	mov x1,x20
008e4854	bl 0x008e487c
008e4858	add x0,sp,#0x38
008e485c	bl 0x008e4204
008e4860	ldp x20,x19,[sp, #0x80]
008e4864	ldp x22,x21,[sp, #0x70]
008e4868	ldp x30,x23,[sp, #0x60]
008e486c	add sp,sp,#0x90
008e4870	ret
