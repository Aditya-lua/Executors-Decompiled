; ENGINE_register_all_complete @ 00a50e84
00a50e84	str x19,[sp, #-0x20]!
00a50e88	stp x29,x30,[sp, #0x10]
00a50e8c	add x29,sp,#0x10
00a50e90	bl 0x00c32380
00a50e94	cbz x0,0x00a50efc
00a50e98	mov x19,x0
00a50e9c	ldrb w8,[x19, #0x98]
00a50ea0	tbnz w8,#0x3,0x00a50eec
00a50ea4	mov x0,x19
00a50ea8	bl 0x00c3ba40
00a50eac	mov x0,x19
00a50eb0	bl 0x00c3ba50
00a50eb4	mov x0,x19
00a50eb8	bl 0x00c3ba30
00a50ebc	mov x0,x19
00a50ec0	bl 0x00c3ba00
00a50ec4	mov x0,x19
00a50ec8	bl 0x00c3b9f0
00a50ecc	mov x0,x19
00a50ed0	bl 0x00c3ba10
00a50ed4	mov x0,x19
00a50ed8	bl 0x00c3ba20
00a50edc	mov x0,x19
00a50ee0	bl 0x00c3ba70
00a50ee4	mov x0,x19
00a50ee8	bl 0x00c3ba60
00a50eec	mov x0,x19
00a50ef0	bl 0x00c323a0
00a50ef4	mov x19,x0
00a50ef8	cbnz x0,0x00a50e9c
00a50efc	ldp x29,x30,[sp, #0x10]
00a50f00	mov w0,#0x1
00a50f04	ldr x19,[sp], #0x20
00a50f08	ret
