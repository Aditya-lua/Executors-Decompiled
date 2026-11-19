; FUN_00a87bc0 @ 00a87bc0
00a87bc0	stp x20,x19,[sp, #-0x20]!
00a87bc4	stp x29,x30,[sp, #0x10]
00a87bc8	add x29,sp,#0x10
00a87bcc	mov x19,x0
00a87bd0	bl 0x00c3cea0
00a87bd4	cbz x0,0x00a87c0c
00a87bd8	mov x20,x0
00a87bdc	add x0,x0,#0x100
00a87be0	mov w1,#0x1b8
00a87be4	bl 0x00c34750
00a87be8	ldr x0,[x20, #0x2b8]
00a87bec	add x8,x19,#0x28
00a87bf0	cmp x0,x8
00a87bf4	b.eq 0x00a87c08
00a87bf8	adrp x1,0x2b2000
00a87bfc	add x1,x1,#0x2f8
00a87c00	mov w2,#0x9fe
00a87c04	bl 0x00c32310
00a87c08	mov w0,#0x1
00a87c0c	ldp x29,x30,[sp, #0x10]
00a87c10	ldp x20,x19,[sp], #0x20
00a87c14	ret
