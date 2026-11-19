; ossl_crypto_new_ex_data_ex @ 00a8395c
00a8395c	sub sp,sp,#0xa0
00a83960	stp x26,x25,[sp, #0x50]
00a83964	stp x24,x23,[sp, #0x60]
00a83968	stp x22,x21,[sp, #0x70]
00a8396c	stp x20,x19,[sp, #0x80]
00a83970	stp x29,x30,[sp, #0x90]
00a83974	add x29,sp,#0x90
00a83978	mov x19,x3
00a8397c	mov x20,x2
00a83980	mov w21,w1
00a83984	mov x23,x0
00a83988	bl 0x00c3dee0
00a8398c	cbz x0,0x00a83b34
00a83990	cmp w21,#0x12
00a83994	b.cc 0x00a839d0
00a83998	bl 0x00c342a0
00a8399c	adrp x0,0x2a6000
00a839a0	adrp x2,0x2b2000
00a839a4	add x0,x0,#0xa7
00a839a8	add x2,x2,#0x2d9
00a839ac	mov w1,#0x23
00a839b0	bl 0x00c342b0
00a839b4	mov w1,#0x106
00a839b8	orr w0,wzr,#0xf
00a839bc	movk w1,#0x8, LSL #16
00a839c0	mov x2,xzr
00a839c4	bl 0x00c342c0
00a839c8	mov w0,wzr
00a839cc	b 0x00a83b34
00a839d0	mov x22,x0
00a839d4	ldr x0,[x0]
00a839d8	cbz x0,0x00a83b34
00a839dc	bl 0x00c356a0
00a839e0	cbz w0,0x00a83b34
00a839e4	stp x23,xzr,[x19]
00a839e8	add x25,x22,w21, SXTW  #0x3
00a839ec	ldr x0,[x25, #0x8]!
00a839f0	bl 0x00c325e0
00a839f4	mov w23,w0
00a839f8	cmp w0,#0x1
00a839fc	b.lt 0x00a83a10
00a83a00	cmp w23,#0x9
00a83a04	b.gt 0x00a83a18
00a83a08	mov x21,sp
00a83a0c	b 0x00a83a34
00a83a10	mov x21,xzr
00a83a14	b 0x00a83a58
00a83a18	adrp x1,0x2a6000
00a83a1c	sbfiz x0,x23,#0x3,#0x20
00a83a20	add x1,x1,#0xa7
00a83a24	mov w2,#0xed
00a83a28	bl 0x00c32320
00a83a2c	mov x21,x0
00a83a30	cbz x0,0x00a83a58
00a83a34	mov x24,xzr
00a83a38	mov w26,w23
00a83a3c	ldr x0,[x25]
00a83a40	mov w1,w24
00a83a44	bl 0x00c32610
00a83a48	str x0,[x21, x24, LSL #0x3]
00a83a4c	add x24,x24,#0x1
00a83a50	cmp x26,x24
00a83a54	b.ne 0x00a83a3c
00a83a58	ldr x0,[x22]
00a83a5c	bl 0x00c35690
00a83a60	cmp w23,#0x1
00a83a64	b.lt 0x00a83a98
00a83a68	cbnz x21,0x00a83a98
00a83a6c	bl 0x00c342a0
00a83a70	adrp x0,0x2a6000
00a83a74	adrp x2,0x2d9000
00a83a78	add x0,x0,#0xa7
00a83a7c	add x2,x2,#0xdc9
00a83a80	mov w1,#0xf5
00a83a84	bl 0x00c342b0
00a83a88	mov w1,#0x100
00a83a8c	orr w0,wzr,#0xf
00a83a90	movk w1,#0xc, LSL #16
00a83a94	b 0x00a839c0
00a83a98	cmp w23,#0x1
00a83a9c	b.lt 0x00a83b10
00a83aa0	mov x22,xzr
00a83aa4	mov w23,w23
00a83aa8	ldr x8,[x21, x22, LSL #0x3]
00a83aac	cbz x8,0x00a83b04
00a83ab0	ldr x8,[x8, #0x18]
00a83ab4	cbz x8,0x00a83b04
00a83ab8	ldr x0,[x19, #0x8]
00a83abc	cbz x0,0x00a83ae4
00a83ac0	bl 0x00c325e0
00a83ac4	cmp x22,w0, SXTW 
00a83ac8	mov x1,xzr
00a83acc	b.ge 0x00a83ae8
00a83ad0	ldr x0,[x19, #0x8]
00a83ad4	mov w1,w22
00a83ad8	bl 0x00c32610
00a83adc	mov x1,x0
00a83ae0	b 0x00a83ae8
00a83ae4	mov x1,xzr
00a83ae8	ldr x8,[x21, x22, LSL #0x3]
00a83aec	mov x0,x20
00a83af0	mov x2,x19
00a83af4	mov w3,w22
00a83af8	ldr x9,[x8, #0x18]
00a83afc	ldp x4,x5,[x8]
00a83b00	blr x9
00a83b04	add x22,x22,#0x1
00a83b08	cmp x23,x22
00a83b0c	b.ne 0x00a83aa8
00a83b10	mov x8,sp
00a83b14	cmp x21,x8
00a83b18	b.eq 0x00a83b30
00a83b1c	adrp x1,0x2a6000
00a83b20	add x1,x1,#0xa7
00a83b24	mov w2,#0x100
00a83b28	mov x0,x21
00a83b2c	bl 0x00c32310
00a83b30	mov w0,#0x1
00a83b34	ldp x29,x30,[sp, #0x90]
00a83b38	ldp x20,x19,[sp, #0x80]
00a83b3c	ldp x22,x21,[sp, #0x70]
00a83b40	ldp x24,x23,[sp, #0x60]
00a83b44	ldp x26,x25,[sp, #0x50]
00a83b48	add sp,sp,#0xa0
00a83b4c	ret
