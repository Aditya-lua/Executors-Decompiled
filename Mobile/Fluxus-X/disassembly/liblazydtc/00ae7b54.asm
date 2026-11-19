; SRP_VBASE_add0_user @ 00ae7b54
00ae7b54	stp x29,x30,[sp, #-0x10]!
00ae7b58	ldr x0,[x0]
00ae7b5c	mov x29,sp
00ae7b60	bl 0x00c347a0
00ae7b64	cmp w0,#0x0
00ae7b68	cset w0,gt
00ae7b6c	ldp x29,x30,[sp], #0x10
00ae7b70	ret
