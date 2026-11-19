; FUN_008e4884 @ 008e4884
008e4884	sub sp,sp,#0x90
008e4888	stp x30,x23,[sp, #0x60]
008e488c	stp x22,x21,[sp, #0x70]
008e4890	stp x20,x19,[sp, #0x80]
008e4894	mov x20,x0
008e4898	mov x19,x1
008e489c	add x0,sp,#0x40
008e48a0	mov x1,x20
008e48a4	add x21,sp,#0x40
008e48a8	bl 0x008e3a68
008e48ac	subs x8,x20,x19
008e48b0	cneg x8,x8,mi
008e48b4	lsr x8,x8,#0x20
008e48b8	cbnz x8,0x008e490c
008e48bc	adrp x22,0xc4e000
008e48c0	mov x23,#0x1
008e48c4	mov w21,#0x11
008e48c8	add x22,x22,#0x320
008e48cc	movk x23,#0x40, LSL #32
008e48d0	add x0,sp,#0x40
008e48d4	add x1,sp,#0x28
008e48d8	mov x2,x20
008e48dc	mov x3,x19
008e48e0	str w21,[sp, #0x30]
008e48e4	str x22,[sp, #0x28]
008e48e8	stur x23,[sp, #0x34]
008e48ec	bl 0x008e494c
008e48f0	add x0,sp,#0x40
008e48f4	add x1,sp,#0x10
008e48f8	str w21,[sp, #0x18]
008e48fc	str x22,[sp, #0x10]
008e4900	stur x23,[sp, #0x1c]
008e4904	bl 0x008e3c94
008e4908	b 0x008e491c
008e490c	add x0,sp,#0x8
008e4910	mov x1,x19
008e4914	str x21,[sp, #0x8]
008e4918	bl 0x008e47d8
008e491c	add x0,sp,#0x40
008e4920	bl 0x008e47b0
008e4924	bl 0x008e4ab8
008e4928	mov x19,x0
008e492c	add x0,sp,#0x40
008e4930	bl 0x008e3d18
008e4934	mov x0,x19
008e4938	ldp x20,x19,[sp, #0x80]
008e493c	ldp x22,x21,[sp, #0x70]
008e4940	ldp x30,x23,[sp, #0x60]
008e4944	add sp,sp,#0x90
008e4948	ret
