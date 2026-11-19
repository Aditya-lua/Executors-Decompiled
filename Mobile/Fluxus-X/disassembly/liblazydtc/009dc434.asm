; tls_construct_end_of_early_data @ 009dc434
009dc434	str x19,[sp, #-0x20]!
009dc438	stp x29,x30,[sp, #0x10]
009dc43c	ldr w8,[x0, #0x84]
009dc440	mov x19,x0
009dc444	add x29,sp,#0x10
009dc448	orr w8,w8,#0x4
009dc44c	cmp w8,#0x7
009dc450	b.ne 0x009dc460
009dc454	mov w0,#0x1
009dc458	str w8,[x19, #0x84]
009dc45c	b 0x009dc498
009dc460	bl 0x00c342a0
009dc464	adrp x0,0x2d7000
009dc468	adrp x2,0x2b9000
009dc46c	add x0,x0,#0xb1a
009dc470	add x2,x2,#0xabd
009dc474	mov w1,#0xec3
009dc478	bl 0x00c342b0
009dc47c	mov w2,#0x101
009dc480	mov w1,#0x50
009dc484	movk w2,#0xc, LSL #16
009dc488	mov x0,x19
009dc48c	mov x3,xzr
009dc490	bl 0x00c34410
009dc494	mov w0,wzr
009dc498	ldp x29,x30,[sp, #0x10]
009dc49c	ldr x19,[sp], #0x20
009dc4a0	ret
