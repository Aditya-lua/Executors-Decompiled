; WHIRLPOOL_Update @ 00af01dc
00af01dc	str x27,[sp, #-0x60]!
00af01e0	stp x22,x21,[sp, #0x30]
00af01e4	stp x20,x19,[sp, #0x40]
00af01e8	mov x20,x2
00af01ec	mov x19,x1
00af01f0	lsr x8,x2,#0x3c
00af01f4	mov x21,x0
00af01f8	stp x26,x25,[sp, #0x10]
00af01fc	stp x24,x23,[sp, #0x20]
00af0200	stp x29,x30,[sp, #0x50]
00af0204	add x29,sp,#0x50
00af0208	cbz x8,0x00af024c
00af020c	orr x24,xzr,#-0x1000000000000000
00af0210	add x23,x20,x24
00af0214	and x25,x23,#-0x1000000000000000
00af0218	orr x27,xzr,#0x1000000000000000
00af021c	add x26,x25,x27
00af0220	mov x22,x19
00af0224	orr x2,xzr,#-0x8000000000000000
00af0228	mov x0,x21
00af022c	mov x1,x22
00af0230	bl 0x00af0280
00af0234	add x20,x20,x24
00af0238	lsr x8,x20,#0x3c
00af023c	add x22,x22,x27
00af0240	cbnz x8,0x00af0224
00af0244	sub x20,x23,x25
00af0248	add x19,x19,x26
00af024c	cbz x20,0x00af0260
00af0250	lsl x2,x20,#0x3
00af0254	mov x0,x21
00af0258	mov x1,x19
00af025c	bl 0x00af0280
00af0260	ldp x29,x30,[sp, #0x50]
00af0264	ldp x20,x19,[sp, #0x40]
00af0268	ldp x22,x21,[sp, #0x30]
00af026c	ldp x24,x23,[sp, #0x20]
00af0270	ldp x26,x25,[sp, #0x10]
00af0274	mov w0,#0x1
00af0278	ldr x27,[sp], #0x60
00af027c	ret
