; FUN_0093f07c @ 0093f07c
0093f07c	stp x20,x19,[sp, #-0x20]!
0093f080	stp x29,x30,[sp, #0x10]
0093f084	add x29,sp,#0x10
0093f088	mov x19,x0
0093f08c	bl 0x00c31fa0
0093f090	str x0,[x19]
0093f094	cbz x0,0x0093f0cc
0093f098	mov x20,x0
0093f09c	bl 0x00c31fb0
0093f0a0	mov x1,x0
0093f0a4	mov x0,x20
0093f0a8	mov x2,xzr
0093f0ac	bl 0x00c31f70
0093f0b0	mov w8,w0
0093f0b4	mov w0,wzr
0093f0b8	cbnz w8,0x0093f0d0
0093f0bc	ldr x0,[x19]
0093f0c0	bl 0x00c31f90
0093f0c4	mov w0,#0x2
0093f0c8	b 0x0093f0d0
0093f0cc	mov w0,#0x1b
0093f0d0	ldp x29,x30,[sp, #0x10]
0093f0d4	ldp x20,x19,[sp], #0x20
0093f0d8	ret
