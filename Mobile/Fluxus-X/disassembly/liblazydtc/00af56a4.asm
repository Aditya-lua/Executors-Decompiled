; X509V3_EXT_add @ 00af56a4
00af56a4	stp x20,x19,[sp, #-0x20]!
00af56a8	adrp x20,0xd22000
00af56ac	ldr x8,[x20, #0x7d8]
00af56b0	mov x19,x0
00af56b4	stp x29,x30,[sp, #0x10]
00af56b8	add x29,sp,#0x10
00af56bc	cbnz x8,0x00af56d8
00af56c0	adrp x0,0xaf5000
00af56c4	add x0,x0,#0x74c
00af56c8	bl 0x00c35340
00af56cc	mov x8,x0
00af56d0	str x0,[x20, #0x7d8]
00af56d4	cbz x0,0x00af570c
00af56d8	mov x0,x8
00af56dc	mov x1,x19
00af56e0	bl 0x00c347a0
00af56e4	cbz w0,0x00af56f0
00af56e8	mov w0,#0x1
00af56ec	b 0x00af5740
00af56f0	bl 0x00c342a0
00af56f4	adrp x0,0x2b8000
00af56f8	adrp x2,0x2ca000
00af56fc	add x0,x0,#0x6ec
00af5700	add x2,x2,#0x436
00af5704	mov w1,#0x21
00af5708	b 0x00af5724
00af570c	bl 0x00c342a0
00af5710	adrp x0,0x2b8000
00af5714	adrp x2,0x2ca000
00af5718	add x0,x0,#0x6ec
00af571c	add x2,x2,#0x436
00af5720	mov w1,#0x1d
00af5724	bl 0x00c342b0
00af5728	mov w1,#0x100
00af572c	mov w0,#0x22
00af5730	movk w1,#0xc, LSL #16
00af5734	mov x2,xzr
00af5738	bl 0x00c342c0
00af573c	mov w0,wzr
00af5740	ldp x29,x30,[sp, #0x10]
00af5744	ldp x20,x19,[sp], #0x20
00af5748	ret
