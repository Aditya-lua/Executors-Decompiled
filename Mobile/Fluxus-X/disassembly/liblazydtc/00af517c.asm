; GENERAL_NAME_set0_othername @ 00af517c
00af517c	stp x22,x21,[sp, #-0x30]!
00af5180	stp x20,x19,[sp, #0x10]
00af5184	mov x19,x0
00af5188	adrp x0,0xc7e000
00af518c	add x0,x0,#0x288
00af5190	stp x29,x30,[sp, #0x20]
00af5194	add x29,sp,#0x20
00af5198	mov x20,x2
00af519c	mov x21,x1
00af51a0	bl 0x00c372e0
00af51a4	cbz x0,0x00af51c4
00af51a8	mov x22,x0
00af51ac	ldr x0,[x0, #0x8]
00af51b0	bl 0x00c37cc0
00af51b4	mov w0,#0x1
00af51b8	stp x21,x20,[x22]
00af51bc	str x22,[x19, #0x8]
00af51c0	str wzr,[x19]
00af51c4	ldp x29,x30,[sp, #0x20]
00af51c8	ldp x20,x19,[sp, #0x10]
00af51cc	ldp x22,x21,[sp], #0x30
00af51d0	ret
