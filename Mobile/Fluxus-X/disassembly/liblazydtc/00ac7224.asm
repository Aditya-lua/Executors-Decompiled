; ossl_property_find_property @ 00ac7224
00ac7224	str x19,[sp, #-0x20]!
00ac7228	mov x19,x0
00ac722c	mov x0,xzr
00ac7230	stp x29,x30,[sp, #0x10]
00ac7234	add x29,sp,#0x10
00ac7238	cbz x19,0x00ac7280
00ac723c	cbz x2,0x00ac7280
00ac7240	mov x0,x1
00ac7244	mov x1,x2
00ac7248	mov w2,wzr
00ac724c	bl 0x00c3f870
00ac7250	stur w0,[x29, #-0x4]
00ac7254	cbz w0,0x00ac727c
00ac7258	ldr w2,[x19], #0x8
00ac725c	adrp x4,0xac7000
00ac7260	add x4,x4,#0x28c
00ac7264	sub x0,x29,#0x4
00ac7268	orr w3,wzr,#0x18
00ac726c	mov x1,x19
00ac7270	mov w5,wzr
00ac7274	bl 0x00c3de50
00ac7278	b 0x00ac7280
00ac727c	mov x0,xzr
00ac7280	ldp x29,x30,[sp, #0x10]
00ac7284	ldr x19,[sp], #0x20
00ac7288	ret
