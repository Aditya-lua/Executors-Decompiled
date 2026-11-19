; FUN_00b56e80 @ 00b56e80
00b56e80	cbz x1,0x00b56f6c
00b56e84	stp x29,x30,[sp, #-0x10]!
00b56e88	ldr x8,[x0, #0xf8]
00b56e8c	mov x5,xzr
00b56e90	mov x6,xzr
00b56e94	mov x29,sp
00b56e98	ldrb w9,[x8, #0x63]
00b56e9c	ldrb w10,[x8, #0x62]
00b56ea0	ldrb w11,[x8, #0x61]
00b56ea4	add w9,w9,#0x1
00b56ea8	strb w9,[x8, #0x63]
00b56eac	add w9,w10,w9, LSR #0x8
00b56eb0	ldrb w10,[x8, #0x60]
00b56eb4	strb w9,[x8, #0x62]
00b56eb8	add w9,w11,w9, LSR #0x8
00b56ebc	ldrb w11,[x8, #0x5f]
00b56ec0	strb w9,[x8, #0x61]
00b56ec4	add w9,w10,w9, LSR #0x8
00b56ec8	ldrb w10,[x8, #0x5e]
00b56ecc	strb w9,[x8, #0x60]
00b56ed0	add w9,w11,w9, LSR #0x8
00b56ed4	ldrb w11,[x8, #0x5d]
00b56ed8	strb w9,[x8, #0x5f]
00b56edc	add w9,w10,w9, LSR #0x8
00b56ee0	ldrb w10,[x8, #0x5c]
00b56ee4	strb w9,[x8, #0x5e]
00b56ee8	add w9,w11,w9, LSR #0x8
00b56eec	ldrb w11,[x8, #0x5b]
00b56ef0	strb w9,[x8, #0x5d]
00b56ef4	add w9,w10,w9, LSR #0x8
00b56ef8	ldrb w10,[x8, #0x5a]
00b56efc	strb w9,[x8, #0x5c]
00b56f00	add w9,w11,w9, LSR #0x8
00b56f04	ldrb w11,[x8, #0x59]
00b56f08	strb w9,[x8, #0x5b]
00b56f0c	add w9,w10,w9, LSR #0x8
00b56f10	ldrb w10,[x8, #0x58]
00b56f14	strb w9,[x8, #0x5a]
00b56f18	add w9,w11,w9, LSR #0x8
00b56f1c	ldrb w11,[x8, #0x57]
00b56f20	strb w9,[x8, #0x59]
00b56f24	add w9,w10,w9, LSR #0x8
00b56f28	ldrb w10,[x8, #0x56]
00b56f2c	strb w9,[x8, #0x58]
00b56f30	add w9,w11,w9, LSR #0x8
00b56f34	ldrb w11,[x8, #0x55]
00b56f38	strb w9,[x8, #0x57]
00b56f3c	add w9,w10,w9, LSR #0x8
00b56f40	ldrb w10,[x8, #0x54]
00b56f44	strb w9,[x8, #0x56]
00b56f48	add w9,w11,w9, LSR #0x8
00b56f4c	strb w9,[x8, #0x55]
00b56f50	add w9,w10,w9, LSR #0x8
00b56f54	strb w9,[x8, #0x54]
00b56f58	bl 0x00b57484
00b56f5c	cmp w0,#0x0
00b56f60	cset w0,ne
00b56f64	ldp x29,x30,[sp], #0x10
00b56f68	ret
00b56f6c	mov w0,wzr
00b56f70	ret
