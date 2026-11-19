; SSL_get_shared_ciphers @ 009b5c6c
009b5c6c	str x27,[sp, #-0x60]!
009b5c70	stp x26,x25,[sp, #0x10]
009b5c74	stp x24,x23,[sp, #0x20]
009b5c78	stp x22,x21,[sp, #0x30]
009b5c7c	stp x20,x19,[sp, #0x40]
009b5c80	stp x29,x30,[sp, #0x50]
009b5c84	ldr w8,[x0, #0x38]
009b5c88	mov w20,w2
009b5c8c	add x29,sp,#0x50
009b5c90	cbz w8,0x009b5d74
009b5c94	cmp w20,#0x2
009b5c98	b.lt 0x009b5d74
009b5c9c	ldr x21,[x0, #0x520]
009b5ca0	mov x19,x1
009b5ca4	mov x1,xzr
009b5ca8	cbz x21,0x009b5d78
009b5cac	ldr x22,[x0, #0x528]
009b5cb0	cbz x22,0x009b5d64
009b5cb4	mov x0,x21
009b5cb8	bl 0x00c325e0
009b5cbc	cbz w0,0x009b5d74
009b5cc0	mov x0,x22
009b5cc4	bl 0x00c325e0
009b5cc8	cbz w0,0x009b5d74
009b5ccc	mov x0,x21
009b5cd0	bl 0x00c325e0
009b5cd4	cmp w0,#0x1
009b5cd8	mov x23,x19
009b5cdc	b.lt 0x009b5d5c
009b5ce0	mov w24,wzr
009b5ce4	mov w27,#0x3a
009b5ce8	mov x23,x19
009b5cec	mov x0,x21
009b5cf0	mov w1,w24
009b5cf4	bl 0x00c32610
009b5cf8	mov x25,x0
009b5cfc	mov x0,x22
009b5d00	mov x1,x25
009b5d04	bl 0x00c34760
009b5d08	tbnz w0,#0x1f,0x009b5d48
009b5d0c	ldr x0,[x25, #0x8]
009b5d10	sxtw x1,w20
009b5d14	bl 0x00c358a0
009b5d18	mov x26,x0
009b5d1c	cmp w20,w26
009b5d20	b.le 0x009b5d98
009b5d24	ldr x1,[x25, #0x8]
009b5d28	sxtw x25,w26
009b5d2c	mov x0,x23
009b5d30	mov x2,x25
009b5d34	bl 0x00c2ffd0
009b5d38	add x23,x23,x25
009b5d3c	sub w8,w20,#0x1
009b5d40	strb w27,[x23], #0x1
009b5d44	sub w20,w8,w26
009b5d48	mov x0,x21
009b5d4c	add w24,w24,#0x1
009b5d50	bl 0x00c325e0
009b5d54	cmp w24,w0
009b5d58	b.lt 0x009b5cec
009b5d5c	sturb wzr,[x23, #-0x1]
009b5d60	b 0x009b5da8
009b5d64	ldr x8,[x0, #0x9a8]
009b5d68	cbz x8,0x009b5d74
009b5d6c	ldr x22,[x8, #0x10]
009b5d70	cbnz x22,0x009b5cb4
009b5d74	mov x1,xzr
009b5d78	ldp x29,x30,[sp, #0x50]
009b5d7c	ldp x20,x19,[sp, #0x40]
009b5d80	ldp x22,x21,[sp, #0x30]
009b5d84	ldp x24,x23,[sp, #0x20]
009b5d88	ldp x26,x25,[sp, #0x10]
009b5d8c	mov x0,x1
009b5d90	ldr x27,[sp], #0x60
009b5d94	ret
009b5d98	sub x8,x23,#0x1
009b5d9c	cmp x23,x19
009b5da0	csel x8,x23,x8,eq
009b5da4	strb wzr,[x8]
009b5da8	mov x1,x19
009b5dac	b 0x009b5d78
