; BN_sub @ 00a08b60
00a08b60	str x25,[sp, #-0x50]!
00a08b64	stp x24,x23,[sp, #0x10]
00a08b68	stp x22,x21,[sp, #0x20]
00a08b6c	stp x20,x19,[sp, #0x30]
00a08b70	stp x29,x30,[sp, #0x40]
00a08b74	ldr w23,[x1, #0x10]
00a08b78	ldr w8,[x2, #0x10]
00a08b7c	mov x20,x2
00a08b80	mov x21,x1
00a08b84	mov x19,x0
00a08b88	cmp w23,w8
00a08b8c	add x29,sp,#0x40
00a08b90	b.ne 0x00a08bc0
00a08b94	mov x0,x21
00a08b98	mov x1,x20
00a08b9c	bl 0x00c369c0
00a08ba0	cmp w0,#0x1
00a08ba4	b.lt 0x00a08c68
00a08ba8	ldr w23,[x21, #0x10]
00a08bac	mov x0,x19
00a08bb0	mov x1,x21
00a08bb4	mov x2,x20
00a08bb8	bl 0x00a08a54
00a08bbc	b 0x00a08c7c
00a08bc0	ldr w8,[x21, #0x8]
00a08bc4	ldr w9,[x20, #0x8]
00a08bc8	mov x0,x19
00a08bcc	cmp w8,w9
00a08bd0	csel x25,x21,x20,lt
00a08bd4	csel x20,x20,x21,lt
00a08bd8	ldr w24,[x20, #0x8]
00a08bdc	ldrsw x21,[x25, #0x8]
00a08be0	add w1,w24,#0x1
00a08be4	bl 0x00c38e80
00a08be8	cbz x0,0x00a08c7c
00a08bec	str w24,[x19, #0x8]
00a08bf0	ldr x22,[x20]
00a08bf4	ldr x20,[x19]
00a08bf8	ldr x2,[x25]
00a08bfc	mov w3,w21
00a08c00	mov x1,x22
00a08c04	mov x0,x20
00a08c08	sub w25,w24,w21
00a08c0c	bl 0x00c388b0
00a08c10	add x8,x20,x21, LSL #0x3
00a08c14	cbz w25,0x00a08c50
00a08c18	sub w11,w24,#0x1
00a08c1c	add x9,x22,x21, LSL #0x3
00a08c20	add x10,x21,#0x1
00a08c24	sub w11,w11,w21
00a08c28	sub w12,w21,w24
00a08c2c	ldr x13,[x9], #0x8
00a08c30	adds x13,x13,x0
00a08c34	str x13,[x8], #0x8
00a08c38	cset w13,eq
00a08c3c	adds w12,w12,#0x1
00a08c40	and x0,x0,x13
00a08c44	b.ne 0x00a08c2c
00a08c48	add x8,x10,w11, UXTW 
00a08c4c	add x8,x20,x8, LSL #0x3
00a08c50	str x0,[x8]
00a08c54	ldr w8,[x19, #0x8]
00a08c58	str wzr,[x19, #0x10]
00a08c5c	add w8,w8,w0
00a08c60	str w8,[x19, #0x8]
00a08c64	b 0x00a08c78
00a08c68	tbnz w0,#0x1f,0x00a08c98
00a08c6c	mov x0,x19
00a08c70	bl 0x00c38e00
00a08c74	mov w23,wzr
00a08c78	mov w0,#0x1
00a08c7c	str w23,[x19, #0x10]
00a08c80	ldp x29,x30,[sp, #0x40]
00a08c84	ldp x20,x19,[sp, #0x30]
00a08c88	ldp x22,x21,[sp, #0x20]
00a08c8c	ldp x24,x23,[sp, #0x10]
00a08c90	ldr x25,[sp], #0x50
00a08c94	ret
00a08c98	ldr w8,[x20, #0x10]
00a08c9c	mov x0,x19
00a08ca0	mov x1,x20
00a08ca4	mov x2,x21
00a08ca8	cmp w8,#0x0
00a08cac	cset w23,eq
00a08cb0	bl 0x00a08a54
00a08cb4	b 0x00a08c7c
