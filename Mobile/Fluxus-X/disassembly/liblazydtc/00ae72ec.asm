; SRP_user_pwd_free @ 00ae72ec
00ae72ec	cbz x0,0x00ae7350
00ae72f0	stp x20,x19,[sp, #-0x20]!
00ae72f4	stp x29,x30,[sp, #0x10]
00ae72f8	mov x19,x0
00ae72fc	ldr x0,[x0, #0x8]
00ae7300	add x29,sp,#0x10
00ae7304	bl 0x00c36290
00ae7308	ldr x0,[x19, #0x10]
00ae730c	bl 0x00c322e0
00ae7310	ldr x0,[x19]
00ae7314	adrp x20,0x2ce000
00ae7318	add x20,x20,#0x365
00ae731c	mov w2,#0xb9
00ae7320	mov x1,x20
00ae7324	bl 0x00c32310
00ae7328	ldr x0,[x19, #0x28]
00ae732c	mov w2,#0xba
00ae7330	mov x1,x20
00ae7334	bl 0x00c32310
00ae7338	ldp x29,x30,[sp, #0x10]
00ae733c	mov w2,#0xbb
00ae7340	mov x0,x19
00ae7344	mov x1,x20
00ae7348	ldp x20,x19,[sp], #0x20
00ae734c	b 0x00c32310
00ae7350	ret
