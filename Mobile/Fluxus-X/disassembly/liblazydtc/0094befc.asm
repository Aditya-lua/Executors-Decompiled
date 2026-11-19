; FUN_0094befc @ 0094befc
0094befc	sub sp,sp,#0x60
0094bf00	str x21,[sp, #0x30]
0094bf04	stp x20,x19,[sp, #0x40]
0094bf08	stp x29,x30,[sp, #0x50]
0094bf0c	add x29,sp,#0x50
0094bf10	mrs x21,tpidr_el0
0094bf14	ldr x8,[x21, #0x28]
0094bf18	mov x19,x0
0094bf1c	str x8,[sp, #0x28]
0094bf20	mov w8,#0x131d
0094bf24	ldrb w8,[x0, x8]
0094bf28	tbz w8,#0x0,0x0094bfa4
0094bf2c	ldr x0,[x19, #0x1110]
0094bf30	cbz x0,0x0094bfa4
0094bf34	add x1,sp,#0x10
0094bf38	mov w2,#0xa
0094bf3c	add x3,sp,#0x20
0094bf40	bl 0x00941b6c
0094bf44	mov w20,w0
0094bf48	cmp w0,#0x1
0094bf4c	b.eq 0x0094bf9c
0094bf50	ldr x0,[sp, #0x10]
0094bf54	mov x9,#0x20000000200
0094bf58	mov w8,#0x1
0094bf5c	movk x9,#0x2001, LSL #32
0094bf60	b 0x0094bf6c
0094bf64	add x0,x0,#0x1
0094bf68	str x0,[sp, #0x10]
0094bf6c	ldrb w10,[x0]
0094bf70	cmp w10,#0x2d
0094bf74	b.hi 0x0094bf84
0094bf78	lsl x10,x8,x10
0094bf7c	tst x10,x9
0094bf80	b.ne 0x0094bf64
0094bf84	add x1,sp,#0x8
0094bf88	mov w2,#0xa
0094bf8c	add x3,sp,#0x18
0094bf90	bl 0x00941b6c
0094bf94	cmp w0,#0x1
0094bf98	b.ne 0x0094bfd4
0094bf9c	mov w0,#0x21
0094bfa0	b 0x0094bfb0
0094bfa4	mov w0,wzr
0094bfa8	mov x8,#-0x1
0094bfac	str x8,[x19, #0xe0]
0094bfb0	ldr x8,[x21, #0x28]
0094bfb4	ldr x9,[sp, #0x28]
0094bfb8	cmp x8,x9
0094bfbc	b.ne 0x0094c03c
0094bfc0	ldp x29,x30,[sp, #0x50]
0094bfc4	ldp x20,x19,[sp, #0x40]
0094bfc8	ldr x21,[sp, #0x30]
0094bfcc	add sp,sp,#0x60
0094bfd0	ret
0094bfd4	cbnz w20,0x0094bff0
0094bfd8	cmp w0,#0x2
0094bfdc	b.ne 0x0094bff0
0094bfe0	ldr x8,[sp, #0x20]
0094bfe4	mov w0,wzr
0094bfe8	str x8,[x19, #0x1118]
0094bfec	b 0x0094bfb0
0094bff0	cmp w20,#0x2
0094bff4	b.ne 0x0094c010
0094bff8	cbnz w0,0x0094c010
0094bffc	ldr x8,[sp, #0x18]
0094c000	str x8,[x19, #0xe0]
0094c004	neg x8,x8
0094c008	str x8,[x19, #0x1118]
0094c00c	b 0x0094bfb0
0094c010	ldp x9,x8,[sp, #0x18]
0094c014	subs x9,x9,x8
0094c018	b.lt 0x0094bf9c
0094c01c	orr x10,xzr,#0x7fffffffffffffff
0094c020	cmp x9,x10
0094c024	b.eq 0x0094bf9c
0094c028	add x9,x9,#0x1
0094c02c	mov w0,wzr
0094c030	str x9,[x19, #0xe0]
0094c034	str x8,[x19, #0x1118]
0094c038	b 0x0094bfb0
0094c03c	bl 0x00c2fec0
