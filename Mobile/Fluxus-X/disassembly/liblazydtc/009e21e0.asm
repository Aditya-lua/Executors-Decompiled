; dtls1_get_message_header @ 009e21e0
009e21e0	stp x20,x19,[sp, #-0x20]!
009e21e4	mov x19,x1
009e21e8	mov x20,x0
009e21ec	mov w2,#0x58
009e21f0	mov x0,x1
009e21f4	mov w1,wzr
009e21f8	stp x29,x30,[sp, #0x10]
009e21fc	add x29,sp,#0x10
009e2200	bl 0x00c301c0
009e2204	ldrb w8,[x20]
009e2208	strb w8,[x19]
009e220c	ldrb w8,[x20, #0x1]
009e2210	ldrb w9,[x20, #0x2]
009e2214	ldrb w10,[x20, #0x3]
009e2218	lsl x8,x8,#0x10
009e221c	bfm x8,x9,#0x38,#0x7
009e2220	orr x8,x8,x10
009e2224	str x8,[x19, #0x8]
009e2228	ldrh w8,[x20, #0x4]
009e222c	rev w8,w8
009e2230	lsr w8,w8,#0x10
009e2234	strh w8,[x19, #0x10]
009e2238	ldrb w8,[x20, #0x6]
009e223c	ldrb w9,[x20, #0x7]
009e2240	ldrb w10,[x20, #0x8]
009e2244	lsl x8,x8,#0x10
009e2248	bfm x8,x9,#0x38,#0x7
009e224c	orr x8,x8,x10
009e2250	str x8,[x19, #0x18]
009e2254	ldrb w8,[x20, #0x9]
009e2258	ldrb w9,[x20, #0xa]
009e225c	ldrb w10,[x20, #0xb]
009e2260	lsl x8,x8,#0x10
009e2264	bfm x8,x9,#0x38,#0x7
009e2268	orr x8,x8,x10
009e226c	str x8,[x19, #0x20]
009e2270	ldp x29,x30,[sp, #0x10]
009e2274	ldp x20,x19,[sp], #0x20
009e2278	ret
