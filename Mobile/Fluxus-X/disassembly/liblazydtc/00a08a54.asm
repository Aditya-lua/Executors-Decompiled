; BN_usub @ 00a08a54
00a08a54	stp x24,x23,[sp, #-0x40]!
00a08a58	stp x22,x21,[sp, #0x10]
00a08a5c	stp x20,x19,[sp, #0x20]
00a08a60	stp x29,x30,[sp, #0x30]
00a08a64	ldr w20,[x1, #0x8]
00a08a68	ldrsw x22,[x2, #0x8]
00a08a6c	add x29,sp,#0x30
00a08a70	subs w24,w20,w22
00a08a74	b.mi 0x00a08b1c
00a08a78	mov x23,x1
00a08a7c	mov w1,w20
00a08a80	mov x21,x2
00a08a84	mov x19,x0
00a08a88	bl 0x00c38e80
00a08a8c	cbz x0,0x00a08b4c
00a08a90	ldr x23,[x23]
00a08a94	ldr x2,[x21]
00a08a98	ldr x21,[x19]
00a08a9c	mov w3,w22
00a08aa0	mov x1,x23
00a08aa4	mov x0,x21
00a08aa8	bl 0x00c38940
00a08aac	add x8,x21,x22, LSL #0x3
00a08ab0	cbz w24,0x00a08af0
00a08ab4	sub w10,w20,#0x1
00a08ab8	sub w10,w10,w22
00a08abc	add x10,x22,x10
00a08ac0	add x9,x23,x22, LSL #0x3
00a08ac4	add x10,x10,#0x1
00a08ac8	sub w11,w22,w20
00a08acc	ldr x12,[x9], #0x8
00a08ad0	cmp x12,#0x0
00a08ad4	sub x13,x12,x0
00a08ad8	cset w12,eq
00a08adc	str x13,[x8], #0x8
00a08ae0	adds w11,w11,#0x1
00a08ae4	and x0,x0,x12
00a08ae8	b.ne 0x00a08acc
00a08aec	add x8,x21,x10, LSL #0x3
00a08af0	cbz w20,0x00a08b0c
00a08af4	sub x8,x8,#0x8
00a08af8	ldr x9,[x8]
00a08afc	cbnz x9,0x00a08b0c
00a08b00	sub w20,w20,#0x1
00a08b04	sub x8,x8,#0x8
00a08b08	cbnz w20,0x00a08af8
00a08b0c	mov w0,#0x1
00a08b10	str w20,[x19, #0x8]
00a08b14	str wzr,[x19, #0x10]
00a08b18	b 0x00a08b4c
00a08b1c	bl 0x00c342a0
00a08b20	adrp x0,0x29d000
00a08b24	adrp x2,0x2d5000
00a08b28	add x0,x0,#0xf90
00a08b2c	add x2,x2,#0xaf5
00a08b30	mov w1,#0x8b
00a08b34	bl 0x00c342b0
00a08b38	orr w0,wzr,#0x3
00a08b3c	mov w1,#0x64
00a08b40	mov x2,xzr
00a08b44	bl 0x00c342c0
00a08b48	mov w0,wzr
00a08b4c	ldp x29,x30,[sp, #0x30]
00a08b50	ldp x20,x19,[sp, #0x20]
00a08b54	ldp x22,x21,[sp, #0x10]
00a08b58	ldp x24,x23,[sp], #0x40
00a08b5c	ret
