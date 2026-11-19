; EVP_KDF_gettable_params @ 00a647b8
00a647b8	ldr x1,[x0, #0x58]
00a647bc	cbz x1,0x00a647e8
00a647c0	sub sp,sp,#0x20
00a647c4	stp x29,x30,[sp, #0x10]
00a647c8	add x29,sp,#0x10
00a647cc	str x1,[sp, #0x8]
00a647d0	bl 0x00c3d260
00a647d4	bl 0x00c3b680
00a647d8	ldr x1,[sp, #0x8]
00a647dc	ldp x29,x30,[sp, #0x10]
00a647e0	add sp,sp,#0x20
00a647e4	br x1
00a647e8	mov x0,xzr
00a647ec	ret
