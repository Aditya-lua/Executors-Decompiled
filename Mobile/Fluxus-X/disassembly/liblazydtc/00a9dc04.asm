; ossl_param_build_set_int @ 00a9dc04
00a9dc04	str x19,[sp, #-0x20]!
00a9dc08	mov w19,w3
00a9dc0c	stp x29,x30,[sp, #0x10]
00a9dc10	add x29,sp,#0x10
00a9dc14	cbz x0,0x00a9dc2c
00a9dc18	ldp x29,x30,[sp, #0x10]
00a9dc1c	mov x1,x2
00a9dc20	mov w2,w19
00a9dc24	ldr x19,[sp], #0x20
00a9dc28	b 0x00c3a8e0
00a9dc2c	mov x0,x1
00a9dc30	mov x1,x2
00a9dc34	bl 0x00c3e8c0
00a9dc38	cbz x0,0x00a9dc4c
00a9dc3c	ldp x29,x30,[sp, #0x10]
00a9dc40	mov w1,w19
00a9dc44	ldr x19,[sp], #0x20
00a9dc48	b 0x00c3da90
00a9dc4c	ldp x29,x30,[sp, #0x10]
00a9dc50	mov w0,#0x1
00a9dc54	ldr x19,[sp], #0x20
00a9dc58	ret
