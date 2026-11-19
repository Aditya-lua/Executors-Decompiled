; SSL_CTX_use_serverinfo_file @ 009bc858
009bc858	sub sp,sp,#0x80
009bc85c	stp x28,x27,[sp, #0x20]
009bc860	stp x26,x25,[sp, #0x30]
009bc864	stp x24,x23,[sp, #0x40]
009bc868	stp x22,x21,[sp, #0x50]
009bc86c	stp x20,x19,[sp, #0x60]
009bc870	stp x29,x30,[sp, #0x70]
009bc874	add x29,sp,#0x70
009bc878	stp xzr,xzr,[sp, #0x10]
009bc87c	stp xzr,xzr,[sp]
009bc880	cbz x0,0x009bca5c
009bc884	mov x20,x1
009bc888	cbz x1,0x009bca5c
009bc88c	mov x21,x0
009bc890	bl 0x00c32270
009bc894	bl 0x00c32240
009bc898	mov x19,x0
009bc89c	cbz x0,0x009bcaa0
009bc8a0	mov w1,#0x6c
009bc8a4	orr w2,wzr,#0x3
009bc8a8	mov x0,x19
009bc8ac	mov x3,x20
009bc8b0	bl 0x00c321a0
009bc8b4	cmp w0,#0x1
009bc8b8	b.lt 0x009bcad0
009bc8bc	add x1,sp,#0x8
009bc8c0	mov x2,sp
009bc8c4	add x3,sp,#0x18
009bc8c8	add x4,sp,#0x10
009bc8cc	mov x0,x19
009bc8d0	bl 0x00c35f90
009bc8d4	cbz w0,0x009bcb08
009bc8d8	adrp x23,0x2db000
009bc8dc	mov x27,xzr
009bc8e0	mov x20,xzr
009bc8e4	mov x28,xzr
009bc8e8	add x23,x23,#0xaec
009bc8ec	ldr x25,[sp, #0x8]
009bc8f0	mov x0,x25
009bc8f4	bl 0x00c2ff50
009bc8f8	and x22,x0,#0xffffffff
009bc8fc	cmp x22,#0xe
009bc900	b.ls 0x009bcb60
009bc904	adrp x1,0x74c000
009bc908	orr w2,wzr,#0xf
009bc90c	mov x0,x25
009bc910	add x1,x1,#0x648
009bc914	bl 0x00c31bb0
009bc918	cbz w0,0x009bc96c
009bc91c	cmp x22,#0x10
009bc920	b.ls 0x009bcbd0
009bc924	adrp x1,0x74c000
009bc928	mov w2,#0x11
009bc92c	mov x0,x25
009bc930	add x1,x1,#0x658
009bc934	bl 0x00c31bb0
009bc938	cbnz w0,0x009bcbf8
009bc93c	ldr x8,[sp, #0x10]
009bc940	subs x9,x8,#0x8
009bc944	b.lt 0x009bcb44
009bc948	ldr x10,[sp, #0x18]
009bc94c	ldrb w11,[x10, #0x6]
009bc950	ldrb w10,[x10, #0x7]
009bc954	bfm x10,x11,#0x38,#0x7
009bc958	cmp x10,x9
009bc95c	b.ne 0x009bcb44
009bc960	mov w22,wzr
009bc964	mov x24,xzr
009bc968	b 0x009bc998
009bc96c	ldr x8,[sp, #0x10]
009bc970	subs x9,x8,#0x4
009bc974	b.lt 0x009bcba8
009bc978	ldr x10,[sp, #0x18]
009bc97c	ldrb w11,[x10, #0x2]
009bc980	ldrb w10,[x10, #0x3]
009bc984	bfm x10,x11,#0x38,#0x7
009bc988	cmp x10,x9
009bc98c	b.ne 0x009bcba8
009bc990	mov w22,#0x1
009bc994	mov w24,#0x4
009bc998	add x8,x8,x28
009bc99c	add x26,x8,x24
009bc9a0	mov w3,#0x37d
009bc9a4	mov x0,x20
009bc9a8	mov x1,x26
009bc9ac	mov x2,x23
009bc9b0	bl 0x00c356f0
009bc9b4	cbz x0,0x009bcb7c
009bc9b8	ldp x2,x1,[sp, #0x10]
009bc9bc	mov x25,x0
009bc9c0	add x8,x0,x28
009bc9c4	cbz w22,0x009bc9d0
009bc9c8	mov w9,#0xd0010000
009bc9cc	str w9,[x8]
009bc9d0	add x0,x8,x24
009bc9d4	bl 0x00c2ffd0
009bc9d8	ldr x0,[sp, #0x8]
009bc9dc	mov w2,#0x387
009bc9e0	mov x1,x23
009bc9e4	bl 0x00c32310
009bc9e8	ldr x0,[sp]
009bc9ec	mov w2,#0x389
009bc9f0	mov x1,x23
009bc9f4	str xzr,[sp, #0x8]
009bc9f8	bl 0x00c32310
009bc9fc	ldr x0,[sp, #0x18]
009bca00	mov w2,#0x38b
009bca04	mov x1,x23
009bca08	str xzr,[sp]
009bca0c	bl 0x00c32310
009bca10	add x1,sp,#0x8
009bca14	mov x2,sp
009bca18	add x3,sp,#0x18
009bca1c	add x4,sp,#0x10
009bca20	mov x0,x19
009bca24	str xzr,[sp, #0x18]
009bca28	bl 0x00c35f90
009bca2c	sub x27,x27,#0x1
009bca30	mov x20,x25
009bca34	mov x28,x26
009bca38	cbnz w0,0x009bc8ec
009bca3c	cbz x27,0x009bcb0c
009bca40	mov w1,#0x2
009bca44	mov x0,x21
009bca48	mov x2,x25
009bca4c	mov x3,x26
009bca50	bl 0x009bc4f4
009bca54	mov w21,w0
009bca58	b 0x009bcb3c
009bca5c	bl 0x00c342a0
009bca60	adrp x0,0x2db000
009bca64	adrp x2,0x29f000
009bca68	add x0,x0,#0xaec
009bca6c	add x2,x2,#0xdd4
009bca70	mov w1,#0x337
009bca74	bl 0x00c342b0
009bca78	mov w8,#0x100
009bca7c	movk w8,#0xc, LSL #16
009bca80	add w1,w8,#0x2
009bca84	mov w0,#0x14
009bca88	mov x2,xzr
009bca8c	bl 0x00c342c0
009bca90	mov x20,xzr
009bca94	mov w21,wzr
009bca98	mov x19,xzr
009bca9c	b 0x009bcc28
009bcaa0	bl 0x00c342a0
009bcaa4	adrp x0,0x2db000
009bcaa8	adrp x2,0x29f000
009bcaac	add x0,x0,#0xaec
009bcab0	add x2,x2,#0xdd4
009bcab4	mov w1,#0x33d
009bcab8	bl 0x00c342b0
009bcabc	mov w8,#0x2
009bcac0	movk w8,#0x8, LSL #16
009bcac4	add w1,w8,#0x5
009bcac8	mov w0,#0x14
009bcacc	b 0x009bcaf8
009bcad0	bl 0x00c342a0
009bcad4	adrp x0,0x2db000
009bcad8	adrp x2,0x29f000
009bcadc	add x0,x0,#0xaec
009bcae0	add x2,x2,#0xdd4
009bcae4	mov w1,#0x341
009bcae8	bl 0x00c342b0
009bcaec	mov w1,#0x2
009bcaf0	mov w0,#0x14
009bcaf4	movk w1,#0x8, LSL #16
009bcaf8	mov x2,xzr
009bcafc	bl 0x00c342c0
009bcb00	mov x20,xzr
009bcb04	b 0x009bcc24
009bcb08	mov x25,xzr
009bcb0c	bl 0x00c342a0
009bcb10	adrp x0,0x2db000
009bcb14	adrp x2,0x29f000
009bcb18	add x0,x0,#0xaec
009bcb1c	add x2,x2,#0xdd4
009bcb20	mov w1,#0x34f
009bcb24	bl 0x00c342b0
009bcb28	mov w0,#0x14
009bcb2c	mov w1,#0x185
009bcb30	mov x2,xzr
009bcb34	bl 0x00c342c0
009bcb38	mov w21,wzr
009bcb3c	mov x20,x25
009bcb40	b 0x009bcc28
009bcb44	bl 0x00c342a0
009bcb48	adrp x0,0x2db000
009bcb4c	adrp x2,0x29f000
009bcb50	add x0,x0,#0xaec
009bcb54	add x2,x2,#0xdd4
009bcb58	mov w1,#0x377
009bcb5c	b 0x009bcbc0
009bcb60	bl 0x00c342a0
009bcb64	adrp x0,0x2db000
009bcb68	adrp x2,0x29f000
009bcb6c	add x0,x0,#0xaec
009bcb70	add x2,x2,#0xdd4
009bcb74	mov w1,#0x357
009bcb78	b 0x009bcbe8
009bcb7c	bl 0x00c342a0
009bcb80	adrp x0,0x2db000
009bcb84	adrp x2,0x29f000
009bcb88	add x0,x0,#0xaec
009bcb8c	add x2,x2,#0xdd4
009bcb90	mov w1,#0x37f
009bcb94	bl 0x00c342b0
009bcb98	mov w1,#0x100
009bcb9c	mov w0,#0x14
009bcba0	movk w1,#0xc, LSL #16
009bcba4	b 0x009bcc1c
009bcba8	bl 0x00c342a0
009bcbac	adrp x0,0x2db000
009bcbb0	adrp x2,0x29f000
009bcbb4	add x0,x0,#0xaec
009bcbb8	add x2,x2,#0xdd4
009bcbbc	mov w1,#0x36f
009bcbc0	bl 0x00c342b0
009bcbc4	mov w0,#0x14
009bcbc8	mov w1,#0x186
009bcbcc	b 0x009bcc1c
009bcbd0	bl 0x00c342a0
009bcbd4	adrp x0,0x2db000
009bcbd8	adrp x2,0x29f000
009bcbdc	add x0,x0,#0xaec
009bcbe0	add x2,x2,#0xdd4
009bcbe4	mov w1,#0x35e
009bcbe8	bl 0x00c342b0
009bcbec	mov w0,#0x14
009bcbf0	mov w1,#0x188
009bcbf4	b 0x009bcc1c
009bcbf8	bl 0x00c342a0
009bcbfc	adrp x0,0x2db000
009bcc00	adrp x2,0x29f000
009bcc04	add x0,x0,#0xaec
009bcc08	add x2,x2,#0xdd4
009bcc0c	mov w1,#0x362
009bcc10	bl 0x00c342b0
009bcc14	mov w0,#0x14
009bcc18	mov w1,#0x187
009bcc1c	mov x2,xzr
009bcc20	bl 0x00c342c0
009bcc24	mov w21,wzr
009bcc28	ldr x0,[sp, #0x8]
009bcc2c	adrp x22,0x2db000
009bcc30	add x22,x22,#0xaec
009bcc34	mov w2,#0x393
009bcc38	mov x1,x22
009bcc3c	bl 0x00c32310
009bcc40	ldr x0,[sp]
009bcc44	mov w2,#0x394
009bcc48	mov x1,x22
009bcc4c	bl 0x00c32310
009bcc50	ldr x0,[sp, #0x18]
009bcc54	mov w2,#0x395
009bcc58	mov x1,x22
009bcc5c	bl 0x00c32310
009bcc60	mov w2,#0x396
009bcc64	mov x0,x20
009bcc68	mov x1,x22
009bcc6c	bl 0x00c32310
009bcc70	mov x0,x19
009bcc74	bl 0x00c31a40
009bcc78	mov w0,w21
009bcc7c	ldp x29,x30,[sp, #0x70]
009bcc80	ldp x20,x19,[sp, #0x60]
009bcc84	ldp x22,x21,[sp, #0x50]
009bcc88	ldp x24,x23,[sp, #0x40]
009bcc8c	ldp x26,x25,[sp, #0x30]
009bcc90	ldp x28,x27,[sp, #0x20]
009bcc94	add sp,sp,#0x80
009bcc98	ret
