; SSL_read_early_data @ 009b4930
009b4930	stp x22,x21,[sp, #-0x30]!
009b4934	stp x20,x19,[sp, #0x10]
009b4938	stp x29,x30,[sp, #0x20]
009b493c	ldr w8,[x0, #0x38]
009b4940	add x29,sp,#0x20
009b4944	cbz w8,0x009b4a14
009b4948	ldr w8,[x0, #0x84]
009b494c	mov x20,x3
009b4950	mov x21,x2
009b4954	mov x19,x0
009b4958	mov x22,x1
009b495c	cmp w8,#0xa
009b4960	b.eq 0x009b49c4
009b4964	cmp w8,#0x8
009b4968	b.eq 0x009b497c
009b496c	cbnz w8,0x009b4a30
009b4970	mov x0,x19
009b4974	bl 0x00c347f0
009b4978	cbz w0,0x009b4a70
009b497c	ldr x8,[x19, #0x30]
009b4980	mov w9,#0x9
009b4984	str w9,[x19, #0x84]
009b4988	cbnz x8,0x009b49b4
009b498c	mov w8,#0x1
009b4990	mov x0,x19
009b4994	str w8,[x19, #0x38]
009b4998	str wzr,[x19, #0x44]
009b499c	bl 0x00c35cd0
009b49a0	ldr x8,[x19, #0x8]
009b49a4	mov x0,x19
009b49a8	ldr x8,[x8, #0x28]
009b49ac	str x8,[x19, #0x30]
009b49b0	bl 0x009b1b60
009b49b4	mov x0,x19
009b49b8	bl 0x009b445c
009b49bc	cmp w0,#0x0
009b49c0	b.le 0x009b4a60
009b49c4	ldr w8,[x19, #0xb30]
009b49c8	cmp w8,#0x2
009b49cc	b.ne 0x009b4a4c
009b49d0	mov w8,#0xb
009b49d4	mov x0,x19
009b49d8	mov x1,x22
009b49dc	mov x2,x21
009b49e0	mov x3,x20
009b49e4	str w8,[x19, #0x84]
009b49e8	bl 0x009b45d0
009b49ec	cmp w0,#0x0
009b49f0	b.gt 0x009b4a00
009b49f4	ldr w8,[x19, #0x84]
009b49f8	cmp w8,#0xc
009b49fc	b.eq 0x009b4a54
009b4a00	cmp w0,#0x0
009b4a04	mov w8,#0xa
009b4a08	cset w0,gt
009b4a0c	str w8,[x19, #0x84]
009b4a10	b 0x009b4aa4
009b4a14	bl 0x00c342a0
009b4a18	adrp x0,0x2c5000
009b4a1c	adrp x2,0x29d000
009b4a20	add x0,x0,#0x652
009b4a24	add x2,x2,#0xd15
009b4a28	mov w1,#0x78a
009b4a2c	b 0x009b4a88
009b4a30	bl 0x00c342a0
009b4a34	adrp x0,0x2c5000
009b4a38	adrp x2,0x29d000
009b4a3c	add x0,x0,#0x652
009b4a40	add x2,x2,#0xd15
009b4a44	mov w1,#0x7b6
009b4a48	b 0x009b4a88
009b4a4c	orr w8,wzr,#0xc
009b4a50	str w8,[x19, #0x84]
009b4a54	str xzr,[x20]
009b4a58	mov w0,#0x2
009b4a5c	b 0x009b4aa4
009b4a60	mov w8,#0x8
009b4a64	mov w0,wzr
009b4a68	str w8,[x19, #0x84]
009b4a6c	b 0x009b4aa4
009b4a70	bl 0x00c342a0
009b4a74	adrp x0,0x2c5000
009b4a78	adrp x2,0x29d000
009b4a7c	add x0,x0,#0x652
009b4a80	add x2,x2,#0xd15
009b4a84	mov w1,#0x791
009b4a88	bl 0x00c342b0
009b4a8c	mov w1,#0x101
009b4a90	mov w0,#0x14
009b4a94	movk w1,#0xc, LSL #16
009b4a98	mov x2,xzr
009b4a9c	bl 0x00c342c0
009b4aa0	mov w0,wzr
009b4aa4	ldp x29,x30,[sp, #0x20]
009b4aa8	ldp x20,x19,[sp, #0x10]
009b4aac	ldp x22,x21,[sp], #0x30
009b4ab0	ret
