; FUN_00861b90 @ 00861b90
00861b90	sub sp,sp,#0xa0
00861b94	stp x29,x30,[sp, #0x40]
00861b98	stp x28,x27,[sp, #0x50]
00861b9c	stp x26,x25,[sp, #0x60]
00861ba0	stp x24,x23,[sp, #0x70]
00861ba4	stp x22,x21,[sp, #0x80]
00861ba8	stp x20,x19,[sp, #0x90]
00861bac	add x29,sp,#0x40
00861bb0	mrs x25,tpidr_el0
00861bb4	mov x21,x2
00861bb8	mov x20,x0
00861bbc	ldr x8,[x25, #0x28]
00861bc0	mov x19,x1
00861bc4	stur x8,[x29, #-0x8]
00861bc8	ldr w8,[x0, #0x90]
00861bcc	cmp w8,#0x119
00861bd0	b.ne 0x00861bdc
00861bd4	ldr x8,[x20, #0xa8]
00861bd8	str x8,[x21]
00861bdc	adrp x1,0x2b6000
00861be0	add x1,x1,#0xccf
00861be4	mov x0,x20
00861be8	bl 0x00861de4
00861bec	ldr w8,[x20, #0x90]
00861bf0	ldr w26,[x20, #0x124]
00861bf4	mov x24,x0
00861bf8	cmp w8,#0x2e
00861bfc	b.ne 0x00861ccc
00861c00	add x27,sp,#0x18
00861c04	adrp x28,0xd1e000
00861c08	adrp x23,0x2ab000
00861c0c	add x23,x23,#0x33d
00861c10	ldur x8,[x20, #0x94]
00861c14	mov x0,x20
00861c18	stur x8,[x29, #-0x10]
00861c1c	bl 0x00858f2c
00861c20	ldr w8,[x20, #0x90]
00861c24	cmp w8,#0x119
00861c28	b.ne 0x00861c48
00861c2c	ldur q0,[x20, #0x94]
00861c30	ldr x22,[x20, #0xa8]
00861c34	mov x0,x20
00861c38	stur q0,[x27, #0x8]
00861c3c	bl 0x00858f2c
00861c40	ldr x8,[sp, #0x28]
00861c44	b 0x00861c60
00861c48	mov x0,x20
00861c4c	mov x1,x23
00861c50	bl 0x0086e040
00861c54	ldur x8,[x20, #0x94]
00861c58	ldr x22,[x20, #0x138]
00861c5c	stp x8,x8,[sp, #0x20]
00861c60	str x22,[x21]
00861c64	mov w1,#0x50
00861c68	ldur x9,[x24, #0xc]
00861c6c	ldr x0,[x20, #0xe8]
00861c70	stp x8,x22,[sp, #0x10]
00861c74	str x9,[sp, #0x8]
00861c78	bl 0x0084e938
00861c7c	add x1,sp,#0x8
00861c80	add x3,sp,#0x18
00861c84	add x4,x27,#0x8
00861c88	sub x5,x29,#0x10
00861c8c	mov x2,x24
00861c90	mov w6,#0x2e
00861c94	mov w7,wzr
00861c98	mov x22,x0
00861c9c	bl 0x0084eea4
00861ca0	ldr w8,[x20, #0x124]
00861ca4	ldr w9,[x28, #0xba0]
00861ca8	add w8,w8,#0x1
00861cac	cmp w8,w9
00861cb0	str w8,[x20, #0x124]
00861cb4	b.hi 0x00861db8
00861cb8	ldr w8,[x20, #0x90]
00861cbc	mov x24,x22
00861cc0	cmp w8,#0x2e
00861cc4	b.eq 0x00861c10
00861cc8	b 0x00861cd0
00861ccc	mov x22,x24
00861cd0	cmp w8,#0x3a
00861cd4	str w26,[x20, #0x124]
00861cd8	b.ne 0x00861d84
00861cdc	mov x23,x20
00861ce0	mov x0,x20
00861ce4	ldr x8,[x23, #0x94]!
00861ce8	stur x8,[x29, #-0x10]
00861cec	bl 0x00858f2c
00861cf0	ldr w8,[x20, #0x90]
00861cf4	cmp w8,#0x119
00861cf8	b.ne 0x00861d18
00861cfc	ldr q0,[x23]
00861d00	ldr x23,[x20, #0xa8]
00861d04	mov x0,x20
00861d08	stur q0,[sp, #0x20]
00861d0c	bl 0x00858f2c
00861d10	ldr x8,[sp, #0x28]
00861d14	b 0x00861d34
00861d18	adrp x1,0x2b8000
00861d1c	add x1,x1,#0xe31
00861d20	mov x0,x20
00861d24	bl 0x0086e040
00861d28	ldur x8,[x20, #0x94]
00861d2c	ldr x23,[x20, #0x138]
00861d30	stp x8,x8,[sp, #0x20]
00861d34	str x23,[x21]
00861d38	mov w1,#0x50
00861d3c	add x21,sp,#0x18
00861d40	ldur x9,[x22, #0xc]
00861d44	ldr x0,[x20, #0xe8]
00861d48	stp x8,x23,[sp, #0x10]
00861d4c	str x9,[sp, #0x8]
00861d50	bl 0x0084e938
00861d54	add x1,sp,#0x8
00861d58	add x3,sp,#0x18
00861d5c	add x4,x21,#0x8
00861d60	sub x5,x29,#0x10
00861d64	mov x2,x22
00861d68	mov w6,#0x3a
00861d6c	mov w7,wzr
00861d70	mov x20,x0
00861d74	bl 0x0084eea4
00861d78	mov w8,#0x1
00861d7c	mov x22,x20
00861d80	strb w8,[x19]
00861d84	ldr x8,[x25, #0x28]
00861d88	ldur x9,[x29, #-0x8]
00861d8c	cmp x8,x9
00861d90	b.ne 0x00861de0
00861d94	mov x0,x22
00861d98	ldp x20,x19,[sp, #0x90]
00861d9c	ldp x22,x21,[sp, #0x80]
00861da0	ldp x24,x23,[sp, #0x70]
00861da4	ldp x26,x25,[sp, #0x60]
00861da8	ldp x28,x27,[sp, #0x50]
00861dac	ldp x29,x30,[sp, #0x40]
00861db0	add sp,sp,#0xa0
00861db4	ret
00861db8	ldr x8,[x25, #0x28]
00861dbc	ldur x9,[x29, #-0x8]
00861dc0	cmp x8,x9
00861dc4	b.ne 0x00861de0
00861dc8	adrp x1,0x2a1000
00861dcc	add x1,x1,#0x5df
00861dd0	adrp x2,0x2b6000
00861dd4	add x2,x2,#0xccf
00861dd8	add x0,x20,#0x94
00861ddc	bl 0x008578f8
00861de0	bl 0x00c2fec0
