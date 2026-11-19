; ENGINE_set_default_digests @ 00a535c0
00a535c0	str x19,[sp, #-0x20]!
00a535c4	stp x29,x30,[sp, #0x10]
00a535c8	ldr x8,[x0, #0x40]
00a535cc	add x29,sp,#0x10
00a535d0	cbz x8,0x00a53618
00a535d4	add x2,sp,#0x8
00a535d8	mov x1,xzr
00a535dc	mov w3,wzr
00a535e0	mov x19,x0
00a535e4	blr x8
00a535e8	cmp w0,#0x0
00a535ec	b.le 0x00a53618
00a535f0	ldr x3,[sp, #0x8]
00a535f4	mov w4,w0
00a535f8	adrp x0,0xd21000
00a535fc	adrp x1,0xa53000
00a53600	add x0,x0,#0x9e8
00a53604	add x1,x1,#0x528
00a53608	mov w5,#0x1
00a5360c	mov x2,x19
00a53610	bl 0x00c3bce0
00a53614	b 0x00a5361c
00a53618	mov w0,#0x1
00a5361c	ldp x29,x30,[sp, #0x10]
00a53620	ldr x19,[sp], #0x20
00a53624	ret
