; X509_CRL_sort @ 00b1499c
00b1499c	stp x20,x19,[sp, #-0x20]!
00b149a0	stp x29,x30,[sp, #0x10]
00b149a4	mov x19,x0
00b149a8	ldr x0,[x0, #0x30]
00b149ac	add x29,sp,#0x10
00b149b0	bl 0x00c35350
00b149b4	ldr x0,[x19, #0x30]
00b149b8	bl 0x00c325e0
00b149bc	cmp w0,#0x1
00b149c0	b.lt 0x00b149ec
00b149c4	mov w20,wzr
00b149c8	ldr x0,[x19, #0x30]
00b149cc	mov w1,w20
00b149d0	bl 0x00c32610
00b149d4	str w20,[x0, #0x34]
00b149d8	ldr x0,[x19, #0x30]
00b149dc	add w20,w20,#0x1
00b149e0	bl 0x00c325e0
00b149e4	cmp w20,w0
00b149e8	b.lt 0x00b149c8
00b149ec	mov w8,#0x1
00b149f0	str w8,[x19, #0x50]
00b149f4	ldp x29,x30,[sp, #0x10]
00b149f8	mov w0,#0x1
00b149fc	ldp x20,x19,[sp], #0x20
00b14a00	ret
