; ossl_ec_curve_name2nid @ 00a596a0
00a596a0	str x21,[sp, #-0x30]!
00a596a4	stp x20,x19,[sp, #0x10]
00a596a8	stp x29,x30,[sp, #0x20]
00a596ac	add x29,sp,#0x20
00a596b0	cbz x0,0x00a596fc
00a596b4	mov x19,x0
00a596b8	bl 0x00a5970c
00a596bc	cbnz w0,0x00a596fc
00a596c0	adrp x8,0xc5d000
00a596c4	add x8,x8,#0x70
00a596c8	mov x20,xzr
00a596cc	add x21,x8,#0x8
00a596d0	ldur x0,[x21, #-0x8]
00a596d4	mov x1,x19
00a596d8	bl 0x00c35ee0
00a596dc	cbz w0,0x00a596f8
00a596e0	add x20,x20,#0x1
00a596e4	cmp x20,#0x52
00a596e8	add x21,x21,#0x10
00a596ec	b.cc 0x00a596d0
00a596f0	mov w0,wzr
00a596f4	b 0x00a596fc
00a596f8	ldr w0,[x21]
00a596fc	ldp x29,x30,[sp, #0x20]
00a59700	ldp x20,x19,[sp, #0x10]
00a59704	ldr x21,[sp], #0x30
00a59708	ret
