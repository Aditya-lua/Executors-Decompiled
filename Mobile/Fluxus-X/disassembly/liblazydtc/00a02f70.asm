; bn_correct_top_consttime @ 00a02f70
00a02f70	sub sp,sp,#0x10
00a02f74	ldrsw x8,[x0, #0xc]
00a02f78	cmp w8,#0x0
00a02f7c	b.le 0x00a02fdc
00a02f80	ldr w12,[x0, #0x8]
00a02f84	ldr x11,[x0]
00a02f88	mov x10,xzr
00a02f8c	mov w9,wzr
00a02f90	neg w12,w12
00a02f94	ldr x13,[x11, x10, LSL #0x3]
00a02f98	neg x14,x13
00a02f9c	orr x13,x13,x14
00a02fa0	add w14,w12,w10
00a02fa4	asr x13,x13,#0x3f
00a02fa8	and w13,w13,w14, ASR #0x1f
00a02fac	str w13,[sp, #0xc]
00a02fb0	mvn w13,w13
00a02fb4	ldr w14,[sp, #0xc]
00a02fb8	str w13,[sp, #0xc]
00a02fbc	ldr w13,[sp, #0xc]
00a02fc0	add x10,x10,#0x1
00a02fc4	and w14,w14,w10
00a02fc8	cmp x10,x8
00a02fcc	and w9,w13,w9
00a02fd0	orr w9,w9,w14
00a02fd4	b.lt 0x00a02f94
00a02fd8	b 0x00a02fe0
00a02fdc	mov w9,wzr
00a02fe0	sub w8,w9,#0x1
00a02fe4	bic w8,w8,w9
00a02fe8	asr w8,w8,#0x1f
00a02fec	str w9,[x0, #0x8]
00a02ff0	ldr w10,[x0, #0x10]
00a02ff4	str w8,[sp, #0xc]
00a02ff8	mvn w8,w8
00a02ffc	ldr w9,[sp, #0xc]
00a03000	str w8,[sp, #0xc]
00a03004	ldr w8,[sp, #0xc]
00a03008	and w8,w8,w10
00a0300c	str w8,[x0, #0x10]
00a03010	add sp,sp,#0x10
00a03014	ret
