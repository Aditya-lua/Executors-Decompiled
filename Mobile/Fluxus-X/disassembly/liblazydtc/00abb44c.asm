; PKCS12_pack_authsafes @ 00abb44c
00abb44c	stp x20,x19,[sp, #-0x20]!
00abb450	stp x29,x30,[sp, #0x10]
00abb454	add x29,sp,#0x10
00abb458	mov x19,x1
00abb45c	mov x20,x0
00abb460	bl 0x00c3f3c0
00abb464	ldr x8,[x20, #0x10]
00abb468	mov x1,x0
00abb46c	mov x0,x19
00abb470	add x2,x8,#0x20
00abb474	bl 0x00c37a90
00abb478	ldp x29,x30,[sp, #0x10]
00abb47c	cmp x0,#0x0
00abb480	cset w0,ne
00abb484	ldp x20,x19,[sp], #0x20
00abb488	ret
