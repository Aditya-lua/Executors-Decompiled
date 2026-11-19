; FUN_00835b38 @ 00835b38
00835b38	sub sp,sp,#0x40
00835b3c	stp x29,x30,[sp, #0x10]
00835b40	stp x22,x21,[sp, #0x20]
00835b44	stp x20,x19,[sp, #0x30]
00835b48	add x29,sp,#0x10
00835b4c	mrs x22,tpidr_el0
00835b50	mov x21,x2
00835b54	mov x19,x1
00835b58	ldr x8,[x22, #0x28]
00835b5c	mov x20,x0
00835b60	str x8,[sp, #0x8]
00835b64	ldrb w8,[x2, #0xd]
00835b68	cmp w8,#0x1
00835b6c	b.ne 0x00835bb0
00835b70	ldr s0,[x21, #0x8]
00835b74	adrp x8,0x29a000
00835b78	strb wzr,[x21, #0xd]
00835b7c	ldr d1,[x8, #0x970]
00835b80	adrp x8,0x29b000
00835b84	uxtl v0.8H,v0.8B
00835b88	ldr d2,[x8, #0xf50]
00835b8c	ldrb w8,[x21, #0xc]
00835b90	eor w8,w8,#0x33333333
00835b94	eor v0.8B,v0.8B,v1.8B
00835b98	ldr d1,[x21]
00835b9c	strb w8,[x21, #0xc]
00835ba0	eor v1.8B,v1.8B,v2.8B
00835ba4	uzp1 v0.8B,v0.8B,v0.8B
00835ba8	str d1,[x21]
00835bac	str s0,[x21, #0x8]
00835bb0	mov x0,x20
00835bb4	mov x1,x19
00835bb8	mov x2,x21
00835bbc	mov w3,wzr
00835bc0	mov x4,xzr
00835bc4	bl 0x008ac76c
00835bc8	mov x0,x20
00835bcc	mov w1,#0xffffffff
00835bd0	bl 0x008aa2e4
00835bd4	ldr x8,[x0]
00835bd8	adrp x0,0xd1d000
00835bdc	add x0,x0,#0x9c0
00835be0	mov x1,sp
00835be4	mov x2,sp
00835be8	str x8,[sp]
00835bec	bl 0x00807f14
00835bf0	adrp x0,0xcca000
00835bf4	add x0,x0,#0x848
00835bf8	mov x1,sp
00835bfc	mov x2,sp
00835c00	str x19,[sp]
00835c04	bl 0x0080837c
00835c08	mov x0,x20
00835c0c	mov w1,#0xffffd8ee
00835c10	mov x2,x21
00835c14	bl 0x008ad800
00835c18	ldr x8,[x22, #0x28]
00835c1c	ldr x9,[sp, #0x8]
00835c20	cmp x8,x9
00835c24	b.ne 0x00835c3c
00835c28	ldp x20,x19,[sp, #0x30]
00835c2c	ldp x22,x21,[sp, #0x20]
00835c30	ldp x29,x30,[sp, #0x10]
00835c34	add sp,sp,#0x40
00835c38	ret
00835c3c	bl 0x00c2fec0
