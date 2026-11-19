; WPACKET_finish @ 00a9cc8c
00a9cc8c	stp x20,x19,[sp, #-0x20]!
00a9cc90	stp x29,x30,[sp, #0x10]
00a9cc94	ldr x1,[x0, #0x28]
00a9cc98	add x29,sp,#0x10
00a9cc9c	cbz x1,0x00a9ccdc
00a9cca0	ldr x8,[x1]
00a9cca4	mov w20,wzr
00a9cca8	cbnz x8,0x00a9cce0
00a9ccac	mov w2,#0x1
00a9ccb0	mov x19,x0
00a9ccb4	bl 0x00a9cab8
00a9ccb8	mov w20,w0
00a9ccbc	cbz w0,0x00a9cce0
00a9ccc0	ldr x0,[x19, #0x28]
00a9ccc4	adrp x1,0x2bd000
00a9ccc8	add x1,x1,#0xe31
00a9cccc	mov w2,#0x14e
00a9ccd0	bl 0x00c32310
00a9ccd4	str xzr,[x19, #0x28]
00a9ccd8	b 0x00a9cce0
00a9ccdc	mov w20,wzr
00a9cce0	ldp x29,x30,[sp, #0x10]
00a9cce4	mov w0,w20
00a9cce8	ldp x20,x19,[sp], #0x20
00a9ccec	ret
