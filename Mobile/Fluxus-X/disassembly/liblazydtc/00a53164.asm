; ENGINE_register_ciphers @ 00a53164
00a53164	str x19,[sp, #-0x20]!
00a53168	stp x29,x30,[sp, #0x10]
00a5316c	ldr x8,[x0, #0x38]
00a53170	add x29,sp,#0x10
00a53174	cbz x8,0x00a531bc
00a53178	add x2,sp,#0x8
00a5317c	mov x1,xzr
00a53180	mov w3,wzr
00a53184	mov x19,x0
00a53188	blr x8
00a5318c	cmp w0,#0x0
00a53190	b.le 0x00a531bc
00a53194	ldr x3,[sp, #0x8]
00a53198	mov w4,w0
00a5319c	adrp x0,0xd21000
00a531a0	adrp x1,0xa53000
00a531a4	add x0,x0,#0x9d8
00a531a8	add x1,x1,#0x1cc
00a531ac	mov x2,x19
00a531b0	mov w5,wzr
00a531b4	bl 0x00c3bce0
00a531b8	b 0x00a531c0
00a531bc	mov w0,#0x1
00a531c0	ldp x29,x30,[sp, #0x10]
00a531c4	ldr x19,[sp], #0x20
00a531c8	ret
