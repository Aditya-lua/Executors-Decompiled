; FUN_00b4ead8 @ 00b4ead8
00b4ead8	stp x20,x19,[sp, #-0x20]!
00b4eadc	stp x29,x30,[sp, #0x10]
00b4eae0	add x29,sp,#0x10
00b4eae4	mov x20,x1
00b4eae8	mov x19,x0
00b4eaec	bl 0x00c41000
00b4eaf0	mov w8,w0
00b4eaf4	cmp x20,#0x8
00b4eaf8	mov x0,xzr
00b4eafc	b.ne 0x00b4eb2c
00b4eb00	cbz w8,0x00b4eb2c
00b4eb04	ldr x20,[x19]
00b4eb08	mov x0,x20
00b4eb0c	bl 0x00c36880
00b4eb10	cbz x0,0x00b4eb2c
00b4eb14	bl 0x00c36870
00b4eb18	cmp w0,#0x494
00b4eb1c	mov x0,xzr
00b4eb20	b.eq 0x00b4eb2c
00b4eb24	mov x0,x20
00b4eb28	str xzr,[x19]
00b4eb2c	ldp x29,x30,[sp, #0x10]
00b4eb30	ldp x20,x19,[sp], #0x20
00b4eb34	ret
