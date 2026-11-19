; mbedtls_cipher_set_iv @ 00b69cc4
00b69cc4	stp x22,x21,[sp, #-0x30]!
00b69cc8	stp x20,x19,[sp, #0x10]
00b69ccc	stp x29,x30,[sp, #0x20]
00b69cd0	add x29,sp,#0x20
00b69cd4	ldr x8,[x0]
00b69cd8	mov x21,x2
00b69cdc	mov x20,x0
00b69ce0	mov x19,x1
00b69ce4	cbz x8,0x00b69d60
00b69ce8	cmp x21,#0x10
00b69cec	b.ls 0x00b69cf8
00b69cf0	mov w0,#0xffff9f80
00b69cf4	b 0x00b69d64
00b69cf8	ldr w8,[x8, #0x8]
00b69cfc	mov x22,x21
00b69d00	tbnz w8,#0x18,0x00b69d14
00b69d04	lsr w9,w8,#0x3
00b69d08	and w22,w9,#0x1c
00b69d0c	cmp x22,x21
00b69d10	b.hi 0x00b69d60
00b69d14	and w9,w8,#0xff0000
00b69d18	cmp w9,#0x4c0, LSL #12
00b69d1c	b.ne 0x00b69d48
00b69d20	cmp x21,#0xc
00b69d24	b.ne 0x00b69d60
00b69d28	ldr x0,[x20, #0x50]
00b69d2c	mov x1,x19
00b69d30	mov w2,wzr
00b69d34	bl 0x00c420a0
00b69d38	cbnz w0,0x00b69d60
00b69d3c	ldr x8,[x20]
00b69d40	ldr w8,[x8, #0x8]
00b69d44	b 0x00b69d74
00b69d48	cmp x21,#0xc
00b69d4c	b.eq 0x00b69d74
00b69d50	mov w10,#0x4c0000
00b69d54	add w10,w10,#0x10, LSL #12
00b69d58	cmp w9,w10
00b69d5c	b.ne 0x00b69d74
00b69d60	mov w0,#0xffff9f00
00b69d64	ldp x29,x30,[sp, #0x20]
00b69d68	ldp x20,x19,[sp, #0x10]
00b69d6c	ldp x22,x21,[sp], #0x30
00b69d70	ret
00b69d74	ubfx w8,w8,#0xc,#0x4
00b69d78	cmp w8,#0x9
00b69d7c	b.eq 0x00b69da8
00b69d80	cmp w8,#0x6
00b69d84	b.ne 0x00b69dd8
00b69d88	ldr x0,[x20, #0x50]
00b69d8c	ldr w1,[x20, #0xc]
00b69d90	mov x2,x19
00b69d94	ldp x29,x30,[sp, #0x20]
00b69d98	ldp x20,x19,[sp, #0x10]
00b69d9c	mov x3,x21
00b69da0	ldp x22,x21,[sp], #0x30
00b69da4	b 0x00c421d0
00b69da8	ldr x0,[x20, #0x50]
00b69dac	mov x1,xzr
00b69db0	mov x2,xzr
00b69db4	mov x3,xzr
00b69db8	bl 0x00c42020
00b69dbc	cbnz w0,0x00b69d64
00b69dc0	ldr w8,[x20, #0xc]
00b69dc4	cbz w8,0x00b69e00
00b69dc8	cmp w8,#0x1
00b69dcc	b.ne 0x00b69d60
00b69dd0	orr w1,wzr,#0x3
00b69dd4	b 0x00b69e04
00b69dd8	cbz x22,0x00b69df8
00b69ddc	add x0,x20,#0x38
00b69de0	mov x1,x19
00b69de4	mov x2,x22
00b69de8	bl 0x00c2ffd0
00b69dec	mov w0,wzr
00b69df0	str x22,[x20, #0x48]
00b69df4	b 0x00b69d64
00b69df8	mov w0,wzr
00b69dfc	b 0x00b69d64
00b69e00	mov w1,#0x2
00b69e04	ldr x0,[x20, #0x50]
00b69e08	mov x2,x19
00b69e0c	ldp x29,x30,[sp, #0x20]
00b69e10	ldp x20,x19,[sp, #0x10]
00b69e14	mov x3,x21
00b69e18	ldp x22,x21,[sp], #0x30
00b69e1c	b 0x00c42040
