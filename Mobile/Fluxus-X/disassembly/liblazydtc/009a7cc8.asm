; pitem_new @ 009a7cc8
009a7cc8	stp x20,x19,[sp, #-0x20]!
009a7ccc	mov x19,x1
009a7cd0	adrp x1,0x2b1000
009a7cd4	mov x20,x0
009a7cd8	add x1,x1,#0xbdc
009a7cdc	orr w0,wzr,#0x18
009a7ce0	mov w2,#0x14
009a7ce4	stp x29,x30,[sp, #0x10]
009a7ce8	add x29,sp,#0x10
009a7cec	bl 0x00c32320
009a7cf0	cbz x0,0x009a7d04
009a7cf4	ldr x8,[x20]
009a7cf8	str xzr,[x0, #0x10]
009a7cfc	stp x8,x19,[x0]
009a7d00	b 0x009a7d38
009a7d04	bl 0x00c342a0
009a7d08	adrp x0,0x2b1000
009a7d0c	adrp x2,0x2d3000
009a7d10	add x0,x0,#0xbdc
009a7d14	add x2,x2,#0x443
009a7d18	mov w1,#0x17
009a7d1c	bl 0x00c342b0
009a7d20	mov w1,#0x100
009a7d24	mov w0,#0x14
009a7d28	movk w1,#0xc, LSL #16
009a7d2c	mov x2,xzr
009a7d30	bl 0x00c342c0
009a7d34	mov x0,xzr
009a7d38	ldp x29,x30,[sp, #0x10]
009a7d3c	ldp x20,x19,[sp], #0x20
009a7d40	ret
