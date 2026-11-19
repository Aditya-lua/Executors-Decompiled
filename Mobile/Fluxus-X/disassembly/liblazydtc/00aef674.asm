; ERR_add_error_mem_bio @ 00aef674
00aef674	cbz x1,0x00aef70c
00aef678	sub sp,sp,#0x30
00aef67c	stp x20,x19,[sp, #0x10]
00aef680	mov x20,x1
00aef684	mov x19,x0
00aef688	orr w1,wzr,#0x3
00aef68c	add x3,sp,#0x8
00aef690	mov x0,x20
00aef694	mov x2,xzr
00aef698	stp x29,x30,[sp, #0x20]
00aef69c	add x29,sp,#0x20
00aef6a0	bl 0x00c321a0
00aef6a4	cmp x0,#0x1
00aef6a8	b.lt 0x00aef700
00aef6ac	ldr x8,[sp, #0x8]
00aef6b0	add x8,x8,x0
00aef6b4	ldurb w8,[x8, #-0x1]
00aef6b8	cbz w8,0x00aef6ec
00aef6bc	adrp x1,0x2ab000
00aef6c0	add x1,x1,#0x32c
00aef6c4	mov w2,#0x1
00aef6c8	mov x0,x20
00aef6cc	bl 0x00c34240
00aef6d0	cmp w0,#0x1
00aef6d4	b.lt 0x00aef700
00aef6d8	orr w1,wzr,#0x3
00aef6dc	add x3,sp,#0x8
00aef6e0	mov x0,x20
00aef6e4	mov x2,xzr
00aef6e8	bl 0x00c321a0
00aef6ec	cmp x0,#0x2
00aef6f0	b.lt 0x00aef700
00aef6f4	ldr x1,[sp, #0x8]
00aef6f8	mov x0,x19
00aef6fc	bl 0x00aef3d0
00aef700	ldp x29,x30,[sp, #0x20]
00aef704	ldp x20,x19,[sp, #0x10]
00aef708	add sp,sp,#0x30
00aef70c	ret
