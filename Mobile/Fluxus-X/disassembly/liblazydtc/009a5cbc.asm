; ix::SocketTLSOptions::isUsingDefaultCiphers @ 009a5cbc
009a5cbc	stp x22,x21,[sp, #-0x30]!
009a5cc0	stp x20,x19,[sp, #0x10]
009a5cc4	stp x29,x30,[sp, #0x20]
009a5cc8	add x29,sp,#0x20
009a5ccc	mov x19,x0
009a5cd0	ldrb w22,[x19, #0x48]!
009a5cd4	mov x20,x0
009a5cd8	tbnz w22,#0x0,0x009a5d4c
009a5cdc	lsr w8,w22,#0x1
009a5ce0	cbz x8,0x009a5d54
009a5ce4	adrp x8,0xcb5000
009a5ce8	ldr x8,[x8, #0x8]
009a5cec	ldr x21,[x8]
009a5cf0	mov x0,x21
009a5cf4	bl 0x00c2ff50
009a5cf8	ldr x8,[x20, #0x50]
009a5cfc	lsr w9,w22,#0x1
009a5d00	tst w22,#0x1
009a5d04	mov x2,x0
009a5d08	csel x8,x9,x8,eq
009a5d0c	cmp x0,x8
009a5d10	mov w0,wzr
009a5d14	b.ne 0x009a5d58
009a5d18	cbz x2,0x009a5d3c
009a5d1c	cmn x2,#0x1
009a5d20	b.eq 0x009a5d68
009a5d24	ldr x8,[x20, #0x58]
009a5d28	tst w22,#0x1
009a5d2c	mov x1,x21
009a5d30	csinc x0,x8,x19,ne
009a5d34	bl 0x00c300b0
009a5d38	cbnz w0,0x009a5d40
009a5d3c	mov w0,wzr
009a5d40	cmp w0,#0x0
009a5d44	cset w0,eq
009a5d48	b 0x009a5d58
009a5d4c	ldr x8,[x20, #0x50]
009a5d50	cbnz x8,0x009a5ce4
009a5d54	mov w0,#0x1
009a5d58	ldp x29,x30,[sp, #0x20]
009a5d5c	ldp x20,x19,[sp, #0x10]
009a5d60	ldp x22,x21,[sp], #0x30
009a5d64	ret
009a5d68	mov x0,x19
009a5d6c	bl 0x00c31420
009a5d70	bl 0x007fe114
