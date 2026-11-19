; FUN_0087e29c @ 0087e29c
0087e29c	ldr x8,[x0, #0x28]
0087e2a0	cbz x8,0x0087e310
0087e2a4	lsr x8,x1,#0x4
0087e2a8	mov x9,#0x7c15
0087e2ac	movk x9,#0x7f4a, LSL #16
0087e2b0	eor x8,x8,x1, LSR #0x9
0087e2b4	movk x9,#0x79b9, LSL #32
0087e2b8	movk x9,#0x9e37, LSL #48
0087e2bc	mul x8,x8,x9
0087e2c0	ldrb w9,[x0, #0x30]
0087e2c4	lsr x8,x8,x9
0087e2c8	ldr x9,[x0, #0x18]
0087e2cc	lsr x10,x8,#0x6
0087e2d0	ldr x10,[x9, x10, LSL #0x3]
0087e2d4	lsr x10,x10,x8
0087e2d8	tbz w10,#0x0,0x0087e310
0087e2dc	ldr x11,[x0, #0x20]
0087e2e0	ldr x10,[x0]
0087e2e4	sub x11,x11,#0x1
0087e2e8	lsl x12,x8,#0x4
0087e2ec	ldr x12,[x10, x12#0x0]
0087e2f0	cmp x12,x1
0087e2f4	b.eq 0x0087e318
0087e2f8	add x8,x8,#0x1
0087e2fc	and x8,x8,x11
0087e300	lsr x12,x8,#0x6
0087e304	ldr x12,[x9, x12, LSL #0x3]
0087e308	lsr x12,x12,x8
0087e30c	tbnz w12,#0x0,0x0087e2e8
0087e310	mov w0,wzr
0087e314	ret
0087e318	add x8,x10,x8, LSL #0x4
0087e31c	ldr w0,[x8, #0x8]
0087e320	ret
