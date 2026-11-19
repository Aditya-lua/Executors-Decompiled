; UI_add_info_string @ 00aee0c8
00aee0c8	str x21,[sp, #-0x30]!
00aee0cc	stp x20,x19,[sp, #0x10]
00aee0d0	stp x29,x30,[sp, #0x20]
00aee0d4	add x29,sp,#0x20
00aee0d8	cbz x1,0x00aee158
00aee0dc	mov x21,x1
00aee0e0	adrp x1,0x2a0000
00aee0e4	mov x20,x0
00aee0e8	add x1,x1,#0xc2f
00aee0ec	mov w0,#0x48
00aee0f0	mov w2,#0x6d
00aee0f4	bl 0x00c34250
00aee0f8	cbz x0,0x00aee188
00aee0fc	mov w8,#0x4
00aee100	str x21,[x0, #0x8]
00aee104	str wzr,[x0, #0x40]
00aee108	str wzr,[x0, #0x10]
00aee10c	str w8,[x0]
00aee110	str xzr,[x0, #0x18]
00aee114	ldr x8,[x20, #0x8]!
00aee118	mov x19,x0
00aee11c	cbnz x8,0x00aee12c
00aee120	bl 0x00c34780
00aee124	str x0,[x20]
00aee128	cbz x0,0x00aee1a0
00aee12c	stp xzr,xzr,[x19, #0x28]
00aee130	ldr x0,[x20]
00aee134	mov x1,x19
00aee138	bl 0x00c347a0
00aee13c	mov w20,w0
00aee140	cmp w0,#0x0
00aee144	b.gt 0x00aee18c
00aee148	mov x0,x19
00aee14c	sub w20,w20,#0x1
00aee150	bl 0x00aed930
00aee154	b 0x00aee18c
00aee158	bl 0x00c342a0
00aee15c	adrp x0,0x2a0000
00aee160	adrp x2,0x2bc000
00aee164	add x0,x0,#0xc2f
00aee168	add x2,x2,#0x531
00aee16c	mov w1,#0x69
00aee170	bl 0x00c342b0
00aee174	mov w1,#0x102
00aee178	mov w0,#0x28
00aee17c	movk w1,#0xc, LSL #16
00aee180	mov x2,xzr
00aee184	bl 0x00c342c0
00aee188	mov w20,#0xffffffff
00aee18c	mov w0,w20
00aee190	ldp x29,x30,[sp, #0x20]
00aee194	ldp x20,x19,[sp, #0x10]
00aee198	ldr x21,[sp], #0x30
00aee19c	ret
00aee1a0	mov x0,x19
00aee1a4	bl 0x00aed930
00aee1a8	b 0x00aee188
