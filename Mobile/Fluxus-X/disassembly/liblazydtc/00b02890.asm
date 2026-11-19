; X509_PURPOSE_add @ 00b02890
00b02890	sub sp,sp,#0x90
00b02894	sub w8,w0,#0x1
00b02898	stp x26,x25,[sp, #0x40]
00b0289c	stp x24,x23,[sp, #0x50]
00b028a0	stp x22,x21,[sp, #0x60]
00b028a4	stp x20,x19,[sp, #0x70]
00b028a8	mov x20,x6
00b028ac	mov x25,x5
00b028b0	mov x26,x4
00b028b4	mov x21,x3
00b028b8	mov w24,w2
00b028bc	mov w22,w0
00b028c0	cmp w8,#0x8
00b028c4	mov w23,w1
00b028c8	stp x28,x27,[sp, #0x30]
00b028cc	stp x29,x30,[sp, #0x80]
00b028d0	add x29,sp,#0x80
00b028d4	b.hi 0x00b029b4
00b028d8	adrp x9,0xcc9000
00b028dc	add x9,x9,#0xa28
00b028e0	orr w10,wzr,#0x30
00b028e4	mov w28,wzr
00b028e8	smaddl x19,w8,w10,x9
00b028ec	ldrb w8,[x19, #0x8]
00b028f0	tbz w8,#0x1,0x00b0291c
00b028f4	ldr x0,[x19, #0x18]
00b028f8	adrp x27,0x2a2000
00b028fc	add x27,x27,#0xe25
00b02900	mov w2,#0xb2
00b02904	mov x1,x27
00b02908	bl 0x00c32310
00b0290c	ldr x0,[x19, #0x20]
00b02910	mov w2,#0xb3
00b02914	mov x1,x27
00b02918	bl 0x00c32310
00b0291c	adrp x27,0x2a2000
00b02920	add x27,x27,#0xe25
00b02924	mov w2,#0xb6
00b02928	mov x0,x26
00b0292c	mov x1,x27
00b02930	bl 0x00c34600
00b02934	str x0,[x19, #0x18]
00b02938	mov w2,#0xb7
00b0293c	mov x0,x25
00b02940	mov x1,x27
00b02944	bl 0x00c34600
00b02948	str x0,[x19, #0x20]
00b0294c	cbz x0,0x00b02a08
00b02950	ldr x8,[x19, #0x18]
00b02954	cbz x8,0x00b02a08
00b02958	ldr w9,[x19, #0x8]
00b0295c	and w8,w24,#0xfffffffc
00b02960	stp w22,w23,[x19]
00b02964	str x21,[x19, #0x10]
00b02968	and w9,w9,#0x1
00b0296c	orr w8,w8,w9
00b02970	orr w8,w8,#0x2
00b02974	str w8,[x19, #0x8]
00b02978	str x20,[x19, #0x28]
00b0297c	cbz w28,0x00b029ac
00b02980	adrp x20,0xd22000
00b02984	ldr x0,[x20, #0x7e0]
00b02988	cbnz x0,0x00b029a0
00b0298c	adrp x0,0xb02000
00b02990	add x0,x0,#0xb64
00b02994	bl 0x00c35340
00b02998	str x0,[x20, #0x7e0]
00b0299c	cbz x0,0x00b02ad8
00b029a0	mov x1,x19
00b029a4	bl 0x00c347a0
00b029a8	cbz w0,0x00b02aa8
00b029ac	mov w0,#0x1
00b029b0	b 0x00b02b44
00b029b4	adrp x19,0xd22000
00b029b8	ldr x0,[x19, #0x7e0]
00b029bc	cbz x0,0x00b02a44
00b029c0	mov x1,sp
00b029c4	str w22,[sp]
00b029c8	bl 0x00c34760
00b029cc	tbnz w0,#0x1f,0x00b02a44
00b029d0	add w8,w0,#0x9
00b029d4	mov w1,w0
00b029d8	cmn w8,#0x1
00b029dc	b.eq 0x00b02a44
00b029e0	tbnz w8,#0x1f,0x00b02ac4
00b029e4	cmp w8,#0x8
00b029e8	b.le 0x00b028d8
00b029ec	ldr x0,[x19, #0x7e0]
00b029f0	bl 0x00c32610
00b029f4	mov x19,x0
00b029f8	mov w28,wzr
00b029fc	ldrb w8,[x19, #0x8]
00b02a00	tbnz w8,#0x1,0x00b028f4
00b02a04	b 0x00b0291c
00b02a08	bl 0x00c342a0
00b02a0c	adrp x0,0x2a2000
00b02a10	adrp x2,0x2d0000
00b02a14	add x0,x0,#0xe25
00b02a18	add x2,x2,#0x4d2
00b02a1c	mov w1,#0xb9
00b02a20	bl 0x00c342b0
00b02a24	mov w1,#0x100
00b02a28	mov w0,#0x22
00b02a2c	movk w1,#0xc, LSL #16
00b02a30	mov x2,xzr
00b02a34	bl 0x00c342c0
00b02a38	mov w0,wzr
00b02a3c	cbnz w28,0x00b02b08
00b02a40	b 0x00b02b44
00b02a44	adrp x1,0x2a2000
00b02a48	add x1,x1,#0xe25
00b02a4c	orr w0,wzr,#0x30
00b02a50	mov w2,#0xa8
00b02a54	bl 0x00c32320
00b02a58	cbz x0,0x00b02a74
00b02a5c	mov w28,#0x1
00b02a60	mov x19,x0
00b02a64	str w28,[x0, #0x8]
00b02a68	ldrb w8,[x19, #0x8]
00b02a6c	tbnz w8,#0x1,0x00b028f4
00b02a70	b 0x00b0291c
00b02a74	bl 0x00c342a0
00b02a78	adrp x0,0x2a2000
00b02a7c	adrp x2,0x2d0000
00b02a80	add x0,x0,#0xe25
00b02a84	add x2,x2,#0x4d2
00b02a88	mov w1,#0xa9
00b02a8c	bl 0x00c342b0
00b02a90	mov w1,#0x100
00b02a94	mov w0,#0x22
00b02a98	movk w1,#0xc, LSL #16
00b02a9c	mov x2,xzr
00b02aa0	bl 0x00c342c0
00b02aa4	b 0x00b02b40
00b02aa8	bl 0x00c342a0
00b02aac	adrp x0,0x2a2000
00b02ab0	adrp x2,0x2d0000
00b02ab4	add x0,x0,#0xe25
00b02ab8	add x2,x2,#0x4d2
00b02abc	mov w1,#0xce
00b02ac0	b 0x00b02af0
00b02ac4	mov w28,wzr
00b02ac8	mov x19,xzr
00b02acc	ldrb w8,[x19, #0x8]
00b02ad0	tbnz w8,#0x1,0x00b028f4
00b02ad4	b 0x00b0291c
00b02ad8	bl 0x00c342a0
00b02adc	adrp x0,0x2a2000
00b02ae0	adrp x2,0x2d0000
00b02ae4	add x0,x0,#0xe25
00b02ae8	add x2,x2,#0x4d2
00b02aec	mov w1,#0xca
00b02af0	bl 0x00c342b0
00b02af4	mov w1,#0x100
00b02af8	mov w0,#0x22
00b02afc	movk w1,#0xc, LSL #16
00b02b00	mov x2,xzr
00b02b04	bl 0x00c342c0
00b02b08	ldr x0,[x19, #0x18]
00b02b0c	adrp x20,0x2a2000
00b02b10	add x20,x20,#0xe25
00b02b14	mov w2,#0xd5
00b02b18	mov x1,x20
00b02b1c	bl 0x00c32310
00b02b20	ldr x0,[x19, #0x20]
00b02b24	mov w2,#0xd6
00b02b28	mov x1,x20
00b02b2c	bl 0x00c32310
00b02b30	mov w2,#0xd7
00b02b34	mov x0,x19
00b02b38	mov x1,x20
00b02b3c	bl 0x00c32310
00b02b40	mov w0,wzr
00b02b44	ldp x29,x30,[sp, #0x80]
00b02b48	ldp x20,x19,[sp, #0x70]
00b02b4c	ldp x22,x21,[sp, #0x60]
00b02b50	ldp x24,x23,[sp, #0x50]
00b02b54	ldp x26,x25,[sp, #0x40]
00b02b58	ldp x28,x27,[sp, #0x30]
00b02b5c	add sp,sp,#0x90
00b02b60	ret
