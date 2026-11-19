; EVP_PKEY_get0_type_name @ 00a60900
00a60900	sub sp,sp,#0x20
00a60904	stp x29,x30,[sp, #0x10]
00a60908	str xzr,[sp, #0x8]
00a6090c	ldr x8,[x0, #0x60]
00a60910	add x29,sp,#0x10
00a60914	cbz x8,0x00a60924
00a60918	mov x0,x8
00a6091c	bl 0x00c3bf30
00a60920	b 0x00a6094c
00a60924	bl 0x00c37b90
00a60928	cbz x0,0x00a6094c
00a6092c	mov x5,x0
00a60930	add x4,sp,#0x8
00a60934	mov x0,xzr
00a60938	mov x1,xzr
00a6093c	mov x2,xzr
00a60940	mov x3,xzr
00a60944	bl 0x00c352d0
00a60948	ldr x0,[sp, #0x8]
00a6094c	ldp x29,x30,[sp, #0x10]
00a60950	add sp,sp,#0x20
00a60954	ret
