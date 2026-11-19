; dtls1_write_bytes @ 009c9fcc
009c9fcc	str x19,[sp, #-0x20]!
009c9fd0	cmp x3,#0x4, LSL #12
009c9fd4	mov x19,x0
009c9fd8	stp x29,x30,[sp, #0x10]
009c9fdc	add x29,sp,#0x10
009c9fe0	b.hi 0x009ca004
009c9fe4	mov w8,#0x1
009c9fe8	str w8,[x19, #0x28]
009c9fec	ldp x29,x30,[sp, #0x10]
009c9ff0	mov x5,x4
009c9ff4	mov x0,x19
009c9ff8	mov w4,wzr
009c9ffc	ldr x19,[sp], #0x20
009ca000	b 0x009ca048
009ca004	bl 0x00c342a0
009ca008	adrp x0,0x2a3000
009ca00c	adrp x2,0x2d5000
009ca010	add x0,x0,#0xcf1
009ca014	add x2,x2,#0x947
009ca018	mov w1,#0x310
009ca01c	bl 0x00c342b0
009ca020	mov w2,#0x103
009ca024	mov w1,#0x50
009ca028	movk w2,#0xc, LSL #16
009ca02c	mov x0,x19
009ca030	mov x3,xzr
009ca034	bl 0x00c34410
009ca038	ldp x29,x30,[sp, #0x10]
009ca03c	mov w0,#0xffffffff
009ca040	ldr x19,[sp], #0x20
009ca044	ret
