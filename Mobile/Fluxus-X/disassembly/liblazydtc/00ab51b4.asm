; PEM_write_ECPrivateKey @ 00ab51b4
00ab51b4	sub sp,sp,#0x20
00ab51b8	stp x29,x30,[sp, #0x10]
00ab51bc	mov w8,w4
00ab51c0	mov x4,x2
00ab51c4	mov x2,x0
00ab51c8	adrp x0,0xcb5000
00ab51cc	ldr x0,[x0, #0x560]
00ab51d0	mov x7,x5
00ab51d4	mov x5,x3
00ab51d8	mov x3,x1
00ab51dc	adrp x1,0x2d6000
00ab51e0	add x1,x1,#0x41b
00ab51e4	str x6,[sp]
00ab51e8	mov w6,w8
00ab51ec	add x29,sp,#0x10
00ab51f0	bl 0x00c36060
00ab51f4	ldp x29,x30,[sp, #0x10]
00ab51f8	add sp,sp,#0x20
00ab51fc	ret
