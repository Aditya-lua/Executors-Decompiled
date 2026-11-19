; i2d_SCT_LIST @ 00a138b0
00a138b0	sub sp,sp,#0x40
00a138b4	add x8,sp,#0x8
00a138b8	str x19,[sp, #0x20]
00a138bc	mov x19,x1
00a138c0	add x1,x8,#0x8
00a138c4	stp x29,x30,[sp, #0x30]
00a138c8	add x29,sp,#0x30
00a138cc	str xzr,[sp, #0x10]
00a138d0	bl 0x00a135c0
00a138d4	cmn w0,#0x1
00a138d8	str w0,[sp, #0x8]
00a138dc	b.eq 0x00a1390c
00a138e0	add x0,sp,#0x8
00a138e4	mov x1,x19
00a138e8	bl 0x00c381d0
00a138ec	ldr x8,[sp, #0x10]
00a138f0	adrp x1,0x2d9000
00a138f4	mov w19,w0
00a138f8	add x1,x1,#0xa3f
00a138fc	mov w2,#0x195
00a13900	mov x0,x8
00a13904	bl 0x00c32310
00a13908	b 0x00a13910
00a1390c	mov w19,#0xffffffff
00a13910	mov w0,w19
00a13914	ldp x29,x30,[sp, #0x30]
00a13918	ldr x19,[sp, #0x20]
00a1391c	add sp,sp,#0x40
00a13920	ret
