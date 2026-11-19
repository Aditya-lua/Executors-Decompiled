; FUN_00aa46f8 @ 00aa46f8
00aa46f8	stp x20,x19,[sp, #-0x20]!
00aa46fc	adrp x1,0x2aa000
00aa4700	mov x19,x0
00aa4704	add x1,x1,#0x4b5
00aa4708	mov w0,#0x50
00aa470c	mov w2,#0x136
00aa4710	stp x29,x30,[sp, #0x10]
00aa4714	add x29,sp,#0x10
00aa4718	bl 0x00c34250
00aa471c	mov x20,x0
00aa4720	cbz x0,0x00aa4770
00aa4724	adrp x0,0xaa4000
00aa4728	add x0,x0,#0x894
00aa472c	bl 0x00c35340
00aa4730	str x0,[x20, #0x8]
00aa4734	cbz x0,0x00aa4770
00aa4738	bl 0x00c34d50
00aa473c	str x0,[x20, #0x18]
00aa4740	cbz x0,0x00aa4770
00aa4744	bl 0x00c34780
00aa4748	str x0,[x20, #0x10]
00aa474c	cbz x0,0x00aa4770
00aa4750	bl 0x00c34d50
00aa4754	str x0,[x20, #0x20]
00aa4758	cbz x0,0x00aa4770
00aa475c	ldrb w8,[x20, #0x48]
00aa4760	str x19,[x20]
00aa4764	orr w8,w8,#0x1
00aa4768	strb w8,[x20, #0x48]
00aa476c	b 0x00aa477c
00aa4770	mov x0,x20
00aa4774	bl 0x00aa478c
00aa4778	mov x20,xzr
00aa477c	ldp x29,x30,[sp, #0x10]
00aa4780	mov x0,x20
00aa4784	ldp x20,x19,[sp], #0x20
00aa4788	ret
