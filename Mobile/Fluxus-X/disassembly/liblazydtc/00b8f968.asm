; psa_crypto_driver_pake_get_password @ 00b8f968
00b8f968	stp x20,x19,[sp, #-0x20]!
00b8f96c	stp x29,x30,[sp, #0x10]
00b8f970	add x29,sp,#0x10
00b8f974	mov x8,x2
00b8f978	ldr x2,[x0, #0x8]
00b8f97c	mov x19,x3
00b8f980	mov x20,x0
00b8f984	cbz x2,0x00b8f998
00b8f988	cmp x2,x8
00b8f98c	b.ls 0x00b8f9a0
00b8f990	mov w0,#0xffffff76
00b8f994	b 0x00b8f9bc
00b8f998	mov w0,#0xffffff77
00b8f99c	b 0x00b8f9bc
00b8f9a0	ldr x8,[x20]
00b8f9a4	mov x0,x1
00b8f9a8	mov x1,x8
00b8f9ac	bl 0x00c2ffd0
00b8f9b0	ldr x8,[x20, #0x8]
00b8f9b4	mov w0,wzr
00b8f9b8	str x8,[x19]
00b8f9bc	ldp x29,x30,[sp, #0x10]
00b8f9c0	ldp x20,x19,[sp], #0x20
00b8f9c4	ret
