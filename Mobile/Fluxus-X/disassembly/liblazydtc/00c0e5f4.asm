; FUN_00c0e5f4 @ 00c0e5f4
00c0e5f4	paciasp
00c0e5f8	stp x29,x30,[sp, #-0x40]!
00c0e5fc	stp x24,x23,[sp, #0x10]
00c0e600	stp x22,x21,[sp, #0x20]
00c0e604	stp x20,x19,[sp, #0x30]
00c0e608	mov x29,sp
00c0e60c	ldr x8,[x1, #0x10]
00c0e610	ldr x9,[x0, #0x8]
00c0e614	mov w20,w3
00c0e618	mov x19,x1
00c0e61c	mov x21,x2
00c0e620	ldr x8,[x8, #0x8]
00c0e624	cmp x9,x8
00c0e628	b.eq 0x00c0e654
00c0e62c	ldrb w9,[x19, #0x4f]
00c0e630	ldr w24,[x0, #0x14]
00c0e634	mov x22,x0
00c0e638	ldr x8,[x0, #0x20]
00c0e63c	cmp w9,#0x1
00c0e640	b.ne 0x00c0e694
00c0e644	asr x9,x8,#0x8
00c0e648	tbnz w8,#0x0,0x00c0e6a4
00c0e64c	mov x10,x21
00c0e650	b 0x00c0e6c8
00c0e654	ldr w8,[x19, #0x3c]
00c0e658	cbz w8,0x00c0e78c
00c0e65c	ldr x9,[x19, #0x28]
00c0e660	ldr x10,[x19, #0x50]
00c0e664	cmp x9,x10
00c0e668	b.ne 0x00c0e678
00c0e66c	ldr x9,[x19, #0x20]
00c0e670	cmp x9,x21
00c0e674	b.eq 0x00c0e7b8
00c0e678	add w8,w8,#0x1
00c0e67c	mov w9,#0x2
00c0e680	str w8,[x19, #0x3c]
00c0e684	mov w8,#0x1
00c0e688	str w9,[x19, #0x30]
00c0e68c	strb w8,[x19, #0x4e]
00c0e690	b 0x00c0e7a0
00c0e694	tbnz w8,#0x0,0x00c0e6b4
00c0e698	asr x9,x8,#0x8
00c0e69c	mov x10,x21
00c0e6a0	b 0x00c0e6c8
00c0e6a4	ldr x10,[x21]
00c0e6a8	ldr x9,[x10, x9#0x0]
00c0e6ac	mov x10,x21
00c0e6b0	b 0x00c0e6c8
00c0e6b4	ldr x11,[x22, #0x18]
00c0e6b8	mov x9,xzr
00c0e6bc	mov x10,xzr
00c0e6c0	ldr x11,[x11, #0x8]
00c0e6c4	str x11,[x19, #0x50]
00c0e6c8	ldr x0,[x22, #0x18]
00c0e6cc	tst x8,#0x2
00c0e6d0	mov w23,#0x2
00c0e6d4	csel w3,w23,w20,eq
00c0e6d8	add x2,x9,x10
00c0e6dc	mov x1,x19
00c0e6e0	ldr x11,[x0]
00c0e6e4	ldr x8,[x11, #0x38]
00c0e6e8	blr x8
00c0e6ec	cmp w24,#0x2
00c0e6f0	b.cc 0x00c0e7a0
00c0e6f4	add x8,x22,x24, LSL #0x4
00c0e6f8	add x22,x22,#0x38
00c0e6fc	add x24,x8,#0x18
00c0e700	ldrb w9,[x19, #0x4f]
00c0e704	ldur x8,[x22, #-0x8]
00c0e708	cmp w9,#0x1
00c0e70c	b.ne 0x00c0e720
00c0e710	asr x9,x8,#0x8
00c0e714	tbnz w8,#0x0,0x00c0e730
00c0e718	mov x10,x21
00c0e71c	b 0x00c0e754
00c0e720	tbnz w8,#0x0,0x00c0e740
00c0e724	asr x9,x8,#0x8
00c0e728	mov x10,x21
00c0e72c	b 0x00c0e754
00c0e730	ldr x10,[x21]
00c0e734	ldr x9,[x10, x9#0x0]
00c0e738	mov x10,x21
00c0e73c	b 0x00c0e754
00c0e740	ldur x11,[x22, #-0x10]
00c0e744	mov x9,xzr
00c0e748	mov x10,xzr
00c0e74c	ldr x11,[x11, #0x8]
00c0e750	str x11,[x19, #0x50]
00c0e754	ldur x0,[x22, #-0x10]
00c0e758	tst x8,#0x2
00c0e75c	add x2,x9,x10
00c0e760	csel w3,w23,w20,eq
00c0e764	mov x1,x19
00c0e768	ldr x11,[x0]
00c0e76c	ldr x8,[x11, #0x38]
00c0e770	blr x8
00c0e774	ldrb w8,[x19, #0x4e]
00c0e778	tbnz w8,#0x0,0x00c0e7a0
00c0e77c	cmp x22,x24
00c0e780	add x22,x22,#0x10
00c0e784	b.cc 0x00c0e700
00c0e788	b 0x00c0e7a0
00c0e78c	ldr x8,[x19, #0x50]
00c0e790	mov w9,#0x1
00c0e794	str w20,[x19, #0x30]
00c0e798	str w9,[x19, #0x3c]
00c0e79c	stp x21,x8,[x19, #0x20]
00c0e7a0	ldp x20,x19,[sp, #0x30]
00c0e7a4	ldp x22,x21,[sp, #0x20]
00c0e7a8	ldp x24,x23,[sp, #0x10]
00c0e7ac	ldp x29,x30,[sp], #0x40
00c0e7b0	autiasp
00c0e7b4	ret
00c0e7b8	ldr w8,[x19, #0x30]
00c0e7bc	cmp w8,#0x2
00c0e7c0	b.ne 0x00c0e7a0
00c0e7c4	str w20,[x19, #0x30]
00c0e7c8	b 0x00c0e7a0
