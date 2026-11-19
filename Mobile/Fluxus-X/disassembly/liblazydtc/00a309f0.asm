; EC_GROUP_dup @ 00a309f0
00a309f0	stp x20,x19,[sp, #-0x20]!
00a309f4	stp x29,x30,[sp, #0x10]
00a309f8	add x29,sp,#0x10
00a309fc	cbz x0,0x00a30a34
00a30a00	mov x20,x0
00a30a04	ldr x0,[x0, #0xa8]
00a30a08	ldr x1,[x20, #0xb0]
00a30a0c	ldr x2,[x20]
00a30a10	bl 0x00a3015c
00a30a14	mov x19,x0
00a30a18	cbz x0,0x00a30a38
00a30a1c	mov x0,x19
00a30a20	mov x1,x20
00a30a24	bl 0x00a3059c
00a30a28	cbnz w0,0x00a30a38
00a30a2c	mov x0,x19
00a30a30	bl 0x00a30360
00a30a34	mov x19,xzr
00a30a38	ldp x29,x30,[sp, #0x10]
00a30a3c	mov x0,x19
00a30a40	ldp x20,x19,[sp], #0x20
00a30a44	ret
