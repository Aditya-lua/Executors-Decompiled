; SRP_user_pwd_new @ 00ae7354
00ae7354	stp x29,x30,[sp, #-0x10]!
00ae7358	adrp x1,0x2ce000
00ae735c	add x1,x1,#0x365
00ae7360	orr w0,wzr,#0x30
00ae7364	mov w2,#0xc2
00ae7368	mov x29,sp
00ae736c	bl 0x00c32320
00ae7370	cbz x0,0x00ae7380
00ae7374	movi v0.2D,#0x0
00ae7378	stp q0,q0,[x0, #0x10]
00ae737c	str q0,[x0]
00ae7380	ldp x29,x30,[sp], #0x10
00ae7384	ret
