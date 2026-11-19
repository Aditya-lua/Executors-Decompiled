; ossl_release_default_drbg_ctx @ 00a81410
00a81410	stp x20,x19,[sp, #-0x20]!
00a81414	adrp x8,0xd21000
00a81418	stp x29,x30,[sp, #0x10]
00a8141c	add x8,x8,#0xb90
00a81420	ldr w19,[x8, #0xc4]
00a81424	add x29,sp,#0x10
00a81428	cmn w19,#0x1
00a8142c	b.eq 0x00a8145c
00a81430	add x20,x8,#0x8
00a81434	mov x0,x20
00a81438	mov w1,w19
00a8143c	bl 0x00c356d0
00a81440	bl 0x00c3df60
00a81444	ldp x29,x30,[sp, #0x10]
00a81448	mov x0,x20
00a8144c	mov w1,w19
00a81450	mov x2,xzr
00a81454	ldp x20,x19,[sp], #0x20
00a81458	b 0x00c35720
00a8145c	ldp x29,x30,[sp, #0x10]
00a81460	ldp x20,x19,[sp], #0x20
00a81464	ret
