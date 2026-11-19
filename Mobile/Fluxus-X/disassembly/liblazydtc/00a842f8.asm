; ossl_safe_getenv @ 00a842f8
00a842f8	str x19,[sp, #-0x20]!
00a842fc	stp x29,x30,[sp, #0x10]
00a84300	add x29,sp,#0x10
00a84304	mov x19,x0
00a84308	bl 0x00c3e0c0
00a8430c	cbz w0,0x00a84320
00a84310	ldp x29,x30,[sp, #0x10]
00a84314	mov x0,xzr
00a84318	ldr x19,[sp], #0x20
00a8431c	ret
00a84320	ldp x29,x30,[sp, #0x10]
00a84324	mov x0,x19
00a84328	ldr x19,[sp], #0x20
00a8432c	b 0x00c32100
