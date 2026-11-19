; FUN_00b4fe4c @ 00b4fe4c
00b4fe4c	str x21,[sp, #-0x30]!
00b4fe50	stp x20,x19,[sp, #0x10]
00b4fe54	stp x29,x30,[sp, #0x20]
00b4fe58	add x29,sp,#0x20
00b4fe5c	cbz x0,0x00b4ff18
00b4fe60	mov x19,x2
00b4fe64	mov x20,x1
00b4fe68	mov x21,x0
00b4fe6c	bl 0x00c3a7f0
00b4fe70	bl 0x00c3ad60
00b4fe74	cbz x0,0x00b4fe94
00b4fe78	adrp x2,0x2cb000
00b4fe7c	mov x3,x0
00b4fe80	add x2,x2,#0x7b8
00b4fe84	mov x0,x20
00b4fe88	mov x1,x19
00b4fe8c	bl 0x00c3add0
00b4fe90	cbz w0,0x00b4ff18
00b4fe94	mov x0,x21
00b4fe98	bl 0x00c3a810
00b4fe9c	and w0,w0,#0x6000
00b4fea0	bl 0x00c3abe0
00b4fea4	cbz x0,0x00b4fec4
00b4fea8	adrp x2,0x2bf000
00b4feac	mov x3,x0
00b4feb0	add x2,x2,#0xb68
00b4feb4	mov x0,x20
00b4feb8	mov x1,x19
00b4febc	bl 0x00c3add0
00b4fec0	cbz w0,0x00b4ff18
00b4fec4	mov x0,x21
00b4fec8	bl 0x00c3a800
00b4fecc	tbz w0,#0x1,0x00b4feec
00b4fed0	adrp x2,0x2bd000
00b4fed4	add x2,x2,#0x8e5
00b4fed8	mov x0,x20
00b4fedc	mov x1,x19
00b4fee0	mov w3,wzr
00b4fee4	bl 0x00c3adb0
00b4fee8	cbz w0,0x00b4ff18
00b4feec	mov x0,x21
00b4fef0	bl 0x00c3a810
00b4fef4	ubfx w3,w0,#0xc,#0x1
00b4fef8	mov x0,x20
00b4fefc	mov x1,x19
00b4ff00	ldp x29,x30,[sp, #0x20]
00b4ff04	ldp x20,x19,[sp, #0x10]
00b4ff08	adrp x2,0x2ab000
00b4ff0c	add x2,x2,#0xf0e
00b4ff10	ldr x21,[sp], #0x30
00b4ff14	b 0x00c3adb0
00b4ff18	ldp x29,x30,[sp, #0x20]
00b4ff1c	ldp x20,x19,[sp, #0x10]
00b4ff20	mov w0,wzr
00b4ff24	ldr x21,[sp], #0x30
00b4ff28	ret
