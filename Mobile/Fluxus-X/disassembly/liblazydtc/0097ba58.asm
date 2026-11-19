; ix::makeCancellationRequestWithTimeout @ 0097ba58
0097ba58	str x21,[sp, #-0x30]!
0097ba5c	stp x20,x19,[sp, #0x10]
0097ba60	stp x29,x30,[sp, #0x20]
0097ba64	add x29,sp,#0x20
0097ba68	mov x19,x1
0097ba6c	mov w20,w0
0097ba70	mov x21,x8
0097ba74	bl 0x00c31910
0097ba78	adrp x9,0xc51000
0097ba7c	add x9,x9,#0x960
0097ba80	add x9,x9,#0x10
0097ba84	sxtw x8,w20
0097ba88	stp x9,x19,[x21]
0097ba8c	ldp x29,x30,[sp, #0x20]
0097ba90	ldp x20,x19,[sp, #0x10]
0097ba94	stp x0,x8,[x21, #0x10]
0097ba98	str x21,[x21, #0x20]
0097ba9c	ldr x21,[sp], #0x30
0097baa0	ret
