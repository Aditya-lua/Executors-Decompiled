; FUN_00b1c534 @ 00b1c534
00b1c534	stp x29,x30,[sp, #-0x10]!
00b1c538	ldr x1,[x1]
00b1c53c	ldr x3,[x4, #0x8]
00b1c540	mov x29,sp
00b1c544	bl 0x00c32bd0
00b1c548	cmp w0,#0x1
00b1c54c	mov w8,#0x2
00b1c550	csel w0,wzr,w8,lt
00b1c554	ldp x29,x30,[sp], #0x10
00b1c558	ret
