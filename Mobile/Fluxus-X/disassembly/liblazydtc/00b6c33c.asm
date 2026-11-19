; mbedtls_ccm_auth_decrypt @ 00b6c33c
00b6c33c	sub sp,sp,#0x30
00b6c340	stp x29,x30,[sp, #0x20]
00b6c344	add x29,sp,#0x20
00b6c348	ldp x9,x10,[x29, #0x10]
00b6c34c	mov x8,x6
00b6c350	mov x6,x5
00b6c354	mov x5,x4
00b6c358	mov x4,x3
00b6c35c	mov x3,x2
00b6c360	mov x2,x1
00b6c364	str x7,[sp]
00b6c368	mov w1,wzr
00b6c36c	mov x7,x8
00b6c370	stp x9,x10,[sp, #0x8]
00b6c374	bl 0x00b6c17c
00b6c378	ldp x29,x30,[sp, #0x20]
00b6c37c	add sp,sp,#0x30
00b6c380	ret
