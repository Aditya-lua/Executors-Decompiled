; EVP_PKEY_set_bn_param @ 00a6f6fc
00a6f6fc	str x28,[sp, #-0x40]!
00a6f700	stp x22,x21,[sp, #0x10]
00a6f704	stp x20,x19,[sp, #0x20]
00a6f708	stp x29,x30,[sp, #0x30]
00a6f70c	add x29,sp,#0x30
00a6f710	sub sp,sp,#0x880
00a6f714	mov x19,x0
00a6f718	mov w0,wzr
00a6f71c	cbz x19,0x00a6f818
00a6f720	mov x20,x1
00a6f724	cbz x1,0x00a6f818
00a6f728	mov x21,x2
00a6f72c	cbz x2,0x00a6f818
00a6f730	ldr x8,[x19, #0x20]
00a6f734	cbnz x8,0x00a6f740
00a6f738	ldr x8,[x19, #0x68]
00a6f73c	cbz x8,0x00a6f814
00a6f740	mov x0,x21
00a6f744	bl 0x00c322f0
00a6f748	add w8,w0,#0x7
00a6f74c	add w9,w0,#0xe
00a6f750	cmp w8,#0x0
00a6f754	csel w8,w9,w8,lt
00a6f758	cmp w0,#0x4, LSL #12
00a6f75c	mov w0,wzr
00a6f760	b.gt 0x00a6f818
00a6f764	asr w22,w8,#0x3
00a6f768	add x1,sp,#0x30
00a6f76c	mov x0,x21
00a6f770	mov w2,w22
00a6f774	bl 0x00c38c90
00a6f778	tbnz w0,#0x1f,0x00a6f814
00a6f77c	sxtw x2,w22
00a6f780	add x8,sp,#0x8
00a6f784	add x1,sp,#0x30
00a6f788	mov x0,x20
00a6f78c	sub x21,x29,#0x80
00a6f790	bl 0x00c3d990
00a6f794	ldr x8,[sp, #0x28]
00a6f798	ldur q0,[sp, #0x8]
00a6f79c	ldur q1,[sp, #0x18]
00a6f7a0	stur x8,[x29, #-0x60]
00a6f7a4	add x8,sp,#0x8
00a6f7a8	stp q0,q1,[x21]
00a6f7ac	bl 0x00c34c40
00a6f7b0	ldr x8,[sp, #0x28]
00a6f7b4	ldur q0,[sp, #0x18]
00a6f7b8	ldur q1,[sp, #0x8]
00a6f7bc	stur x8,[x29, #-0x38]
00a6f7c0	stur q0,[x21, #0x38]
00a6f7c4	stur q1,[x21, #0x28]
00a6f7c8	ldr x0,[x19, #0x60]
00a6f7cc	cbz x0,0x00a6f7e8
00a6f7d0	ldp x1,x8,[x19, #0x68]
00a6f7d4	sub x2,x29,#0x80
00a6f7d8	add x8,x8,#0x1
00a6f7dc	str x8,[x19, #0x70]
00a6f7e0	bl 0x00c3d440
00a6f7e4	b 0x00a6f818
00a6f7e8	bl 0x00c342a0
00a6f7ec	adrp x0,0x2c1000
00a6f7f0	adrp x2,0x2dc000
00a6f7f4	add x0,x0,#0xcf9
00a6f7f8	add x2,x2,#0x96
00a6f7fc	mov w1,#0x94c
00a6f800	bl 0x00c342b0
00a6f804	orr w0,wzr,#0x6
00a6f808	mov w1,#0xa3
00a6f80c	mov x2,xzr
00a6f810	bl 0x00c342c0
00a6f814	mov w0,wzr
00a6f818	add sp,sp,#0x880
00a6f81c	ldp x29,x30,[sp, #0x30]
00a6f820	ldp x20,x19,[sp, #0x20]
00a6f824	ldp x22,x21,[sp, #0x10]
00a6f828	ldr x28,[sp], #0x40
00a6f82c	ret
