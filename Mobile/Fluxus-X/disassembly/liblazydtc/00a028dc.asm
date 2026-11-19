; BN_mask_bits @ 00a028dc
00a028dc	tbnz w1,#0x1f,0x00a02928
00a028e0	ldr w8,[x0, #0x8]
00a028e4	lsr w9,w1,#0x6
00a028e8	cmp w9,w8
00a028ec	mov w8,wzr
00a028f0	b.ge 0x00a0296c
00a028f4	and w8,w1,#0x3f
00a028f8	cbz w8,0x00a02930
00a028fc	ldr x10,[x0]
00a02900	mov w11,w9
00a02904	add w9,w9,#0x1
00a02908	str w9,[x0, #0x8]
00a0290c	lsl x11,x11,#0x3
00a02910	ldr x12,[x10, x11#0x0]
00a02914	mov x13,#-0x1
00a02918	lsl x8,x13,x8
00a0291c	bic x8,x12,x8
00a02920	str x8,[x10, x11#0x0]
00a02924	b 0x00a02938
00a02928	mov w0,wzr
00a0292c	ret
00a02930	str w9,[x0, #0x8]
00a02934	cbz w9,0x00a02964
00a02938	ldr x10,[x0]
00a0293c	sxtw x8,w9
00a02940	add x9,x10,x8, LSL #0x3
00a02944	ldur x9,[x9, #-0x8]
00a02948	cbnz x9,0x00a0295c
00a0294c	sub x8,x8,#0x1
00a02950	add w9,w8,#0x1
00a02954	cmp w9,#0x1
00a02958	b.gt 0x00a02940
00a0295c	str w8,[x0, #0x8]
00a02960	cbnz w8,0x00a02968
00a02964	str wzr,[x0, #0x10]
00a02968	mov w8,#0x1
00a0296c	mov w0,w8
00a02970	ret
