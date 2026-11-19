; FUN_00a9d5b4 @ 00a9d5b4
00a9d5b4	str x25,[sp, #-0x50]!
00a9d5b8	mov x25,x1
00a9d5bc	adrp x1,0x29e000
00a9d5c0	stp x24,x23,[sp, #0x10]
00a9d5c4	stp x20,x19,[sp, #0x30]
00a9d5c8	mov w24,w2
00a9d5cc	mov x20,x0
00a9d5d0	add x1,x1,#0x440
00a9d5d4	orr w0,wzr,#0x38
00a9d5d8	mov w2,#0x37
00a9d5dc	stp x22,x21,[sp, #0x20]
00a9d5e0	stp x29,x30,[sp, #0x40]
00a9d5e4	add x29,sp,#0x40
00a9d5e8	mov w21,w5
00a9d5ec	mov w23,w4
00a9d5f0	mov x22,x3
00a9d5f4	bl 0x00c34250
00a9d5f8	mov x19,x0
00a9d5fc	cbz x0,0x00a9d668
00a9d600	sxtw x8,w24
00a9d604	mov x0,x22
00a9d608	str x25,[x19]
00a9d60c	str w23,[x19, #0x8]
00a9d610	str x8,[x19, #0x10]
00a9d614	bl 0x00c3e8a0
00a9d618	cmp w21,#0x0
00a9d61c	mov w8,#0x8
00a9d620	str x0,[x19, #0x18]
00a9d624	str w21,[x19, #0xc]
00a9d628	csel x8,xzr,x8,eq
00a9d62c	ldr x9,[x20, x8#0x0]
00a9d630	mov x1,x19
00a9d634	add x9,x9,x0
00a9d638	str x9,[x20, x8#0x0]
00a9d63c	ldr x0,[x20, #0x10]
00a9d640	bl 0x00c347a0
00a9d644	cmp w0,#0x0
00a9d648	b.gt 0x00a9d698
00a9d64c	adrp x1,0x29e000
00a9d650	add x1,x1,#0x440
00a9d654	mov w2,#0x46
00a9d658	mov x0,x19
00a9d65c	bl 0x00c32310
00a9d660	mov x19,xzr
00a9d664	b 0x00a9d698
00a9d668	bl 0x00c342a0
00a9d66c	adrp x0,0x29e000
00a9d670	adrp x2,0x2c3000
00a9d674	add x0,x0,#0x440
00a9d678	add x2,x2,#0xce6
00a9d67c	mov w1,#0x3a
00a9d680	bl 0x00c342b0
00a9d684	mov w1,#0x100
00a9d688	orr w0,wzr,#0xf
00a9d68c	movk w1,#0xc, LSL #16
00a9d690	mov x2,xzr
00a9d694	bl 0x00c342c0
00a9d698	mov x0,x19
00a9d69c	ldp x29,x30,[sp, #0x40]
00a9d6a0	ldp x20,x19,[sp, #0x30]
00a9d6a4	ldp x22,x21,[sp, #0x20]
00a9d6a8	ldp x24,x23,[sp, #0x10]
00a9d6ac	ldr x25,[sp], #0x50
00a9d6b0	ret
