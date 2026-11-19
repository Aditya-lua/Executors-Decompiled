; EVP_RAND_verify_zeroization @ 00aca318
00aca318	stp x20,x19,[sp, #-0x20]!
00aca31c	stp x29,x30,[sp, #0x10]
00aca320	ldr x8,[x0]
00aca324	mov x19,x0
00aca328	add x29,sp,#0x10
00aca32c	ldr x9,[x8, #0x78]
00aca330	cbz x9,0x00aca344
00aca334	ldr x0,[x19, #0x8]
00aca338	blr x9
00aca33c	cbz w0,0x00aca380
00aca340	ldr x8,[x19]
00aca344	ldr x9,[x8, #0xb8]
00aca348	cbz x9,0x00aca368
00aca34c	ldr x0,[x19, #0x8]
00aca350	blr x9
00aca354	ldr x8,[x19]
00aca358	mov w20,w0
00aca35c	ldr x8,[x8, #0x80]
00aca360	cbnz x8,0x00aca374
00aca364	b 0x00aca384
00aca368	mov w20,wzr
00aca36c	ldr x8,[x8, #0x80]
00aca370	cbz x8,0x00aca384
00aca374	ldr x0,[x19, #0x8]
00aca378	blr x8
00aca37c	b 0x00aca384
00aca380	mov w20,wzr
00aca384	ldp x29,x30,[sp, #0x10]
00aca388	mov w0,w20
00aca38c	ldp x20,x19,[sp], #0x20
00aca390	ret
