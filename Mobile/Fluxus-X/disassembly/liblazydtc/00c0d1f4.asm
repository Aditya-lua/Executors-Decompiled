; std::__ndk1::__get_collation_name @ 00c0d1f4
00c0d1f4	paciasp
00c0d1f8	stp x29,x30,[sp, #-0x40]!
00c0d1fc	stp x24,x23,[sp, #0x10]
00c0d200	stp x22,x21,[sp, #0x20]
00c0d204	stp x20,x19,[sp, #0x30]
00c0d208	mov x29,sp
00c0d20c	mov x20,x0
00c0d210	mov x19,x8
00c0d214	mov w22,#0x6f
00c0d218	nop
00c0d21c	adr x21,0xcafc48
00c0d220	lsr x23,x22,#0x1
00c0d224	mov x1,x20
00c0d228	add x24,x21,x23, LSL #0x4
00c0d22c	ldr x0,[x24], #0x10
00c0d230	bl 0x00c301f0
00c0d234	mvn x8,x23
00c0d238	cmp w0,#0x0
00c0d23c	add x8,x22,x8
00c0d240	csel x21,x24,x21,lt
00c0d244	csel x22,x8,x23,lt
00c0d248	cbnz x22,0x00c0d220
00c0d24c	adrp x8,0xcb0000
00c0d250	add x8,x8,#0x338
00c0d254	stp xzr,xzr,[x19]
00c0d258	cmp x21,x8
00c0d25c	str xzr,[x19, #0x10]
00c0d260	b.eq 0x00c0d284
00c0d264	ldr x1,[x21]
00c0d268	mov x0,x20
00c0d26c	bl 0x00c301f0
00c0d270	cbnz w0,0x00c0d284
00c0d274	ldrb w8,[x21, #0x8]
00c0d278	mov w9,#0x2
00c0d27c	strb w9,[x19]
00c0d280	strb w8,[x19, #0x1]
00c0d284	ldp x20,x19,[sp, #0x30]
00c0d288	ldp x22,x21,[sp, #0x20]
00c0d28c	ldp x24,x23,[sp, #0x10]
00c0d290	ldp x29,x30,[sp], #0x40
00c0d294	autiasp
00c0d298	ret
