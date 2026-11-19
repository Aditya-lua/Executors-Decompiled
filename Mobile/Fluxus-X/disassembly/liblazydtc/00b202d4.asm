; ossl_prov_cleanup_nonce @ 00b202d4
00b202d4	sub sp,sp,#0x30
00b202d8	stp x20,x19,[sp, #0x10]
00b202dc	stp x29,x30,[sp, #0x20]
00b202e0	adrp x8,0xd23000
00b202e4	mov x20,x1
00b202e8	ldr x1,[x8, #0x820]
00b202ec	add x29,sp,#0x20
00b202f0	cbz x1,0x00b2031c
00b202f4	mov x19,x2
00b202f8	str x1,[sp, #0x8]
00b202fc	bl 0x00c410c0
00b20300	mov x1,x20
00b20304	mov x2,x19
00b20308	ldr x3,[sp, #0x8]
00b2030c	ldp x29,x30,[sp, #0x20]
00b20310	ldp x20,x19,[sp, #0x10]
00b20314	add sp,sp,#0x30
00b20318	br x3
00b2031c	ldp x29,x30,[sp, #0x20]
00b20320	ldp x20,x19,[sp, #0x10]
00b20324	add sp,sp,#0x30
00b20328	ret
