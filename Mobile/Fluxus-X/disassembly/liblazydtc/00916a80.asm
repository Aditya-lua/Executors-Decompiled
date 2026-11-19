; FUN_00916a80 @ 00916a80
00916a80	ldr x11,[x0]
00916a84	ldr x10,[x11]
00916a88	cbz x10,0x00916ad8
00916a8c	ldr x8,[x0, #0x10]
00916a90	cbz x8,0x00916aa0
00916a94	ldr x8,[x8, #0x10]
00916a98	str x8,[x0, #0x10]
00916a9c	cbnz x8,0x00916acc
00916aa0	ldr x9,[x0, #0x8]
00916aa4	ldr x11,[x11, #0x20]
00916aa8	cmp x9,x11
00916aac	b.cs 0x00916acc
00916ab0	add x10,x10,x9, LSL #0x5
00916ab4	ldr x12,[x10]
00916ab8	cbnz x12,0x00916ae0
00916abc	add x9,x9,#0x1
00916ac0	cmp x9,x11
00916ac4	add x10,x10,#0x20
00916ac8	b.cc 0x00916ab4
00916acc	cbz x8,0x00916ad8
00916ad0	ldr x0,[x8]
00916ad4	ret
00916ad8	mov x0,xzr
00916adc	ret
00916ae0	add x8,x9,#0x1
00916ae4	stp x8,x12,[x0, #0x8]
00916ae8	mov x8,x12
00916aec	ldr x0,[x8]
00916af0	ret
