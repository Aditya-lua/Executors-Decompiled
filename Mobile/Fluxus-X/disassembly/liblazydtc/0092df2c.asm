; curl_multi_info_read @ 0092df2c
0092df2c	str x21,[sp, #-0x30]!
0092df30	stp x20,x19,[sp, #0x10]
0092df34	stp x29,x30,[sp, #0x20]
0092df38	add x29,sp,#0x20
0092df3c	mov x19,x1
0092df40	str wzr,[x1]
0092df44	cbz x0,0x0092dfa8
0092df48	ldr w8,[x0]
0092df4c	mov w9,#0xab1e
0092df50	movk w9,#0xb, LSL #16
0092df54	cmp w8,w9
0092df58	mov x8,xzr
0092df5c	b.ne 0x0092dfac
0092df60	ldrb w9,[x0, #0x231]
0092df64	mov x8,xzr
0092df68	tbnz w9,#0x2,0x0092dfac
0092df6c	add x20,x0,#0x20
0092df70	mov x0,x20
0092df74	bl 0x00925eb0
0092df78	cbz x0,0x0092dfa8
0092df7c	ldr x1,[x20]
0092df80	mov x0,x20
0092df84	mov x2,xzr
0092df88	ldr x21,[x1]
0092df8c	bl 0x00925d80
0092df90	mov x0,x20
0092df94	bl 0x00925eb0
0092df98	bl 0x00963a5c
0092df9c	add x8,x21,#0x18
0092dfa0	str w0,[x19]
0092dfa4	b 0x0092dfac
0092dfa8	mov x8,xzr
0092dfac	ldp x29,x30,[sp, #0x20]
0092dfb0	ldp x20,x19,[sp, #0x10]
0092dfb4	mov x0,x8
0092dfb8	ldr x21,[sp], #0x30
0092dfbc	ret
