; FUN_00b6b1c8 @ 00b6b1c8
00b6b1c8	sub sp,sp,#0x30
00b6b1cc	stp x20,x19,[sp, #0x10]
00b6b1d0	stp x29,x30,[sp, #0x20]
00b6b1d4	add x29,sp,#0x20
00b6b1d8	mrs x20,tpidr_el0
00b6b1dc	ldr x8,[x20, #0x28]
00b6b1e0	mov x19,x0
00b6b1e4	str x8,[sp, #0x8]
00b6b1e8	ldr w8,[x0, #0xa8]
00b6b1ec	mov w0,wzr
00b6b1f0	mvn w8,w8
00b6b1f4	tst w8,#0x3
00b6b1f8	b.ne 0x00b6b2c4
00b6b1fc	ldr x9,[x19, #0x30]
00b6b200	cbz x9,0x00b6b20c
00b6b204	ldr x8,[x19, #0x20]
00b6b208	b 0x00b6b224
00b6b20c	ldr w8,[x19, #0x44]
00b6b210	and w8,w8,#0xfffffffe
00b6b214	cmp w8,#0x2
00b6b218	b.ne 0x00b6b2c0
00b6b21c	mov x8,xzr
00b6b220	str xzr,[x19, #0x20]
00b6b224	ldr x10,[x19, #0x28]
00b6b228	ldrb w11,[x19]
00b6b22c	lsl w9,w9,#0x2
00b6b230	ldr w12,[x19, #0x40]
00b6b234	add w9,w9,#0xf8
00b6b238	and w9,w9,#0xf8
00b6b23c	cmp x10,#0x0
00b6b240	orr w9,w11,w9
00b6b244	cset w10,ne
00b6b248	orr w9,w9,w10, LSL #0x6
00b6b24c	sub w10,w12,#0x1
00b6b250	orr w9,w9,w10
00b6b254	strb w9,[x19]
00b6b258	cbz w12,0x00b6b284
00b6b25c	mov w9,wzr
00b6b260	orr w10,wzr,#0xf
00b6b264	sub x11,x10,w9, SXTW 
00b6b268	strb w8,[x19, x11]
00b6b26c	ldr w11,[x19, #0x40]
00b6b270	add w9,w9,#0x1
00b6b274	and w9,w9,#0xff
00b6b278	lsr x8,x8,#0x8
00b6b27c	cmp w11,w9
00b6b280	b.hi 0x00b6b264
00b6b284	cbz x8,0x00b6b294
00b6b288	ldr w8,[x19, #0xa8]
00b6b28c	orr w0,wzr,#0xfffffff3
00b6b290	b 0x00b6b2b4
00b6b294	add x0,x19,#0x48
00b6b298	mov w2,#0x10
00b6b29c	mov x4,sp
00b6b2a0	mov x1,x19
00b6b2a4	mov x3,x19
00b6b2a8	bl 0x00c42180
00b6b2ac	cbz w0,0x00b6b2c4
00b6b2b0	ldr w8,[x19, #0xa8]
00b6b2b4	orr w8,w8,#0x10
00b6b2b8	str w8,[x19, #0xa8]
00b6b2bc	b 0x00b6b2c4
00b6b2c0	orr w0,wzr,#0xfffffff3
00b6b2c4	ldr x8,[x20, #0x28]
00b6b2c8	ldr x9,[sp, #0x8]
00b6b2cc	cmp x8,x9
00b6b2d0	b.ne 0x00b6b2e4
00b6b2d4	ldp x29,x30,[sp, #0x20]
00b6b2d8	ldp x20,x19,[sp, #0x10]
00b6b2dc	add sp,sp,#0x30
00b6b2e0	ret
00b6b2e4	bl 0x00c2fec0
