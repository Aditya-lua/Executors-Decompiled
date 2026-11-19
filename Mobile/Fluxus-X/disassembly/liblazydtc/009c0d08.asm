; ssl_load_groups @ 009c0d08
009c0d08	sub sp,sp,#0x60
009c0d0c	stp x20,x19,[sp, #0x40]
009c0d10	stp x29,x30,[sp, #0x50]
009c0d14	mov x19,x0
009c0d18	ldr x0,[x0]
009c0d1c	adrp x1,0x9c0000
009c0d20	add x1,x1,#0xe20
009c0d24	mov x2,x19
009c0d28	str x21,[sp, #0x30]
009c0d2c	add x29,sp,#0x50
009c0d30	bl 0x00c36540
009c0d34	cbz w0,0x009c0e0c
009c0d38	ldr x9,[x19, #0x630]
009c0d3c	adrp x10,0x74c000
009c0d40	mov x21,xzr
009c0d44	mov x8,xzr
009c0d48	add x10,x10,#0xc10
009c0d4c	add x11,sp,#0xc
009c0d50	cbz x9,0x009c0d90
009c0d54	ldr x14,[x19, #0x628]
009c0d58	ldrh w12,[x10, x8, LSL #0x1]
009c0d5c	mov x13,xzr
009c0d60	add x14,x14,#0x1c
009c0d64	ldrh w15,[x14]
009c0d68	cmp w15,w12
009c0d6c	b.eq 0x009c0d84
009c0d70	add x13,x13,#0x1
009c0d74	cmp x13,x9
009c0d78	add x14,x14,#0x38
009c0d7c	b.cc 0x009c0d64
009c0d80	b 0x009c0d90
009c0d84	add x13,x21,#0x1
009c0d88	strh w12,[x11, x21, LSL #0x1]
009c0d8c	mov x21,x13
009c0d90	add x8,x8,#0x1
009c0d94	cmp x8,#0x11
009c0d98	b.ne 0x009c0d50
009c0d9c	cbz x21,0x009c0dd0
009c0da0	lsl x20,x21,#0x1
009c0da4	adrp x1,0x2c3000
009c0da8	add x1,x1,#0x5d8
009c0dac	mov w2,#0x19b
009c0db0	mov x0,x20
009c0db4	bl 0x00c32320
009c0db8	str x0,[x19, #0x288]
009c0dbc	cbz x0,0x009c0dd8
009c0dc0	add x1,sp,#0xc
009c0dc4	mov x2,x20
009c0dc8	bl 0x00c2ffd0
009c0dcc	str x21,[x19, #0x290]
009c0dd0	mov w0,#0x1
009c0dd4	b 0x009c0e0c
009c0dd8	bl 0x00c342a0
009c0ddc	adrp x0,0x2c3000
009c0de0	adrp x2,0x2c3000
009c0de4	add x0,x0,#0x5d8
009c0de8	add x2,x2,#0x5e5
009c0dec	mov w1,#0x19e
009c0df0	bl 0x00c342b0
009c0df4	mov w1,#0x100
009c0df8	mov w0,#0x14
009c0dfc	movk w1,#0xc, LSL #16
009c0e00	mov x2,xzr
009c0e04	bl 0x00c342c0
009c0e08	mov w0,wzr
009c0e0c	ldp x29,x30,[sp, #0x50]
009c0e10	ldp x20,x19,[sp, #0x40]
009c0e14	ldr x21,[sp, #0x30]
009c0e18	add sp,sp,#0x60
009c0e1c	ret
