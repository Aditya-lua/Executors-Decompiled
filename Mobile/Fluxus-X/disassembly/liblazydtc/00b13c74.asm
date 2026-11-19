; ossl_policy_node_match @ 00b13c74
00b13c74	str x21,[sp, #-0x30]!
00b13c78	stp x20,x19,[sp, #0x10]
00b13c7c	stp x29,x30,[sp, #0x20]
00b13c80	ldrb w8,[x0, #0x19]
00b13c84	ldr x21,[x1]
00b13c88	mov x19,x2
00b13c8c	add x29,sp,#0x20
00b13c90	tbnz w8,#0x2,0x00b13ce8
00b13c94	ldrb w8,[x21]
00b13c98	tst w8,#0x3
00b13c9c	b.eq 0x00b13ce8
00b13ca0	ldr x0,[x21, #0x18]
00b13ca4	bl 0x00c325e0
00b13ca8	cmp w0,#0x1
00b13cac	b.lt 0x00b13ce0
00b13cb0	mov w20,wzr
00b13cb4	ldr x0,[x21, #0x18]
00b13cb8	mov w1,w20
00b13cbc	bl 0x00c32610
00b13cc0	mov x1,x19
00b13cc4	bl 0x00c37ab0
00b13cc8	cbz w0,0x00b13d0c
00b13ccc	ldr x0,[x21, #0x18]
00b13cd0	add w20,w20,#0x1
00b13cd4	bl 0x00c325e0
00b13cd8	cmp w20,w0
00b13cdc	b.lt 0x00b13cb4
00b13ce0	mov w0,wzr
00b13ce4	b 0x00b13cfc
00b13ce8	ldr x0,[x21, #0x8]
00b13cec	mov x1,x19
00b13cf0	bl 0x00c37ab0
00b13cf4	cmp w0,#0x0
00b13cf8	cset w0,eq
00b13cfc	ldp x29,x30,[sp, #0x20]
00b13d00	ldp x20,x19,[sp, #0x10]
00b13d04	ldr x21,[sp], #0x30
00b13d08	ret
00b13d0c	mov w0,#0x1
00b13d10	b 0x00b13cfc
