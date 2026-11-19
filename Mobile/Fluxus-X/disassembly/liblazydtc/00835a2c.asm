; FUN_00835a2c @ 00835a2c
00835a2c	sub sp,sp,#0x40
00835a30	stp x29,x30,[sp, #0x10]
00835a34	stp x22,x21,[sp, #0x20]
00835a38	stp x20,x19,[sp, #0x30]
00835a3c	add x29,sp,#0x10
00835a40	mrs x22,tpidr_el0
00835a44	mov x21,x2
00835a48	mov x19,x1
00835a4c	ldr x8,[x22, #0x28]
00835a50	mov x20,x0
00835a54	str x8,[sp, #0x8]
00835a58	ldrb w8,[x2, #0xd]
00835a5c	cmp w8,#0x1
00835a60	b.ne 0x00835aa8
00835a64	ldr s0,[x21, #0x8]
00835a68	adrp x8,0x29a000
00835a6c	mov w9,#0x49
00835a70	ldr d1,[x8, #0xf68]
00835a74	adrp x8,0x29b000
00835a78	strb wzr,[x21, #0xd]
00835a7c	uxtl v0.8H,v0.8B
00835a80	ldr d2,[x8, #0xb60]
00835a84	ldrb w8,[x21, #0xc]
00835a88	eor w8,w8,w9
00835a8c	eor v0.8B,v0.8B,v1.8B
00835a90	ldr d1,[x21]
00835a94	strb w8,[x21, #0xc]
00835a98	eor v1.8B,v1.8B,v2.8B
00835a9c	uzp1 v0.8B,v0.8B,v0.8B
00835aa0	str d1,[x21]
00835aa4	str s0,[x21, #0x8]
00835aa8	mov x0,x20
00835aac	mov x1,x19
00835ab0	mov x2,x21
00835ab4	mov w3,wzr
00835ab8	mov x4,xzr
00835abc	bl 0x008ac76c
00835ac0	mov x0,x20
00835ac4	mov w1,#0xffffffff
00835ac8	bl 0x008aa2e4
00835acc	ldr x8,[x0]
00835ad0	adrp x0,0xd1d000
00835ad4	add x0,x0,#0x9c0
00835ad8	mov x1,sp
00835adc	mov x2,sp
00835ae0	str x8,[sp]
00835ae4	bl 0x00807f14
00835ae8	adrp x0,0xcca000
00835aec	add x0,x0,#0x848
00835af0	mov x1,sp
00835af4	mov x2,sp
00835af8	str x19,[sp]
00835afc	bl 0x0080837c
00835b00	mov x0,x20
00835b04	mov w1,#0xffffd8ee
00835b08	mov x2,x21
00835b0c	bl 0x008ad800
00835b10	ldr x8,[x22, #0x28]
00835b14	ldr x9,[sp, #0x8]
00835b18	cmp x8,x9
00835b1c	b.ne 0x00835b34
00835b20	ldp x20,x19,[sp, #0x30]
00835b24	ldp x22,x21,[sp, #0x20]
00835b28	ldp x29,x30,[sp, #0x10]
00835b2c	add sp,sp,#0x40
00835b30	ret
00835b34	bl 0x00c2fec0
