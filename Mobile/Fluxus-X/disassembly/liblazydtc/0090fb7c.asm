; FUN_0090fb7c @ 0090fb7c
0090fb7c	str x19,[sp, #-0x20]!
0090fb80	stp x29,x30,[sp, #0x10]
0090fb84	add x29,sp,#0x10
0090fb88	mov x19,x0
0090fb8c	cbz x0,0x0090fb9c
0090fb90	mov x0,x19
0090fb94	bl 0x00916838
0090fb98	str xzr,[x19, #0x88]
0090fb9c	ldp x29,x30,[sp, #0x10]
0090fba0	ldr x19,[sp], #0x20
0090fba4	ret
