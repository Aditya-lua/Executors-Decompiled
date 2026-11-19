; PKCS7_get_signer_info @ 00ac3310
00ac3310	str x19,[sp, #-0x20]!
00ac3314	stp x29,x30,[sp, #0x10]
00ac3318	add x29,sp,#0x10
00ac331c	cbz x0,0x00ac3360
00ac3320	ldr x8,[x0, #0x20]
00ac3324	mov x19,x0
00ac3328	cbz x8,0x00ac335c
00ac332c	ldr x0,[x19, #0x18]
00ac3330	bl 0x00c37750
00ac3334	cmp w0,#0x16
00ac3338	b.eq 0x00ac3350
00ac333c	ldr x0,[x19, #0x18]
00ac3340	bl 0x00c37750
00ac3344	cmp w0,#0x18
00ac3348	mov x0,xzr
00ac334c	b.ne 0x00ac3360
00ac3350	ldr x8,[x19, #0x20]
00ac3354	ldr x0,[x8, #0x20]
00ac3358	b 0x00ac3360
00ac335c	mov x0,xzr
00ac3360	ldp x29,x30,[sp, #0x10]
00ac3364	ldr x19,[sp], #0x20
00ac3368	ret
