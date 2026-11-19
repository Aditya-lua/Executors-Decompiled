; COMP_CTX_free @ 00a0be7c
00a0be7c	cbz x0,0x00a0bec0
00a0be80	str x19,[sp, #-0x20]!
00a0be84	stp x29,x30,[sp, #0x10]
00a0be88	ldr x8,[x0]
00a0be8c	mov x19,x0
00a0be90	add x29,sp,#0x10
00a0be94	ldr x8,[x8, #0x18]
00a0be98	cbz x8,0x00a0bea4
00a0be9c	mov x0,x19
00a0bea0	blr x8
00a0bea4	ldp x29,x30,[sp, #0x10]
00a0bea8	adrp x1,0x2d9000
00a0beac	add x1,x1,#0x9e3
00a0beb0	orr w2,wzr,#0x38
00a0beb4	mov x0,x19
00a0beb8	ldr x19,[sp], #0x20
00a0bebc	b 0x00c32310
00a0bec0	ret
