; FUN_00b5c6e8 @ 00b5c6e8
00b5c6e8	sub sp,sp,#0x180
00b5c6ec	str x28,[sp, #0x140]
00b5c6f0	stp x22,x21,[sp, #0x150]
00b5c6f4	stp x20,x19,[sp, #0x160]
00b5c6f8	stp x29,x30,[sp, #0x170]
00b5c6fc	add x29,sp,#0x170
00b5c700	cbz x0,0x00b5c7b4
00b5c704	mov x20,x1
00b5c708	cbz x1,0x00b5c7b0
00b5c70c	adrp x1,0x29d000
00b5c710	mov x19,x0
00b5c714	add x1,x1,#0xe2e
00b5c718	mov x0,x20
00b5c71c	bl 0x00c36530
00b5c720	cbz x0,0x00b5c7b0
00b5c724	mov x21,x0
00b5c728	movi v0.2D,#0x0
00b5c72c	sub x8,x29,#0x68
00b5c730	add x0,sp,#0x8
00b5c734	mov w2,#0x100
00b5c738	mov w1,wzr
00b5c73c	sturh wzr,[x29, #-0x38]
00b5c740	stur q0,[x29, #-0x48]
00b5c744	stur q0,[x29, #-0x58]
00b5c748	stur q0,[x29, #-0x68]
00b5c74c	stur x8,[x29, #-0x28]
00b5c750	add x22,sp,#0x8
00b5c754	bl 0x00c301c0
00b5c758	adrp x1,0x2d3000
00b5c75c	add x1,x1,#0x7c2
00b5c760	mov x0,x20
00b5c764	str x22,[sp]
00b5c768	bl 0x00c36530
00b5c76c	mov x20,x0
00b5c770	sub x1,x29,#0x28
00b5c774	mov w2,#0x32
00b5c778	mov x0,x21
00b5c77c	bl 0x00c3b720
00b5c780	cbz w0,0x00b5c7b4
00b5c784	cbz x20,0x00b5c79c
00b5c788	mov x1,sp
00b5c78c	mov w2,#0x100
00b5c790	mov x0,x20
00b5c794	bl 0x00c3b720
00b5c798	cbz w0,0x00b5c7b4
00b5c79c	sub x1,x29,#0x68
00b5c7a0	add x2,sp,#0x8
00b5c7a4	mov x0,x19
00b5c7a8	bl 0x00b5c9e0
00b5c7ac	cbz w0,0x00b5c7b4
00b5c7b0	mov w0,#0x1
00b5c7b4	ldp x29,x30,[sp, #0x170]
00b5c7b8	ldp x20,x19,[sp, #0x160]
00b5c7bc	ldp x22,x21,[sp, #0x150]
00b5c7c0	ldr x28,[sp, #0x140]
00b5c7c4	add sp,sp,#0x180
00b5c7c8	ret
