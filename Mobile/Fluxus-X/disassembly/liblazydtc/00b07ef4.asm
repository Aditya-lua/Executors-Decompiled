; X509at_delete_attr @ 00b07ef4
00b07ef4	stp x20,x19,[sp, #-0x20]!
00b07ef8	stp x29,x30,[sp, #0x10]
00b07efc	add x29,sp,#0x10
00b07f00	cbz x0,0x00b07f34
00b07f04	mov w19,w1
00b07f08	mov x20,x0
00b07f0c	bl 0x00c325e0
00b07f10	tbnz w19,#0x1f,0x00b07f30
00b07f14	cmp w0,w19
00b07f18	mov x0,xzr
00b07f1c	b.le 0x00b07f34
00b07f20	mov x0,x20
00b07f24	mov w1,w19
00b07f28	bl 0x00c35320
00b07f2c	b 0x00b07f34
00b07f30	mov x0,xzr
00b07f34	ldp x29,x30,[sp, #0x10]
00b07f38	ldp x20,x19,[sp], #0x20
00b07f3c	ret
