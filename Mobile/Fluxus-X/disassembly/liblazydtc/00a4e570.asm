; ossl_core_bio_vprintf @ 00a4e570
00a4e570	sub sp,sp,#0x30
00a4e574	stp x29,x30,[sp, #0x20]
00a4e578	ldr q0,[x2, #0x10]
00a4e57c	ldr x0,[x0, #0x10]
00a4e580	add x29,sp,#0x20
00a4e584	str q0,[sp, #0x10]
00a4e588	ldr q0,[x2]
00a4e58c	mov x2,sp
00a4e590	str q0,[sp]
00a4e594	bl 0x00c38710
00a4e598	ldp x29,x30,[sp, #0x20]
00a4e59c	add sp,sp,#0x30
00a4e5a0	ret
