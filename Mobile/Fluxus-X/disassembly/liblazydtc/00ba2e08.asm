; psa_free_key_slot @ 00ba2e08
00ba2e08	mov x8,x0
00ba2e0c	cmp x0,#0x16
00ba2e10	mov w0,wzr
00ba2e14	b.eq 0x00ba2ea4
00ba2e18	cmp x8,#0x15
00ba2e1c	b.ls 0x00ba2e28
00ba2e20	mov w0,#0xffffff69
00ba2e24	ret
00ba2e28	adrp x9,0xd26000
00ba2e2c	add x9,x9,#0x28
00ba2e30	ldr x10,[x9, x8, LSL #0x3]
00ba2e34	mov w0,#0xffffff69
00ba2e38	cmp x10,x1
00ba2e3c	b.hi 0x00ba2ea4
00ba2e40	and x9,x8,#0xffffffff
00ba2e44	mov w11,#0x10
00ba2e48	lsl w9,w11,w9
00ba2e4c	orr w11,wzr,#0x38
00ba2e50	umaddl x11,w9,w11,x10
00ba2e54	cmp x11,x1
00ba2e58	b.ls 0x00ba2ea4
00ba2e5c	adrp x12,0xd26000
00ba2e60	lsl x8,x8,#0x3
00ba2e64	add x12,x12,#0xe0
00ba2e68	mov x11,#0x6db7
00ba2e6c	ldr x13,[x12, x8#0x0]
00ba2e70	movk x11,#0xb6db, LSL #16
00ba2e74	sub x10,x1,x10
00ba2e78	movk x11,#0xdb6d, LSL #32
00ba2e7c	movk x11,#0x6db6, LSL #48
00ba2e80	asr x10,x10,#0x3
00ba2e84	mul x10,x10,x11
00ba2e88	cmp x13,x9
00ba2e8c	str x10,[x12, x8#0x0]
00ba2e90	csel w8,w13,w9,cc
00ba2e94	mvn w9,w10
00ba2e98	mov w0,wzr
00ba2e9c	add w8,w9,w8
00ba2ea0	str w8,[x1, #0x20]
00ba2ea4	ret
