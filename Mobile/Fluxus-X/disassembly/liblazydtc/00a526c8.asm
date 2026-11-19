; ENGINE_register_pkey_asn1_meths @ 00a526c8
00a526c8	str x19,[sp, #-0x20]!
00a526cc	stp x29,x30,[sp, #0x10]
00a526d0	ldr x8,[x0, #0x50]
00a526d4	add x29,sp,#0x10
00a526d8	cbz x8,0x00a52720
00a526dc	add x2,sp,#0x8
00a526e0	mov x1,xzr
00a526e4	mov w3,wzr
00a526e8	mov x19,x0
00a526ec	blr x8
00a526f0	cmp w0,#0x0
00a526f4	b.le 0x00a52720
00a526f8	ldr x3,[sp, #0x8]
00a526fc	mov w4,w0
00a52700	adrp x0,0xd21000
00a52704	adrp x1,0xa52000
00a52708	add x0,x0,#0x9c8
00a5270c	add x1,x1,#0x730
00a52710	mov x2,x19
00a52714	mov w5,wzr
00a52718	bl 0x00c3bce0
00a5271c	b 0x00a52724
00a52720	mov w0,#0x1
00a52724	ldp x29,x30,[sp, #0x10]
00a52728	ldr x19,[sp], #0x20
00a5272c	ret
