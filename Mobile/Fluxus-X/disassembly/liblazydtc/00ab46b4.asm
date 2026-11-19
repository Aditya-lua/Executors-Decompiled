; PEM_write_bio_X509_CRL @ 00ab46b4
00ab46b4	sub sp,sp,#0x20
00ab46b8	stp x29,x30,[sp, #0x10]
00ab46bc	mov x2,x0
00ab46c0	adrp x0,0xcb5000
00ab46c4	ldr x0,[x0, #0x740]
00ab46c8	mov x3,x1
00ab46cc	adrp x1,0x2bc000
00ab46d0	add x1,x1,#0x2e2
00ab46d4	mov x4,xzr
00ab46d8	mov x5,xzr
00ab46dc	mov w6,wzr
00ab46e0	mov x7,xzr
00ab46e4	add x29,sp,#0x10
00ab46e8	str xzr,[sp]
00ab46ec	bl 0x00c36070
00ab46f0	ldp x29,x30,[sp, #0x10]
00ab46f4	add sp,sp,#0x20
00ab46f8	ret
