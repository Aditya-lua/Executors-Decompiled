; ENGINE_register_all_pkey_asn1_meths @ 00a5273c
00a5273c	str x21,[sp, #-0x30]!
00a52740	stp x20,x19,[sp, #0x10]
00a52744	stp x29,x30,[sp, #0x20]
00a52748	add x29,sp,#0x20
00a5274c	bl 0x00c32380
00a52750	cbz x0,0x00a527b8
00a52754	adrp x20,0xd21000
00a52758	adrp x21,0xa52000
00a5275c	mov x19,x0
00a52760	add x20,x20,#0x9c8
00a52764	add x21,x21,#0x730
00a52768	ldr x8,[x19, #0x50]
00a5276c	cbz x8,0x00a527a8
00a52770	add x2,sp,#0x8
00a52774	mov x0,x19
00a52778	mov x1,xzr
00a5277c	mov w3,wzr
00a52780	blr x8
00a52784	cmp w0,#0x0
00a52788	b.le 0x00a527a8
00a5278c	ldr x3,[sp, #0x8]
00a52790	mov w4,w0
00a52794	mov x0,x20
00a52798	mov x1,x21
00a5279c	mov x2,x19
00a527a0	mov w5,wzr
00a527a4	bl 0x00c3bce0
00a527a8	mov x0,x19
00a527ac	bl 0x00c323a0
00a527b0	mov x19,x0
00a527b4	cbnz x0,0x00a52768
00a527b8	ldp x29,x30,[sp, #0x20]
00a527bc	ldp x20,x19,[sp, #0x10]
00a527c0	ldr x21,[sp], #0x30
00a527c4	ret
