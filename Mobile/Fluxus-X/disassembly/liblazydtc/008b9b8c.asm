; FUN_008b9b8c @ 008b9b8c
008b9b8c	stp x29,x30,[sp, #-0x40]!
008b9b90	str x23,[sp, #0x10]
008b9b94	stp x22,x21,[sp, #0x20]
008b9b98	stp x20,x19,[sp, #0x30]
008b9b9c	mov x29,sp
008b9ba0	adrp x8,0xd1f000
008b9ba4	mov w19,w1
008b9ba8	ldrb w8,[x8, #0xbd8]
008b9bac	cmp w8,#0x1
008b9bb0	b.ne 0x008b9bd8
008b9bb4	ldr x8,[x0, #0x60]
008b9bb8	ldr w2,[x8, #0x28]
008b9bbc	ldr w3,[x8, #0x30]
008b9bc0	mov w1,w19
008b9bc4	ldp x20,x19,[sp, #0x30]
008b9bc8	ldr x23,[sp, #0x10]
008b9bcc	ldp x22,x21,[sp, #0x20]
008b9bd0	ldp x29,x30,[sp], #0x40
008b9bd4	b 0x008b9c98
008b9bd8	tbnz w19,#0x1f,0x008b9c94
008b9bdc	ubfiz x21,x19,#0x3,#0x20
008b9be0	mov w2,wzr
008b9be4	mov x20,x0
008b9be8	mov x1,x21
008b9bec	bl 0x008b7610
008b9bf0	ldr x22,[x20, #0x60]
008b9bf4	mov x23,x20
008b9bf8	mov x20,x0
008b9bfc	cbz w19,0x008b9c10
008b9c00	mov x0,x20
008b9c04	mov w1,wzr
008b9c08	mov x2,x21
008b9c0c	bl 0x00c301c0
008b9c10	ldr w8,[x22, #0x2c]
008b9c14	ldr x1,[x22, #0x38]
008b9c18	mov x0,x23
008b9c1c	cmp w8,#0x1
008b9c20	b.lt 0x008b9c68
008b9c24	mov x9,xzr
008b9c28	sub w10,w19,#0x1
008b9c2c	b 0x008b9c3c
008b9c30	add x9,x9,#0x1
008b9c34	cmp x9,x8
008b9c38	b.eq 0x008b9c68
008b9c3c	ldr x11,[x1, x9, LSL #0x3]
008b9c40	cbz x11,0x008b9c30
008b9c44	ldr w12,[x11, #0x10]
008b9c48	ldr x14,[x11, #0x8]
008b9c4c	and w12,w12,w10
008b9c50	ldr x13,[x20, w12, SXTW #0x3]
008b9c54	str x13,[x11, #0x8]
008b9c58	str x11,[x20, w12, SXTW #0x3]
008b9c5c	mov x11,x14
008b9c60	cbnz x14,0x008b9c44
008b9c64	b 0x008b9c30
008b9c68	sxtw x8,w8
008b9c6c	mov w3,wzr
008b9c70	lsl x2,x8,#0x3
008b9c74	bl 0x008b7a9c
008b9c78	str w19,[x22, #0x2c]
008b9c7c	str x20,[x22, #0x38]
008b9c80	ldp x20,x19,[sp, #0x30]
008b9c84	ldr x23,[sp, #0x10]
008b9c88	ldp x22,x21,[sp, #0x20]
008b9c8c	ldp x29,x30,[sp], #0x40
008b9c90	ret
008b9c94	bl 0x008b75fc
008b9c98	stp x29,x30,[sp, #-0x50]!
008b9c9c	stp x26,x25,[sp, #0x10]
008b9ca0	stp x24,x23,[sp, #0x20]
008b9ca4	stp x22,x21,[sp, #0x30]
008b9ca8	stp x20,x19,[sp, #0x40]
008b9cac	mov x29,sp
008b9cb0	mov x22,x0
008b9cb4	tbnz w1,#0x1f,0x008b9d98
008b9cb8	mov w21,w1
008b9cbc	mov w20,w2
008b9cc0	ldr x25,[x22, #0x60]
008b9cc4	ubfiz x24,x21,#0x3,#0x20
008b9cc8	mov x0,x22
008b9ccc	mov w2,wzr
008b9cd0	mov w19,w3
008b9cd4	mov x1,x24
008b9cd8	bl 0x008b7610
008b9cdc	mov x23,x0
008b9ce0	mov w0,w21
008b9ce4	bl 0x008b91dc
008b9ce8	mov w8,#0x20
008b9cec	sub w26,w8,w0
008b9cf0	cbz w21,0x008b9d04
008b9cf4	mov x0,x23
008b9cf8	mov w1,wzr
008b9cfc	mov x2,x24
008b9d00	bl 0x00c301c0
008b9d04	ldr w8,[x25, #0x2c]
008b9d08	ldr x1,[x25, #0x38]
008b9d0c	cmp w8,#0x1
008b9d10	b.lt 0x008b9d5c
008b9d14	mov x9,xzr
008b9d18	and w10,w26,#0xff
008b9d1c	b 0x008b9d2c
008b9d20	add x9,x9,#0x1
008b9d24	cmp x9,x8
008b9d28	b.eq 0x008b9d5c
008b9d2c	ldr x11,[x1, x9, LSL #0x3]
008b9d30	cbz x11,0x008b9d20
008b9d34	ldr w12,[x11, #0x10]
008b9d38	ldr x14,[x11, #0x8]
008b9d3c	madd w12,w12,w20,w19
008b9d40	lsr w12,w12,w10
008b9d44	ldr x13,[x23, w12, SXTW #0x3]
008b9d48	str x13,[x11, #0x8]
008b9d4c	str x11,[x23, w12, SXTW #0x3]
008b9d50	mov x11,x14
008b9d54	cbnz x14,0x008b9d34
008b9d58	b 0x008b9d20
008b9d5c	sxtw x8,w8
008b9d60	mov x0,x22
008b9d64	mov w3,wzr
008b9d68	lsl x2,x8,#0x3
008b9d6c	bl 0x008b7a9c
008b9d70	str x23,[x25, #0x38]
008b9d74	stp w20,w21,[x25, #0x28]
008b9d78	str w19,[x25, #0x30]
008b9d7c	strb w26,[x25, #0x44]
008b9d80	ldp x20,x19,[sp, #0x40]
008b9d84	ldp x22,x21,[sp, #0x30]
008b9d88	ldp x24,x23,[sp, #0x20]
008b9d8c	ldp x26,x25,[sp, #0x10]
008b9d90	ldp x29,x30,[sp], #0x50
008b9d94	ret
008b9d98	mov x0,x22
008b9d9c	bl 0x008b75fc
