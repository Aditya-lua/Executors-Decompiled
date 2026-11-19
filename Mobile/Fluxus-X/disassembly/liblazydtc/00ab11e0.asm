; OCSP_copy_nonce @ 00ab11e0
00ab11e0	stp x20,x19,[sp, #-0x20]!
00ab11e4	stp x29,x30,[sp, #0x10]
00ab11e8	ldr x8,[x1, #0x18]
00ab11ec	mov x20,x1
00ab11f0	mov x19,x0
00ab11f4	mov w1,#0x16e
00ab11f8	mov w2,#0xffffffff
00ab11fc	mov x0,x8
00ab1200	add x29,sp,#0x10
00ab1204	bl 0x00c3eff0
00ab1208	tbnz w0,#0x1f,0x00ab1234
00ab120c	mov w1,w0
00ab1210	ldr x0,[x20, #0x18]
00ab1214	bl 0x00c3efe0
00ab1218	mov x1,x0
00ab121c	add x0,x19,#0x28
00ab1220	mov w2,#0xffffffff
00ab1224	bl 0x00c3efc0
00ab1228	cmp x0,#0x0
00ab122c	cset w0,ne
00ab1230	b 0x00ab1238
00ab1234	mov w0,#0x2
00ab1238	ldp x29,x30,[sp, #0x10]
00ab123c	ldp x20,x19,[sp], #0x20
00ab1240	ret
