; CRYPTO_128_wrap @ 00aac710
00aac710	sub sp,sp,#0x60
00aac714	sub x8,x4,#0x10
00aac718	orr w9,wzr,#0x7ffffff0
00aac71c	stp x22,x21,[sp, #0x30]
00aac720	mov x22,x0
00aac724	cmp x8,x9
00aac728	mov x0,xzr
00aac72c	stp x26,x25,[sp, #0x10]
00aac730	stp x24,x23,[sp, #0x20]
00aac734	stp x20,x19,[sp, #0x40]
00aac738	stp x29,x30,[sp, #0x50]
00aac73c	add x29,sp,#0x50
00aac740	b.hi 0x00aac814
00aac744	mov x19,x4
00aac748	and x8,x4,#0x7
00aac74c	cbnz x8,0x00aac814
00aac750	add x23,x2,#0x8
00aac754	mov x21,x2
00aac758	mov x24,x1
00aac75c	mov x0,x23
00aac760	mov x1,x3
00aac764	mov x2,x19
00aac768	mov x20,x5
00aac76c	bl 0x00c2ff60
00aac770	adrp x8,0x76e000
00aac774	add x8,x8,#0xa18
00aac778	cmp x24,#0x0
00aac77c	csel x8,x8,x24,eq
00aac780	ldr x8,[x8]
00aac784	mov x25,xzr
00aac788	mov w24,#0x1
00aac78c	str x8,[sp]
00aac790	mov x26,xzr
00aac794	ldr x8,[x23, x26#0x0]
00aac798	mov x0,sp
00aac79c	mov x1,sp
00aac7a0	mov x2,x22
00aac7a4	str x8,[sp, #0x8]
00aac7a8	blr x20
00aac7ac	ldrb w8,[sp, #0x7]
00aac7b0	cmp x24,#0x100
00aac7b4	eor w8,w8,w24
00aac7b8	strb w8,[sp, #0x7]
00aac7bc	b.cc 0x00aac7e4
00aac7c0	ldrb w8,[sp, #0x6]
00aac7c4	eor w8,w8,w24, LSR #0x8
00aac7c8	strb w8,[sp, #0x6]
00aac7cc	ldrb w8,[sp, #0x5]
00aac7d0	eor w8,w8,w24, LSR #0x10
00aac7d4	strb w8,[sp, #0x5]
00aac7d8	ldrb w8,[sp, #0x4]
00aac7dc	eor w8,w8,w24, LSR #0x18
00aac7e0	strb w8,[sp, #0x4]
00aac7e4	ldr x8,[sp, #0x8]
00aac7e8	add x24,x24,#0x1
00aac7ec	str x8,[x23, x26#0x0]
00aac7f0	add x26,x26,#0x8
00aac7f4	cmp x26,x19
00aac7f8	b.cc 0x00aac794
00aac7fc	add x25,x25,#0x1
00aac800	cmp x25,#0x6
00aac804	b.ne 0x00aac790
00aac808	ldr x8,[sp]
00aac80c	add x0,x19,#0x8
00aac810	str x8,[x21]
00aac814	ldp x29,x30,[sp, #0x50]
00aac818	ldp x20,x19,[sp, #0x40]
00aac81c	ldp x22,x21,[sp, #0x30]
00aac820	ldp x24,x23,[sp, #0x20]
00aac824	ldp x26,x25,[sp, #0x10]
00aac828	add sp,sp,#0x60
00aac82c	ret
