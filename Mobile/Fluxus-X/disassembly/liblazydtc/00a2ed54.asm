; ossl_ec_key_public_check_quick @ 00a2ed54
00a2ed54	str x23,[sp, #-0x40]!
00a2ed58	stp x22,x21,[sp, #0x10]
00a2ed5c	stp x20,x19,[sp, #0x20]
00a2ed60	stp x29,x30,[sp, #0x30]
00a2ed64	add x29,sp,#0x30
00a2ed68	cbz x0,0x00a2edb4
00a2ed6c	mov x20,x0
00a2ed70	ldr x0,[x0, #0x18]
00a2ed74	cbz x0,0x00a2edb4
00a2ed78	mov x19,x1
00a2ed7c	ldr x1,[x20, #0x20]
00a2ed80	cbz x1,0x00a2edb4
00a2ed84	bl 0x00c3ae10
00a2ed88	cbz w0,0x00a2edfc
00a2ed8c	bl 0x00c342a0
00a2ed90	adrp x0,0x2b4000
00a2ed94	adrp x2,0x2af000
00a2ed98	add x0,x0,#0x15e
00a2ed9c	add x2,x2,#0xe28
00a2eda0	mov w1,#0x1c2
00a2eda4	bl 0x00c342b0
00a2eda8	mov w0,#0x10
00a2edac	mov w1,#0x6a
00a2edb0	b 0x00a2eddc
00a2edb4	bl 0x00c342a0
00a2edb8	adrp x0,0x2b4000
00a2edbc	adrp x2,0x2af000
00a2edc0	add x0,x0,#0x15e
00a2edc4	add x2,x2,#0xe28
00a2edc8	mov w1,#0x1bc
00a2edcc	bl 0x00c342b0
00a2edd0	mov w1,#0x102
00a2edd4	mov w0,#0x10
00a2edd8	movk w1,#0xc, LSL #16
00a2eddc	mov x2,xzr
00a2ede0	bl 0x00c342c0
00a2ede4	mov w0,wzr
00a2ede8	ldp x29,x30,[sp, #0x30]
00a2edec	ldp x20,x19,[sp, #0x20]
00a2edf0	ldp x22,x21,[sp, #0x10]
00a2edf4	ldr x23,[sp], #0x40
00a2edf8	ret
00a2edfc	mov x0,x19
00a2ee00	bl 0x00c38a90
00a2ee04	mov x0,x19
00a2ee08	bl 0x00c38a40
00a2ee0c	mov x22,x0
00a2ee10	mov x0,x19
00a2ee14	bl 0x00c38a40
00a2ee18	cbz x0,0x00a2eeb8
00a2ee1c	mov x21,x0
00a2ee20	ldp x0,x1,[x20, #0x18]
00a2ee24	mov x2,x22
00a2ee28	mov x3,x21
00a2ee2c	mov x4,x19
00a2ee30	bl 0x00c3ae70
00a2ee34	cbz w0,0x00a2eeb8
00a2ee38	ldr x0,[x20, #0x18]
00a2ee3c	bl 0x00c3aa80
00a2ee40	cmp w0,#0x196
00a2ee44	b.ne 0x00a2ee8c
00a2ee48	mov x0,x22
00a2ee4c	bl 0x00c37f40
00a2ee50	cbnz w0,0x00a2eeb8
00a2ee54	ldr x8,[x20, #0x18]
00a2ee58	mov x0,x22
00a2ee5c	ldr x1,[x8, #0x40]
00a2ee60	bl 0x00c38cc0
00a2ee64	tbz w0,#0x1f,0x00a2eeb8
00a2ee68	mov x0,x21
00a2ee6c	bl 0x00c37f40
00a2ee70	cbnz w0,0x00a2eeb8
00a2ee74	ldr x8,[x20, #0x18]
00a2ee78	mov x0,x21
00a2ee7c	ldr x1,[x8, #0x40]
00a2ee80	bl 0x00c38cc0
00a2ee84	tbz w0,#0x1f,0x00a2eeb8
00a2ee88	b 0x00a2eee8
00a2ee8c	ldr x0,[x20, #0x18]
00a2ee90	bl 0x00c3aa70
00a2ee94	mov w23,w0
00a2ee98	mov x0,x22
00a2ee9c	bl 0x00c322f0
00a2eea0	cmp w0,w23
00a2eea4	b.gt 0x00a2eeb8
00a2eea8	mov x0,x21
00a2eeac	bl 0x00c322f0
00a2eeb0	cmp w0,w23
00a2eeb4	b.le 0x00a2eee8
00a2eeb8	mov x0,x19
00a2eebc	bl 0x00c38a20
00a2eec0	bl 0x00c342a0
00a2eec4	adrp x0,0x2b4000
00a2eec8	adrp x2,0x2af000
00a2eecc	add x0,x0,#0x15e
00a2eed0	add x2,x2,#0xe28
00a2eed4	mov w1,#0x1c8
00a2eed8	bl 0x00c342b0
00a2eedc	mov w0,#0x10
00a2eee0	mov w1,#0x92
00a2eee4	b 0x00a2eddc
00a2eee8	mov x0,x19
00a2eeec	bl 0x00c38a20
00a2eef0	ldp x0,x1,[x20, #0x18]
00a2eef4	mov x2,x19
00a2eef8	bl 0x00c3ae20
00a2eefc	cmp w0,#0x0
00a2ef00	b.le 0x00a2ef0c
00a2ef04	mov w0,#0x1
00a2ef08	b 0x00a2ede8
00a2ef0c	bl 0x00c342a0
00a2ef10	adrp x0,0x2b4000
00a2ef14	adrp x2,0x2af000
00a2ef18	add x0,x0,#0x15e
00a2ef1c	add x2,x2,#0xe28
00a2ef20	mov w1,#0x1ce
00a2ef24	bl 0x00c342b0
00a2ef28	mov w0,#0x10
00a2ef2c	mov w1,#0x6b
00a2ef30	b 0x00a2eddc
