; ix::SocketTLSOptions::isUsingSystemDefaults @ 009a5abc
009a5abc	stp x20,x19,[sp, #-0x20]!
009a5ac0	stp x29,x30,[sp, #0x10]
009a5ac4	add x29,sp,#0x10
009a5ac8	adrp x8,0xcb5000
009a5acc	ldr x8,[x8, #0x18]
009a5ad0	mov x20,x0
009a5ad4	ldr x19,[x8]
009a5ad8	mov x0,x19
009a5adc	bl 0x00c2ff50
009a5ae0	mov x2,x0
009a5ae4	mov x0,x20
009a5ae8	ldrb w9,[x0, #0x30]!
009a5aec	ldr x8,[x0, #0x8]
009a5af0	lsr w10,w9,#0x1
009a5af4	tst w9,#0x1
009a5af8	csel x8,x10,x8,eq
009a5afc	cmp x2,x8
009a5b00	mov w8,wzr
009a5b04	b.ne 0x009a5b38
009a5b08	cbz x2,0x009a5b2c
009a5b0c	cmn x2,#0x1
009a5b10	b.eq 0x009a5b48
009a5b14	ldr x8,[x20, #0x40]
009a5b18	tst w9,#0x1
009a5b1c	mov x1,x19
009a5b20	csinc x0,x8,x0,ne
009a5b24	bl 0x00c300b0
009a5b28	cbnz w0,0x009a5b30
009a5b2c	mov w0,wzr
009a5b30	cmp w0,#0x0
009a5b34	cset w8,eq
009a5b38	ldp x29,x30,[sp, #0x10]
009a5b3c	mov w0,w8
009a5b40	ldp x20,x19,[sp], #0x20
009a5b44	ret
009a5b48	bl 0x00c31420
009a5b4c	bl 0x007fe114
