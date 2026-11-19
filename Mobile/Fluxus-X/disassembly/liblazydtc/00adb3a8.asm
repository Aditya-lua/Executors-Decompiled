; ossl_rsa_sp800_56b_validate_strength @ 00adb3a8
00adb3a8	str x19,[sp, #-0x20]!
00adb3ac	stp x29,x30,[sp, #0x10]
00adb3b0	add x29,sp,#0x10
00adb3b4	mov w19,w1
00adb3b8	bl 0x00c39fe0
00adb3bc	mov w8,w0
00adb3c0	cmn w19,#0x1
00adb3c4	mov w0,#0x1
00adb3c8	b.eq 0x00adb408
00adb3cc	and w8,w8,#0xffff
00adb3d0	cmp w8,w19
00adb3d4	b.eq 0x00adb408
00adb3d8	bl 0x00c342a0
00adb3dc	adrp x0,0x2aa000
00adb3e0	adrp x2,0x2dc000
00adb3e4	add x0,x0,#0x974
00adb3e8	add x2,x2,#0x94f
00adb3ec	mov w1,#0xb8
00adb3f0	bl 0x00c342b0
00adb3f4	mov w0,#0x4
00adb3f8	mov w1,#0xb0
00adb3fc	mov x2,xzr
00adb400	bl 0x00c342c0
00adb404	mov w0,wzr
00adb408	ldp x29,x30,[sp, #0x10]
00adb40c	ldr x19,[sp], #0x20
00adb410	ret
