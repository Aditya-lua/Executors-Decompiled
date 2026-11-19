; tls_process_key_update @ 009e3c6c
009e3c6c	stp x20,x19,[sp, #-0x20]!
009e3c70	mov x19,x0
009e3c74	add x0,x0,#0xc58
009e3c78	stp x29,x30,[sp, #0x10]
009e3c7c	add x29,sp,#0x10
009e3c80	mov x20,x1
009e3c84	bl 0x00c358f0
009e3c88	cbz w0,0x009e3cb4
009e3c8c	bl 0x00c342a0
009e3c90	adrp x0,0x2bb000
009e3c94	adrp x2,0x2a3000
009e3c98	add x0,x0,#0x912
009e3c9c	add x2,x2,#0xdcf
009e3ca0	mov w1,#0x296
009e3ca4	bl 0x00c342b0
009e3ca8	mov w1,#0xa
009e3cac	mov w2,#0xb6
009e3cb0	b 0x009e3cf4
009e3cb4	ldr x9,[x20, #0x8]
009e3cb8	cbz x9,0x009e3cd0
009e3cbc	ldr x10,[x20]
009e3cc0	subs x9,x9,#0x1
009e3cc4	ldrb w8,[x10], #0x1
009e3cc8	stp x10,x9,[x20]
009e3ccc	b.eq 0x009e3d10
009e3cd0	bl 0x00c342a0
009e3cd4	adrp x0,0x2bb000
009e3cd8	adrp x2,0x2a3000
009e3cdc	add x0,x0,#0x912
009e3ce0	add x2,x2,#0xdcf
009e3ce4	mov w1,#0x29c
009e3ce8	bl 0x00c342b0
009e3cec	mov w1,#0x32
009e3cf0	mov w2,#0x7a
009e3cf4	mov x0,x19
009e3cf8	mov x3,xzr
009e3cfc	bl 0x00c34410
009e3d00	mov w0,wzr
009e3d04	ldp x29,x30,[sp, #0x10]
009e3d08	ldp x20,x19,[sp], #0x20
009e3d0c	ret
009e3d10	cmp w8,#0x2
009e3d14	b.cc 0x009e3d3c
009e3d18	bl 0x00c342a0
009e3d1c	adrp x0,0x2bb000
009e3d20	adrp x2,0x2a3000
009e3d24	add x0,x0,#0x912
009e3d28	add x2,x2,#0xdcf
009e3d2c	mov w1,#0x2a6
009e3d30	bl 0x00c342b0
009e3d34	mov w1,#0x2f
009e3d38	b 0x009e3cf0
009e3d3c	cmp w8,#0x1
009e3d40	b.ne 0x009e3d48
009e3d44	str wzr,[x19, #0xba4]
009e3d48	mov x0,x19
009e3d4c	mov w1,wzr
009e3d50	bl 0x00c36860
009e3d54	cmp w0,#0x0
009e3d58	cset w0,ne
009e3d5c	b 0x009e3d04
