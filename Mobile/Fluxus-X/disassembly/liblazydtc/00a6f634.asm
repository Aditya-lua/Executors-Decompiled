; EVP_PKEY_set_size_t_param @ 00a6f634
00a6f634	sub sp,sp,#0xa0
00a6f638	stp x29,x30,[sp, #0x90]
00a6f63c	add x29,sp,#0x90
00a6f640	str x19,[sp, #0x80]
00a6f644	stur x2,[x29, #-0x8]
00a6f648	cbz x1,0x00a6f6e8
00a6f64c	mov x9,x1
00a6f650	mov x19,x0
00a6f654	add x8,sp,#0x8
00a6f658	sub x1,x29,#0x8
00a6f65c	mov x0,x9
00a6f660	bl 0x00c36270
00a6f664	ldr x8,[sp, #0x28]
00a6f668	ldur q0,[sp, #0x18]
00a6f66c	ldur q1,[sp, #0x8]
00a6f670	str x8,[sp, #0x50]
00a6f674	add x8,sp,#0x8
00a6f678	stp q1,q0,[sp, #0x30]
00a6f67c	bl 0x00c34c40
00a6f680	ldr x8,[sp, #0x28]
00a6f684	ldur q0,[sp, #0x18]
00a6f688	ldur q1,[sp, #0x8]
00a6f68c	str x8,[sp, #0x78]
00a6f690	stur q0,[sp, #0x68]
00a6f694	stur q1,[sp, #0x58]
00a6f698	cbz x19,0x00a6f6bc
00a6f69c	ldr x0,[x19, #0x60]
00a6f6a0	cbz x0,0x00a6f6bc
00a6f6a4	ldp x1,x8,[x19, #0x68]
00a6f6a8	add x2,sp,#0x30
00a6f6ac	add x8,x8,#0x1
00a6f6b0	str x8,[x19, #0x70]
00a6f6b4	bl 0x00c3d440
00a6f6b8	b 0x00a6f6ec
00a6f6bc	bl 0x00c342a0
00a6f6c0	adrp x0,0x2c1000
00a6f6c4	adrp x2,0x2dc000
00a6f6c8	add x0,x0,#0xcf9
00a6f6cc	add x2,x2,#0x96
00a6f6d0	mov w1,#0x94c
00a6f6d4	bl 0x00c342b0
00a6f6d8	orr w0,wzr,#0x6
00a6f6dc	mov w1,#0xa3
00a6f6e0	mov x2,xzr
00a6f6e4	bl 0x00c342c0
00a6f6e8	mov w0,wzr
00a6f6ec	ldp x29,x30,[sp, #0x90]
00a6f6f0	ldr x19,[sp, #0x80]
00a6f6f4	add sp,sp,#0xa0
00a6f6f8	ret
