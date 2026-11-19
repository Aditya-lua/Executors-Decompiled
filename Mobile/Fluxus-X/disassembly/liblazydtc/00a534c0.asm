; ENGINE_register_digests @ 00a534c0
00a534c0	str x19,[sp, #-0x20]!
00a534c4	stp x29,x30,[sp, #0x10]
00a534c8	ldr x8,[x0, #0x40]
00a534cc	add x29,sp,#0x10
00a534d0	cbz x8,0x00a53518
00a534d4	add x2,sp,#0x8
00a534d8	mov x1,xzr
00a534dc	mov w3,wzr
00a534e0	mov x19,x0
00a534e4	blr x8
00a534e8	cmp w0,#0x0
00a534ec	b.le 0x00a53518
00a534f0	ldr x3,[sp, #0x8]
00a534f4	mov w4,w0
00a534f8	adrp x0,0xd21000
00a534fc	adrp x1,0xa53000
00a53500	add x0,x0,#0x9e8
00a53504	add x1,x1,#0x528
00a53508	mov x2,x19
00a5350c	mov w5,wzr
00a53510	bl 0x00c3bce0
00a53514	b 0x00a5351c
00a53518	mov w0,#0x1
00a5351c	ldp x29,x30,[sp, #0x10]
00a53520	ldr x19,[sp], #0x20
00a53524	ret
