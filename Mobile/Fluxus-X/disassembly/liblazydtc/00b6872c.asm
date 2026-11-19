; ossl_cipher_hw_chunked_cfb8 @ 00b6872c
00b6872c	sub sp,sp,#0x50
00b68730	stp x24,x23,[sp, #0x10]
00b68734	stp x22,x21,[sp, #0x20]
00b68738	stp x20,x19,[sp, #0x30]
00b6873c	stp x29,x30,[sp, #0x40]
00b68740	add x29,sp,#0x40
00b68744	cbz x3,0x00b687bc
00b68748	ldr w8,[x0, #0xa0]
00b6874c	lsr x9,x3,#0x1e
00b68750	cmp x9,#0x0
00b68754	mov w9,#0x40000000
00b68758	mov x19,x3
00b6875c	mov x20,x2
00b68760	mov x21,x1
00b68764	mov x22,x0
00b68768	csel x24,x3,x9,eq
00b6876c	add x23,x0,#0x20
00b68770	str w8,[sp, #0xc]
00b68774	ldrb w8,[x22, #0x6c]
00b68778	ldr x3,[x22, #0xb0]
00b6877c	ldr x7,[x22, #0x30]
00b68780	add x5,sp,#0xc
00b68784	ubfx w6,w8,#0x1,#0x1
00b68788	mov x0,x20
00b6878c	mov x1,x21
00b68790	mov x2,x19
00b68794	mov x4,x23
00b68798	bl 0x00c3e2f0
00b6879c	ldr w8,[sp, #0xc]
00b687a0	sub x19,x19,x24
00b687a4	cmp x19,x24
00b687a8	add x20,x20,x24
00b687ac	add x21,x21,x24
00b687b0	csel x24,x19,x24,cc
00b687b4	str w8,[x22, #0xa0]
00b687b8	cbnz x19,0x00b68770
00b687bc	ldp x29,x30,[sp, #0x40]
00b687c0	ldp x20,x19,[sp, #0x30]
00b687c4	ldp x22,x21,[sp, #0x20]
00b687c8	ldp x24,x23,[sp, #0x10]
00b687cc	mov w0,#0x1
00b687d0	add sp,sp,#0x50
00b687d4	ret
