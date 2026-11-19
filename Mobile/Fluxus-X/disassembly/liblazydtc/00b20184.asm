; ossl_prov_get_entropy @ 00b20184
00b20184	sub sp,sp,#0x40
00b20188	stp x22,x21,[sp, #0x10]
00b2018c	stp x20,x19,[sp, #0x20]
00b20190	stp x29,x30,[sp, #0x30]
00b20194	adrp x8,0xd23000
00b20198	mov x22,x1
00b2019c	ldr x1,[x8, #0x808]
00b201a0	add x29,sp,#0x30
00b201a4	cbz x1,0x00b201e4
00b201a8	mov x19,x4
00b201ac	mov x20,x3
00b201b0	mov w21,w2
00b201b4	str x1,[sp, #0x8]
00b201b8	bl 0x00c410c0
00b201bc	mov x1,x22
00b201c0	mov w2,w21
00b201c4	mov x3,x20
00b201c8	mov x4,x19
00b201cc	ldr x5,[sp, #0x8]
00b201d0	ldp x29,x30,[sp, #0x30]
00b201d4	ldp x20,x19,[sp, #0x20]
00b201d8	ldp x22,x21,[sp, #0x10]
00b201dc	add sp,sp,#0x40
00b201e0	br x5
00b201e4	ldp x29,x30,[sp, #0x30]
00b201e8	ldp x20,x19,[sp, #0x20]
00b201ec	ldp x22,x21,[sp, #0x10]
00b201f0	mov x0,xzr
00b201f4	add sp,sp,#0x40
00b201f8	ret
